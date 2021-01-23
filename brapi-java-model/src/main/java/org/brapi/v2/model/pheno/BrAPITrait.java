package org.brapi.v2.model.pheno;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;

import javax.validation.Valid;
import java.util.*;

/**
 * TraitBaseClass
 */

public class BrAPITrait {
	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;
	@JsonProperty("alternativeAbbreviations")
	@Valid
	private List<String> alternativeAbbreviations = null;

	@JsonProperty("attribute")
	private String attribute = null;

	@JsonProperty("entity")
	private String entity = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("mainAbbreviation")
	private String mainAbbreviation = null;

	@JsonProperty("ontologyReference")
	private BrAPIOntologyReference ontologyReference = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("synonyms")
	@Valid
	private List<String> synonyms = null;

	@JsonProperty("traitClass")
	private String traitClass = null;

	@JsonProperty("traitDescription")
	private String traitDescription = null;

	@JsonProperty("traitName")
	private String traitName = null;

	@JsonProperty("traitDbId")
	private String traitDbId = null;

	public BrAPITrait traitDbId(String traitDbId) {
		this.traitDbId = traitDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a trait
	 * @return traitDbId
	 **/


	public String getTraitDbId() {
		return traitDbId;
	}

	public void setTraitDbId(String traitDbId) {
		this.traitDbId = traitDbId;
	}

	public BrAPITrait additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPITrait putAdditionalInfoItem(String key, String additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new HashMap<String, String>();
		}
		this.additionalInfo.put(key, additionalInfoItem);
		return this;
	}

	/**
	 * Additional arbitrary info
	 *
	 * @return additionalInfo
	 **/


	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public BrAPITrait alternativeAbbreviations(List<String> alternativeAbbreviations) {
		this.alternativeAbbreviations = alternativeAbbreviations;
		return this;
	}

	public BrAPITrait addAlternativeAbbreviationsItem(String alternativeAbbreviationsItem) {
		if (this.alternativeAbbreviations == null) {
			this.alternativeAbbreviations = new ArrayList<String>();
		}
		this.alternativeAbbreviations.add(alternativeAbbreviationsItem);
		return this;
	}

	/**
	 * Other frequent abbreviations of the trait, if any. These abbreviations do not
	 * have to follow a convention
	 *
	 * @return alternativeAbbreviations
	 **/


	public List<String> getAlternativeAbbreviations() {
		return alternativeAbbreviations;
	}

	public void setAlternativeAbbreviations(List<String> alternativeAbbreviations) {
		this.alternativeAbbreviations = alternativeAbbreviations;
	}

	public BrAPITrait attribute(String attribute) {
		this.attribute = attribute;
		return this;
	}

	/**
	 * A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the
	 * attribute is the observed feature (or characteristic) of the entity e.g., for
	 * \"grain colour\", attribute = \"colour\"
	 *
	 * @return attribute
	 **/


	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public BrAPITrait entity(String entity) {
		this.entity = entity;
		return this;
	}

	/**
	 * A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the
	 * entity is the part of the plant that the trait refers to e.g., for \"grain
	 * colour\", entity = \"grain\"
	 *
	 * @return entity
	 **/


	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public BrAPITrait externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 *
	 * @return externalReferences
	 **/


	@Valid
	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPITrait mainAbbreviation(String mainAbbreviation) {
		this.mainAbbreviation = mainAbbreviation;
		return this;
	}

	/**
	 * Main abbreviation for trait name. (examples: \"Carotenoid content\" =>
	 * \"CC\")
	 *
	 * @return mainAbbreviation
	 **/


	public String getMainAbbreviation() {
		return mainAbbreviation;
	}

	public void setMainAbbreviation(String mainAbbreviation) {
		this.mainAbbreviation = mainAbbreviation;
	}

	public BrAPITrait ontologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
		return this;
	}

	/**
	 * Get ontologyReference
	 *
	 * @return ontologyReference
	 **/


	@Valid
	public BrAPIOntologyReference getOntologyReference() {
		return ontologyReference;
	}

	public void setOntologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
	}

	public BrAPITrait status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Trait status (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)
	 *
	 * @return status
	 **/


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BrAPITrait synonyms(List<String> synonyms) {
		this.synonyms = synonyms;
		return this;
	}

	public BrAPITrait addSynonymsItem(String synonymsItem) {
		if (this.synonyms == null) {
			this.synonyms = new ArrayList<String>();
		}
		this.synonyms.add(synonymsItem);
		return this;
	}

	/**
	 * Other trait names
	 *
	 * @return synonyms
	 **/


	public List<String> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	public BrAPITrait traitClass(String traitClass) {
		this.traitClass = traitClass;
		return this;
	}

	/**
	 * Trait class. (examples: \"morphological\", \"phenological\", \"agronomical\",
	 * \"physiological\", \"abiotic stress\", \"biotic stress\", \"biochemical\",
	 * \"quality traits\", \"fertility\", etc.)
	 *
	 * @return traitClass
	 **/


	public String getTraitClass() {
		return traitClass;
	}

	public void setTraitClass(String traitClass) {
		this.traitClass = traitClass;
	}

	public BrAPITrait traitDescription(String traitDescription) {
		this.traitDescription = traitDescription;
		return this;
	}

	/**
	 * The description of a trait
	 *
	 * @return traitDescription
	 **/


	public String getTraitDescription() {
		return traitDescription;
	}

	public void setTraitDescription(String traitDescription) {
		this.traitDescription = traitDescription;
	}

	public BrAPITrait traitName(String traitName) {
		this.traitName = traitName;
		return this;
	}

	/**
	 * The human readable name of a trait MIAPPE V1.1 (DM-86) Trait - Name of the
	 * (plant or environmental) trait under observation
	 *
	 * @return traitName
	 **/


	public String getTraitName() {
		return traitName;
	}

	public void setTraitName(String traitName) {
		this.traitName = traitName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPITrait trait = (BrAPITrait) o;
		return Objects.equals(this.traitDbId, trait.traitDbId)
				&& Objects.equals(this.alternativeAbbreviations, trait.alternativeAbbreviations)
				&& Objects.equals(this.attribute, trait.attribute)
				&& Objects.equals(this.entity, trait.entity)
				&& Objects.equals(this.externalReferences, trait.externalReferences)
				&& Objects.equals(this.mainAbbreviation, trait.mainAbbreviation)
				&& Objects.equals(this.ontologyReference, trait.ontologyReference)
				&& Objects.equals(this.status, trait.status)
				&& Objects.equals(this.synonyms, trait.synonyms)
				&& Objects.equals(this.traitClass, trait.traitClass)
				&& Objects.equals(this.traitDescription, trait.traitDescription)
				&& Objects.equals(this.traitName, trait.traitName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(traitDbId, alternativeAbbreviations, attribute, entity, externalReferences, mainAbbreviation,
							ontologyReference, status, synonyms, traitClass, traitDescription, traitName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Trait {\n");
		sb.append("    traitDbId: ").append(toIndentedString(traitDbId)).append("\n");
		sb.append("    alternativeAbbreviations: ").append(toIndentedString(alternativeAbbreviations)).append("\n");
		sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
		sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    mainAbbreviation: ").append(toIndentedString(mainAbbreviation)).append("\n");
		sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
		sb.append("    traitClass: ").append(toIndentedString(traitClass)).append("\n");
		sb.append("    traitDescription: ").append(toIndentedString(traitDescription)).append("\n");
		sb.append("    traitName: ").append(toIndentedString(traitName)).append("\n");
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
