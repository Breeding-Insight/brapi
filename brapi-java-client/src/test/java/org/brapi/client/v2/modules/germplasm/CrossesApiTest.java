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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.CrossQueryParams;
import org.brapi.client.v2.model.queryParams.germplasm.PlannedCrossQueryParams;
import org.brapi.v2.model.germ.BrAPICross;
import org.brapi.v2.model.germ.BrAPIPlannedCross;
import org.brapi.v2.model.germ.response.BrAPICrossesListResponse;
import org.brapi.v2.model.germ.response.BrAPIPlannedCrossesListResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CrossesApiTest extends BrAPIClientTest{

    private final CrossesApi api = new CrossesApi(this.apiClient);

    /**
     * Get a filtered list of Cross entities
     *
     * Get a filtered list of Cross entities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crossesGetTest() throws ApiException {
        String crossDbId = "cross1";
        
        CrossQueryParams queryParams = new CrossQueryParams().crossDbId(crossDbId);
        ApiResponse<BrAPICrossesListResponse> response = api.crossesGet(queryParams);
        
        assertEquals(1, response.getBody().getResult().getData().size());
        assertEquals(crossDbId, response.getBody().getResult().getData().get(0).getCrossDbId());
    }
    /**
     * Create new Cross entities on this server
     *
     * Create new Cross entities on this server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crossesPostTest() throws ApiException {
    	BrAPICross cross = new BrAPICross()
    			.crossingProjectDbId("crossing_project2")
    			.crossName("New Name");
        List<BrAPICross> body = Arrays.asList(cross);

        ApiResponse<BrAPICrossesListResponse> response = api.crossesPost(body);

        assertEquals(1, response.getBody().getResult().getData().size());
        assertNotNull(response.getBody().getResult().getData().get(0).getCrossDbId());
        assertEquals(cross.getCrossName(), response.getBody().getResult().getData().get(0).getCrossName());
        assertEquals(cross.getCrossingProjectDbId(), response.getBody().getResult().getData().get(0).getCrossingProjectDbId());
    }
    /**
     * Update existing Cross entities on this server
     *
     * Update existing Cross entities on this server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crossesPutTest() throws ApiException {
    	BrAPICross cross = new BrAPICross()
    			.crossingProjectDbId("crossing_project2")
    			.crossName("New Name")
    			.crossDbId("cross1");
        Map<String, BrAPICross> body = new HashMap<String, BrAPICross>();
        body.put("cross1", cross);

        ApiResponse<BrAPICrossesListResponse> response = api.crossesPut(body);

        assertEquals(1, response.getBody().getResult().getData().size());
        assertEquals(cross.getCrossDbId(), response.getBody().getResult().getData().get(0).getCrossDbId());
        assertEquals(cross.getCrossName(), response.getBody().getResult().getData().get(0).getCrossName());
        assertEquals(cross.getCrossingProjectDbId(), response.getBody().getResult().getData().get(0).getCrossingProjectDbId());
    }
    /**
     * Get a filtered list of Planned Cross entities
     *
     * Get a filtered list of Planned Cross entities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plannedcrossesGetTest() throws ApiException {
        String plannedCrossDbId = "cross4";
        
        PlannedCrossQueryParams queryParams = new PlannedCrossQueryParams().plannedCrossDbId(plannedCrossDbId);
        ApiResponse<BrAPIPlannedCrossesListResponse> response = api.plannedcrossesGet(queryParams);

        assertEquals(1, response.getBody().getResult().getData().size());
        assertEquals(plannedCrossDbId, response.getBody().getResult().getData().get(0).getPlannedCrossDbId());
    }
    /**
     * Create new Planned Cross entities on this server
     *
     * Create new Planned Cross entities on this server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plannedcrossesPostTest() throws ApiException {
    	BrAPIPlannedCross pCross = new BrAPIPlannedCross()
    			.crossingProjectDbId("crossing_project2")
    			.plannedCrossName("New Name");
        List<BrAPIPlannedCross> body = Arrays.asList(pCross);

        ApiResponse<BrAPIPlannedCrossesListResponse> response = api.plannedcrossesPost(body);

        assertEquals(1, response.getBody().getResult().getData().size());
        assertNotNull(response.getBody().getResult().getData().get(0).getPlannedCrossDbId());
        assertEquals(pCross.getPlannedCrossName(), response.getBody().getResult().getData().get(0).getPlannedCrossName());
        assertEquals(pCross.getCrossingProjectDbId(), response.getBody().getResult().getData().get(0).getCrossingProjectDbId());
    }
    /**
     * Update existing Planned Cross entities on this server
     *
     * Update existing Planned Cross entities on this server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plannedcrossesPutTest() throws ApiException {
    	BrAPIPlannedCross pCross = new BrAPIPlannedCross()
    			.crossingProjectDbId("crossing_project2")
    			.plannedCrossName("New Name")
    			.plannedCrossDbId("cross2");
        Map<String, BrAPIPlannedCross> body = new HashMap<String, BrAPIPlannedCross>();
        body.put("cross2", pCross);

        ApiResponse<BrAPIPlannedCrossesListResponse> response = api.plannedcrossesPut(body);

        assertEquals(1, response.getBody().getResult().getData().size());
        assertEquals(pCross.getPlannedCrossDbId(), response.getBody().getResult().getData().get(0).getPlannedCrossDbId());
        assertEquals(pCross.getPlannedCrossName(), response.getBody().getResult().getData().get(0).getPlannedCrossName());
        assertEquals(pCross.getCrossingProjectDbId(), response.getBody().getResult().getData().get(0).getCrossingProjectDbId());
    }
}
