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

package org.brapi.client.v2.model.queryParams.genotype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * sampleDbId The unique identifier for a &#x60;Sample&#x60; (optional)
 * sampleName The human readable name of the &#x60;Sample&#x60; (optional)
 * sampleGroupDbId The unique identifier for a group of related &#x60;Samples&#x60; (optional)
 * observationUnitDbId The ID which uniquely identifies an &#x60;ObservationUnit&#x60; (optional)
 * plateDbId The ID which uniquely identifies a &#x60;Plate&#x60; of &#x60;Samples&#x60; (optional)
 * plateName The human readable name of a &#x60;Plate&#x60; of &#x60;Samples&#x60; (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class PlatesQueryParams extends GenotypeQueryParams {

    private String sampleDbId;
    private String sampleName;
    private String sampleGroupDbId;
    private String observationUnitDbId;
    private String plateDbId;
    private String plateName;
    private String commonCropName;
    private String germplasmDbId;
    private String externalReferenceId;
    private String externalReferenceSource;
    private String scientificName;
    private String type;
    private String programDbId;
    private String trialDbId;
    private String studyDbId;

    /**
     * **Deprecated in v2.1** Please use externalReferenceId
     */
    @Deprecated
    public String externalReferenceID() {
        return externalReferenceId;
    }

    /**
     * **Deprecated in v2.1** Please use externalReferenceId
     */
    @Deprecated
    public PlatesQueryParams externalReferenceID(String externalReferenceID) {
        this.externalReferenceId = externalReferenceID;
        return this;
    }

    public String externalReferenceId() {
        return externalReferenceId;
    }

    public PlatesQueryParams externalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
        return this;
    }
}
