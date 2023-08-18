package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.core.BrAPIListTypes;

/**
 * ListSearchRequest
 */

public class BrAPIListSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("dateCreatedRangeEnd")
	private OffsetDateTime dateCreatedRangeEnd = null;

	@JsonProperty("dateCreatedRangeStart")
	private OffsetDateTime dateCreatedRangeStart = null;

	@JsonProperty("dateModifiedRangeEnd")
	private OffsetDateTime dateModifiedRangeEnd = null;

	@JsonProperty("dateModifiedRangeStart")
	private OffsetDateTime dateModifiedRangeStart = null;

	@JsonProperty("listDbIds")
	private List<String> listDbIds = null;

	@JsonProperty("listNames")
	private List<String> listNames = null;

	@JsonProperty("listOwnerNames")
	private List<String> listOwnerNames = null;

	@JsonProperty("listOwnerPersonDbIds")
	private List<String> listOwnerPersonDbIds = null;

	@JsonProperty("listSources")
	private List<String> listSources = null;

	@JsonProperty("listType")
	private BrAPIListTypes listType = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	public BrAPIListSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIListSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

	public BrAPIListSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIListSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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
	public BrAPIListSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIListSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPIListSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIListSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public BrAPIListSearchRequest dateCreatedRangeEnd(OffsetDateTime dateCreatedRangeEnd) {
		this.dateCreatedRangeEnd = dateCreatedRangeEnd;
		return this;
	}

	/**
	 * Get dateCreatedRangeEnd
	 * 
	 * @return dateCreatedRangeEnd
	 **/

	public OffsetDateTime getDateCreatedRangeEnd() {
		return dateCreatedRangeEnd;
	}

	public void setDateCreatedRangeEnd(OffsetDateTime dateCreatedRangeEnd) {
		this.dateCreatedRangeEnd = dateCreatedRangeEnd;
	}

	public BrAPIListSearchRequest dateCreatedRangeStart(OffsetDateTime dateCreatedRangeStart) {
		this.dateCreatedRangeStart = dateCreatedRangeStart;
		return this;
	}

	/**
	 * Get dateCreatedRangeStart
	 * 
	 * @return dateCreatedRangeStart
	 **/

	public OffsetDateTime getDateCreatedRangeStart() {
		return dateCreatedRangeStart;
	}

	public void setDateCreatedRangeStart(OffsetDateTime dateCreatedRangeStart) {
		this.dateCreatedRangeStart = dateCreatedRangeStart;
	}

	public BrAPIListSearchRequest dateModifiedRangeEnd(OffsetDateTime dateModifiedRangeEnd) {
		this.dateModifiedRangeEnd = dateModifiedRangeEnd;
		return this;
	}

	/**
	 * Get dateModifiedRangeEnd
	 * 
	 * @return dateModifiedRangeEnd
	 **/

	public OffsetDateTime getDateModifiedRangeEnd() {
		return dateModifiedRangeEnd;
	}

	public void setDateModifiedRangeEnd(OffsetDateTime dateModifiedRangeEnd) {
		this.dateModifiedRangeEnd = dateModifiedRangeEnd;
	}

	public BrAPIListSearchRequest dateModifiedRangeStart(OffsetDateTime dateModifiedRangeStart) {
		this.dateModifiedRangeStart = dateModifiedRangeStart;
		return this;
	}

	/**
	 * Get dateModifiedRangeStart
	 * 
	 * @return dateModifiedRangeStart
	 **/

	public OffsetDateTime getDateModifiedRangeStart() {
		return dateModifiedRangeStart;
	}

	public void setDateModifiedRangeStart(OffsetDateTime dateModifiedRangeStart) {
		this.dateModifiedRangeStart = dateModifiedRangeStart;
	}

	public BrAPIListSearchRequest listDbIds(List<String> listDbIds) {
		this.listDbIds = listDbIds;
		return this;
	}

	public BrAPIListSearchRequest addListDbIdsItem(String listDbIdsItem) {
		if (this.listDbIds == null) {
			this.listDbIds = new ArrayList<String>();
		}
		this.listDbIds.add(listDbIdsItem);
		return this;
	}

	/**
	 * Get listDbIds
	 * 
	 * @return listDbIds
	 **/

	public List<String> getListDbIds() {
		return listDbIds;
	}

	public void setListDbIds(List<String> listDbIds) {
		this.listDbIds = listDbIds;
	}

	public BrAPIListSearchRequest listNames(List<String> listNames) {
		this.listNames = listNames;
		return this;
	}

	public BrAPIListSearchRequest addListNamesItem(String listNamesItem) {
		if (this.listNames == null) {
			this.listNames = new ArrayList<String>();
		}
		this.listNames.add(listNamesItem);
		return this;
	}

	/**
	 * Get listNames
	 * 
	 * @return listNames
	 **/

	public List<String> getListNames() {
		return listNames;
	}

	public void setListNames(List<String> listNames) {
		this.listNames = listNames;
	}

	public BrAPIListSearchRequest listOwnerNames(List<String> listOwnerNames) {
		this.listOwnerNames = listOwnerNames;
		return this;
	}

	public BrAPIListSearchRequest addListOwnerNamesItem(String listOwnerNamesItem) {
		if (this.listOwnerNames == null) {
			this.listOwnerNames = new ArrayList<String>();
		}
		this.listOwnerNames.add(listOwnerNamesItem);
		return this;
	}

	/**
	 * Get listOwnerNames
	 * 
	 * @return listOwnerNames
	 **/

	public List<String> getListOwnerNames() {
		return listOwnerNames;
	}

	public void setListOwnerNames(List<String> listOwnerNames) {
		this.listOwnerNames = listOwnerNames;
	}

	public BrAPIListSearchRequest listOwnerPersonDbIds(List<String> listOwnerPersonDbIds) {
		this.listOwnerPersonDbIds = listOwnerPersonDbIds;
		return this;
	}

	public BrAPIListSearchRequest addListOwnerPersonDbIdsItem(String listOwnerPersonDbIdsItem) {
		if (this.listOwnerPersonDbIds == null) {
			this.listOwnerPersonDbIds = new ArrayList<String>();
		}
		this.listOwnerPersonDbIds.add(listOwnerPersonDbIdsItem);
		return this;
	}

	/**
	 * Get listOwnerPersonDbIds
	 * 
	 * @return listOwnerPersonDbIds
	 **/

	public List<String> getListOwnerPersonDbIds() {
		return listOwnerPersonDbIds;
	}

	public void setListOwnerPersonDbIds(List<String> listOwnerPersonDbIds) {
		this.listOwnerPersonDbIds = listOwnerPersonDbIds;
	}

	public BrAPIListSearchRequest listSources(List<String> listSources) {
		this.listSources = listSources;
		return this;
	}

	public BrAPIListSearchRequest addListSourcesItem(String listSourcesItem) {
		if (this.listSources == null) {
			this.listSources = new ArrayList<String>();
		}
		this.listSources.add(listSourcesItem);
		return this;
	}

	/**
	 * Get listSources
	 * 
	 * @return listSources
	 **/

	public List<String> getListSources() {
		return listSources;
	}

	public void setListSources(List<String> listSources) {
		this.listSources = listSources;
	}

	public BrAPIListSearchRequest listType(BrAPIListTypes listType) {
		this.listType = listType;
		return this;
	}

	/**
	 * Get listType
	 * 
	 * @return listType
	 **/

	public BrAPIListTypes getListType() {
		return listType;
	}

	public void setListType(BrAPIListTypes listType) {
		this.listType = listType;
	}

	public BrAPIListSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIListSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPIListSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIListSearchRequest addProgramNamesItem(String programNamesItem) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIListSearchRequest listSearchRequest = (BrAPIListSearchRequest) o;
		return Objects.equals(this.commonCropNames, listSearchRequest.commonCropNames)
				&& Objects.equals(this.dateCreatedRangeEnd, listSearchRequest.dateCreatedRangeEnd)
				&& Objects.equals(this.dateCreatedRangeStart, listSearchRequest.dateCreatedRangeStart)
				&& Objects.equals(this.dateModifiedRangeEnd, listSearchRequest.dateModifiedRangeEnd)
				&& Objects.equals(this.dateModifiedRangeStart, listSearchRequest.dateModifiedRangeStart)
				&& Objects.equals(this.externalReferenceIDs, listSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, listSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources, listSearchRequest.externalReferenceSources)
				&& Objects.equals(this.listDbIds, listSearchRequest.listDbIds)
				&& Objects.equals(this.listNames, listSearchRequest.listNames)
				&& Objects.equals(this.listOwnerNames, listSearchRequest.listOwnerNames)
				&& Objects.equals(this.listOwnerPersonDbIds, listSearchRequest.listOwnerPersonDbIds)
				&& Objects.equals(this.listSources, listSearchRequest.listSources)
				&& Objects.equals(this.listType, listSearchRequest.listType)
				&& Objects.equals(this.programDbIds, listSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, listSearchRequest.programNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, dateCreatedRangeEnd, dateCreatedRangeStart, dateModifiedRangeEnd,
				dateModifiedRangeStart, externalReferenceIDs, externalReferenceIds, externalReferenceSources, listDbIds,
				listNames, listOwnerNames, listOwnerPersonDbIds, listSources, listType, programDbIds, programNames);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ListSearchRequest {\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    dateCreatedRangeEnd: ").append(toIndentedString(dateCreatedRangeEnd)).append("\n");
		sb.append("    dateCreatedRangeStart: ").append(toIndentedString(dateCreatedRangeStart)).append("\n");
		sb.append("    dateModifiedRangeEnd: ").append(toIndentedString(dateModifiedRangeEnd)).append("\n");
		sb.append("    dateModifiedRangeStart: ").append(toIndentedString(dateModifiedRangeStart)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    listDbIds: ").append(toIndentedString(listDbIds)).append("\n");
		sb.append("    listNames: ").append(toIndentedString(listNames)).append("\n");
		sb.append("    listOwnerNames: ").append(toIndentedString(listOwnerNames)).append("\n");
		sb.append("    listOwnerPersonDbIds: ").append(toIndentedString(listOwnerPersonDbIds)).append("\n");
		sb.append("    listSources: ").append(toIndentedString(listSources)).append("\n");
		sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
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
