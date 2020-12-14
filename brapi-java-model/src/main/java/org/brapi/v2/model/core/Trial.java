package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * Trial
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class Trial extends TrialNewRequest  {
  @JsonProperty("trialDbId")
  private String trialDbId = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trial trial = (Trial) o;
    return Objects.equals(this.trialDbId, trial.trialDbId) &&
        super.equals(o);
  }

  /**
   * The ID which uniquely identifies a trial  MIAPPE V1.1 (DM-2) Investigation unique ID - Identifier comprising the unique name of the institution/database hosting the submission of the investigation data, and the accession number of the investigation in that institution.
   * @return trialDbId
  **/
  
      

    public String getTrialDbId() {
    return trialDbId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialDbId, super.hashCode());
  }


  public void setTrialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trial {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Trial trialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
    return this;
  }
}
