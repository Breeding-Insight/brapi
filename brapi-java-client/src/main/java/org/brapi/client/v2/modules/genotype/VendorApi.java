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

import okhttp3.Call;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.v2.model.geno.response.BrAPIVendorOrderListResponse;
import org.brapi.v2.model.geno.response.BrAPIVendorOrderStatusResponse;
import org.brapi.v2.model.geno.request.BrAPIVendorOrderSubmissionRequest;
import org.brapi.v2.model.geno.response.BrAPIVendorOrderSubmissionSingleResponse;
import org.brapi.v2.model.geno.response.BrAPIVendorPlateListResponse;
import org.brapi.v2.model.geno.response.BrAPIVendorPlateSubmissionIdSingleResponse;
import org.brapi.v2.model.geno.request.BrAPIVendorPlateSubmissionRequest;
import org.brapi.v2.model.geno.response.BrAPIVendorPlateSubmissionSingleResponse;
import org.brapi.v2.model.geno.response.BrAPIVendorResultFileListResponse;
import org.brapi.v2.model.geno.response.BrAPIVendorSpecificationSingleResponse;

public class VendorApi {
    private BrAPIClient apiClient;

    public VendorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VendorApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for vendorOrdersGet
     * @param orderId The order id returned by the vendor when the order was successfully submitted. From response of \&quot;POST /vendor/orders\&quot; (optional)
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorOrdersGetCall(String orderId, String submissionId, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/orders";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (orderId != null)
            apiClient.prepQueryParameter(localVarQueryParams, "orderId", orderId);
        if (submissionId != null)
            apiClient.prepQueryParameter(localVarQueryParams, "submissionId", submissionId);
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
     * List current available orders
     * List current available orders
     * @param orderId The order id returned by the vendor when the order was successfully submitted. From response of \&quot;POST /vendor/orders\&quot; (optional)
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;VendorOrderListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorOrderListResponse> vendorOrdersGet(String orderId, String submissionId, Integer page, Integer pageSize) throws ApiException {
        Call call = vendorOrdersGetCall(orderId, submissionId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List current available orders (asynchronously)
     * List current available orders
     * @param orderId The order id returned by the vendor when the order was successfully submitted. From response of \&quot;POST /vendor/orders\&quot; (optional)
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (optional)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorOrdersGetAsync(String orderId, String submissionId, Integer page, Integer pageSize, final ApiCallback<BrAPIVendorOrderListResponse> callback) throws ApiException {
        Call call = vendorOrdersGetCall(orderId, submissionId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorOrdersOrderIdPlatesGet
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorOrdersOrderIdPlatesGetCall(String orderId, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/orders/{orderId}/plates"
            .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
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
     * Get the Plates for a specific Order
     * Retrieve the plate and sample details of an order being processed
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;VendorPlateListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorPlateListResponse> vendorOrdersOrderIdPlatesGet(String orderId, Integer page, Integer pageSize) throws ApiException {
        Call call = vendorOrdersOrderIdPlatesGetCall(orderId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Plates for a specific Order (asynchronously)
     * Retrieve the plate and sample details of an order being processed
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorOrdersOrderIdPlatesGetAsync(String orderId, Integer page, Integer pageSize, final ApiCallback<BrAPIVendorPlateListResponse> callback) throws ApiException {
        Call call = vendorOrdersOrderIdPlatesGetCall(orderId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorOrdersOrderIdResultsGet
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorOrdersOrderIdResultsGetCall(String orderId, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/orders/{orderId}/results"
            .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
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
     * Get the results of a specific Order
     * Retrieve the data files generated by the vendors analysis
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;VendorResultFileListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorResultFileListResponse> vendorOrdersOrderIdResultsGet(String orderId, Integer page, Integer pageSize) throws ApiException {
        Call call = vendorOrdersOrderIdResultsGetCall(orderId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorResultFileListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a specific Order (asynchronously)
     * Retrieve the data files generated by the vendors analysis
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorOrdersOrderIdResultsGetAsync(String orderId, Integer page, Integer pageSize, final ApiCallback<BrAPIVendorResultFileListResponse> callback) throws ApiException {
        Call call = vendorOrdersOrderIdResultsGetCall(orderId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIVendorResultFileListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorOrdersOrderIdStatusGet
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorOrdersOrderIdStatusGetCall(String orderId) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/orders/{orderId}/status"
            .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

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
     * Get the status of a specific Order
     * Retrieve the current status of an order being processed
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)

     * @return ApiResponse&lt;VendorOrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorOrderStatusResponse> vendorOrdersOrderIdStatusGet(String orderId) throws ApiException {
        Call call = vendorOrdersOrderIdStatusGetCall(orderId);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the status of a specific Order (asynchronously)
     * Retrieve the current status of an order being processed
     * @param orderId The order id returned by the vendor when the order was successfully submitted. (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorOrdersOrderIdStatusGetAsync(String orderId, final ApiCallback<BrAPIVendorOrderStatusResponse> callback) throws ApiException {
        Call call = vendorOrdersOrderIdStatusGetCall(orderId);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorOrdersPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorOrdersPostCall(BrAPIVendorOrderSubmissionRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vendor/orders";

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
     * Submit New Order
     * Submit a new order to a vendor
     * @param body  (optional)

     * @return ApiResponse&lt;VendorOrderSubmissionSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorOrderSubmissionSingleResponse> vendorOrdersPost(BrAPIVendorOrderSubmissionRequest body) throws ApiException {
        Call call = vendorOrdersPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderSubmissionSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit New Order (asynchronously)
     * Submit a new order to a vendor
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorOrdersPostAsync(BrAPIVendorOrderSubmissionRequest body, final ApiCallback<BrAPIVendorOrderSubmissionSingleResponse> callback) throws ApiException {
        Call call = vendorOrdersPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVendorOrderSubmissionSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorPlatesPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorPlatesPostCall(BrAPIVendorPlateSubmissionRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vendor/plates";

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
     * Submit a new set of Sample data
     * Submit a new set of Sample data
     * @param body  (optional)

     * @return ApiResponse&lt;VendorPlateSubmissionIdSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorPlateSubmissionIdSingleResponse> vendorPlatesPost(BrAPIVendorPlateSubmissionRequest body) throws ApiException {
        Call call = vendorPlatesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateSubmissionIdSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a new set of Sample data (asynchronously)
     * Submit a new set of Sample data
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorPlatesPostAsync(BrAPIVendorPlateSubmissionRequest body, final ApiCallback<BrAPIVendorPlateSubmissionIdSingleResponse> callback) throws ApiException {
        Call call = vendorPlatesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateSubmissionIdSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorPlatesSubmissionIdGet
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorPlatesSubmissionIdGetCall(String submissionId) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/plates/{submissionId}"
            .replaceAll("\\{" + "submissionId" + "\\}", apiClient.escapeString(submissionId.toString()));

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
     * Get the data for a submitted set of plates
     * Get data for a submitted set of plates
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (required)

     * @return ApiResponse&lt;VendorPlateSubmissionSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorPlateSubmissionSingleResponse> vendorPlatesSubmissionIdGet(String submissionId) throws ApiException {
        Call call = vendorPlatesSubmissionIdGetCall(submissionId);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateSubmissionSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the data for a submitted set of plates (asynchronously)
     * Get data for a submitted set of plates
     * @param submissionId The submission id returned by the vendor when a set of plates was successfully submitted. From response of \&quot;POST /vendor/plates\&quot; (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorPlatesSubmissionIdGetAsync(String submissionId, final ApiCallback<BrAPIVendorPlateSubmissionSingleResponse> callback) throws ApiException {
        Call call = vendorPlatesSubmissionIdGetCall(submissionId);
        Type localVarReturnType = new TypeToken<BrAPIVendorPlateSubmissionSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for vendorSpecificationsGet



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call vendorSpecificationsGetCall() throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendor/specifications";

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
     * Get the Vendor Specifications
     * Defines the plate format specification for the vendor.

     * @return ApiResponse&lt;VendorSpecificationSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIVendorSpecificationSingleResponse> vendorSpecificationsGet() throws ApiException {
        Call call = vendorSpecificationsGetCall();
        Type localVarReturnType = new TypeToken<BrAPIVendorSpecificationSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Vendor Specifications (asynchronously)
     * Defines the plate format specification for the vendor.

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call vendorSpecificationsGetAsync(final ApiCallback<BrAPIVendorSpecificationSingleResponse> callback) throws ApiException {
        Call call = vendorSpecificationsGetCall();
        Type localVarReturnType = new TypeToken<BrAPIVendorSpecificationSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
