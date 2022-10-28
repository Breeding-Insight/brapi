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

import java.util.List;
import java.util.Map;

/**
 * observationUnitDbId The unique ID of an Observation Unit (optional)
 * observationUnitName The human readable identifier for an Observation Unit (optional)
 * locationDbId The unique ID of a location where these observations were collected (optional)
 * seasonDbId The year or Phenotyping campaign of a multi-annual study (trees, grape, ...) (optional)
 * includeObservations Use this parameter to include a list of observations embedded in each ObservationUnit object.   CAUTION - Use this parameter at your own risk. It may return large, unpaginated lists of observation data. Only set this value to True if you are sure you need to.  (optional)
 * observationUnitLevelName The Observation Unit Level. Returns only the observation unit of the specified Level.  &lt;br/&gt;References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;levelName  &lt;br/&gt;**Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample**  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelOrder The Observation Unit Level Order Number. Returns only the observation unit of the specified Level.  References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;levelOrder  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelCode The Observation Unit Level Code. This parameter should be used together with &#x60;observationUnitLevelName&#x60;  or &#x60;observationUnitLevelOrder&#x60;. References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;levelCode  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelRelationshipName The Observation Unit Level Relationship is a connection that this observation unit has to another level of the hierarchy.  &lt;br/&gt;For example, if you have several observation units at a &#x27;plot&#x27; level, they might all share a relationship to the same &#x27;field&#x27; level.   &lt;br/&gt;Use this parameter to identify groups of observation units that share a relationship level.  &lt;br/&gt;**Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample**  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelRelationshipOrder The Observation Unit Level Order Number.  &lt;br/&gt;Returns only the observation unit of the specified Level. References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;levelOrder  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelRelationshipCode The Observation Unit Level Code.  &lt;br/&gt;This parameter should be used together with &#x60;observationUnitLevelName&#x60; or &#x60;observationUnitLevelOrder&#x60;. References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;levelCode  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 * observationUnitLevelRelationshipDbId The observationUnitDbId associated with a particular level and code. &lt;br/&gt;This parameter should be used together with &#x60;observationUnitLevelName&#x60; or &#x60;observationUnitLevelOrder&#x60;. References ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel-&gt;observationUnitDbId  &lt;br/&gt;For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.  (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class ObservationUnitQueryParams extends PhenotypeQueryParams {

    private String germplasmDbId;
    private String studyDbId;
    private String locationDbId;
    private String trialDbId;
    private String programDbId;
    private String seasonDbId;
    private String observationUnitLevelName;
    private String observationUnitLevelOrder;
    private String observationUnitLevelCode;
    private Boolean includeObservations;
    private String observationUnitName;
    private String observationUnitLevelRelationshipCode;
    private String observationUnitLevelRelationshipDbId;
    private String observationUnitLevelRelationshipOrder;
    private String observationUnitLevelRelationshipName;
    private String getObservationUnitLevelRelationshipName;
    private String commonCropName;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (observationUnitName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitName", observationUnitName));
        if (locationDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("locationDbId", locationDbId));
        if (seasonDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("seasonDbId", seasonDbId));
        if (includeObservations != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("includeObservations", includeObservations));
        if (observationUnitLevelName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelName", observationUnitLevelName));
        if (observationUnitLevelOrder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelOrder", observationUnitLevelOrder));
        if (observationUnitLevelCode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelCode", observationUnitLevelCode));
        if (observationUnitLevelRelationshipName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelRelationshipName", observationUnitLevelRelationshipName));
        if (observationUnitLevelRelationshipOrder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelRelationshipOrder", observationUnitLevelRelationshipOrder));
        if (observationUnitLevelRelationshipCode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelRelationshipCode", observationUnitLevelRelationshipCode));
        if (observationUnitLevelRelationshipDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("observationUnitLevelRelationshipDbId", observationUnitLevelRelationshipDbId));
        if (commonCropName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("programDbId", programDbId));
        if (trialDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("trialDbId", trialDbId));
        if (studyDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("studyDbId", studyDbId));
        if (germplasmDbId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("germplasmDbId", germplasmDbId));
    }
}
