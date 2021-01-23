package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Short description of the facility in which the study was carried out.
 */



public class BrAPIStudyGrowthFacility   {
  @JsonProperty("PUI")
  private String PUI = null;

  @JsonProperty("description")
  private String description = null;

  public BrAPIStudyGrowthFacility PUI(String PUI) {
    this.PUI = PUI;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-27) Type of growth facility - Type of growth facility in which the study was carried out, in the form of an accession number from the Crop Ontology.
   * @return PUI
  **/
  
  
    public String getPUI() {
    return PUI;
  }

  public void setPUI(String PUI) {
    this.PUI = PUI;
  }

  public BrAPIStudyGrowthFacility description(String description) {
    this.description = description;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-26) Description of growth facility - Short description of the facility in which the study was carried out.
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
    BrAPIStudyGrowthFacility studyGrowthFacility = (BrAPIStudyGrowthFacility) o;
    return Objects.equals(this.PUI, studyGrowthFacility.PUI) &&
        Objects.equals(this.description, studyGrowthFacility.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PUI, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyGrowthFacility {\n");
    
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
