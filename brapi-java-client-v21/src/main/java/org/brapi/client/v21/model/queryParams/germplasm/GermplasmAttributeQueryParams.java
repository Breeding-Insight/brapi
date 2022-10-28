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
 * attributeCategory The general category for the attribute. very similar to Trait class. (optional)
 * attributeDbId The unique id for an attribute (optional)
 * attributeName The human readable name for an attribute (optional)
 * attributePUI The Permanent Unique Identifier of an Attribute, usually in the form of a URI (optional)
 * methodDbId Method unique identifier (optional)
 * methodName Human readable name for the method &lt;br/&gt;MIAPPE V1.1 (DM-88) Method  Name of the method of observation (optional)
 * methodPUI The Permanent Unique Identifier of a Method, usually in the form of a URI (optional)
 * scaleDbId Scale unique identifier (optional)
 * scaleName Human readable name for the scale &lt;br/&gt;MIAPPE V1.1 (DM-88) Scale  Name of the scale of observation (optional)
 * scalePUI The Permanent Unique Identifier of a Scale, usually in the form of a URI (optional)
 * traitDbId Trait unique identifier (optional)
 * traitName Human readable name for the trait &lt;br/&gt;MIAPPE V1.1 (DM-88) Trait  Name of the trait of observation (optional)
 * traitPUI The Permanent Unique Identifier of a Trait, usually in the form of a URI (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class GermplasmAttributeQueryParams extends GermplasmQueryParams {

    private String attributeCategory;
    private String attributeDbId;
    private String attributeName;
    private String attributePUI;
    private String methodDbId;
    private String methodName;
    private String methodPUI;
    private String scaleDbId;
    private String scaleName;
    private String scalePUI;
    private String traitDbId;
    private String traitName;
    private String traitPUI;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (attributeCategory != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeCategory", attributeCategory));
        if (attributeDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeDbId", attributeDbId));
        if (attributeName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributeName", attributeName));
        if (attributePUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attributePUI", attributePUI));
        if (methodDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("methodDbId", methodDbId));
        if (methodName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("methodName", methodName));
        if (methodPUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("methodPUI", methodPUI));
        if (scaleDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scaleDbId", scaleDbId));
        if (scaleName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scaleName", scaleName));
        if (scalePUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("scalePUI", scalePUI));
        if (traitDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("traitDbId", traitDbId));
        if (traitName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("traitName", traitName));
        if (traitPUI != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("traitPUI", traitPUI));
    }
}
