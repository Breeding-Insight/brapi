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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.ObservationQueryParams;
import org.brapi.client.v2.model.queryParams.phenotype.ObservationTableQueryParams;
import org.brapi.v2.model.BrAPIWSMIMEDataTypes;
import org.brapi.v2.model.pheno.BrAPIObservation;
import org.brapi.v2.model.pheno.response.BrAPIObservationListResponse;
import org.brapi.v2.model.pheno.request.BrAPIObservationSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIObservationSingleResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationTableResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * API tests for ObservationsApi
 */
public class ObservationsApiTest {

	private final ObservationsApi api = new ObservationsApi();

	/**
	 * Get a filtered set of Observations
	 *
	 * Retrieve all observations where there are measurements for the given
	 * observation variables. observationTimestamp should be ISO8601 format with
	 * timezone -&gt; YYYY-MM-DDThh:mm:ss+hhmm
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsGetTest() throws ApiException {
		String observationDbId = null;
		String observationUnitDbId = null;
		String germplasmDbId = null;
		String observationVariableDbId = null;
		String studyDbId = null;
		String locationDbId = null;
		String trialDbId = null;
		String programDbId = null;
		String seasonDbId = null;
		String observationUnitLevelName = null;
		String observationUnitLevelOrder = null;
		String observationUnitLevelCode = null;
		OffsetDateTime observationTimeStampRangeStart = null;
		OffsetDateTime observationTimeStampRangeEnd = null;
		String externalReferenceID = null;
		String externalReferenceSource = null;
		Integer page = null;
		Integer pageSize = null;

		ObservationQueryParams queryParams = new ObservationQueryParams();
		ApiResponse<BrAPIObservationListResponse> response = api.observationsGet(queryParams);

		// TODO: test validations
	}

	/**
	 * Get the details of a specific Observations
	 *
	 * Get the details of a specific Observations observationTimestamp should be
	 * ISO8601 format with timezone -&gt; YYYY-MM-DDThh:mm:ss+hhmm
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsObservationDbIdGetTest() throws ApiException {
		String observationDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationSingleResponse> response = api.observationsObservationDbIdGet(observationDbId);
		});

		// TODO: test validations
	}

	/**
	 * Update an existing Observation
	 *
	 * Update an existing Observation
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsObservationDbIdPutTest() throws ApiException {
		String observationDbId = null;
		BrAPIObservation body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationSingleResponse> response = api.observationsObservationDbIdPut(observationDbId,
					body);
		});

		// TODO: test validations
	}

	/**
	 * Add new Observation entities
	 *
	 * Add new Observation entities
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsPostTest() throws ApiException {
		List<BrAPIObservation> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationListResponse> response = api.observationsPost(body);
		});

		// TODO: test validations
	}

	/**
	 * Update multiple Observation entities
	 *
	 * Update multiple Observation entities simultaneously with a single call
	 * Include as many &#x60;observationDbIds&#x60; in the request as needed. Note -
	 * In strictly typed languages, this structure can be represented as a Map or
	 * Dictionary of objects and parsed directly from JSON.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsPutTest() throws ApiException {
		Map<String, BrAPIObservation> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationListResponse> response = api.observationsPut(body);
		});

		// TODO: test validations
	}

	/**
	 * Get a list of Observations in a table format
	 *
	 * &lt;p&gt;This service is designed to retrieve a table of time dependant
	 * observation values as a matrix of Observation Units and Observation
	 * Variables. This is also sometimes called a Time Series. This service takes
	 * the \&quot;Sparse Table\&quot; approach for representing this time dependant
	 * data.&lt;/p&gt; &lt;p&gt;The table may be represented by JSON, CSV, or TSV.
	 * The \&quot;Accept\&quot; HTTP header is used for the client to request
	 * different return formats. By default, if the \&quot;Accept\&quot; header is
	 * not included in the request, the server should return JSON as described
	 * below.&lt;/p&gt; &lt;p&gt;The table is REQUIRED to have the following
	 * columns&lt;/p&gt; &lt;ul&gt; &lt;li&gt;observationUnitDbId - Each row is
	 * related to one Observation Unit&lt;/li&gt; &lt;li&gt;observationTimeStamp -
	 * Each row is has a time stamp for when the observation was taken&lt;/li&gt;
	 * &lt;li&gt;At least one column with an observationVariableDbId&lt;/li&gt;
	 * &lt;/ul&gt; &lt;p&gt;The table may have any or all of the following OPTIONAL
	 * columns. Included columns are decided by the server developer&lt;/p&gt;
	 * &lt;ul&gt; &lt;li&gt;observationUnitName&lt;/li&gt;
	 * &lt;li&gt;studyDbId&lt;/li&gt; &lt;li&gt;studyName&lt;/li&gt;
	 * &lt;li&gt;germplasmDbId&lt;/li&gt; &lt;li&gt;germplasmName&lt;/li&gt;
	 * &lt;li&gt;positionCoordinateX&lt;/li&gt;
	 * &lt;li&gt;positionCoordinateY&lt;/li&gt; &lt;li&gt;year&lt;/li&gt;
	 * &lt;/ul&gt; &lt;p&gt;The table also may have any number of Observation Unit
	 * Hierarchy Level columns. For example:&lt;/p&gt; &lt;ul&gt;
	 * &lt;li&gt;field&lt;/li&gt; &lt;li&gt;plot&lt;/li&gt;
	 * &lt;li&gt;sub-plot&lt;/li&gt; &lt;li&gt;plant&lt;/li&gt;
	 * &lt;li&gt;pot&lt;/li&gt; &lt;li&gt;block&lt;/li&gt;
	 * &lt;li&gt;entry&lt;/li&gt; &lt;li&gt;rep&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The
	 * JSON representation provides a pair of extra arrays for defining the headers
	 * of the table. The first array \&quot;headerRow\&quot; will always contain
	 * \&quot;observationUnitDbId\&quot; and any or all of the OPTIONAL column
	 * header names. The second array \&quot;observationVariables\&quot; contains
	 * the names and DbIds for the Observation Variables represented in the table.
	 * By appending the two arrays, you can construct the complete header row of the
	 * table. &lt;/p&gt; &lt;p&gt;For CSV and TSV representations of the table, an
	 * extra header row is needed to describe both the Observation Variable DbId and
	 * the Observation Variable Name for each data column. See the example responses
	 * below&lt;/p&gt;
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void observationsTableGetTest() throws ApiException {
		BrAPIWSMIMEDataTypes accept = null;
		String observationUnitDbId = null;
		String germplasmDbId = null;
		String observationVariableDbId = null;
		String studyDbId = null;
		String locationDbId = null;
		String trialDbId = null;
		String programDbId = null;
		String seasonDbId = null;
		String observationLevel = null;
		String searchResultsDbId = null;
		OffsetDateTime observationTimeStampRangeStart = null;
		OffsetDateTime observationTimeStampRangeEnd = null;

		ObservationTableQueryParams queryParams = new ObservationTableQueryParams();
		ApiResponse<BrAPIObservationTableResponse> response = api.observationsTableGet(accept, queryParams);

		// TODO: test validations
	}

	/**
	 * Submit a search request for a set of Observations
	 *
	 * Submit a search request for a set of Observations. Returns an Id which
	 * reference the results of this search
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void searchObservationsPostTest() throws ApiException {
		BrAPIObservationSearchRequest body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationListResponse> response = api.searchObservationsPost(body);
		});

		// TODO: test validations
	}

	/**
	 * Returns a list of Observations based on search criteria.
	 *
	 * Returns a list of Observations based on search criteria. observationTimeStamp
	 * - Iso Standard 8601. observationValue data type inferred from the ontology
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void searchObservationsSearchResultsDbIdGetTest() throws ApiException {
		BrAPIWSMIMEDataTypes accept = null;
		String searchResultsDbId = null;

		Integer page = null;
		Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationListResponse> response = api.searchObservationsSearchResultsDbIdGet(accept,
					searchResultsDbId, page, pageSize);
		});

		// TODO: test validations
	}
}