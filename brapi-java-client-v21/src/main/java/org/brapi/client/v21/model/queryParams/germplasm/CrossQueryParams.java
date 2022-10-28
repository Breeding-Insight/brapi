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

package org.brapi.client.v21.model.queryParams.germplasm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.brapi.client.v21.ApiClient;
import org.brapi.client.v21.Pair;

import java.util.List;
import java.util.Map;

/**
 * crossingProjectDbId Search for Crossing Projects with this unique id (optional)
 * crossingProjectName The human readable name for a crossing project (optional)
 * crossDbId Search for Cross with this unique id (optional)
 * crossName Search for Cross with this human readable name (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class CrossQueryParams extends GermplasmQueryParams {

    private String crossingProjectDbId;
    private String crossDbId;
    private String crossingProjectName;
    private String crossName;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (crossingProjectDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("crossingProjectDbId", crossingProjectDbId));
        if (crossingProjectName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("crossingProjectName", crossingProjectName));
        if (crossDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("crossDbId", crossDbId));
        if (crossName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("crossName", crossName));
    }
}
