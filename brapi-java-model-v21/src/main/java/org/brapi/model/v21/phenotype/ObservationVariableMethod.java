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

package org.brapi.model.v21.phenotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;

/**
 * A description of the way an Observation should be collected.  &lt;br&gt;For example, an ObservationVariable might be defined with a Trait of \&quot;plant height\&quot;, a Scale of \&quot;meters\&quot;, and a Method of \&quot;tape measure\&quot;. This variable would be distinct from a variable with the Method \&quot;estimation\&quot; or \&quot;drone image processing\&quot;.
 */
@Schema(description = "A description of the way an Observation should be collected.  <br>For example, an ObservationVariable might be defined with a Trait of \"plant height\", a Scale of \"meters\", and a Method of \"tape measure\". This variable would be distinct from a variable with the Method \"estimation\" or \"drone image processing\". ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ObservationVariableMethod {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("bibliographicalReference")
    private String bibliographicalReference = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("formula")
    private String formula = null;

    @SerializedName("methodClass")
    private String methodClass = null;

    @SerializedName("methodDbId")
    private String methodDbId = null;

    @SerializedName("methodName")
    private String methodName = null;

    @SerializedName("methodPUI")
    private String methodPUI = null;

    @SerializedName("ontologyReference")
    private MethodOntologyReference ontologyReference = null;

    public ObservationVariableMethod additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ObservationVariableMethod putAdditionalInfoItem(String key, String additionalInfoItem) {
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

    public ObservationVariableMethod bibliographicalReference(String bibliographicalReference) {
        this.bibliographicalReference = bibliographicalReference;
        return this;
    }

    /**
     * Bibliographical reference describing the method. &lt;br/&gt;MIAPPE V1.1 (DM-91) Reference associated to the method - URI/DOI of reference describing the method.
     *
     * @return bibliographicalReference
     **/
    @Schema(example = "Smith, 1893, Really Cool Paper, Popular Journal", description = "Bibliographical reference describing the method. <br/>MIAPPE V1.1 (DM-91) Reference associated to the method - URI/DOI of reference describing the method.")
    public String getBibliographicalReference() {
        return bibliographicalReference;
    }

    public void setBibliographicalReference(String bibliographicalReference) {
        this.bibliographicalReference = bibliographicalReference;
    }

    public ObservationVariableMethod description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Method description &lt;br/&gt;MIAPPE V1.1 (DM-90) Method description - Textual description of the method, which may extend a method defined in an external reference with specific parameters, e.g. growth stage, inoculation precise organ (leaf number)
     *
     * @return description
     **/
    @Schema(example = "A measuring tape was used", description = "Method description <br/>MIAPPE V1.1 (DM-90) Method description - Textual description of the method, which may extend a method defined in an external reference with specific parameters, e.g. growth stage, inoculation precise organ (leaf number)")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ObservationVariableMethod externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ObservationVariableMethod addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
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

    public ObservationVariableMethod formula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * For computational methods i.e., when the method consists in assessing the trait by computing measurements, write the generic formula used for the calculation
     *
     * @return formula
     **/
    @Schema(example = "a^2 + b^2 = c^2", description = "For computational methods i.e., when the method consists in assessing the trait by computing measurements, write the generic formula used for the calculation")
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ObservationVariableMethod methodClass(String methodClass) {
        this.methodClass = methodClass;
        return this;
    }

    /**
     * Method class (examples: \&quot;Measurement\&quot;, \&quot;Counting\&quot;, \&quot;Estimation\&quot;, \&quot;Computation\&quot;, etc.)
     *
     * @return methodClass
     **/
    @Schema(example = "Measurement", description = "Method class (examples: \"Measurement\", \"Counting\", \"Estimation\", \"Computation\", etc.)")
    public String getMethodClass() {
        return methodClass;
    }

    public void setMethodClass(String methodClass) {
        this.methodClass = methodClass;
    }

    public ObservationVariableMethod methodDbId(String methodDbId) {
        this.methodDbId = methodDbId;
        return this;
    }

    /**
     * Method unique identifier
     *
     * @return methodDbId
     **/
    @Schema(example = "0adb2764", description = "Method unique identifier")
    public String getMethodDbId() {
        return methodDbId;
    }

    public void setMethodDbId(String methodDbId) {
        this.methodDbId = methodDbId;
    }

    public ObservationVariableMethod methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    /**
     * Human readable name for the method &lt;br/&gt;MIAPPE V1.1 (DM-88) Method  Name of the method of observation
     *
     * @return methodName
     **/
    @Schema(example = "Measuring Tape", description = "Human readable name for the method <br/>MIAPPE V1.1 (DM-88) Method  Name of the method of observation")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public ObservationVariableMethod methodPUI(String methodPUI) {
        this.methodPUI = methodPUI;
        return this;
    }

    /**
     * The Permanent Unique Identifier of a Method, usually in the form of a URI
     *
     * @return methodPUI
     **/
    @Schema(example = "http://my-traits.com/trait/CO_123:0000212", description = "The Permanent Unique Identifier of a Method, usually in the form of a URI")
    public String getMethodPUI() {
        return methodPUI;
    }

    public void setMethodPUI(String methodPUI) {
        this.methodPUI = methodPUI;
    }

    public ObservationVariableMethod ontologyReference(MethodOntologyReference ontologyReference) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObservationVariableMethod observationVariableMethod = (ObservationVariableMethod) o;
        return Objects.equals(this.additionalInfo, observationVariableMethod.additionalInfo) &&
                Objects.equals(this.bibliographicalReference, observationVariableMethod.bibliographicalReference) &&
                Objects.equals(this.description, observationVariableMethod.description) &&
                Objects.equals(this.externalReferences, observationVariableMethod.externalReferences) &&
                Objects.equals(this.formula, observationVariableMethod.formula) &&
                Objects.equals(this.methodClass, observationVariableMethod.methodClass) &&
                Objects.equals(this.methodDbId, observationVariableMethod.methodDbId) &&
                Objects.equals(this.methodName, observationVariableMethod.methodName) &&
                Objects.equals(this.methodPUI, observationVariableMethod.methodPUI) &&
                Objects.equals(this.ontologyReference, observationVariableMethod.ontologyReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, bibliographicalReference, description, externalReferences, formula, methodClass, methodDbId, methodName, methodPUI, ontologyReference);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservationVariableMethod {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    bibliographicalReference: ").append(toIndentedString(bibliographicalReference)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    methodClass: ").append(toIndentedString(methodClass)).append("\n");
        sb.append("    methodDbId: ").append(toIndentedString(methodDbId)).append("\n");
        sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
        sb.append("    methodPUI: ").append(toIndentedString(methodPUI)).append("\n");
        sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
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
