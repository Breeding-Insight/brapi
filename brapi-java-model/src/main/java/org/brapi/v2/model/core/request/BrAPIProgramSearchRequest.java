package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * ProgramSearchRequest
 */

public class BrAPIProgramSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	@JsonProperty("programTypes")
	private List<String> programTypes = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("abbreviations")
	private List<String> abbreviations = null;

	@JsonProperty("leadPersonDbIds")
	private List<String> leadPersonDbIds = null;

	@JsonProperty("leadPersonNames")
	private List<String> leadPersonNames = null;

	@JsonProperty("objectives")
	private List<String> objectives = null;

	public BrAPIProgramSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIProgramSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

	public BrAPIProgramSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIProgramSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPIProgramSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIProgramSearchRequest addProgramNamesItem(String programNamesItem) {
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

	public BrAPIProgramSearchRequest programTypes(List<String> programTypes) {
		this.programTypes = programTypes;
		return this;
	}

	public BrAPIProgramSearchRequest addProgramTypesItem(String programTypesItem) {
		if (this.programTypes == null) {
			this.programTypes = new ArrayList<String>();
		}
		this.programTypes.add(programTypesItem);
		return this;
	}

	/**
	 * A name of a program to search for
	 * 
	 * @return programTypes
	 **/

	public List<String> getProgramTypes() {
		return programTypes;
	}

	public void setProgramTypes(List<String> programTypes) {
		this.programTypes = programTypes;
	}

	public BrAPIProgramSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIProgramSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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
	public BrAPIProgramSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIProgramSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPIProgramSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIProgramSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public BrAPIProgramSearchRequest abbreviations(List<String> abbreviations) {
		this.abbreviations = abbreviations;
		return this;
	}

	public BrAPIProgramSearchRequest addAbbreviationsItem(String abbreviationsItem) {
		if (this.abbreviations == null) {
			this.abbreviations = new ArrayList<String>();
		}
		this.abbreviations.add(abbreviationsItem);
		return this;
	}

	/**
	 * An abbreviation of a program to search for
	 * 
	 * @return abbreviations
	 **/

	public List<String> getAbbreviations() {
		return abbreviations;
	}

	public void setAbbreviations(List<String> abbreviations) {
		this.abbreviations = abbreviations;
	}

	public BrAPIProgramSearchRequest leadPersonDbIds(List<String> leadPersonDbIds) {
		this.leadPersonDbIds = leadPersonDbIds;
		return this;
	}

	public BrAPIProgramSearchRequest addLeadPersonDbIdsItem(String leadPersonDbIdsItem) {
		if (this.leadPersonDbIds == null) {
			this.leadPersonDbIds = new ArrayList<String>();
		}
		this.leadPersonDbIds.add(leadPersonDbIdsItem);
		return this;
	}

	/**
	 * The person DbIds of the program leader to search for
	 * 
	 * @return leadPersonDbIds
	 **/

	public List<String> getLeadPersonDbIds() {
		return leadPersonDbIds;
	}

	public void setLeadPersonDbIds(List<String> leadPersonDbIds) {
		this.leadPersonDbIds = leadPersonDbIds;
	}

	public BrAPIProgramSearchRequest leadPersonNames(List<String> leadPersonNames) {
		this.leadPersonNames = leadPersonNames;
		return this;
	}

	public BrAPIProgramSearchRequest addLeadPersonNamesItem(String leadPersonNamesItem) {
		if (this.leadPersonNames == null) {
			this.leadPersonNames = new ArrayList<String>();
		}
		this.leadPersonNames.add(leadPersonNamesItem);
		return this;
	}

	/**
	 * The names of the program leader to search for
	 * 
	 * @return leadPersonNames
	 **/

	public List<String> getLeadPersonNames() {
		return leadPersonNames;
	}

	public void setLeadPersonNames(List<String> leadPersonNames) {
		this.leadPersonNames = leadPersonNames;
	}

	public BrAPIProgramSearchRequest objectives(List<String> objectives) {
		this.objectives = objectives;
		return this;
	}

	public BrAPIProgramSearchRequest addObjectivesItem(String objectivesItem) {
		if (this.objectives == null) {
			this.objectives = new ArrayList<String>();
		}
		this.objectives.add(objectivesItem);
		return this;
	}

	/**
	 * A program objective to search for
	 * 
	 * @return objectives
	 **/

	public List<String> getObjectives() {
		return objectives;
	}

	public void setObjectives(List<String> objectives) {
		this.objectives = objectives;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIProgramSearchRequest programSearchRequest = (BrAPIProgramSearchRequest) o;
		return Objects.equals(this.commonCropNames, programSearchRequest.commonCropNames)
				&& Objects.equals(this.programDbIds, programSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, programSearchRequest.programNames)
				&& Objects.equals(this.programTypes, programSearchRequest.programTypes)
				&& Objects.equals(this.externalReferenceIds, programSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceIDs, programSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceSources, programSearchRequest.externalReferenceSources)
				&& Objects.equals(this.abbreviations, programSearchRequest.abbreviations)
				&& Objects.equals(this.leadPersonDbIds, programSearchRequest.leadPersonDbIds)
				&& Objects.equals(this.leadPersonNames, programSearchRequest.leadPersonNames)
				&& Objects.equals(this.objectives, programSearchRequest.objectives) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, programDbIds, programNames, programTypes, externalReferenceIds,
				externalReferenceIDs, externalReferenceSources, abbreviations, leadPersonDbIds, leadPersonNames,
				objectives, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramSearchRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("    programTypes: ").append(toIndentedString(programTypes)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    abbreviations: ").append(toIndentedString(abbreviations)).append("\n");
		sb.append("    leadPersonDbIds: ").append(toIndentedString(leadPersonDbIds)).append("\n");
		sb.append("    leadPersonNames: ").append(toIndentedString(leadPersonNames)).append("\n");
		sb.append("    objectives: ").append(toIndentedString(objectives)).append("\n");
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
