package org.brapi.v2.model.germ;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * PedigreeNodeParents
 */


@Deprecated
public class BrAPIPedigreeNodeParents extends BrAPIPedigreeNodeRelative {

  public BrAPIPedigreeNodeParents germplasmDbId(String germplasmDbId) {
    super.setGermplasmDbId(germplasmDbId);
    return this;
  }

  /**
   * The germplasm DbId of the parent of this germplasm
   * @return germplasmDbId
  **/
  
  @Deprecated
  public String getGermplasmDbId() {
  return super.getGermplasmDbId();
  }

  @Deprecated
  public void setGermplasmDbId(String germplasmDbId) {
    super.setGermplasmDbId(germplasmDbId);
  }

  @Deprecated
  public BrAPIPedigreeNodeParents germplasmName(String germplasmName) {
    super.setGermplasmName(germplasmName);
    return this;
  }

  /**
   * the human readable name of the parent of this germplasm
   * @return germplasmName
  **/

  @Deprecated
  public String getGermplasmName() {
    return super.getGermplasmName();
  }

  @Deprecated
  public void setGermplasmName(String germplasmName) {
    super.setGermplasmName(germplasmName);
  }

  @Deprecated
  public BrAPIPedigreeNodeParents parentType(BrAPIParentType parentType) {
    super.setParentType(parentType);
    return this;
  }

  /**
   * The type of parent the parent is. ex. 'MALE', 'FEMALE', 'SELF', 'POPULATION', etc.
   * @return parentType
  **/

  @Deprecated
  public BrAPIParentType getParentType() {
    return super.getParentType();
  }

  @Deprecated
  public void setParentType(BrAPIParentType parentType) {
    super.setParentType(parentType);
  }


  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedigreeNodeParents {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(super.getGermplasmDbId())).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(super.getGermplasmName())).append("\n");
    sb.append("    parentType: ").append(toIndentedString(super.getParentType())).append("\n");
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
