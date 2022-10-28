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

import java.util.Objects;

/**
 * Observation levels indicate the granularity level at which the measurements are taken. &#x60;levelName&#x60;  defines the level, &#x60;levelOrder&#x60; defines where that level exists in the hierarchy of levels.  &#x60;levelOrder&#x60;s lower numbers are at the top of the hierarchy (ie field &gt; 0) and higher numbers are  at the bottom of the hierarchy (ie plant &gt; 6). &#x60;levelCode&#x60; is an ID code for this level tag. Identify  this observation unit by each level of the hierarchy where it exists.   For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.   **Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample**
 */
@Schema(description = "Observation levels indicate the granularity level at which the measurements are taken. `levelName`  defines the level, `levelOrder` defines where that level exists in the hierarchy of levels.  `levelOrder`s lower numbers are at the top of the hierarchy (ie field > 0) and higher numbers are  at the bottom of the hierarchy (ie plant > 6). `levelCode` is an ID code for this level tag. Identify  this observation unit by each level of the hierarchy where it exists.   For more information on Observation Levels, please review the <a target=\"_blank\" href=\"https://wiki.brapi.org/index.php/Observation_Levels\">Observation Levels documentation</a>.   **Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample** ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ObservationUnitLevelRelationship {
    @SerializedName("levelCode")
    private String levelCode = null;

    @SerializedName("levelName")
    private String levelName = null;

    @SerializedName("levelOrder")
    private Integer levelOrder = null;

    @SerializedName("observationUnitDbId")
    private String observationUnitDbId = null;

    public ObservationUnitLevelRelationship levelCode(String levelCode) {
        this.levelCode = levelCode;
        return this;
    }

    /**
     * An ID code or number to represent a real thing that may or may not be an an observation unit. &lt;br/&gt;For example, if the &#x27;levelName&#x27; is &#x27;plot&#x27;, then the &#x27;levelCode&#x27; would be the plot number or plot barcode. If this plot is also considered an ObservationUnit, then the appropriate observationUnitDbId should also be recorded. &lt;br/&gt;If the &#x27;levelName&#x27; is &#x27;field&#x27;, then the &#x27;levelCode&#x27; might be something like &#x27;3&#x27; or &#x27;F3&#x27; to indicate the third field at a research station.
     *
     * @return levelCode
     **/
    @Schema(example = "Plot_123", description = "An ID code or number to represent a real thing that may or may not be an an observation unit. <br/>For example, if the 'levelName' is 'plot', then the 'levelCode' would be the plot number or plot barcode. If this plot is also considered an ObservationUnit, then the appropriate observationUnitDbId should also be recorded. <br/>If the 'levelName' is 'field', then the 'levelCode' might be something like '3' or 'F3' to indicate the third field at a research station. ")
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public ObservationUnitLevelRelationship levelName(String levelName) {
        this.levelName = levelName;
        return this;
    }

    /**
     * A name for this level   **Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample**   For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.
     *
     * @return levelName
     **/
    @Schema(example = "plot", description = "A name for this level   **Standard Level Names: study, field, entry, rep, block, sub-block, plot, sub-plot, plant, pot, sample**   For more information on Observation Levels, please review the <a target=\"_blank\" href=\"https://wiki.brapi.org/index.php/Observation_Levels\">Observation Levels documentation</a>. ")
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public ObservationUnitLevelRelationship levelOrder(Integer levelOrder) {
        this.levelOrder = levelOrder;
        return this;
    }

    /**
     * &#x60;levelOrder&#x60; defines where that level exists in the hierarchy of levels. &#x60;levelOrder&#x60;&#x27;s lower numbers  are at the top of the hierarchy (ie field -&gt; 1) and higher numbers are at the bottom of the hierarchy (ie plant -&gt; 9).   For more information on Observation Levels, please review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://wiki.brapi.org/index.php/Observation_Levels\&quot;&gt;Observation Levels documentation&lt;/a&gt;.
     *
     * @return levelOrder
     **/
    @Schema(example = "2", description = "`levelOrder` defines where that level exists in the hierarchy of levels. `levelOrder`'s lower numbers  are at the top of the hierarchy (ie field -> 1) and higher numbers are at the bottom of the hierarchy (ie plant -> 9).   For more information on Observation Levels, please review the <a target=\"_blank\" href=\"https://wiki.brapi.org/index.php/Observation_Levels\">Observation Levels documentation</a>. ")
    public Integer getLevelOrder() {
        return levelOrder;
    }

    public void setLevelOrder(Integer levelOrder) {
        this.levelOrder = levelOrder;
    }

    public ObservationUnitLevelRelationship observationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies an observation unit &lt;br/&gt;If this level has on ObservationUnit associated with it, record the observationUnitDbId here. This is intended to construct a strict hierarchy of observationUnits.  &lt;br/&gt;If there is no ObservationUnit associated with this level, this field can set to NULL or omitted from the response.
     *
     * @return observationUnitDbId
     **/
    @Schema(example = "5ab883e9", description = "The ID which uniquely identifies an observation unit <br/>If this level has on ObservationUnit associated with it, record the observationUnitDbId here. This is intended to construct a strict hierarchy of observationUnits.  <br/>If there is no ObservationUnit associated with this level, this field can set to NULL or omitted from the response.")
    public String getObservationUnitDbId() {
        return observationUnitDbId;
    }

    public void setObservationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObservationUnitLevelRelationship observationUnitLevelRelationship = (ObservationUnitLevelRelationship) o;
        return Objects.equals(this.levelCode, observationUnitLevelRelationship.levelCode) &&
                Objects.equals(this.levelName, observationUnitLevelRelationship.levelName) &&
                Objects.equals(this.levelOrder, observationUnitLevelRelationship.levelOrder) &&
                Objects.equals(this.observationUnitDbId, observationUnitLevelRelationship.observationUnitDbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelCode, levelName, levelOrder, observationUnitDbId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservationUnitLevelRelationship {\n");

        sb.append("    levelCode: ").append(toIndentedString(levelCode)).append("\n");
        sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
        sb.append("    levelOrder: ").append(toIndentedString(levelOrder)).append("\n");
        sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
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
