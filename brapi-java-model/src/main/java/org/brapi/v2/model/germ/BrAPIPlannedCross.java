package org.brapi.v2.model.germ;

import java.util.Objects;

import org.brapi.v2.model.germ.BrAPIPlannedCrossNewRequest;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * PlannedCross
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIPlannedCross extends BrAPIPlannedCrossNewRequest  {
  @JsonProperty("plannedCrossDbId")
  private String plannedCrossDbId = null;

  public BrAPIPlannedCross plannedCrossDbId(String plannedCrossDbId) {
    this.plannedCrossDbId = plannedCrossDbId;
    return this;
  }

  /**
   * the unique identifier for a cross
   * @return plannedCrossDbId
  **/
  
  
    public String getPlannedCrossDbId() {
    return plannedCrossDbId;
  }

  public void setPlannedCrossDbId(String plannedCrossDbId) {
    this.plannedCrossDbId = plannedCrossDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIPlannedCross plannedCross = (BrAPIPlannedCross) o;
    return Objects.equals(this.plannedCrossDbId, plannedCross.plannedCrossDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedCrossDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlannedCross {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    plannedCrossDbId: ").append(toIndentedString(plannedCrossDbId)).append("\n");
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
