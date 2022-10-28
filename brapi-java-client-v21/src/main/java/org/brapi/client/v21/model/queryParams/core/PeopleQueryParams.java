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
 * firstName A persons first name (optional)
 * lastName A persons last name (optional)
 * personDbId The unique ID of a person (optional)
 * userID A systems user ID associated with this person. Different from personDbId because you could have a person who is not a user of the system. (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class PeopleQueryParams extends BrAPISecureQueryParams {

    private String firstName;
    private String lastName;
    private String personDbId;
    private String userID;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (firstName != null)
            paramList.addAll(client.parameterToPair("firstName", firstName));
        if (lastName != null)
            paramList.addAll(client.parameterToPair("lastName", lastName));
        if (personDbId != null)
            paramList.addAll(client.parameterToPair("personDbId", personDbId));
        if (userID != null)
            paramList.addAll(client.parameterToPair("userID", userID));
    }
}
