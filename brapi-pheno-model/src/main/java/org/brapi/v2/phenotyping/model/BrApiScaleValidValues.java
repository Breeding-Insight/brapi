package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * ScaleBaseClassValidValues
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiScaleValidValues {
  @JsonProperty("categories")
  @Valid
  private List<BrApiScaleCategories> categories;

  @JsonProperty("max")
  private Integer max;

  @JsonProperty("min")
  private Integer min;

}
