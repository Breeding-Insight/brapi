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
import lombok.NonNull;
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

    public List<BrApiMethod> createMethods(@NonNull List<BrApiMethod> brApiMethods) throws HttpException, APIException {

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

    public Optional<BrApiMethod> createMethod(@NonNull BrApiMethod brApiMethod) throws HttpException, APIException {

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

    public Optional<BrApiMethod> updateMethod(@NonNull BrApiMethod brApiMethod) throws HttpException, APIException {

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

    public List<BrApiMethod> getMethods(@NonNull MethodsRequest methodsRequest) throws HttpException, APIException {

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

    public Optional<BrApiMethod> getMethodById(@NonNull String methodId) throws HttpException, APIException {

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

}
