package org.brapi.client.v2.modules.core;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.core.BrAPIBatchDelete;
import org.brapi.v2.model.core.response.BatchDeleteSingleResponse;
import org.brapi.v2.model.core.response.BatchDeleteListResponse;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;

public class BatchDeletesApi {
    private BrAPIClient apiClient;

    public BatchDeletesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchDeletesApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for batchDeleteBatchDeleteDbIdGet
     * @param batchDeleteDbId The internal id of the batchDelete (required)


     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call batchDeleteBatchDeleteDbIdGetCall(String batchDeleteDbId) throws ApiException {
        if(batchDeleteDbId == null) {
            throw new IllegalArgumentException("batchDeleteDbId cannot be null");
        }
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/batchDeletes/{batchDeleteDbId}"
                .replaceAll("\\{" + "batchDeleteDbId" + "\\}", apiClient.escapeString(batchDeleteDbId));

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
     * Get the details of a specific batchDelete
     * @param batchDeleteDbId The internal id of the batch delete (required)

     * @return ApiResponse&lt;BatchDeleteSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchDeleteSingleResponse> batchDeleteBatchDeleteDbIdGet(String batchDeleteDbId) throws ApiException {
        Call call = batchDeleteBatchDeleteDbIdGetCall(batchDeleteDbId);
        Type localVarReturnType = new TypeToken<BatchDeleteSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details of a specific batch delete (asynchronously)
     * @param batchDeleteDbId The internal id of the batch delete (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call batchDeletebatchDeleteDbIdGetAsync(String batchDeleteDbId, final ApiCallback<BatchDeleteSingleResponse> callback) throws ApiException {
        Call call = batchDeleteBatchDeleteDbIdGetCall(batchDeleteDbId);
        Type localVarReturnType = new TypeToken<BatchDeleteSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for batchDeleteBatchDeleteDbIdPut
     * @param batchDeleteDbId The internal id of the batch delete (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call batchDeleteBatchDeleteDbIdPutCall(String batchDeleteDbId, BrAPIBatchDelete body) throws ApiException {
        if(batchDeleteDbId == null) {
            throw new IllegalArgumentException("batchDeleteDbId cannot be null");
        }
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/batchdeletes/{batchDeleteDbId}"
                .replaceAll("\\{" + "batchDeleteDbId" + "\\}", apiClient.escapeString(batchDeleteDbId));

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
     * Update the details of an existing batch delete
     * @param batchDeleteDbId The internal id of the batch delete (required)
     * @param body  (optional)
     * @return ApiResponse&lt;BatchDeleteSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchDeleteSingleResponse> batchDeleteBatchDeleteDbIdPut(String batchDeleteDbId, BrAPIBatchDelete body) throws ApiException {
        Call call = batchDeleteBatchDeleteDbIdPutCall(batchDeleteDbId, body);
        Type localVarReturnType = new TypeToken<BatchDeleteSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the details of an existing batch delete (asynchronously)
     * @param batchDeleteDbId The internal id of the batch delete(required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call batchDeleteBatchDeleteDbIdPutAsync(String batchDeleteDbId, BrAPIBatchDelete body, final ApiCallback<BatchDeleteSingleResponse> callback) throws ApiException {
        Call call = batchDeleteBatchDeleteDbIdPutCall(batchDeleteDbId, body);
        Type localVarReturnType = new TypeToken<BatchDeleteSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for batchDeletePost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call batchDeletePostCall(List<BrAPIBatchDelete> body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/batchdeletes";

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
     * Create new batch delete entities on this server
     * @param body  (optional)

     * @return ApiResponse&lt;BatchDeleteListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchDeleteListResponse> batchDeletePost(List<BrAPIBatchDelete> body) throws ApiException {
        Call call = batchDeletePostCall(body);
        Type localVarReturnType = new TypeToken<BatchDeleteListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new batch delete entities on this server (asynchronously)
     * Create new batch delete entities on this server
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call batchDeletePostAsync(List<BrAPIBatchDelete> body, final ApiCallback<BatchDeleteListResponse> callback) throws ApiException {
        Call call = batchDeletePostCall(body);
        Type localVarReturnType = new TypeToken<BatchDeleteListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /*
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call batchDeletesDeleteByDbIdCall(String batchDeleteDbId, boolean hardDelete) throws ApiException {
        if(batchDeleteDbId == null) {
            throw new IllegalArgumentException("batchDeleteDbId cannot be null");
        }
        Object localVarPostBody = null;

        String localVarPath = String.format("/batchDeletes/%s?hardDelete=%s",apiClient.escapeString(batchDeleteDbId), hardDelete);

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Delete
     * @param batchDeleteDbId Unique identifier which references batch delete to be deleted
     * @param hardDelete Indicates whether delete is a hard or soft delete

     * @return ApiResponse;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> batchDeletesDeleteByDbId(String batchDeleteDbId, boolean hardDelete) throws ApiException {
        Call call = batchDeletesDeleteByDbIdCall(batchDeleteDbId, hardDelete);
        return apiClient.execute(call);
    }

}
