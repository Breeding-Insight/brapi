package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReferences;
import org.brapi.v2.core.model.BrApiOntologyReference;

/**
 * Scale
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiScale {
  @JsonProperty("scaleDbId")
  private String scaleDbId;

  @JsonProperty("dataType")
  private BrApiTraitDataType dataType;

  @JsonProperty("decimalPlaces")
  private Integer decimalPlaces;

  @JsonProperty("externalReferences")
  private BrApiExternalReferences externalReferences;

  @JsonProperty("ontologyReference")
  private BrApiOntologyReference ontologyReference;

  @JsonProperty("scaleName")
  private String scaleName;

  @JsonProperty("validValues")
  private BrApiScaleValidValues validValues;

}
