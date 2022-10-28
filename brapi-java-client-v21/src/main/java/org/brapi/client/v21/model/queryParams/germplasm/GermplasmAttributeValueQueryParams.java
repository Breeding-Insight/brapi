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

import java.util.List;
import java.util.Map;

/**
 * attributeValueDbId The unique id for an attribute value (optional)
 * attributeDbId The unique id for an attribute (optional)
 * attributeName The human readable name for an attribute (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class GermplasmAttributeValueQueryParams extends GermplasmQueryParams {

    private String attributeValueDbId;
    private String attributeDbId;
    private String attributeName;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (attributeValueDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeValueDbId", attributeValueDbId));
        if (attributeDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeDbId", attributeDbId));
        if (attributeName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeName", attributeName));
    }
}
