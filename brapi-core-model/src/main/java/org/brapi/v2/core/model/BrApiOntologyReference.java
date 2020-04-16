package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * MIAPPE V1.1  (DM-85) Variable accession number - Accession number of the variable in the Crop Ontology  (DM-87) Trait accession number - Accession number of the trait in a suitable controlled vocabulary (Crop Ontology, Trait Ontology).  (DM-89) Method accession number - Accession number of the method in a suitable controlled vocabulary (Crop Ontology, Trait Ontology).  (DM-93) Scale accession number - Accession number of the scale in a suitable controlled vocabulary (Crop Ontology).
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiOntologyReference {
  @JsonProperty("documentationLinks")
  @Valid
  private List<BrApiOntologyReferenceDocumentationLinks> documentationLinks;

  @JsonProperty("ontologyDbId")
  private String ontologyDbId;

  @JsonProperty("ontologyName")
  private String ontologyName;

  @JsonProperty("version")
  private String version;

}
