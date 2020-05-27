package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ObservationVariable
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationVariable extends BrApiVariable {
  private String observationVariableDbId;

  private String observationVariableName;

}
