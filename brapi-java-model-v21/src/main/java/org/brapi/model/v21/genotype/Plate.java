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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.*;

/**
 * Plate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class Plate {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("plateBarcode")
    private String plateBarcode = null;

    @SerializedName("plateDbId")
    private String plateDbId = null;

    /**
     * Enum for plate formats, usually \&quot;PLATE_96\&quot; for a 96 well plate or \&quot;TUBES\&quot; for plateless format
     */
    @JsonAdapter(PlateFormatEnum.Adapter.class)
    public enum PlateFormatEnum {
        PLATE_96("PLATE_96"),
        TUBES("TUBES");

        private String value;

        PlateFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PlateFormatEnum fromValue(String input) {
            for (PlateFormatEnum b : PlateFormatEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PlateFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PlateFormatEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public PlateFormatEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PlateFormatEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("plateFormat")
    private PlateFormatEnum plateFormat = null;

    @SerializedName("plateName")
    private String plateName = null;

    @SerializedName("programDbId")
    private String programDbId = null;

    /**
     * The type of samples taken. ex. &#x27;DNA&#x27;, &#x27;RNA&#x27;, &#x27;Tissue&#x27;, etc
     */
    @JsonAdapter(SampleTypeEnum.Adapter.class)
    public enum SampleTypeEnum {
        DNA("DNA"),
        RNA("RNA"),
        TISSUE("TISSUE"),
        MIXED("MIXED");

        private String value;

        SampleTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SampleTypeEnum fromValue(String input) {
            for (SampleTypeEnum b : SampleTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<SampleTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SampleTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public SampleTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return SampleTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("sampleType")
    private SampleTypeEnum sampleType = null;

    @SerializedName("studyDbId")
    private String studyDbId = null;

    @SerializedName("trialDbId")
    private String trialDbId = null;

    public Plate additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public Plate putAdditionalInfoItem(String key, String additionalInfoItem) {
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

    public Plate externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public Plate addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
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

    public Plate plateBarcode(String plateBarcode) {
        this.plateBarcode = plateBarcode;
        return this;
    }

    /**
     * A unique identifier physically attached to a &#x60;Plate&#x60;
     *
     * @return plateBarcode
     **/
    @Schema(example = "11223344", description = "A unique identifier physically attached to a `Plate`")
    public String getPlateBarcode() {
        return plateBarcode;
    }

    public void setPlateBarcode(String plateBarcode) {
        this.plateBarcode = plateBarcode;
    }

    public Plate plateDbId(String plateDbId) {
        this.plateDbId = plateDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a &#x60;Plate&#x60;
     *
     * @return plateDbId
     **/
    @Schema(example = "a106467f", description = "The ID which uniquely identifies a `Plate`")
    public String getPlateDbId() {
        return plateDbId;
    }

    public void setPlateDbId(String plateDbId) {
        this.plateDbId = plateDbId;
    }

    public Plate plateFormat(PlateFormatEnum plateFormat) {
        this.plateFormat = plateFormat;
        return this;
    }

    /**
     * Enum for plate formats, usually \&quot;PLATE_96\&quot; for a 96 well plate or \&quot;TUBES\&quot; for plateless format
     *
     * @return plateFormat
     **/
    @Schema(example = "PLATE_96", description = "Enum for plate formats, usually \"PLATE_96\" for a 96 well plate or \"TUBES\" for plateless format")
    public PlateFormatEnum getPlateFormat() {
        return plateFormat;
    }

    public void setPlateFormat(PlateFormatEnum plateFormat) {
        this.plateFormat = plateFormat;
    }

    public Plate plateName(String plateName) {
        this.plateName = plateName;
        return this;
    }

    /**
     * A human readable name for a &#x60;Plate&#x60;
     *
     * @return plateName
     **/
    @Schema(example = "Plate_123_XYZ", description = "A human readable name for a `Plate`")
    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public Plate programDbId(String programDbId) {
        this.programDbId = programDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a &#x60;Program&#x60; within the given database server
     *
     * @return programDbId
     **/
    @Schema(example = "bd748e00", description = "The ID which uniquely identifies a `Program` within the given database server")
    public String getProgramDbId() {
        return programDbId;
    }

    public void setProgramDbId(String programDbId) {
        this.programDbId = programDbId;
    }

    public Plate sampleType(SampleTypeEnum sampleType) {
        this.sampleType = sampleType;
        return this;
    }

    /**
     * The type of samples taken. ex. &#x27;DNA&#x27;, &#x27;RNA&#x27;, &#x27;Tissue&#x27;, etc
     *
     * @return sampleType
     **/
    @Schema(example = "TISSUE", description = "The type of samples taken. ex. 'DNA', 'RNA', 'Tissue', etc")
    public SampleTypeEnum getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleTypeEnum sampleType) {
        this.sampleType = sampleType;
    }

    public Plate studyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a &#x60;Study&#x60; within the given database server
     *
     * @return studyDbId
     **/
    @Schema(example = "64bd6bf9", description = "The ID which uniquely identifies a `Study` within the given database server")
    public String getStudyDbId() {
        return studyDbId;
    }

    public void setStudyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
    }

    public Plate trialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a &#x60;Trial&#x60; within the given database server
     *
     * @return trialDbId
     **/
    @Schema(example = "d34c5349", description = "The ID which uniquely identifies a `Trial` within the given database server")
    public String getTrialDbId() {
        return trialDbId;
    }

    public void setTrialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Plate plate = (Plate) o;
        return Objects.equals(this.additionalInfo, plate.additionalInfo) &&
                Objects.equals(this.externalReferences, plate.externalReferences) &&
                Objects.equals(this.plateBarcode, plate.plateBarcode) &&
                Objects.equals(this.plateDbId, plate.plateDbId) &&
                Objects.equals(this.plateFormat, plate.plateFormat) &&
                Objects.equals(this.plateName, plate.plateName) &&
                Objects.equals(this.programDbId, plate.programDbId) &&
                Objects.equals(this.sampleType, plate.sampleType) &&
                Objects.equals(this.studyDbId, plate.studyDbId) &&
                Objects.equals(this.trialDbId, plate.trialDbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, externalReferences, plateBarcode, plateDbId, plateFormat, plateName, programDbId, sampleType, studyDbId, trialDbId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Plate {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    plateBarcode: ").append(toIndentedString(plateBarcode)).append("\n");
        sb.append("    plateDbId: ").append(toIndentedString(plateDbId)).append("\n");
        sb.append("    plateFormat: ").append(toIndentedString(plateFormat)).append("\n");
        sb.append("    plateName: ").append(toIndentedString(plateName)).append("\n");
        sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
        sb.append("    sampleType: ").append(toIndentedString(sampleType)).append("\n");
        sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
        sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
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