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
  @JsonProperty("data")
  @Valid
  private List<List<String>> data;

  @JsonProperty("headerRow")
  @Valid
  private List<HeaderRowName> headerRow;

  @JsonProperty("observationVariableDbIds")
  @Valid
  private List<String> observationVariableDbIds;

  @JsonProperty("observationVariableNames")
  @Valid
  private List<String> observationVariableNames;

}
