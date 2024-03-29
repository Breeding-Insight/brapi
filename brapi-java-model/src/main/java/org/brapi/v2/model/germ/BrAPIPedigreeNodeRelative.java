package org.brapi.v2.model.germ;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;




/**
 * PedigreeNodeParents
 */


public class BrAPIPedigreeNodeRelative   {
  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("parentType")
  private BrAPIParentType parentType = null;

  public BrAPIPedigreeNodeRelative germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The germplasm DbId of the parent of this germplasm
   * @return germplasmDbId
  **/
  
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIPedigreeNodeRelative germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * the human readable name of the parent of this germplasm
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIPedigreeNodeRelative parentType(BrAPIParentType parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * The type of parent the parent is. ex. 'MALE', 'FEMALE', 'SELF', 'POPULATION', etc.
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
    BrAPIPedigreeNodeRelative pedigreeNodeParents = (BrAPIPedigreeNodeRelative) o;
    return Objects.equals(this.germplasmDbId, pedigreeNodeParents.germplasmDbId) &&
        Objects.equals(this.germplasmName, pedigreeNodeParents.germplasmName) &&
        Objects.equals(this.parentType, pedigreeNodeParents.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbId, germplasmName, parentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedigreeNodeParents {\n");
    
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
