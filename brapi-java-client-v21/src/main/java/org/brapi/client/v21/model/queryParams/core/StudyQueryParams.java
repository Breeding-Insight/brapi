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

package org.brapi.client.v21.model.queryParams.core;

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
 * studyType Filter based on study type unique identifier (optional)
 * locationDbId Filter by location (optional)
 * seasonDbId Filter by season or year (optional)
 * studyCode Filter by study code (optional)
 * studyPUI Filter by study PUI (optional)
 * observationVariableDbId Filter by observation variable DbId (optional)
 * active A flag to indicate if a Study is currently active and ongoing (optional)
 * sortBy Name of the field to sort by. (optional)
 * sortOrder Sort order direction. Ascending/Descending. (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * studyName Use this parameter to only return results associated with the given &#x60;Study&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 **/
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class StudyQueryParams extends BrAPISecureQueryParams {

    private String studyType;
    private String locationDbId;
    private String seasonDbId;
    private String trialDbId;
    private String studyDbId;
    private String studyName;
    private String studyCode;
    private String studyPUI;
    private String germplasmDbId;
    private String observationVariableDbId;
    private String active;
    private String sortBy;
    private String sortOrder;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (studyType != null)
            paramList.addAll(client.parameterToPair("studyType", studyType));
        if (locationDbId != null)
            paramList.addAll(client.parameterToPair("locationDbId", locationDbId));
        if (seasonDbId != null)
            paramList.addAll(client.parameterToPair("seasonDbId", seasonDbId));
        if (studyCode != null)
            paramList.addAll(client.parameterToPair("studyCode", studyCode));
        if (studyPUI != null)
            paramList.addAll(client.parameterToPair("studyPUI", studyPUI));
        if (observationVariableDbId != null)
            paramList.addAll(client.parameterToPair("observationVariableDbId", observationVariableDbId));
        if (active != null)
            paramList.addAll(client.parameterToPair("active", active));
        if (sortBy != null)
            paramList.addAll(client.parameterToPair("sortBy", sortBy));
        if (sortOrder != null)
            paramList.addAll(client.parameterToPair("sortOrder", sortOrder));
        if (trialDbId != null)
            paramList.addAll(client.parameterToPair("trialDbId", trialDbId));
        if (studyDbId != null)
            paramList.addAll(client.parameterToPair("studyDbId", studyDbId));
        if (studyName != null)
            paramList.addAll(client.parameterToPair("studyName", studyName));
        if (germplasmDbId != null)
            paramList.addAll(client.parameterToPair("germplasmDbId", germplasmDbId));
    }
}
