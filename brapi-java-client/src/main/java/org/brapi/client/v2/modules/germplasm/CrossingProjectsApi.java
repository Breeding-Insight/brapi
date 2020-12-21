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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.CrossingProjectQueryParams;
import org.brapi.v2.model.germ.BrAPICrossingProject;
import org.brapi.v2.model.germ.response.BrAPICrossingProjectsListResponse;
import org.brapi.v2.model.germ.response.BrAPICrossingProjectsSingleResponse;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;

public class CrossingProjectsApi {
    private BrAPIClient apiClient;

    public CrossingProjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CrossingProjectsApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for crossingprojectsCrossingProjectDbIdGet
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call crossingprojectsCrossingProjectDbIdGetCall(String crossingProjectDbId) throws ApiException {
        if(crossingProjectDbId == null) {
            throw new IllegalArgumentException("crossingProjectDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/crossingprojects/{crossingProjectDbId}"
            .replaceAll("\\{" + "crossingProjectDbId" + "\\}", apiClient.escapeString(crossingProjectDbId.toString()));

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
     * Get a filtered list of Crossing Projects
     * Get a filtered list of Crossing Projects.
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)

     * @return ApiResponse&lt;CrossingProjectsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPICrossingProjectsSingleResponse> crossingprojectsCrossingProjectDbIdGet(String crossingProjectDbId) throws ApiException {
        Call call = crossingprojectsCrossingProjectDbIdGetCall(crossingProjectDbId);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a filtered list of Crossing Projects (asynchronously)
     * Get a filtered list of Crossing Projects.
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crossingprojectsCrossingProjectDbIdGetAsync(String crossingProjectDbId, final ApiCallback<BrAPICrossingProjectsSingleResponse> callback) throws ApiException {
        Call call = crossingprojectsCrossingProjectDbIdGetCall(crossingProjectDbId);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crossingprojectsCrossingProjectDbIdPut
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call crossingprojectsCrossingProjectDbIdPutCall(String crossingProjectDbId, BrAPICrossingProject body) throws ApiException {
        if(crossingProjectDbId == null) {
            throw new IllegalArgumentException("crossingProjectDbId cannot be null"); 
        }
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/crossingprojects/{crossingProjectDbId}"
            .replaceAll("\\{" + "crossingProjectDbId" + "\\}", apiClient.escapeString(crossingProjectDbId.toString()));

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
     * Update an existing Crossing Project
     * Update an existing Crossing Project entity on this server
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)
     * @param body  (optional)

     * @return ApiResponse&lt;CrossingProjectsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPICrossingProjectsSingleResponse> crossingprojectsCrossingProjectDbIdPut(String crossingProjectDbId, BrAPICrossingProject body) throws ApiException {
        Call call = crossingprojectsCrossingProjectDbIdPutCall(crossingProjectDbId, body);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing Crossing Project (asynchronously)
     * Update an existing Crossing Project entity on this server
     * @param crossingProjectDbId Search for Crossing Projects with this unique id (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crossingprojectsCrossingProjectDbIdPutAsync(String crossingProjectDbId, BrAPICrossingProject body, final ApiCallback<BrAPICrossingProjectsSingleResponse> callback) throws ApiException {
        Call call = crossingprojectsCrossingProjectDbIdPutCall(crossingProjectDbId, body);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crossingprojectsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call crossingprojectsGetCall(CrossingProjectQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/crossingprojects";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.crossingProjectDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "crossingProjectDbId", queryParams.crossingProjectDbId());
        if (queryParams.externalReferenceID() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceID", queryParams.externalReferenceID());
        if (queryParams.externalReferenceSource() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceSource", queryParams.externalReferenceSource());
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
     * Get a filtered list of Crossing Projects
     * Get a filtered list of Crossing Projects.
     * @param queryParams
     * @return ApiResponse&lt;CrossingProjectsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPICrossingProjectsListResponse> crossingprojectsGet(CrossingProjectQueryParams queryParams) throws ApiException {
        Call call = crossingprojectsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a filtered list of Crossing Projects (asynchronously)
     * Get a filtered list of Crossing Projects.
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crossingprojectsGetAsync(CrossingProjectQueryParams queryParams, final ApiCallback<BrAPICrossingProjectsListResponse> callback) throws ApiException {
        Call call = crossingprojectsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for crossingprojectsPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call crossingprojectsPostCall(List<BrAPICrossingProject> body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/crossingprojects";

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
     * Create new Crossing Project entities on this server
     * Create new Crossing Project entities on this server
     * @param body  (optional)

     * @return ApiResponse&lt;CrossingProjectsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPICrossingProjectsListResponse> crossingprojectsPost(List<BrAPICrossingProject> body) throws ApiException {
        Call call = crossingprojectsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new Crossing Project entities on this server (asynchronously)
     * Create new Crossing Project entities on this server
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call crossingprojectsPostAsync(List<BrAPICrossingProject> body, final ApiCallback<BrAPICrossingProjectsListResponse> callback) throws ApiException {
        Call call = crossingprojectsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPICrossingProjectsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
