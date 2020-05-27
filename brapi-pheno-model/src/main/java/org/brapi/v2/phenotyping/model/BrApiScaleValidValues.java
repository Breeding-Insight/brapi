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
  @Valid
  private List<BrApiScaleCategories> categories;

  private Integer max;

  private Integer min;

}
