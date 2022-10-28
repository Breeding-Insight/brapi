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
 * sampleDbId The unique identifier for a &#x60;Sample&#x60; (optional)
 * sampleName The human readable name of the &#x60;Sample&#x60; (optional)
 * sampleGroupDbId The unique identifier for a group of related &#x60;Samples&#x60; (optional)
 * observationUnitDbId The ID which uniquely identifies an &#x60;ObservationUnit&#x60; (optional)
 * plateDbId The ID which uniquely identifies a &#x60;Plate&#x60; of &#x60;Sample&#x60; (optional)
 * plateName The human readable name of a &#x60;Plate&#x60; of &#x60;Sample&#x60; (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * externalReferenceID **Deprecated in v2.1** Please use &#x60;externalReferenceId&#x60;. Github issue number #460  &lt;br&gt;An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class SampleQueryParams extends GenotypeQueryParams {

    private String sampleName;
    private String sampleGroupDbId;
    private String plateName;
    private String programDbId;
    private String commonCropName;
    private String trialDbId;
    private String externalReferenceId;
    private String sampleDbId;
    private String observationUnitDbId;
    private String plateDbId;
    private String germplasmDbId;
    private String studyDbId;
    private String externalReferenceID;
    private String externalReferenceSource;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (sampleDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sampleDbId", sampleDbId));
        if (sampleName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sampleName", sampleName));
        if (sampleGroupDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("sampleGroupDbId", sampleGroupDbId));
        if (observationUnitDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitDbId", observationUnitDbId));
        if (plateDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("plateDbId", plateDbId));
        if (plateName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("plateName", plateName));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
        if (trialDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("trialDbId", trialDbId));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
        if (germplasmDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("germplasmDbId", germplasmDbId));
        if (externalReferenceID != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceID", externalReferenceID));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
    }
}
