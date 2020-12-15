package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.core.BrAPISeason;

/**
 * ObservationNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservationNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("collector")
  private String collector = null;

  @JsonProperty("externalReferences")
  private BrAPIExternalReferenceList externalReferences = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("observationTimeStamp")
  private OffsetDateTime observationTimeStamp = null;

  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId = null;

  @JsonProperty("observationUnitName")
  private String observationUnitName = null;

  @JsonProperty("observationVariableDbId")
  private String observationVariableDbId = null;

  @JsonProperty("observationVariableName")
  private String observationVariableName = null;

  @JsonProperty("season")
  private BrAPISeason season = null;

  @JsonProperty("studyDbId")
  private String studyDbId = null;

  @JsonProperty("uploadedBy")
  private String uploadedBy = null;

  @JsonProperty("value")
  private String value = null;

  public BrAPIObservationNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIObservationNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public BrAPIObservationNewRequest collector(String collector) {
    this.collector = collector;
    return this;
  }

  /**
   * The name or identifier of the entity which collected the observation
   * @return collector
  **/
  
  
    public String getCollector() {
    return collector;
  }

  public void setCollector(String collector) {
    this.collector = collector;
  }

  public BrAPIObservationNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
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

  public BrAPIObservationNewRequest germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm
   * @return germplasmDbId
  **/
  
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIObservationNewRequest germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * Name of the germplasm. It can be the preferred name and does not have to be unique.
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIObservationNewRequest observationTimeStamp(OffsetDateTime observationTimeStamp) {
    this.observationTimeStamp = observationTimeStamp;
    return this;
  }

  /**
   * The date and time when this observation was made
   * @return observationTimeStamp
  **/
  
  
    @Valid
    public OffsetDateTime getObservationTimeStamp() {
    return observationTimeStamp;
  }

  public void setObservationTimeStamp(OffsetDateTime observationTimeStamp) {
    this.observationTimeStamp = observationTimeStamp;
  }

  public BrAPIObservationNewRequest observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies an observation unit
   * @return observationUnitDbId
  **/
  
  
    public String getObservationUnitDbId() {
    return observationUnitDbId;
  }

  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }

  public BrAPIObservationNewRequest observationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
    return this;
  }

  /**
   * A human readable name for an observation unit
   * @return observationUnitName
  **/
  
  
    public String getObservationUnitName() {
    return observationUnitName;
  }

  public void setObservationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
  }

  public BrAPIObservationNewRequest observationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies an observation variable
   * @return observationVariableDbId
  **/
  
  
    public String getObservationVariableDbId() {
    return observationVariableDbId;
  }

  public void setObservationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
  }

  public BrAPIObservationNewRequest observationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
    return this;
  }

  /**
   * A human readable name for an observation variable
   * @return observationVariableName
  **/
  
  
    public String getObservationVariableName() {
    return observationVariableName;
  }

  public void setObservationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
  }

  public BrAPIObservationNewRequest season(BrAPISeason season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  **/
  
  
    @Valid
    public BrAPISeason getSeason() {
    return season;
  }

  public void setSeason(BrAPISeason season) {
    this.season = season;
  }

  public BrAPIObservationNewRequest studyDbId(String studyDbId) {
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

  public BrAPIObservationNewRequest uploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }

  /**
   * The name or id of the user who uploaded the observation to the database system
   * @return uploadedBy
  **/
  
  
    public String getUploadedBy() {
    return uploadedBy;
  }

  public void setUploadedBy(String uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  public BrAPIObservationNewRequest value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the data collected as an observation
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
    BrAPIObservationNewRequest observationNewRequest = (BrAPIObservationNewRequest) o;
    return Objects.equals(this.additionalInfo, observationNewRequest.additionalInfo) &&
        Objects.equals(this.collector, observationNewRequest.collector) &&
        Objects.equals(this.externalReferences, observationNewRequest.externalReferences) &&
        Objects.equals(this.germplasmDbId, observationNewRequest.germplasmDbId) &&
        Objects.equals(this.germplasmName, observationNewRequest.germplasmName) &&
        Objects.equals(this.observationTimeStamp, observationNewRequest.observationTimeStamp) &&
        Objects.equals(this.observationUnitDbId, observationNewRequest.observationUnitDbId) &&
        Objects.equals(this.observationUnitName, observationNewRequest.observationUnitName) &&
        Objects.equals(this.observationVariableDbId, observationNewRequest.observationVariableDbId) &&
        Objects.equals(this.observationVariableName, observationNewRequest.observationVariableName) &&
        Objects.equals(this.season, observationNewRequest.season) &&
        Objects.equals(this.studyDbId, observationNewRequest.studyDbId) &&
        Objects.equals(this.uploadedBy, observationNewRequest.uploadedBy) &&
        Objects.equals(this.value, observationNewRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, collector, externalReferences, germplasmDbId, germplasmName, observationTimeStamp, observationUnitDbId, observationUnitName, observationVariableDbId, observationVariableName, season, studyDbId, uploadedBy, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationNewRequest {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    collector: ").append(toIndentedString(collector)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    observationTimeStamp: ").append(toIndentedString(observationTimeStamp)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
    sb.append("    observationVariableDbId: ").append(toIndentedString(observationVariableDbId)).append("\n");
    sb.append("    observationVariableName: ").append(toIndentedString(observationVariableName)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
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
