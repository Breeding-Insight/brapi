/*
 * BrAPI-Germplasm
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.germplasm;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * CrossParent1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:45:22.672Z[GMT]")
public class CrossParent1 {
    @SerializedName("germplasmDbId")
    private String germplasmDbId = null;

    @SerializedName("germplasmName")
    private String germplasmName = null;

    @SerializedName("observationUnitDbId")
    private String observationUnitDbId = null;

    @SerializedName("observationUnitName")
    private String observationUnitName = null;

    /**
     * The type of parent ex. &#x27;MALE&#x27;, &#x27;FEMALE&#x27;, &#x27;SELF&#x27;, &#x27;POPULATION&#x27;, etc.
     */
    @JsonAdapter(ParentTypeEnum.Adapter.class)
    public enum ParentTypeEnum {
        MALE("MALE"),
        FEMALE("FEMALE"),
        SELF("SELF"),
        POPULATION("POPULATION");

        private String value;

        ParentTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ParentTypeEnum fromValue(String input) {
            for (ParentTypeEnum b : ParentTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ParentTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ParentTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ParentTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ParentTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("parentType")
    private ParentTypeEnum parentType = null;

    public CrossParent1 germplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
        return this;
    }

    /**
     * the unique identifier for a germplasm
     *
     * @return germplasmDbId
     **/
    @Schema(example = "d34b10c3", description = "the unique identifier for a germplasm")
    public String getGermplasmDbId() {
        return germplasmDbId;
    }

    public void setGermplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
    }

    public CrossParent1 germplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
        return this;
    }

    /**
     * the human readable name for a germplasm
     *
     * @return germplasmName
     **/
    @Schema(example = "TME_419", description = "the human readable name for a germplasm")
    public String getGermplasmName() {
        return germplasmName;
    }

    public void setGermplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
    }

    public CrossParent1 observationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
        return this;
    }

    /**
     * the unique identifier for an observation unit
     *
     * @return observationUnitDbId
     **/
    @Schema(example = "2e1926a7", description = "the unique identifier for an observation unit")
    public String getObservationUnitDbId() {
        return observationUnitDbId;
    }

    public void setObservationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
    }

    public CrossParent1 observationUnitName(String observationUnitName) {
        this.observationUnitName = observationUnitName;
        return this;
    }

    /**
     * the human readable name for an observation unit
     *
     * @return observationUnitName
     **/
    @Schema(example = "my_Plot_9001", description = "the human readable name for an observation unit")
    public String getObservationUnitName() {
        return observationUnitName;
    }

    public void setObservationUnitName(String observationUnitName) {
        this.observationUnitName = observationUnitName;
    }

    public CrossParent1 parentType(ParentTypeEnum parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * The type of parent ex. &#x27;MALE&#x27;, &#x27;FEMALE&#x27;, &#x27;SELF&#x27;, &#x27;POPULATION&#x27;, etc.
     *
     * @return parentType
     **/
    @Schema(example = "MALE", description = "The type of parent ex. 'MALE', 'FEMALE', 'SELF', 'POPULATION', etc.")
    public ParentTypeEnum getParentType() {
        return parentType;
    }

    public void setParentType(ParentTypeEnum parentType) {
        this.parentType = parentType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CrossParent1 crossParent1 = (CrossParent1) o;
        return Objects.equals(this.germplasmDbId, crossParent1.germplasmDbId) &&
                Objects.equals(this.germplasmName, crossParent1.germplasmName) &&
                Objects.equals(this.observationUnitDbId, crossParent1.observationUnitDbId) &&
                Objects.equals(this.observationUnitName, crossParent1.observationUnitName) &&
                Objects.equals(this.parentType, crossParent1.parentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(germplasmDbId, germplasmName, observationUnitDbId, observationUnitName, parentType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossParent1 {\n");

        sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
        sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
        sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
        sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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