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
 * Method
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiMethod {
  private String methodDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private String bibliographicalReference;

  private String description;

  private List<BrApiExternalReference> externalReferences;

  private String formula;

  private String methodClass;

  private String methodName;

  private BrApiOntologyReference ontologyReference;

}
