package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.client.v2.modules.core.BrAPICoreEndpoints_V2;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.request.TraitsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TraitsAPI extends BrAPIEndpoint {

    public TraitsAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiTrait> getTraits(TraitsRequest traitsRequest) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (traitsRequest == null) {
            traitsRequest = new TraitsRequest();
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getTraitsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(traitsRequest.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiTrait> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiTrait>>() {
            }.getType();
            DataResponse<BrApiTrait> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiTrait> getTraits() throws HttpException, APIException {
        return getTraits(null);
    }

    public Optional<BrApiTrait> getTraitById(String traitId) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (traitId == null) {
            throw new APIException("Must specify traitId for the getTraitById endpoint.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getTraitsByIdPath(traitId);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiTrait> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiTrait resultResponse = gson.fromJson(resultJson, BrApiTrait.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

    public List<BrApiTrait> createTraits(List<BrApiTrait> brApiTraits) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (brApiTraits.stream().anyMatch(program -> program.getTraitDbId() != null)) {
            throw new APIException("BrAPI program must not have an existing programDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getTraitsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiTraits)
                .method(HttpMethod.POST)
                .build();

        List<BrApiTrait> createdTrait = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiTrait>>() {}.getType();
            DataResponse<BrApiTrait> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdTrait;
    }

    public Optional<BrApiTrait> createTrait(BrApiTrait brApiTrait) throws HttpException, APIException {
        List<BrApiTrait> brApiTraits = new ArrayList<>();
        brApiTraits.add(brApiTrait);
        List<BrApiTrait> createdTraits = createTraits(brApiTraits);

        if (createdTraits.size() == 1){
            return Optional.of(createdTraits.get(0));
        }
        else {
            return Optional.empty();
        }
    }
}
