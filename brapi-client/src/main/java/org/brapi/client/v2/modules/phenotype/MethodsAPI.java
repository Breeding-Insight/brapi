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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodsAPI extends BrAPIEndpoint {

    public MethodsAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
    }

    public List<BrApiMethod> createMethods(List<BrApiMethod> brApiMethods) throws HttpException, APIException {

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

}
