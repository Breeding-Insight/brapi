package org.brapi.v2.model.geno;

import java.util.Objects;

import org.brapi.v2.model.BrAPIWSMIMEDataTypes;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * Each &#x27;availableFormat&#x27; object is a pairing of dataFormat and fileFormat. These must be communicated in pairs because they are not independant parameters and sometimes one influences the other.
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPIVariantSetAvailableFormats   {

  @JsonProperty("dataFormat")
  private BrAPIGenoFileDataFormatEnum dataFormat = null;

  @JsonProperty("fileFormat")
  private BrAPIWSMIMEDataTypes fileFormat = null;

  @JsonProperty("fileURL")
  private String fileURL = null;

  public BrAPIVariantSetAvailableFormats dataFormat(BrAPIGenoFileDataFormatEnum dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  /**
   * dataFormat defines the structure of the data within a file (ie DartSeq, VCF, Hapmap, tabular, etc)
   * @return dataFormat
  **/
  
  
    public BrAPIGenoFileDataFormatEnum getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(BrAPIGenoFileDataFormatEnum dataFormat) {
    this.dataFormat = dataFormat;
  }

  public BrAPIVariantSetAvailableFormats fileFormat(BrAPIWSMIMEDataTypes fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.
   * @return fileFormat
  **/
  
  
    public BrAPIWSMIMEDataTypes getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(BrAPIWSMIMEDataTypes fileFormat) {
    this.fileFormat = fileFormat;
  }

  public BrAPIVariantSetAvailableFormats fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }

  /**
   * A URL which indicates the location of the file version of this VariantSet. Could be a static file URL or an API endpoint which generates the file.
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
    BrAPIVariantSetAvailableFormats variantSetAvailableFormats = (BrAPIVariantSetAvailableFormats) o;
    return Objects.equals(this.dataFormat, variantSetAvailableFormats.dataFormat) &&
        Objects.equals(this.fileFormat, variantSetAvailableFormats.fileFormat) &&
        Objects.equals(this.fileURL, variantSetAvailableFormats.fileURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFormat, fileFormat, fileURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSetAvailableFormats {\n");
    
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
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
