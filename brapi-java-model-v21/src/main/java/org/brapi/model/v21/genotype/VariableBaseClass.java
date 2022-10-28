/*
 * BrAPI-Genotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.genotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.*;

/**
 * VariableBaseClass
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class VariableBaseClass {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("commonCropName")
    private String commonCropName = null;

    @SerializedName("contextOfUse")
    private List<String> contextOfUse = null;

    @SerializedName("defaultValue")
    private String defaultValue = null;

    @SerializedName("documentationURL")
    private String documentationURL = null;

    @SerializedName("externalReferences")
    private ExternalReferences externalReferences = null;

    @SerializedName("growthStage")
    private String growthStage = null;

    @SerializedName("institution")
    private String institution = null;

    @SerializedName("language")
    private String language = null;

    @SerializedName("method")
    private VariableBaseClassMethod method = null;

    @SerializedName("ontologyReference")
    private OntologyReference ontologyReference = null;

    @SerializedName("scale")
    private VariableBaseClassScale scale = null;

    @SerializedName("scientist")
    private String scientist = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("submissionTimestamp")
    private OffsetDateTime submissionTimestamp = null;

    @SerializedName("synonyms")
    private List<String> synonyms = null;

    @SerializedName("trait")
    private VariableBaseClassTrait trait = null;

    public VariableBaseClass additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public VariableBaseClass putAdditionalInfoItem(String key, String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<String, String>();
        }
        this.additionalInfo.put(key, additionalInfoItem);
        return this;
    }

    /**
     * A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.
     *
     * @return additionalInfo
     **/
    @Schema(description = "A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.")
    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public VariableBaseClass commonCropName(String commonCropName) {
        this.commonCropName = commonCropName;
        return this;
    }

    /**
     * Crop name (examples: \&quot;Maize\&quot;, \&quot;Wheat\&quot;)
     *
     * @return commonCropName
     **/
    @Schema(example = "Maize", description = "Crop name (examples: \"Maize\", \"Wheat\")")
    public String getCommonCropName() {
        return commonCropName;
    }

    public void setCommonCropName(String commonCropName) {
        this.commonCropName = commonCropName;
    }

    public VariableBaseClass contextOfUse(List<String> contextOfUse) {
        this.contextOfUse = contextOfUse;
        return this;
    }

    public VariableBaseClass addContextOfUseItem(String contextOfUseItem) {
        if (this.contextOfUse == null) {
            this.contextOfUse = new ArrayList<String>();
        }
        this.contextOfUse.add(contextOfUseItem);
        return this;
    }

    /**
     * Indication of how trait is routinely used. (examples: [\&quot;Trial evaluation\&quot;, \&quot;Nursery evaluation\&quot;])
     *
     * @return contextOfUse
     **/
    @Schema(example = "[\"Trial evaluation\",\"Nursery evaluation\"]", description = "Indication of how trait is routinely used. (examples: [\"Trial evaluation\", \"Nursery evaluation\"])")
    public List<String> getContextOfUse() {
        return contextOfUse;
    }

    public void setContextOfUse(List<String> contextOfUse) {
        this.contextOfUse = contextOfUse;
    }

    public VariableBaseClass defaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Variable default value. (examples: \&quot;red\&quot;, \&quot;2.3\&quot;, etc.)
     *
     * @return defaultValue
     **/
    @Schema(example = "2.0", description = "Variable default value. (examples: \"red\", \"2.3\", etc.)")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public VariableBaseClass documentationURL(String documentationURL) {
        this.documentationURL = documentationURL;
        return this;
    }

    /**
     * A URL to the human readable documentation of an object
     *
     * @return documentationURL
     **/
    @Schema(example = "https://wiki.brapi.org/documentation.html", description = "A URL to the human readable documentation of an object")
    public String getDocumentationURL() {
        return documentationURL;
    }

    public void setDocumentationURL(String documentationURL) {
        this.documentationURL = documentationURL;
    }

    public VariableBaseClass externalReferences(ExternalReferences externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    /**
     * Get externalReferences
     *
     * @return externalReferences
     **/
    @Schema(description = "")
    public ExternalReferences getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(ExternalReferences externalReferences) {
        this.externalReferences = externalReferences;
    }

    public VariableBaseClass growthStage(String growthStage) {
        this.growthStage = growthStage;
        return this;
    }

    /**
     * Growth stage at which measurement is made (examples: \&quot;flowering\&quot;)
     *
     * @return growthStage
     **/
    @Schema(example = "flowering", description = "Growth stage at which measurement is made (examples: \"flowering\")")
    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }

    public VariableBaseClass institution(String institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Name of institution submitting the variable
     *
     * @return institution
     **/
    @Schema(example = "The BrAPI Institute", description = "Name of institution submitting the variable")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public VariableBaseClass language(String language) {
        this.language = language;
        return this;
    }

    /**
     * 2 letter ISO 639-1 code for the language of submission of the variable.
     *
     * @return language
     **/
    @Schema(example = "en", description = "2 letter ISO 639-1 code for the language of submission of the variable.")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public VariableBaseClass method(VariableBaseClassMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     **/
    @Schema(required = true, description = "")
    public VariableBaseClassMethod getMethod() {
        return method;
    }

    public void setMethod(VariableBaseClassMethod method) {
        this.method = method;
    }

    public VariableBaseClass ontologyReference(OntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
        return this;
    }

    /**
     * Get ontologyReference
     *
     * @return ontologyReference
     **/
    @Schema(description = "")
    public OntologyReference getOntologyReference() {
        return ontologyReference;
    }

    public void setOntologyReference(OntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
    }

    public VariableBaseClass scale(VariableBaseClassScale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Get scale
     *
     * @return scale
     **/
    @Schema(required = true, description = "")
    public VariableBaseClassScale getScale() {
        return scale;
    }

    public void setScale(VariableBaseClassScale scale) {
        this.scale = scale;
    }

    public VariableBaseClass scientist(String scientist) {
        this.scientist = scientist;
        return this;
    }

    /**
     * Name of scientist submitting the variable.
     *
     * @return scientist
     **/
    @Schema(example = "Dr. Bob Robertson", description = "Name of scientist submitting the variable.")
    public String getScientist() {
        return scientist;
    }

    public void setScientist(String scientist) {
        this.scientist = scientist;
    }

    public VariableBaseClass status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Variable status. (examples: \&quot;recommended\&quot;, \&quot;obsolete\&quot;, \&quot;legacy\&quot;, etc.)
     *
     * @return status
     **/
    @Schema(example = "recommended", description = "Variable status. (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VariableBaseClass submissionTimestamp(OffsetDateTime submissionTimestamp) {
        this.submissionTimestamp = submissionTimestamp;
        return this;
    }

    /**
     * Timestamp when the Variable was added (ISO 8601)
     *
     * @return submissionTimestamp
     **/
    @Schema(description = "Timestamp when the Variable was added (ISO 8601)")
    public OffsetDateTime getSubmissionTimestamp() {
        return submissionTimestamp;
    }

    public void setSubmissionTimestamp(OffsetDateTime submissionTimestamp) {
        this.submissionTimestamp = submissionTimestamp;
    }

    public VariableBaseClass synonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public VariableBaseClass addSynonymsItem(String synonymsItem) {
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
    @Schema(example = "[\"Maize Height\",\"Stalk Height\",\"Corn Height\"]", description = "Other variable names")
    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public VariableBaseClass trait(VariableBaseClassTrait trait) {
        this.trait = trait;
        return this;
    }

    /**
     * Get trait
     *
     * @return trait
     **/
    @Schema(required = true, description = "")
    public VariableBaseClassTrait getTrait() {
        return trait;
    }

    public void setTrait(VariableBaseClassTrait trait) {
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
        VariableBaseClass variableBaseClass = (VariableBaseClass) o;
        return Objects.equals(this.additionalInfo, variableBaseClass.additionalInfo) &&
                Objects.equals(this.commonCropName, variableBaseClass.commonCropName) &&
                Objects.equals(this.contextOfUse, variableBaseClass.contextOfUse) &&
                Objects.equals(this.defaultValue, variableBaseClass.defaultValue) &&
                Objects.equals(this.documentationURL, variableBaseClass.documentationURL) &&
                Objects.equals(this.externalReferences, variableBaseClass.externalReferences) &&
                Objects.equals(this.growthStage, variableBaseClass.growthStage) &&
                Objects.equals(this.institution, variableBaseClass.institution) &&
                Objects.equals(this.language, variableBaseClass.language) &&
                Objects.equals(this.method, variableBaseClass.method) &&
                Objects.equals(this.ontologyReference, variableBaseClass.ontologyReference) &&
                Objects.equals(this.scale, variableBaseClass.scale) &&
                Objects.equals(this.scientist, variableBaseClass.scientist) &&
                Objects.equals(this.status, variableBaseClass.status) &&
                Objects.equals(this.submissionTimestamp, variableBaseClass.submissionTimestamp) &&
                Objects.equals(this.synonyms, variableBaseClass.synonyms) &&
                Objects.equals(this.trait, variableBaseClass.trait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, commonCropName, contextOfUse, defaultValue, documentationURL, externalReferences, growthStage, institution, language, method, ontologyReference, scale, scientist, status, submissionTimestamp, synonyms, trait);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableBaseClass {\n");

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
