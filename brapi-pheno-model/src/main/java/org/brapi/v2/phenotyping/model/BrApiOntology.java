package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.Map;

/**
 * Ontology
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiOntology {
  @Valid
  private Map<String, String> additionalInfo;

  private String authors;

  private String copyright;

  private String description;

  private String documentationURL;

  private String licence;

  private String ontologyDbId;

  private String ontologyName;

  private String version;

}
