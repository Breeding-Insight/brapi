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

import org.brapi.client.v2.model.queryParams.core.BrAPIQueryParams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class SampleQueryParams extends BrAPIQueryParams {

    private String sampleName;
    private String sampleGroupDbId;
    private String plateName;
    private String programDbId;
    private String commonCropName;
    private String trialDbId;
    private String sampleDbId;
    private String observationUnitDbId;
    private String plateDbId;
    private String germplasmDbId;
    private String studyDbId;
    private String externalReferenceId;
    private String externalReferenceSource;

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
    public SampleQueryParams externalReferenceID(String externalReferenceID) {
        this.externalReferenceId = externalReferenceID;
        return this;
    }

    public String externalReferenceId() {
        return externalReferenceId;
    }

    public SampleQueryParams externalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
        return this;
    }

}
