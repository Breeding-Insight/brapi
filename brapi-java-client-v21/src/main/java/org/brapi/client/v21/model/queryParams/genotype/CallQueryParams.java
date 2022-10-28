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
 * variantDbId The ID which uniquely identifies a &#x60;Variant&#x60; within the given database server (optional)
 * variantSetDbId The ID which uniquely identifies a &#x60;VariantSet&#x60; within the given database server (optional)
 * expandHomozygotes Should homozygotes be expanded (true) or collapsed into a single occurrence (false) (optional)
 * unknownString The string to use as a representation for missing data (optional)
 * sepPhased The string to use as a separator for phased allele calls (optional)
 * sepUnphased The string to use as a separator for unphased allele calls (optional)
 * pageToken **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt; Used to request a specific page of data to be returned. &lt;br&gt; Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively.  (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class CallQueryParams extends GenotypeQueryParams {

    private String callSetDbId;
    private String variantDbId;
    private String variantSetDbId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (callSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("callSetDbId", callSetDbId));
        if (variantDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantDbId", variantDbId));
        if (variantSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantSetDbId", variantSetDbId));
    }
}
