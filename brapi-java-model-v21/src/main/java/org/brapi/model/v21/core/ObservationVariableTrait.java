/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.core;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;

/**
 * A Trait describes what property is being observed.  &lt;br&gt;For example, an ObservationVariable might be defined with a Trait of \&quot;plant height\&quot;, a Scale of \&quot;meters\&quot;, and a Method of \&quot;tape measure\&quot;. This variable would be distinct from a variable with the Trait \&quot;Leaf length\&quot; or \&quot;Flower height\&quot;.
 */
@Schema(description = "A Trait describes what property is being observed.  <br>For example, an ObservationVariable might be defined with a Trait of \"plant height\", a Scale of \"meters\", and a Method of \"tape measure\". This variable would be distinct from a variable with the Trait \"Leaf length\" or \"Flower height\". ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ObservationVariableTrait {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("alternativeAbbreviations")
    private List<String> alternativeAbbreviations = null;

    @SerializedName("attribute")
    private String attribute = null;

    @SerializedName("attributePUI")
    private String attributePUI = null;

    @SerializedName("entity")
    private String entity = null;

    @SerializedName("entityPUI")
    private String entityPUI = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("mainAbbreviation")
    private String mainAbbreviation = null;

    @SerializedName("ontologyReference")
    private MethodOntologyReference ontologyReference = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("synonyms")
    private List<String> synonyms = null;

    @SerializedName("traitClass")
    private String traitClass = null;

    @SerializedName("traitDbId")
    private String traitDbId = null;

    @SerializedName("traitDescription")
    private String traitDescription = null;

    @SerializedName("traitName")
    private String traitName = null;

    @SerializedName("traitPUI")
    private String traitPUI = null;

    public ObservationVariableTrait additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ObservationVariableTrait putAdditionalInfoItem(String key, String additionalInfoItem) {
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

    public ObservationVariableTrait alternativeAbbreviations(List<String> alternativeAbbreviations) {
        this.alternativeAbbreviations = alternativeAbbreviations;
        return this;
    }

    public ObservationVariableTrait addAlternativeAbbreviationsItem(String alternativeAbbreviationsItem) {
        if (this.alternativeAbbreviations == null) {
            this.alternativeAbbreviations = new ArrayList<String>();
        }
        this.alternativeAbbreviations.add(alternativeAbbreviationsItem);
        return this;
    }

    /**
     * A list of shortened, human readable, names for a Trait. These abbreviations are acceptable alternatives to the mainAbbreviation and do not need to follow any formatting convention.
     *
     * @return alternativeAbbreviations
     **/
    @Schema(example = "[\"H\",\"PH\",\"H1\"]", description = "A list of shortened, human readable, names for a Trait. These abbreviations are acceptable alternatives to the mainAbbreviation and do not need to follow any formatting convention.")
    public List<String> getAlternativeAbbreviations() {
        return alternativeAbbreviations;
    }

    public void setAlternativeAbbreviations(List<String> alternativeAbbreviations) {
        this.alternativeAbbreviations = alternativeAbbreviations;
    }

    public ObservationVariableTrait attribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the attribute is the observed feature (or characteristic) of the entity e.g., for \&quot;grain colour\&quot;, attribute &#x3D; \&quot;colour\&quot;
     *
     * @return attribute
     **/
    @Schema(example = "height", description = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the attribute is the observed feature (or characteristic) of the entity e.g., for \"grain colour\", attribute = \"colour\"")
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public ObservationVariableTrait attributePUI(String attributePUI) {
        this.attributePUI = attributePUI;
        return this;
    }

    /**
     * The Permanent Unique Identifier of a Trait Attribute, usually in the form of a URI &lt;br/&gt;A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the attribute is the observed feature (or characteristic) of the entity e.g., for \&quot;grain colour\&quot;, attribute &#x3D; \&quot;colour\&quot;
     *
     * @return attributePUI
     **/
    @Schema(example = "http://my-traits.com/trait/PO:00012345", description = "The Permanent Unique Identifier of a Trait Attribute, usually in the form of a URI <br/>A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the attribute is the observed feature (or characteristic) of the entity e.g., for \"grain colour\", attribute = \"colour\"")
    public String getAttributePUI() {
        return attributePUI;
    }

    public void setAttributePUI(String attributePUI) {
        this.attributePUI = attributePUI;
    }

    public ObservationVariableTrait entity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the entity is the part of the plant that the trait refers to e.g., for \&quot;grain colour\&quot;, entity &#x3D; \&quot;grain\&quot;
     *
     * @return entity
     **/
    @Schema(example = "Stalk", description = "A trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the entity is the part of the plant that the trait refers to e.g., for \"grain colour\", entity = \"grain\"")
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public ObservationVariableTrait entityPUI(String entityPUI) {
        this.entityPUI = entityPUI;
        return this;
    }

    /**
     * The Permanent Unique Identifier of a Trait Entity, usually in the form of a URI &lt;br/&gt;A Trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the Entity is the part of the plant that the trait refers to e.g., for \&quot;grain colour\&quot;, entity &#x3D; \&quot;grain\&quot;
     *
     * @return entityPUI
     **/
    @Schema(example = "http://my-traits.com/trait/PATO:00098765", description = "The Permanent Unique Identifier of a Trait Entity, usually in the form of a URI <br/>A Trait can be decomposed as \"Trait\" = \"Entity\" + \"Attribute\", the Entity is the part of the plant that the trait refers to e.g., for \"grain colour\", entity = \"grain\" ")
    public String getEntityPUI() {
        return entityPUI;
    }

    public void setEntityPUI(String entityPUI) {
        this.entityPUI = entityPUI;
    }

    public ObservationVariableTrait externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ObservationVariableTrait addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReferencesInner>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.
     *
     * @return externalReferences
     **/
    @Schema(example = "[{\"referenceId\":\"doi:10.155454/12341234\",\"referenceSource\":\"DOI\"},{\"referenceId\":\"75a50e76\",\"referenceSource\":\"Remote Data Collection Upload Tool\"}]", description = "An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.")
    public List<ExternalReferencesInner> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public ObservationVariableTrait mainAbbreviation(String mainAbbreviation) {
        this.mainAbbreviation = mainAbbreviation;
        return this;
    }

    /**
     * A shortened version of the human readable name for a Trait
     *
     * @return mainAbbreviation
     **/
    @Schema(example = "PH", description = "A shortened version of the human readable name for a Trait")
    public String getMainAbbreviation() {
        return mainAbbreviation;
    }

    public void setMainAbbreviation(String mainAbbreviation) {
        this.mainAbbreviation = mainAbbreviation;
    }

    public ObservationVariableTrait ontologyReference(MethodOntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
        return this;
    }

    /**
     * Get ontologyReference
     *
     * @return ontologyReference
     **/
    @Schema(description = "")
    public MethodOntologyReference getOntologyReference() {
        return ontologyReference;
    }

    public void setOntologyReference(MethodOntologyReference ontologyReference) {
        this.ontologyReference = ontologyReference;
    }

    public ObservationVariableTrait status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Trait status (examples: \&quot;recommended\&quot;, \&quot;obsolete\&quot;, \&quot;legacy\&quot;, etc.)
     *
     * @return status
     **/
    @Schema(example = "recommended", description = "Trait status (examples: \"recommended\", \"obsolete\", \"legacy\", etc.)")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ObservationVariableTrait synonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public ObservationVariableTrait addSynonymsItem(String synonymsItem) {
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
    @Schema(example = "[\"Height\",\"Plant Height\",\"Stalk Height\",\"Canopy Height\"]", description = "Other trait names")
    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public ObservationVariableTrait traitClass(String traitClass) {
        this.traitClass = traitClass;
        return this;
    }

    /**
     * A classification to describe the type of trait and the context it should be considered in. &lt;br/&gt; examples- \&quot;morphological\&quot;, \&quot;phenological\&quot;, \&quot;agronomical\&quot;, \&quot;physiological\&quot;, \&quot;abiotic stress\&quot;, \&quot;biotic stress\&quot;, \&quot;biochemical\&quot;, \&quot;quality traits\&quot;, \&quot;fertility\&quot;, etc.
     *
     * @return traitClass
     **/
    @Schema(example = "phenological", description = "A classification to describe the type of trait and the context it should be considered in. <br/> examples- \"morphological\", \"phenological\", \"agronomical\", \"physiological\", \"abiotic stress\", \"biotic stress\", \"biochemical\", \"quality traits\", \"fertility\", etc.")
    public String getTraitClass() {
        return traitClass;
    }

    public void setTraitClass(String traitClass) {
        this.traitClass = traitClass;
    }

    public ObservationVariableTrait traitDbId(String traitDbId) {
        this.traitDbId = traitDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a trait
     *
     * @return traitDbId
     **/
    @Schema(example = "9b2e34f5", description = "The ID which uniquely identifies a trait")
    public String getTraitDbId() {
        return traitDbId;
    }

    public void setTraitDbId(String traitDbId) {
        this.traitDbId = traitDbId;
    }

    public ObservationVariableTrait traitDescription(String traitDescription) {
        this.traitDescription = traitDescription;
        return this;
    }

    /**
     * The description of a trait
     *
     * @return traitDescription
     **/
    @Schema(example = "The height of the plant", description = "The description of a trait")
    public String getTraitDescription() {
        return traitDescription;
    }

    public void setTraitDescription(String traitDescription) {
        this.traitDescription = traitDescription;
    }

    public ObservationVariableTrait traitName(String traitName) {
        this.traitName = traitName;
        return this;
    }

    /**
     * The human readable name of a trait &lt;br/&gt;MIAPPE V1.1 (DM-86) Trait - Name of the (plant or environmental) trait under observation
     *
     * @return traitName
     **/
    @Schema(example = "Height", description = "The human readable name of a trait <br/>MIAPPE V1.1 (DM-86) Trait - Name of the (plant or environmental) trait under observation")
    public String getTraitName() {
        return traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public ObservationVariableTrait traitPUI(String traitPUI) {
        this.traitPUI = traitPUI;
        return this;
    }

    /**
     * The Permanent Unique Identifier of a Trait, usually in the form of a URI
     *
     * @return traitPUI
     **/
    @Schema(example = "http://my-traits.com/trait/CO_123:0000012", description = "The Permanent Unique Identifier of a Trait, usually in the form of a URI")
    public String getTraitPUI() {
        return traitPUI;
    }

    public void setTraitPUI(String traitPUI) {
        this.traitPUI = traitPUI;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObservationVariableTrait observationVariableTrait = (ObservationVariableTrait) o;
        return Objects.equals(this.additionalInfo, observationVariableTrait.additionalInfo) &&
                Objects.equals(this.alternativeAbbreviations, observationVariableTrait.alternativeAbbreviations) &&
                Objects.equals(this.attribute, observationVariableTrait.attribute) &&
                Objects.equals(this.attributePUI, observationVariableTrait.attributePUI) &&
                Objects.equals(this.entity, observationVariableTrait.entity) &&
                Objects.equals(this.entityPUI, observationVariableTrait.entityPUI) &&
                Objects.equals(this.externalReferences, observationVariableTrait.externalReferences) &&
                Objects.equals(this.mainAbbreviation, observationVariableTrait.mainAbbreviation) &&
                Objects.equals(this.ontologyReference, observationVariableTrait.ontologyReference) &&
                Objects.equals(this.status, observationVariableTrait.status) &&
                Objects.equals(this.synonyms, observationVariableTrait.synonyms) &&
                Objects.equals(this.traitClass, observationVariableTrait.traitClass) &&
                Objects.equals(this.traitDbId, observationVariableTrait.traitDbId) &&
                Objects.equals(this.traitDescription, observationVariableTrait.traitDescription) &&
                Objects.equals(this.traitName, observationVariableTrait.traitName) &&
                Objects.equals(this.traitPUI, observationVariableTrait.traitPUI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, alternativeAbbreviations, attribute, attributePUI, entity, entityPUI, externalReferences, mainAbbreviation, ontologyReference, status, synonyms, traitClass, traitDbId, traitDescription, traitName, traitPUI);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservationVariableTrait {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    alternativeAbbreviations: ").append(toIndentedString(alternativeAbbreviations)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    attributePUI: ").append(toIndentedString(attributePUI)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    entityPUI: ").append(toIndentedString(entityPUI)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    mainAbbreviation: ").append(toIndentedString(mainAbbreviation)).append("\n");
        sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
        sb.append("    traitClass: ").append(toIndentedString(traitClass)).append("\n");
        sb.append("    traitDbId: ").append(toIndentedString(traitDbId)).append("\n");
        sb.append("    traitDescription: ").append(toIndentedString(traitDescription)).append("\n");
        sb.append("    traitName: ").append(toIndentedString(traitName)).append("\n");
        sb.append("    traitPUI: ").append(toIndentedString(traitPUI)).append("\n");
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
