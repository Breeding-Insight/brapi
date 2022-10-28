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

package org.brapi.client.v21.model.queryParams;

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

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
public abstract class BrAPIQueryParams {

    protected Integer page;
    protected Integer pageSize;

    /**
     * Abstract class for each individual module to extend.
     * Handles building query param lists from the client.
     * Each module has its own base implementation that handles a common set of parameters.
     *
     * @param client the okhttp client
     * @param paramList a list of brapi pairs which correspond to the call parameters
     * @param headerParams so far only used for the authorization token
     */
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        if (page != null)
            paramList.addAll(client.parameterToPair("page", page));
        if (pageSize != null)
            paramList.addAll(client.parameterToPair("pageSize", pageSize));
    }
}
