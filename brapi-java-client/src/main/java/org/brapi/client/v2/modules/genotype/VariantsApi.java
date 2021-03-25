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

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.genotype.GenotypeQueryParams;
import org.brapi.client.v2.model.queryParams.genotype.VariantQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.geno.response.BrAPICallsListResponse;
import org.brapi.v2.model.geno.response.BrAPIVariantSingleResponse;
import org.brapi.v2.model.geno.response.BrAPIVariantsListResponse;
import org.brapi.v2.model.geno.request.BrAPIVariantsSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;

public class VariantsApi {
    private BrAPIClient apiClient;

    public VariantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VariantsApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchVariantsPost
     * @param body Study Search request (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchVariantsPostCall(BrAPIVariantsSearchRequest body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/variants";

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
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param body Study Search request (optional)

     * @return ApiResponse&lt;VariantsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pair<Optional<BrAPIVariantsListResponse>, Optional<BrAPIAcceptedSearchResponse>>> searchVariantsPost(BrAPIVariantsSearchRequest body) throws ApiException {
        Call call = searchVariantsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        return apiClient.executeSearch(call, localVarReturnType);
    }

    /**
     * Gets a list of &#x60;Variant&#x60; matching the search criteria. (asynchronously)
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param body Study Search request (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchVariantsPostAsync(BrAPIVariantsSearchRequest body, final ApiCallback<BrAPIVariantsListResponse> callback) throws ApiException {
        Call call = searchVariantsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchVariantsSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param pageToken Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively.  (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchVariantsSearchResultsDbIdGetCall(String searchResultsDbId, String pageToken, Integer pageSize) throws ApiException {
        if(searchResultsDbId == null) {
            throw new IllegalArgumentException("searchResultsDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/variants/{searchResultsDbId}"
            .replaceAll("\\{" + "searchResultsDbId" + "\\}", apiClient.escapeString(searchResultsDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (pageToken != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageToken", pageToken);
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
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param pageToken Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively.  (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;VariantsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVariantsListResponse> searchVariantsSearchResultsDbIdGet(String searchResultsDbId, String pageToken, Integer pageSize) throws ApiException {
        Call call = searchVariantsSearchResultsDbIdGetCall(searchResultsDbId, pageToken, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of &#x60;Variant&#x60; matching the search criteria. (asynchronously)
     * Gets a list of &#x60;Variant&#x60; matching the search criteria.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param pageToken Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively.  (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchVariantsSearchResultsDbIdGetAsync(String searchResultsDbId, String pageToken, Integer pageSize, final ApiCallback<BrAPIVariantsListResponse> callback) throws ApiException {
        Call call = searchVariantsSearchResultsDbIdGetCall(searchResultsDbId, pageToken, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for variantsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call variantsGetCall(VariantQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/variants";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.variantDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "variantDbId", queryParams.variantDbId());
        if (queryParams.variantSetDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "variantSetDbId", queryParams.variantSetDbId());
        if (queryParams.pageToken() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageToken", queryParams.pageToken());
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
     * Gets a filtered list of &#x60;Variants&#x60;.
     * Gets a filtered list of &#x60;Variants&#x60;.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param queryParams
     * @return ApiResponse&lt;VariantsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVariantsListResponse> variantsGet(VariantQueryParams queryParams) throws ApiException {
        Call call = variantsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of &#x60;Variants&#x60;. (asynchronously)
     * Gets a filtered list of &#x60;Variants&#x60;.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call variantsGetAsync(VariantQueryParams queryParams, final ApiCallback<BrAPIVariantsListResponse> callback) throws ApiException {
        Call call = variantsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIVariantsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for variantsVariantDbIdCallsGet
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call variantsVariantDbIdCallsGetCall(String variantDbId, GenotypeQueryParams queryParams) throws ApiException {
        if(variantDbId == null) {
            throw new IllegalArgumentException("variantDbId cannot be null"); 
        }
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/variants/{variantDbId}/calls"
            .replaceAll("\\{" + "variantDbId" + "\\}", apiClient.escapeString(variantDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.expandHomozygotes() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "expandHomozygotes", queryParams.expandHomozygotes());
        if (queryParams.unknownString() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "unknownString", queryParams.unknownString());
        if (queryParams.sepPhased() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "sepPhased", queryParams.sepPhased());
        if (queryParams.sepUnphased() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "sepUnphased", queryParams.sepUnphased());
        if (queryParams.pageToken() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageToken", queryParams.pageToken());
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
     * Gets a list of &#x60;Calls&#x60; associated with a &#x60;Variant&#x60;.
     * The variant calls for this particular variant. Each one represents the determination of genotype with respect to this variant. &#x60;Calls&#x60; in this array are implicitly associated with this &#x60;Variant&#x60;.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)
     * @param queryParams
     * @return ApiResponse&lt;CallsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPICallsListResponse> variantsVariantDbIdCallsGet(String variantDbId, GenotypeQueryParams queryParams) throws ApiException {
        Call call = variantsVariantDbIdCallsGetCall(variantDbId, queryParams);
        Type localVarReturnType = new TypeToken<BrAPICallsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of &#x60;Calls&#x60; associated with a &#x60;Variant&#x60;. (asynchronously)
     * The variant calls for this particular variant. Each one represents the determination of genotype with respect to this variant. &#x60;Calls&#x60; in this array are implicitly associated with this &#x60;Variant&#x60;.  ** THIS ENDPOINT USES TOKEN BASED PAGING **
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call variantsVariantDbIdCallsGetAsync(String variantDbId, GenotypeQueryParams queryParams, final ApiCallback<BrAPICallsListResponse> callback) throws ApiException {
        Call call = variantsVariantDbIdCallsGetCall(variantDbId, queryParams);
        Type localVarReturnType = new TypeToken<BrAPICallsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for variantsVariantDbIdGet
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call variantsVariantDbIdGetCall(String variantDbId) throws ApiException {
        if(variantDbId == null) {
            throw new IllegalArgumentException("variantDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/variants/{variantDbId}"
            .replaceAll("\\{" + "variantDbId" + "\\}", apiClient.escapeString(variantDbId.toString()));

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
     * Gets a &#x60;Variant&#x60; by ID.
     * &#x60;GET /variants/{id}&#x60; will return a JSON version of &#x60;Variant&#x60;.
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)

     * @return ApiResponse&lt;VariantSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVariantSingleResponse> variantsVariantDbIdGet(String variantDbId) throws ApiException {
        Call call = variantsVariantDbIdGetCall(variantDbId);
        Type localVarReturnType = new TypeToken<BrAPIVariantSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a &#x60;Variant&#x60; by ID. (asynchronously)
     * &#x60;GET /variants/{id}&#x60; will return a JSON version of &#x60;Variant&#x60;.
     * @param variantDbId The ID of the &#x60;Variant&#x60; to be retrieved. (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call variantsVariantDbIdGetAsync(String variantDbId, final ApiCallback<BrAPIVariantSingleResponse> callback) throws ApiException {
        Call call = variantsVariantDbIdGetCall(variantDbId);
        Type localVarReturnType = new TypeToken<BrAPIVariantSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
