package org.brapi.v2.model.pheno;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

/**
 * Scale metadata
 */

public class BrAPIScale {
	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

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

	@JsonProperty("scalePUI")
	private String scalePUI = null;

	@JsonProperty("units")
	private String units = null;

	@JsonProperty("validValues")
	private BrAPIScaleValidValues validValues = null;

	@JsonProperty("scaleDbId")
	private String scaleDbId = null;

	private final transient Gson gson = new Gson();

	public BrAPIScale additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIScale putAdditionalInfoItem(String key, Object additionalInfoItem) {
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

	public BrAPIScale dataType(BrAPITraitDataType dataType) {
		this.dataType = dataType;
		return this;
	}

	/**
	 * Get dataType
	 *
	 * @return dataType
	 **/

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

	public BrAPIScale scalePUI(String scalePUI) {
		this.scalePUI = scalePUI;
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Scale, usually in the form of a URI
	 *
	 * @return scalePUI
	 **/
	public String getScalePUI() {
		return scalePUI;
	}

	public void setScalePUI(String scalePUI) {
		this.scalePUI = scalePUI;
	}

	public BrAPIScale units(String units) {
		this.units = units;
		return this;
	}

	/**
	 * This field can be used to describe the units used for this scale. This should
	 * be the abbreviated form of the units, intended to be displayed with every
	 * value using this scale. Usually this only applies when &#x60;dataType&#x60;
	 * is Numeric, but could also be included for other dataTypes when applicable.
	 *
	 * @return units
	 **/
	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
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
	 * Unique identifier of the scale. If left blank, the upload system will
	 * automatically generate a scale ID.
	 * 
	 * @return scaleDbId
	 **/

	public String getScaleDbId() {
		return scaleDbId;
	}

	public void setScaleDbId(String scaleDbId) {
		this.scaleDbId = scaleDbId;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrAPIScale scale = (BrAPIScale) o;
        return Objects.equals(this.additionalInfo, scale.additionalInfo) &&
                Objects.equals(this.dataType, scale.dataType) &&
                Objects.equals(this.decimalPlaces, scale.decimalPlaces) &&
                Objects.equals(this.externalReferences, scale.externalReferences) &&
                Objects.equals(this.ontologyReference, scale.ontologyReference) &&
                Objects.equals(this.scaleDbId, scale.scaleDbId) &&
                Objects.equals(this.scaleName, scale.scaleName) &&
                Objects.equals(this.scalePUI, scale.scalePUI) &&
                Objects.equals(this.units, scale.units) &&
                Objects.equals(this.validValues, scale.validValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, dataType, decimalPlaces, externalReferences, ontologyReference, scaleDbId, scaleName, scalePUI, units, validValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scale {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
        sb.append("    scaleDbId: ").append(toIndentedString(scaleDbId)).append("\n");
        sb.append("    scaleName: ").append(toIndentedString(scaleName)).append("\n");
        sb.append("    scalePUI: ").append(toIndentedString(scalePUI)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
