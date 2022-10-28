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
import java.util.Objects;

/**
 * Each &#x27;availableFormat&#x27; object is a pairing of dataFormat and fileFormat. These must be communicated in pairs because they are not independant parameters and sometimes one influences the other.
 */
@Schema(description = "Each 'availableFormat' object is a pairing of dataFormat and fileFormat. These must be communicated in pairs because they are not independant parameters and sometimes one influences the other.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class AvailableFormat {
    /**
     * dataFormat defines the structure of the data within a file (ie DartSeq, VCF, Hapmap, tabular, etc)
     */
    @JsonAdapter(DataFormatEnum.Adapter.class)
    public enum DataFormatEnum {
        DARTSEQ("DartSeq"),
        VCF("VCF"),
        HAPMAP("Hapmap"),
        TABULAR("tabular"),
        JSON("JSON");

        private String value;

        DataFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataFormatEnum fromValue(String input) {
            for (DataFormatEnum b : DataFormatEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DataFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataFormatEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public DataFormatEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return DataFormatEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("dataFormat")
    private DataFormatEnum dataFormat = null;

    @SerializedName("expandHomozygotes")
    private Boolean expandHomozygotes = null;

    /**
     * fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.
     */
    @JsonAdapter(FileFormatEnum.Adapter.class)
    public enum FileFormatEnum {
        TEXT_CSV("text/csv"),
        TEXT_TSV("text/tsv"),
        APPLICATION_EXCEL("application/excel"),
        APPLICATION_ZIP("application/zip"),
        APPLICATION_JSON("application/json");

        private String value;

        FileFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FileFormatEnum fromValue(String input) {
            for (FileFormatEnum b : FileFormatEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FileFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return FileFormatEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("fileFormat")
    private FileFormatEnum fileFormat = null;

    @SerializedName("fileURL")
    private String fileURL = null;

    @SerializedName("sepPhased")
    private String sepPhased = null;

    @SerializedName("sepUnphased")
    private String sepUnphased = null;

    @SerializedName("unknownString")
    private String unknownString = null;

    public AvailableFormat dataFormat(DataFormatEnum dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * dataFormat defines the structure of the data within a file (ie DartSeq, VCF, Hapmap, tabular, etc)
     *
     * @return dataFormat
     **/
    @Schema(description = "dataFormat defines the structure of the data within a file (ie DartSeq, VCF, Hapmap, tabular, etc)")
    public DataFormatEnum getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(DataFormatEnum dataFormat) {
        this.dataFormat = dataFormat;
    }

    public AvailableFormat expandHomozygotes(Boolean expandHomozygotes) {
        this.expandHomozygotes = expandHomozygotes;
        return this;
    }

    /**
     * Should homozygotes be expanded (true) or collapsed into a single occurrence (false)
     *
     * @return expandHomozygotes
     **/
    @Schema(example = "true", description = "Should homozygotes be expanded (true) or collapsed into a single occurrence (false)")
    public Boolean isExpandHomozygotes() {
        return expandHomozygotes;
    }

    public void setExpandHomozygotes(Boolean expandHomozygotes) {
        this.expandHomozygotes = expandHomozygotes;
    }

    public AvailableFormat fileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.
     *
     * @return fileFormat
     **/
    @Schema(description = "fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.")
    public FileFormatEnum getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

    public AvailableFormat fileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }

    /**
     * A URL which indicates the location of the file version of this VariantSet. Could be a static file URL or an API endpoint which generates the file.
     *
     * @return fileURL
     **/
    @Schema(description = "A URL which indicates the location of the file version of this VariantSet. Could be a static file URL or an API endpoint which generates the file.")
    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public AvailableFormat sepPhased(String sepPhased) {
        this.sepPhased = sepPhased;
        return this;
    }

    /**
     * The string used as a separator for phased allele calls.
     *
     * @return sepPhased
     **/
    @Schema(example = "|", description = "The string used as a separator for phased allele calls.")
    public String getSepPhased() {
        return sepPhased;
    }

    public void setSepPhased(String sepPhased) {
        this.sepPhased = sepPhased;
    }

    public AvailableFormat sepUnphased(String sepUnphased) {
        this.sepUnphased = sepUnphased;
        return this;
    }

    /**
     * The string used as a separator for unphased allele calls.
     *
     * @return sepUnphased
     **/
    @Schema(example = "/", description = "The string used as a separator for unphased allele calls.")
    public String getSepUnphased() {
        return sepUnphased;
    }

    public void setSepUnphased(String sepUnphased) {
        this.sepUnphased = sepUnphased;
    }

    public AvailableFormat unknownString(String unknownString) {
        this.unknownString = unknownString;
        return this;
    }

    /**
     * The string used as a representation for missing data.
     *
     * @return unknownString
     **/
    @Schema(example = ".", description = "The string used as a representation for missing data.")
    public String getUnknownString() {
        return unknownString;
    }

    public void setUnknownString(String unknownString) {
        this.unknownString = unknownString;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableFormat availableFormat = (AvailableFormat) o;
        return Objects.equals(this.dataFormat, availableFormat.dataFormat) &&
                Objects.equals(this.expandHomozygotes, availableFormat.expandHomozygotes) &&
                Objects.equals(this.fileFormat, availableFormat.fileFormat) &&
                Objects.equals(this.fileURL, availableFormat.fileURL) &&
                Objects.equals(this.sepPhased, availableFormat.sepPhased) &&
                Objects.equals(this.sepUnphased, availableFormat.sepUnphased) &&
                Objects.equals(this.unknownString, availableFormat.unknownString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataFormat, expandHomozygotes, fileFormat, fileURL, sepPhased, sepUnphased, unknownString);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableFormat {\n");

        sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
        sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
        sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
        sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
        sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
        sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
        sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
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
