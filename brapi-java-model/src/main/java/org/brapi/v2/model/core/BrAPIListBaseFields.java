package org.brapi.v2.model.core;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;

/**
 * ListBaseFields
 */


public class BrAPIListBaseFields implements BrAPIListBaseFieldsInterface  {
  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("dateCreated")
  private OffsetDateTime dateCreated = null;

  @JsonProperty("dateModified")
  private OffsetDateTime dateModified = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("listDescription")
  private String listDescription = null;

  @JsonProperty("listName")
  private String listName = null;

  @JsonProperty("listOwnerName")
  private String listOwnerName = null;

  @JsonProperty("listOwnerPersonDbId")
  private String listOwnerPersonDbId = null;

  @JsonProperty("listSize")
  private Integer listSize = null;

  @JsonProperty("listSource")
  private String listSource = null;

  @JsonProperty("listType")
  private BrAPIListTypes listType = null;

  private final transient Gson gson = new Gson();

  public BrAPIListBaseFields additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIListBaseFields putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new JsonObject();
    }
    JsonElement newElement = gson.toJsonTree(additionalInfoItem);
    this.additionalInfo.add(key, newElement);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public JsonObject getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIListBaseFields dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Timestamp when the entity was first created
   * @return dateCreated
  **/
  
  
    @Valid
    public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public BrAPIListBaseFields dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

  /**
   * Timestamp when the entity was last updated
   * @return dateModified
  **/
  
  
    @Valid
    public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public BrAPIListBaseFields externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPIListBaseFields listDescription(String listDescription) {
    this.listDescription = listDescription;
    return this;
  }

  /**
   * Description of a List
   * @return listDescription
  **/
  
  
    public String getListDescription() {
    return listDescription;
  }

  public void setListDescription(String listDescription) {
    this.listDescription = listDescription;
  }

  public BrAPIListBaseFields listName(String listName) {
    this.listName = listName;
    return this;
  }

  /**
   * Human readable name of a List
   * @return listName
  **/
  
  
    public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public BrAPIListBaseFields listOwnerName(String listOwnerName) {
    this.listOwnerName = listOwnerName;
    return this;
  }

  /**
   * Human readable name of a List Owner. (usually a user or person)
   * @return listOwnerName
  **/
  
  
    public String getListOwnerName() {
    return listOwnerName;
  }

  public void setListOwnerName(String listOwnerName) {
    this.listOwnerName = listOwnerName;
  }

  public BrAPIListBaseFields listOwnerPersonDbId(String listOwnerPersonDbId) {
    this.listOwnerPersonDbId = listOwnerPersonDbId;
    return this;
  }

  /**
   * The unique identifier for a List Owner. (usually a user or person)
   * @return listOwnerPersonDbId
  **/
  
  
    public String getListOwnerPersonDbId() {
    return listOwnerPersonDbId;
  }

  public void setListOwnerPersonDbId(String listOwnerPersonDbId) {
    this.listOwnerPersonDbId = listOwnerPersonDbId;
  }

  public BrAPIListBaseFields listSize(Integer listSize) {
    this.listSize = listSize;
    return this;
  }

  /**
   * The number of elements in a List
   * @return listSize
  **/
  
  
    public Integer getListSize() {
    return listSize;
  }

  public void setListSize(Integer listSize) {
    this.listSize = listSize;
  }

  public BrAPIListBaseFields listSource(String listSource) {
    this.listSource = listSource;
    return this;
  }

  /**
   * The description of where a List originated from
   * @return listSource
  **/
  
  
    public String getListSource() {
    return listSource;
  }

  public void setListSource(String listSource) {
    this.listSource = listSource;
  }

  public BrAPIListBaseFields listType(BrAPIListTypes listType) {
    this.listType = listType;
    return this;
  }

  /**
   * Get listType
   * @return listType
  **/
  
      

    @Valid
    public BrAPIListTypes getListType() {
    return listType;
  }

  public void setListType(BrAPIListTypes listType) {
    this.listType = listType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIListBaseFields listBaseFields = (BrAPIListBaseFields) o;
    return Objects.equals(this.additionalInfo, listBaseFields.additionalInfo) &&
        Objects.equals(this.dateCreated, listBaseFields.dateCreated) &&
        Objects.equals(this.dateModified, listBaseFields.dateModified) &&
        Objects.equals(this.externalReferences, listBaseFields.externalReferences) &&
        Objects.equals(this.listDescription, listBaseFields.listDescription) &&
        Objects.equals(this.listName, listBaseFields.listName) &&
        Objects.equals(this.listOwnerName, listBaseFields.listOwnerName) &&
        Objects.equals(this.listOwnerPersonDbId, listBaseFields.listOwnerPersonDbId) &&
        Objects.equals(this.listSize, listBaseFields.listSize) &&
        Objects.equals(this.listSource, listBaseFields.listSource) &&
        Objects.equals(this.listType, listBaseFields.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, dateCreated, dateModified, externalReferences, listDescription, listName, listOwnerName, listOwnerPersonDbId, listSize, listSource, listType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBaseFields {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    listDescription: ").append(toIndentedString(listDescription)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    listOwnerName: ").append(toIndentedString(listOwnerName)).append("\n");
    sb.append("    listOwnerPersonDbId: ").append(toIndentedString(listOwnerPersonDbId)).append("\n");
    sb.append("    listSize: ").append(toIndentedString(listSize)).append("\n");
    sb.append("    listSource: ").append(toIndentedString(listSource)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
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
