package org.brapi.v2.model.germ;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.germ.BrAPICrossNewRequestCrossAttributes;
import org.brapi.v2.model.germ.BrAPICrossParent;

/**
 * CrossNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPICrossNewRequest {
	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;

	@JsonProperty("crossAttributes")
	@Valid
	private List<BrAPICrossNewRequestCrossAttributes> crossAttributes = null;

	@JsonProperty("crossName")
	private String crossName = null;

	@JsonProperty("crossType")
	private BrAPICrossType crossType = null;

	@JsonProperty("crossingProjectDbId")
	private String crossingProjectDbId = null;

	@JsonProperty("crossingProjectName")
	private String crossingProjectName = null;

	@JsonProperty("externalReferences")
	private BrAPIExternalReferenceList externalReferences = null;

	@JsonProperty("parent1")
	private BrAPICrossParent parent1 = null;

	@JsonProperty("parent2")
	private BrAPICrossParent parent2 = null;

	@JsonProperty("pollinationTimeStamp")
	private OffsetDateTime pollinationTimeStamp = null;

	public BrAPICrossNewRequest additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPICrossNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
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

	public BrAPICrossNewRequest crossAttributes(List<BrAPICrossNewRequestCrossAttributes> crossAttributes) {
		this.crossAttributes = crossAttributes;
		return this;
	}

	public BrAPICrossNewRequest addCrossAttributesItem(BrAPICrossNewRequestCrossAttributes crossAttributesItem) {
		if (this.crossAttributes == null) {
			this.crossAttributes = new ArrayList<BrAPICrossNewRequestCrossAttributes>();
		}
		this.crossAttributes.add(crossAttributesItem);
		return this;
	}

	/**
	 * Set of custom attributes associated with a cross
	 * 
	 * @return crossAttributes
	 **/
	
	@Valid
	public List<BrAPICrossNewRequestCrossAttributes> getCrossAttributes() {
		return crossAttributes;
	}

	public void setCrossAttributes(List<BrAPICrossNewRequestCrossAttributes> crossAttributes) {
		this.crossAttributes = crossAttributes;
	}

	public BrAPICrossNewRequest crossName(String crossName) {
		this.crossName = crossName;
		return this;
	}

	/**
	 * the human readable name for a cross
	 * 
	 * @return crossName
	 **/
	

	public String getCrossName() {
		return crossName;
	}

	public void setCrossName(String crossName) {
		this.crossName = crossName;
	}

	public BrAPICrossNewRequest crossType(BrAPICrossType crossType) {
		this.crossType = crossType;
		return this;
	}

	/**
	 * the type of cross
	 * 
	 * @return crossType
	 **/
	

	public BrAPICrossType getCrossType() {
		return crossType;
	}

	public void setCrossType(BrAPICrossType crossType) {
		this.crossType = crossType;
	}

	public BrAPICrossNewRequest crossingProjectDbId(String crossingProjectDbId) {
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	/**
	 * the unique identifier for a crossing project
	 * 
	 * @return crossingProjectDbId
	 **/
	

	public String getCrossingProjectDbId() {
		return crossingProjectDbId;
	}

	public void setCrossingProjectDbId(String crossingProjectDbId) {
		this.crossingProjectDbId = crossingProjectDbId;
	}

	public BrAPICrossNewRequest crossingProjectName(String crossingProjectName) {
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

	public BrAPICrossNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
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

	public BrAPICrossNewRequest parent1(BrAPICrossParent parent1) {
		this.parent1 = parent1;
		return this;
	}

	/**
	 * Get parent1
	 * 
	 * @return parent1
	 **/
	

	@Valid
	public BrAPICrossParent getParent1() {
		return parent1;
	}

	public void setParent1(BrAPICrossParent parent1) {
		this.parent1 = parent1;
	}

	public BrAPICrossNewRequest parent2(BrAPICrossParent parent2) {
		this.parent2 = parent2;
		return this;
	}

	/**
	 * Get parent2
	 * 
	 * @return parent2
	 **/
	

	@Valid
	public BrAPICrossParent getParent2() {
		return parent2;
	}

	public void setParent2(BrAPICrossParent parent2) {
		this.parent2 = parent2;
	}

	public BrAPICrossNewRequest pollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
		this.pollinationTimeStamp = pollinationTimeStamp;
		return this;
	}

	/**
	 * the timestamp when the pollination took place
	 * 
	 * @return pollinationTimeStamp
	 **/
	

	@Valid
	public OffsetDateTime getPollinationTimeStamp() {
		return pollinationTimeStamp;
	}

	public void setPollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
		this.pollinationTimeStamp = pollinationTimeStamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPICrossNewRequest crossNewRequest = (BrAPICrossNewRequest) o;
		return Objects.equals(this.additionalInfo, crossNewRequest.additionalInfo)
				&& Objects.equals(this.crossAttributes, crossNewRequest.crossAttributes)
				&& Objects.equals(this.crossName, crossNewRequest.crossName)
				&& Objects.equals(this.crossType, crossNewRequest.crossType)
				&& Objects.equals(this.crossingProjectDbId, crossNewRequest.crossingProjectDbId)
				&& Objects.equals(this.crossingProjectName, crossNewRequest.crossingProjectName)
				&& Objects.equals(this.externalReferences, crossNewRequest.externalReferences)
				&& Objects.equals(this.parent1, crossNewRequest.parent1)
				&& Objects.equals(this.parent2, crossNewRequest.parent2)
				&& Objects.equals(this.pollinationTimeStamp, crossNewRequest.pollinationTimeStamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, crossAttributes, crossName, crossType, crossingProjectDbId,
				crossingProjectName, externalReferences, parent1, parent2, pollinationTimeStamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CrossNewRequest {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    crossAttributes: ").append(toIndentedString(crossAttributes)).append("\n");
		sb.append("    crossName: ").append(toIndentedString(crossName)).append("\n");
		sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
		sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
		sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    parent1: ").append(toIndentedString(parent1)).append("\n");
		sb.append("    parent2: ").append(toIndentedString(parent2)).append("\n");
		sb.append("    pollinationTimeStamp: ").append(toIndentedString(pollinationTimeStamp)).append("\n");
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
