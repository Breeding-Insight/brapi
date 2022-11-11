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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AlleleMatrix
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class AlleleMatrix {
    @SerializedName("callSetDbIds")
    private List<String> callSetDbIds = null;

    @SerializedName("dataMatrices")
    private List<AlleleMatrixDataMatrices> dataMatrices = null;

    @SerializedName("expandHomozygotes")
    private Boolean expandHomozygotes = null;

    @SerializedName("pagination")
    private List<AlleleMatrixPagination> pagination = null;

    @SerializedName("sepPhased")
    private String sepPhased = null;

    @SerializedName("sepUnphased")
    private String sepUnphased = null;

    @SerializedName("unknownString")
    private String unknownString = null;

    @SerializedName("variantDbIds")
    private List<String> variantDbIds = null;

    @SerializedName("variantSetDbIds")
    private List<String> variantSetDbIds = null;

    public AlleleMatrix callSetDbIds(List<String> callSetDbIds) {
        this.callSetDbIds = callSetDbIds;
        return this;
    }

    public AlleleMatrix addCallSetDbIdsItem(String callSetDbIdsItem) {
        if (this.callSetDbIds == null) {
            this.callSetDbIds = new ArrayList<String>();
        }
        this.callSetDbIds.add(callSetDbIdsItem);
        return this;
    }

    /**
     * A list of unique identifiers for the CallSets contained in the matrix response. This array should match the ordering for columns in the matrix. A CallSet is a unique combination of a Sample and a sequencing event. CallSets often have a 1-to-1 relationship with Samples, but this is not always the case.
     *
     * @return callSetDbIds
     **/
    @Schema(example = "[\"aca00001\",\"aca00002\",\"aca00003\"]", description = "A list of unique identifiers for the CallSets contained in the matrix response. This array should match the ordering for columns in the matrix. A CallSet is a unique combination of a Sample and a sequencing event. CallSets often have a 1-to-1 relationship with Samples, but this is not always the case.")
    public List<String> getCallSetDbIds() {
        return callSetDbIds;
    }

    public void setCallSetDbIds(List<String> callSetDbIds) {
        this.callSetDbIds = callSetDbIds;
    }

    public AlleleMatrix dataMatrices(List<AlleleMatrixDataMatrices> dataMatrices) {
        this.dataMatrices = dataMatrices;
        return this;
    }

    public AlleleMatrix addDataMatricesItem(AlleleMatrixDataMatrices dataMatricesItem) {
        if (this.dataMatrices == null) {
            this.dataMatrices = new ArrayList<AlleleMatrixDataMatrices>();
        }
        this.dataMatrices.add(dataMatricesItem);
        return this;
    }

    /**
     * The &#x27;dataMatrices&#x27; are an array of matrix objects that hold the allele data and associated metadata. Each matrix should be the same size and orientation, aligned with the \&quot;callSetDbIds\&quot; as columns and the \&quot;variantDbIds\&quot; as rows.
     *
     * @return dataMatrices
     **/
    @Schema(example = "[{\"dataMatrix\":[[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"],[\"0|0\",\"1|0\",\"1/1\"]],\"dataMatrixAbbreviation\":\"GT\",\"dataMatrixName\":\"Genotype\",\"dataType\":\"string\"},{\"dataMatrix\":[[\"48\",\"48\",\"43\"],[\"49\",\"3\",\"41\"],[\"21\",\"2\",\"35\"]],\"dataMatrixAbbreviation\":\"GQ\",\"dataMatrixName\":\"Genotype Quality\",\"dataType\":\"integer\"}]", description = "The 'dataMatrices' are an array of matrix objects that hold the allele data and associated metadata. Each matrix should be the same size and orientation, aligned with the \"callSetDbIds\" as columns and the \"variantDbIds\" as rows.")
    public List<AlleleMatrixDataMatrices> getDataMatrices() {
        return dataMatrices;
    }

    public void setDataMatrices(List<AlleleMatrixDataMatrices> dataMatrices) {
        this.dataMatrices = dataMatrices;
    }

    public AlleleMatrix expandHomozygotes(Boolean expandHomozygotes) {
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

    public AlleleMatrix pagination(List<AlleleMatrixPagination> pagination) {
        this.pagination = pagination;
        return this;
    }

    public AlleleMatrix addPaginationItem(AlleleMatrixPagination paginationItem) {
        if (this.pagination == null) {
            this.pagination = new ArrayList<AlleleMatrixPagination>();
        }
        this.pagination.add(paginationItem);
        return this;
    }

    /**
     * Pagination for the matrix
     *
     * @return pagination
     **/
    @Schema(example = "[{\"dimension\":\"VARIANTS\",\"page\":0,\"pageSize\":500,\"totalCount\":10000,\"totalPages\":20},{\"dimension\":\"CALLSETS\",\"page\":4,\"pageSize\":1000,\"totalCount\":10000,\"totalPages\":10}]", description = "Pagination for the matrix")
    public List<AlleleMatrixPagination> getPagination() {
        return pagination;
    }

    public void setPagination(List<AlleleMatrixPagination> pagination) {
        this.pagination = pagination;
    }

    public AlleleMatrix sepPhased(String sepPhased) {
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

    public AlleleMatrix sepUnphased(String sepUnphased) {
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

    public AlleleMatrix unknownString(String unknownString) {
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

    public AlleleMatrix variantDbIds(List<String> variantDbIds) {
        this.variantDbIds = variantDbIds;
        return this;
    }

    public AlleleMatrix addVariantDbIdsItem(String variantDbIdsItem) {
        if (this.variantDbIds == null) {
            this.variantDbIds = new ArrayList<String>();
        }
        this.variantDbIds.add(variantDbIdsItem);
        return this;
    }

    /**
     * A list of unique identifiers for the Variants contained in the matrix response. This array should match the ordering for rows in the matrix.
     *
     * @return variantDbIds
     **/
    @Schema(example = "[\"feb54257\",\"feb40355\",\"feb40323\"]", description = "A list of unique identifiers for the Variants contained in the matrix response. This array should match the ordering for rows in the matrix.")
    public List<String> getVariantDbIds() {
        return variantDbIds;
    }

    public void setVariantDbIds(List<String> variantDbIds) {
        this.variantDbIds = variantDbIds;
    }

    public AlleleMatrix variantSetDbIds(List<String> variantSetDbIds) {
        this.variantSetDbIds = variantSetDbIds;
        return this;
    }

    public AlleleMatrix addVariantSetDbIdsItem(String variantSetDbIdsItem) {
        if (this.variantSetDbIds == null) {
            this.variantSetDbIds = new ArrayList<String>();
        }
        this.variantSetDbIds.add(variantSetDbIdsItem);
        return this;
    }

    /**
     * A list of unique identifiers for the VariantSets contained in the matrix response. A VariantSet is a data set originating from a sequencing event. Often, users will only be interested in data from a single VariantSet, but in some cases a user might be interested in a matrix with data from multiple VariantSets.
     *
     * @return variantSetDbIds
     **/
    @Schema(example = "[\"cfde3944\",\"cfde2077\",\"cfde4424\"]", description = "A list of unique identifiers for the VariantSets contained in the matrix response. A VariantSet is a data set originating from a sequencing event. Often, users will only be interested in data from a single VariantSet, but in some cases a user might be interested in a matrix with data from multiple VariantSets.")
    public List<String> getVariantSetDbIds() {
        return variantSetDbIds;
    }

    public void setVariantSetDbIds(List<String> variantSetDbIds) {
        this.variantSetDbIds = variantSetDbIds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlleleMatrix alleleMatrix = (AlleleMatrix) o;
        return Objects.equals(this.callSetDbIds, alleleMatrix.callSetDbIds) &&
                Objects.equals(this.dataMatrices, alleleMatrix.dataMatrices) &&
                Objects.equals(this.expandHomozygotes, alleleMatrix.expandHomozygotes) &&
                Objects.equals(this.pagination, alleleMatrix.pagination) &&
                Objects.equals(this.sepPhased, alleleMatrix.sepPhased) &&
                Objects.equals(this.sepUnphased, alleleMatrix.sepUnphased) &&
                Objects.equals(this.unknownString, alleleMatrix.unknownString) &&
                Objects.equals(this.variantDbIds, alleleMatrix.variantDbIds) &&
                Objects.equals(this.variantSetDbIds, alleleMatrix.variantSetDbIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callSetDbIds, dataMatrices, expandHomozygotes, pagination, sepPhased, sepUnphased, unknownString, variantDbIds, variantSetDbIds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlleleMatrix {\n");

        sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
        sb.append("    dataMatrices: ").append(toIndentedString(dataMatrices)).append("\n");
        sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
        sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
        sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
        sb.append("    variantDbIds: ").append(toIndentedString(variantDbIds)).append("\n");
        sb.append("    variantSetDbIds: ").append(toIndentedString(variantSetDbIds)).append("\n");
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