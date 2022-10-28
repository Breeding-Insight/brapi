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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An object in the BrAPI standard response model that describes some information about the service call being performed. This includes supplementary data, status log messages, and pagination information.
 */
@Schema(description = "An object in the BrAPI standard response model that describes some information about the service call being performed. This includes supplementary data, status log messages, and pagination information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:03.583Z[GMT]")
public class MetadataTokenPagination {
    @SerializedName("datafiles")
    private List<MetadataDatafiles> datafiles = null;

    @SerializedName("pagination")
    private MetadataTokenPaginationPagination pagination = null;

    @SerializedName("status")
    private List<MetadataStatus> status = null;

    public MetadataTokenPagination datafiles(List<MetadataDatafiles> datafiles) {
        this.datafiles = datafiles;
        return this;
    }

    public MetadataTokenPagination addDatafilesItem(MetadataDatafiles datafilesItem) {
        if (this.datafiles == null) {
            this.datafiles = new ArrayList<MetadataDatafiles>();
        }
        this.datafiles.add(datafilesItem);
        return this;
    }

    /**
     * The datafiles contains a list of file URLs and metadata.  These files contain additional information related to the returned object and can be retrieved by a subsequent call.  This could be a supplementary data file, an informational file, the uploaded file where the data originated from, a generated file representing the whole dataset in a particular format, or any other related file.
     *
     * @return datafiles
     **/
    @Schema(example = "[]", description = "The datafiles contains a list of file URLs and metadata.  These files contain additional information related to the returned object and can be retrieved by a subsequent call.  This could be a supplementary data file, an informational file, the uploaded file where the data originated from, a generated file representing the whole dataset in a particular format, or any other related file. ")
    public List<MetadataDatafiles> getDatafiles() {
        return datafiles;
    }

    public void setDatafiles(List<MetadataDatafiles> datafiles) {
        this.datafiles = datafiles;
    }

    public MetadataTokenPagination pagination(MetadataTokenPaginationPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     **/
    @Schema(description = "")
    public MetadataTokenPaginationPagination getPagination() {
        return pagination;
    }

    public void setPagination(MetadataTokenPaginationPagination pagination) {
        this.pagination = pagination;
    }

    public MetadataTokenPagination status(List<MetadataStatus> status) {
        this.status = status;
        return this;
    }

    public MetadataTokenPagination addStatusItem(MetadataStatus statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<MetadataStatus>();
        }
        this.status.add(statusItem);
        return this;
    }

    /**
     * The status field contains a list of informational status messages from the server.  If no status is reported, an empty list should be returned. See Error Reporting for more information.
     *
     * @return status
     **/
    @Schema(description = "The status field contains a list of informational status messages from the server.  If no status is reported, an empty list should be returned. See Error Reporting for more information.")
    public List<MetadataStatus> getStatus() {
        return status;
    }

    public void setStatus(List<MetadataStatus> status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataTokenPagination metadataTokenPagination = (MetadataTokenPagination) o;
        return Objects.equals(this.datafiles, metadataTokenPagination.datafiles) &&
                Objects.equals(this.pagination, metadataTokenPagination.pagination) &&
                Objects.equals(this.status, metadataTokenPagination.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datafiles, pagination, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataTokenPagination {\n");

        sb.append("    datafiles: ").append(toIndentedString(datafiles)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
