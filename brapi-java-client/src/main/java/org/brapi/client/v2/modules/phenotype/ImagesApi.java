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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.ImageQueryParams;
import org.brapi.v2.model.pheno.BrAPIImage;
import org.brapi.v2.model.pheno.response.BrAPIImageListResponse;
import org.brapi.v2.model.pheno.request.BrAPIImageSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIImageSingleResponse;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;

public class ImagesApi {
    private BrAPIClient apiClient;

    public ImagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImagesApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for imagesGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call imagesGetCall(ImageQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
        	throw new IllegalArgumentException("queryParams cannot be null");
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/images";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.imageDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "imageDbId", queryParams.imageDbId());
        if (queryParams.imageName() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "imageName", queryParams.imageName());
        if (queryParams.observationUnitDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "observationUnitDbId", queryParams.observationUnitDbId());
        if (queryParams.observationDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "observationDbId", queryParams.observationDbId());
        if (queryParams.descriptiveOntologyTerm() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "descriptiveOntologyTerm", queryParams.descriptiveOntologyTerm());
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
     * Get the image meta data summaries
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param queryParams
     * @return ApiResponse&lt;ImageListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageListResponse> imagesGet(ImageQueryParams queryParams) throws ApiException {
        Call call = imagesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the image meta data summaries (asynchronously)
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call imagesGetAsync(ImageQueryParams queryParams, final ApiCallback<BrAPIImageListResponse> callback) throws ApiException {
        Call call = imagesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imagesImageDbIdGet
     * @param imageDbId The unique identifier for a image (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call imagesImageDbIdGetCall(String imageDbId) throws ApiException {
        if(imageDbId == null) {
        	throw new IllegalArgumentException("imageDbId cannot be null");
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/images/{imageDbId}"
            .replaceAll("\\{" + "imageDbId" + "\\}", apiClient.escapeString(imageDbId.toString()));

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
     * Get the an image meta data summary
     * Get one image meta data object  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param imageDbId The unique identifier for a image (required)

     * @return ApiResponse&lt;ImageSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageSingleResponse> imagesImageDbIdGet(String imageDbId) throws ApiException {
        Call call = imagesImageDbIdGetCall(imageDbId);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the an image meta data summary (asynchronously)
     * Get one image meta data object  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param imageDbId The unique identifier for a image (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call imagesImageDbIdGetAsync(String imageDbId, final ApiCallback<BrAPIImageSingleResponse> callback) throws ApiException {
        Call call = imagesImageDbIdGetCall(imageDbId);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imagesImageDbIdImagecontentPut
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call imagesImageDbIdImagecontentPutCall(String imageDbId, Object body) throws ApiException {
        if(imageDbId == null) {
        	throw new IllegalArgumentException("imageDbId cannot be null");
        }
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/images/{imageDbId}/imagecontent"
            .replaceAll("\\{" + "imageDbId" + "\\}", apiClient.escapeString(imageDbId.toString()));

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
            "image/_*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Update an image with the image file content
     * Update an image with the image file content  Implementation Notes  - This call should be paired with &#x27;PUT /images/{imageDbId}&#x27; for full capability  - A server may choose to modify the image meta data object based on the actually image which has been uploaded.   - Image data may be stored in a database or file system. Servers should generate and provide the \&quot;imageURL\&quot; for retrieving the image, wherever it happens to live.
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)

     * @return ApiResponse&lt;ImageSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageSingleResponse> imagesImageDbIdImagecontentPut(String imageDbId, Object body) throws ApiException {
        Call call = imagesImageDbIdImagecontentPutCall(imageDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an image with the image file content (asynchronously)
     * Update an image with the image file content  Implementation Notes  - This call should be paired with &#x27;PUT /images/{imageDbId}&#x27; for full capability  - A server may choose to modify the image meta data object based on the actually image which has been uploaded.   - Image data may be stored in a database or file system. Servers should generate and provide the \&quot;imageURL\&quot; for retrieving the image, wherever it happens to live.
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call imagesImageDbIdImagecontentPutAsync(String imageDbId, Object body, final ApiCallback<BrAPIImageSingleResponse> callback) throws ApiException {
        Call call = imagesImageDbIdImagecontentPutCall(imageDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imagesImageDbIdPut
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call imagesImageDbIdPutCall(String imageDbId, BrAPIImage body) throws ApiException {
        if(imageDbId == null) {
        	throw new IllegalArgumentException("imageDbId cannot be null");
        }
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/images/{imageDbId}"
            .replaceAll("\\{" + "imageDbId" + "\\}", apiClient.escapeString(imageDbId.toString()));

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
     * Update an image meta data
     * Update an image meta data object  Implementation Notes  - This call should be paired with &#x27;PUT /images/{imageDbId}/imagecontent&#x27; for full capability  - A server may choose to modify the image meta data object based on the actually image which has been uploaded.   - Image data may be stored in a database or file system. Servers should generate and provide the \&quot;imageURL\&quot; as an absolute path for retrieving the image, wherever it happens to live.   - &#x27;descriptiveOntologyTerm&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;s.   - The &#x27;/images&#x27; calls support a GeoJSON object structure for describing their location. The BrAPI spec for GeoJSON only supports two of the possible geometries: Points and Polygons.   - With most images, the Point geometry should be used, and it should indicate the longitude and latitude of the camera.   - For top down images (ie from drones, cranes, etc), the Point geometry may be used to indicate the longitude and latitude of the centroid of the image content, and the Polygon geometry may be used to indicate the border of the image content.
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)

     * @return ApiResponse&lt;ImageSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageSingleResponse> imagesImageDbIdPut(String imageDbId, BrAPIImage body) throws ApiException {
        Call call = imagesImageDbIdPutCall(imageDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an image meta data (asynchronously)
     * Update an image meta data object  Implementation Notes  - This call should be paired with &#x27;PUT /images/{imageDbId}/imagecontent&#x27; for full capability  - A server may choose to modify the image meta data object based on the actually image which has been uploaded.   - Image data may be stored in a database or file system. Servers should generate and provide the \&quot;imageURL\&quot; as an absolute path for retrieving the image, wherever it happens to live.   - &#x27;descriptiveOntologyTerm&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;s.   - The &#x27;/images&#x27; calls support a GeoJSON object structure for describing their location. The BrAPI spec for GeoJSON only supports two of the possible geometries: Points and Polygons.   - With most images, the Point geometry should be used, and it should indicate the longitude and latitude of the camera.   - For top down images (ie from drones, cranes, etc), the Point geometry may be used to indicate the longitude and latitude of the centroid of the image content, and the Polygon geometry may be used to indicate the border of the image content.
     * @param imageDbId The unique identifier for a image (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call imagesImageDbIdPutAsync(String imageDbId, BrAPIImage body, final ApiCallback<BrAPIImageSingleResponse> callback) throws ApiException {
        Call call = imagesImageDbIdPutCall(imageDbId, body);
        Type localVarReturnType = new TypeToken<BrAPIImageSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imagesPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call imagesPostCall(List<BrAPIImage> body) throws ApiException {
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/images";

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
     * Create new image meta data objects
     * Create new image meta data objects  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.  - The &#x27;/images&#x27; calls support a GeoJSON object structure for describing their location. The BrAPI spec for GeoJSON only supports two of the possible geometries: Points and Polygons.  - With most images, the Point geometry should be used, and it should indicate the longitude and latitude of the camera.  - For top down images (ie from drones, cranes, etc), the Point geometry may be used to indicate the longitude and latitude of the centroid of the image content, and the Polygon geometry may be used to indicate the border of the image content. &#x27;
     * @param body  (optional)

     * @return ApiResponse&lt;ImageListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageListResponse> imagesPost(List<BrAPIImage> body) throws ApiException {
        Call call = imagesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new image meta data objects (asynchronously)
     * Create new image meta data objects  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.  - The &#x27;/images&#x27; calls support a GeoJSON object structure for describing their location. The BrAPI spec for GeoJSON only supports two of the possible geometries: Points and Polygons.  - With most images, the Point geometry should be used, and it should indicate the longitude and latitude of the camera.  - For top down images (ie from drones, cranes, etc), the Point geometry may be used to indicate the longitude and latitude of the centroid of the image content, and the Polygon geometry may be used to indicate the border of the image content. &#x27;
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call imagesPostAsync(List<BrAPIImage> body, final ApiCallback<BrAPIImageListResponse> callback) throws ApiException {
        Call call = imagesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchImagesPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchImagesPostCall(BrAPIImageSearchRequest body) throws ApiException {
        if(body == null) {
        	throw new IllegalArgumentException("body cannot be null");
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/images";

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
     * Submit a search request for Images
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;descriptiveOntologyTerm&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;s.  See Search Services for additional implementation details.
     * @param body  (optional)

     * @return ApiResponse&lt;ImageListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageListResponse> searchImagesPost(BrAPIImageSearchRequest body) throws ApiException {
        Call call = searchImagesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a search request for Images (asynchronously)
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;descriptiveOntologyTerm&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;s.  See Search Services for additional implementation details.
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchImagesPostAsync(BrAPIImageSearchRequest body, final ApiCallback<BrAPIImageListResponse> callback) throws ApiException {
        Call call = searchImagesPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchImagesSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchImagesSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        if(searchResultsDbId == null) {
        	throw new IllegalArgumentException("searchResultsDbId cannot be null");
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/images/{searchResultsDbId}"
            .replaceAll("\\{" + "searchResultsDbId" + "\\}", apiClient.escapeString(searchResultsDbId.toString()));

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
     * Get the results of an Images search request
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;ImageListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIImageListResponse> searchImagesSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Call call = searchImagesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of an Images search request (asynchronously)
     * Get filtered set of image meta data  Implementation Notes  - &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the location of the image. There is no BrAPI call for retrieving the image content, so it could be on a different path, or a different host.  - &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for the image. These could be simple descriptive words, or ontology references, or full ontology URI&#x27;&#x27;s.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchImagesSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, final ApiCallback<BrAPIImageListResponse> callback) throws ApiException {
        Call call = searchImagesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPIImageListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
