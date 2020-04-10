package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ScaleBaseClassValidValuesCategories
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiScaleCategories {
  @JsonProperty("label")
  private String label;

  @JsonProperty("value")
  private String value;

}
