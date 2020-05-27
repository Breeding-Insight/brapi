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
