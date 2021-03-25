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
import org.brapi.client.v2.model.queryParams.genotype.ReferenceQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.geno.response.BrAPIReferenceBasesResponse;
import org.brapi.v2.model.geno.response.BrAPIReferenceSingleResponse;
import org.brapi.v2.model.geno.response.BrAPIReferencesListResponse;
import org.brapi.v2.model.geno.request.BrAPIReferencesSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * API tests for ReferencesApi
 */
public class ReferencesApiTest {

    private final ReferencesApi api = new ReferencesApi();

    /**
     * Gets a filtered list of &#x60;Reference&#x60; objects.
     *
     * &#x60;GET /references&#x60; will return a filtered list of &#x60;Reference&#x60; JSON objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void referencesGetTest() throws ApiException {
        String referenceDbId = null;
        String referenceSetDbId = null;
        String accession = null;
        String md5checksum = null;
        Boolean isDerived = null;
        Integer minLength = null;
        Integer maxLength = null;
        Integer page = null;
        Integer pageSize = null;
        
        ReferenceQueryParams queryParams = new ReferenceQueryParams();
        ApiResponse<BrAPIReferencesListResponse> response = api.referencesGet(queryParams);

        // TODO: test validations
    }
    /**
     * Lists &#x60;Reference&#x60; bases by ID and optional range.
     *
     * Lists &#x60;Reference&#x60; bases by ID and optional range.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void referencesReferenceDbIdBasesGetTest() throws ApiException {
        String referenceDbId = null;
        Integer start = null;
        Integer end = null;
        String pageToken = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIReferenceBasesResponse> response = api.referencesReferenceDbIdBasesGet(referenceDbId, start, end, pageToken);
		});

        // TODO: test validations
    }
    /**
     * Gets a &#x60;Reference&#x60; by ID.
     *
     * &#x60;GET /references/{reference_id}&#x60; will return a JSON version of &#x60;Reference&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void referencesReferenceDbIdGetTest() throws ApiException {
        String referenceDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPIReferenceSingleResponse> response = api.referencesReferenceDbIdGet(referenceDbId);
		});

        // TODO: test validations
    }
    /**
     * Gets a list of &#x60;Reference&#x60; matching the search criteria.
     *
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchReferencesPostTest() throws ApiException {
        BrAPIReferencesSearchRequest body = new BrAPIReferencesSearchRequest();

        ApiResponse<Pair<Optional<BrAPIReferencesListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = api.searchReferencesPost(body);

        // TODO: test validations
    }
    /**
     * Gets a list of &#x60;Reference&#x60; matching the search criteria.
     *
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchReferencesSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<Pair<Optional<BrAPIReferencesListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response =
                    api.searchReferencesSearchResultsDbIdGet(searchResultsDbId, page, pageSize);
		});

        // TODO: test validations
    }
}
