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
 * variantDbId The ID which uniquely identifies a &#x60;Variant&#x60; (optional)
 * variantSetDbId The ID which uniquely identifies a &#x60;VariantSet&#x60; (optional)
 * referenceDbId The ID which uniquely identifies a &#x60;Reference&#x60; (optional)
 * referenceSetDbId The ID which uniquely identifies a &#x60;ReferenceSet&#x60; (optional)
 * pageToken **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt; Used to request a specific page of data to be returned. &lt;br&gt; Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively.  (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class VariantQueryParams extends GenotypeQueryParams {

    private String searchResultsDbId;
    private String variantDbId;
    private String variantSetDbId;
    private String referenceDbId;
    private String referenceSetDbId;
    private String pageToken;
    private String externalReferenceSource;
    private String externalReferenceId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (variantDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantDbId", variantDbId));
        if (variantSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantSetDbId", variantSetDbId));
        if (referenceDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceDbId", referenceDbId));
        if (referenceSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceSetDbId", referenceSetDbId));
        if (pageToken != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));

    }
}
