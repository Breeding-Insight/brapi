package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * EventEventParameters
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiEventParameters {
  @JsonProperty("key")
  private String key;

  @JsonProperty("rdfValue")
  private String rdfValue;

  @JsonProperty("value")
  private String value;

}
