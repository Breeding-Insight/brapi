package org.brapi.v2.model.pheno;

import java.time.OffsetDateTime;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;

import javax.validation.Valid;


/**
 * ObservationVariable
 */


public class BrAPIObservationVariable {
  @JsonProperty("observationVariableDbId")
  private String observationVariableDbId = null;

  @JsonProperty("observationVariableName")
  private String observationVariableName = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("contextOfUse")
  @Valid
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
  @Valid
  private List<String> synonyms = null;

  @JsonProperty("trait")
  private BrAPITrait trait = null;

  public BrAPIObservationVariable observationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
    return this;
  }

  public String getObservationVariableName() {
    return observationVariableName;
  }

  public void setObservationVariableName(String observationVariableName) {
    this.observationVariableName = observationVariableName;
  }

  public BrAPIObservationVariable observationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
    return this;
  }

  /**
   * Variable unique identifier  MIAPPE V1.1 (DM-83) Variable ID - Code used to identify the variable in the data file. We recommend using a variable definition from the Crop Ontology where possible. Otherwise, the Crop Ontology naming convention is recommended: <trait abbreviation>_<method abbreviation>_<scale abbreviation>). A variable ID must be unique within a given investigation.
   * @return observationVariableDbId
  **/
  
      

    public String getObservationVariableDbId() {
    return observationVariableDbId;
  }

  public void setObservationVariableDbId(String observationVariableDbId) {
    this.observationVariableDbId = observationVariableDbId;
  }

  public BrAPIObservationVariable additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIObservationVariable putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
   **/


  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIObservationVariable commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

  /**
   * Crop name (examples: \"Maize\", \"Wheat\")
   * @return commonCropName
   **/


  public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public BrAPIObservationVariable contextOfUse(List<String> contextOfUse) {
    this.contextOfUse = contextOfUse;
    return this;
  }

  public BrAPIObservationVariable addContextOfUseItem(String contextOfUseItem) {
    if (this.contextOfUse == null) {
      this.contextOfUse = new ArrayList<String>();
    }
    this.contextOfUse.add(contextOfUseItem);
    return this;
  }

  /**
   * Indication of how trait is routinely used. (examples: [\"Trial evaluation\", \"Nursery evaluation\"])
   * @return contextOfUse
   **/


  public List<String> getContextOfUse() {
    return contextOfUse;
  }

  public void setContextOfUse(List<String> contextOfUse) {
    this.contextOfUse = contextOfUse;
  }

  public BrAPIObservationVariable defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Variable default value. (examples: \"red\", \"2.3\", etc.)
   * @return defaultValue
   **/


  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public BrAPIObservationVariable documentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
    return this;
  }

  /**
   * A URL to the human readable documentation of this object
   * @return documentationURL
   **/


  public String getDocumentationURL() {
    return documentationURL;
  }

  public void setDocumentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
  }

  public BrAPIObservationVariable externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/


  @Valid
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPIObservationVariable growthStage(String growthStage) {
    this.growthStage = growthStage;
    return this;
  }

  /**
   * Growth stage at which measurement is made (examples: \"flowering\")
   * @return growthStage
   **/


  public String getGrowthStage() {
    return growthStage;
  }

  public void setGrowthStage(String growthStage) {
    this.growthStage = growthStage;
  }

  public BrAPIObservationVariable institution(String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * Name of institution submitting the variable
   * @return institution
   **/


  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public BrAPIObservationVariable language(String language) {
    this.language = language;
    return this;
  }

  /**
   * 2 letter ISO 639-1 code for the language of submission of the variable.
   * @return language
   **/


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BrAPIObservationVariable method(BrAPIMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
   **/
  public BrAPIMethod getMethod() {
    return method;
  }

  public void setMethod(BrAPIMethod method) {
    this.method = method;
  }

  public BrAPIObservationVariable ontologyReference(BrAPIOntologyReference ontologyReference) {
    this.ontologyReference = ontologyReference;
    return this;
  }

  /**
   * Get ontologyReference
   * @return ontologyReference
   **/


  @Valid
  public BrAPIOntologyReference getOntologyReference() {
    return ontologyReference;
  }

  public void setOntologyReference(BrAPIOntologyReference ontologyReference) {
    this.ontologyReference = ontologyReference;
  }

  public BrAPIObservationVariable scale(BrAPIScale scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   **/
  public BrAPIScale getScale() {
    return scale;
  }

  public void setScale(BrAPIScale scale) {
    this.scale = scale;
  }

  public BrAPIObservationVariable scientist(String scientist) {
    this.scientist = scientist;
    return this;
  }

  /**
   * Name of scientist submitting the variable.
   * @return scientist
   **/


  public String getScientist() {
    return scientist;
  }

  public void setScientist(String scientist) {
    this.scientist = scientist;
  }

  public BrAPIObservationVariable status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Variable status. (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)
   * @return status
   **/


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BrAPIObservationVariable submissionTimestamp(OffsetDateTime submissionTimestamp) {
    this.submissionTimestamp = submissionTimestamp;
    return this;
  }

  /**
   * Timestamp when the Variable was added (ISO 8601)
   * @return submissionTimestamp
   **/


  @Valid
  public OffsetDateTime getSubmissionTimestamp() {
    return submissionTimestamp;
  }

  public void setSubmissionTimestamp(OffsetDateTime submissionTimestamp) {
    this.submissionTimestamp = submissionTimestamp;
  }

  public BrAPIObservationVariable synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public BrAPIObservationVariable addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

  /**
   * Other variable names
   * @return synonyms
   **/


  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public BrAPIObservationVariable trait(BrAPITrait trait) {
    this.trait = trait;
    return this;
  }

  /**
   * Get trait
   * @return trait
   **/
  public BrAPITrait getTrait() {
    return trait;
  }

  public void setTrait(BrAPITrait trait) {
    this.trait = trait;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationVariable observationVariable = (BrAPIObservationVariable) o;
    return Objects.equals(this.observationVariableDbId, observationVariable.observationVariableDbId) &&
            Objects.equals(this.observationVariableName, observationVariable.observationVariableName) &&
            Objects.equals(this.additionalInfo, observationVariable.additionalInfo) &&
            Objects.equals(this.commonCropName, observationVariable.commonCropName) &&
            Objects.equals(this.contextOfUse, observationVariable.contextOfUse) &&
            Objects.equals(this.defaultValue, observationVariable.defaultValue) &&
            Objects.equals(this.documentationURL, observationVariable.documentationURL) &&
            Objects.equals(this.externalReferences, observationVariable.externalReferences) &&
            Objects.equals(this.growthStage, observationVariable.growthStage) &&
            Objects.equals(this.institution, observationVariable.institution) &&
            Objects.equals(this.language, observationVariable.language) &&
            Objects.equals(this.method, observationVariable.method) &&
            Objects.equals(this.ontologyReference, observationVariable.ontologyReference) &&
            Objects.equals(this.scale, observationVariable.scale) &&
            Objects.equals(this.scientist, observationVariable.scientist) &&
            Objects.equals(this.status, observationVariable.status) &&
            Objects.equals(this.submissionTimestamp, observationVariable.submissionTimestamp) &&
            Objects.equals(this.synonyms, observationVariable.synonyms) &&
            Objects.equals(this.trait, observationVariable.trait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationVariableDbId, observationVariableName, additionalInfo, commonCropName, contextOfUse, defaultValue, documentationURL, externalReferences, growthStage, institution, language, method, ontologyReference, scale, scientist, status, submissionTimestamp, synonyms, trait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationVariable {\n");
    sb.append("    observationVariableDbId: ").append(toIndentedString(observationVariableDbId)).append("\n");
    sb.append("    observationVariableName: ").append(toIndentedString(observationVariableName)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
