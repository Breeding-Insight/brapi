package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * Response of a plate submission
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPIVendorPlateSubmission   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("numberOfSamples")
  private Integer numberOfSamples = null;

  @JsonProperty("plates")
  @Valid
  private List<BrAPIVendorPlateSubmissionPlates> plates = new ArrayList<BrAPIVendorPlateSubmissionPlates>();

  public BrAPIVendorPlateSubmission clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the contract, billing, and contact info.
   * @return clientId
  **/
  
      

    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public BrAPIVendorPlateSubmission numberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
    return this;
  }

  /**
   * The total number of samples contained in this request. Used for billing and basic validation of the request.
   * @return numberOfSamples
  **/
  
      

    public Integer getNumberOfSamples() {
    return numberOfSamples;
  }

  public void setNumberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
  }

  public BrAPIVendorPlateSubmission plates(List<BrAPIVendorPlateSubmissionPlates> plates) {
    this.plates = plates;
    return this;
  }

  public BrAPIVendorPlateSubmission addPlatesItem(BrAPIVendorPlateSubmissionPlates platesItem) {
    this.plates.add(platesItem);
    return this;
  }

  /**
   * Array of new plates to be submitted to a vendor
   * @return plates
  **/
  
      
    @Valid
    public List<BrAPIVendorPlateSubmissionPlates> getPlates() {
    return plates;
  }

  public void setPlates(List<BrAPIVendorPlateSubmissionPlates> plates) {
    this.plates = plates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorPlateSubmission vendorPlateSubmission = (BrAPIVendorPlateSubmission) o;
    return Objects.equals(this.clientId, vendorPlateSubmission.clientId) &&
        Objects.equals(this.numberOfSamples, vendorPlateSubmission.numberOfSamples) &&
        Objects.equals(this.plates, vendorPlateSubmission.plates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, numberOfSamples, plates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlateSubmission {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    numberOfSamples: ").append(toIndentedString(numberOfSamples)).append("\n");
    sb.append("    plates: ").append(toIndentedString(plates)).append("\n");
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
