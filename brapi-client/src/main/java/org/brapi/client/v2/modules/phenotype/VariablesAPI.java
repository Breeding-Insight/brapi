package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import lombok.NonNull;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.brapi.v2.phenotyping.model.BrApiScale;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.brapi.v2.phenotyping.model.request.VariablesRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VariablesAPI extends BrAPIEndpoint {

    private MethodsAPI methodsAPI;
    private ScalesAPI scalesAPI;
    private TraitsAPI traitsAPI;

    public VariablesAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
        methodsAPI = new MethodsAPI(brAPIClient);
        scalesAPI = new ScalesAPI(brAPIClient);
        traitsAPI = new TraitsAPI(brAPIClient);
    }

    public List<BrApiVariable> createVariables(@NonNull List<BrApiVariable> brApiVariables) throws HttpException, APIException {

        if (brApiVariables.isEmpty()) {
            throw new APIException("BrAPI variables cannot be empty");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getObservationVariableDbId() != null)) {
            throw new APIException("BrAPI variable must not have an existing observationVariableDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getVariablesPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiVariables)
                .method(HttpMethod.POST)
                .build();

        List<BrApiVariable> createdVariable = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiVariable>>() {}.getType();
            DataResponse<BrApiVariable> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdVariable;
    }

    public Optional<BrApiVariable> createVariable(@NonNull BrApiVariable brApiVariable) throws HttpException, APIException {

        List<BrApiVariable> brApiVariables = new ArrayList<>();
        brApiVariables.add(brApiVariable);
        List<BrApiVariable> createdVariables = createVariables(brApiVariables);

        if (createdVariables.size() == 1){
            return Optional.of(createdVariables.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    private List<BrApiVariable> createMethodsScalesTraits(@NonNull List<BrApiVariable> brApiVariables) throws HttpException, APIException {

        if (brApiVariables.stream().anyMatch(variable -> variable.getMethod() == null)) {
            throw new APIException("BrAPI variable method must exist.");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getScale() == null)) {
            throw new APIException("BrAPI variable scale must exist.");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getTrait() == null)) {
            throw new APIException("BrAPI variable trait must exist.");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getMethod().getMethodDbId() != null)) {
            throw new APIException("BrAPI variable method must not have an existing dbId.");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getScale().getScaleDbId() != null)) {
            throw new APIException("BrAPI variable scale must not have an existing dbId.");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getTrait().getTraitDbId() != null)) {
            throw new APIException("BrAPI variable trait must not have an existing dbId.");
        }

        ArrayList<BrApiVariable> variablesWithDbIds = new ArrayList<>();

        // not the most efficient way to do this since there are list calls but mapping is error prone without unique ids
        // will have more network calls since it's not batching them and only doing single calls
        for (BrApiVariable variable : brApiVariables) {
            Optional<BrApiMethod> method = methodsAPI.createMethod(variable.getMethod());
            Optional<BrApiScale> scale = scalesAPI.createScale(variable.getScale());
            Optional<BrApiTrait> trait = traitsAPI.createTrait(variable.getTrait());

            BrApiMethod methodResponse = method.orElseThrow(() -> new APIException("BrAPI variable problem creating method"));
            BrApiMethod methodOnlyDbId = new BrApiMethod();
            methodOnlyDbId.setMethodDbId(methodResponse.getMethodDbId());

            BrApiScale scaleResponse = scale.orElseThrow(() -> new APIException("BrAPI variable problem creating scale"));
            BrApiScale scaleOnlyDbId = new BrApiScale();
            scaleOnlyDbId.setScaleDbId(scaleResponse.getScaleDbId());

            BrApiTrait traitResponse = trait.orElseThrow(() -> new APIException("BrAPI variable problem creating trait"));
            BrApiTrait traitOnlyDbId = new BrApiTrait();
            traitOnlyDbId.setTraitDbId(traitResponse.getTraitDbId());

            // TODO: this should be a deep copy
            BrApiVariable shallowCopy = variable.toBuilder().build();
            shallowCopy.setMethod(methodOnlyDbId);
            shallowCopy.setScale(scaleOnlyDbId);
            shallowCopy.setTrait(traitOnlyDbId);
            variablesWithDbIds.add(shallowCopy);
        }

        return variablesWithDbIds;
    }

    public List<BrApiVariable> createMethodsScalesTraitsThenVariables(@NonNull List<BrApiVariable> brApiVariables) throws HttpException, APIException {

        if (brApiVariables.isEmpty()) {
            throw new APIException("BrAPI variables cannot be empty");
        }

        if (brApiVariables.stream().anyMatch(variable -> variable.getMethod() != null && variable.getObservationVariableDbId() != null)) {
            throw new APIException("BrAPI variable must not have an existing observationVariableDbId.");
        }

        createMethodsScalesTraits(brApiVariables);

        return createVariables(brApiVariables);
    }

    public Optional<BrApiVariable> createMethodScaleTraitThenVariable(@NonNull BrApiVariable brApiVariable) throws HttpException, APIException {

        List<BrApiVariable> brApiVariables = new ArrayList<>();
        brApiVariables.add(brApiVariable);
        List<BrApiVariable> createdVariables = createMethodsScalesTraitsThenVariables(brApiVariables);

        if (createdVariables.size() == 1){
            return Optional.of(createdVariables.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public Optional<BrApiVariable> updateVariable(@NonNull BrApiVariable brApiVariable) throws HttpException, APIException {

        if (brApiVariable.getObservationVariableDbId() == null){
            throw new APIException("BrAPI variable must have an existing variableDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getVariablesByIdPath(brApiVariable.getObservationVariableDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiVariable)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiVariable> updateVariable = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiVariable resultResponse = gson.fromJson(resultJson, BrApiVariable.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updateVariable;
    }


    public List<BrApiVariable> getVariables(@NonNull VariablesRequest variablesRequest) throws HttpException, APIException {

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getVariablesPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(variablesRequest.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiVariable> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiVariable>>() {
            }.getType();
            DataResponse<BrApiVariable> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiVariable> getVariables() throws HttpException, APIException {
        return getVariables(new VariablesRequest());
    }

    public Optional<BrApiVariable> getVariableById(@NonNull String variableId) throws HttpException, APIException {

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getVariablesByIdPath(variableId);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiVariable> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiVariable resultResponse = gson.fromJson(resultJson, BrApiVariable.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

}
