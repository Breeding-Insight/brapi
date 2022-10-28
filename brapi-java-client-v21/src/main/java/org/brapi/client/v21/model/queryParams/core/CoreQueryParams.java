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
 * externalReferenceID **Deprecated in v2.1** Please use &#x60;externalReferenceId&#x60;. Github issue number #460  &lt;br&gt;An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 * page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
 * pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
 */
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
public abstract class CoreQueryParams extends BrAPISecureQueryParams {

    protected String programDbId;
    protected String commonCropName;
    protected String externalReferenceId;
    protected String externalReferenceSource;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (commonCropName != null)
            paramList.addAll(client.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            paramList.addAll(client.parameterToPair("programDbId", programDbId));
        if (externalReferenceId != null)
            paramList.addAll(client.parameterToPair("externalReferenceId", externalReferenceId));
        if (externalReferenceSource != null)
            paramList.addAll(client.parameterToPair("externalReferenceSource", externalReferenceSource));
        if (page != null)
            paramList.addAll(client.parameterToPair("page", page));
        if (pageSize != null)
            paramList.addAll(client.parameterToPair("pageSize", pageSize));
    }
}
