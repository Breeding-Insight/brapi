package org.brapi.v2.model.germ;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.germ.BrAPICrossParent;

/**
 * PlannedCrossNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIPlannedCrossNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("crossType")
  private BrAPICrossType crossType = null;

  @JsonProperty("crossingProjectDbId")
  private String crossingProjectDbId = null;

  @JsonProperty("crossingProjectName")
  private String crossingProjectName = null;

  @JsonProperty("externalReferences")
  private BrAPIExternalReferenceList externalReferences = null;

  @JsonProperty("parent1")
  private BrAPICrossParent parent1 = null;

  @JsonProperty("parent2")
  private BrAPICrossParent parent2 = null;

  @JsonProperty("plannedCrossName")
  private String plannedCrossName = null;

  public BrAPIPlannedCrossNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIPlannedCrossNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIPlannedCrossNewRequest crossType(BrAPICrossType crossType) {
    this.crossType = crossType;
    return this;
  }

  /**
   * the type of cross
   * @return crossType
  **/
  
  
    public BrAPICrossType getCrossType() {
    return crossType;
  }

  public void setCrossType(BrAPICrossType crossType) {
    this.crossType = crossType;
  }

  public BrAPIPlannedCrossNewRequest crossingProjectDbId(String crossingProjectDbId) {
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

  public BrAPIPlannedCrossNewRequest crossingProjectName(String crossingProjectName) {
    this.crossingProjectName = crossingProjectName;
    return this;
  }

  /**
   * the human readable name for a crossing project
   * @return crossingProjectName
  **/
  
  
    public String getCrossingProjectName() {
    return crossingProjectName;
  }

  public void setCrossingProjectName(String crossingProjectName) {
    this.crossingProjectName = crossingProjectName;
  }

  public BrAPIPlannedCrossNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public BrAPIExternalReferenceList getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPIPlannedCrossNewRequest parent1(BrAPICrossParent parent1) {
    this.parent1 = parent1;
    return this;
  }

  /**
   * Get parent1
   * @return parent1
  **/
  
  
    @Valid
    public BrAPICrossParent getParent1() {
    return parent1;
  }

  public void setParent1(BrAPICrossParent parent1) {
    this.parent1 = parent1;
  }

  public BrAPIPlannedCrossNewRequest parent2(BrAPICrossParent parent2) {
    this.parent2 = parent2;
    return this;
  }

  /**
   * Get parent2
   * @return parent2
  **/
  
  
    @Valid
    public BrAPICrossParent getParent2() {
    return parent2;
  }

  public void setParent2(BrAPICrossParent parent2) {
    this.parent2 = parent2;
  }

  public BrAPIPlannedCrossNewRequest plannedCrossName(String plannedCrossName) {
    this.plannedCrossName = plannedCrossName;
    return this;
  }

  /**
   * the human readable name for a cross
   * @return plannedCrossName
  **/
  
  
    public String getPlannedCrossName() {
    return plannedCrossName;
  }

  public void setPlannedCrossName(String plannedCrossName) {
    this.plannedCrossName = plannedCrossName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIPlannedCrossNewRequest plannedCrossNewRequest = (BrAPIPlannedCrossNewRequest) o;
    return Objects.equals(this.additionalInfo, plannedCrossNewRequest.additionalInfo) &&
        Objects.equals(this.crossType, plannedCrossNewRequest.crossType) &&
        Objects.equals(this.crossingProjectDbId, plannedCrossNewRequest.crossingProjectDbId) &&
        Objects.equals(this.crossingProjectName, plannedCrossNewRequest.crossingProjectName) &&
        Objects.equals(this.externalReferences, plannedCrossNewRequest.externalReferences) &&
        Objects.equals(this.parent1, plannedCrossNewRequest.parent1) &&
        Objects.equals(this.parent2, plannedCrossNewRequest.parent2) &&
        Objects.equals(this.plannedCrossName, plannedCrossNewRequest.plannedCrossName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, crossType, crossingProjectDbId, crossingProjectName, externalReferences, parent1, parent2, plannedCrossName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlannedCrossNewRequest {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
    sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
    sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    parent1: ").append(toIndentedString(parent1)).append("\n");
    sb.append("    parent2: ").append(toIndentedString(parent2)).append("\n");
    sb.append("    plannedCrossName: ").append(toIndentedString(plannedCrossName)).append("\n");
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
