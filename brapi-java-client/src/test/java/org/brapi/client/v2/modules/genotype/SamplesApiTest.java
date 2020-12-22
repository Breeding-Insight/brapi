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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.genotype.SampleQueryParams;
import org.brapi.v2.model.geno.BrAPISample;
import org.brapi.v2.model.geno.response.BrAPISampleListResponse;
import org.brapi.v2.model.geno.request.BrAPISampleSearchRequest;
import org.brapi.v2.model.geno.response.BrAPISampleSingleResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

/**
 * API tests for SamplesApi
 */
public class SamplesApiTest {

    private final SamplesApi api = new SamplesApi();

    /**
     * Get the Samples
     *
     * Used to retrieve list of Samples from a Sample Tracking system based on some search criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samplesGetTest() throws ApiException {
        String sampleDbId = null;
        String observationUnitDbId = null;
        String plateDbId = null;
        String germplasmDbId = null;
        String studyDbId = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        
        SampleQueryParams queryParams = new SampleQueryParams();
        ApiResponse<BrAPISampleListResponse> response = api.samplesGet(queryParams);

        // TODO: test validations
    }
    /**
     * Add new Samples
     *
     * Call to register the event of a sample being taken. Sample ID is assigned as a result of the operation and returned in response.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samplesPostTest() throws ApiException {
        List<BrAPISample> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISampleListResponse> response = api.samplesPost(body);
		});

        // TODO: test validations
    }
    /**
     * Get the details of a specific Sample
     *
     * Used to retrieve the details of a single Sample from a Sample Tracking system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samplesSampleDbIdGetTest() throws ApiException {
        String sampleDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISampleSingleResponse> response = api.samplesSampleDbIdGet(sampleDbId);
		});

        // TODO: test validations
    }
    /**
     * Update the details of an existing Sample
     *
     * Update the details of an existing Sample
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void samplesSampleDbIdPutTest() throws ApiException {
        String sampleDbId = null;
        BrAPISample body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISampleSingleResponse> response = api.samplesSampleDbIdPut(sampleDbId, body);
		});

        // TODO: test validations
    }
    /**
     * Submit a search request for Samples
     *
     * Used to retrieve list of Samples from a Sample Tracking system based on some search criteria.  See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSamplesPostTest() throws ApiException {
        BrAPISampleSearchRequest body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISampleListResponse> response = api.searchSamplesPost(body);
		});

        // TODO: test validations
    }
    /**
     * Get the results of a Samples search request
     *
     * Used to retrieve list of Samples from a Sample Tracking system based on some search criteria.  See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSamplesSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISampleListResponse> response = api.searchSamplesSearchResultsDbIdGet(searchResultsDbId, page, pageSize);
		});

        // TODO: test validations
    }
}