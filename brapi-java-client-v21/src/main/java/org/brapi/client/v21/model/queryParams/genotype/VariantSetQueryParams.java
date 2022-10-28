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
 * variantSetDbId The ID of the &#x60;VariantSet&#x60; to be retrieved. (optional)
 * variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (optional)
 * callSetDbId The ID of the &#x60;CallSet&#x60; to be retrieved. (optional)
 * referenceSetDbId The ID of the reference set that describes the sequences used by the variants in this set. (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * studyName Use this parameter to only return results associated with the given &#x60;Study&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class VariantSetQueryParams extends GenotypeQueryParams {

    private String variantSetDbId;
    private String variantDbId;
    private String callSetDbId;
    private String studyDbId;
    private String studyName;
    private String referenceSetDbId;
    private String commonCropName;
    private String programDbId;
    private String externalReferenceId;
    private String externalReferenceSource;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (variantSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantSetDbId", variantSetDbId));
        if (variantDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("variantDbId", variantDbId));
        if (callSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("callSetDbId", callSetDbId));
        if (referenceSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceSetDbId", referenceSetDbId));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
        if (studyName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyName", studyName));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));
    }
}
