package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * a custom attributes associated with a cross
 */



public class BrAPICrossCrossAttributes {
  @JsonProperty("crossAttributeName")
  private String crossAttributeName = null;

  @JsonProperty("crossAttributeValue")
  private String crossAttributeValue = null;

  public BrAPICrossCrossAttributes crossAttributeName(String crossAttributeName) {
    this.crossAttributeName = crossAttributeName;
    return this;
  }

  /**
   * the human readable name of a cross attribute
   * @return crossAttributeName
  **/
  
  
    public String getCrossAttributeName() {
    return crossAttributeName;
  }

  public void setCrossAttributeName(String crossAttributeName) {
    this.crossAttributeName = crossAttributeName;
  }

  public BrAPICrossCrossAttributes crossAttributeValue(String crossAttributeValue) {
    this.crossAttributeValue = crossAttributeValue;
    return this;
  }

  /**
   * the value of a cross attribute
   * @return crossAttributeValue
  **/
  
  
    public String getCrossAttributeValue() {
    return crossAttributeValue;
  }

  public void setCrossAttributeValue(String crossAttributeValue) {
    this.crossAttributeValue = crossAttributeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPICrossCrossAttributes crossCrossAttributes = (BrAPICrossCrossAttributes) o;
    return Objects.equals(this.crossAttributeName, crossCrossAttributes.crossAttributeName) &&
        Objects.equals(this.crossAttributeValue, crossCrossAttributes.crossAttributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossAttributeName, crossAttributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossCrossAttributes {\n");
    
    sb.append("    crossAttributeName: ").append(toIndentedString(crossAttributeName)).append("\n");
    sb.append("    crossAttributeValue: ").append(toIndentedString(crossAttributeValue)).append("\n");
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
