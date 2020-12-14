package org.brapi.v2.model.germ;

import java.util.Objects;

import org.brapi.v2.model.germ.GermplasmAttributeNewRequest;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * GermplasmAttribute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class GermplasmAttribute extends GermplasmAttributeNewRequest  {
  @JsonProperty("attributeDbId")
  private String attributeDbId = null;

  public GermplasmAttribute attributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies this attribute within the given database server
   * @return attributeDbId
  **/
  
      

    public String getAttributeDbId() {
    return attributeDbId;
  }

  public void setAttributeDbId(String attributeDbId) {
    this.attributeDbId = attributeDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmAttribute germplasmAttribute = (GermplasmAttribute) o;
    return Objects.equals(this.attributeDbId, germplasmAttribute.attributeDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttribute {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributeDbId: ").append(toIndentedString(attributeDbId)).append("\n");
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
