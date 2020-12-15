package org.brapi.v2.model.germ;

import java.util.Objects;

import org.brapi.v2.model.pheno.BrAPIVariableBaseClass;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * GermplasmAttributeNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIGermplasmAttributeNewRequest extends BrAPIVariableBaseClass  {
  @JsonProperty("attributeCategory")
  private String attributeCategory = null;

  @JsonProperty("attributeDescription")
  private String attributeDescription = null;

  @JsonProperty("attributeName")
  private String attributeName = null;

  public BrAPIGermplasmAttributeNewRequest attributeCategory(String attributeCategory) {
    this.attributeCategory = attributeCategory;
    return this;
  }

  /**
   * General category for the attribute. very similar to Trait class.
   * @return attributeCategory
  **/
  
  
    public String getAttributeCategory() {
    return attributeCategory;
  }

  public void setAttributeCategory(String attributeCategory) {
    this.attributeCategory = attributeCategory;
  }

  public BrAPIGermplasmAttributeNewRequest attributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
    return this;
  }

  /**
   * A human readable description of this attribute
   * @return attributeDescription
  **/
  
  
    public String getAttributeDescription() {
    return attributeDescription;
  }

  public void setAttributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
  }

  public BrAPIGermplasmAttributeNewRequest attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * A human readable name for this attribute
   * @return attributeName
  **/
    public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmAttributeNewRequest germplasmAttributeNewRequest = (BrAPIGermplasmAttributeNewRequest) o;
    return Objects.equals(this.attributeCategory, germplasmAttributeNewRequest.attributeCategory) &&
        Objects.equals(this.attributeDescription, germplasmAttributeNewRequest.attributeDescription) &&
        Objects.equals(this.attributeName, germplasmAttributeNewRequest.attributeName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeCategory, attributeDescription, attributeName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeNewRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributeCategory: ").append(toIndentedString(attributeCategory)).append("\n");
    sb.append("    attributeDescription: ").append(toIndentedString(attributeDescription)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
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
