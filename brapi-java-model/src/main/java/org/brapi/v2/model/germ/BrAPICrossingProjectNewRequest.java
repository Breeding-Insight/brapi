package org.brapi.v2.model.germ;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;

/**
 * CrossingProjectNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPICrossingProjectNewRequest {
	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("crossingProjectDescription")
	private String crossingProjectDescription = null;

	@JsonProperty("crossingProjectName")
	private String crossingProjectName = null;

	@JsonProperty("externalReferences")
	private BrAPIExternalReferenceList externalReferences = null;

	@JsonProperty("programDbId")
	private String programDbId = null;

	@JsonProperty("programName")
	private String programName = null;

	public BrAPICrossingProjectNewRequest additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPICrossingProjectNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new HashMap<String, String>();
		}
		this.additionalInfo.put(key, additionalInfoItem);
		return this;
	}

	/**
	 * Additional arbitrary info
	 * 
	 * @return additionalInfo
	 **/
	

	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPICrossingProjectNewRequest commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * the common name of a crop (for multi-crop systems)
	 * 
	 * @return commonCropName
	 **/
	

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPICrossingProjectNewRequest crossingProjectDescription(String crossingProjectDescription) {
		this.crossingProjectDescription = crossingProjectDescription;
		return this;
	}

	/**
	 * the description for a crossing project
	 * 
	 * @return crossingProjectDescription
	 **/
	

	public String getCrossingProjectDescription() {
		return crossingProjectDescription;
	}

	public void setCrossingProjectDescription(String crossingProjectDescription) {
		this.crossingProjectDescription = crossingProjectDescription;
	}

	public BrAPICrossingProjectNewRequest crossingProjectName(String crossingProjectName) {
		this.crossingProjectName = crossingProjectName;
		return this;
	}

	/**
	 * the human readable name for a crossing project
	 * 
	 * @return crossingProjectName
	 **/
	

	public String getCrossingProjectName() {
		return crossingProjectName;
	}

	public void setCrossingProjectName(String crossingProjectName) {
		this.crossingProjectName = crossingProjectName;
	}

	public BrAPICrossingProjectNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 * 
	 * @return externalReferences
	 **/
	

	@Valid
	public BrAPIExternalReferenceList getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(BrAPIExternalReferenceList externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPICrossingProjectNewRequest programDbId(String programDbId) {
		this.programDbId = programDbId;
		return this;
	}

	/**
	 * the unique identifier for a program
	 * 
	 * @return programDbId
	 **/
	

	public String getProgramDbId() {
		return programDbId;
	}

	public void setProgramDbId(String programDbId) {
		this.programDbId = programDbId;
	}

	public BrAPICrossingProjectNewRequest programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * the human readable name for a program
	 * 
	 * @return programName
	 **/
	

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPICrossingProjectNewRequest crossingProjectNewRequest = (BrAPICrossingProjectNewRequest) o;
		return Objects.equals(this.commonCropName, crossingProjectNewRequest.commonCropName)
				&& Objects.equals(this.crossingProjectDescription, crossingProjectNewRequest.crossingProjectDescription)
				&& Objects.equals(this.crossingProjectName, crossingProjectNewRequest.crossingProjectName)
				&& Objects.equals(this.externalReferences, crossingProjectNewRequest.externalReferences)
				&& Objects.equals(this.programDbId, crossingProjectNewRequest.programDbId)
				&& Objects.equals(this.programName, crossingProjectNewRequest.programName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropName, crossingProjectDescription, crossingProjectName, externalReferences,
				programDbId, programName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CrossingProjectNewRequest {\n");

		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    crossingProjectDescription: ").append(toIndentedString(crossingProjectDescription)).append("\n");
		sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
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
