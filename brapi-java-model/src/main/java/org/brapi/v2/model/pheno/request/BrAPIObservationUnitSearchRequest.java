package org.brapi.v2.model.pheno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPIObservationUnitHierarchyLevel;
import org.brapi.v2.model.pheno.BrAPIObservationUnitLevelRelationship;

/**
 * BrAPIObservationUnitSearchRequest
 */

public class BrAPIObservationUnitSearchRequest extends BrAPISearchRequestParametersPaging {
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

	@JsonProperty("includeObservations")
	private Boolean includeObservations = null;

	@JsonProperty("locationDbIds")
	private List<String> locationDbIds = null;

	@JsonProperty("locationNames")
	private List<String> locationNames = null;

	@JsonProperty("observationLevelRelationships")
	private List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships = null;

	@JsonProperty("observationLevels")
	private List<BrAPIObservationUnitHierarchyLevel> observationLevels = null;

	@JsonProperty("observationUnitDbIds")
	private List<String> observationUnitDbIds = null;

	@JsonProperty("observationUnitNames")
	private List<String> observationUnitNames = null;

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

	public BrAPIObservationUnitSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
		if (this.commonCropNames == null) {
			this.commonCropNames = new ArrayList<String>();
		}
		this.commonCropNames.add(commonCropNamesItem);
		return this;
	}

	/**
	 * The BrAPI Common Crop Name is the simple, generalized, widely accepted name
	 * of the organism being researched. It is most often used in multi-crop systems
	 * where digital resources need to be divided at a high level. Things like
	 * &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of
	 * common crop names. Use this parameter to only return results associated with
	 * the given crops. Use &#x60;GET /commoncropnames&#x60; to find the list of
	 * available crops on a server.
	 *
	 * @return commonCropNames
	 **/

	public List<String> getCommonCropNames() {
		return commonCropNames;
	}

	public void setCommonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
	}

	@Deprecated
	public BrAPIObservationUnitSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIObservationUnitSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
		if (this.externalReferenceIDs == null) {
			this.externalReferenceIDs = new ArrayList<String>();
		}
		this.externalReferenceIDs.add(externalReferenceIDsItem);
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;externalReferenceIds&#x60;. Github
	 * issue number #460 &lt;br&gt;List of external reference IDs. Could be a simple
	 * strings or a URIs. (use with &#x60;externalReferenceSources&#x60; parameter)
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

	public BrAPIObservationUnitSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
		if (this.externalReferenceIds == null) {
			this.externalReferenceIds = new ArrayList<String>();
		}
		this.externalReferenceIds.add(externalReferenceIdsItem);
		return this;
	}

	/**
	 * List of external reference IDs. Could be a simple strings or a URIs. (use
	 * with &#x60;externalReferenceSources&#x60; parameter)
	 *
	 * @return externalReferenceIds
	 **/

	public List<String> getExternalReferenceIds() {
		return externalReferenceIds;
	}

	public void setExternalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
	}

	public BrAPIObservationUnitSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
		if (this.externalReferenceSources == null) {
			this.externalReferenceSources = new ArrayList<String>();
		}
		this.externalReferenceSources.add(externalReferenceSourcesItem);
		return this;
	}

	/**
	 * List of identifiers for the source system or database of an external
	 * reference (use with &#x60;externalReferenceIDs&#x60; parameter)
	 *
	 * @return externalReferenceSources
	 **/

	public List<String> getExternalReferenceSources() {
		return externalReferenceSources;
	}

	public void setExternalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
	}

	public BrAPIObservationUnitSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest germplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

	public BrAPIObservationUnitSearchRequest includeObservations(Boolean includeObservations) {
		this.includeObservations = includeObservations;
		return this;
	}

	/**
	 * Use this parameter to include a list of observations embedded in each
	 * ObservationUnit object. CAUTION - Use this parameter at your own risk. It may
	 * return large, unpaginated lists of observation data. Only set this value to
	 * True if you are sure you need to.
	 *
	 * @return includeObservations
	 **/

	public Boolean isIncludeObservations() {
		return includeObservations;
	}

	public void setIncludeObservations(Boolean includeObservations) {
		this.includeObservations = includeObservations;
	}

	public BrAPIObservationUnitSearchRequest locationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest locationNames(List<String> locationNames) {
		this.locationNames = locationNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addLocationNamesItem(String locationNamesItem) {
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

	public BrAPIObservationUnitSearchRequest observationLevelRelationships(
			List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships) {
		this.observationLevelRelationships = observationLevelRelationships;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationLevelRelationshipsItem(
			BrAPIObservationUnitLevelRelationship observationLevelRelationshipsItem) {
		if (this.observationLevelRelationships == null) {
			this.observationLevelRelationships = new ArrayList<BrAPIObservationUnitLevelRelationship>();
		}
		this.observationLevelRelationships.add(observationLevelRelationshipsItem);
		return this;
	}

	/**
	 * Searches for values in
	 * ObservationUnit-&gt;observationUnitPosition-&gt;observationLevelRelationships
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

	public BrAPIObservationUnitSearchRequest observationLevels(
			List<BrAPIObservationUnitHierarchyLevel> observationLevels) {
		this.observationLevels = observationLevels;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationLevelsItem(
			BrAPIObservationUnitHierarchyLevel observationLevelsItem) {
		if (this.observationLevels == null) {
			this.observationLevels = new ArrayList<BrAPIObservationUnitHierarchyLevel>();
		}
		this.observationLevels.add(observationLevelsItem);
		return this;
	}

	/**
	 * Searches for values in
	 * ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel
	 *
	 * @return observationLevels
	 **/

	public List<BrAPIObservationUnitHierarchyLevel> getObservationLevels() {
		return observationLevels;
	}

	public void setObservationLevels(List<BrAPIObservationUnitHierarchyLevel> observationLevels) {
		this.observationLevels = observationLevels;
	}

	public BrAPIObservationUnitSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
		if (this.observationUnitDbIds == null) {
			this.observationUnitDbIds = new ArrayList<String>();
		}
		this.observationUnitDbIds.add(observationUnitDbIdsItem);
		return this;
	}

	/**
	 * The unique id of an observation unit
	 *
	 * @return observationUnitDbIds
	 **/

	public List<String> getObservationUnitDbIds() {
		return observationUnitDbIds;
	}

	public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
	}

	public BrAPIObservationUnitSearchRequest observationUnitNames(List<String> observationUnitNames) {
		this.observationUnitNames = observationUnitNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationUnitNamesItem(String observationUnitNamesItem) {
		if (this.observationUnitNames == null) {
			this.observationUnitNames = new ArrayList<String>();
		}
		this.observationUnitNames.add(observationUnitNamesItem);
		return this;
	}

	/**
	 * The human readable identifier for an Observation Unit
	 *
	 * @return observationUnitNames
	 **/

	public List<String> getObservationUnitNames() {
		return observationUnitNames;
	}

	public void setObservationUnitNames(List<String> observationUnitNames) {
		this.observationUnitNames = observationUnitNames;
	}

	public BrAPIObservationUnitSearchRequest observationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest observationVariableNames(List<String> observationVariableNames) {
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationVariableNamesItem(String observationVariableNamesItem) {
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

	public BrAPIObservationUnitSearchRequest observationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addObservationVariablePUIsItem(String observationVariablePUIsItem) {
		if (this.observationVariablePUIs == null) {
			this.observationVariablePUIs = new ArrayList<String>();
		}
		this.observationVariablePUIs.add(observationVariablePUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of an Observation Variable, usually in the
	 * form of a URI
	 *
	 * @return observationVariablePUIs
	 **/

	public List<String> getObservationVariablePUIs() {
		return observationVariablePUIs;
	}

	public void setObservationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
	}

	public BrAPIObservationUnitSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
		if (this.programDbIds == null) {
			this.programDbIds = new ArrayList<String>();
		}
		this.programDbIds.add(programDbIdsItem);
		return this;
	}

	/**
	 * A BrAPI Program represents the high level organization or group who is
	 * responsible for conducting trials and studies. Things like Breeding Programs
	 * and Funded Projects are considered BrAPI Programs. Use this parameter to only
	 * return results associated with the given programs. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programDbIds
	 **/

	public List<String> getProgramDbIds() {
		return programDbIds;
	}

	public void setProgramDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
	}

	public BrAPIObservationUnitSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addProgramNamesItem(String programNamesItem) {
		if (this.programNames == null) {
			this.programNames = new ArrayList<String>();
		}
		this.programNames.add(programNamesItem);
		return this;
	}

	/**
	 * Use this parameter to only return results associated with the given program
	 * names. Program names are not required to be unique. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programNames
	 **/

	public List<String> getProgramNames() {
		return programNames;
	}

	public void setProgramNames(List<String> programNames) {
		this.programNames = programNames;
	}

	public BrAPIObservationUnitSearchRequest seasonDbIds(List<String> seasonDbIds) {
		this.seasonDbIds = seasonDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addSeasonDbIdsItem(String seasonDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addStudyNamesItem(String studyNamesItem) {
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

	public BrAPIObservationUnitSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

	public BrAPIObservationUnitSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPIObservationUnitSearchRequest addTrialNamesItem(String trialNamesItem) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIObservationUnitSearchRequest observationUnitSearchRequest = (BrAPIObservationUnitSearchRequest) o;
		return Objects.equals(this.commonCropNames, observationUnitSearchRequest.commonCropNames)
				&& Objects.equals(this.externalReferenceIDs, observationUnitSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, observationUnitSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources, observationUnitSearchRequest.externalReferenceSources)
				&& Objects.equals(this.germplasmDbIds, observationUnitSearchRequest.germplasmDbIds)
				&& Objects.equals(this.germplasmNames, observationUnitSearchRequest.germplasmNames)
				&& Objects.equals(this.includeObservations, observationUnitSearchRequest.includeObservations)
				&& Objects.equals(this.locationDbIds, observationUnitSearchRequest.locationDbIds)
				&& Objects.equals(this.locationNames, observationUnitSearchRequest.locationNames)
				&& Objects.equals(this.observationLevelRelationships,
						observationUnitSearchRequest.observationLevelRelationships)
				&& Objects.equals(this.observationLevels, observationUnitSearchRequest.observationLevels)
				&& Objects.equals(this.observationUnitDbIds, observationUnitSearchRequest.observationUnitDbIds)
				&& Objects.equals(this.observationUnitNames, observationUnitSearchRequest.observationUnitNames)
				&& Objects.equals(this.observationVariableDbIds, observationUnitSearchRequest.observationVariableDbIds)
				&& Objects.equals(this.observationVariableNames, observationUnitSearchRequest.observationVariableNames)
				&& Objects.equals(this.observationVariablePUIs, observationUnitSearchRequest.observationVariablePUIs)
				&& Objects.equals(this.programDbIds, observationUnitSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, observationUnitSearchRequest.programNames)
				&& Objects.equals(this.seasonDbIds, observationUnitSearchRequest.seasonDbIds)
				&& Objects.equals(this.studyDbIds, observationUnitSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, observationUnitSearchRequest.studyNames)
				&& Objects.equals(this.trialDbIds, observationUnitSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, observationUnitSearchRequest.trialNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources,
				germplasmDbIds, germplasmNames, includeObservations, locationDbIds, locationNames,
				observationLevelRelationships, observationLevels, observationUnitDbIds, observationUnitNames,
				observationVariableDbIds, observationVariableNames, observationVariablePUIs, programDbIds, programNames,
				seasonDbIds, studyDbIds, studyNames, trialDbIds, trialNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIObservationUnitSearchRequest {\n");

		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
		sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
		sb.append("    includeObservations: ").append(toIndentedString(includeObservations)).append("\n");
		sb.append("    locationDbIds: ").append(toIndentedString(locationDbIds)).append("\n");
		sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
		sb.append("    observationLevelRelationships: ").append(toIndentedString(observationLevelRelationships))
				.append("\n");
		sb.append("    observationLevels: ").append(toIndentedString(observationLevels)).append("\n");
		sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
		sb.append("    observationUnitNames: ").append(toIndentedString(observationUnitNames)).append("\n");
		sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
		sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
		sb.append("    observationVariablePUIs: ").append(toIndentedString(observationVariablePUIs)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("    seasonDbIds: ").append(toIndentedString(seasonDbIds)).append("\n");
		sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
		sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
		sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
		sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
