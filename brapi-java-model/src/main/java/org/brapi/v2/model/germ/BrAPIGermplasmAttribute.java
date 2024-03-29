package org.brapi.v2.model.germ;

import java.time.OffsetDateTime;
import java.util.*;

import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;

import org.brapi.v2.model.pheno.BrAPIMethod;
import org.brapi.v2.model.pheno.BrAPIScale;
import org.brapi.v2.model.pheno.BrAPITrait;

/**
 * GermplasmAttribute
 */

public class BrAPIGermplasmAttribute {
	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("attributeCategory")
	private String attributeCategory = null;

	@JsonProperty("attributeDbId")
	private String attributeDbId = null;

	@JsonProperty("attributeDescription")
	private String attributeDescription = null;

	@JsonProperty("attributeName")
	private String attributeName = null;

	@JsonProperty("attributePUI")
	private String attributePUI = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("contextOfUse")
	private List<String> contextOfUse = null;

	@JsonProperty("defaultValue")
	private String defaultValue = null;

	@JsonProperty("documentationURL")
	private String documentationURL = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("growthStage")
	private String growthStage = null;

	@JsonProperty("institution")
	private String institution = null;

	@JsonProperty("language")
	private String language = null;

	@JsonProperty("method")
	private BrAPIMethod method = null;

	@JsonProperty("ontologyReference")
	private BrAPIOntologyReference ontologyReference = null;

	@JsonProperty("scale")
	private BrAPIScale scale = null;

	@JsonProperty("scientist")
	private String scientist = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("submissionTimestamp")
	private OffsetDateTime submissionTimestamp = null;

	@JsonProperty("synonyms")
	private List<String> synonyms = null;

	@JsonProperty("trait")
	private BrAPITrait trait = null;

	private final transient Gson gson = new Gson();

	public BrAPIGermplasmAttribute additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIGermplasmAttribute putAdditionalInfoItem(String key, Object additionalInfoItem) {
        if (this.additionalInfo == null) {
          this.additionalInfo = new JsonObject();
        }
        JsonElement newElement = gson.toJsonTree(additionalInfoItem);
        this.additionalInfo.add(key, newElement);
        return this;
  	}

	/**
	 * A free space containing any additional information related to a particular
	 * object. A data source may provide any JSON object, unrestriced by the BrAPI
	 * specification.
	 *
	 * @return additionalInfo
	 **/
	public JsonObject getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPIGermplasmAttribute attributeCategory(String attributeCategory) {
		this.attributeCategory = attributeCategory;
		return this;
	}

	/**
	 * General category for the attribute. very similar to Trait class.
	 *
	 * @return attributeCategory
	 **/
	public String getAttributeCategory() {
		return attributeCategory;
	}

	public void setAttributeCategory(String attributeCategory) {
		this.attributeCategory = attributeCategory;
	}

	public BrAPIGermplasmAttribute attributeDbId(String attributeDbId) {
		this.attributeDbId = attributeDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies this attribute within the given database
	 * server
	 *
	 * @return attributeDbId
	 **/
	public String getAttributeDbId() {
		return attributeDbId;
	}

	public void setAttributeDbId(String attributeDbId) {
		this.attributeDbId = attributeDbId;
	}

	public BrAPIGermplasmAttribute attributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
		return this;
	}

