package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * PedigreeNode
 */

@Deprecated
public class BrAPIPedigreeNode_Deprecated {
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
	private List<BrAPIPedigreeNodeRelative> parents = null;

	@JsonProperty("pedigree")
	private String pedigree = null;

	@JsonProperty("siblings")
	@Valid
	private List<BrAPIPedigreeNodeSibling> siblings = null;

	@Deprecated
	public BrAPIPedigreeNode_Deprecated crossingProjectDbId(String crossingProjectDbId) {
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	/**
	 * The crossing project used to generate this germplasm
	 * 
	 * @return crossingProjectDbId
	 **/

	@Deprecated
	public String getCrossingProjectDbId() {
		return crossingProjectDbId;
	}

	@Deprecated
	public void setCrossingProjectDbId(String crossingProjectDbId) {
		this.crossingProjectDbId = crossingProjectDbId;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated crossingYear(Integer crossingYear) {
		this.crossingYear = crossingYear;
		return this;
	}

	/**
	 * The year the parents were originally crossed
	 * 
	 * @return crossingYear
	 **/

	@Deprecated
	public Integer getCrossingYear() {
		return crossingYear;
	}

	@Deprecated
	public void setCrossingYear(Integer crossingYear) {
		this.crossingYear = crossingYear;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated familyCode(String familyCode) {
		this.familyCode = familyCode;
		return this;
	}

	/**
	 * The code representing the family
	 * 
	 * @return familyCode
	 **/

	@Deprecated
	public String getFamilyCode() {
		return familyCode;
	}

	@Deprecated
	public void setFamilyCode(String familyCode) {
		this.familyCode = familyCode;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated germplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a germplasm
	 * 
	 * @return germplasmDbId
	 **/

	@Deprecated
	public String getGermplasmDbId() {
		return germplasmDbId;
	}

	@Deprecated
	public void setGermplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated germplasmName(String germplasmName) {
		this.germplasmName = germplasmName;
		return this;
	}

	/**
	 * A human readable name for a germplasm
	 * 
	 * @return germplasmName
	 **/

	@Deprecated
	public String getGermplasmName() {
		return germplasmName;
	}

	@Deprecated
	public void setGermplasmName(String germplasmName) {
		this.germplasmName = germplasmName;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated parents(List<BrAPIPedigreeNodeRelative> parents) {
		this.parents = parents;
		return this;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated addParentsItem(BrAPIPedigreeNodeRelative parentsItem) {
		if (this.parents == null) {
			this.parents = new ArrayList<BrAPIPedigreeNodeRelative>();
		}
		this.parents.add(parentsItem);
		return this;
	}

	/**
	 * List of parent nodes in the pedigree tree.
	 * 
	 * @return parents
	 **/

	@Deprecated
	public List<BrAPIPedigreeNodeRelative> getParents() {
		return parents;
	}

	@Deprecated
	public void setParents(List<BrAPIPedigreeNodeRelative> parents) {
		this.parents = parents;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated pedigree(String pedigree) {
		this.pedigree = pedigree;
		return this;
	}

	/**
	 * The string representation of the pedigree.
	 * 
	 * @return pedigree
	 **/

	@Deprecated
	public String getPedigree() {
		return pedigree;
	}

	@Deprecated
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated siblings(List<BrAPIPedigreeNodeSibling> siblings) {
		this.siblings = siblings;
		return this;
	}

	@Deprecated
	public BrAPIPedigreeNode_Deprecated addSiblingsItem(BrAPIPedigreeNodeSibling siblingsItem) {
		if (this.siblings == null) {
			this.siblings = new ArrayList<BrAPIPedigreeNodeSibling>();
		}
		this.siblings.add(siblingsItem);
		return this;
	}

	/**
	 * List of sibling germplasm
	 * 
	 * @return siblings
	 **/

	@Deprecated
	public List<BrAPIPedigreeNodeSibling> getSiblings() {
		return siblings;
	}

	@Deprecated
	public void setSiblings(List<BrAPIPedigreeNodeSibling> siblings) {
		this.siblings = siblings;
	}

	@Override
	@Deprecated
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIPedigreeNode_Deprecated pedigreeNode = (BrAPIPedigreeNode_Deprecated) o;
		return Objects.equals(this.crossingProjectDbId, pedigreeNode.crossingProjectDbId)
				&& Objects.equals(this.crossingYear, pedigreeNode.crossingYear)
				&& Objects.equals(this.familyCode, pedigreeNode.familyCode)
				&& Objects.equals(this.germplasmDbId, pedigreeNode.germplasmDbId)
				&& Objects.equals(this.germplasmName, pedigreeNode.germplasmName)
				&& Objects.equals(this.parents, pedigreeNode.parents)
				&& Objects.equals(this.pedigree, pedigreeNode.pedigree)
				&& Objects.equals(this.siblings, pedigreeNode.siblings);
	}

	@Override
	@Deprecated
	public int hashCode() {
		return Objects.hash(crossingProjectDbId, crossingYear, familyCode, germplasmDbId, germplasmName, parents,
				pedigree, siblings);
	}

	@Override
	@Deprecated
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
