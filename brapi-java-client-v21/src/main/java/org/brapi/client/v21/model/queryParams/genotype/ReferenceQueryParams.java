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
 * referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (optional)
 * referenceSetDbId The ID of the &#x60;ReferenceSet&#x60; to be retrieved. (optional)
 * accession If set, return the reference sets for which the &#x60;accession&#x60; matches this string (case-sensitive, exact match). (optional)
 * md5checksum If specified, return the references for which the &#x60;md5checksum&#x60; matches this string (case-sensitive, exact match). (optional)
 * isDerived If the reference is derived from a source sequence (optional)
 * minLength The minimum length of the reference sequences to be retrieved. (optional)
 * maxLength The maximum length of the reference sequences to be retrieved. (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class ReferenceQueryParams extends GenotypeQueryParams {

    private String referenceDbId;
    private String referenceSetDbId;
    private String accession;
    private String md5checksum;
    private String isDerived;
    private String minLength;
    private String maxLength;
    private String commonCropName;
    private String programDbId;
    private String trialDbId;
    private String studyDbId;
    private String externalReferenceSource;
    private String externalReferenceId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (referenceDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceDbId", referenceDbId));
        if (referenceSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceSetDbId", referenceSetDbId));
        if (accession != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("accession", accession));
        if (md5checksum != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("md5checksum", md5checksum));
        if (isDerived != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("isDerived", isDerived));
        if (minLength != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("minLength", minLength));
        if (maxLength != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("maxLength", maxLength));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
        if (trialDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("trialDbId", trialDbId));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));
    }
}
