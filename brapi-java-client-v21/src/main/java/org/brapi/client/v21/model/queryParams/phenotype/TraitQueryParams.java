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

package org.brapi.client.v21.model.queryParams.phenotype;

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
 * traitDbId The unique identifier for a trait (optional)
 * observationVariableDbId The unique identifier for an observation variable (optional)
 * ontologyDbId The unique identifier for an ontology definition. Use this parameter to filter results based on a specific ontology   Use &#x60;GET /ontologies&#x60; to find the list of available ontologies on a server. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class TraitQueryParams extends PhenotypeQueryParams {

    private String ontologyDbId;
    private String commonCropName;
    private String programDbId;
    private String traitDbId;
    private String observationVariableDbId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (traitDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("traitDbId", traitDbId));
        if (observationVariableDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationVariableDbId", observationVariableDbId));
        if (ontologyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ontologyDbId", ontologyDbId));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
    }
}
