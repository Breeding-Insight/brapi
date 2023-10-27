package org.brapi.v2.model.pheno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BrAPIEventEventParameters
 */

public class BrAPIEventParameters {
	@JsonProperty("code")
	private String code = null;

	@JsonProperty("description")
	private String description = null;

	@Deprecated
	@JsonProperty("key")
	private String key = null;

	@JsonProperty("name")
	private String name = null;

	@Deprecated
	@JsonProperty("rdfValue")
	private String rdfValue = null;

	@JsonProperty("units")
	private String units = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("valueDescription")
	private String valueDescription = null;

	@JsonProperty("valuesByDate")
	private List<String> valuesByDate = null;

	public BrAPIEventParameters code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * The shortened code name of an event parameter &lt;br&gt;ICASA
	 * \&quot;Code_Display\&quot;
	 *
	 * @return code
	 **/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BrAPIEventParameters description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * A human readable description of this event parameter. This description is
	 * usually associated with the &#x27;name&#x27; and &#x27;code&#x27; of an event
	 * parameter.
	 *
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Deprecated
	public BrAPIEventParameters key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;name&#x60;. Github issue number #440
	 * &lt;br&gt;Specifies the relationship between the event and the given
	 * property. E.g. fertilizer, operator
	 *
	 * @return key
	 **/
	@Deprecated
	public String getKey() {
		return key;
	}

	@Deprecated
	public void setKey(String key) {
		this.key = key;
	}

	public BrAPIEventParameters name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The full name of an event parameter &lt;br&gt;ICASA
	 * \&quot;Variable_Name\&quot;
	 *
	 * @return name
	 **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Deprecated
	public BrAPIEventParameters rdfValue(String rdfValue) {
		this.rdfValue = rdfValue;
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;code&#x60;. Github issue number #440
	 * &lt;brThe type of the value given above, e.g. http://xmlns.com/foaf/0.1/Agent
	 *
	 * @return rdfValue
	 **/
	@Deprecated
	public String getRdfValue() {
		return rdfValue;
	}

	@Deprecated
	public void setRdfValue(String rdfValue) {
		this.rdfValue = rdfValue;
	}

	public BrAPIEventParameters units(String units) {
		this.units = units;
		return this;
	}

	/**
	 * The units or data type of the &#x27;value&#x27;. &lt;br&gt;If the
	 * &#x27;value&#x27; comes from a standardized vocabulary or an encoded list of
	 * values, then &#x27;unit&#x27; should be &#x27;code&#x27;. &lt;br&gt;If the
	 * &#x27;value&#x27; IS NOT a number, then &#x27;unit&#x27; should specify a
	 * data type eg. &#x27;text&#x27;, &#x27;boolean&#x27;, &#x27;date&#x27;, etc.
	 * &lt;br&gt;If the value IS a number, then &#x27;unit&#x27; should specify the
	 * units used eg. &#x27;ml&#x27;, &#x27;cm&#x27;, etc &lt;br&gt;ICASA
	 * \&quot;Unit_or_type\&quot;
	 *
	 * @return units
	 **/
	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public BrAPIEventParameters value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The single value of this event parameter. This single value is accurate for
	 * all the dates in the date range. If &#x27;value&#x27; is populated then
	 * &#x27;valuesByDate&#x27; should NOT be populated.
	 *
	 * @return value
	 **/
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BrAPIEventParameters valueDescription(String valueDescription) {
		this.valueDescription = valueDescription;
		return this;
	}

	/**
	 * If the event parameter &#x27;unit&#x27; field is &#x27;code&#x27;, then use
	 * &#x27;valueDescription&#x27; to add a human readable description to the
	 * value.
	 *
	 * @return valueDescription
	 **/
	public String getValueDescription() {
		return valueDescription;
	}

	public void setValueDescription(String valueDescription) {
		this.valueDescription = valueDescription;
	}

	public BrAPIEventParameters valuesByDate(List<String> valuesByDate) {
		this.valuesByDate = valuesByDate;
		return this;
	}

	public BrAPIEventParameters addValuesByDateItem(String valuesByDateItem) {
		if (this.valuesByDate == null) {
			this.valuesByDate = new ArrayList<String>();
		}
		this.valuesByDate.add(valuesByDateItem);
		return this;
	}

	/**
	 * An array of values corresponding to each timestamp in the
	 * &#x27;discreteDates&#x27; array of this event. The &#x27;valuesByDate&#x27;
	 * array should exactly match the size of the &#x27;discreteDates&#x27; array.
	 * If &#x27;valuesByDate&#x27; is populated then &#x27;value&#x27; should NOT be
	 * populated.
	 *
	 * @return valuesByDate
	 **/
	public List<String> getValuesByDate() {
		return valuesByDate;
	}

	public void setValuesByDate(List<String> valuesByDate) {
		this.valuesByDate = valuesByDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIEventParameters BrAPIEventEventParameters = (BrAPIEventParameters) o;
		return Objects.equals(this.code, BrAPIEventEventParameters.code)
				&& Objects.equals(this.description, BrAPIEventEventParameters.description)
				&& Objects.equals(this.key, BrAPIEventEventParameters.key)
				&& Objects.equals(this.name, BrAPIEventEventParameters.name)
				&& Objects.equals(this.rdfValue, BrAPIEventEventParameters.rdfValue)
				&& Objects.equals(this.units, BrAPIEventEventParameters.units)
				&& Objects.equals(this.value, BrAPIEventEventParameters.value)
				&& Objects.equals(this.valueDescription, BrAPIEventEventParameters.valueDescription)
				&& Objects.equals(this.valuesByDate, BrAPIEventEventParameters.valuesByDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, description, key, name, rdfValue, units, value, valueDescription, valuesByDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIEventEventParameters {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    rdfValue: ").append(toIndentedString(rdfValue)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
		sb.append("    valuesByDate: ").append(toIndentedString(valuesByDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
