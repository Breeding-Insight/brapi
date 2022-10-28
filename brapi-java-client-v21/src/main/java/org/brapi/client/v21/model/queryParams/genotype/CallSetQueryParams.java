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

package org.brapi.client.v21.model.queryParams.genotype;

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
 * callSetDbId The ID which uniquely identifies a &#x60;CallSet&#x60; within the given database server (optional)
 * callSetName The human readable name of a &#x60;CallSet&#x60;. (optional)
 * variantSetDbId The ID which uniquely identifies a &#x60;VariantSet&#x60; within the given database server (optional)
 * sampleDbId The ID which uniquely identifies a &#x60;Sample&#x60; within the given database server &lt;br&gt;Filter results to only include &#x60;CallSets&#x60; generated from this &#x60;Sample&#x60; (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class CallSetQueryParams extends GenotypeQueryParams {

    private String callSetDbId;
    private String callSetName;
    private String variantSetDbId;
    private String sampleDbId;
    private String germplasmDbId;
    private String externalReferenceSource;
    private String externalReferenceId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (callSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("callSetDbId", callSetDbId));
        if (callSetName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("callSetName", callSetName));
        if (variantSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantSetDbId", variantSetDbId));
        if (sampleDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sampleDbId", sampleDbId));
        if (germplasmDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("germplasmDbId", germplasmDbId));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));
    }
}
