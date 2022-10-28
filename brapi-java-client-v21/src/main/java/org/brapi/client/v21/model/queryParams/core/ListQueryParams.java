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
import org.brapi.model.v21.core.BrAPIListTypes;

import java.util.List;
import java.util.Map;

/**
 * listType A flag to indicate the type of objects that are referneced in a List (optional)
 * listName The human readable name of a List (optional)
 * listDbId The unique identifier of a List (optional)
 * listSource A short tag to indicate the source of a list (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class ListQueryParams extends BrAPISecureQueryParams {

    private BrAPIListTypes listType;
    private String listName;
    private String listDbId;
    private String listSource;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (listType != null)
            paramList.addAll(client.parameterToPair("listType", listType));
        if (listName != null)
            paramList.addAll(client.parameterToPair("listName", listName));
        if (listDbId != null)
            paramList.addAll(client.parameterToPair("listDbId", listDbId));
        if (listSource != null)
            paramList.addAll(client.parameterToPair("listSource", listSource));
    }
}
