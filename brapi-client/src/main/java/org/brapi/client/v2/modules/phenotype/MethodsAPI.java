package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.brapi.v2.phenotyping.model.request.MethodsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodsAPI extends BrAPIEndpoint {

    public MethodsAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
    }

    public List<BrApiMethod> createMethods(List<BrApiMethod> brApiMethods) throws HttpException, APIException {

        if (brApiMethods == null) {
            throw new APIException("BrAPI methods cannot be null");
        }

        if (brApiMethods.isEmpty()) {
            throw new APIException("BrAPI methods cannot be empty");
        }

        if (brApiMethods.stream().anyMatch(method -> method.getMethodDbId() != null)) {
            throw new APIException("BrAPI method must not have an existing methodDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getMethodsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiMethods)
                .method(HttpMethod.POST)
                .build();

        List<BrApiMethod> createdMethod = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiMethod>>() {}.getType();
            DataResponse<BrApiMethod> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdMethod;
    }

    public Optional<BrApiMethod> createMethod(BrApiMethod brApiMethod) throws HttpException, APIException {

        if (brApiMethod == null) {
            throw new APIException("BrAPI method cannot be null");
        }

        List<BrApiMethod> brApiMethods = new ArrayList<>();
        brApiMethods.add(brApiMethod);
        List<BrApiMethod> createdMethods = createMethods(brApiMethods);

        if (createdMethods.size() == 1){
            return Optional.of(createdMethods.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public Optional<BrApiMethod> updateMethod(BrApiMethod brApiMethod) throws HttpException, APIException {

        if (brApiMethod == null) {
            throw new APIException("BrAPI method cannot be null");
        }

        if (brApiMethod.getMethodDbId() == null){
            throw new APIException("BrAPI method must have an existing methodDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getMethodsByIdPath(brApiMethod.getMethodDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiMethod)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiMethod> updateMethod = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiMethod resultResponse = gson.fromJson(resultJson, BrApiMethod.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updateMethod;
    }

    public List<BrApiMethod> getMethods(MethodsRequest methodsRequest) throws HttpException, APIException {

        if (methodsRequest == null) {
            throw new IllegalArgumentException("Methods request cannot be null");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getMethodsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(methodsRequest.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiMethod> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiMethod>>() {
            }.getType();
            DataResponse<BrApiMethod> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiMethod> getMethods() throws HttpException, APIException {
        return getMethods(new MethodsRequest());
    }

    public Optional<BrApiMethod> getMethodById(String methodId) throws HttpException, APIException {

        if (methodId == null) {
            throw new APIException("Must specify methodId for the getMethodById endpoint.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getMethodsByIdPath(methodId);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiMethod> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiMethod resultResponse = gson.fromJson(resultJson, BrApiMethod.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

    // returns first result if there are multiple matches
    public Optional<BrApiMethod> getMethodByExternalReferenceId(String externalReferenceId) throws HttpException, APIException {

        if (externalReferenceId == null) {
            throw new APIException("Must specify externalReferenceId for the getMethodByExternalReferenceId endpoint.");
        }

        MethodsRequest methodsRequest = MethodsRequest.builder()
                .externalReferenceID(externalReferenceId)
                .build();

        List<BrApiMethod> searchResult = getMethods(methodsRequest);

        if (searchResult.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(searchResult.get(0));
    }


}
