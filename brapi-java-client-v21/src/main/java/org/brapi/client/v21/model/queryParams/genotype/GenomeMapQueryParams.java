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
 * mapDbId The ID which uniquely identifies a &#x60;GenomeMap&#x60; (optional)
 * mapPUI The DOI or other permanent identifier for a &#x60;GenomeMap&#x60; (optional)
 * scientificName Full scientific binomial format name. This includes Genus, Species, and Sub-species (optional)
 * type The type of map, usually \&quot;Genetic\&quot; or \&quot;Physical\&quot; (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class GenomeMapQueryParams extends GenotypeQueryParams {

    private String commonCropName;
    private String mapDbId;
    private String mapPUI;
    private String scientificName;
    private String type;
    private String programDbId;
    private String trialDbId;
    private String studyDbId;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (mapDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("mapDbId", mapDbId));
        if (mapPUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("mapPUI", mapPUI));
        if (scientificName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scientificName", scientificName));
        if (type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
        if (trialDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("trialDbId", trialDbId));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
    }
}
