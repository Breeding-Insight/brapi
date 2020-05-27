package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ObservationUnitTableObservationVariables
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationUnitTableObservationVariables {
  private String observationVariableDbId;

  private String observationVariableName;

}
