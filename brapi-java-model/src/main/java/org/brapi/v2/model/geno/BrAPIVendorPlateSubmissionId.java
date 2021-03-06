package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * Response to an order request
 */



public class BrAPIVendorPlateSubmissionId   {
  @JsonProperty("submissionId")
  private String submissionId = null;

  public BrAPIVendorPlateSubmissionId submissionId(String submissionId) {
    this.submissionId = submissionId;
    return this;
  }

  /**
   * A unique, alpha-numeric ID which identifies a set of plates which have been successfully submitted.
   * @return submissionId
  **/
  
      

    public String getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorPlateSubmissionId vendorPlateSubmissionId = (BrAPIVendorPlateSubmissionId) o;
    return Objects.equals(this.submissionId, vendorPlateSubmissionId.submissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlateSubmissionId {\n");
    
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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
