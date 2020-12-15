package org.brapi.v2.model.pheno;

import java.util.Objects;

import org.brapi.v2.model.pheno.BrAPIObservationNewRequest;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Observation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservation extends BrAPIObservationNewRequest  {
  @JsonProperty("observationDbId")
  private String observationDbId = null;

  public BrAPIObservation observationDbId(String observationDbId) {
    this.observationDbId = observationDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies an observation
   * @return observationDbId
  **/
  
  
    public String getObservationDbId() {
    return observationDbId;
  }

  public void setObservationDbId(String observationDbId) {
    this.observationDbId = observationDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservation observation = (BrAPIObservation) o;
    return Objects.equals(this.observationDbId, observation.observationDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Observation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    observationDbId: ").append(toIndentedString(observationDbId)).append("\n");
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
