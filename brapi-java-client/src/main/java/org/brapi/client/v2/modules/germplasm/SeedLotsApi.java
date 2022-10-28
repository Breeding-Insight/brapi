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
import org.brapi.client.v2.model.queryParams.germplasm.SeedLotQueryParams;
import org.brapi.client.v2.model.queryParams.germplasm.SeedLotTransactionQueryParams;
import org.brapi.v2.model.germ.BrAPISeedLot;
import org.brapi.v2.model.germ.BrAPISeedLotTransaction;
import org.brapi.v2.model.germ.response.BrAPISeedLotListResponse;
import org.brapi.v2.model.germ.response.BrAPISeedLotSingleResponse;
import org.brapi.v2.model.germ.response.BrAPISeedLotTransactionListResponse;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;

public class SeedLotsApi {
    private BrAPIClient apiClient;

    public SeedLotsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SeedLotsApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for seedlotsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsGetCall(SeedLotQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seedlots";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.seedLotDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "seedLotDbId", queryParams.seedLotDbId());
        if (queryParams.germplasmDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmDbId", queryParams.germplasmDbId());
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
     * Get a filtered list of Seed Lot descriptions
     * Get a filtered list of Seed Lot descriptions available in a system.
     * @param queryParams
     * @return ApiResponse&lt;SeedLotListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotListResponse> seedlotsGet(SeedLotQueryParams queryParams) throws ApiException {
        Call call = seedlotsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeedLotListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a filtered list of Seed Lot descriptions (asynchronously)
     * Get a filtered list of Seed Lot descriptions available in a system.
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsGetAsync(SeedLotQueryParams queryParams, final ApiCallback<BrAPISeedLotListResponse> callback) throws ApiException {
        Call call = seedlotsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeedLotListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsPostCall(List<BrAPISeedLot> body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/seedlots";

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
     * Add new Seed Lot descriptions to a server
     * Add new Seed Lot descriptions to a server
     * @param body  (optional)

     * @return ApiResponse&lt;SeedLotListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotListResponse> seedlotsPost(List<BrAPISeedLot> body) throws ApiException {
        Call call = seedlotsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new Seed Lot descriptions to a server (asynchronously)
     * Add new Seed Lot descriptions to a server
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsPostAsync(List<BrAPISeedLot> body, final ApiCallback<BrAPISeedLotListResponse> callback) throws ApiException {
        Call call = seedlotsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsSeedLotDbIdGet
     * @param seedLotDbId Unique id for a seed lot on this server (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsSeedLotDbIdGetCall(String seedLotDbId) throws ApiException {
        if(seedLotDbId == null) {
            throw new IllegalArgumentException("seedLotDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seedlots/{seedLotDbId}"
            .replaceAll("\\{" + "seedLotDbId" + "\\}", apiClient.escapeString(seedLotDbId));

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
     * Get a specific Seed Lot
     * Get a specific Seed Lot by seedLotDbId
     * @param seedLotDbId Unique id for a seed lot on this server (required)

     * @return ApiResponse&lt;SeedLotSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotSingleResponse> seedlotsSeedLotDbIdGet(String seedLotDbId) throws ApiException {
        Call call = seedlotsSeedLotDbIdGetCall(seedLotDbId);
        Type localVarReturnType = new TypeToken<BrAPISeedLotSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a specific Seed Lot (asynchronously)
     * Get a specific Seed Lot by seedLotDbId
     * @param seedLotDbId Unique id for a seed lot on this server (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsSeedLotDbIdGetAsync(String seedLotDbId, final ApiCallback<BrAPISeedLotSingleResponse> callback) throws ApiException {
        Call call = seedlotsSeedLotDbIdGetCall(seedLotDbId);
        Type localVarReturnType = new TypeToken<BrAPISeedLotSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsSeedLotDbIdPut
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsSeedLotDbIdPutCall(String seedLotDbId, BrAPISeedLot body) throws ApiException {
        if(seedLotDbId == null) {
            throw new IllegalArgumentException("seedLotDbId cannot be null"); 
        }
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/seedlots/{seedLotDbId}"
            .replaceAll("\\{" + "seedLotDbId" + "\\}", apiClient.escapeString(seedLotDbId));

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
     * Update an existing Seed Lot
     * Update an existing Seed Lot
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param body  (optional)

     * @return ApiResponse&lt;SeedLotSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotSingleResponse> seedlotsSeedLotDbIdPut(String seedLotDbId, BrAPISeedLot body) throws ApiException {
        Call call = seedlotsSeedLotDbIdPutCall(seedLotDbId, body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing Seed Lot (asynchronously)
     * Update an existing Seed Lot
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsSeedLotDbIdPutAsync(String seedLotDbId, BrAPISeedLot body, final ApiCallback<BrAPISeedLotSingleResponse> callback) throws ApiException {
        Call call = seedlotsSeedLotDbIdPutCall(seedLotDbId, body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsSeedLotDbIdTransactionsGet
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param transactionDbId Unique id for a Transaction that has occured (optional)
     * @param transactionDirection Filter results to only include transactions directed to the specific Seed Lot (TO), away from the specific Seed Lot (FROM), or both (BOTH). The default value for this parameter is BOTH (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsSeedLotDbIdTransactionsGetCall(String seedLotDbId, String transactionDbId, String transactionDirection, Integer page, Integer pageSize) throws ApiException {
        if(seedLotDbId == null) {
            throw new IllegalArgumentException("seedLotDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seedlots/{seedLotDbId}/transactions"
            .replaceAll("\\{" + "seedLotDbId" + "\\}", apiClient.escapeString(seedLotDbId));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (transactionDbId != null)
            apiClient.prepQueryParameter(localVarQueryParams, "transactionDbId", transactionDbId);
        if (transactionDirection != null)
            apiClient.prepQueryParameter(localVarQueryParams, "transactionDirection", transactionDirection);
        if (page != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", page);
        if (pageSize != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", pageSize);

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
     * Get all Transactions related to a specific Seed Lot
     * Get all Transactions related to a specific Seed Lot
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param transactionDbId Unique id for a Transaction that has occured (optional)
     * @param transactionDirection Filter results to only include transactions directed to the specific Seed Lot (TO), away from the specific Seed Lot (FROM), or both (BOTH). The default value for this parameter is BOTH (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;SeedLotTransactionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotTransactionListResponse> seedlotsSeedLotDbIdTransactionsGet(String seedLotDbId, String transactionDbId, String transactionDirection, Integer page, Integer pageSize) throws ApiException {
        Call call = seedlotsSeedLotDbIdTransactionsGetCall(seedLotDbId, transactionDbId, transactionDirection, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Transactions related to a specific Seed Lot (asynchronously)
     * Get all Transactions related to a specific Seed Lot
     * @param seedLotDbId Unique id for a seed lot on this server (required)
     * @param transactionDbId Unique id for a Transaction that has occured (optional)
     * @param transactionDirection Filter results to only include transactions directed to the specific Seed Lot (TO), away from the specific Seed Lot (FROM), or both (BOTH). The default value for this parameter is BOTH (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsSeedLotDbIdTransactionsGetAsync(String seedLotDbId, String transactionDbId, String transactionDirection, Integer page, Integer pageSize, final ApiCallback<BrAPISeedLotTransactionListResponse> callback) throws ApiException {
        Call call = seedlotsSeedLotDbIdTransactionsGetCall(seedLotDbId, transactionDbId, transactionDirection, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsTransactionsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsTransactionsGetCall(SeedLotTransactionQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/seedlots/transactions";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.transactionDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "transactionDbId", queryParams.transactionDbId());
        if (queryParams.seedLotDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "seedLotDbId", queryParams.seedLotDbId());
        if (queryParams.germplasmDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmDbId", queryParams.germplasmDbId());
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
     * Get a filtered list of Seed Lot Transactions
     * Get a filtered list of Seed Lot Transactions
     * @param queryParams
     * @return ApiResponse&lt;SeedLotTransactionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotTransactionListResponse> seedlotsTransactionsGet(SeedLotTransactionQueryParams queryParams) throws ApiException {
        Call call = seedlotsTransactionsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a filtered list of Seed Lot Transactions (asynchronously)
     * Get a filtered list of Seed Lot Transactions
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsTransactionsGetAsync(SeedLotTransactionQueryParams queryParams, final ApiCallback<BrAPISeedLotTransactionListResponse> callback) throws ApiException {
        Call call = seedlotsTransactionsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for seedlotsTransactionsPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call seedlotsTransactionsPostCall(List<BrAPISeedLotTransaction> body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/seedlots/transactions";

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
     * Add new Seed Lot Transaction to be recorded
     * Add new Seed Lot Transaction to be recorded
     * @param body  (optional)

     * @return ApiResponse&lt;SeedLotTransactionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPISeedLotTransactionListResponse> seedlotsTransactionsPost(List<BrAPISeedLotTransaction> body) throws ApiException {
        Call call = seedlotsTransactionsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new Seed Lot Transaction to be recorded (asynchronously)
     * Add new Seed Lot Transaction to be recorded
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call seedlotsTransactionsPostAsync(List<BrAPISeedLotTransaction> body, final ApiCallback<BrAPISeedLotTransactionListResponse> callback) throws ApiException {
        Call call = seedlotsTransactionsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPISeedLotTransactionListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
