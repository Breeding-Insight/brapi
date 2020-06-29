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

package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiSeason;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Observation
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservation {
  private String observationDbId;

  @Valid
  private Map<String, String> additionalInfo;

  @NotNull
  private String collector;

  private List<BrApiExternalReference> externalReferences;

  @NotNull
  private String germplasmDbId;

  private String germplasmName;

  @NotNull
  private OffsetDateTime observationTimeStamp;

  @NotNull
  private String observationUnitDbId;

  private String observationUnitName;

  @NotNull
  private String observationVariableDbId;

  private String observationVariableName;

  @NotNull
  private BrApiSeason season;

  @NotNull
  private String studyDbId;

  @NotNull
  private String uploadedBy;

  @NotNull
  private String value;

}
