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

package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.request.TraitsRequest;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TraitsAPI extends BrAPIEndpoint {

    public TraitsAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiTrait> getTraits(@NotNull TraitsRequest traitsRequest) throws HttpException, APIException {

        if (traitsRequest == null) {
            throw new IllegalArgumentException("Traits request cannot be null");
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
        return getTraits(new TraitsRequest());
    }

    public Optional<BrApiTrait> getTraitById(String traitId) throws HttpException, APIException {

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

        if (brApiTraits.stream().anyMatch(trait -> trait.getTraitDbId() != null)) {
            throw new APIException("BrAPI trait must not have an existing traitDbId.");
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

    public Optional<BrApiTrait> updateTrait(BrApiTrait brApiTrait) throws HttpException, APIException {

        if (brApiTrait.getTraitDbId() == null){
            throw new APIException("BrAPI trait must have an existing traitDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getTraitsByIdPath(brApiTrait.getTraitDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiTrait)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiTrait> updateTrait = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiTrait resultResponse = gson.fromJson(resultJson, BrApiTrait.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updateTrait;
    }
}
