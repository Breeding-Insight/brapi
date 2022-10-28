/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.phenotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SearchImagesBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class SearchImagesBody {
    @SerializedName("commonCropNames")
    private List<String> commonCropNames = null;

    @SerializedName("descriptiveOntologyTerms")
    private List<String> descriptiveOntologyTerms = null;

    @SerializedName("externalReferenceIDs")
    private List<String> externalReferenceIDs = null;

    @SerializedName("externalReferenceIds")
    private List<String> externalReferenceIds = null;

    @SerializedName("externalReferenceSources")
    private List<String> externalReferenceSources = null;

    @SerializedName("imageDbIds")
    private List<String> imageDbIds = null;

    @SerializedName("imageFileNames")
    private List<String> imageFileNames = null;

    @SerializedName("imageFileSizeMax")
    private Integer imageFileSizeMax = null;

    @SerializedName("imageFileSizeMin")
    private Integer imageFileSizeMin = null;

    @SerializedName("imageHeightMax")
    private Integer imageHeightMax = null;

    @SerializedName("imageHeightMin")
    private Integer imageHeightMin = null;

    @SerializedName("imageLocation")
    private GeoJSONSearchArea imageLocation = null;

    @SerializedName("imageNames")
    private List<String> imageNames = null;

    @SerializedName("imageTimeStampRangeEnd")
    private OffsetDateTime imageTimeStampRangeEnd = null;

    @SerializedName("imageTimeStampRangeStart")
    private OffsetDateTime imageTimeStampRangeStart = null;

    @SerializedName("imageWidthMax")
    private Integer imageWidthMax = null;

    @SerializedName("imageWidthMin")
    private Integer imageWidthMin = null;

    @SerializedName("mimeTypes")
    private List<String> mimeTypes = null;

    @SerializedName("observationDbIds")
    private List<String> observationDbIds = null;

    @SerializedName("observationUnitDbIds")
    private List<String> observationUnitDbIds = null;

    @SerializedName("page")
    private Integer page = null;

    @SerializedName("pageSize")
    private Integer pageSize = null;

    @SerializedName("programDbIds")
    private List<String> programDbIds = null;

    @SerializedName("programNames")
    private List<String> programNames = null;

    public SearchImagesBody commonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
        return this;
    }

    public SearchImagesBody addCommonCropNamesItem(String commonCropNamesItem) {
        if (this.commonCropNames == null) {
            this.commonCropNames = new ArrayList<String>();
        }
        this.commonCropNames.add(commonCropNamesItem);
        return this;
    }

    /**
     * The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use &#x60;GET /commoncropnames&#x60; to find the list of available crops on a server.
     *
     * @return commonCropNames
     **/
    @Schema(example = "[\"Tomatillo\",\"Paw Paw\"]", description = "The BrAPI Common Crop Name is the simple, generalized, widely accepted name of the organism being researched. It is most often used in multi-crop systems where digital resources need to be divided at a high level. Things like 'Maize', 'Wheat', and 'Rice' are examples of common crop names.  Use this parameter to only return results associated with the given crops.   Use `GET /commoncropnames` to find the list of available crops on a server.")
    public List<String> getCommonCropNames() {
        return commonCropNames;
    }

    public void setCommonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
    }

    public SearchImagesBody descriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
        this.descriptiveOntologyTerms = descriptiveOntologyTerms;
        return this;
    }

    public SearchImagesBody addDescriptiveOntologyTermsItem(String descriptiveOntologyTermsItem) {
        if (this.descriptiveOntologyTerms == null) {
            this.descriptiveOntologyTerms = new ArrayList<String>();
        }
        this.descriptiveOntologyTerms.add(descriptiveOntologyTermsItem);
        return this;
    }

    /**
     * A list of terms to formally describe the image to search for. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.
     *
     * @return descriptiveOntologyTerms
     **/
    @Schema(example = "[\"doi:10.1002/0470841559\",\"Red\",\"ncbi:0300294\"]", description = "A list of terms to formally describe the image to search for. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.")
    public List<String> getDescriptiveOntologyTerms() {
        return descriptiveOntologyTerms;
    }

    public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
        this.descriptiveOntologyTerms = descriptiveOntologyTerms;
    }

    public SearchImagesBody externalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
        return this;
    }

    public SearchImagesBody addExternalReferenceIDsItem(String externalReferenceIDsItem) {
        if (this.externalReferenceIDs == null) {
            this.externalReferenceIDs = new ArrayList<String>();
        }
        this.externalReferenceIDs.add(externalReferenceIDsItem);
        return this;
    }

    /**
     * **Deprecated in v2.1** Please use &#x60;externalReferenceIds&#x60;. Github issue number #460  &lt;br&gt;List of external reference IDs. Could be a simple strings or a URIs. (use with &#x60;externalReferenceSources&#x60; parameter)
     *
     * @return externalReferenceIDs
     **/
    @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "**Deprecated in v2.1** Please use `externalReferenceIds`. Github issue number #460  <br>List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
    public List<String> getExternalReferenceIDs() {
        return externalReferenceIDs;
    }

    public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
    }

    public SearchImagesBody externalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
        return this;
    }

    public SearchImagesBody addExternalReferenceIdsItem(String externalReferenceIdsItem) {
        if (this.externalReferenceIds == null) {
            this.externalReferenceIds = new ArrayList<String>();
        }
        this.externalReferenceIds.add(externalReferenceIdsItem);
        return this;
    }

    /**
     * List of external reference IDs. Could be a simple strings or a URIs. (use with &#x60;externalReferenceSources&#x60; parameter)
     *
     * @return externalReferenceIds
     **/
    @Schema(example = "[\"doi:10.155454/12341234\",\"14a19841\"]", description = "List of external reference IDs. Could be a simple strings or a URIs. (use with `externalReferenceSources` parameter)")
    public List<String> getExternalReferenceIds() {
        return externalReferenceIds;
    }

    public void setExternalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
    }

    public SearchImagesBody externalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
        return this;
    }

    public SearchImagesBody addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
        if (this.externalReferenceSources == null) {
            this.externalReferenceSources = new ArrayList<String>();
        }
        this.externalReferenceSources.add(externalReferenceSourcesItem);
        return this;
    }

    /**
     * List of identifiers for the source system or database of an external reference (use with &#x60;externalReferenceIDs&#x60; parameter)
     *
     * @return externalReferenceSources
     **/
    @Schema(example = "[\"DOI\",\"Field App Name\"]", description = "List of identifiers for the source system or database of an external reference (use with `externalReferenceIDs` parameter)")
    public List<String> getExternalReferenceSources() {
        return externalReferenceSources;
    }

    public void setExternalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
    }

    public SearchImagesBody imageDbIds(List<String> imageDbIds) {
        this.imageDbIds = imageDbIds;
        return this;
    }

    public SearchImagesBody addImageDbIdsItem(String imageDbIdsItem) {
        if (this.imageDbIds == null) {
            this.imageDbIds = new ArrayList<String>();
        }
        this.imageDbIds.add(imageDbIdsItem);
        return this;
    }

    /**
     * A list of image Ids to search for
     *
     * @return imageDbIds
     **/
    @Schema(example = "[\"564b64a6\",\"0d122d1d\"]", description = "A list of image Ids to search for")
    public List<String> getImageDbIds() {
        return imageDbIds;
    }

    public void setImageDbIds(List<String> imageDbIds) {
        this.imageDbIds = imageDbIds;
    }

    public SearchImagesBody imageFileNames(List<String> imageFileNames) {
        this.imageFileNames = imageFileNames;
        return this;
    }

    public SearchImagesBody addImageFileNamesItem(String imageFileNamesItem) {
        if (this.imageFileNames == null) {
            this.imageFileNames = new ArrayList<String>();
        }
        this.imageFileNames.add(imageFileNamesItem);
        return this;
    }

    /**
     * Image file names to search for.
     *
     * @return imageFileNames
     **/
    @Schema(example = "[\"image_01032019.jpg\",\"picture_field_1234.jpg\"]", description = "Image file names to search for.")
    public List<String> getImageFileNames() {
        return imageFileNames;
    }

    public void setImageFileNames(List<String> imageFileNames) {
        this.imageFileNames = imageFileNames;
    }

    public SearchImagesBody imageFileSizeMax(Integer imageFileSizeMax) {
        this.imageFileSizeMax = imageFileSizeMax;
        return this;
    }

    /**
     * A maximum image file size to search for.
     *
     * @return imageFileSizeMax
     **/
    @Schema(example = "20000000", description = "A maximum image file size to search for.")
    public Integer getImageFileSizeMax() {
        return imageFileSizeMax;
    }

    public void setImageFileSizeMax(Integer imageFileSizeMax) {
        this.imageFileSizeMax = imageFileSizeMax;
    }

    public SearchImagesBody imageFileSizeMin(Integer imageFileSizeMin) {
        this.imageFileSizeMin = imageFileSizeMin;
        return this;
    }

    /**
     * A minimum image file size to search for.
     *
     * @return imageFileSizeMin
     **/
    @Schema(example = "1000", description = "A minimum image file size to search for.")
    public Integer getImageFileSizeMin() {
        return imageFileSizeMin;
    }

    public void setImageFileSizeMin(Integer imageFileSizeMin) {
        this.imageFileSizeMin = imageFileSizeMin;
    }

    public SearchImagesBody imageHeightMax(Integer imageHeightMax) {
        this.imageHeightMax = imageHeightMax;
        return this;
    }

    /**
     * A maximum image height to search for.
     *
     * @return imageHeightMax
     **/
    @Schema(example = "1080", description = "A maximum image height to search for.")
    public Integer getImageHeightMax() {
        return imageHeightMax;
    }

    public void setImageHeightMax(Integer imageHeightMax) {
        this.imageHeightMax = imageHeightMax;
    }

    public SearchImagesBody imageHeightMin(Integer imageHeightMin) {
        this.imageHeightMin = imageHeightMin;
        return this;
    }

    /**
     * A minimum image height to search for.
     *
     * @return imageHeightMin
     **/
    @Schema(example = "720", description = "A minimum image height to search for.")
    public Integer getImageHeightMin() {
        return imageHeightMin;
    }

    public void setImageHeightMin(Integer imageHeightMin) {
        this.imageHeightMin = imageHeightMin;
    }

    public SearchImagesBody imageLocation(GeoJSONSearchArea imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    /**
     * Get imageLocation
     *
     * @return imageLocation
     **/
    @Schema(description = "")
    public GeoJSONSearchArea getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(GeoJSONSearchArea imageLocation) {
        this.imageLocation = imageLocation;
    }

    public SearchImagesBody imageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    public SearchImagesBody addImageNamesItem(String imageNamesItem) {
        if (this.imageNames == null) {
            this.imageNames = new ArrayList<String>();
        }
        this.imageNames.add(imageNamesItem);
        return this;
    }

    /**
     * Human readable names to search for.
     *
     * @return imageNames
     **/
    @Schema(example = "[\"Image 43\",\"Tractor in field\"]", description = "Human readable names to search for.")
    public List<String> getImageNames() {
        return imageNames;
    }

    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }

    public SearchImagesBody imageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
        this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
        return this;
    }

    /**
     * The latest timestamp to search for.
     *
     * @return imageTimeStampRangeEnd
     **/
    @Schema(description = "The latest timestamp to search for.")
    public OffsetDateTime getImageTimeStampRangeEnd() {
        return imageTimeStampRangeEnd;
    }

    public void setImageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
        this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
    }

    public SearchImagesBody imageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
        this.imageTimeStampRangeStart = imageTimeStampRangeStart;
        return this;
    }

    /**
     * The earliest timestamp to search for.
     *
     * @return imageTimeStampRangeStart
     **/
    @Schema(description = "The earliest timestamp to search for.")
    public OffsetDateTime getImageTimeStampRangeStart() {
        return imageTimeStampRangeStart;
    }

    public void setImageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
        this.imageTimeStampRangeStart = imageTimeStampRangeStart;
    }

    public SearchImagesBody imageWidthMax(Integer imageWidthMax) {
        this.imageWidthMax = imageWidthMax;
        return this;
    }

    /**
     * A maximum image width to search for.
     *
     * @return imageWidthMax
     **/
    @Schema(example = "1920", description = "A maximum image width to search for.")
    public Integer getImageWidthMax() {
        return imageWidthMax;
    }

    public void setImageWidthMax(Integer imageWidthMax) {
        this.imageWidthMax = imageWidthMax;
    }

    public SearchImagesBody imageWidthMin(Integer imageWidthMin) {
        this.imageWidthMin = imageWidthMin;
        return this;
    }

    /**
     * A minimum image width to search for.
     *
     * @return imageWidthMin
     **/
    @Schema(example = "1280", description = "A minimum image width to search for.")
    public Integer getImageWidthMin() {
        return imageWidthMin;
    }

    public void setImageWidthMin(Integer imageWidthMin) {
        this.imageWidthMin = imageWidthMin;
    }

    public SearchImagesBody mimeTypes(List<String> mimeTypes) {
        this.mimeTypes = mimeTypes;
        return this;
    }

    public SearchImagesBody addMimeTypesItem(String mimeTypesItem) {
        if (this.mimeTypes == null) {
            this.mimeTypes = new ArrayList<String>();
        }
        this.mimeTypes.add(mimeTypesItem);
        return this;
    }

    /**
     * A set of image file types to search for.
     *
     * @return mimeTypes
     **/
    @Schema(example = "[\"image/jpg\",\"image/jpeg\",\"image/gif\"]", description = "A set of image file types to search for.")
    public List<String> getMimeTypes() {
        return mimeTypes;
    }

    public void setMimeTypes(List<String> mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    public SearchImagesBody observationDbIds(List<String> observationDbIds) {
        this.observationDbIds = observationDbIds;
        return this;
    }

    public SearchImagesBody addObservationDbIdsItem(String observationDbIdsItem) {
        if (this.observationDbIds == null) {
            this.observationDbIds = new ArrayList<String>();
        }
        this.observationDbIds.add(observationDbIdsItem);
        return this;
    }

    /**
     * A list of observation Ids this image is associated with to search for
     *
     * @return observationDbIds
     **/
    @Schema(example = "[\"47326456\",\"fc9823ac\"]", description = "A list of observation Ids this image is associated with to search for")
    public List<String> getObservationDbIds() {
        return observationDbIds;
    }

    public void setObservationDbIds(List<String> observationDbIds) {
        this.observationDbIds = observationDbIds;
    }

    public SearchImagesBody observationUnitDbIds(List<String> observationUnitDbIds) {
        this.observationUnitDbIds = observationUnitDbIds;
        return this;
    }

    public SearchImagesBody addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
        if (this.observationUnitDbIds == null) {
            this.observationUnitDbIds = new ArrayList<String>();
        }
        this.observationUnitDbIds.add(observationUnitDbIdsItem);
        return this;
    }

    /**
     * A set of observation unit identifiers to search for.
     *
     * @return observationUnitDbIds
     **/
    @Schema(example = "[\"f5e4b273\",\"328c9424\"]", description = "A set of observation unit identifiers to search for.")
    public List<String> getObservationUnitDbIds() {
        return observationUnitDbIds;
    }

    public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
        this.observationUnitDbIds = observationUnitDbIds;
    }

    public SearchImagesBody page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;.
     *
     * @return page
     **/
    @Schema(example = "0", description = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.")
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public SearchImagesBody pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The size of the pages to be returned. Default is &#x60;1000&#x60;.
     *
     * @return pageSize
     **/
    @Schema(example = "1000", description = "The size of the pages to be returned. Default is `1000`.")
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public SearchImagesBody programDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
        return this;
    }

    public SearchImagesBody addProgramDbIdsItem(String programDbIdsItem) {
        if (this.programDbIds == null) {
            this.programDbIds = new ArrayList<String>();
        }
        this.programDbIds.add(programDbIdsItem);
        return this;
    }

    /**
     * A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use &#x60;GET /programs&#x60; to find the list of available programs on a server.
     *
     * @return programDbIds
     **/
    @Schema(example = "[\"8f5de35b\",\"0e2d4a13\"]", description = "A BrAPI Program represents the high level organization or group who is responsible for conducting trials and studies. Things like Breeding Programs and Funded Projects are considered BrAPI Programs.   Use this parameter to only return results associated with the given programs.   Use `GET /programs` to find the list of available programs on a server.")
    public List<String> getProgramDbIds() {
        return programDbIds;
    }

    public void setProgramDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
    }

    public SearchImagesBody programNames(List<String> programNames) {
        this.programNames = programNames;
        return this;
    }

    public SearchImagesBody addProgramNamesItem(String programNamesItem) {
        if (this.programNames == null) {
            this.programNames = new ArrayList<String>();
        }
        this.programNames.add(programNamesItem);
        return this;
    }

    /**
     * Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use &#x60;GET /programs&#x60; to find the list of available programs on a server.
     *
     * @return programNames
     **/
    @Schema(example = "[\"Better Breeding Program\",\"Best Breeding Program\"]", description = "Use this parameter to only return results associated with the given program names. Program names are not required to be unique.  Use `GET /programs` to find the list of available programs on a server.")
    public List<String> getProgramNames() {
        return programNames;
    }

    public void setProgramNames(List<String> programNames) {
        this.programNames = programNames;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchImagesBody searchImagesBody = (SearchImagesBody) o;
        return Objects.equals(this.commonCropNames, searchImagesBody.commonCropNames) &&
                Objects.equals(this.descriptiveOntologyTerms, searchImagesBody.descriptiveOntologyTerms) &&
                Objects.equals(this.externalReferenceIDs, searchImagesBody.externalReferenceIDs) &&
                Objects.equals(this.externalReferenceIds, searchImagesBody.externalReferenceIds) &&
                Objects.equals(this.externalReferenceSources, searchImagesBody.externalReferenceSources) &&
                Objects.equals(this.imageDbIds, searchImagesBody.imageDbIds) &&
                Objects.equals(this.imageFileNames, searchImagesBody.imageFileNames) &&
                Objects.equals(this.imageFileSizeMax, searchImagesBody.imageFileSizeMax) &&
                Objects.equals(this.imageFileSizeMin, searchImagesBody.imageFileSizeMin) &&
                Objects.equals(this.imageHeightMax, searchImagesBody.imageHeightMax) &&
                Objects.equals(this.imageHeightMin, searchImagesBody.imageHeightMin) &&
                Objects.equals(this.imageLocation, searchImagesBody.imageLocation) &&
                Objects.equals(this.imageNames, searchImagesBody.imageNames) &&
                Objects.equals(this.imageTimeStampRangeEnd, searchImagesBody.imageTimeStampRangeEnd) &&
                Objects.equals(this.imageTimeStampRangeStart, searchImagesBody.imageTimeStampRangeStart) &&
                Objects.equals(this.imageWidthMax, searchImagesBody.imageWidthMax) &&
                Objects.equals(this.imageWidthMin, searchImagesBody.imageWidthMin) &&
                Objects.equals(this.mimeTypes, searchImagesBody.mimeTypes) &&
                Objects.equals(this.observationDbIds, searchImagesBody.observationDbIds) &&
                Objects.equals(this.observationUnitDbIds, searchImagesBody.observationUnitDbIds) &&
                Objects.equals(this.page, searchImagesBody.page) &&
                Objects.equals(this.pageSize, searchImagesBody.pageSize) &&
                Objects.equals(this.programDbIds, searchImagesBody.programDbIds) &&
                Objects.equals(this.programNames, searchImagesBody.programNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonCropNames, descriptiveOntologyTerms, externalReferenceIDs, externalReferenceIds, externalReferenceSources, imageDbIds, imageFileNames, imageFileSizeMax, imageFileSizeMin, imageHeightMax, imageHeightMin, imageLocation, imageNames, imageTimeStampRangeEnd, imageTimeStampRangeStart, imageWidthMax, imageWidthMin, mimeTypes, observationDbIds, observationUnitDbIds, page, pageSize, programDbIds, programNames);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchImagesBody {\n");

        sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
        sb.append("    descriptiveOntologyTerms: ").append(toIndentedString(descriptiveOntologyTerms)).append("\n");
        sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
        sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
        sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
        sb.append("    imageDbIds: ").append(toIndentedString(imageDbIds)).append("\n");
        sb.append("    imageFileNames: ").append(toIndentedString(imageFileNames)).append("\n");
        sb.append("    imageFileSizeMax: ").append(toIndentedString(imageFileSizeMax)).append("\n");
        sb.append("    imageFileSizeMin: ").append(toIndentedString(imageFileSizeMin)).append("\n");
        sb.append("    imageHeightMax: ").append(toIndentedString(imageHeightMax)).append("\n");
        sb.append("    imageHeightMin: ").append(toIndentedString(imageHeightMin)).append("\n");
        sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
        sb.append("    imageNames: ").append(toIndentedString(imageNames)).append("\n");
        sb.append("    imageTimeStampRangeEnd: ").append(toIndentedString(imageTimeStampRangeEnd)).append("\n");
        sb.append("    imageTimeStampRangeStart: ").append(toIndentedString(imageTimeStampRangeStart)).append("\n");
        sb.append("    imageWidthMax: ").append(toIndentedString(imageWidthMax)).append("\n");
        sb.append("    imageWidthMin: ").append(toIndentedString(imageWidthMin)).append("\n");
        sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
        sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
        sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
        sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
