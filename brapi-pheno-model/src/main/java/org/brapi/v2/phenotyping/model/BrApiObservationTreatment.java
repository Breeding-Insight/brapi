package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ObservationTreatment
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationTreatment {
  private String factor;

  private String modality;

}
