package org.brapi.v2.model.pheno;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.pheno.BrAPIScaleBaseClassValidValues;
import org.brapi.v2.model.pheno.BrAPITraitDataType;

/**
 * Scale metadata
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIScaleBaseClass {
	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;
	@JsonProperty("dataType")
	private BrAPITraitDataType dataType = null;

	@JsonProperty("decimalPlaces")
	private Integer decimalPlaces = null;

	@JsonProperty("externalReferences")
	private BrAPIExternalReferenceList externalReferences = null;

	@JsonProperty("ontologyReference")
	private BrAPIOntologyReference ontologyReference = null;

	@JsonProperty("scaleName")
	private String scaleName = null;

	@JsonProperty("validValues")
	private BrAPIScaleBaseClassValidValues validValues = null;

	public BrAPIScaleBaseClass additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIScaleBaseClass putAdditionalInfoItem(String key, String additionalInfoItem) {
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

	public BrAPIScaleBaseClass dataType(BrAPITraitDataType dataType) {
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

	public BrAPIScaleBaseClass decimalPlaces(Integer decimalPlaces) {
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

	public BrAPIScaleBaseClass externalReferences(BrAPIExternalReferenceList externalReferences) {
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

	public BrAPIScaleBaseClass ontologyReference(BrAPIOntologyReference ontologyReference) {
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

	public BrAPIScaleBaseClass scaleName(String scaleName) {
		this.scaleName = scaleName;
		return this;
	}

	public String getScaleName() {
		return scaleName;
	}

	public void setScaleName(String scaleName) {
		this.scaleName = scaleName;
	}

	public BrAPIScaleBaseClass validValues(BrAPIScaleBaseClassValidValues validValues) {
		this.validValues = validValues;
		return this;
	}

	/**
	 * Get validValues
	 * 
	 * @return validValues
	 **/
	

	@Valid
	public BrAPIScaleBaseClassValidValues getValidValues() {
		return validValues;
	}

	public void setValidValues(BrAPIScaleBaseClassValidValues validValues) {
		this.validValues = validValues;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIScaleBaseClass scaleBaseClass = (BrAPIScaleBaseClass) o;
		return Objects.equals(this.dataType, scaleBaseClass.dataType)
				&& Objects.equals(this.decimalPlaces, scaleBaseClass.decimalPlaces)
				&& Objects.equals(this.externalReferences, scaleBaseClass.externalReferences)
				&& Objects.equals(this.ontologyReference, scaleBaseClass.ontologyReference)
				&& Objects.equals(this.scaleName, scaleBaseClass.scaleName)
				&& Objects.equals(this.validValues, scaleBaseClass.validValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataType, decimalPlaces, externalReferences, ontologyReference, scaleName, validValues);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScaleBaseClass {\n");

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
