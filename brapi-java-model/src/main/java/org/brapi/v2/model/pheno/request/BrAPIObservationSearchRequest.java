package org.brapi.v2.model.pheno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPIObservationUnitLevelRelationship;

/**
 * ObservationSearchRequest
 */

public class BrAPIObservationSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("germplasmDbIds")
	private List<String> germplasmDbIds = null;

	@JsonProperty("germplasmNames")
	private List<String> germplasmNames = null;

	@JsonProperty("locationDbIds")
	private List<String> locationDbIds = null;

	@JsonProperty("locationNames")
	private List<String> locationNames = null;

	@JsonProperty("observationDbIds")
	private List<String> observationDbIds = null;

	@JsonProperty("observationLevelRelationships")
	private List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships = null;

	@JsonProperty("observationLevels")
	private List<BrAPIObservationUnitLevelRelationship> observationLevels = null;

	@JsonProperty("observationTimeStampRangeEnd")
	private OffsetDateTime observationTimeStampRangeEnd = null;

	@JsonProperty("observationTimeStampRangeStart")
	private OffsetDateTime observationTimeStampRangeStart = null;

	@JsonProperty("observationUnitDbIds")
	private List<String> observationUnitDbIds = null;

	@JsonProperty("observationVariableDbIds")
	private List<String> observationVariableDbIds = null;

	@JsonProperty("observationVariableNames")
	private List<String> observationVariableNames = null;

	@JsonProperty("observationVariablePUIs")
	private List<String> observationVariablePUIs = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	@JsonProperty("seasonDbIds")
	private List<String> seasonDbIds = null;

	@JsonProperty("studyDbIds")
	private List<String> studyDbIds = null;

	@JsonProperty("studyNames")
	private List<String> studyNames = null;

	@JsonProperty("trialDbIds")
	private List<String> trialDbIds = null;

	@JsonProperty("trialNames")
	private List<String> trialNames = null;

	public BrAPIObservationSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIObservationSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
		if (this.commonCropNames == null) {
			this.commonCropNames = new ArrayList<String>();
		}
		this.commonCropNames.add(commonCropNamesItem);
		return this;
	}

	/**
	 * A program identifier to search for
	 * 
	 * @return commonCropNames
	 **/

	public List<String> getCommonCropNames() {
		return commonCropNames;
	}

	public void setCommonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
	}

	public BrAPIObservationSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
		if (this.programDbIds == null) {
			this.programDbIds = new ArrayList<String>();
		}
		this.programDbIds.add(programDbIdsItem);
		return this;
	}

	/**
	 * A program identifier to search for
	 * 
	 * @return programDbIds
	 **/

	public List<String> getProgramDbIds() {
		return programDbIds;
	}

	public void setProgramDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
	}

	public BrAPIObservationSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIObservationSearchRequest addProgramNamesItem(String programNamesItem) {
		if (this.programNames == null) {
			this.programNames = new ArrayList<String>();
		}
		this.programNames.add(programNamesItem);
		return this;
	}

	/**
	 * A name of a program to search for
	 * 
	 * @return programNames
	 **/

	public List<String> getProgramNames() {
		return programNames;
	}

	public void setProgramNames(List<String> programNames) {
		this.programNames = programNames;
	}

	public BrAPIObservationSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
		if (this.trialDbIds == null) {
			this.trialDbIds = new ArrayList<String>();
		}
		this.trialDbIds.add(trialDbIdsItem);
		return this;
	}

	/**
	 * The ID which uniquely identifies a trial to search for
	 * 
	 * @return trialDbIds
	 **/

	public List<String> getTrialDbIds() {
		return trialDbIds;
	}

	public void setTrialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
	}

	public BrAPIObservationSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPIObservationSearchRequest addTrialNamesItem(String trialNamesItem) {
		if (this.trialNames == null) {
			this.trialNames = new ArrayList<String>();
		}
		this.trialNames.add(trialNamesItem);
		return this;
	}

	/**
	 * The human readable name of a trial to search for
	 * 
	 * @return trialNames
	 **/

	public List<String> getTrialNames() {
		return trialNames;
	}

	public void setTrialNames(List<String> trialNames) {
		this.trialNames = trialNames;
	}

	public BrAPIObservationSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
		if (this.studyDbIds == null) {
			this.studyDbIds = new ArrayList<String>();
		}
		this.studyDbIds.add(studyDbIdsItem);
		return this;
	}

	/**
	 * List of study identifiers to search for
	 * 
	 * @return studyDbIds
	 **/

	public List<String> getStudyDbIds() {
		return studyDbIds;
	}

	public void setStudyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
	}

	public BrAPIObservationSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPIObservationSearchRequest addStudyNamesItem(String studyNamesItem) {
		if (this.studyNames == null) {
			this.studyNames = new ArrayList<String>();
		}
		this.studyNames.add(studyNamesItem);
		return this;
	}

	/**
	 * List of study names to filter search results
	 * 
	 * @return studyNames
	 **/

	public List<String> getStudyNames() {
		return studyNames;
	}

	public void setStudyNames(List<String> studyNames) {
		this.studyNames = studyNames;
	}

	public BrAPIObservationSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
		if (this.germplasmDbIds == null) {
			this.germplasmDbIds = new ArrayList<String>();
		}
		this.germplasmDbIds.add(germplasmDbIdsItem);
		return this;
	}

	/**
	 * List of IDs which uniquely identify germplasm to search for
	 * 
	 * @return germplasmDbIds
	 **/

	public List<String> getGermplasmDbIds() {
		return germplasmDbIds;
	}

	public void setGermplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
	}

	public BrAPIObservationSearchRequest germplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
		return this;
	}

	public BrAPIObservationSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
		if (this.germplasmNames == null) {
			this.germplasmNames = new ArrayList<String>();
		}
		this.germplasmNames.add(germplasmNamesItem);
		return this;
	}

	/**
	 * List of human readable names to identify germplasm to search for
	 * 
	 * @return germplasmNames
	 **/

	public List<String> getGermplasmNames() {
		return germplasmNames;
	}

	public void setGermplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
	}

	public BrAPIObservationSearchRequest locationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
		if (this.locationDbIds == null) {
			this.locationDbIds = new ArrayList<String>();
		}
		this.locationDbIds.add(locationDbIdsItem);
		return this;
	}

	/**
	 * The location ids to search for
	 * 
	 * @return locationDbIds
	 **/

	public List<String> getLocationDbIds() {
		return locationDbIds;
	}

	public void setLocationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
	}

	public BrAPIObservationSearchRequest locationNames(List<String> locationNames) {
		this.locationNames = locationNames;
		return this;
	}

	public BrAPIObservationSearchRequest addLocationNamesItem(String locationNamesItem) {
		if (this.locationNames == null) {
			this.locationNames = new ArrayList<String>();
		}
		this.locationNames.add(locationNamesItem);
		return this;
	}

	/**
	 * A human readable names to search for
	 * 
	 * @return locationNames
	 **/

	public List<String> getLocationNames() {
		return locationNames;
	}

	public void setLocationNames(List<String> locationNames) {
		this.locationNames = locationNames;
	}

	public BrAPIObservationSearchRequest observationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
		if (this.observationVariableDbIds == null) {
			this.observationVariableDbIds = new ArrayList<String>();
		}
		this.observationVariableDbIds.add(observationVariableDbIdsItem);
		return this;
	}

	/**
	 * The DbIds of Variables to search for
	 * 
	 * @return observationVariableDbIds
	 **/

	public List<String> getObservationVariableDbIds() {
		return observationVariableDbIds;
	}

	public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
	}

	public BrAPIObservationSearchRequest observationVariableNames(List<String> observationVariableNames) {
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationVariableNamesItem(String observationVariableNamesItem) {
		if (this.observationVariableNames == null) {
			this.observationVariableNames = new ArrayList<String>();
		}
		this.observationVariableNames.add(observationVariableNamesItem);
		return this;
	}

	/**
	 * The names of Variables to search for
	 * 
	 * @return observationVariableNames
	 **/

	public List<String> getObservationVariableNames() {
		return observationVariableNames;
	}

	public void setObservationVariableNames(List<String> observationVariableNames) {
		this.observationVariableNames = observationVariableNames;
	}

	public BrAPIObservationSearchRequest observationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationVariablePUIsItem(String observationVariablePUIsItem) {
		if (this.observationVariablePUIs == null) {
			this.observationVariablePUIs = new ArrayList<String>();
		}
		this.observationVariablePUIs.add(observationVariablePUIsItem);
		return this;
	}

	/**
	 * The names of Variables to search for
	 * 
	 * @return observationVariablePUIs
	 **/

	public List<String> getObservationVariablePUIs() {
		return observationVariablePUIs;
	}

	public void setObservationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
	}

	public BrAPIObservationSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIObservationSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
		if (this.externalReferenceIds == null) {
			this.externalReferenceIds = new ArrayList<String>();
		}
		this.externalReferenceIds.add(externalReferenceIdsItem);
		return this;
	}

	/**
	 * List of external references for the trait to search for
	 * 
	 * @return externalReferenceIds
	 **/

	public List<String> getExternalReferenceIds() {
		return externalReferenceIds;
	}

	public void setExternalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
	}

	@Deprecated
	public BrAPIObservationSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIObservationSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
		if (this.externalReferenceIDs == null) {
			this.externalReferenceIDs = new ArrayList<String>();
		}
		this.externalReferenceIDs.add(externalReferenceIDsItem);
		return this;
	}

	/**
	 * List of external references for the trait to search for
	 * 
	 * @return externalReferenceIDs
	 **/

	@Deprecated
	public List<String> getExternalReferenceIDs() {
		return externalReferenceIDs;
	}

	@Deprecated
	public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
	}

	public BrAPIObservationSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIObservationSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
		if (this.externalReferenceSources == null) {
			this.externalReferenceSources = new ArrayList<String>();
		}
		this.externalReferenceSources.add(externalReferenceSourcesItem);
		return this;
	}

	/**
	 * List of external references sources for the trait to search for
	 * 
	 * @return externalReferenceSources
	 **/

	public List<String> getExternalReferenceSources() {
		return externalReferenceSources;
	}

	public void setExternalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
	}

	public BrAPIObservationSearchRequest observationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationDbIdsItem(String observationDbIdsItem) {
		if (this.observationDbIds == null) {
			this.observationDbIds = new ArrayList<String>();
		}
		this.observationDbIds.add(observationDbIdsItem);
		return this;
	}

	/**
	 * The unique id of an Observation
	 * 
	 * @return observationDbIds
	 **/

	public List<String> getObservationDbIds() {
		return observationDbIds;
	}

	public void setObservationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
	}

	public BrAPIObservationSearchRequest observationLevelRelationships(
			List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships) {
		this.observationLevelRelationships = observationLevelRelationships;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationLevelRelationshipsItem(
			BrAPIObservationUnitLevelRelationship observationLevelRelationshipsItem) {
		if (this.observationLevelRelationships == null) {
			this.observationLevelRelationships = new ArrayList<BrAPIObservationUnitLevelRelationship>();
		}
		this.observationLevelRelationships.add(observationLevelRelationshipsItem);
		return this;
	}

	/**
	 * Searches for values in
	 * ObservationUnit->observationUnitPosition->observationLevelRelationships
	 * 
	 * @return observationLevelRelationships
	 **/

	public List<BrAPIObservationUnitLevelRelationship> getObservationLevelRelationships() {
		return observationLevelRelationships;
	}

	public void setObservationLevelRelationships(
			List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships) {
		this.observationLevelRelationships = observationLevelRelationships;
	}

	public BrAPIObservationSearchRequest observationLevels(
			List<BrAPIObservationUnitLevelRelationship> observationLevels) {
		this.observationLevels = observationLevels;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationLevelsItem(
			BrAPIObservationUnitLevelRelationship observationLevelsItem) {
		if (this.observationLevels == null) {
			this.observationLevels = new ArrayList<BrAPIObservationUnitLevelRelationship>();
		}
		this.observationLevels.add(observationLevelsItem);
		return this;
	}

	/**
	 * Searches for values in
	 * ObservationUnit->observationUnitPosition->observationLevel
	 * 
	 * @return observationLevels
	 **/

	public List<BrAPIObservationUnitLevelRelationship> getObservationLevels() {
		return observationLevels;
	}

	public void setObservationLevels(List<BrAPIObservationUnitLevelRelationship> observationLevels) {
		this.observationLevels = observationLevels;
	}

	public BrAPIObservationSearchRequest observationTimeStampRangeEnd(OffsetDateTime observationTimeStampRangeEnd) {
		this.observationTimeStampRangeEnd = observationTimeStampRangeEnd;
		return this;
	}

	/**
	 * Timestamp range end
	 * 
	 * @return observationTimeStampRangeEnd
	 **/

	public OffsetDateTime getObservationTimeStampRangeEnd() {
		return observationTimeStampRangeEnd;
	}

	public void setObservationTimeStampRangeEnd(OffsetDateTime observationTimeStampRangeEnd) {
		this.observationTimeStampRangeEnd = observationTimeStampRangeEnd;
	}

	public BrAPIObservationSearchRequest observationTimeStampRangeStart(OffsetDateTime observationTimeStampRangeStart) {
		this.observationTimeStampRangeStart = observationTimeStampRangeStart;
		return this;
	}

	/**
	 * Timestamp range start
	 * 
	 * @return observationTimeStampRangeStart
	 **/

	public OffsetDateTime getObservationTimeStampRangeStart() {
		return observationTimeStampRangeStart;
	}

	public void setObservationTimeStampRangeStart(OffsetDateTime observationTimeStampRangeStart) {
		this.observationTimeStampRangeStart = observationTimeStampRangeStart;
	}

	public BrAPIObservationSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
		if (this.observationUnitDbIds == null) {
			this.observationUnitDbIds = new ArrayList<String>();
		}
		this.observationUnitDbIds.add(observationUnitDbIdsItem);
		return this;
	}

	/**
	 * The unique id of an Observation Unit
	 * 
	 * @return observationUnitDbIds
	 **/

	public List<String> getObservationUnitDbIds() {
		return observationUnitDbIds;
	}

	public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
	}

	public BrAPIObservationSearchRequest seasonDbIds(List<String> seasonDbIds) {
		this.seasonDbIds = seasonDbIds;
		return this;
	}

	public BrAPIObservationSearchRequest addSeasonDbIdsItem(String seasonDbIdsItem) {
		if (this.seasonDbIds == null) {
			this.seasonDbIds = new ArrayList<String>();
		}
		this.seasonDbIds.add(seasonDbIdsItem);
		return this;
	}

	/**
	 * The year or Phenotyping campaign of a multi-annual study (trees, grape, ...)
	 * 
	 * @return seasonDbIds
	 **/

	public List<String> getSeasonDbIds() {
		return seasonDbIds;
	}

	public void setSeasonDbIds(List<String> seasonDbIds) {
		this.seasonDbIds = seasonDbIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIObservationSearchRequest observationSearchRequest = (BrAPIObservationSearchRequest) o;
		return Objects.equals(this.commonCropNames, observationSearchRequest.commonCropNames)
				&& Objects.equals(this.programDbIds, observationSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, observationSearchRequest.programNames)
				&& Objects.equals(this.trialDbIds, observationSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, observationSearchRequest.trialNames)
				&& Objects.equals(this.studyDbIds, observationSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, observationSearchRequest.studyNames)
				&& Objects.equals(this.germplasmDbIds, observationSearchRequest.germplasmDbIds)
				&& Objects.equals(this.germplasmNames, observationSearchRequest.germplasmNames)
				&& Objects.equals(this.locationDbIds, observationSearchRequest.locationDbIds)
				&& Objects.equals(this.locationNames, observationSearchRequest.locationNames)
				&& Objects.equals(this.observationVariableDbIds, observationSearchRequest.observationVariableDbIds)
				&& Objects.equals(this.observationVariableNames, observationSearchRequest.observationVariableNames)
				&& Objects.equals(this.observationVariablePUIs, observationSearchRequest.observationVariablePUIs)
				&& Objects.equals(this.externalReferenceIds, observationSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceIDs, observationSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceSources, observationSearchRequest.externalReferenceSources)
				&& Objects.equals(this.observationDbIds, observationSearchRequest.observationDbIds)
				&& Objects.equals(this.observationLevelRelationships,
						observationSearchRequest.observationLevelRelationships)
				&& Objects.equals(this.observationLevels, observationSearchRequest.observationLevels)
				&& Objects.equals(this.observationTimeStampRangeEnd,
						observationSearchRequest.observationTimeStampRangeEnd)
				&& Objects.equals(this.observationTimeStampRangeStart,
						observationSearchRequest.observationTimeStampRangeStart)
				&& Objects.equals(this.observationUnitDbIds, observationSearchRequest.observationUnitDbIds)
				&& Objects.equals(this.seasonDbIds, observationSearchRequest.seasonDbIds) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, programDbIds, programNames, trialDbIds, trialNames, studyDbIds, studyNames, germplasmDbIds,
				germplasmNames, locationDbIds, locationNames, observationVariableDbIds, observationVariableNames,
				observationVariablePUIs, externalReferenceIds, externalReferenceIDs, externalReferenceSources, observationDbIds,
				observationLevelRelationships, observationLevels, observationTimeStampRangeEnd,
				observationTimeStampRangeStart, observationUnitDbIds, seasonDbIds, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ObservationSearchRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
		sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
		sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
		sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
		sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
		sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
		sb.append("    locationDbIds: ").append(toIndentedString(locationDbIds)).append("\n");
		sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
		sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
		sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
		sb.append("    observationVariablePUIs: ").append(toIndentedString(observationVariablePUIs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
		sb.append("    observationLevelRelationships: ").append(toIndentedString(observationLevelRelationships))
				.append("\n");
		sb.append("    observationLevels: ").append(toIndentedString(observationLevels)).append("\n");
		sb.append("    observationTimeStampRangeEnd: ").append(toIndentedString(observationTimeStampRangeEnd))
				.append("\n");
		sb.append("    observationTimeStampRangeStart: ").append(toIndentedString(observationTimeStampRangeStart))
				.append("\n");
		sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
		sb.append("    seasonDbIds: ").append(toIndentedString(seasonDbIds)).append("\n");
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
