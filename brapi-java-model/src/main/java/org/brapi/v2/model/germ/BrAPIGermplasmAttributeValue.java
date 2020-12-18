package org.brapi.v2.model.germ;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;


/**
 * GermplasmAttributeValue
 */


public class BrAPIGermplasmAttributeValue {
  @JsonProperty("attributeValueDbId")
  private String attributeValueDbId = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("attributeDbId")
  private String attributeDbId = null;

  @JsonProperty("attributeName")
  private String attributeName = null;

  @JsonProperty("determinedDate")
  private OffsetDateTime determinedDate = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("value")
  private String value = null;

  public BrAPIGermplasmAttributeValue attributeValueDbId(String attributeValueDbId) {
    this.attributeValueDbId = attributeValueDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies this attribute value within the given database server
   * @return attributeValueDbId
  **/
  
      

    public String getAttributeValueDbId() {
    return attributeValueDbId;
  }

  public void setAttributeValueDbId(String attributeValueDbId) {
    this.attributeValueDbId = attributeValueDbId;
  }

  public BrAPIGermplasmAttributeValue additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIGermplasmAttributeValue putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public BrAPIGermplasmAttributeValue attributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies this attribute within the given database
   * server
   *
   * @return attributeDbId
   **/


  public String getAttributeDbId() {
    return attributeDbId;
  }

  public void setAttributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
  }

  public BrAPIGermplasmAttributeValue attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public BrAPIGermplasmAttributeValue determinedDate(OffsetDateTime determinedDate) {
    this.determinedDate = determinedDate;
    return this;
  }

  /**
   * The date the value of this attribute was determined for a given germplasm
   *
   * @return determinedDate
   **/


  @Valid
  public OffsetDateTime getDeterminedDate() {
    return determinedDate;
  }

  public void setDeterminedDate(OffsetDateTime determinedDate) {
    this.determinedDate = determinedDate;
  }

  public BrAPIGermplasmAttributeValue externalReferences(List<BrAPIExternalReference> externalReferences) {
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

  public BrAPIGermplasmAttributeValue germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm within the given database server
   *
   * @return germplasmDbId
   **/


  public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIGermplasmAttributeValue germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * Name of the germplasm. It can be the preferred name and does not have to be
   * unique.
   *
   * @return germplasmName
   **/


  public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIGermplasmAttributeValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of this attribute for a given germplasm
   *
   * @return value
   **/


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmAttributeValue germplasmAttributeValue = (BrAPIGermplasmAttributeValue) o;
    return Objects.equals(this.attributeValueDbId, germplasmAttributeValue.attributeValueDbId) &&
            Objects.equals(this.additionalInfo, germplasmAttributeValue.additionalInfo)
            && Objects.equals(this.attributeDbId, germplasmAttributeValue.attributeDbId)
            && Objects.equals(this.attributeName, germplasmAttributeValue.attributeName)
            && Objects.equals(this.determinedDate, germplasmAttributeValue.determinedDate)
            && Objects.equals(this.externalReferences, germplasmAttributeValue.externalReferences)
            && Objects.equals(this.germplasmDbId, germplasmAttributeValue.germplasmDbId)
            && Objects.equals(this.germplasmName, germplasmAttributeValue.germplasmName)
            && Objects.equals(this.value, germplasmAttributeValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeValueDbId, additionalInfo, attributeDbId, attributeName, determinedDate, externalReferences,
                        germplasmDbId, germplasmName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeValue {\n");
    sb.append("    attributeValueDbId: ").append(toIndentedString(attributeValueDbId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    attributeDbId: ").append(toIndentedString(attributeDbId)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    determinedDate: ").append(toIndentedString(determinedDate)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
