package org.brapi.v2.model.germ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

import javax.validation.Valid;


/**
 * CrossingProject
 */


public class BrAPICrossingProject  {
  @JsonProperty("crossingProjectDbId")
  private String crossingProjectDbId = null;

  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("crossingProjectDescription")
  private String crossingProjectDescription = null;

  @JsonProperty("crossingProjectName")
  private String crossingProjectName = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

  @JsonProperty("programName")
  private String programName = null;

  private final transient Gson gson = new Gson();

  public BrAPICrossingProject crossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
    return this;
  }

  /**
   * the unique identifier for a crossing project
   * @return crossingProjectDbId
  **/
  
  
    public String getCrossingProjectDbId() {
    return crossingProjectDbId;
  }

  public void setCrossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
  }

  public BrAPICrossingProject additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPICrossingProject putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new JsonObject();
    }
    JsonElement newElement = gson.toJsonTree(additionalInfoItem);
    this.additionalInfo.add(key, newElement);
    return this;
  }

  /**
   * Additional arbitrary info
   *
   * @return additionalInfo
   **/


  public JsonObject getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPICrossingProject commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

  /**
   * the common name of a crop (for multi-crop systems)
   *
   * @return commonCropName
   **/


  public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public BrAPICrossingProject crossingProjectDescription(String crossingProjectDescription) {
    this.crossingProjectDescription = crossingProjectDescription;
    return this;
  }

  /**
   * the description for a crossing project
   *
   * @return crossingProjectDescription
   **/


  public String getCrossingProjectDescription() {
    return crossingProjectDescription;
  }

  public void setCrossingProjectDescription(String crossingProjectDescription) {
    this.crossingProjectDescription = crossingProjectDescription;
  }

  public BrAPICrossingProject crossingProjectName(String crossingProjectName) {
    this.crossingProjectName = crossingProjectName;
    return this;
  }

  /**
   * the human readable name for a crossing project
   *
   * @return crossingProjectName
   **/


  public String getCrossingProjectName() {
    return crossingProjectName;
  }

  public void setCrossingProjectName(String crossingProjectName) {
    this.crossingProjectName = crossingProjectName;
  }

  public BrAPICrossingProject externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   *
   * @return externalReferences
   **/


  @Valid
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPICrossingProject programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

  /**
   * the unique identifier for a program
   *
   * @return programDbId
   **/


  public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public BrAPICrossingProject programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * the human readable name for a program
   *
   * @return programName
   **/


  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPICrossingProject crossingProject = (BrAPICrossingProject) o;
    return Objects.equals(this.crossingProjectDbId, crossingProject.crossingProjectDbId) &&
            Objects.equals(this.commonCropName, crossingProject.commonCropName)
            && Objects.equals(this.crossingProjectDescription, crossingProject.crossingProjectDescription)
            && Objects.equals(this.crossingProjectName, crossingProject.crossingProjectName)
            && Objects.equals(this.externalReferences, crossingProject.externalReferences)
            && Objects.equals(this.programDbId, crossingProject.programDbId)
            && Objects.equals(this.programName, crossingProject.programName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossingProjectDbId, commonCropName, crossingProjectDescription, crossingProjectName, externalReferences,
                        programDbId, programName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossingProject {\n");
    sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    crossingProjectDescription: ").append(toIndentedString(crossingProjectDescription)).append("\n");
    sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
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
