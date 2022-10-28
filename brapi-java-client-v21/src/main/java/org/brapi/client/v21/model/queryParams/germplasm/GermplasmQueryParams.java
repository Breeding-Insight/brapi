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
import org.brapi.client.v21.model.queryParams.BrAPISecureQueryParams;

import java.util.List;
import java.util.Map;

/**
 * accessionNumber The unique identifier for a material or germplasm within a genebank  MCPD (v2.1) (ACCENUMB) 2. This is the unique identifier for accessions within a genebank, and is assigned when a sample is entered into the genebank collection (e.g. \&quot;PI 113869\&quot;). (optional)
 * collection A specific panel/collection/population name this germplasm belongs to. (optional)
 * binomialName The full binomial name (scientific name) to identify a germplasm (optional)
 * genus Genus name to identify germplasm (optional)
 * species Species name to identify germplasm (optional)
 * synonym Alternative name or ID used to reference this germplasm (optional)
 * parentDbId Search for Germplasm with this parent (optional)
 * progenyDbId Search for Germplasm with this child (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * germplasmName Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * germplasmPUI Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; by its global permanent unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
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
public class GermplasmQueryParams extends BrAPISecureQueryParams {

    private String germplasmPUI;
    private String germplasmDbId;
    private String germplasmName;
    private String commonCropName;
    private String accessionNumber;
    private String collection;
    private String genus;
    private String species;
    private String studyDbId;
    private String synonym;
    private String parentDbId;
    private String progenyDbId;
    private String programDbId;
    private String externalReferenceId;
    private String externalReferenceID;
    private String externalReferenceSource;
    private String trialDbId;
    private String binomialName;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (accessionNumber != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("accessionNumber", accessionNumber));
        if (collection != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("collection", collection));
        if (binomialName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("binomialName", binomialName));
        if (genus != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("genus", genus));
        if (species != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("species", species));
        if (synonym != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("synonym", synonym));
        if (parentDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("parentDbId", parentDbId));
        if (progenyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("progenyDbId", progenyDbId));
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
        if (germplasmName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("germplasmName", germplasmName));
        if (germplasmPUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("germplasmPUI", germplasmPUI));
        if (externalReferenceID != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceID", externalReferenceID));
        if (externalReferenceId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("externalReferenceSource", externalReferenceSource));
    }
}
