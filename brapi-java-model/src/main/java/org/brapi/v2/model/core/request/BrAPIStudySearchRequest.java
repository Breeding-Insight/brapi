package org.brapi.v2.model.core.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.BrAPISortBy;
import org.brapi.v2.model.BrAPISortOrder;

/**
 * StudySearchRequest
 */


public class BrAPIStudySearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("commonCropNames")
  @Valid
  private List<String> commonCropNames = null;

  @JsonProperty("programDbIds")
  @Valid
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  @Valid
  private List<String> programNames = null;

  @JsonProperty("trialDbIds")
  @Valid
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  @Valid
  private List<String> trialNames = null;

  @JsonProperty("studyDbIds")
  @Valid
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  @Valid
  private List<String> studyNames = null;

  @JsonProperty("locationDbIds")
  @Valid
  private List<String> locationDbIds = null;

  @JsonProperty("locationNames")
  @Valid
  private List<String> locationNames = null;

  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("observationVariableDbIds")
  @Valid
  private List<String> observationVariableDbIds = null;

  @JsonProperty("observationVariableNames")
  @Valid
  private List<String> observationVariableNames = null;

  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("seasonDbIds")
  @Valid
  private List<String> seasonDbIds = null;

  @JsonProperty("sortBy")
  private BrAPISortBy sortBy = null;

  @JsonProperty("sortOrder")
  private BrAPISortOrder sortOrder = null;

  @JsonProperty("studyCodes")
  @Valid
  private List<String> studyCodes = null;

  @JsonProperty("studyPUIs")
  @Valid
  private List<String> studyPUIs = null;

  @JsonProperty("studyTypes")
  @Valid
  private List<String> studyTypes = null;

  public BrAPIStudySearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPIStudySearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
    if (this.commonCropNames == null) {
      this.commonCropNames = new ArrayList<String>();
    }
    this.commonCropNames.add(commonCropNamesItem);
    return this;
  }

  /**
   * Common name for the crop which this program is for
   * @return commonCropNames
  **/
  
  
    public List<String> getCommonCropNames() {
    return commonCropNames;
  }

  public void setCommonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
  }

  public BrAPIStudySearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addProgramDbIdsItem(String programDbIdsItem) {
    if (this.programDbIds == null) {
      this.programDbIds = new ArrayList<String>();
    }
    this.programDbIds.add(programDbIdsItem);
    return this;
  }

  /**
   * A program identifier to search for
   * @return programDbIds
  **/
  
  
    public List<String> getProgramDbIds() {
    return programDbIds;
  }

  public void setProgramDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
  }

  public BrAPIStudySearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPIStudySearchRequest addProgramNamesItem(String programNamesItem) {
    if (this.programNames == null) {
      this.programNames = new ArrayList<String>();
    }
    this.programNames.add(programNamesItem);
    return this;
  }

  /**
   * A name of a program to search for
   * @return programNames
  **/
  
  
    public List<String> getProgramNames() {
    return programNames;
  }

  public void setProgramNames(List<String> programNames) {
    this.programNames = programNames;
  }

  public BrAPIStudySearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
    if (this.trialDbIds == null) {
      this.trialDbIds = new ArrayList<String>();
    }
    this.trialDbIds.add(trialDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a trial to search for
   * @return trialDbIds
  **/
  
  
    public List<String> getTrialDbIds() {
    return trialDbIds;
  }

  public void setTrialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
  }

  public BrAPIStudySearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public BrAPIStudySearchRequest addTrialNamesItem(String trialNamesItem) {
    if (this.trialNames == null) {
      this.trialNames = new ArrayList<String>();
    }
    this.trialNames.add(trialNamesItem);
    return this;
  }

  /**
   * The human readable name of a trial to search for
   * @return trialNames
  **/
  
  
    public List<String> getTrialNames() {
    return trialNames;
  }

  public void setTrialNames(List<String> trialNames) {
    this.trialNames = trialNames;
  }

  public BrAPIStudySearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
    if (this.studyDbIds == null) {
      this.studyDbIds = new ArrayList<String>();
    }
    this.studyDbIds.add(studyDbIdsItem);
    return this;
  }

  /**
   * List of study identifiers to search for
   * @return studyDbIds
  **/
  
  
    public List<String> getStudyDbIds() {
    return studyDbIds;
  }

  public void setStudyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
  }

  public BrAPIStudySearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public BrAPIStudySearchRequest addStudyNamesItem(String studyNamesItem) {
    if (this.studyNames == null) {
      this.studyNames = new ArrayList<String>();
    }
    this.studyNames.add(studyNamesItem);
    return this;
  }

  /**
   * List of study names to filter search results
   * @return studyNames
  **/
  
  
    public List<String> getStudyNames() {
    return studyNames;
  }

  public void setStudyNames(List<String> studyNames) {
    this.studyNames = studyNames;
  }

  public BrAPIStudySearchRequest locationDbIds(List<String> locationDbIds) {
    this.locationDbIds = locationDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
    if (this.locationDbIds == null) {
      this.locationDbIds = new ArrayList<String>();
    }
    this.locationDbIds.add(locationDbIdsItem);
    return this;
  }

  /**
   * The location ids to search for
   * @return locationDbIds
  **/
  
  
    public List<String> getLocationDbIds() {
    return locationDbIds;
  }

  public void setLocationDbIds(List<String> locationDbIds) {
    this.locationDbIds = locationDbIds;
  }

  public BrAPIStudySearchRequest locationNames(List<String> locationNames) {
    this.locationNames = locationNames;
    return this;
  }

  public BrAPIStudySearchRequest addLocationNamesItem(String locationNamesItem) {
    if (this.locationNames == null) {
      this.locationNames = new ArrayList<String>();
    }
    this.locationNames.add(locationNamesItem);
    return this;
  }

  /**
   * A human readable names to search for
   * @return locationNames
  **/
  
  
    public List<String> getLocationNames() {
    return locationNames;
  }

  public void setLocationNames(List<String> locationNames) {
    this.locationNames = locationNames;
  }

  public BrAPIStudySearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * List of IDs which uniquely identify germplasm to search for
   * @return germplasmDbIds
  **/
  
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public BrAPIStudySearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPIStudySearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * List of human readable names to identify germplasm to search for
   * @return germplasmNames
  **/
  
  
    public List<String> getGermplasmNames() {
    return germplasmNames;
  }

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public BrAPIStudySearchRequest observationVariableDbIds(List<String> observationVariableDbIds) {
    this.observationVariableDbIds = observationVariableDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
    if (this.observationVariableDbIds == null) {
      this.observationVariableDbIds = new ArrayList<String>();
    }
    this.observationVariableDbIds.add(observationVariableDbIdsItem);
    return this;
  }

  /**
   * List of observation variable IDs to search for
   * @return observationVariableDbIds
  **/
  
  
    public List<String> getObservationVariableDbIds() {
    return observationVariableDbIds;
  }

  public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
    this.observationVariableDbIds = observationVariableDbIds;
  }

  public BrAPIStudySearchRequest observationVariableNames(List<String> observationVariableNames) {
    this.observationVariableNames = observationVariableNames;
    return this;
  }

  public BrAPIStudySearchRequest addObservationVariableNamesItem(String observationVariableNamesItem) {
    if (this.observationVariableNames == null) {
      this.observationVariableNames = new ArrayList<String>();
    }
    this.observationVariableNames.add(observationVariableNamesItem);
    return this;
  }

  /**
   * The names of Variables to search for
   * @return observationVariableNames
  **/
  
  
    public List<String> getObservationVariableNames() {
    return observationVariableNames;
  }

  public void setObservationVariableNames(List<String> observationVariableNames) {
    this.observationVariableNames = observationVariableNames;
  }

  public BrAPIStudySearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIStudySearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * List of external references for the trait to search for
   * @return externalReferenceIDs
  **/
  
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public BrAPIStudySearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIStudySearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
    if (this.externalReferenceSources == null) {
      this.externalReferenceSources = new ArrayList<String>();
    }
    this.externalReferenceSources.add(externalReferenceSourcesItem);
    return this;
  }

  /**
   * List of external references sources for the trait to search for
   * @return externalReferenceSources
  **/
  
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public BrAPIStudySearchRequest active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Is this study currently active
   * @return active
  **/
  
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BrAPIStudySearchRequest seasonDbIds(List<String> seasonDbIds) {
    this.seasonDbIds = seasonDbIds;
    return this;
  }

  public BrAPIStudySearchRequest addSeasonDbIdsItem(String seasonDbIdsItem) {
    if (this.seasonDbIds == null) {
      this.seasonDbIds = new ArrayList<String>();
    }
    this.seasonDbIds.add(seasonDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a season
   * @return seasonDbIds
  **/
  
  
    public List<String> getSeasonDbIds() {
    return seasonDbIds;
  }

  public void setSeasonDbIds(List<String> seasonDbIds) {
    this.seasonDbIds = seasonDbIds;
  }

  public BrAPIStudySearchRequest sortBy(BrAPISortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Name of one of the fields within the study object on which results can be sorted
   * @return sortBy
  **/
  
  
    public BrAPISortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(BrAPISortBy sortBy) {
    this.sortBy = sortBy;
  }

  public BrAPIStudySearchRequest sortOrder(BrAPISortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Order results should be sorted. ex. \"ASC\" or \"DESC\"
   * @return sortOrder
  **/
  
  
    public BrAPISortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(BrAPISortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  public BrAPIStudySearchRequest studyCodes(List<String> studyCodes) {
    this.studyCodes = studyCodes;
    return this;
  }

  public BrAPIStudySearchRequest addStudyCodesItem(String studyCodesItem) {
    if (this.studyCodes == null) {
      this.studyCodes = new ArrayList<String>();
    }
    this.studyCodes.add(studyCodesItem);
    return this;
  }

  /**
   * A short human readable code for a study
   * @return studyCodes
  **/
  
  
    public List<String> getStudyCodes() {
    return studyCodes;
  }

  public void setStudyCodes(List<String> studyCodes) {
    this.studyCodes = studyCodes;
  }

  public BrAPIStudySearchRequest studyPUIs(List<String> studyPUIs) {
    this.studyPUIs = studyPUIs;
    return this;
  }

  public BrAPIStudySearchRequest addStudyPUIsItem(String studyPUIsItem) {
    if (this.studyPUIs == null) {
      this.studyPUIs = new ArrayList<String>();
    }
    this.studyPUIs.add(studyPUIsItem);
    return this;
  }

  /**
   * Permanent unique identifier associated with study data. For example, a URI or DOI
   * @return studyPUIs
  **/
  
  
    public List<String> getStudyPUIs() {
    return studyPUIs;
  }

  public void setStudyPUIs(List<String> studyPUIs) {
    this.studyPUIs = studyPUIs;
  }

  public BrAPIStudySearchRequest studyTypes(List<String> studyTypes) {
    this.studyTypes = studyTypes;
    return this;
  }

  public BrAPIStudySearchRequest addStudyTypesItem(String studyTypesItem) {
    if (this.studyTypes == null) {
      this.studyTypes = new ArrayList<String>();
    }
    this.studyTypes.add(studyTypesItem);
    return this;
  }

  /**
   * The type of study being performed. ex. \"Yield Trial\", etc
   * @return studyTypes
  **/
  
  
    public List<String> getStudyTypes() {
    return studyTypes;
  }

  public void setStudyTypes(List<String> studyTypes) {
    this.studyTypes = studyTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIStudySearchRequest studySearchRequest = (BrAPIStudySearchRequest) o;
    return Objects.equals(this.commonCropNames, studySearchRequest.commonCropNames) &&
        Objects.equals(this.programDbIds, studySearchRequest.programDbIds) &&
        Objects.equals(this.programNames, studySearchRequest.programNames) &&
        Objects.equals(this.trialDbIds, studySearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, studySearchRequest.trialNames) &&
        Objects.equals(this.studyDbIds, studySearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, studySearchRequest.studyNames) &&
        Objects.equals(this.locationDbIds, studySearchRequest.locationDbIds) &&
        Objects.equals(this.locationNames, studySearchRequest.locationNames) &&
        Objects.equals(this.germplasmDbIds, studySearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, studySearchRequest.germplasmNames) &&
        Objects.equals(this.observationVariableDbIds, studySearchRequest.observationVariableDbIds) &&
        Objects.equals(this.observationVariableNames, studySearchRequest.observationVariableNames) &&
        Objects.equals(this.externalReferenceIDs, studySearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, studySearchRequest.externalReferenceSources) &&
        Objects.equals(this.active, studySearchRequest.active) &&
        Objects.equals(this.seasonDbIds, studySearchRequest.seasonDbIds) &&
        Objects.equals(this.sortBy, studySearchRequest.sortBy) &&
        Objects.equals(this.sortOrder, studySearchRequest.sortOrder) &&
        Objects.equals(this.studyCodes, studySearchRequest.studyCodes) &&
        Objects.equals(this.studyPUIs, studySearchRequest.studyPUIs) &&
        Objects.equals(this.studyTypes, studySearchRequest.studyTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonCropNames, programDbIds, programNames, trialDbIds, trialNames, studyDbIds, studyNames, locationDbIds, locationNames, germplasmDbIds, germplasmNames, observationVariableDbIds, observationVariableNames, externalReferenceIDs, externalReferenceSources, active, seasonDbIds, sortBy, sortOrder, studyCodes, studyPUIs, studyTypes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudySearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
    sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    locationDbIds: ").append(toIndentedString(locationDbIds)).append("\n");
    sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
    sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    seasonDbIds: ").append(toIndentedString(seasonDbIds)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    studyCodes: ").append(toIndentedString(studyCodes)).append("\n");
    sb.append("    studyPUIs: ").append(toIndentedString(studyPUIs)).append("\n");
    sb.append("    studyTypes: ").append(toIndentedString(studyTypes)).append("\n");
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
