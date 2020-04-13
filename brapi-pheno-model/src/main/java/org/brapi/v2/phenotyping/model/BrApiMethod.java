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
  @JsonProperty("methodDbId")
  private String methodDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("bibliographicalReference")
  private String bibliographicalReference;

  @JsonProperty("description")
  private String description;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("formula")
  private String formula;

  @JsonProperty("methodClass")
  private String methodClass;

  @JsonProperty("methodName")
  private String methodName;

  @JsonProperty("ontologyReference")
  private BrApiOntologyReference ontologyReference;

}
