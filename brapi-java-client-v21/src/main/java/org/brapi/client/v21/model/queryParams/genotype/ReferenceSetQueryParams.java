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

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class ReferenceSetQueryParams extends GenotypeQueryParams {

    private String referenceSetDbId;
    private String accession;
    private String md5checksum;
    private String assemblyPUI;
    private String commonCropName;
    private String programDbId;
    private String trialDbId;
    private String studyDbId;
    private String externalReferenceSource;
    private String externalReferenceId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (referenceSetDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("referenceSetDbId", referenceSetDbId));
        if (accession != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("accession", accession));
        if (assemblyPUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("assemblyPUI", assemblyPUI));
        if (md5checksum != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("md5checksum", md5checksum));
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
