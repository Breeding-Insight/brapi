package io.swagger.client.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.germ.PedigreeNodeParents;
import io.swagger.client.model.germ.PedigreeNodeSiblings;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * PedigreeNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class PedigreeNode   {
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
  private List<PedigreeNodeParents> parents = null;

  @JsonProperty("pedigree")
  private String pedigree = null;

  @JsonProperty("siblings")
  @Valid
  private List<PedigreeNodeSiblings> siblings = null;

  public PedigreeNode crossingProjectDbId(String crossingProjectDbId) {
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

  public PedigreeNode crossingYear(Integer crossingYear) {
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

  public PedigreeNode familyCode(String familyCode) {
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

  public PedigreeNode germplasmDbId(String germplasmDbId) {
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

  public PedigreeNode germplasmName(String germplasmName) {
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

  public PedigreeNode parents(List<PedigreeNodeParents> parents) {
    this.parents = parents;
    return this;
  }

  public PedigreeNode addParentsItem(PedigreeNodeParents parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<PedigreeNodeParents>();
    }
    this.parents.add(parentsItem);
    return this;
  }

  /**
   * List of parent nodes in the pedigree tree.
   * @return parents
  **/
  
      @Valid
    public List<PedigreeNodeParents> getParents() {
    return parents;
  }

  public void setParents(List<PedigreeNodeParents> parents) {
    this.parents = parents;
  }

  public PedigreeNode pedigree(String pedigree) {
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

  public PedigreeNode siblings(List<PedigreeNodeSiblings> siblings) {
    this.siblings = siblings;
    return this;
  }

  public PedigreeNode addSiblingsItem(PedigreeNodeSiblings siblingsItem) {
    if (this.siblings == null) {
      this.siblings = new ArrayList<PedigreeNodeSiblings>();
    }
    this.siblings.add(siblingsItem);
    return this;
  }

  /**
   * List of sibling germplasm
   * @return siblings
  **/
  
      @Valid
    public List<PedigreeNodeSiblings> getSiblings() {
    return siblings;
  }

  public void setSiblings(List<PedigreeNodeSiblings> siblings) {
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
    PedigreeNode pedigreeNode = (PedigreeNode) o;
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
