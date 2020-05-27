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
  private String scaleDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private BrApiTraitDataType dataType;

  private Integer decimalPlaces;

  private List<BrApiExternalReference> externalReferences;

  private BrApiOntologyReference ontologyReference;

  private String scaleName;

  private BrApiScaleValidValues validValues;

}
