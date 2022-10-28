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
 * locationType The type of location this represents (ex. Field Station, Breeding Location, Storage Location, etc) (optional)
 * locationDbId The unique identifier for a Location (optional)
 * locationName A human readable name for a location &lt;br/&gt; MIAPPE V1.1 (DM-18) Experimental site name - The name of the natural site, experimental field, greenhouse, phenotyping facility, etc. where the experiment took place. (optional)
 * parentLocationDbId The unique identifier for a Location &lt;br/&gt; The Parent Location defines the encompassing location that this location belongs to.  For example, an Institution might have multiple Field Stations inside it and each Field Station might have multiple Fields. (optional)
 * parentLocationName A human readable name for a location &lt;br/&gt; The Parent Location defines the encompassing location that this location belongs to.  For example, an Institution might have multiple Field Stations inside it and each Field Station might have multiple Fields. (optional)
 * commonCropName The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crop.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server. (optional)
 * programDbId Use this parameter to only return results associated with the given &#x60;Program&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /programs&#x60; to find the list of available &#x60;Programs&#x60; on a server. (optional)
 * externalReferenceID **Deprecated in v2.1** Please use &#x60;externalReferenceId&#x60;. Github issue number #460  &lt;br&gt;An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceId An external reference ID. Could be a simple string or a URI. (use with &#x60;externalReferenceSource&#x60; parameter) (optional)
 * externalReferenceSource An identifier for the source system or database of an external reference (use with &#x60;externalReferenceId&#x60; parameter) (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class LocationQueryParams extends BrAPISecureQueryParams {

    private String locationType;
    private String locationDbId;
    private String parentLocationDbId;
    private String parentLocationName;
    private String locationName;

    @Override
    public void buildQueryParams(ApiClient client, List<Pair> paramList, Map<String, String> headerParams) {
        super.buildQueryParams(client, paramList, headerParams);
        if (locationType != null)
            paramList.addAll(client.parameterToPair("locationType", locationType));
        if (locationDbId != null)
            paramList.addAll(client.parameterToPair("locationDbId", locationDbId));
        if (locationName != null)
            paramList.addAll(client.parameterToPair("locationName", locationName));
        if (parentLocationDbId != null)
            paramList.addAll(client.parameterToPair("parentLocationDbId", parentLocationDbId));
        if (parentLocationName != null)
            paramList.addAll(client.parameterToPair("parentLocationName", parentLocationName));
    }
}
