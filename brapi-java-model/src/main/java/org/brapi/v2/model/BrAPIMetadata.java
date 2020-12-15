package org.brapi.v2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;




import javax.validation.Valid;

/**
 * Metadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIMetadata {
	@JsonProperty("datafiles")
	@Valid
	private List<BrAPIDataFile> datafiles = null;

	@JsonProperty("status")
	@Valid
	private List<BrAPIStatus> status = null;

	@JsonProperty("pagination")
	private BrAPIPagination pagination = null;

	public BrAPIMetadata pagination(BrAPIPagination pagination) {
		this.pagination = pagination;
		return this;
	}

	/**
	 * Get pagination
	 * 
	 * @return pagination
	 **/
	

	@Valid
	public BrAPIPagination getPagination() {
		return pagination;
	}

	public void setPagination(BrAPIPagination pagination) {
		this.pagination = pagination;
	}

	public BrAPIMetadata datafiles(List<BrAPIDataFile> datafiles) {
		this.datafiles = datafiles;
		return this;
	}

	public BrAPIMetadata addDatafilesItem(BrAPIDataFile datafilesItem) {
		if (this.datafiles == null) {
			this.datafiles = new ArrayList<BrAPIDataFile>();
		}
		this.datafiles.add(datafilesItem);
		return this;
	}

	/**
	 * The datafiles contains a list of file URLs and metadata. These files contain
	 * additional information related to the returned object and can be retrieved by
	 * a subsequent call. This could be a supplementary data file, an informational
	 * file, the uploaded file where the data originated from, a generated file
	 * representing the whole dataset in a particular format, or any other related
	 * file.
	 * 
	 * @return datafiles
	 **/
	
	@Valid
	public List<BrAPIDataFile> getDatafiles() {
		return datafiles;
	}

	public void setDatafiles(List<BrAPIDataFile> datafiles) {
		this.datafiles = datafiles;
	}

	public BrAPIMetadata status(List<BrAPIStatus> status) {
		this.status = status;
		return this;
	}

	public BrAPIMetadata addStatusItem(BrAPIStatus statusItem) {
		if (this.status == null) {
			this.status = new ArrayList<BrAPIStatus>();
		}
		this.status.add(statusItem);
		return this;
	}

	/**
	 * The status field contains a list of informational status messages from the
	 * server. If no status is reported, an empty list should be returned. See Error
	 * Reporting for more information.
	 * 
	 * @return status
	 **/
	
	@Valid
	public List<BrAPIStatus> getStatus() {
		return status;
	}

	public void setStatus(List<BrAPIStatus> status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIMetadata metadata = (BrAPIMetadata) o;
		return Objects.equals(this.datafiles, metadata.datafiles)
				&& Objects.equals(this.status, metadata.status)
				&& Objects.equals(this.pagination, metadata.pagination) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(datafiles, status, pagination);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Metadata {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
		sb.append("    datafiles: ").append(toIndentedString(datafiles)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
