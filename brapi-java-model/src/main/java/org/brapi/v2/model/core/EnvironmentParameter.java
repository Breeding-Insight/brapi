package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * EnvironmentParameter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class EnvironmentParameter   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("parameterName")
  private String parameterName = null;

  @JsonProperty("parameterPUI")
  private String parameterPUI = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("unitPUI")
  private String unitPUI = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valuePUI")
  private String valuePUI = null;

  public EnvironmentParameter description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable value of the environment parameter (defined above) constant within the experiment
   * @return description
  **/
  
      

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnvironmentParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  /**
   * Name of the environment parameter constant within the experiment
   * @return parameterName
  **/
  
      

    public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public EnvironmentParameter parameterPUI(String parameterPUI) {
    this.parameterPUI = parameterPUI;
    return this;
  }

  /**
   * URI pointing to an ontology class for the parameter
   * @return parameterPUI
  **/
  
  
    public String getParameterPUI() {
    return parameterPUI;
  }

  public void setParameterPUI(String parameterPUI) {
    this.parameterPUI = parameterPUI;
  }

  public EnvironmentParameter unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit of the value for this parameter
   * @return unit
  **/
  
  
    public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public EnvironmentParameter unitPUI(String unitPUI) {
    this.unitPUI = unitPUI;
    return this;
  }

  /**
   * URI pointing to an ontology class for the unit
   * @return unitPUI
  **/
  
  
    public String getUnitPUI() {
    return unitPUI;
  }

  public void setUnitPUI(String unitPUI) {
    this.unitPUI = unitPUI;
  }

  public EnvironmentParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Numerical or categorical value
   * @return value
  **/
  
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public EnvironmentParameter valuePUI(String valuePUI) {
    this.valuePUI = valuePUI;
    return this;
  }

  /**
   * URI pointing to an ontology class for the parameter value
   * @return valuePUI
  **/
  
  
    public String getValuePUI() {
    return valuePUI;
  }

  public void setValuePUI(String valuePUI) {
    this.valuePUI = valuePUI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentParameter environmentParameter = (EnvironmentParameter) o;
    return Objects.equals(this.description, environmentParameter.description) &&
        Objects.equals(this.parameterName, environmentParameter.parameterName) &&
        Objects.equals(this.parameterPUI, environmentParameter.parameterPUI) &&
        Objects.equals(this.unit, environmentParameter.unit) &&
        Objects.equals(this.unitPUI, environmentParameter.unitPUI) &&
        Objects.equals(this.value, environmentParameter.value) &&
        Objects.equals(this.valuePUI, environmentParameter.valuePUI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, parameterName, parameterPUI, unit, unitPUI, value, valuePUI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentParameter {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterPUI: ").append(toIndentedString(parameterPUI)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitPUI: ").append(toIndentedString(unitPUI)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valuePUI: ").append(toIndentedString(valuePUI)).append("\n");
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
