package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * ScaleBaseClassValidValues
 */

public class BrAPIScaleValidValues {
	@JsonProperty("categories")
	@Valid
	private List<BrAPIScaleValidValuesCategories> categories = null;

	@JsonProperty("max")
	@Deprecated
	private Integer max = null;

	@JsonProperty("maximumValue")
	private String maximumValue = null;

	@JsonProperty("min")
	@Deprecated
	private Integer min = null;

	@JsonProperty("minimumValue")
	private String minimumValue = null;

	public BrAPIScaleValidValues categories(List<BrAPIScaleValidValuesCategories> categories) {
		this.categories = categories;
		return this;
	}

	public BrAPIScaleValidValues addCategoriesItem(BrAPIScaleValidValuesCategories categoriesItem) {
		if (this.categories == null) {
			this.categories = new ArrayList<BrAPIScaleValidValuesCategories>();
		}
		this.categories.add(categoriesItem);
		return this;
	}

	/**
	 * List of possible values with optional labels
	 * 
	 * @return categories
	 **/

	@Valid
	public List<BrAPIScaleValidValuesCategories> getCategories() {
		return categories;
	}

	public void setCategories(List<BrAPIScaleValidValuesCategories> categories) {
		this.categories = categories;
	}

	public BrAPIScaleValidValues maximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
		return this;
	}

	/**
	 * Maximum value for numerical, date, and time scales. Typically used for data
	 * capture control and QC.
	 *
	 * @return maximumValue
	 **/
	public String getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(String maximumValue) {
		this.maximumValue = maximumValue;
	}

	public BrAPIScaleValidValues minimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
		return this;
	}

	/**
	 * Minimum value for numerical, date, and time scales. Typically used for data
	 * capture control and QC.
	 *
	 * @return minimumValue
	 **/
	public String getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
	}

	@Deprecated
	public BrAPIScaleValidValues max(Integer max) {
		this.max = max;
		return this;
	}

	/**
	 * Maximum value (used for field data capture control).
	 * 
	 * @return max
	 **/

	@Deprecated
	public Integer getMax() {
		return max;
	}

	@Deprecated
	public void setMax(Integer max) {
		this.max = max;
	}

	@Deprecated
	public BrAPIScaleValidValues min(Integer min) {
		this.min = min;
		return this;
	}

	/**
	 * Minimum value (used for data capture control) for numerical and date scales
	 * 
	 * @return min
	 **/

	@Deprecated
	public Integer getMin() {
		return min;
	}

	@Deprecated
	public void setMin(Integer min) {
		this.min = min;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIScaleValidValues scaleBaseClassValidValues = (BrAPIScaleValidValues) o;
		return Objects.equals(this.categories, scaleBaseClassValidValues.categories)
				&& Objects.equals(this.max, scaleBaseClassValidValues.max)
				&& Objects.equals(this.maximumValue, scaleBaseClassValidValues.maximumValue)
				&& Objects.equals(this.min, scaleBaseClassValidValues.min)
				&& Objects.equals(this.minimumValue, scaleBaseClassValidValues.minimumValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(categories, max, min);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScaleBaseClassValidValues {\n");

		sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
		sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
		sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
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
