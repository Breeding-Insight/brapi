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

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.ApiClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.SeasonQueryParams;
import org.brapi.v2.model.core.BrAPISeason;
import org.brapi.v2.model.core.BrAPISeasonListResponse;
import org.brapi.v2.model.core.BrAPISeasonSingleResponse;

public class SeasonsApi {
    private ApiClient apiClient;

    public SeasonsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SeasonsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for seasonsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seasonsGetCall(SeasonQueryParams queryParams) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seasons";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.seasonDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "seasonDbId", queryParams.seasonDbId());
        if (queryParams.season() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "season", queryParams.season());
        if (queryParams.year() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "year", queryParams.year());
        if (queryParams.page() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", queryParams.page());
        if (queryParams.pageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", queryParams.pageSize());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the Seasons
     * Call to retrieve all seasons in the database.  A season is made of 2 parts; the primary year and a term which defines a segment of the year.  This could be a traditional season, like \&quot;Spring\&quot; or \&quot;Summer\&quot; or this could be a month, like  \&quot;May\&quot; or \&quot;June\&quot; or this could be an arbitrary season name which is meaningful to the breeding  program like \&quot;PlantingTime_3\&quot; or \&quot;Season E\&quot;
     * @param queryParams
     * @return ApiResponse&lt;SeasonListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeasonListResponse> seasonsGet(SeasonQueryParams queryParams) throws ApiException {
        Call call = seasonsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeasonListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Seasons (asynchronously)
     * Call to retrieve all seasons in the database.  A season is made of 2 parts; the primary year and a term which defines a segment of the year.  This could be a traditional season, like \&quot;Spring\&quot; or \&quot;Summer\&quot; or this could be a month, like  \&quot;May\&quot; or \&quot;June\&quot; or this could be an arbitrary season name which is meaningful to the breeding  program like \&quot;PlantingTime_3\&quot; or \&quot;Season E\&quot;
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seasonsGetAsync(SeasonQueryParams queryParams, final ApiCallback<BrAPISeasonListResponse> callback) throws ApiException {
        Call call = seasonsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeasonListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seasonsPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seasonsPostCall(List<BrAPISeason> body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/seasons";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * POST new Seasons
     * Add new season entries to the database
     * @param body  (optional)

     * @return ApiResponse&lt;SeasonListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeasonListResponse> seasonsPost(List<BrAPISeason> body) throws ApiException {
        Call call = seasonsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeasonListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * POST new Seasons (asynchronously)
     * Add new season entries to the database
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seasonsPostAsync(List<BrAPISeason> body, final ApiCallback<BrAPISeasonListResponse> callback) throws ApiException {
        Call call = seasonsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeasonListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seasonsSeasonDbIdGet
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seasonsSeasonDbIdGetCall(String seasonDbId) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seasons/{seasonDbId}"
            .replaceAll("\\{" + "seasonDbId" + "\\}", apiClient.escapeString(seasonDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the a single Season
     * Get the a single Season
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)

     * @return ApiResponse&lt;SeasonSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeasonSingleResponse> seasonsSeasonDbIdGet(String seasonDbId) throws ApiException {
        Call call = seasonsSeasonDbIdGetCall(seasonDbId);
        Type localVarReturnType = new TypeToken<BrAPISeasonSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the a single Season (asynchronously)
     * Get the a single Season
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seasonsSeasonDbIdGetAsync(String seasonDbId, final ApiCallback<BrAPISeasonSingleResponse> callback) throws ApiException {
        Call call = seasonsSeasonDbIdGetCall(seasonDbId);
        Type localVarReturnType = new TypeToken<BrAPISeasonSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seasonsSeasonDbIdPut
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seasonsSeasonDbIdPutCall(String seasonDbId, BrAPISeason body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/seasons/{seasonDbId}"
            .replaceAll("\\{" + "seasonDbId" + "\\}", apiClient.escapeString(seasonDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Update existing Seasons
     * Update existing Seasons
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)
     * @param body  (optional)

     * @return ApiResponse&lt;SeasonSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeasonSingleResponse> seasonsSeasonDbIdPut(String seasonDbId, BrAPISeason body) throws ApiException {
        Call call = seasonsSeasonDbIdPutCall(seasonDbId, body);
        Type localVarReturnType = new TypeToken<BrAPISeasonSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update existing Seasons (asynchronously)
     * Update existing Seasons
     * @param seasonDbId The unique identifier for a season. For backward compatibility it can be a string like &#x27;2012&#x27;, &#x27;1957-2004&#x27; (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seasonsSeasonDbIdPutAsync(String seasonDbId, BrAPISeason body, final ApiCallback<BrAPISeasonSingleResponse> callback) throws ApiException {
        Call call = seasonsSeasonDbIdPutCall(seasonDbId, body);
        Type localVarReturnType = new TypeToken<BrAPISeasonSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
