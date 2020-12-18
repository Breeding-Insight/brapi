package org.brapi.v2.model.pheno;

import java.util.Objects;

import org.brapi.v2.model.pheno.BrAPIObservationUnitHierarchyLevel;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * ObservationUnitLevelRelationship
 */


public class BrAPIObservationUnitLevelRelationship extends BrAPIObservationUnitHierarchyLevel  {
  @JsonProperty("levelCode")
  private String levelCode = null;

  public BrAPIObservationUnitLevelRelationship levelCode(String levelCode) {
    this.levelCode = levelCode;
    return this;
  }

  /**
   * An ID code for this level tag. Identify this observation unit by each level of the hierarchy where it exists
   * @return levelCode
  **/
  
  
    public String getLevelCode() {
    return levelCode;
  }

  public void setLevelCode(String levelCode) {
    this.levelCode = levelCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnitLevelRelationship observationUnitLevelRelationship = (BrAPIObservationUnitLevelRelationship) o;
    return Objects.equals(this.levelCode, observationUnitLevelRelationship.levelCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitLevelRelationship {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    levelCode: ").append(toIndentedString(levelCode)).append("\n");
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
