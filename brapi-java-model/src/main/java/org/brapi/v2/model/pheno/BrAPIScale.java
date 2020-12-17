package org.brapi.v2.model.pheno;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;

/**
 * Scale metadata
 */

public class BrAPIScale {
	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;
	@JsonProperty("dataType")
	private BrAPITraitDataType dataType = null;

	@JsonProperty("decimalPlaces")
	private Integer decimalPlaces = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("ontologyReference")
	private BrAPIOntologyReference ontologyReference = null;

	@JsonProperty("scaleName")
	private String scaleName = null;

	@JsonProperty("validValues")
	private BrAPIScaleValidValues validValues = null;

	@JsonProperty("scaleDbId")
	private String scaleDbId = null;

	public BrAPIScale additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIScale putAdditionalInfoItem(String key, String additionalInfoItem) {
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

	public BrAPIScale dataType(BrAPITraitDataType dataType) {
		this.dataType = dataType;
		return this;
	}

	/**
	 * Get dataType
	 *
	 * @return dataType
	 **/


	@Valid
	public BrAPITraitDataType getDataType() {
		return dataType;
	}

	public void setDataType(BrAPITraitDataType dataType) {
		this.dataType = dataType;
	}

	public BrAPIScale decimalPlaces(Integer decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
		return this;
	}

	/**
	 * For numerical, number of decimal places to be reported
	 *
	 * @return decimalPlaces
	 **/


	public Integer getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(Integer decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	public BrAPIScale externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 *
	 * @return externalReferences
	 **/


	@Valid
	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIScale ontologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
		return this;
	}

	/**
	 * Get ontologyReference
	 *
	 * @return ontologyReference
	 **/


	@Valid
	public BrAPIOntologyReference getOntologyReference() {
		return ontologyReference;
	}

	public void setOntologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
	}

	public BrAPIScale scaleName(String scaleName) {
		this.scaleName = scaleName;
		return this;
	}

	public String getScaleName() {
		return scaleName;
	}

	public void setScaleName(String scaleName) {
		this.scaleName = scaleName;
	}

	public BrAPIScale validValues(BrAPIScaleValidValues validValues) {
		this.validValues = validValues;
		return this;
	}

	/**
	 * Get validValues
	 *
	 * @return validValues
	 **/


	@Valid
	public BrAPIScaleValidValues getValidValues() {
		return validValues;
	}

	public void setValidValues(BrAPIScaleValidValues validValues) {
		this.validValues = validValues;
	}

	public BrAPIScale scaleDbId(String scaleDbId) {
		this.scaleDbId = scaleDbId;
		return this;
	}

	/**
	 * Unique identifier of the scale. If left blank, the upload system will automatically generate a scale ID.
	 * @return scaleDbId
	 **/



	public String getScaleDbId() {
		return scaleDbId;
	}

	public void setScaleDbId(String scaleDbId) {
		this.scaleDbId = scaleDbId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIScale scale = (BrAPIScale) o;
		return Objects.equals(this.scaleDbId, scale.scaleDbId)
				&& Objects.equals(this.dataType, scale.dataType)
				&& Objects.equals(this.decimalPlaces, scale.decimalPlaces)
				&& Objects.equals(this.externalReferences, scale.externalReferences)
				&& Objects.equals(this.ontologyReference, scale.ontologyReference)
				&& Objects.equals(this.scaleName, scale.scaleName)
				&& Objects.equals(this.validValues, scale.validValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(scaleDbId, dataType, decimalPlaces, externalReferences, ontologyReference, scaleName, validValues);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScaleBaseClass {\n");
		sb.append("    scaleDbId: ").append(toIndentedString(scaleDbId)).append("\n");
		sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
		sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
		sb.append("    scaleName: ").append(toIndentedString(scaleName)).append("\n");
		sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
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
