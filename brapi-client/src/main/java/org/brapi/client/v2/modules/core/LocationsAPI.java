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
import lombok.NonNull;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.BrApiLocation;
import org.brapi.v2.core.model.request.LocationsRequest;
import org.brapi.v2.core.model.response.DataResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocationsAPI extends BrAPIEndpoint {

    public LocationsAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
    }

    public List<BrApiLocation> createLocations(@NonNull List<BrApiLocation> brApiLocations) throws HttpException, APIException {

        if (brApiLocations.isEmpty()) {
            throw new APIException("BrAPI locations cannot be empty");
        }

        if (brApiLocations.stream().anyMatch(location -> location.getLocationDbId() != null)) {
            throw new APIException("BrAPI location must not have an existing locationDbId.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getLocationsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiLocations)
                .method(HttpMethod.POST)
                .build();

        List<BrApiLocation> createdLocation = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiLocation>>() {}.getType();
            DataResponse<BrApiLocation> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdLocation;
    }

    public Optional<BrApiLocation> createLocation(@NonNull BrApiLocation brApiLocation) throws HttpException, APIException {

        List<BrApiLocation> brApiLocations = new ArrayList<>();
        brApiLocations.add(brApiLocation);
        List<BrApiLocation> createdLocations = createLocations(brApiLocations);

        if (createdLocations.size() == 1){
            return Optional.of(createdLocations.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public Optional<BrApiLocation> updateLocation(@NonNull BrApiLocation brApiLocation) throws HttpException, APIException {

        if (brApiLocation.getLocationDbId() == null){
            throw new APIException("BrAPI location must have an existing locationDbId.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getLocationsByIdPath(brApiLocation.getLocationDbId());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiLocation)
                .method(HttpMethod.PUT)
                .build();

        Optional<BrApiLocation> updateLocation = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiLocation resultResponse = gson.fromJson(resultJson, BrApiLocation.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return updateLocation;
    }

    public List<BrApiLocation> getLocations(@NonNull LocationsRequest locationsRequest) throws HttpException, APIException {

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getLocationsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(locationsRequest.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiLocation> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiLocation>>() {
            }.getType();
            DataResponse<BrApiLocation> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiLocation> getLocations() throws HttpException, APIException {
        return getLocations(new LocationsRequest());
    }

    public Optional<BrApiLocation> getLocationById(@NonNull String locationId) throws HttpException, APIException {

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getLocationsByIdPath(locationId);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiLocation> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiLocation resultResponse = gson.fromJson(resultJson, BrApiLocation.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

}
