package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;

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
  private String observationUnitDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private List<BrApiExternalReference> externalReferences;

  private String germplasmDbId;

  private String germplasmName;

  private String locationDbId;

  private String locationName;

  private BrApiObservationLevel observationLevel;

  private String observationUnitName;

  private String observationUnitPUI;

  private BrApiObservationUnitPosition observationUnitPosition;

  private String plantNumber;

  private String plotNumber;

  private String programDbId;

  private String programName;

  private String seedLotDbId;

  private String studyDbId;

  private String studyName;

  @Valid
  private List<BrApiObservationTreatment> treatments;

  private String trialDbId;

  private String trialName;

}