	/**
	 * A human readable description of this attribute
	 *
	 * @return attributeDescription
	 **/
	public String getAttributeDescription() {
		return attributeDescription;
	}

	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
	}

	public BrAPIGermplasmAttribute attributeName(String attributeName) {
		this.attributeName = attributeName;
		return this;
	}

	/**
	 * A human readable name for this attribute
	 *
	 * @return attributeName
	 **/
	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public BrAPIGermplasmAttribute attributePUI(String attributePUI) {
		this.attributePUI = attributePUI;
		return this;
	}

	/**
	 * The Permanent Unique Identifier of an Attribute, usually in the form of a URI
	 *
	 * @return attributePUI
	 **/
	public String getAttributePUI() {
		return attributePUI;
	}

	public void setAttributePUI(String attributePUI) {
		this.attributePUI = attributePUI;
	}

	public BrAPIGermplasmAttribute commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Crop name (examples: \&quot;Maize\&quot;, \&quot;Wheat\&quot;)
	 *
	 * @return commonCropName
	 **/
	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPIGermplasmAttribute contextOfUse(List<String> contextOfUse) {
		this.contextOfUse = contextOfUse;
		return this;
	}

	public BrAPIGermplasmAttribute addContextOfUseItem(String contextOfUseItem) {
		if (this.contextOfUse == null) {
			this.contextOfUse = new ArrayList<String>();
		}
		this.contextOfUse.add(contextOfUseItem);
		return this;
	}

	/**
	 * Indication of how trait is routinely used. (examples: [\&quot;Trial
	 * evaluation\&quot;, \&quot;Nursery evaluation\&quot;])
	 *
	 * @return contextOfUse
	 **/
	public List<String> getContextOfUse() {
		return contextOfUse;
	}

	public void setContextOfUse(List<String> contextOfUse) {
		this.contextOfUse = contextOfUse;
	}

	public BrAPIGermplasmAttribute defaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		return this;
	}

	/**
	 * Variable default value. (examples: \&quot;red\&quot;, \&quot;2.3\&quot;,
	 * etc.)
	 *
	 * @return defaultValue
	 **/
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public BrAPIGermplasmAttribute documentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
		return this;
	}

	/**
	 * A URL to the human readable documentation of an object
	 *
	 * @return documentationURL
	 **/
	public String getDocumentationURL() {
		return documentationURL;
	}

	public void setDocumentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
	}

	public BrAPIGermplasmAttribute externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	public BrAPIGermplasmAttribute addExternalReferencesItem(BrAPIExternalReference externalReferencesItem) {
		if (this.externalReferences == null) {
			this.externalReferences = new ArrayList<BrAPIExternalReference>();
		}
		this.externalReferences.add(externalReferencesItem);
		return this;
	}

	/**
	 * An array of external reference ids. These are references to this piece of
	 * data in an external system. Could be a simple string or a URI.
	 *
	 * @return externalReferences
	 **/
	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIGermplasmAttribute growthStage(String growthStage) {
		this.growthStage = growthStage;
		return this;
	}

	/**
	 * Growth stage at which measurement is made (examples: \&quot;flowering\&quot;)
	 *
	 * @return growthStage
	 **/
	public String getGrowthStage() {
		return growthStage;
	}

	public void setGrowthStage(String growthStage) {
		this.growthStage = growthStage;
	}

	public BrAPIGermplasmAttribute institution(String institution) {
		this.institution = institution;
		return this;
	}

	/**
	 * Name of institution submitting the variable
	 *
	 * @return institution
	 **/
	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public BrAPIGermplasmAttribute language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * 2 letter ISO 639-1 code for the language of submission of the variable.
	 *
	 * @return language
	 **/
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public BrAPIGermplasmAttribute method(BrAPIMethod method) {
		this.method = method;
		return this;
	}

	/**
	 * Get method
	 *
	 * @return method
	 **/
	public BrAPIMethod getMethod() {
		return method;
	}

	public void setMethod(BrAPIMethod method) {
		this.method = method;
	}

	public BrAPIGermplasmAttribute ontologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
		return this;
	}

	/**
	 * Get ontologyReference
	 *
	 * @return ontologyReference
	 **/
	public BrAPIOntologyReference getOntologyReference() {
		return ontologyReference;
	}

	public void setOntologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
	}

	public BrAPIGermplasmAttribute scale(BrAPIScale scale) {
		this.scale = scale;
		return this;
	}

	/**
	 * Get scale
	 *
	 * @return scale
	 **/
	public BrAPIScale getScale() {
		return scale;
	}

	public void setScale(BrAPIScale scale) {
		this.scale = scale;
	}

	public BrAPIGermplasmAttribute scientist(String scientist) {
		this.scientist = scientist;
		return this;
	}

	/**
	 * Name of scientist submitting the variable.
	 *
	 * @return scientist
	 **/
	public String getScientist() {
		return scientist;
	}

	public void setScientist(String scientist) {
		this.scientist = scientist;
	}

	public BrAPIGermplasmAttribute status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Variable status. (examples: \&quot;recommended\&quot;,
	 * \&quot;obsolete\&quot;, \&quot;legacy\&quot;, etc.)
	 *
	 * @return status
	 **/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BrAPIGermplasmAttribute submissionTimestamp(OffsetDateTime submissionTimestamp) {
		this.submissionTimestamp = submissionTimestamp;
		return this;
	}

	/**
	 * Timestamp when the Variable was added (ISO 8601)
	 *
	 * @return submissionTimestamp
	 **/
	public OffsetDateTime getSubmissionTimestamp() {
		return submissionTimestamp;
	}

	public void setSubmissionTimestamp(OffsetDateTime submissionTimestamp) {
		this.submissionTimestamp = submissionTimestamp;
	}

	public BrAPIGermplasmAttribute synonyms(List<String> synonyms) {
		this.synonyms = synonyms;
		return this;
	}

	public BrAPIGermplasmAttribute addSynonymsItem(String synonymsItem) {
		if (this.synonyms == null) {
			this.synonyms = new ArrayList<String>();
		}
		this.synonyms.add(synonymsItem);
		return this;
	}

	/**
	 * Other variable names
	 *
	 * @return synonyms
	 **/
	public List<String> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(List<String> synonyms) {
		this.synonyms = synonyms;
	}

	public BrAPIGermplasmAttribute trait(BrAPITrait trait) {
		this.trait = trait;
		return this;
	}

	/**
	 * Get trait
	 *
	 * @return trait
	 **/
	public BrAPITrait getTrait() {
		return trait;
	}

	public void setTrait(BrAPITrait trait) {
		this.trait = trait;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIGermplasmAttribute germplasmAttribute = (BrAPIGermplasmAttribute) o;
		return Objects.equals(this.additionalInfo, germplasmAttribute.additionalInfo)
				&& Objects.equals(this.attributeCategory, germplasmAttribute.attributeCategory)
				&& Objects.equals(this.attributeDbId, germplasmAttribute.attributeDbId)
				&& Objects.equals(this.attributeDescription, germplasmAttribute.attributeDescription)
				&& Objects.equals(this.attributeName, germplasmAttribute.attributeName)
				&& Objects.equals(this.attributePUI, germplasmAttribute.attributePUI)
				&& Objects.equals(this.commonCropName, germplasmAttribute.commonCropName)
				&& Objects.equals(this.contextOfUse, germplasmAttribute.contextOfUse)
				&& Objects.equals(this.defaultValue, germplasmAttribute.defaultValue)
				&& Objects.equals(this.documentationURL, germplasmAttribute.documentationURL)
				&& Objects.equals(this.externalReferences, germplasmAttribute.externalReferences)
				&& Objects.equals(this.growthStage, germplasmAttribute.growthStage)
				&& Objects.equals(this.institution, germplasmAttribute.institution)
				&& Objects.equals(this.language, germplasmAttribute.language)
				&& Objects.equals(this.method, germplasmAttribute.method)
				&& Objects.equals(this.ontologyReference, germplasmAttribute.ontologyReference)
				&& Objects.equals(this.scale, germplasmAttribute.scale)
				&& Objects.equals(this.scientist, germplasmAttribute.scientist)
				&& Objects.equals(this.status, germplasmAttribute.status)
				&& Objects.equals(this.submissionTimestamp, germplasmAttribute.submissionTimestamp)
				&& Objects.equals(this.synonyms, germplasmAttribute.synonyms)
				&& Objects.equals(this.trait, germplasmAttribute.trait);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, attributeCategory, attributeDbId, attributeDescription, attributeName,
				attributePUI, commonCropName, contextOfUse, defaultValue, documentationURL, externalReferences,
				growthStage, institution, language, method, ontologyReference, scale, scientist, status,
				submissionTimestamp, synonyms, trait);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GermplasmAttribute {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    attributeCategory: ").append(toIndentedString(attributeCategory)).append("\n");
		sb.append("    attributeDbId: ").append(toIndentedString(attributeDbId)).append("\n");
		sb.append("    attributeDescription: ").append(toIndentedString(attributeDescription)).append("\n");
		sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
		sb.append("    attributePUI: ").append(toIndentedString(attributePUI)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    contextOfUse: ").append(toIndentedString(contextOfUse)).append("\n");
		sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    growthStage: ").append(toIndentedString(growthStage)).append("\n");
		sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    method: ").append(toIndentedString(method)).append("\n");
		sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
		sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
		sb.append("    scientist: ").append(toIndentedString(scientist)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    submissionTimestamp: ").append(toIndentedString(submissionTimestamp)).append("\n");
		sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
		sb.append("    trait: ").append(toIndentedString(trait)).append("\n");
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
