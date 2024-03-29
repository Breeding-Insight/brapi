package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.BrAPISortBy;
import org.brapi.v2.model.BrAPISortOrder;

/**
 * TrialSearchRequest
 */

public class BrAPITrialSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	@JsonProperty("trialDbIds")
	private List<String> trialDbIds = null;

	@JsonProperty("trialNames")
	private List<String> trialNames = null;

	@JsonProperty("studyDbIds")
	private List<String> studyDbIds = null;

	@JsonProperty("studyNames")
	private List<String> studyNames = null;

	@JsonProperty("locationDbIds")
	private List<String> locationDbIds = null;

	@JsonProperty("locationNames")
	private List<String> locationNames = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("contactDbIds")
	private List<String> contactDbIds = null;

	@JsonProperty("searchDateRangeEnd")
	private LocalDate searchDateRangeEnd = null;

	@JsonProperty("searchDateRangeStart")
	private LocalDate searchDateRangeStart = null;

	@JsonProperty("trialPUIs")
	private List<String> trialPUIs = null;

	@JsonProperty("sortBy")
	private BrAPISortBy sortBy = null;

	@JsonProperty("sortOrder")
	private BrAPISortOrder sortOrder = null;

	public BrAPISortBy getSortBy() {
		return sortBy;
	}

	public void setSortBy(BrAPISortBy sortBy) {
		this.sortBy = sortBy;
	}

	public BrAPISortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(BrAPISortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public BrAPITrialSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPITrialSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
		if (this.commonCropNames == null) {
			this.commonCropNames = new ArrayList<String>();
		}
		this.commonCropNames.add(commonCropNamesItem);
		return this;
	}

	/**
	 * Common name for the crop which this program is for
	 * 
	 * @return commonCropNames
	 **/

	public List<String> getCommonCropNames() {
		return commonCropNames;
	}

	public void setCommonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
	}

	public BrAPITrialSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPITrialSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPITrialSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPITrialSearchRequest addProgramNamesItem(String programNamesItem) {
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

	public BrAPITrialSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPITrialSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

	public BrAPITrialSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPITrialSearchRequest addTrialNamesItem(String trialNamesItem) {
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

	public BrAPITrialSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPITrialSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

	public BrAPITrialSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPITrialSearchRequest addStudyNamesItem(String studyNamesItem) {
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

	public BrAPITrialSearchRequest locationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
		return this;
	}

	public BrAPITrialSearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
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

	public BrAPITrialSearchRequest locationNames(List<String> locationNames) {
		this.locationNames = locationNames;
		return this;
	}

	public BrAPITrialSearchRequest addLocationNamesItem(String locationNamesItem) {
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

	public BrAPITrialSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPITrialSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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
	public BrAPITrialSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPITrialSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPITrialSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPITrialSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public BrAPITrialSearchRequest active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Is this trail currently active
	 * 
	 * @return active
	 **/

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public BrAPITrialSearchRequest contactDbIds(List<String> contactDbIds) {
		this.contactDbIds = contactDbIds;
		return this;
	}

	public BrAPITrialSearchRequest addContactDbIdsItem(String contactDbIdsItem) {
		if (this.contactDbIds == null) {
			this.contactDbIds = new ArrayList<String>();
		}
		this.contactDbIds.add(contactDbIdsItem);
		return this;
	}

	/**
	 * List of contact entities associated with this trial
	 * 
	 * @return contactDbIds
	 **/

	public List<String> getContactDbIds() {
		return contactDbIds;
	}

	public void setContactDbIds(List<String> contactDbIds) {
		this.contactDbIds = contactDbIds;
	}

	public BrAPITrialSearchRequest searchDateRangeEnd(LocalDate searchDateRangeEnd) {
		this.searchDateRangeEnd = searchDateRangeEnd;
		return this;
	}

	/**
	 * The end of the overlapping search date range. `searchDateRangeStart` must be
	 * before `searchDateRangeEnd`. Return a Trial entity if any of the following
	 * cases are true - `searchDateRangeStart` is before `trial.endDate` AND
	 * `searchDateRangeEnd` is null - `searchDateRangeStart` is before
	 * `trial.endDate` AND `searchDateRangeEnd` is after `trial.startDate` -
	 * `searchDateRangeEnd` is after `trial.startDate` AND `searchDateRangeStart` is
	 * null - `searchDateRangeEnd` is after `trial.startDate` AND
	 * `searchDateRangeStart` is before `trial.endDate`
	 * 
	 * @return searchDateRangeEnd
	 **/

	public LocalDate getSearchDateRangeEnd() {
		return searchDateRangeEnd;
	}

	public void setSearchDateRangeEnd(LocalDate searchDateRangeEnd) {
		this.searchDateRangeEnd = searchDateRangeEnd;
	}

	public BrAPITrialSearchRequest searchDateRangeStart(LocalDate searchDateRangeStart) {
		this.searchDateRangeStart = searchDateRangeStart;
		return this;
	}

	/**
	 * The start of the overlapping search date range. `searchDateRangeStart` must
	 * be before `searchDateRangeEnd`. Return a Trial entity if any of the following
	 * cases are true - `searchDateRangeStart` is before `trial.endDate` AND
	 * `searchDateRangeEnd` is null - `searchDateRangeStart` is before
	 * `trial.endDate` AND `searchDateRangeEnd` is after `trial.startDate` -
	 * `searchDateRangeEnd` is after `trial.startDate` AND `searchDateRangeStart` is
	 * null - `searchDateRangeEnd` is after `trial.startDate` AND
	 * `searchDateRangeStart` is before `trial.endDate`
	 * 
	 * @return searchDateRangeStart
	 **/

	public LocalDate getSearchDateRangeStart() {
		return searchDateRangeStart;
	}

	public void setSearchDateRangeStart(LocalDate searchDateRangeStart) {
		this.searchDateRangeStart = searchDateRangeStart;
	}

	public BrAPITrialSearchRequest trialPUIs(List<String> trialPUIs) {
		this.trialPUIs = trialPUIs;
		return this;
	}

	public BrAPITrialSearchRequest addTrialPUIsItem(String trialPUIsItem) {
		if (this.trialPUIs == null) {
			this.trialPUIs = new ArrayList<String>();
		}
		this.trialPUIs.add(trialPUIsItem);
		return this;
	}

	/**
	 * A permanent identifier for a trial. Could be DOI or other URI formatted
	 * identifier.
	 * 
	 * @return trialPUIs
	 **/

	public List<String> getTrialPUIs() {
		return trialPUIs;
	}

	public void setTrialPUIs(List<String> trialPUIs) {
		this.trialPUIs = trialPUIs;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPITrialSearchRequest trialSearchRequest = (BrAPITrialSearchRequest) o;
		return Objects.equals(this.commonCropNames, trialSearchRequest.commonCropNames)
				&& Objects.equals(this.programDbIds, trialSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, trialSearchRequest.programNames)
				&& Objects.equals(this.trialDbIds, trialSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, trialSearchRequest.trialNames)
				&& Objects.equals(this.studyDbIds, trialSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, trialSearchRequest.studyNames)
				&& Objects.equals(this.locationDbIds, trialSearchRequest.locationDbIds)
				&& Objects.equals(this.locationNames, trialSearchRequest.locationNames)
				&& Objects.equals(this.externalReferenceIds, trialSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceIDs, trialSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceSources, trialSearchRequest.externalReferenceSources)
				&& Objects.equals(this.active, trialSearchRequest.active)
				&& Objects.equals(this.contactDbIds, trialSearchRequest.contactDbIds)
				&& Objects.equals(this.searchDateRangeEnd, trialSearchRequest.searchDateRangeEnd)
				&& Objects.equals(this.searchDateRangeStart, trialSearchRequest.searchDateRangeStart)
				&& Objects.equals(this.trialPUIs, trialSearchRequest.trialPUIs) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, programDbIds, programNames, trialDbIds, trialNames, studyDbIds, studyNames,
				locationDbIds, locationNames, externalReferenceIds, externalReferenceIDs, externalReferenceSources,
				active, contactDbIds, searchDateRangeEnd, searchDateRangeStart, trialPUIs, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TrialSearchRequest {\n");
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
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    contactDbIds: ").append(toIndentedString(contactDbIds)).append("\n");
		sb.append("    searchDateRangeEnd: ").append(toIndentedString(searchDateRangeEnd)).append("\n");
		sb.append("    searchDateRangeStart: ").append(toIndentedString(searchDateRangeStart)).append("\n");
		sb.append("    trialPUIs: ").append(toIndentedString(trialPUIs)).append("\n");
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
