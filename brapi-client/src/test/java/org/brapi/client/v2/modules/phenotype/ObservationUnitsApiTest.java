/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.phenotype;

import org.junit.jupiter.api.Test;

import io.swagger.client.model.WSMIMEDataTypes;
import io.swagger.client.model.pheno.ObservationLevelListResponse;
import io.swagger.client.model.pheno.ObservationUnitListResponse;
import io.swagger.client.model.pheno.ObservationUnitNewRequest;
import io.swagger.client.model.pheno.ObservationUnitSearchRequest;
import io.swagger.client.model.pheno.ObservationUnitSingleResponse;
import io.swagger.client.model.pheno.ObservationUnitTableResponse;
import io.swagger.client.org.brapi.client.ApiException;
import io.swagger.client.org.brapi.client.api.phenotype.ObservationUnitsApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObservationUnitsApi
 */
public class ObservationUnitsApiTest {

    private final ObservationUnitsApi api = new ObservationUnitsApi();

    /**
     * Get the Observation Levels
     *
     * Call to retrieve the list of supported observation levels.   Observation levels indicate the granularity level at which the measurements are taken. &#x60;levelName&#x60; defines the level, &#x60;levelOrder&#x60; defines where that level exists in the hierarchy of levels. &#x60;levelOrder&#x60;s lower numbers are at the top of the hierarchy (ie field &gt; 0) and higher numbers are at the bottom of the hierarchy (ie plant &gt; 6).   The values are used to supply the &#x60;observationLevel&#x60; parameter in the observation unit details call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationlevelsGetTest() throws ApiException {
        String studyDbId = null;
        String trialDbId = null;
        String programDbId = null;
        Integer page = null;
        Integer pageSize = null;
        String authorization = null;
        ObservationLevelListResponse response = api.observationlevelsGet(studyDbId, trialDbId, programDbId, page, pageSize, authorization);

        // TODO: test validations
    }
    /**
     * Get a filtered set of Observation Units
     *
     * Get a filtered set of Observation Units
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsGetTest() throws ApiException {
        String observationUnitDbId = null;
        String germplasmDbId = null;
        String studyDbId = null;
        String locationDbId = null;
        String trialDbId = null;
        String programDbId = null;
        String seasonDbId = null;
        String observationUnitLevelName = null;
        String observationUnitLevelOrder = null;
        String observationUnitLevelCode = null;
        Boolean includeObservations = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        String authorization = null;
        ObservationUnitListResponse response = api.observationunitsGet(observationUnitDbId, germplasmDbId, studyDbId, locationDbId, trialDbId, programDbId, seasonDbId, observationUnitLevelName, observationUnitLevelOrder, observationUnitLevelCode, includeObservations, externalReferenceID, externalReferenceSource, page, pageSize, authorization);

        // TODO: test validations
    }
    /**
     * Get the details of a specific Observation Unit
     *
     * Get the details of a specific Observation Unit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsObservationUnitDbIdGetTest() throws ApiException {
        String observationUnitDbId = null;
        String authorization = null;
        ObservationUnitSingleResponse response = api.observationunitsObservationUnitDbIdGet(observationUnitDbId, authorization);

        // TODO: test validations
    }
    /**
     * Update an existing Observation Units
     *
     * Update an existing Observation Units
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsObservationUnitDbIdPutTest() throws ApiException {
        String observationUnitDbId = null;
        ObservationUnitNewRequest body = null;
        String authorization = null;
        ObservationUnitSingleResponse response = api.observationunitsObservationUnitDbIdPut(observationUnitDbId, body, authorization);

        // TODO: test validations
    }
    /**
     * Add new Observation Units
     *
     * Add new Observation Units
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsPostTest() throws ApiException {
        List<ObservationUnitNewRequest> body = null;
        String authorization = null;
        ObservationUnitListResponse response = api.observationunitsPost(body, authorization);

        // TODO: test validations
    }
    /**
     * Update a set of Observation Units
     *
     * Update a set of Observation Units  Note - In strictly typed languages, this structure can be represented as a Map or Dictionary of objects and parsed directly to JSON.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsPutTest() throws ApiException {
        Map<String, ObservationUnitNewRequest> body = null;
        String authorization = null;
        ObservationUnitListResponse response = api.observationunitsPut(body, authorization);

        // TODO: test validations
    }
    /**
     * Get a list of Observations in a table format
     *
     * &lt;p&gt;This service is designed to retrieve a table for observation values as a matrix of Observation Units and Observation Variables.&lt;/p&gt; &lt;p&gt;The table may be represented by JSON, CSV, or TSV. The \&quot;Accept\&quot; HTTP header is used for the client to request different return formats.  By default, if the \&quot;Accept\&quot; header is not included in the request, the server should return JSON as described below.&lt;/p&gt; &lt;p&gt;The table is REQUIRED to have the following columns&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;observationUnitDbId - Each row is related to one Observation Unit&lt;/li&gt;   &lt;li&gt;At least one column with an observationVariableDbId&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The table may have any or all of the following OPTIONAL columns. Included columns are decided by the server developer&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;observationUnitName&lt;/li&gt;   &lt;li&gt;studyDbId&lt;/li&gt;   &lt;li&gt;studyName&lt;/li&gt;   &lt;li&gt;germplasmDbId&lt;/li&gt;   &lt;li&gt;germplasmName&lt;/li&gt;   &lt;li&gt;positionCoordinateX&lt;/li&gt;   &lt;li&gt;positionCoordinateY&lt;/li&gt;   &lt;li&gt;year&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The table also may have any number of Observation Unit Hierarchy Level columns. For example:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;field&lt;/li&gt;   &lt;li&gt;plot&lt;/li&gt;   &lt;li&gt;sub-plot&lt;/li&gt;   &lt;li&gt;plant&lt;/li&gt;   &lt;li&gt;pot&lt;/li&gt;   &lt;li&gt;block&lt;/li&gt;   &lt;li&gt;entry&lt;/li&gt;   &lt;li&gt;rep&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The JSON representation provides a pair of extra arrays for defining the headers of the table.  The first array \&quot;headerRow\&quot; will always contain \&quot;observationUnitDbId\&quot; and any or all of the OPTIONAL column header names.  The second array \&quot;observationVariables\&quot; contains the names and DbIds for the Observation Variables represented in the table.  By appending the two arrays, you can construct the complete header row of the table. &lt;/p&gt; &lt;p&gt;For CSV and TSV representations of the table, an extra header row is needed to describe both the Observation Variable DbId and the Observation Variable Name for each data column.  See the example responses below&lt;/p&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void observationunitsTableGetTest() throws ApiException {
        WSMIMEDataTypes accept = null;
        String observationUnitDbId = null;
        String germplasmDbId = null;
        String observationVariableDbId = null;
        String studyDbId = null;
        String locationDbId = null;
        String trialDbId = null;
        String programDbId = null;
        String seasonDbId = null;
        String observationLevel = null;
        String authorization = null;
        ObservationUnitTableResponse response = api.observationunitsTableGet(accept, observationUnitDbId, germplasmDbId, observationVariableDbId, studyDbId, locationDbId, trialDbId, programDbId, seasonDbId, observationLevel, authorization);

        // TODO: test validations
    }
    /**
     * Submit a search request for Observation Units
     *
     * Returns a list of observationUnit with the observed Phenotypes.  See Search Services for additional implementation details.  Use case - this section allows to get a dataset from multiple studies. It allows to integrate data from several databases.  Example Use cases   - Study a panel of germplasm across multiple studies  - Get all data for a specific study   - Get simple atomic phenotyping values   - Study Locations for adaptation to climate change  - Find phenotypes that are from after a certain timestamp  observationTimeStampRangeStart and observationTimeStampRangeEnd use Iso Standard 8601.  observationValue data type inferred from the ontology
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchObservationunitsPostTest() throws ApiException {
        ObservationUnitSearchRequest body = null;
        String authorization = null;
        ObservationUnitListResponse response = api.searchObservationunitsPost(body, authorization);

        // TODO: test validations
    }
    /**
     * Observation Unit Search
     *
     * Returns a list of observationUnit with the observed Phenotypes.  See Search Services for additional implementation details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchObservationunitsSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = null;
        Integer page = null;
        Integer pageSize = null;
        String authorization = null;
        ObservationUnitListResponse response = api.searchObservationunitsSearchResultsDbIdGet(searchResultsDbId, page, pageSize, authorization);

        // TODO: test validations
    }
}
