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
 * active A flag to indicate if a Trial is currently active and ongoing (optional)
 * contactDbId Contact entities associated with this trial (optional)
 * locationDbId Filter by location (optional)
 * searchDateRangeStart The start of the overlapping search date range. &#x60;searchDateRangeStart&#x60; must be before &#x60;searchDateRangeEnd&#x60;.  Return a Trial entity if any of the following cases are true  - &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; AND &#x60;searchDateRangeEnd&#x60; is null   - &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; AND &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60;  - &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60; AND &#x60;searchDateRangeStart&#x60; is null  - &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60; AND &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; (optional)
 * searchDateRangeEnd The start of the overlapping search date range. &#x60;searchDateRangeStart&#x60; must be before &#x60;searchDateRangeEnd&#x60;.  Return a Trial entity if any of the following cases are true  - &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; AND &#x60;searchDateRangeEnd&#x60; is null   - &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; AND &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60;  - &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60; AND &#x60;searchDateRangeStart&#x60; is null  - &#x60;searchDateRangeEnd&#x60; is after &#x60;trial.startDate&#x60; AND &#x60;searchDateRangeStart&#x60; is before &#x60;trial.endDate&#x60; (optional)
 * trialPUI Filter by trial PUI (optional)
 * sortBy Sort order. Name of the field to sort by. (optional)
 * sortOrder Sort order direction: asc/desc (optional)
 * trialDbId Use this parameter to only return results associated with the given &#x60;Trial&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * trialName Use this parameter to only return results associated with the given &#x60;Trial&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /trials&#x60; to find the list of available &#x60;Trials&#x60; on a server. (optional)
 * studyDbId Use this parameter to only return results associated with the given &#x60;Study&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /studies&#x60; to find the list of available &#x60;Studies&#x60; on a server. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class TrialQueryParams extends BrAPISecureQueryParams {

    private String active;
    private String commonCropName;
    private String contactDbId;
    private String programDbId;
    private String locationDbId;
    private String searchDateRangeStart;
    private String searchDateRangeEnd;
    private String studyDbId;
    private String trialDbId;
    private String trialName;
    private String trialPUI;
    private String sortBy;
    private String sortOrder;
    private String externalReferenceID;
    private String externalReferenceSource;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (active != null)
            paramList.addAll(client.parameterToPair("active", active));
        if (contactDbId != null)
            paramList.addAll(client.parameterToPair("contactDbId", contactDbId));
        if (locationDbId != null)
            paramList.addAll(client.parameterToPair("locationDbId", locationDbId));
        if (searchDateRangeStart != null)
            paramList.addAll(client.parameterToPair("searchDateRangeStart", searchDateRangeStart));
        if (searchDateRangeEnd != null)
            paramList.addAll(client.parameterToPair("searchDateRangeEnd", searchDateRangeEnd));
        if (trialPUI != null)
            paramList.addAll(client.parameterToPair("trialPUI", trialPUI));
        if (sortBy != null)
            paramList.addAll(client.parameterToPair("sortBy", sortBy));
        if (sortOrder != null)
            paramList.addAll(client.parameterToPair("sortOrder", sortOrder));
        if (trialDbId != null)
            paramList.addAll(client.parameterToPair("trialDbId", trialDbId));
        if (trialName != null)
            paramList.addAll(client.parameterToPair("trialName", trialName));
        if (studyDbId != null)
            paramList.addAll(client.parameterToPair("studyDbId", studyDbId));
    }
}
