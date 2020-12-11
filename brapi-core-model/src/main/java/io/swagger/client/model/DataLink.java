package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * DataLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class DataLink   {
  @JsonProperty("dataFormat")
  private String dataFormat = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fileFormat")
  private String fileFormat = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("provenance")
  private String provenance = null;

  @JsonProperty("scientificType")
  private String scientificType = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("version")
  private String version = null;

  public DataLink dataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  /**
   * The structure of the data within a file. For example - VCF, table, image archive, multispectral image archives in EDAM ontology (used in Galaxy)
   * @return dataFormat
  **/
  
  
    public String getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
  }

  public DataLink description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The general description of this data link
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataLink fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * The MIME type of the file (ie text/csv, application/excel, application/zip).
   * @return fileFormat
  **/
  
  
    public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public DataLink name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the external data link  MIAPPE V1.1 (DM-38) Data file description - Description of the format of the data file. May be a standard file format name, or a description of organization of the data in a tabular file.
   * @return name
  **/
  
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataLink provenance(String provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * The description of the origin or ownership of this linked data. Could be a formal reference to software, method, or workflow.
   * @return provenance
  **/
  
  
    public String getProvenance() {
    return provenance;
  }

  public void setProvenance(String provenance) {
    this.provenance = provenance;
  }

  public DataLink scientificType(String scientificType) {
    this.scientificType = scientificType;
    return this;
  }

  /**
   * The general type of data. For example- Genotyping, Phenotyping raw data, Phenotyping reduced data, Environmental, etc
   * @return scientificType
  **/
  
  
    public String getScientificType() {
    return scientificType;
  }

  public void setScientificType(String scientificType) {
    this.scientificType = scientificType;
  }

  public DataLink url(String url) {
    this.url = url;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-37) Data file link - Link to the data file (or digital object) in a public database or in a persistent institutional repository; or identifier of the data file when submitted together with the MIAPPE submission.
   * @return url
  **/
  
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DataLink version(String version) {
    this.version = version;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-39) Data file version - The version of the dataset (the actual data).
   * @return version
  **/
  
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataLink dataLink = (DataLink) o;
    return Objects.equals(this.dataFormat, dataLink.dataFormat) &&
        Objects.equals(this.description, dataLink.description) &&
        Objects.equals(this.fileFormat, dataLink.fileFormat) &&
        Objects.equals(this.name, dataLink.name) &&
        Objects.equals(this.provenance, dataLink.provenance) &&
        Objects.equals(this.scientificType, dataLink.scientificType) &&
        Objects.equals(this.url, dataLink.url) &&
        Objects.equals(this.version, dataLink.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFormat, description, fileFormat, name, provenance, scientificType, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataLink {\n");
    
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    scientificType: ").append(toIndentedString(scientificType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
