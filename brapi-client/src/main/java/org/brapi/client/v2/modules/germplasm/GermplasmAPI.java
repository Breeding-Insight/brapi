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

package org.brapi.client.v2.modules.germplasm;

import com.google.gson.reflect.TypeToken;
import lombok.NonNull;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.germplasm.model.BrApiGermplasm;
import org.brapi.v2.germplasm.model.request.GermplasmRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GermplasmAPI extends BrAPIEndpoint {

    public GermplasmAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiGermplasm> getGermplasm(@NonNull GermplasmRequest germplasmFilter) throws HttpException, APIException {

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

    public Optional<BrApiGermplasm> getGermplasmById(@NonNull String germplasmId) throws HttpException, APIException {

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
