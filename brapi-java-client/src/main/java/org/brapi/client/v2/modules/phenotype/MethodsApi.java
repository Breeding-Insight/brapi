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

import okhttp3.Call;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.MethodQueryParams;
import org.brapi.v2.model.pheno.BrAPIMethod;
import org.brapi.v2.model.pheno.response.BrAPIMethodListResponse;
import org.brapi.v2.model.pheno.response.BrAPIMethodSingleResponse;

public class MethodsApi {
    private BrAPIClient apiClient;

    public MethodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MethodsApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for methodsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call methodsGetCall(MethodQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
        	throw new IllegalArgumentException("queryParams cannot be null");
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/methods";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.methodDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "methodDbId", queryParams.methodDbId());
        if (queryParams.observationVariableDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "observationVariableDbId", queryParams.observationVariableDbId());
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
     * Get the Methods
     * Returns a list of Methods available on a server.  An Observation Variable has 3 critical parts; A Trait being observed, a Method for making the observation, and a Scale on which the observation can be measured and compared with other observations.&#x27;
     * @param queryParams
     * @return ApiResponse&lt;MethodListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIMethodListResponse> methodsGet(MethodQueryParams queryParams) throws ApiException {
        Call call = methodsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIMethodListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Methods (asynchronously)
     * Returns a list of Methods available on a server.  An Observation Variable has 3 critical parts; A Trait being observed, a Method for making the observation, and a Scale on which the observation can be measured and compared with other observations.&#x27;
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call methodsGetAsync(MethodQueryParams queryParams, final ApiCallback<BrAPIMethodListResponse> callback) throws ApiException {
        Call call = methodsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIMethodListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for methodsMethodDbIdGet
     * @param methodDbId Id of the method to retrieve details of. (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call methodsMethodDbIdGetCall(String methodDbId) throws ApiException {
        if(methodDbId == null) {
        	throw new IllegalArgumentException("methodDbId cannot be null");
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/methods/{methodDbId}"
            .replaceAll("\\{" + "methodDbId" + "\\}", apiClient.escapeString(methodDbId.toString()));

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
     * Get the details for a specific Method
     * Retrieve details about a specific method  An Observation Variable has 3 critical parts; A Trait being observed, a Method for making the observation, and a Scale on which the observation can be measured and compared with other observations.
     * @param methodDbId Id of the method to retrieve details of. (required)

     * @return ApiResponse&lt;MethodSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIMethodSingleResponse> methodsMethodDbIdGet(String methodDbId) throws ApiException {
        Call call = methodsMethodDbIdGetCall(methodDbId);
        Type localVarReturnType = new TypeToken<BrAPIMethodSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details for a specific Method (asynchronously)
     * Retrieve details about a specific method  An Observation Variable has 3 critical parts; A Trait being observed, a Method for making the observation, and a Scale on which the observation can be measured and compared with other observations.
     * @param methodDbId Id of the method to retrieve details of. (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call methodsMethodDbIdGetAsync(String methodDbId, final ApiCallback<BrAPIMethodSingleResponse> callback) throws ApiException {
        Call call = methodsMethodDbIdGetCall(methodDbId);
        Type localVarReturnType = new TypeToken<BrAPIMethodSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for methodsMethodDbIdPut
     * @param methodDbId Id of the method to retrieve details of. (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call methodsMethodDbIdPutCall(String methodDbId, BrAPIMethod body) throws ApiException {
        if(methodDbId == null) {
        	throw new IllegalArgumentException("methodDbId cannot be null");
        }
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/methods/{methodDbId}"
            .replaceAll("\\{" + "methodDbId" + "\\}", apiClient.escapeString(methodDbId.toString()));

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
     * Update an existing Method
     * Update the details of an existing method
     * @param methodDbId Id of the method to retrieve details of. (required)
     * @param body  (optional)

     * @return ApiResponse&lt;MethodSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIMethodSingleResponse> methodsMethodDbIdPut(String methodDbId, BrAPIMethod body) throws ApiException {
        Call call = methodsMethodDbIdPutCall(methodDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIMethodSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing Method (asynchronously)
     * Update the details of an existing method
     * @param methodDbId Id of the method to retrieve details of. (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call methodsMethodDbIdPutAsync(String methodDbId, BrAPIMethod body, final ApiCallback<BrAPIMethodSingleResponse> callback) throws ApiException {
        Call call = methodsMethodDbIdPutCall(methodDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIMethodSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for methodsPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call methodsPostCall(List<BrAPIMethod> body) throws ApiException {
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/methods";

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
     * Add new Methods
     * Create new method objects in the database
     * @param body  (optional)

     * @return ApiResponse&lt;MethodListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIMethodListResponse> methodsPost(List<BrAPIMethod> body) throws ApiException {
        Call call = methodsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIMethodListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new Methods (asynchronously)
     * Create new method objects in the database
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call methodsPostAsync(List<BrAPIMethod> body, final ApiCallback<BrAPIMethodListResponse> callback) throws ApiException {
        Call call = methodsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIMethodListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
