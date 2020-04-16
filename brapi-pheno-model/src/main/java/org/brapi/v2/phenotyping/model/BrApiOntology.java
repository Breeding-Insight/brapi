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
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("authors")
  private String authors;

  @JsonProperty("copyright")
  private String copyright;

  @JsonProperty("description")
  private String description;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("licence")
  private String licence;

  @JsonProperty("ontologyDbId")
  private String ontologyDbId;

  @JsonProperty("ontologyName")
  private String ontologyName;

  @JsonProperty("version")
  private String version;

}
