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
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.*;

/**
 * CrossNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:45:22.672Z[GMT]")
public class CrossNewRequest {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("crossAttributes")
    private List<CrossCrossAttributes> crossAttributes = null;

    @SerializedName("crossName")
    private String crossName = null;

    /**
     * the type of cross
     */
    @JsonAdapter(CrossTypeEnum.Adapter.class)
    public enum CrossTypeEnum {
        BIPARENTAL("BIPARENTAL"),
        SELF("SELF"),
        OPEN_POLLINATED("OPEN_POLLINATED"),
        BULK("BULK"),
        BULK_SELFED("BULK_SELFED"),
        BULK_OPEN_POLLINATED("BULK_OPEN_POLLINATED"),
        DOUBLE_HAPLOID("DOUBLE_HAPLOID");

        private String value;

        CrossTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CrossTypeEnum fromValue(String input) {
            for (CrossTypeEnum b : CrossTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CrossTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CrossTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public CrossTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return CrossTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("crossType")
    private CrossTypeEnum crossType = null;

    @SerializedName("crossingProjectDbId")
    private String crossingProjectDbId = null;

    @SerializedName("crossingProjectName")
    private String crossingProjectName = null;

    @SerializedName("externalReferences")
    private List<CrossExternalReferences> externalReferences = null;

    @SerializedName("parent1")
    private CrossParent1 parent1 = null;

    @SerializedName("parent2")
    private CrossParent1 parent2 = null;

    @SerializedName("plannedCrossDbId")
    private String plannedCrossDbId = null;

    @SerializedName("plannedCrossName")
    private String plannedCrossName = null;

    @SerializedName("pollinationEvents")
    private List<CrossPollinationEvents> pollinationEvents = null;

    @SerializedName("pollinationTimeStamp")
    private OffsetDateTime pollinationTimeStamp = null;

    public CrossNewRequest additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public CrossNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
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

    public CrossNewRequest crossAttributes(List<CrossCrossAttributes> crossAttributes) {
        this.crossAttributes = crossAttributes;
        return this;
    }

    public CrossNewRequest addCrossAttributesItem(CrossCrossAttributes crossAttributesItem) {
        if (this.crossAttributes == null) {
            this.crossAttributes = new ArrayList<CrossCrossAttributes>();
        }
        this.crossAttributes.add(crossAttributesItem);
        return this;
    }

    /**
     * Set of custom attributes associated with a cross
     *
     * @return crossAttributes
     **/
    @Schema(description = "Set of custom attributes associated with a cross")
    public List<CrossCrossAttributes> getCrossAttributes() {
        return crossAttributes;
    }

    public void setCrossAttributes(List<CrossCrossAttributes> crossAttributes) {
        this.crossAttributes = crossAttributes;
    }

    public CrossNewRequest crossName(String crossName) {
        this.crossName = crossName;
        return this;
    }

    /**
     * the human readable name for a cross
     *
     * @return crossName
     **/
    @Schema(example = "my_Crosses_2018_01", description = "the human readable name for a cross")
    public String getCrossName() {
        return crossName;
    }

    public void setCrossName(String crossName) {
        this.crossName = crossName;
    }

    public CrossNewRequest crossType(CrossTypeEnum crossType) {
        this.crossType = crossType;
        return this;
    }

    /**
     * the type of cross
     *
     * @return crossType
     **/
    @Schema(example = "BIPARENTAL", description = "the type of cross")
    public CrossTypeEnum getCrossType() {
        return crossType;
    }

    public void setCrossType(CrossTypeEnum crossType) {
        this.crossType = crossType;
    }

    public CrossNewRequest crossingProjectDbId(String crossingProjectDbId) {
        this.crossingProjectDbId = crossingProjectDbId;
        return this;
    }

    /**
     * the unique identifier for a crossing project
     *
     * @return crossingProjectDbId
     **/
    @Schema(example = "696d7c92", description = "the unique identifier for a crossing project")
    public String getCrossingProjectDbId() {
        return crossingProjectDbId;
    }

    public void setCrossingProjectDbId(String crossingProjectDbId) {
        this.crossingProjectDbId = crossingProjectDbId;
    }

    public CrossNewRequest crossingProjectName(String crossingProjectName) {
        this.crossingProjectName = crossingProjectName;
        return this;
    }

    /**
     * the human readable name for a crossing project
     *
     * @return crossingProjectName
     **/
    @Schema(example = "my_Crosses_2018", description = "the human readable name for a crossing project")
    public String getCrossingProjectName() {
        return crossingProjectName;
    }

    public void setCrossingProjectName(String crossingProjectName) {
        this.crossingProjectName = crossingProjectName;
    }

    public CrossNewRequest externalReferences(List<CrossExternalReferences> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public CrossNewRequest addExternalReferencesItem(CrossExternalReferences externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<CrossExternalReferences>();
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
    public List<CrossExternalReferences> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<CrossExternalReferences> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public CrossNewRequest parent1(CrossParent1 parent1) {
        this.parent1 = parent1;
        return this;
    }

    /**
     * Get parent1
     *
     * @return parent1
     **/
    @Schema(description = "")
    public CrossParent1 getParent1() {
        return parent1;
    }

    public void setParent1(CrossParent1 parent1) {
        this.parent1 = parent1;
    }

    public CrossNewRequest parent2(CrossParent1 parent2) {
        this.parent2 = parent2;
        return this;
    }

    /**
     * Get parent2
     *
     * @return parent2
     **/
    @Schema(description = "")
    public CrossParent1 getParent2() {
        return parent2;
    }

    public void setParent2(CrossParent1 parent2) {
        this.parent2 = parent2;
    }

    public CrossNewRequest plannedCrossDbId(String plannedCrossDbId) {
        this.plannedCrossDbId = plannedCrossDbId;
        return this;
    }

    /**
     * the unique identifier for a planned cross
     *
     * @return plannedCrossDbId
     **/
    @Schema(example = "c8905568", description = "the unique identifier for a planned cross")
    public String getPlannedCrossDbId() {
        return plannedCrossDbId;
    }

    public void setPlannedCrossDbId(String plannedCrossDbId) {
        this.plannedCrossDbId = plannedCrossDbId;
    }

    public CrossNewRequest plannedCrossName(String plannedCrossName) {
        this.plannedCrossName = plannedCrossName;
        return this;
    }

    /**
     * the human readable name for a planned cross
     *
     * @return plannedCrossName
     **/
    @Schema(example = "my_Crosses_2018_01", description = "the human readable name for a planned cross")
    public String getPlannedCrossName() {
        return plannedCrossName;
    }

    public void setPlannedCrossName(String plannedCrossName) {
        this.plannedCrossName = plannedCrossName;
    }

    public CrossNewRequest pollinationEvents(List<CrossPollinationEvents> pollinationEvents) {
        this.pollinationEvents = pollinationEvents;
        return this;
    }

    public CrossNewRequest addPollinationEventsItem(CrossPollinationEvents pollinationEventsItem) {
        if (this.pollinationEvents == null) {
            this.pollinationEvents = new ArrayList<CrossPollinationEvents>();
        }
        this.pollinationEvents.add(pollinationEventsItem);
        return this;
    }

    /**
     * The list of pollination events that occurred for this cross
     *
     * @return pollinationEvents
     **/
    @Schema(description = "The list of pollination events that occurred for this cross")
    public List<CrossPollinationEvents> getPollinationEvents() {
        return pollinationEvents;
    }

    public void setPollinationEvents(List<CrossPollinationEvents> pollinationEvents) {
        this.pollinationEvents = pollinationEvents;
    }

    public CrossNewRequest pollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
        this.pollinationTimeStamp = pollinationTimeStamp;
        return this;
    }

    /**
     * **Deprecated in v2.1** Please use &#x60;pollinationEvents&#x60;. Github issue number #265  &lt;br&gt;The timestamp when the pollination took place
     *
     * @return pollinationTimeStamp
     **/
    @Schema(description = "**Deprecated in v2.1** Please use `pollinationEvents`. Github issue number #265  <br>The timestamp when the pollination took place")
    public OffsetDateTime getPollinationTimeStamp() {
        return pollinationTimeStamp;
    }

    public void setPollinationTimeStamp(OffsetDateTime pollinationTimeStamp) {
        this.pollinationTimeStamp = pollinationTimeStamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CrossNewRequest crossNewRequest = (CrossNewRequest) o;
        return Objects.equals(this.additionalInfo, crossNewRequest.additionalInfo) &&
                Objects.equals(this.crossAttributes, crossNewRequest.crossAttributes) &&
                Objects.equals(this.crossName, crossNewRequest.crossName) &&
                Objects.equals(this.crossType, crossNewRequest.crossType) &&
                Objects.equals(this.crossingProjectDbId, crossNewRequest.crossingProjectDbId) &&
                Objects.equals(this.crossingProjectName, crossNewRequest.crossingProjectName) &&
                Objects.equals(this.externalReferences, crossNewRequest.externalReferences) &&
                Objects.equals(this.parent1, crossNewRequest.parent1) &&
                Objects.equals(this.parent2, crossNewRequest.parent2) &&
                Objects.equals(this.plannedCrossDbId, crossNewRequest.plannedCrossDbId) &&
                Objects.equals(this.plannedCrossName, crossNewRequest.plannedCrossName) &&
                Objects.equals(this.pollinationEvents, crossNewRequest.pollinationEvents) &&
                Objects.equals(this.pollinationTimeStamp, crossNewRequest.pollinationTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, crossAttributes, crossName, crossType, crossingProjectDbId, crossingProjectName, externalReferences, parent1, parent2, plannedCrossDbId, plannedCrossName, pollinationEvents, pollinationTimeStamp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossNewRequest {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    crossAttributes: ").append(toIndentedString(crossAttributes)).append("\n");
        sb.append("    crossName: ").append(toIndentedString(crossName)).append("\n");
        sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
        sb.append("    crossingProjectDbId: ").append(toIndentedString(crossingProjectDbId)).append("\n");
        sb.append("    crossingProjectName: ").append(toIndentedString(crossingProjectName)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    parent1: ").append(toIndentedString(parent1)).append("\n");
        sb.append("    parent2: ").append(toIndentedString(parent2)).append("\n");
        sb.append("    plannedCrossDbId: ").append(toIndentedString(plannedCrossDbId)).append("\n");
        sb.append("    plannedCrossName: ").append(toIndentedString(plannedCrossName)).append("\n");
        sb.append("    pollinationEvents: ").append(toIndentedString(pollinationEvents)).append("\n");
        sb.append("    pollinationTimeStamp: ").append(toIndentedString(pollinationTimeStamp)).append("\n");
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
