package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * ShipmentForm
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPIShipmentForm   {
  @JsonProperty("fileDescription")
  private String fileDescription = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileURL")
  private String fileURL = null;

  public BrAPIShipmentForm fileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
    return this;
  }

  /**
   * The human readable long description for this form
   * @return fileDescription
  **/
  
  
    public String getFileDescription() {
    return fileDescription;
  }

  public void setFileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
  }

  public BrAPIShipmentForm fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The human readable name for this form
   * @return fileName
  **/
  
  
    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public BrAPIShipmentForm fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }

  /**
   * The URL to download this form
   * @return fileURL
  **/
  
      

    public String getFileURL() {
    return fileURL;
  }

  public void setFileURL(String fileURL) {
    this.fileURL = fileURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIShipmentForm shipmentForm = (BrAPIShipmentForm) o;
    return Objects.equals(this.fileDescription, shipmentForm.fileDescription) &&
        Objects.equals(this.fileName, shipmentForm.fileName) &&
        Objects.equals(this.fileURL, shipmentForm.fileURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileDescription, fileName, fileURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentForm {\n");
    
    sb.append("    fileDescription: ").append(toIndentedString(fileDescription)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
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
