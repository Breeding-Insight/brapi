package io.swagger.client.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * VendorPlate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class VendorPlate   {
  @JsonProperty("clientPlateBarcode")
  private String clientPlateBarcode = null;

  @JsonProperty("clientPlateId")
  private String clientPlateId = null;

  @JsonProperty("sampleSubmissionFormat")
  private PlateFormat sampleSubmissionFormat = null;

  @JsonProperty("samples")
  @Valid
  private List<VendorSample> samples = null;

  public VendorPlate clientPlateBarcode(String clientPlateBarcode) {
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

  public VendorPlate clientPlateId(String clientPlateId) {
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

  public VendorPlate sampleSubmissionFormat(PlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
    return this;
  }

  /**
   * Get sampleSubmissionFormat
   * @return sampleSubmissionFormat
  **/
  
  
    @Valid
    public PlateFormat getSampleSubmissionFormat() {
    return sampleSubmissionFormat;
  }

  public void setSampleSubmissionFormat(PlateFormat sampleSubmissionFormat) {
    this.sampleSubmissionFormat = sampleSubmissionFormat;
  }

  public VendorPlate samples(List<VendorSample> samples) {
    this.samples = samples;
    return this;
  }

  public VendorPlate addSamplesItem(VendorSample samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<VendorSample>();
    }
    this.samples.add(samplesItem);
    return this;
  }

  /**
   * Get samples
   * @return samples
  **/
  
      @Valid
    public List<VendorSample> getSamples() {
    return samples;
  }

  public void setSamples(List<VendorSample> samples) {
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
    VendorPlate vendorPlate = (VendorPlate) o;
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
