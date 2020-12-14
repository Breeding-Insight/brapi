package org.brapi.v2.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;




/**
 * OntologyReferenceDocumentationLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class OntologyReferenceDocumentationLinks   {
  @JsonProperty("URL")
  private String URL = null;

  @JsonProperty("type")
  private OntologyReferenceTypeEnum type = null;

  public OntologyReferenceDocumentationLinks URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * Get URL
   * @return URL
  **/
  
  
    public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public OntologyReferenceDocumentationLinks type(OntologyReferenceTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  
  
    public OntologyReferenceTypeEnum getType() {
    return type;
  }

  public void setType(OntologyReferenceTypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OntologyReferenceDocumentationLinks ontologyReferenceDocumentationLinks = (OntologyReferenceDocumentationLinks) o;
    return Objects.equals(this.URL, ontologyReferenceDocumentationLinks.URL) &&
        Objects.equals(this.type, ontologyReferenceDocumentationLinks.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyReferenceDocumentationLinks {\n");
    
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
