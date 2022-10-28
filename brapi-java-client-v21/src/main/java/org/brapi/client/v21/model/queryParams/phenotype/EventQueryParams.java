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

package org.brapi.client.v21.model.queryParams.phenotype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.brapi.client.v21.ApiClient;
import org.brapi.client.v21.Pair;
import org.threeten.bp.OffsetDateTime;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class EventQueryParams extends PhenotypeQueryParams {

    protected String studyDbId;
    protected String observationUnitDbId;
    protected String eventDbId;
    protected String eventType;
    protected OffsetDateTime dateRangeStart;
    protected OffsetDateTime dateRangeEnd;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (eventDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("eventDbId", eventDbId));
        if (eventType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("eventType", eventType));
        if (dateRangeStart != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("dateRangeStart", dateRangeStart));
        if (dateRangeEnd != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("dateRangeEnd", dateRangeEnd));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
    }
}
