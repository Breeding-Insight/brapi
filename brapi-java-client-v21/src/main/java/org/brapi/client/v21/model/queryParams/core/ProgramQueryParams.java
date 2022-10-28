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
 * abbreviation A shortened version of the human readable name for a Program (optional)
 * programType The type of program entity this object represents &lt;br/&gt; &#x27;STANARD&#x27; represents a standard, permenant breeding program &lt;br/&gt; &#x27;PROJECT&#x27; represents a short term project, usually with a set time limit based on funding  (optional)
 * programName Use this parameter to only return results associated with the given &#x60;Program&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class ProgramQueryParams extends BrAPISecureQueryParams {

    private String programType;
    private String programName;
    private String abbreviation;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (abbreviation != null)
            paramList.addAll(client.parameterToPair("abbreviation", abbreviation));
        if (programType != null)
            paramList.addAll(client.parameterToPair("programType", programType));
        if (programName != null)
            paramList.addAll(client.parameterToPair("programName", programName));
    }
}
