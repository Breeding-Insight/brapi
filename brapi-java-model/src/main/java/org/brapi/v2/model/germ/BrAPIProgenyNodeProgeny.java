package org.brapi.v2.model.germ;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * ProgenyNodeProgeny
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIProgenyNodeProgeny   {
  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("parentType")
  private BrAPIParentType parentType = null;

  public BrAPIProgenyNodeProgeny germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The unique identifier of a progeny germplasm
   * @return germplasmDbId
  **/
  
      

    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIProgenyNodeProgeny germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * The human readable name of a progeny germplasm
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIProgenyNodeProgeny parentType(BrAPIParentType parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Given a germplasm A having a progeny B and C, 'parentType' for progeny B item refers to the 'parentType' of A toward B.
   * @return parentType
  **/
  
      

    public BrAPIParentType getParentType() {
    return parentType;
  }

  public void setParentType(BrAPIParentType parentType) {
    this.parentType = parentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIProgenyNodeProgeny progenyNodeProgeny = (BrAPIProgenyNodeProgeny) o;
    return Objects.equals(this.germplasmDbId, progenyNodeProgeny.germplasmDbId) &&
        Objects.equals(this.germplasmName, progenyNodeProgeny.germplasmName) &&
        Objects.equals(this.parentType, progenyNodeProgeny.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbId, germplasmName, parentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgenyNodeProgeny {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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
