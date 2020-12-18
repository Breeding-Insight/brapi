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
  private Integer max = null;

  @JsonProperty("min")
  private Integer min = null;

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
   * @return categories
  **/
  
      @Valid
    public List<BrAPIScaleValidValuesCategories> getCategories() {
    return categories;
  }

  public void setCategories(List<BrAPIScaleValidValuesCategories> categories) {
    this.categories = categories;
  }

  public BrAPIScaleValidValues max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum value (used for field data capture control).
   * @return max
  **/
  
  
    public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public BrAPIScaleValidValues min(Integer min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum value (used for data capture control) for numerical and date scales
   * @return min
  **/
  
  
    public Integer getMin() {
    return min;
  }

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
    return Objects.equals(this.categories, scaleBaseClassValidValues.categories) &&
        Objects.equals(this.max, scaleBaseClassValidValues.max) &&
        Objects.equals(this.min, scaleBaseClassValidValues.min);
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
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
