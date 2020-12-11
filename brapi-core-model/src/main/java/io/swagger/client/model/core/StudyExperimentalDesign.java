package io.swagger.client.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * The experimental and statistical design full description plus a category PUI taken from crop research ontology or agronomy ontology
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class StudyExperimentalDesign   {
  @JsonProperty("PUI")
  private String PUI = null;

  @JsonProperty("description")
  private String description = null;

  public StudyExperimentalDesign PUI(String PUI) {
    this.PUI = PUI;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-23) Type of experimental design - Type of experimental  design of the study, in the form of an accession number from the Crop Ontology.
   * @return PUI
  **/
  
  
    public String getPUI() {
    return PUI;
  }

  public void setPUI(String PUI) {
    this.PUI = PUI;
  }

  public StudyExperimentalDesign description(String description) {
    this.description = description;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-22) Description of the experimental design - Short description of the experimental design, possibly including statistical design. In specific cases, e.g. legacy datasets or data computed from several studies, the experimental design can be \"unknown\"/\"NA\", \"aggregated/reduced data\", or simply 'none'.
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyExperimentalDesign studyNewRequestExperimentalDesign = (StudyExperimentalDesign) o;
    return Objects.equals(this.PUI, studyNewRequestExperimentalDesign.PUI) &&
        Objects.equals(this.description, studyNewRequestExperimentalDesign.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PUI, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyNewRequestExperimentalDesign {\n");
    
    sb.append("    PUI: ").append(toIndentedString(PUI)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
