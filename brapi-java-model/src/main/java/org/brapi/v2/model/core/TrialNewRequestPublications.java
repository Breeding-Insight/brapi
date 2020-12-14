package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * TrialNewRequestPublications
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class TrialNewRequestPublications   {
  @JsonProperty("publicationPUI")
  private String publicationPUI = null;

  @JsonProperty("publicationReference")
  private String publicationReference = null;

  public TrialNewRequestPublications publicationPUI(String publicationPUI) {
    this.publicationPUI = publicationPUI;
    return this;
  }

  /**
   * Get publicationPUI
   * @return publicationPUI
  **/
  
  
    public String getPublicationPUI() {
    return publicationPUI;
  }

  public void setPublicationPUI(String publicationPUI) {
    this.publicationPUI = publicationPUI;
  }

  public TrialNewRequestPublications publicationReference(String publicationReference) {
    this.publicationReference = publicationReference;
    return this;
  }

  /**
   * Get publicationReference
   * @return publicationReference
  **/
  
  
    public String getPublicationReference() {
    return publicationReference;
  }

  public void setPublicationReference(String publicationReference) {
    this.publicationReference = publicationReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialNewRequestPublications trialNewRequestPublications = (TrialNewRequestPublications) o;
    return Objects.equals(this.publicationPUI, trialNewRequestPublications.publicationPUI) &&
        Objects.equals(this.publicationReference, trialNewRequestPublications.publicationReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationPUI, publicationReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialNewRequestPublications {\n");
    
    sb.append("    publicationPUI: ").append(toIndentedString(publicationPUI)).append("\n");
    sb.append("    publicationReference: ").append(toIndentedString(publicationReference)).append("\n");
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
