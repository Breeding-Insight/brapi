package org.brapi.v2.model.germ;

import java.time.OffsetDateTime;
import java.util.*;

import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;


/**
 * Cross
 */


public class BrAPICross {
  @JsonProperty("crossDbId")
  private String crossDbId = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("crossAttributes")
  @Valid
  private List<BrAPICrossCrossAttributes> crossAttributes = null;

  @JsonProperty("crossName")
  private String crossName = null;

  @JsonProperty("crossType")
  private BrAPICrossType crossType = null;

  @JsonProperty("crossingProjectDbId")
  private String crossingProjectDbId = null;

  @JsonProperty("crossingProjectName")
  private String crossingProjectName = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("parent1")
  private BrAPICrossParent parent1 = null;

  @JsonProperty("parent2")
  private BrAPICrossParent parent2 = null;

  @JsonProperty("pollinationTimeStamp")
  private OffsetDateTime pollinationTimeStamp = null;

  public BrAPICross crossDbId(String crossDbId) {
    this.crossDbId = crossDbId;
    return this;
  }

  /**
   * the unique identifier for a cross
   * @return crossDbId
  **/
  
  
    public String getCrossDbId() {
    return crossDbId;
  }

  public void setCrossDbId(String crossDbId) {
    this.crossDbId = crossDbId;
  }

  public BrAPICross additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPICross putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   *
   * @return additionalInfo
   **/


  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPICross crossAttributes(List<BrAPICrossCrossAttributes> crossAttributes) {
    this.crossAttributes = crossAttributes;
    return this;
  }

  public BrAPICross addCrossAttributesItem(BrAPICrossCrossAttributes crossAttributesItem) {
    if (this.crossAttributes == null) {
      this.crossAttributes = new ArrayList<BrAPICrossCrossAttributes>();
    }
    this.crossAttributes.add(crossAttributesItem);
    return this;
  }

  /**
   * Set of custom attributes associated with a cross
   *
   * @return crossAttributes
   **/

  @Valid
  public List<BrAPICrossCrossAttributes> getCrossAttributes() {
    return crossAttributes;
  }

  public void setCrossAttributes(List<BrAPICrossCrossAttributes> crossAttributes) {
    this.crossAttributes = crossAttributes;
  }

  public BrAPICross crossName(String crossName) {
    this.crossName = crossName;
    return this;
  }

  /**
   * the human readable name for a cross
   *
   * @return crossName
   **/


  public String getCrossName() {
    return crossName;
  }

  public void setCrossName(String crossName) {
    this.crossName = crossName;
  }

  public BrAPICross crossType(BrAPICrossType crossType) {
    this.crossType = crossType;
    return this;
  }

  /**
   * the type of cross
   *
   * @return crossType
   **/


  public BrAPICrossType getCrossType() {
    return crossType;
  }

  public void setCrossType(BrAPICrossType crossType) {
    this.crossType = crossType;
  }

  public BrAPICross crossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
    return this;
  }

  /**
   * the unique identifier for a crossing project
   *
   * @return crossingProjectDbId
   **/


  public String getCrossingProjectDbId() {
    return crossingProjectDbId;
  }

  public void setCrossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
  }

  public BrAPICross crossingProjectName(String crossingProjectName) {
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

  public BrAPICross externalReferences(List<BrAPIExternalReference> externalReferences) {
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

  public BrAPICross parent1(BrAPICrossParent parent1) {
    this.parent1 = parent1;
    return this;
  }

  /**
   * Get parent1
   *
   * @return parent1
   **/


  @Valid
  public BrAPICrossParent getParent1() {
    return parent1;
  }

  public void setParent1(BrAPICrossParent parent1) {
    this.parent1 = parent1;
  }

  public BrAPICross parent2(BrAPICrossParent parent2) {
    this.parent2 = parent2;
    return this;
  }

  /**
   * Get parent2
   *
   * @return parent2
   **/


  @Valid
  public BrAPICrossParent getParent2() {
    return parent2;
  }

  public void setParent2(BrAPICrossParent parent2) {
    this.parent2 = parent2;
  }

  public BrAPICross pollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
    this.pollinationTimeStamp = pollinationTimeStamp;
    return this;
  }

  /**
   * the timestamp when the pollination took place
   *
   * @return pollinationTimeStamp
   **/


  @Valid
  public OffsetDateTime getPollinationTimeStamp() {
    return pollinationTimeStamp;
  }

  public void setPollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
    this.pollinationTimeStamp = pollinationTimeStamp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPICross cross = (BrAPICross) o;
    return Objects.equals(this.crossDbId, cross.crossDbId) &&
            Objects.equals(this.additionalInfo, cross.additionalInfo)
            && Objects.equals(this.crossAttributes, cross.crossAttributes)
            && Objects.equals(this.crossName, cross.crossName)
            && Objects.equals(this.crossType, cross.crossType)
            && Objects.equals(this.crossingProjectDbId, cross.crossingProjectDbId)
            && Objects.equals(this.crossingProjectName, cross.crossingProjectName)
            && Objects.equals(this.externalReferences, cross.externalReferences)
            && Objects.equals(this.parent1, cross.parent1)
            && Objects.equals(this.parent2, cross.parent2)
            && Objects.equals(this.pollinationTimeStamp, cross.pollinationTimeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossDbId, additionalInfo, crossAttributes, crossName, crossType, crossingProjectDbId,
                        crossingProjectName, externalReferences, parent1, parent2, pollinationTimeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cross {\n");
    sb.append("    crossDbId: ").append(toIndentedString(crossDbId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    crossAttributes: ").append(toIndentedString(crossAttributes)).append("\n");
    sb.append("    crossName: ").append(toIndentedString(crossName)).append("\n");
    sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
    sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
    sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    parent1: ").append(toIndentedString(parent1)).append("\n");
    sb.append("    parent2: ").append(toIndentedString(parent2)).append("\n");
    sb.append("    pollinationTimeStamp: ").append(toIndentedString(pollinationTimeStamp)).append("\n");
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
