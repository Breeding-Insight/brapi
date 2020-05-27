package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Scale
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiScale {
  @JsonProperty("scaleDbId")
  private String scaleDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("dataType")
  private BrApiTraitDataType dataType;

  @JsonProperty("decimalPlaces")
  private Integer decimalPlaces;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("ontologyReference")
  private BrApiOntologyReference ontologyReference;

  @JsonProperty("scaleName")
  private String scaleName;

  @JsonProperty("validValues")
  private BrApiScaleValidValues validValues;

}
