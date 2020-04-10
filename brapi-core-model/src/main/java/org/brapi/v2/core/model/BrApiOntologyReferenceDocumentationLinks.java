package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * OntologyReferenceDocumentationLinks
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiOntologyReferenceDocumentationLinks {
  @JsonProperty("URL")
  private String URL;

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OBO,
    RDF,
    WEBPAGE;
  }

}
