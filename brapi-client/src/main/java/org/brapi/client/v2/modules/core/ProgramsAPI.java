/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.client.v2.modules.core;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.brapi.v2.core.model.response.DataResponse;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ProgramsAPI extends BrAPIEndpoint {

    public ProgramsAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiProgram> getPrograms(@NotNull ProgramsRequest programFilter) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (programFilter == null) {
            throw new IllegalArgumentException("Programs request cannot be null");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getProgramsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(programFilter.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiProgram> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiProgram>>() {}.getType();
            DataResponse<BrApiProgram> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiProgram> getPrograms() throws HttpException, APIException {
        return getPrograms(new ProgramsRequest());
    }

    public Optional<BrApiProgram> getProgramById(String programID) throws HttpException, APIException {

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

        Optional<BrApiProgram> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiProgram resultResponse = gson.fromJson(resultJson, BrApiProgram.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

    public List<BrApiProgram> createPrograms(List<BrApiProgram> brApiPrograms) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (brApiPrograms.stream().anyMatch(program -> program.getProgramDbId() != null)) {
            throw new APIException("BrAPI program must not have an existing programDbId.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getProgramsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiPrograms)
                .method(HttpMethod.POST)
                .build();

        List<BrApiProgram> createdProgram = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiProgram>>() {}.getType();
            DataResponse<BrApiProgram> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdProgram;
    }

    public Optional<BrApiProgram> createProgram(BrApiProgram brApiProgram) throws HttpException, APIException {
        List<BrApiProgram> brApiPrograms = new ArrayList<>();
        brApiPrograms.add(brApiProgram);
        List<BrApiProgram> createdPrograms = createPrograms(brApiPrograms);

        if (createdPrograms.size() == 1){
            return Optional.of(createdPrograms.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public Optional<BrApiProgram> updateProgram(BrApiProgram brApiProgram) throws HttpException, APIException {

        if (brApiProgram.getProgramDbId() == null){
            throw new APIException("BrAPI program must have an existing programDbId.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getProgramsByIdPath(brApiProgram.getProgramDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiProgram)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiProgram> updatedProgram = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiProgram resultResponse = gson.fromJson(resultJson, BrApiProgram.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updatedProgram;
    }

}
