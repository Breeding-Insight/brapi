/*
 * BrAPI-Genotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.genotype;

import com.google.gson.reflect.TypeToken;
import okhttp3.Call;
import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.genotype.AlleleMatrixQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.geno.request.BrAPIAlleleMatrixSearchRequest;
import org.brapi.v2.model.geno.response.BrAPIAlleleMatrixResponse;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AlleleMatrixApi {
    private BrAPIClient apiClient;

    public AlleleMatrixApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlleleMatrixApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for allelematrixGet
     *
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call allelematrixGetCall(AlleleMatrixQueryParams queryParams) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/allelematrix";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        if (queryParams.dimensionVariantPage() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dimensionVariantPage", queryParams.dimensionVariantPage());
        if (queryParams.dimensionVariantPageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dimensionVariantPageSize", queryParams.dimensionVariantPageSize());
        if (queryParams.dimensionCallSetPage() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dimensionCallSetPage", queryParams.dimensionCallSetPage());
        if (queryParams.dimensionCallSetPageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dimensionCallSetPageSize", queryParams.dimensionCallSetPageSize());
        if (queryParams.preview() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "preview", queryParams.preview());
        if (queryParams.dataMatrixNames() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dataMatrixNames", queryParams.dataMatrixNames());
        if (queryParams.dataMatrixAbbreviations() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dataMatrixAbbreviations", queryParams.dataMatrixAbbreviations());
        if (queryParams.positionRange() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "positionRange", queryParams.positionRange());
        if (queryParams.germplasmDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmDbId", queryParams.germplasmDbId());
        if (queryParams.germplasmName() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmName", queryParams.germplasmName());
        if (queryParams.germplasmPUI() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmPUI", queryParams.germplasmPUI());
        if (queryParams.callSetDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "callSetDbId", queryParams.callSetDbId());
        if (queryParams.variantDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "variantDbId", queryParams.variantDbId());
        if (queryParams.variantSetDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "variantSetDbId", queryParams.variantSetDbId());
        if (queryParams.expandHomozygotes() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "expandHomozygotes", queryParams.expandHomozygotes());
        if (queryParams.unknownString() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "unknownString", queryParams.unknownString());
        if (queryParams.sepPhased() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "sepPhased", queryParams.sepPhased());
        if (queryParams.sepUnphased() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "sepUnphased", queryParams.sepUnphased());
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
        if (queryParams.page() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", queryParams.page());
        if (queryParams.pageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", queryParams.pageSize());

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"AuthorizationToken"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF file format,  but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in,  without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.
     *
     * @return ApiResponse&lt;AlleleMatrixResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIAlleleMatrixResponse> allelematrixGet(AlleleMatrixQueryParams queryParams) throws ApiException {
        Call call = allelematrixGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF file format,  but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in,  without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.
     *
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call allelematrixGetAsync(AlleleMatrixQueryParams queryParams, final ApiCallback<BrAPIAlleleMatrixResponse> callback) throws ApiException {
        Call call = allelematrixGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for searchAllelematrixPost
     *
     * @param body                    Study Search request (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchAllelematrixPostCall(BrAPIAlleleMatrixSearchRequest body) throws ApiException {

        // create path and map variables
        String localVarPath = "/search/allelematrix";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

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

        String[] localVarAuthNames = new String[]{"AuthorizationToken"};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, body, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }


    /**
     * Submit a search request for a Allele Matrix
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF format, but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in, without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.  &lt;br/&gt;Search requests allow a client to send a complex query for data. However, the server may not respond with the search results immediately. If a server needs more time to process the request, it might respond with a &#x60;searchResultsDbId&#x60;. Use the corresponding &#x60;GET /search/calls/{searchResultsDbId}&#x60; to retrieve the results of the search.  &lt;br/&gt;Review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;<a href="https://wiki.brapi.org/index.php/Search_Services#POST_Search_Entity">...</a>\&quot;&gt;Search Services documentation&lt;/a&gt; for additional implementation details.
     *
     * @param body          Study Search request (optional)
     * @return ApiResponse&lt;AlleleMatrixResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pair<Optional<BrAPIAlleleMatrixResponse>, Optional<BrAPIAcceptedSearchResponse>>> searchAllelematrixPost(BrAPIAlleleMatrixSearchRequest body) throws ApiException {
        Call call = searchAllelematrixPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a search request for a Allele Matrix (asynchronously)
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF format, but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in, without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.  &lt;br/&gt;Search requests allow a client to send a complex query for data. However, the server may not respond with the search results immediately. If a server needs more time to process the request, it might respond with a &#x60;searchResultsDbId&#x60;. Use the corresponding &#x60;GET /search/calls/{searchResultsDbId}&#x60; to retrieve the results of the search.  &lt;br/&gt;Review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;<a href="https://wiki.brapi.org/index.php/Search_Services#POST_Search_Entity">...</a>\&quot;&gt;Search Services documentation&lt;/a&gt; for additional implementation details.
     *
     * @param body          Study Search request (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchAllelematrixPostAsync(BrAPIAlleleMatrixSearchRequest body, final ApiCallback<BrAPIAlleleMatrixResponse> callback) throws ApiException {
        Call call = searchAllelematrixPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for searchAllelematrixSearchResultsDbIdGet
     *
     * @param searchResultsDbId       Unique identifier which references the search results (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchAllelematrixSearchResultsDbIdGetCall(String searchResultsDbId) throws ApiException {
        if (searchResultsDbId == null) {
            throw new ApiException("Missing the required parameter 'searchResultsDbId' when calling searchAllelematrixSearchResultsDbIdGet(Async)");
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/search/allelematrix/{searchResultsDbId}"
                .replaceAll("\\{" + "searchResultsDbId" + "}", apiClient.escapeString(searchResultsDbId));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"AuthorizationToken"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the results of a Allele Matrix search request
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF format, but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in, without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.  &lt;br/&gt;Clients should submit a search request using the corresponding &#x60;POST /search/allelematrix&#x60; endpoint. Search requests allow a client to send a complex query for data. However, the server may not respond with the search results immediately. If a server needs more time to process the request, it might respond with a &#x60;searchResultsDbId&#x60;. Use this endpoint to retrieve the results of the search.  &lt;br/&gt;Review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;<a href="https://wiki.brapi.org/index.php/Search_Services#POST_Search_Entity">...</a>\&quot;&gt;Search Services documentation&lt;/a&gt; for additional implementation details.
     *
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @return ApiResponse&lt;AlleleMatrixResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIAlleleMatrixResponse> searchAllelematrixSearchResultsDbIdGet(String searchResultsDbId) throws ApiException {
        Call call = searchAllelematrixSearchResultsDbIdGetCall(searchResultsDbId);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a Allele Matrix search request (asynchronously)
     * Use this endpoint to retrieve a two dimensional matrix of genotype data. The response structure is based on the VCF format, but the search and filter parameters give the ability to slice and merge data sets. This allows the user to return the subset of data they are interested in, without having to download the entire genotype file. &lt;br/&gt;Each row of data (outer array) corresponds to a variant definition, and each column (inner array) corresponds to a callSet.  &lt;br/&gt;Clients should submit a search request using the corresponding &#x60;POST /search/allelematrix&#x60; endpoint. Search requests allow a client to send a complex query for data. However, the server may not respond with the search results immediately. If a server needs more time to process the request, it might respond with a &#x60;searchResultsDbId&#x60;. Use this endpoint to retrieve the results of the search.  &lt;br/&gt;Review the &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;<a href="https://wiki.brapi.org/index.php/Search_Services#POST_Search_Entity">...</a>\&quot;&gt;Search Services documentation&lt;/a&gt; for additional implementation details.
     *
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param callback          The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchAllelematrixSearchResultsDbIdGetAsync(String searchResultsDbId, final ApiCallback<BrAPIAlleleMatrixResponse> callback) throws ApiException {
        Call call = searchAllelematrixSearchResultsDbIdGetCall(searchResultsDbId);
        Type localVarReturnType = new TypeToken<BrAPIAlleleMatrixResponse>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
