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
  private String key;

  private String rdfValue;

  private String value;

}
