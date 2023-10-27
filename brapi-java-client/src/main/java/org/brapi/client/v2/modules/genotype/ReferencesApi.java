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
import org.brapi.client.v2.model.queryParams.genotype.ReferenceQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.geno.response.BrAPIReferenceBasesResponse;
import org.brapi.v2.model.geno.response.BrAPIReferenceSingleResponse;
import org.brapi.v2.model.geno.response.BrAPIReferencesListResponse;
import org.brapi.v2.model.geno.request.BrAPIReferencesSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;

public class ReferencesApi {
    private BrAPIClient apiClient;

    public ReferencesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReferencesApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for referencesGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call referencesGetCall(ReferenceQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/references";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.referenceDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "referenceDbId", queryParams.referenceDbId());
        if (queryParams.referenceSetDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "referenceSetDbId", queryParams.referenceSetDbId());
        if (queryParams.accession() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "accession", queryParams.accession());
        if (queryParams.md5checksum() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "md5checksum", queryParams.md5checksum());
        if (queryParams.isDerived() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "isDerived", queryParams.isDerived());
        if (queryParams.minLength() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "minLength", queryParams.minLength());
        if (queryParams.maxLength() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "maxLength", queryParams.maxLength());
        if (queryParams.page() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", queryParams.page());
        if (queryParams.pageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", queryParams.pageSize());
        if (queryParams.commonCropName() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "commonCropName", queryParams.commonCropName());
        if (queryParams.programDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "programDbId", queryParams.programDbId());
        if (queryParams.trialDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "trialDbId", queryParams.trialDbId());
        if (queryParams.studyDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "studyDbId", queryParams.studyDbId());
        if (queryParams.externalReferenceId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceId", queryParams.externalReferenceId());
        if (queryParams.externalReferenceSource() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceSource", queryParams.externalReferenceSource());

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
     * Gets a filtered list of &#x60;Reference&#x60; objects.
     * &#x60;GET /references&#x60; will return a filtered list of &#x60;Reference&#x60; JSON objects.
     * @param queryParams
     * @return ApiResponse&lt;ReferencesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIReferencesListResponse> referencesGet(ReferenceQueryParams queryParams) throws ApiException {
        Call call = referencesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of &#x60;Reference&#x60; objects. (asynchronously)
     * &#x60;GET /references&#x60; will return a filtered list of &#x60;Reference&#x60; JSON objects.
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call referencesGetAsync(ReferenceQueryParams queryParams, final ApiCallback<BrAPIReferencesListResponse> callback) throws ApiException {
        Call call = referencesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for referencesReferenceDbIdBasesGet
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)
     * @param start The start position (0-based) of this query. Defaults to 0. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0). (optional)
     * @param end The end position (0-based, exclusive) of this query. Defaults to the length of this &#x60;Reference&#x60;. (optional)
     * @param pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of &#x60;next_page_token&#x60; from the previous response. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call referencesReferenceDbIdBasesGetCall(String referenceDbId, Integer start, Integer end, String pageToken) throws ApiException {
        if(referenceDbId == null) {
            throw new IllegalArgumentException("referenceDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/references/{referenceDbId}/bases"
            .replaceAll("\\{" + "referenceDbId" + "\\}", apiClient.escapeString(referenceDbId));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (start != null)
            apiClient.prepQueryParameter(localVarQueryParams, "start", start);
        if (end != null)
            apiClient.prepQueryParameter(localVarQueryParams, "end", end);
        if (pageToken != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageToken", pageToken);

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
     * Lists &#x60;Reference&#x60; bases by ID and optional range.
     * Lists &#x60;Reference&#x60; bases by ID and optional range.
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)
     * @param start The start position (0-based) of this query. Defaults to 0. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0). (optional)
     * @param end The end position (0-based, exclusive) of this query. Defaults to the length of this &#x60;Reference&#x60;. (optional)
     * @param pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of &#x60;next_page_token&#x60; from the previous response. (optional)

     * @return ApiResponse&lt;ReferenceBasesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIReferenceBasesResponse> referencesReferenceDbIdBasesGet(String referenceDbId, Integer start, Integer end, String pageToken) throws ApiException {
        Call call = referencesReferenceDbIdBasesGetCall(referenceDbId, start, end, pageToken);
        Type localVarReturnType = new TypeToken<BrAPIReferenceBasesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists &#x60;Reference&#x60; bases by ID and optional range. (asynchronously)
     * Lists &#x60;Reference&#x60; bases by ID and optional range.
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)
     * @param start The start position (0-based) of this query. Defaults to 0. Genomic positions are non-negative integers less than reference length. Requests spanning the join of circular genomes are represented as two requests one on each side of the join (position 0). (optional)
     * @param end The end position (0-based, exclusive) of this query. Defaults to the length of this &#x60;Reference&#x60;. (optional)
     * @param pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of &#x60;next_page_token&#x60; from the previous response. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call referencesReferenceDbIdBasesGetAsync(String referenceDbId, Integer start, Integer end, String pageToken, final ApiCallback<BrAPIReferenceBasesResponse> callback) throws ApiException {
        Call call = referencesReferenceDbIdBasesGetCall(referenceDbId, start, end, pageToken);
        Type localVarReturnType = new TypeToken<BrAPIReferenceBasesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for referencesReferenceDbIdGet
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call referencesReferenceDbIdGetCall(String referenceDbId) throws ApiException {
        if(referenceDbId == null) {
            throw new IllegalArgumentException("referenceDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/references/{referenceDbId}"
            .replaceAll("\\{" + "referenceDbId" + "\\}", apiClient.escapeString(referenceDbId));

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
     * Gets a &#x60;Reference&#x60; by ID.
     * &#x60;GET /references/{reference_id}&#x60; will return a JSON version of &#x60;Reference&#x60;.
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)

     * @return ApiResponse&lt;ReferenceSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIReferenceSingleResponse> referencesReferenceDbIdGet(String referenceDbId) throws ApiException {
        Call call = referencesReferenceDbIdGetCall(referenceDbId);
        Type localVarReturnType = new TypeToken<BrAPIReferenceSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a &#x60;Reference&#x60; by ID. (asynchronously)
     * &#x60;GET /references/{reference_id}&#x60; will return a JSON version of &#x60;Reference&#x60;.
     * @param referenceDbId The ID of the &#x60;Reference&#x60; to be retrieved. (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call referencesReferenceDbIdGetAsync(String referenceDbId, final ApiCallback<BrAPIReferenceSingleResponse> callback) throws ApiException {
        Call call = referencesReferenceDbIdGetCall(referenceDbId);
        Type localVarReturnType = new TypeToken<BrAPIReferenceSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchReferencesPost
     * @param body References Search request (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchReferencesPostCall(BrAPIReferencesSearchRequest body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/references";

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
     * Gets a list of &#x60;Reference&#x60; matching the search criteria.
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     * @param body References Search request (optional)

     * @return ApiResponse&lt;ReferencesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pair<Optional<BrAPIReferencesListResponse>, Optional<BrAPIAcceptedSearchResponse>>> searchReferencesPost(BrAPIReferencesSearchRequest body) throws ApiException {
        Call call = searchReferencesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        return apiClient.executeSearch(call, localVarReturnType);
    }

    /**
     * Gets a list of &#x60;Reference&#x60; matching the search criteria. (asynchronously)
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     * @param body References Search request (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchReferencesPostAsync(BrAPIReferencesSearchRequest body, final ApiCallback<BrAPIReferencesListResponse> callback) throws ApiException {
        Call call = searchReferencesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchReferencesSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchReferencesSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        if(searchResultsDbId == null) {
            throw new IllegalArgumentException("searchResultsDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/references/{searchResultsDbId}"
            .replaceAll("\\{" + "searchResultsDbId" + "\\}", apiClient.escapeString(searchResultsDbId));

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
     * Gets a list of &#x60;Reference&#x60; matching the search criteria.
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;ReferencesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pair<Optional<BrAPIReferencesListResponse>, Optional<BrAPIAcceptedSearchResponse>>> searchReferencesSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Call call = searchReferencesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        return apiClient.executeSearch(call, localVarReturnType);
    }

    /**
     * Gets a list of &#x60;Reference&#x60; matching the search criteria. (asynchronously)
     * &#x60;POST /references/search&#x60; must accept a JSON version of &#x60;SearchReferencesRequest&#x60; as the post body and will return a JSON version of &#x60;SearchReferencesResponse&#x60;.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchReferencesSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, final ApiCallback<BrAPIReferencesListResponse> callback) throws ApiException {
        Call call = searchReferencesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIReferencesListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
