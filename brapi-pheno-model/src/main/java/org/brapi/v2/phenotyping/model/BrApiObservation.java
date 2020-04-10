package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReferences;
import org.brapi.v2.core.model.BrApiSeason;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Observation
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservation {
  @JsonProperty("observationDbId")
  private String observationDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("collector")
  @NotNull
  private String collector;

  @JsonProperty("externalReferences")
  private BrApiExternalReferences externalReferences;

  @JsonProperty("germplasmDbId")
  @NotNull
  private String germplasmDbId;

  @JsonProperty("germplasmName")
  private String germplasmName;

  @JsonProperty("observationTimeStamp")
  @NotNull
  private OffsetDateTime observationTimeStamp;

  @JsonProperty("observationUnitDbId")
  @NotNull
  private String observationUnitDbId;

  @JsonProperty("observationUnitName")
  private String observationUnitName;

  @JsonProperty("observationVariableDbId")
  @NotNull
  private String observationVariableDbId;

  @JsonProperty("observationVariableName")
  private String observationVariableName;

  @JsonProperty("season")
  @NotNull
  private BrApiSeason season;

  @JsonProperty("studyDbId")
  @NotNull
  private String studyDbId;

  @JsonProperty("uploadedBy")
  @NotNull
  private String uploadedBy;

  @JsonProperty("value")
  @NotNull
  private String value;

}
