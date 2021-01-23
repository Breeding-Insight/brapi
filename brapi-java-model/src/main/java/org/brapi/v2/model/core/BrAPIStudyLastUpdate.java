package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.time.OffsetDateTime;

import javax.validation.Valid;

/**
 * The date and time when this study was last modified
 */



public class BrAPIStudyLastUpdate   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("version")
  private String version = null;

  public BrAPIStudyLastUpdate timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public BrAPIStudyLastUpdate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
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
    BrAPIStudyLastUpdate studyLastUpdate = (BrAPIStudyLastUpdate) o;
    return Objects.equals(this.timestamp, studyLastUpdate.timestamp) &&
        Objects.equals(this.version, studyLastUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyLastUpdate {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
