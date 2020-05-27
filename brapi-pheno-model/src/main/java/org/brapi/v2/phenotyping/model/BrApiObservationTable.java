package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * ObservationTable
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationTable {
  @Valid
  private List<List<String>> data;

  @Valid
  private List<HeaderRowName> headerRow;

  @Valid
  private List<String> observationVariableDbIds;

  @Valid
  private List<String> observationVariableNames;

}
