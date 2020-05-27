package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * ObservationUnitTable
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationUnitTable {

  @Valid
  private List<List<String>> data;

  @Valid
  private List<HeaderRowName> headerRow;

  @Valid
  private List<BrApiObservationUnitTableObservationVariables> observationVariables;

}
