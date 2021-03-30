/*
 * BrAPI-Genotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.genotype;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.genotype.GenomeMapQueryParams;
import org.brapi.client.v2.model.queryParams.genotype.MarkerPositionQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.geno.response.BrAPIGenomeMapListResponse;
import org.brapi.v2.model.geno.response.BrAPIGenomeMapSingleResponse;
import org.brapi.v2.model.geno.response.BrAPILinkageGroupListResponse;
import org.brapi.v2.model.geno.response.BrAPIMarkerPositionListResponse;
import org.brapi.v2.model.geno.request.BrAPIMarkerPositionSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * API tests for GenomeMapsApi
 */
public class GenomeMapsApiTest {

    private final GenomeMapsApi api = new GenomeMapsApi();

    /**
     * Get the Genomic Maps
     *
     * Get list of maps
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mapsGetTest() throws ApiException {
        String commonCropName = null;
        String mapDbId = null;
        String mapPUI = null;
        String scientificName = null;
        String type = null;
        String programDbId = null;
        String trialDbId = null;
        String studyDbId = null;
        Integer page = null;
        Integer pageSize = null;
        
        GenomeMapQueryParams queryParams = new GenomeMapQueryParams();
        ApiResponse<BrAPIGenomeMapListResponse> response = api.mapsGet(queryParams);

        // TODO: test validations
    }
    /**
     * Get the details of a specific Genomic Map
     *
     * Provides the number of markers on each linkageGroup and the max position on the linkageGroup
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mapsMapDbIdGetTest() throws ApiException {
        String mapDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIGenomeMapSingleResponse> response = api.mapsMapDbIdGet(mapDbId);
		});

        // TODO: test validations
    }
    /**
     * Get the Linkage Groups of a specific Genomic Map
     *
     * Get the Linkage Groups of a specific Genomic Map. A Linkage Group is the BrAPI generic term for a named section of a map. A Linkage Group can represent a Chromosome, Scaffold, or Linkage Group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mapsMapDbIdLinkagegroupsGetTest() throws ApiException {
        String mapDbId = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPILinkageGroupListResponse> response = api.mapsMapDbIdLinkagegroupsGet(mapDbId, page, pageSize);
		});

        // TODO: test validations
    }
    /**
     * Get marker position info
     *
     * Get marker position information, based on Map, Linkage Group, and Marker ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void markerpositionsGetTest() throws ApiException {
        String mapDbId = null;
        String linkageGroupName = null;
        String variantDbId = null;
        Integer minPosition = null;
        Integer maxPosition = null;
        Integer page = null;
        Integer pageSize = null;
        
        MarkerPositionQueryParams queryParams = new MarkerPositionQueryParams();
        ApiResponse<BrAPIMarkerPositionListResponse> response = api.markerpositionsGet(queryParams);

        // TODO: test validations
    }
    /**
     * Get marker position info
     *
     * Get marker position information, based on Map, Linkage Group, and Marker ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMarkerpositionsPostTest() throws ApiException {
        BrAPIMarkerPositionSearchRequest body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<Pair<Optional<BrAPIMarkerPositionListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = api.searchMarkerpositionsPost(body);
		});

        // TODO: test validations
    }
    /**
     * Get marker position info
     *
     * Get marker position information, based on Map, Linkage Group, and Marker ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMarkerpositionsSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<Pair<Optional<BrAPIMarkerPositionListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response =
                    api.searchMarkerpositionsSearchResultsDbIdGet(searchResultsDbId, page, pageSize);
		});

        // TODO: test validations
    }
}
