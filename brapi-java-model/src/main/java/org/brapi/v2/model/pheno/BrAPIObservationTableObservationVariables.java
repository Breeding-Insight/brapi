package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * ObservationTableObservationVariables
 */


public class BrAPIObservationTableObservationVariables   {
  @JsonProperty("observationVariableDbId")
  private String observationVariableDbId = null;

  @JsonProperty("observationVariableName")
  private String observationVariableName = null;

  public BrAPIObservationTableObservationVariables observationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
    return this;
  }

  /**
   * Variable unique identifier
   * @return observationVariableDbId
  **/
  
  
    public String getObservationVariableDbId() {
    return observationVariableDbId;
  }

  public void setObservationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
  }

  public BrAPIObservationTableObservationVariables observationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
    return this;
  }

  /**
   * Variable name (usually a short name)
   * @return observationVariableName
  **/
  
  
    public String getObservationVariableName() {
    return observationVariableName;
  }

  public void setObservationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationTableObservationVariables observationTableObservationVariables = (BrAPIObservationTableObservationVariables) o;
    return Objects.equals(this.observationVariableDbId, observationTableObservationVariables.observationVariableDbId) &&
        Objects.equals(this.observationVariableName, observationTableObservationVariables.observationVariableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationVariableDbId, observationVariableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationTableObservationVariables {\n");
    
    sb.append("    observationVariableDbId: ").append(toIndentedString(observationVariableDbId)).append("\n");
    sb.append("    observationVariableName: ").append(toIndentedString(observationVariableName)).append("\n");
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
