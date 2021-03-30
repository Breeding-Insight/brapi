/*
 * BrAPI-Germplasm
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.germplasm;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.GermplasmAttributeValueQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.germ.BrAPIGermplasmAttributeValue;
import org.brapi.v2.model.germ.response.BrAPIGermplasmAttributeValueListResponse;
import org.brapi.v2.model.germ.request.BrAPIGermplasmAttributeValueSearchRequest;
import org.brapi.v2.model.germ.response.BrAPIGermplasmAttributeValueSingleResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Optional;

/**
 * API tests for GermplasmAttributeValuesApi
 */
public class GermplasmAttributeValuesApiTest {

    private final GermplasmAttributeValuesApi api = new GermplasmAttributeValuesApi();

    /**
     * Get the details for a specific Germplasm Attribute
     *
     * Get the details for a specific Germplasm Attribute
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attributevaluesAttributeValueDbIdGetTest() throws ApiException {
        String attributeValueDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIGermplasmAttributeValueSingleResponse> response = api.attributevaluesAttributeValueDbIdGet(attributeValueDbId);
		});

        // TODO: test validations
    }
    /**
     * Update an existing Germplasm Attribute Value
     *
     * Update an existing Germplasm Attribute Value
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attributevaluesAttributeValueDbIdPutTest() throws ApiException {
        String attributeValueDbId = null;
        BrAPIGermplasmAttributeValue body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIGermplasmAttributeValueSingleResponse> response = api.attributevaluesAttributeValueDbIdPut(attributeValueDbId, body);
		});

        // TODO: test validations
    }
    /**
     * Get the Germplasm Attribute Values
     *
     * Get the Germplasm Attribute Values
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attributevaluesGetTest() throws ApiException {
        String attributeValueDbId = null;
        String attributeDbId = null;
        String attributeName = null;
        String germplasmDbId = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        
        GermplasmAttributeValueQueryParams queryParams = new GermplasmAttributeValueQueryParams();
        ApiResponse<BrAPIGermplasmAttributeValueListResponse> response = api.attributevaluesGet(queryParams);

        // TODO: test validations
    }
    /**
     * Create new Germplasm Attribute Values
     *
     * Create new Germplasm Attribute Values
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attributevaluesPostTest() throws ApiException {
        List<BrAPIGermplasmAttributeValue> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIGermplasmAttributeValueListResponse> response = api.attributevaluesPost(body);
		});

        // TODO: test validations
    }
    /**
     * Submit a search request for Germplasm Attribute Values
     *
     * Search for a set of Germplasm Attribute Values based on some criteria          See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchAttributevaluesPostTest() throws ApiException {
        BrAPIGermplasmAttributeValueSearchRequest body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<Pair<Optional<BrAPIGermplasmAttributeValueListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response =
                    api.searchAttributevaluesPost(body);
		});

        // TODO: test validations
    }
    /**
     * Get the results of a Germplasm Attribute Values search request
     *
     * Get the results of a Germplasm Attribute Values search request  See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchAttributevaluesSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<Pair<Optional<BrAPIGermplasmAttributeValueListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response =
                    api.searchAttributevaluesSearchResultsDbIdGet(searchResultsDbId, page, pageSize);
		});

        // TODO: test validations
    }
}
