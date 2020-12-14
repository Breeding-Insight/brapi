package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;


/**
 * Ontology
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class Ontology   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("authors")
  private String authors = null;

  @JsonProperty("copyright")
  private String copyright = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("documentationURL")
  private String documentationURL = null;

  @JsonProperty("licence")
  private String licence = null;

  @JsonProperty("ontologyDbId")
  private String ontologyDbId = null;

  @JsonProperty("ontologyName")
  private String ontologyName = null;

  @JsonProperty("version")
  private String version = null;

  public Ontology additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public Ontology putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Ontology authors(String authors) {
    this.authors = authors;
    return this;
  }

  /**
   * Ontology's list of authors (no specific format)
   * @return authors
  **/
  
  
    public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public Ontology copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * Ontology copyright
   * @return copyright
  **/
  
  
    public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public Ontology description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human readable description of Ontology
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Ontology documentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
    return this;
  }

  /**
   * A URL to the human readable documentation of this object
   * @return documentationURL
  **/
  
  
    public String getDocumentationURL() {
    return documentationURL;
  }

  public void setDocumentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
  }

  public Ontology licence(String licence) {
    this.licence = licence;
    return this;
  }

  /**
   * Ontology licence
   * @return licence
  **/
  
  
    public String getLicence() {
    return licence;
  }

  public void setLicence(String licence) {
    this.licence = licence;
  }

  public Ontology ontologyDbId(String ontologyDbId) {
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

  public Ontology ontologyName(String ontologyName) {
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

  public Ontology version(String version) {
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
    Ontology ontology = (Ontology) o;
    return Objects.equals(this.additionalInfo, ontology.additionalInfo) &&
        Objects.equals(this.authors, ontology.authors) &&
        Objects.equals(this.copyright, ontology.copyright) &&
        Objects.equals(this.description, ontology.description) &&
        Objects.equals(this.documentationURL, ontology.documentationURL) &&
        Objects.equals(this.licence, ontology.licence) &&
        Objects.equals(this.ontologyDbId, ontology.ontologyDbId) &&
        Objects.equals(this.ontologyName, ontology.ontologyName) &&
        Objects.equals(this.version, ontology.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, authors, copyright, description, documentationURL, licence, ontologyDbId, ontologyName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ontology {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    licence: ").append(toIndentedString(licence)).append("\n");
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
