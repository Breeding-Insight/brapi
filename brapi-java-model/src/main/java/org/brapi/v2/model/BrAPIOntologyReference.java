package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIOntologyReferenceDocumentationLinks;

/**
 * MIAPPE V1.1  (DM-85) Variable accession number - Accession number of the variable in the Crop Ontology  (DM-87) Trait accession number - Accession number of the trait in a suitable controlled vocabulary (Crop Ontology, Trait Ontology).  (DM-89) Method accession number - Accession number of the method in a suitable controlled vocabulary (Crop Ontology, Trait Ontology).  (DM-93) Scale accession number - Accession number of the scale in a suitable controlled vocabulary (Crop Ontology).
 */



public class BrAPIOntologyReference   {
  @JsonProperty("documentationLinks")
  @Valid
  private List<BrAPIOntologyReferenceDocumentationLinks> documentationLinks = null;

  @JsonProperty("ontologyDbId")
  private String ontologyDbId = null;

  @JsonProperty("ontologyName")
  private String ontologyName = null;

  @JsonProperty("version")
  private String version = null;

  public BrAPIOntologyReference documentationLinks(List<BrAPIOntologyReferenceDocumentationLinks> documentationLinks) {
    this.documentationLinks = documentationLinks;
    return this;
  }

  public BrAPIOntologyReference addDocumentationLinksItem(BrAPIOntologyReferenceDocumentationLinks documentationLinksItem) {
    if (this.documentationLinks == null) {
      this.documentationLinks = new ArrayList<BrAPIOntologyReferenceDocumentationLinks>();
    }
    this.documentationLinks.add(documentationLinksItem);
    return this;
  }

  /**
   * links to various ontology documentation
   * @return documentationLinks
  **/
  
      @Valid
    public List<BrAPIOntologyReferenceDocumentationLinks> getDocumentationLinks() {
    return documentationLinks;
  }

  public void setDocumentationLinks(List<BrAPIOntologyReferenceDocumentationLinks> documentationLinks) {
    this.documentationLinks = documentationLinks;
  }

  public BrAPIOntologyReference ontologyDbId(String ontologyDbId) {
    this.ontologyDbId = ontologyDbId;
    return this;
  }

  /**
   * Ontology database unique identifier
   * @return ontologyDbId
  **/
  
      

    public String getOntologyDbId() {
    return ontologyDbId;
  }

  public void setOntologyDbId(String ontologyDbId) {
    this.ontologyDbId = ontologyDbId;
  }

  public BrAPIOntologyReference ontologyName(String ontologyName) {
    this.ontologyName = ontologyName;
    return this;
  }

  /**
   * Ontology name
   * @return ontologyName
  **/
  
      

    public String getOntologyName() {
    return ontologyName;
  }

  public void setOntologyName(String ontologyName) {
    this.ontologyName = ontologyName;
  }

  public BrAPIOntologyReference version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Ontology version (no specific format)
   * @return version
  **/
  
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIOntologyReference ontologyReference = (BrAPIOntologyReference) o;
    return Objects.equals(this.documentationLinks, ontologyReference.documentationLinks) &&
        Objects.equals(this.ontologyDbId, ontologyReference.ontologyDbId) &&
        Objects.equals(this.ontologyName, ontologyReference.ontologyName) &&
        Objects.equals(this.version, ontologyReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentationLinks, ontologyDbId, ontologyName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyReference {\n");
    
    sb.append("    documentationLinks: ").append(toIndentedString(documentationLinks)).append("\n");
    sb.append("    ontologyDbId: ").append(toIndentedString(ontologyDbId)).append("\n");
    sb.append("    ontologyName: ").append(toIndentedString(ontologyName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
