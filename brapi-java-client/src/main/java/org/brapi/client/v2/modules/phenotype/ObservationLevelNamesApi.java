package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import okhttp3.Call;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.v2.model.pheno.BrAPIObservationUnitHierarchyLevel;
import org.brapi.v2.model.pheno.response.BrAPIObservationLevelListResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationLevelSingleResponse;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservationLevelNamesApi {

    private BrAPIClient apiClient;

    public ObservationLevelNamesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObservationLevelNamesApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    private Call observationLevelNamesGetCall(String programDbId, Boolean all, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/observationlevelnames";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (programDbId != null)
            apiClient.prepQueryParameter(localVarQueryParams, "programDbId", programDbId);
        if (all != null) {
            apiClient.prepQueryParameter(localVarQueryParams, "all", all);
        }
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

    public ApiResponse<BrAPIObservationLevelListResponse> observationLevelNamesGet(String programDbId, Boolean all, Integer page, Integer pageSize) throws ApiException {
        Call call = observationLevelNamesGetCall(programDbId, all, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIObservationLevelListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private Call observationLevelNamesPostCall(List<BrAPIObservationUnitHierarchyLevel> body) throws ApiException {
        if(body == null) {throw new IllegalArgumentException("body cannot be null"); }
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/observationlevelnames";

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

    public ApiResponse<BrAPIObservationLevelListResponse> observationLevelNamesPost(List<BrAPIObservationUnitHierarchyLevel> body) throws ApiException {
        Call call = observationLevelNamesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIObservationLevelListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private Call observationLevelNameDbIdPutCall(String levelNameDbId, BrAPIObservationUnitHierarchyLevel body) throws ApiException {
        if(levelNameDbId == null) {
            throw new IllegalArgumentException("levelNameDbId cannot be null");
        }
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/observationlevelnames/{levelNameDbId}"
                .replaceAll("\\{" + "levelNameDbId" + "\\}", apiClient.escapeString(levelNameDbId));

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

    public ApiResponse<BrAPIObservationLevelSingleResponse> observationLevelNameDbIdPut(String levelNameDbId, BrAPIObservationUnitHierarchyLevel body) throws ApiException {
        Call call = observationLevelNameDbIdPutCall(levelNameDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIObservationLevelSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private Call observationLevelNameDbIdDeleteCall(String levelNameDbId) throws ApiException {
        if(levelNameDbId == null) {
            throw new IllegalArgumentException("levelNameDbId cannot be null");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/observationlevelnames/{levelNameDbId}"
                .replaceAll("\\{" + "levelNameDbId" + "\\}", apiClient.escapeString(levelNameDbId));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    public ApiResponse<BrAPIObservationLevelSingleResponse> observationLevelNameDbIdDelete(String levelNameDbId) throws ApiException {
        Call call = observationLevelNameDbIdDeleteCall(levelNameDbId);
        Type localVarReturnType = new TypeToken<BrAPIObservationLevelSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

}
