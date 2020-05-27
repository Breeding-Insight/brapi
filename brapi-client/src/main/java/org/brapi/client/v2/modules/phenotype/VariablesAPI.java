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
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.brapi.v2.phenotyping.model.request.VariablesRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VariablesAPI extends BrAPIEndpoint {

    public VariablesAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
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
