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
 * **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt;The pagination object is applicable only when the payload contains a \&quot;data\&quot; key. It describes the pagination of the data contained in the \&quot;data\&quot; array, as a way to identify which subset of data is being returned.  &lt;br&gt;Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken to construct an additional query and move to the next or previous page respectively.
 */
@Schema(description = "**Deprecated in v2.1** Please use `page`. Github issue number #451  <br>The pagination object is applicable only when the payload contains a \"data\" key. It describes the pagination of the data contained in the \"data\" array, as a way to identify which subset of data is being returned.  <br>Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken to construct an additional query and move to the next or previous page respectively.  ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class TokenPagination {
    @SerializedName("currentPage")
    private Integer currentPage = 0;

    @SerializedName("currentPageToken")
    private String currentPageToken = null;

    @SerializedName("nextPageToken")
    private String nextPageToken = null;

    @SerializedName("pageSize")
    private Integer pageSize = 1000;

    @SerializedName("prevPageToken")
    private String prevPageToken = null;

    @SerializedName("totalCount")
    private Integer totalCount = null;

    @SerializedName("totalPages")
    private Integer totalPages = null;

    public TokenPagination currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * The index number for the returned page of data. This should always match the requested page number or the default page (0).
     *
     * @return currentPage
     **/
    @Schema(example = "0", description = "The index number for the returned page of data. This should always match the requested page number or the default page (0).")
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public TokenPagination currentPageToken(String currentPageToken) {
        this.currentPageToken = currentPageToken;
        return this;
    }

    /**
     * **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt;The string token used to query the current page of data.
     *
     * @return currentPageToken
     **/
    @Schema(example = "48bc6ac1", description = "**Deprecated in v2.1** Please use `page`. Github issue number #451  <br>The string token used to query the current page of data.")
    public String getCurrentPageToken() {
        return currentPageToken;
    }

    public void setCurrentPageToken(String currentPageToken) {
        this.currentPageToken = currentPageToken;
    }

    public TokenPagination nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt;The string token used to query the next page of data.
     *
     * @return nextPageToken
     **/
    @Schema(example = "cb668f63", description = "**Deprecated in v2.1** Please use `page`. Github issue number #451  <br>The string token used to query the next page of data.")
    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public TokenPagination pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The number of data elements returned, aka the size of the current page. If the requested page does not have enough elements to fill a page at the requested page size, this field should indicate the actual number of elements returned.
     *
     * @return pageSize
     **/
    @Schema(example = "1000", description = "The number of data elements returned, aka the size of the current page. If the requested page does not have enough elements to fill a page at the requested page size, this field should indicate the actual number of elements returned.")
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TokenPagination prevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
        return this;
    }

    /**
     * **Deprecated in v2.1** Please use &#x60;page&#x60;. Github issue number #451  &lt;br&gt;The string token used to query the previous page of data.
     *
     * @return prevPageToken
     **/
    @Schema(example = "9659857e", description = "**Deprecated in v2.1** Please use `page`. Github issue number #451  <br>The string token used to query the previous page of data.")
    public String getPrevPageToken() {
        return prevPageToken;
    }

    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    public TokenPagination totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The total number of elements that are available on the server and match the requested query parameters.
     *
     * @return totalCount
     **/
    @Schema(example = "10", description = "The total number of elements that are available on the server and match the requested query parameters.")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public TokenPagination totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * The total number of pages of elements available on the server. This should be calculated with the following formula.  &lt;br&gt; totalPages &#x3D; CEILING( totalCount / requested_page_size)
     *
     * @return totalPages
     **/
    @Schema(example = "1", description = "The total number of pages of elements available on the server. This should be calculated with the following formula.  <br> totalPages = CEILING( totalCount / requested_page_size)")
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenPagination tokenPagination = (TokenPagination) o;
        return Objects.equals(this.currentPage, tokenPagination.currentPage) &&
                Objects.equals(this.currentPageToken, tokenPagination.currentPageToken) &&
                Objects.equals(this.nextPageToken, tokenPagination.nextPageToken) &&
                Objects.equals(this.pageSize, tokenPagination.pageSize) &&
                Objects.equals(this.prevPageToken, tokenPagination.prevPageToken) &&
                Objects.equals(this.totalCount, tokenPagination.totalCount) &&
                Objects.equals(this.totalPages, tokenPagination.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentPageToken, nextPageToken, pageSize, prevPageToken, totalCount, totalPages);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenPagination {\n");

        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentPageToken: ").append(toIndentedString(currentPageToken)).append("\n");
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
