/*
 * BrAPI-Core
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.core;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.StudyQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.core.BrAPIStudy;
import org.brapi.v2.model.core.response.BrAPIStudyListResponse;
import org.brapi.v2.model.core.request.BrAPIStudySearchRequest;
import org.brapi.v2.model.core.response.BrAPIStudySingleResponse;
import org.brapi.v2.model.core.response.BrAPIStudyTypesResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * API tests for StudiesApi
 */
public class StudiesApiTest {

    private final StudiesApi api = new StudiesApi();

    /**
     * Submit a search request for Studies
     *
     * Get list of studies StartDate and endDate should be ISO-8601 format for dates See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchStudiesPostTest() throws ApiException {
        BrAPIStudySearchRequest body = new BrAPIStudySearchRequest();

        ApiResponse<Pair<Optional<BrAPIStudyListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = api.searchStudiesPost(body);

        // TODO: test validations
    }
    /**
     * Get the results of a Studies search request
     *
     * Get list of studies  StartDate and endDate should be ISO-8601 format for dates  See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchStudiesSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIStudyListResponse> response = api.searchStudiesSearchResultsDbIdGet(searchResultsDbId, page, pageSize);
		});

        // TODO: test validations
    }
    /**
     * Get a filtered list of Studies
     *
     * Get list of studies  StartDate and endDate should be ISO-8601 format for dates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studiesGetTest() throws ApiException {
        String commonCropName = null;
        String studyType = null;
        String programDbId = null;
        String locationDbId = null;
        String seasonDbId = null;
        String trialDbId = null;
        String studyDbId = null;
        String studyName = null;
        String studyCode = null;
        String studyPUI = null;
        String germplasmDbId = null;
        String observationVariableDbId = null;
        Boolean active = null;
        String sortBy = null;
        String sortOrder = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        
        StudyQueryParams queryParams = new StudyQueryParams();
        ApiResponse<BrAPIStudyListResponse> response = api.studiesGet(queryParams);

        // TODO: test validations
    }
    /**
     * Create new Studies.
     *
     * Create new studies  Implementation Notes  StartDate and endDate should be ISO-8601 format for dates  &#x60;studDbId&#x60; is generated by the server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studiesPostTest() throws ApiException {
        List<BrAPIStudy> body = Arrays.asList(new BrAPIStudy());
        
        ApiResponse<BrAPIStudyListResponse> response = api.studiesPost(body);

        // TODO: test validations
    }
    /**
     * Get the details for a specific Study
     *
     * Retrieve the information of the study required for field data collection  An additionalInfo field was added to provide a controlled vocabulary for less common data fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studiesStudyDbIdGetTest() throws ApiException {
        String studyDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIStudySingleResponse> response = api.studiesStudyDbIdGet(studyDbId);
		});

        // TODO: test validations
    }
    /**
     * Update an existing Study
     *
     * Update an existing Study with new data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studiesStudyDbIdPutTest() throws ApiException {
        String studyDbId = null;
        BrAPIStudy body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIStudySingleResponse> response = api.studiesStudyDbIdPut(studyDbId, body);
		});

        // TODO: test validations
    }
    /**
     * Get the Study Types
     *
     * Call to retrieve the list of study types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studytypesGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        
        ApiResponse<BrAPIStudyTypesResponse> response = api.studytypesGet(page, pageSize);

        // TODO: test validations
    }
}
