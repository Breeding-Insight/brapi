package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * A dataFile contains a URL and the relevant file metadata to represent a file
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class DataFile   {
  @JsonProperty("fileDescription")
  private String fileDescription = null;

  @JsonProperty("fileMD5Hash")
  private String fileMD5Hash = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileSize")
  private Integer fileSize = null;

  @JsonProperty("fileType")
  private String fileType = null;

  @JsonProperty("fileURL")
  private String fileURL = null;

  public DataFile fileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
    return this;
  }

  /**
   * A human readable description of the file contents
   * @return fileDescription
  **/
  
  
    public String getFileDescription() {
    return fileDescription;
  }

  public void setFileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
  }

  public DataFile fileMD5Hash(String fileMD5Hash) {
    this.fileMD5Hash = fileMD5Hash;
    return this;
  }

  /**
   * The MD5 Hash of the file contents to be used as a check sum
   * @return fileMD5Hash
  **/
  
  
    public String getFileMD5Hash() {
    return fileMD5Hash;
  }

  public void setFileMD5Hash(String fileMD5Hash) {
    this.fileMD5Hash = fileMD5Hash;
  }

  public DataFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the file
   * @return fileName
  **/
  
  
    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DataFile fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The size of the file in bytes
   * @return fileSize
  **/
  
  
    public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public DataFile fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * The type or format of the file. Preferably MIME Type.
   * @return fileType
  **/
  
  
    public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public DataFile fileURL(String fileURL) {
    this.fileURL = fileURL;
    return this;
  }

  /**
   * The absolute URL where the file is located
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
    DataFile dataFile = (DataFile) o;
    return Objects.equals(this.fileDescription, dataFile.fileDescription) &&
        Objects.equals(this.fileMD5Hash, dataFile.fileMD5Hash) &&
        Objects.equals(this.fileName, dataFile.fileName) &&
        Objects.equals(this.fileSize, dataFile.fileSize) &&
        Objects.equals(this.fileType, dataFile.fileType) &&
        Objects.equals(this.fileURL, dataFile.fileURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileDescription, fileMD5Hash, fileName, fileSize, fileType, fileURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFile {\n");
    
    sb.append("    fileDescription: ").append(toIndentedString(fileDescription)).append("\n");
    sb.append("    fileMD5Hash: ").append(toIndentedString(fileMD5Hash)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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
