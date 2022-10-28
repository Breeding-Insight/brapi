/*
 * BrAPI-Core
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.0/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.0\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore20.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.core;

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
 * ListSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:03.583Z[GMT]")
public class ListSummary {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("dateCreated")
    private OffsetDateTime dateCreated = null;

    @SerializedName("dateModified")
    private OffsetDateTime dateModified = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("listDbId")
    private String listDbId = null;

    @SerializedName("listDescription")
    private String listDescription = null;

    @SerializedName("listName")
    private String listName = null;

    @SerializedName("listOwnerName")
    private String listOwnerName = null;

    @SerializedName("listOwnerPersonDbId")
    private String listOwnerPersonDbId = null;

    @SerializedName("listSize")
    private Integer listSize = null;

    @SerializedName("listSource")
    private String listSource = null;

    /**
     * A flag to indicate the type of objects that are referneced in a List
     */
    @JsonAdapter(ListTypeEnum.Adapter.class)
    public enum ListTypeEnum {
        GERMPLASM("germplasm"),
        MARKERS("markers"),
        VARIANTS("variants"),
        PROGRAMS("programs"),
        TRIALS("trials"),
        STUDIES("studies"),
        OBSERVATIONUNITS("observationUnits"),
        OBSERVATIONS("observations"),
        OBSERVATIONVARIABLES("observationVariables"),
        SAMPLES("samples");

        private String value;

        ListTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ListTypeEnum fromValue(String input) {
            for (ListTypeEnum b : ListTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ListTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ListTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ListTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ListTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("listType")
    private ListTypeEnum listType = null;

    public ListSummary additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ListSummary putAdditionalInfoItem(String key, String additionalInfoItem) {
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
    @Schema(example = "{}", description = "A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.")
    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ListSummary dateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * Timestamp when the entity was first created
     *
     * @return dateCreated
     **/
    @Schema(description = "Timestamp when the entity was first created")
    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ListSummary dateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }

    /**
     * Timestamp when the entity was last updated
     *
     * @return dateModified
     **/
    @Schema(description = "Timestamp when the entity was last updated")
    public OffsetDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public ListSummary externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ListSummary addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
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

    public ListSummary listDbId(String listDbId) {
        this.listDbId = listDbId;
        return this;
    }

    /**
     * The unique identifier for a List
     *
     * @return listDbId
     **/
    @Schema(example = "6f621cfa", description = "The unique identifier for a List")
    public String getListDbId() {
        return listDbId;
    }

    public void setListDbId(String listDbId) {
        this.listDbId = listDbId;
    }

    public ListSummary listDescription(String listDescription) {
        this.listDescription = listDescription;
        return this;
    }

    /**
     * Description of a List
     *
     * @return listDescription
     **/
    @Schema(example = "This is a list of germplasm I would like to investigate next season", description = "Description of a List")
    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }

    public ListSummary listName(String listName) {
        this.listName = listName;
        return this;
    }

    /**
     * Human readable name of a List
     *
     * @return listName
     **/
    @Schema(example = "MyGermplasm_Sept_2020", description = "Human readable name of a List")
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ListSummary listOwnerName(String listOwnerName) {
        this.listOwnerName = listOwnerName;
        return this;
    }

    /**
     * Human readable name of a List Owner. (usually a user or person)
     *
     * @return listOwnerName
     **/
    @Schema(example = "Bob Robertson", description = "Human readable name of a List Owner. (usually a user or person)")
    public String getListOwnerName() {
        return listOwnerName;
    }

    public void setListOwnerName(String listOwnerName) {
        this.listOwnerName = listOwnerName;
    }

    public ListSummary listOwnerPersonDbId(String listOwnerPersonDbId) {
        this.listOwnerPersonDbId = listOwnerPersonDbId;
        return this;
    }

    /**
     * The unique identifier for a List Owner. (usually a user or person)
     *
     * @return listOwnerPersonDbId
     **/
    @Schema(example = "58db0628", description = "The unique identifier for a List Owner. (usually a user or person)")
    public String getListOwnerPersonDbId() {
        return listOwnerPersonDbId;
    }

    public void setListOwnerPersonDbId(String listOwnerPersonDbId) {
        this.listOwnerPersonDbId = listOwnerPersonDbId;
    }

    public ListSummary listSize(Integer listSize) {
        this.listSize = listSize;
        return this;
    }

    /**
     * The number of elements in a List
     *
     * @return listSize
     **/
    @Schema(example = "53", description = "The number of elements in a List")
    public Integer getListSize() {
        return listSize;
    }

    public void setListSize(Integer listSize) {
        this.listSize = listSize;
    }

    public ListSummary listSource(String listSource) {
        this.listSource = listSource;
        return this;
    }

    /**
     * The description of where a List originated from
     *
     * @return listSource
     **/
    @Schema(example = "GeneBank Repository 1.3", description = "The description of where a List originated from")
    public String getListSource() {
        return listSource;
    }

    public void setListSource(String listSource) {
        this.listSource = listSource;
    }

    public ListSummary listType(ListTypeEnum listType) {
        this.listType = listType;
        return this;
    }

    /**
     * A flag to indicate the type of objects that are referneced in a List
     *
     * @return listType
     **/
    @Schema(example = "germplasm", description = "A flag to indicate the type of objects that are referneced in a List")
    public ListTypeEnum getListType() {
        return listType;
    }

    public void setListType(ListTypeEnum listType) {
        this.listType = listType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSummary listSummary = (ListSummary) o;
        return Objects.equals(this.additionalInfo, listSummary.additionalInfo) &&
                Objects.equals(this.dateCreated, listSummary.dateCreated) &&
                Objects.equals(this.dateModified, listSummary.dateModified) &&
                Objects.equals(this.externalReferences, listSummary.externalReferences) &&
                Objects.equals(this.listDbId, listSummary.listDbId) &&
                Objects.equals(this.listDescription, listSummary.listDescription) &&
                Objects.equals(this.listName, listSummary.listName) &&
                Objects.equals(this.listOwnerName, listSummary.listOwnerName) &&
                Objects.equals(this.listOwnerPersonDbId, listSummary.listOwnerPersonDbId) &&
                Objects.equals(this.listSize, listSummary.listSize) &&
                Objects.equals(this.listSource, listSummary.listSource) &&
                Objects.equals(this.listType, listSummary.listType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, dateCreated, dateModified, externalReferences, listDbId, listDescription, listName, listOwnerName, listOwnerPersonDbId, listSize, listSource, listType);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSummary {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
        sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    listDbId: ").append(toIndentedString(listDbId)).append("\n");
        sb.append("    listDescription: ").append(toIndentedString(listDescription)).append("\n");
        sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
        sb.append("    listOwnerName: ").append(toIndentedString(listOwnerName)).append("\n");
        sb.append("    listOwnerPersonDbId: ").append(toIndentedString(listOwnerPersonDbId)).append("\n");
        sb.append("    listSize: ").append(toIndentedString(listSize)).append("\n");
        sb.append("    listSource: ").append(toIndentedString(listSource)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
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
