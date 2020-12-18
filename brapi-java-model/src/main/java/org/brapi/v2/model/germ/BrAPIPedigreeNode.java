package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.germ.BrAPIPedigreeNodeParents;
import org.brapi.v2.model.germ.BrAPIPedigreeNodeSiblings;


/**
 * PedigreeNode
 */


public class BrAPIPedigreeNode   {
  @JsonProperty("crossingProjectDbId")
  private String crossingProjectDbId = null;

  @JsonProperty("crossingYear")
  private Integer crossingYear = null;

  @JsonProperty("familyCode")
  private String familyCode = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("parents")
  @Valid
  private List<BrAPIPedigreeNodeParents> parents = null;

  @JsonProperty("pedigree")
  private String pedigree = null;

  @JsonProperty("siblings")
  @Valid
  private List<BrAPIPedigreeNodeSiblings> siblings = null;

  public BrAPIPedigreeNode crossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
    return this;
  }

  /**
   * The crossing project used to generate this germplasm
   * @return crossingProjectDbId
  **/
  
  
    public String getCrossingProjectDbId() {
    return crossingProjectDbId;
  }

  public void setCrossingProjectDbId(String crossingProjectDbId) {
    this.crossingProjectDbId = crossingProjectDbId;
  }

  public BrAPIPedigreeNode crossingYear(Integer crossingYear) {
    this.crossingYear = crossingYear;
    return this;
  }

  /**
   * The year the parents were originally crossed
   * @return crossingYear
  **/
  
  
    public Integer getCrossingYear() {
    return crossingYear;
  }

  public void setCrossingYear(Integer crossingYear) {
    this.crossingYear = crossingYear;
  }

  public BrAPIPedigreeNode familyCode(String familyCode) {
    this.familyCode = familyCode;
    return this;
  }

  /**
   * The code representing the family
   * @return familyCode
  **/
  
  
    public String getFamilyCode() {
    return familyCode;
  }

  public void setFamilyCode(String familyCode) {
    this.familyCode = familyCode;
  }

  public BrAPIPedigreeNode germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm
   * @return germplasmDbId
  **/
  
      

    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIPedigreeNode germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * A human readable name for a germplasm
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIPedigreeNode parents(List<BrAPIPedigreeNodeParents> parents) {
    this.parents = parents;
    return this;
  }

  public BrAPIPedigreeNode addParentsItem(BrAPIPedigreeNodeParents parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<BrAPIPedigreeNodeParents>();
    }
    this.parents.add(parentsItem);
    return this;
  }

  /**
   * List of parent nodes in the pedigree tree.
   * @return parents
  **/
  
      @Valid
    public List<BrAPIPedigreeNodeParents> getParents() {
    return parents;
  }

  public void setParents(List<BrAPIPedigreeNodeParents> parents) {
    this.parents = parents;
  }

  public BrAPIPedigreeNode pedigree(String pedigree) {
    this.pedigree = pedigree;
    return this;
  }

  /**
   * The string representation of the pedigree.
   * @return pedigree
  **/
  
  
    public String getPedigree() {
    return pedigree;
  }

  public void setPedigree(String pedigree) {
    this.pedigree = pedigree;
  }

  public BrAPIPedigreeNode siblings(List<BrAPIPedigreeNodeSiblings> siblings) {
    this.siblings = siblings;
    return this;
  }

  public BrAPIPedigreeNode addSiblingsItem(BrAPIPedigreeNodeSiblings siblingsItem) {
    if (this.siblings == null) {
      this.siblings = new ArrayList<BrAPIPedigreeNodeSiblings>();
    }
    this.siblings.add(siblingsItem);
    return this;
  }

  /**
   * List of sibling germplasm
   * @return siblings
  **/
  
      @Valid
    public List<BrAPIPedigreeNodeSiblings> getSiblings() {
    return siblings;
  }

  public void setSiblings(List<BrAPIPedigreeNodeSiblings> siblings) {
    this.siblings = siblings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIPedigreeNode pedigreeNode = (BrAPIPedigreeNode) o;
    return Objects.equals(this.crossingProjectDbId, pedigreeNode.crossingProjectDbId) &&
        Objects.equals(this.crossingYear, pedigreeNode.crossingYear) &&
        Objects.equals(this.familyCode, pedigreeNode.familyCode) &&
        Objects.equals(this.germplasmDbId, pedigreeNode.germplasmDbId) &&
        Objects.equals(this.germplasmName, pedigreeNode.germplasmName) &&
        Objects.equals(this.parents, pedigreeNode.parents) &&
        Objects.equals(this.pedigree, pedigreeNode.pedigree) &&
        Objects.equals(this.siblings, pedigreeNode.siblings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossingProjectDbId, crossingYear, familyCode, germplasmDbId, germplasmName, parents, pedigree, siblings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedigreeNode {\n");
    
    sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
    sb.append("    crossingYear: ").append(toIndentedString(crossingYear)).append("\n");
    sb.append("    familyCode: ").append(toIndentedString(familyCode)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    pedigree: ").append(toIndentedString(pedigree)).append("\n");
    sb.append("    siblings: ").append(toIndentedString(siblings)).append("\n");
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
