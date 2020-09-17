package org.brapi.client.v2.modules.germplasm;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.client.v2.modules.core.BrAPICoreEndpoints_V2;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.germplasm.model.BrApiGermplasm;
import org.brapi.v2.germplasm.model.request.GermplasmRequest;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GermplasmAPI extends BrAPIEndpoint {

    public GermplasmAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiGermplasm> getGermplasm(@NotNull GermplasmRequest germplasmFilter) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (germplasmFilter == null) {
            throw new IllegalArgumentException("Germplasm request cannot be null");
        }

        // Build our request
        String endpoint = BrAPIGermplasmEndpoints_V2.getGermplasmPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(germplasmFilter.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiGermplasm> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiGermplasm>>() {}.getType();
            DataResponse<BrApiGermplasm> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiGermplasm> getGermplasm() throws HttpException, APIException {
        return getGermplasm(new GermplasmRequest());
    }

    public Optional<BrApiGermplasm> getGermplasmById(String germplasmId) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (germplasmId == null) {
            throw new APIException("Must specify programID for the getProgramById endpoint.");
        }

        // Build our request
        String endpoint =BrAPIGermplasmEndpoints_V2.getGermplasmByIdPath(germplasmId);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiGermplasm> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiGermplasm resultResponse = gson.fromJson(resultJson, BrApiGermplasm.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

    public List<BrApiGermplasm> createGermplasm(List<BrApiGermplasm> brApiGermplasm) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (brApiGermplasm.stream().anyMatch(germplasm -> germplasm.getGermplasmDbId() != null)) {
            throw new APIException("BrAPI germplasm must not have an existing germplasmDbId.");
        }

        // Build our request
        String endpoint = BrAPIGermplasmEndpoints_V2.getGermplasmPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiGermplasm)
                .method(HttpMethod.POST)
                .build();

        List<BrApiGermplasm> createdGermplasm = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiGermplasm>>() {}.getType();
            DataResponse<BrApiGermplasm> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdGermplasm;
    }

    public Optional<BrApiGermplasm> createGermplasm(BrApiGermplasm brApiGermplasm) throws HttpException, APIException {
        List<BrApiGermplasm> brApiGermplasmList = new ArrayList<>();
        brApiGermplasmList.add(brApiGermplasm);
        List<BrApiGermplasm> createdGermplasm = createGermplasm(brApiGermplasmList);

        if (createdGermplasm.size() == 1){
            return Optional.of(createdGermplasm.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public Optional<BrApiGermplasm> updateGermplasm(BrApiGermplasm brApiGermplasm) throws HttpException, APIException {

        if (brApiGermplasm.getGermplasmDbId() == null){
            throw new APIException("BrAPI germplasm must have an existing germplasmDbId.");
        }

        // Build our request
        String endpoint = BrAPIGermplasmEndpoints_V2.getGermplasmByIdPath(brApiGermplasm.getGermplasmDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiGermplasm)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiGermplasm> updatedGermplasm = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiGermplasm resultResponse = gson.fromJson(resultJson, BrApiGermplasm.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updatedGermplasm;
    }

}
