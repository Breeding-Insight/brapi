package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * VendorPlate
 */


public class BrAPIVendorPlate   {
  @JsonProperty("clientPlateBarcode")
  private String clientPlateBarcode = null;

  @JsonProperty("clientPlateId")
  private String clientPlateId = null;

  @JsonProperty("sampleSubmissionFormat")
  private BrAPIPlateFormat sampleSubmissionFormat = null;

  @JsonProperty("samples")
  @Valid
  private List<BrAPIVendorSample> samples = null;

  public BrAPIVendorPlate clientPlateBarcode(String clientPlateBarcode) {
    this.clientPlateBarcode = clientPlateBarcode;
    return this;
  }

  /**
   * (Optional) The value of the bar code attached to this plate
   * @return clientPlateBarcode
  **/
  
  
    public String getClientPlateBarcode() {
    return clientPlateBarcode;
  }

  public void setClientPlateBarcode(String clientPlateBarcode) {
    this.clientPlateBarcode = clientPlateBarcode;
  }

  public BrAPIVendorPlate clientPlateId(String clientPlateId) {
    this.clientPlateId = clientPlateId;
    return this;
  }

  /**
   * The ID which uniquely identifies this plate to the client making the request
   * @return clientPlateId
  **/
  
  
    public String getClientPlateId() {
    return clientPlateId;
  }

  public void setClientPlateId(String clientPlateId) {
    this.clientPlateId = clientPlateId;
  }

  public BrAPIVendorPlate sampleSubmissionFormat(BrAPIPlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
    return this;
  }

  /**
   * Get sampleSubmissionFormat
   * @return sampleSubmissionFormat
  **/
  
  
    @Valid
    public BrAPIPlateFormat getSampleSubmissionFormat() {
    return sampleSubmissionFormat;
  }

  public void setSampleSubmissionFormat(BrAPIPlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
  }

  public BrAPIVendorPlate samples(List<BrAPIVendorSample> samples) {
    this.samples = samples;
    return this;
  }

  public BrAPIVendorPlate addSamplesItem(BrAPIVendorSample samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<BrAPIVendorSample>();
    }
    this.samples.add(samplesItem);
    return this;
  }

  /**
   * Get samples
   * @return samples
  **/
  
      @Valid
    public List<BrAPIVendorSample> getSamples() {
    return samples;
  }

  public void setSamples(List<BrAPIVendorSample> samples) {
    this.samples = samples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorPlate vendorPlate = (BrAPIVendorPlate) o;
    return Objects.equals(this.clientPlateBarcode, vendorPlate.clientPlateBarcode) &&
        Objects.equals(this.clientPlateId, vendorPlate.clientPlateId) &&
        Objects.equals(this.sampleSubmissionFormat, vendorPlate.sampleSubmissionFormat) &&
        Objects.equals(this.samples, vendorPlate.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientPlateBarcode, clientPlateId, sampleSubmissionFormat, samples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorPlate {\n");
    
    sb.append("    clientPlateBarcode: ").append(toIndentedString(clientPlateBarcode)).append("\n");
    sb.append("    clientPlateId: ").append(toIndentedString(clientPlateId)).append("\n");
    sb.append("    sampleSubmissionFormat: ").append(toIndentedString(sampleSubmissionFormat)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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
