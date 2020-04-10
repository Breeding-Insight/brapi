package org.breedinginsight.brapi.client.v2.endpoints.modules.core;

import com.google.gson.reflect.TypeToken;
import org.breedinginsight.brapi.client.v2.endpoints.model.exceptions.APIException;
import org.breedinginsight.brapi.client.v2.endpoints.model.BrAPIRequest;
import org.breedinginsight.brapi.client.v2.endpoints.model.HttpMethod;
import org.breedinginsight.brapi.client.v2.endpoints.model.exceptions.*;
import org.breedinginsight.brapi.client.v2.endpoints.model.response.DataResponse;
import org.breedinginsight.brapi.client.v2.endpoints.BrAPIClient;
import org.breedinginsight.brapi.client.v2.endpoints.BrAPIEndpoint;
import org.breedinginsight.brapi.client.v2.model.Program;
import org.breedinginsight.brapi.client.v2.endpoints.model.request.ProgramsRequest;

import javax.swing.text.html.Option;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProgramsAPI extends BrAPIEndpoint {

    public ProgramsAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<Program> getPrograms(ProgramsRequest programFilter) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (programFilter == null) {
            programFilter = new ProgramsRequest();
        }

        // Build our request
        String endpoint = String.format(BrAPICoreEndpoints_V2.getProgramsPath());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(programFilter.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<Program> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<Program>>() {}.getType();
            DataResponse<Program> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<Program> getPrograms() throws HttpException, APIException {
        try {
            return getPrograms(null);
        } catch (APIException e){
            throw new APIException(e.getMessage());
        }
    }

    public Optional<Program> getProgramById(String programID) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (programID == null) {
            throw new APIException("Must specify programID for the getProgramById endpoint.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getProgramsByIdPath(programID);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<Program> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Program resultResponse = gson.fromJson(resultJson, Program.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

}
