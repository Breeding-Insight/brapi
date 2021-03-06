package org.brapi.v2.model.geno.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonValue;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * Request object structure to submit plate data to a vendor
 */



public class BrAPIVendorPlateSubmissionRequest   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("numberOfSamples")
  private Integer numberOfSamples = null;

  @JsonProperty("plates")
  @Valid
  private List<BrAPIVendorPlateSubmissionRequestPlates> plates = new ArrayList<BrAPIVendorPlateSubmissionRequestPlates>();

  /**
   * The type of Samples being submitted
   */
  public enum SampleTypeEnum {
    DNA("DNA"),
    
    RNA("RNA"),
    
    TISSUE("Tissue");

    private String value;

    SampleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SampleTypeEnum fromValue(String text) {
      for (SampleTypeEnum b : SampleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sampleType")
  private SampleTypeEnum sampleType = null;

  public BrAPIVendorPlateSubmissionRequest clientId(String clientId) {
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

  public BrAPIVendorPlateSubmissionRequest numberOfSamples(Integer numberOfSamples) {
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

  public BrAPIVendorPlateSubmissionRequest plates(List<BrAPIVendorPlateSubmissionRequestPlates> plates) {
    this.plates = plates;
    return this;
  }

  public BrAPIVendorPlateSubmissionRequest addPlatesItem(BrAPIVendorPlateSubmissionRequestPlates platesItem) {
    this.plates.add(platesItem);
    return this;
  }

  /**
   * Array of new plates to be submitted to a vendor
   * @return plates
  **/
  
      
    @Valid
    public List<BrAPIVendorPlateSubmissionRequestPlates> getPlates() {
    return plates;
  }

  public void setPlates(List<BrAPIVendorPlateSubmissionRequestPlates> plates) {
    this.plates = plates;
  }

  public BrAPIVendorPlateSubmissionRequest sampleType(SampleTypeEnum sampleType) {
    this.sampleType = sampleType;
    return this;
  }

  /**
   * The type of Samples being submitted
   * @return sampleType
  **/
  
      

    public SampleTypeEnum getSampleType() {
    return sampleType;
  }

  public void setSampleType(SampleTypeEnum sampleType) {
    this.sampleType = sampleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorPlateSubmissionRequest vendorPlateSubmissionRequest = (BrAPIVendorPlateSubmissionRequest) o;
    return Objects.equals(this.clientId, vendorPlateSubmissionRequest.clientId) &&
        Objects.equals(this.numberOfSamples, vendorPlateSubmissionRequest.numberOfSamples) &&
        Objects.equals(this.plates, vendorPlateSubmissionRequest.plates) &&
        Objects.equals(this.sampleType, vendorPlateSubmissionRequest.sampleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, numberOfSamples, plates, sampleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlateSubmissionRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    numberOfSamples: ").append(toIndentedString(numberOfSamples)).append("\n");
    sb.append("    plates: ").append(toIndentedString(plates)).append("\n");
    sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
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
