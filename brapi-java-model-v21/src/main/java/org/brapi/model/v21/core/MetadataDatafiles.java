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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * A dataFile contains a URL and the relevant file metadata to represent a file
 */
@Schema(description = "A dataFile contains a URL and the relevant file metadata to represent a file")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:03.583Z[GMT]")
public class MetadataDatafiles {
    @SerializedName("fileDescription")
    private String fileDescription = null;

    @SerializedName("fileMD5Hash")
    private String fileMD5Hash = null;

    @SerializedName("fileName")
    private String fileName = null;

    @SerializedName("fileSize")
    private Integer fileSize = null;

    @SerializedName("fileType")
    private String fileType = null;

    @SerializedName("fileURL")
    private String fileURL = null;

    public MetadataDatafiles fileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }

    /**
     * A human readable description of the file contents
     *
     * @return fileDescription
     **/
    @Schema(example = "This is an Excel data file", description = "A human readable description of the file contents")
    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public MetadataDatafiles fileMD5Hash(String fileMD5Hash) {
        this.fileMD5Hash = fileMD5Hash;
        return this;
    }

    /**
     * The MD5 Hash of the file contents to be used as a check sum
     *
     * @return fileMD5Hash
     **/
    @Schema(example = "c2365e900c81a89cf74d83dab60df146", description = "The MD5 Hash of the file contents to be used as a check sum")
    public String getFileMD5Hash() {
        return fileMD5Hash;
    }

    public void setFileMD5Hash(String fileMD5Hash) {
        this.fileMD5Hash = fileMD5Hash;
    }

    public MetadataDatafiles fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * The name of the file
     *
     * @return fileName
     **/
    @Schema(example = "datafile.xlsx", description = "The name of the file")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MetadataDatafiles fileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The size of the file in bytes
     *
     * @return fileSize
     **/
    @Schema(example = "4398", description = "The size of the file in bytes")
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public MetadataDatafiles fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * The type or format of the file. Preferably MIME Type.
     *
     * @return fileType
     **/
    @Schema(example = "application/vnd.ms-excel", description = "The type or format of the file. Preferably MIME Type.")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public MetadataDatafiles fileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }

    /**
     * The absolute URL where the file is located
     *
     * @return fileURL
     **/
    @Schema(example = "https://wiki.brapi.org/examples/datafile.xlsx", required = true, description = "The absolute URL where the file is located")
    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataDatafiles metadataDatafiles = (MetadataDatafiles) o;
        return Objects.equals(this.fileDescription, metadataDatafiles.fileDescription) &&
                Objects.equals(this.fileMD5Hash, metadataDatafiles.fileMD5Hash) &&
                Objects.equals(this.fileName, metadataDatafiles.fileName) &&
                Objects.equals(this.fileSize, metadataDatafiles.fileSize) &&
                Objects.equals(this.fileType, metadataDatafiles.fileType) &&
                Objects.equals(this.fileURL, metadataDatafiles.fileURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileDescription, fileMD5Hash, fileName, fileSize, fileType, fileURL);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataDatafiles {\n");

        sb.append("    fileDescription: ").append(toIndentedString(fileDescription)).append("\n");
        sb.append("    fileMD5Hash: ").append(toIndentedString(fileMD5Hash)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileURL: ").append(toIndentedString(fileURL)).append("\n");
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
