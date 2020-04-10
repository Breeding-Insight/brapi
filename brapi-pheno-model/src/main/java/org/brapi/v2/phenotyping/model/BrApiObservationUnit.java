package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReferences;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * ObservationUnit
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationUnit {
  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("externalReferences")
  private BrApiExternalReferences externalReferences;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId;

  @JsonProperty("germplasmName")
  private String germplasmName;

  @JsonProperty("locationDbId")
  private String locationDbId;

  @JsonProperty("locationName")
  private String locationName;

  @JsonProperty("observationLevel")
  private BrApiObservationLevel observationLevel;

  @JsonProperty("observationUnitName")
  private String observationUnitName;

  @JsonProperty("observationUnitPUI")
  private String observationUnitPUI;

  @JsonProperty("observationUnitPosition")
  private BrApiObservationUnitPosition observationUnitPosition;

  @JsonProperty("plantNumber")
  private String plantNumber;

  @JsonProperty("plotNumber")
  private String plotNumber;

  @JsonProperty("programDbId")
  private String programDbId;

  @JsonProperty("programName")
  private String programName;

  @JsonProperty("seedLotDbId")
  private String seedLotDbId;

  @JsonProperty("studyDbId")
  private String studyDbId;

  @JsonProperty("studyName")
  private String studyName;

  @JsonProperty("treatments")
  @Valid
  private List<BrApiObservationTreatment> treatments;

  @JsonProperty("trialDbId")
  private String trialDbId;

  @JsonProperty("trialName")
  private String trialName;

}
