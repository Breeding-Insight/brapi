package org.brapi.v2.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;




/**
 * OntologyReferenceDocumentationLinks
 */


public class BrAPIOntologyReferenceDocumentationLinks   {
  @JsonProperty("URL")
  private String URL = null;

  @JsonProperty("type")
  private BrAPIOntologyReferenceTypeEnum type = null;

  public BrAPIOntologyReferenceDocumentationLinks URL(String URL) {
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

  public BrAPIOntologyReferenceDocumentationLinks type(BrAPIOntologyReferenceTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  
  
    public BrAPIOntologyReferenceTypeEnum getType() {
    return type;
  }

  public void setType(BrAPIOntologyReferenceTypeEnum type) {
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
    BrAPIOntologyReferenceDocumentationLinks ontologyReferenceDocumentationLinks = (BrAPIOntologyReferenceDocumentationLinks) o;
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
