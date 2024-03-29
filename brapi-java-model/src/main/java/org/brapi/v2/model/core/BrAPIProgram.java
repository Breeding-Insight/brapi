package org.brapi.v2.model.core;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

/**
 * Program
 */

public class BrAPIProgram {
	@JsonProperty("programDbId")
	private String programDbId = null;

	@JsonProperty("abbreviation")
	private String abbreviation = null;

	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("documentationURL")
	private String documentationURL = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("leadPersonDbId")
	private String leadPersonDbId = null;

	@JsonProperty("leadPersonName")
	private String leadPersonName = null;

	@JsonProperty("objective")
	private String objective = null;

	@JsonProperty("programName")
	private String programName = null;

	@JsonProperty("programType")
	private String programType = null;

	@JsonProperty("fundingInformation")
	private String fundingInformation = null;

	private final transient Gson gson = new Gson();

	public BrAPIProgram programDbId(String programDbId) {
		this.programDbId = programDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies the program
	 * 
	 * @return programDbId
	 **/

	public String getProgramDbId() {
		return programDbId;
	}

	public void setProgramDbId(String programDbId) {
		this.programDbId = programDbId;
	}

	public BrAPIProgram abbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
		return this;
	}

	/**
	 * An abbreviation which represents this program
	 * 
	 * @return abbreviation
	 **/

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public BrAPIProgram additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIProgram putAdditionalInfoItem(String key, Object additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new JsonObject();
		}
		JsonElement newElement = gson.toJsonTree(additionalInfoItem);
		this.additionalInfo.add(key, newElement);
		return this;
	}

	/**
	 * Additional arbitrary info
	 * 
	 * @return additionalInfo
	 **/

	public JsonObject getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPIProgram commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Common name for the crop which this program is for
	 * 
	 * @return commonCropName
	 **/

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPIProgram documentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
		return this;
	}

	/**
	 * A URL to the human readable documentation of this object
	 * 
	 * @return documentationURL
	 **/

	public String getDocumentationURL() {
		return documentationURL;
	}

	public void setDocumentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
	}

	public BrAPIProgram externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 * 
	 * @return externalReferences
	 **/

	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIProgram leadPersonDbId(String leadPersonDbId) {
		this.leadPersonDbId = leadPersonDbId;
		return this;
	}

	/**
	 * The unique identifier of the program leader
	 * 
	 * @return leadPersonDbId
	 **/

	public String getLeadPersonDbId() {
		return leadPersonDbId;
	}

	public void setLeadPersonDbId(String leadPersonDbId) {
		this.leadPersonDbId = leadPersonDbId;
	}

	public BrAPIProgram leadPersonName(String leadPersonName) {
		this.leadPersonName = leadPersonName;
		return this;
	}

	/**
	 * The name of the program leader
	 * 
	 * @return leadPersonName
	 **/

	public String getLeadPersonName() {
		return leadPersonName;
	}

	public void setLeadPersonName(String leadPersonName) {
		this.leadPersonName = leadPersonName;
	}

	public BrAPIProgram objective(String objective) {
		this.objective = objective;
		return this;
	}

	/**
	 * The primary objective of the program
	 * 
	 * @return objective
	 **/

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public BrAPIProgram programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * Human readable name of the program
	 * 
	 * @return programName
	 **/

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public BrAPIProgram programType(String programType) {
		this.programType = programType;
		return this;
	}

	/**
	 * Human readable name of the program
	 * 
	 * @return programType
	 **/

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	public BrAPIProgram fundingInformation(String fundingInformation) {
		this.fundingInformation = fundingInformation;
		return this;
	}

	/**
	 * Human readable name of the program
	 * 
	 * @return fundingInformation
	 **/

	public String getFundingInformation() {
		return fundingInformation;
	}

	public void setFundingInformation(String fundingInformation) {
		this.fundingInformation = fundingInformation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIProgram program = (BrAPIProgram) o;
		return Objects.equals(this.programDbId, program.programDbId)
				&& Objects.equals(this.abbreviation, program.abbreviation)
				&& Objects.equals(this.additionalInfo, program.additionalInfo)
				&& Objects.equals(this.commonCropName, program.commonCropName)
				&& Objects.equals(this.documentationURL, program.documentationURL)
				&& Objects.equals(this.externalReferences, program.externalReferences)
				&& Objects.equals(this.leadPersonDbId, program.leadPersonDbId)
				&& Objects.equals(this.leadPersonName, program.leadPersonName)
				&& Objects.equals(this.objective, program.objective)
				&& Objects.equals(this.programName, program.programName)
				&& Objects.equals(this.programType, program.programType)
				&& Objects.equals(this.fundingInformation, program.fundingInformation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programDbId, abbreviation, additionalInfo, commonCropName, documentationURL,
				externalReferences, leadPersonDbId, leadPersonName, objective, programName, programType,
				fundingInformation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Program {\n");
		sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
		sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    leadPersonDbId: ").append(toIndentedString(leadPersonDbId)).append("\n");
		sb.append("    leadPersonName: ").append(toIndentedString(leadPersonName)).append("\n");
		sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
		sb.append("    programType: ").append(toIndentedString(programType)).append("\n");
		sb.append("    fundingInformation: ").append(toIndentedString(fundingInformation)).append("\n");
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
