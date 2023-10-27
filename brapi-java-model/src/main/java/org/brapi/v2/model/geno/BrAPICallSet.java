package org.brapi.v2.model.geno;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A CallSet is a collection of calls that were generated by the same analysis of the same sample.
 */



public class BrAPICallSet   {
  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("callSetDbId")
  private String callSetDbId = null;

  @JsonProperty("callSetName")
  private String callSetName = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("sampleDbId")
  private String sampleDbId = null;

  @JsonProperty("studyDbId")
  private String studyDbId = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  private final transient Gson gson = new Gson();

  public BrAPICallSet additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPICallSet putAdditionalInfoItem(String key, Object additionalInfoItem) {
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

  public BrAPICallSet callSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
    return this;
  }

  /**
   * The call set ID.
   * @return callSetDbId
  **/
  
  
    public String getCallSetDbId() {
    return callSetDbId;
  }

  public void setCallSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
  }

  public BrAPICallSet callSetName(String callSetName) {
    this.callSetName = callSetName;
    return this;
  }

  /**
   * The call set name.
   * @return callSetName
  **/
  
  
    public String getCallSetName() {
    return callSetName;
  }

  public void setCallSetName(String callSetName) {
    this.callSetName = callSetName;
  }

  public BrAPICallSet created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date this call set was created
   * @return created
  **/
  
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public BrAPICallSet externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPICallSet sampleDbId(String sampleDbId) {
    this.sampleDbId = sampleDbId;
    return this;
  }

  /**
   * The Biosample entity the call set data was generated from.
   * @return sampleDbId
  **/
  
  
    public String getSampleDbId() {
    return sampleDbId;
  }

  public void setSampleDbId(String sampleDbId) {
    this.sampleDbId = sampleDbId;
  }

  public BrAPICallSet studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a study within the given database server
   * @return studyDbId
  **/
  
  
    public String getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  public BrAPICallSet updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The time at which this call set was last updated
   * @return updated
  **/
  
  
    @Valid
    public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public BrAPICallSet variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public BrAPICallSet addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * The IDs of the variant sets this call set has calls in.
   * @return variantSetIds
  **/
  
  
    public List<String> getVariantSetDbIds() {
    return variantSetDbIds;
  }

  public void setVariantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPICallSet callSet = (BrAPICallSet) o;
    return Objects.equals(this.additionalInfo, callSet.additionalInfo) &&
        Objects.equals(this.callSetDbId, callSet.callSetDbId) &&
        Objects.equals(this.callSetName, callSet.callSetName) &&
        Objects.equals(this.created, callSet.created) &&
        Objects.equals(this.externalReferences, callSet.externalReferences) &&
        Objects.equals(this.sampleDbId, callSet.sampleDbId) &&
        Objects.equals(this.studyDbId, callSet.studyDbId) &&
        Objects.equals(this.updated, callSet.updated) &&
        Objects.equals(this.variantSetDbIds, callSet.variantSetDbIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, callSetDbId, callSetName, created, externalReferences, sampleDbId, studyDbId, updated, variantSetDbIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSet {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    callSetDbId: ").append(toIndentedString(callSetDbId)).append("\n");
    sb.append("    callSetName: ").append(toIndentedString(callSetName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    sampleDbId: ").append(toIndentedString(sampleDbId)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    variantSetDbIds: ").append(toIndentedString(variantSetDbIds)).append("\n");
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
