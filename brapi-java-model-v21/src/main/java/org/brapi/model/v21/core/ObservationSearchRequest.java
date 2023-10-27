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

package org.brapi.model.v21.core;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ObservationSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ObservationSearchRequest {
    @SerializedName("commonCropNames")
    private List<String> commonCropNames = null;

    @SerializedName("externalReferenceIDs")
    private List<String> externalReferenceIDs = null;

    @SerializedName("externalReferenceIds")
    private List<String> externalReferenceIds = null;

    @SerializedName("externalReferenceSources")
    private List<String> externalReferenceSources = null;

    @SerializedName("germplasmDbIds")
    private List<String> germplasmDbIds = null;

    @SerializedName("germplasmNames")
    private List<String> germplasmNames = null;

    @SerializedName("locationDbIds")
    private List<String> locationDbIds = null;

    @SerializedName("locationNames")
    private List<String> locationNames = null;

    @SerializedName("observationDbIds")
    private List<String> observationDbIds = null;

    @SerializedName("observationLevelRelationships")
    private List<ObservationUnitLevelRelationship1> observationLevelRelationships = null;

    @SerializedName("observationLevels")
    private List<ObservationUnitLevel1> observationLevels = null;

    @SerializedName("observationTimeStampRangeEnd")
    private OffsetDateTime observationTimeStampRangeEnd = null;

    @SerializedName("observationTimeStampRangeStart")
    private OffsetDateTime observationTimeStampRangeStart = null;

    @SerializedName("observationUnitDbIds")
    private List<String> observationUnitDbIds = null;

    @SerializedName("observationVariableDbIds")
    private List<String> observationVariableDbIds = null;

    @SerializedName("observationVariableNames")
    private List<String> observationVariableNames = null;

    @SerializedName("observationVariablePUIs")
    private List<String> observationVariablePUIs = null;

    @SerializedName("page")
    private Integer page = null;

    @SerializedName("pageSize")
    private Integer pageSize = null;

    @SerializedName("programDbIds")
    private List<String> programDbIds = null;

    @SerializedName("programNames")
    private List<String> programNames = null;

    @SerializedName("seasonDbIds")
    private List<String> seasonDbIds = null;

    @SerializedName("studyDbIds")
    private List<String> studyDbIds = null;

    @SerializedName("studyNames")
    private List<String> studyNames = null;

    @SerializedName("trialDbIds")
    private List<String> trialDbIds = null;

    @SerializedName("trialNames")
    private List<String> trialNames = null;

    public ObservationSearchRequest commonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
        return this;
    }

    public ObservationSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

    public ObservationSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
        return this;
    }

    public ObservationSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

    public ObservationSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
        return this;
    }

    public ObservationSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

    public ObservationSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
        return this;
    }

    public ObservationSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

    public ObservationSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
        return this;
    }

    public ObservationSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
        if (this.germplasmDbIds == null) {
            this.germplasmDbIds = new ArrayList<String>();
        }
        this.germplasmDbIds.add(germplasmDbIdsItem);
        return this;
    }

    /**
     * List of IDs which uniquely identify germplasm to search for
     *
     * @return germplasmDbIds
     **/
    @Schema(example = "[\"e9c6edd7\",\"1b1df4a6\"]", description = "List of IDs which uniquely identify germplasm to search for")
    public List<String> getGermplasmDbIds() {
        return germplasmDbIds;
    }

    public void setGermplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
    }

    public ObservationSearchRequest germplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
        return this;
    }

    public ObservationSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
        if (this.germplasmNames == null) {
            this.germplasmNames = new ArrayList<String>();
        }
        this.germplasmNames.add(germplasmNamesItem);
        return this;
    }

    /**
     * List of human readable names to identify germplasm to search for
     *
     * @return germplasmNames
     **/
    @Schema(example = "[\"A0000003\",\"A0000477\"]", description = "List of human readable names to identify germplasm to search for")
    public List<String> getGermplasmNames() {
        return germplasmNames;
    }

    public void setGermplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
    }

    public ObservationSearchRequest locationDbIds(List<String> locationDbIds) {
        this.locationDbIds = locationDbIds;
        return this;
    }

    public ObservationSearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
        if (this.locationDbIds == null) {
            this.locationDbIds = new ArrayList<String>();
        }
        this.locationDbIds.add(locationDbIdsItem);
        return this;
    }

    /**
     * The location ids to search for
     *
     * @return locationDbIds
     **/
    @Schema(example = "[\"b28911cf\",\"5071d1e4\"]", description = "The location ids to search for")
    public List<String> getLocationDbIds() {
        return locationDbIds;
    }

    public void setLocationDbIds(List<String> locationDbIds) {
        this.locationDbIds = locationDbIds;
    }

    public ObservationSearchRequest locationNames(List<String> locationNames) {
        this.locationNames = locationNames;
        return this;
    }

    public ObservationSearchRequest addLocationNamesItem(String locationNamesItem) {
        if (this.locationNames == null) {
            this.locationNames = new ArrayList<String>();
        }
        this.locationNames.add(locationNamesItem);
        return this;
    }

    /**
     * A human readable names to search for
     *
     * @return locationNames
     **/
    @Schema(example = "[\"Location Alpha\",\"The Large Hadron Collider\"]", description = "A human readable names to search for")
    public List<String> getLocationNames() {
        return locationNames;
    }

    public void setLocationNames(List<String> locationNames) {
        this.locationNames = locationNames;
    }

    public ObservationSearchRequest observationDbIds(List<String> observationDbIds) {
        this.observationDbIds = observationDbIds;
        return this;
    }

    public ObservationSearchRequest addObservationDbIdsItem(String observationDbIdsItem) {
        if (this.observationDbIds == null) {
            this.observationDbIds = new ArrayList<String>();
        }
        this.observationDbIds.add(observationDbIdsItem);
        return this;
    }

    /**
     * The unique id of an Observation
     *
     * @return observationDbIds
     **/
    @Schema(example = "[\"6a4a59d8\",\"3ff067e0\"]", description = "The unique id of an Observation")
    public List<String> getObservationDbIds() {
        return observationDbIds;
    }

    public void setObservationDbIds(List<String> observationDbIds) {
        this.observationDbIds = observationDbIds;
    }

    public ObservationSearchRequest observationLevelRelationships(List<ObservationUnitLevelRelationship1> observationLevelRelationships) {
        this.observationLevelRelationships = observationLevelRelationships;
        return this;
    }

    public ObservationSearchRequest addObservationLevelRelationshipsItem(ObservationUnitLevelRelationship1 observationLevelRelationshipsItem) {
        if (this.observationLevelRelationships == null) {
            this.observationLevelRelationships = new ArrayList<ObservationUnitLevelRelationship1>();
        }
        this.observationLevelRelationships.add(observationLevelRelationshipsItem);
        return this;
    }

    /**
     * Searches for values in ObservationUnit-&gt;observationUnitPosition-&gt;observationLevelRelationships
     *
     * @return observationLevelRelationships
     **/
    @Schema(example = "[{\"levelCode\":\"Field_1\",\"levelName\":\"field\"}]", description = "Searches for values in ObservationUnit->observationUnitPosition->observationLevelRelationships")
    public List<ObservationUnitLevelRelationship1> getObservationLevelRelationships() {
        return observationLevelRelationships;
    }

    public void setObservationLevelRelationships(List<ObservationUnitLevelRelationship1> observationLevelRelationships) {
        this.observationLevelRelationships = observationLevelRelationships;
    }

    public ObservationSearchRequest observationLevels(List<ObservationUnitLevel1> observationLevels) {
        this.observationLevels = observationLevels;
        return this;
    }

    public ObservationSearchRequest addObservationLevelsItem(ObservationUnitLevel1 observationLevelsItem) {
        if (this.observationLevels == null) {
            this.observationLevels = new ArrayList<ObservationUnitLevel1>();
        }
        this.observationLevels.add(observationLevelsItem);
        return this;
    }

    /**
     * Searches for values in ObservationUnit-&gt;observationUnitPosition-&gt;observationLevel
     *
     * @return observationLevels
     **/
    @Schema(example = "[{\"levelCode\":\"Plot_123\",\"levelName\":\"plot\"},{\"levelCode\":\"Plot_456\",\"levelName\":\"plot\"},{\"levelCode\":\"Plot_789\",\"levelName\":\"plot\"}]", description = "Searches for values in ObservationUnit->observationUnitPosition->observationLevel")
    public List<ObservationUnitLevel1> getObservationLevels() {
        return observationLevels;
    }

    public void setObservationLevels(List<ObservationUnitLevel1> observationLevels) {
        this.observationLevels = observationLevels;
    }

    public ObservationSearchRequest observationTimeStampRangeEnd(OffsetDateTime observationTimeStampRangeEnd) {
        this.observationTimeStampRangeEnd = observationTimeStampRangeEnd;
        return this;
    }

    /**
     * Timestamp range end
     *
     * @return observationTimeStampRangeEnd
     **/
    @Schema(description = "Timestamp range end")
    public OffsetDateTime getObservationTimeStampRangeEnd() {
        return observationTimeStampRangeEnd;
    }

    public void setObservationTimeStampRangeEnd(OffsetDateTime observationTimeStampRangeEnd) {
        this.observationTimeStampRangeEnd = observationTimeStampRangeEnd;
    }

    public ObservationSearchRequest observationTimeStampRangeStart(OffsetDateTime observationTimeStampRangeStart) {
        this.observationTimeStampRangeStart = observationTimeStampRangeStart;
        return this;
    }

    /**
     * Timestamp range start
     *
     * @return observationTimeStampRangeStart
     **/
    @Schema(description = "Timestamp range start")
    public OffsetDateTime getObservationTimeStampRangeStart() {
        return observationTimeStampRangeStart;
    }

    public void setObservationTimeStampRangeStart(OffsetDateTime observationTimeStampRangeStart) {
        this.observationTimeStampRangeStart = observationTimeStampRangeStart;
    }

    public ObservationSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
        this.observationUnitDbIds = observationUnitDbIds;
        return this;
    }

    public ObservationSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
        if (this.observationUnitDbIds == null) {
            this.observationUnitDbIds = new ArrayList<String>();
        }
        this.observationUnitDbIds.add(observationUnitDbIdsItem);
        return this;
    }

    /**
     * The unique id of an Observation Unit
     *
     * @return observationUnitDbIds
     **/
    @Schema(example = "[\"76f559b5\",\"066bc5d3\"]", description = "The unique id of an Observation Unit")
    public List<String> getObservationUnitDbIds() {
        return observationUnitDbIds;
    }

    public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
        this.observationUnitDbIds = observationUnitDbIds;
    }

    public ObservationSearchRequest observationVariableDbIds(List<String> observationVariableDbIds) {
        this.observationVariableDbIds = observationVariableDbIds;
        return this;
    }

    public ObservationSearchRequest addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
        if (this.observationVariableDbIds == null) {
            this.observationVariableDbIds = new ArrayList<String>();
        }
        this.observationVariableDbIds.add(observationVariableDbIdsItem);
        return this;
    }

    /**
     * The DbIds of Variables to search for
     *
     * @return observationVariableDbIds
     **/
    @Schema(example = "[\"a646187d\",\"6d23513b\"]", description = "The DbIds of Variables to search for")
    public List<String> getObservationVariableDbIds() {
        return observationVariableDbIds;
    }

    public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
        this.observationVariableDbIds = observationVariableDbIds;
    }

    public ObservationSearchRequest observationVariableNames(List<String> observationVariableNames) {
        this.observationVariableNames = observationVariableNames;
        return this;
    }

    public ObservationSearchRequest addObservationVariableNamesItem(String observationVariableNamesItem) {
        if (this.observationVariableNames == null) {
            this.observationVariableNames = new ArrayList<String>();
        }
        this.observationVariableNames.add(observationVariableNamesItem);
        return this;
    }

    /**
     * The names of Variables to search for
     *
     * @return observationVariableNames
     **/
    @Schema(example = "[\"Plant Height in meters\",\"Wheat rust score 1-5\"]", description = "The names of Variables to search for")
    public List<String> getObservationVariableNames() {
        return observationVariableNames;
    }

    public void setObservationVariableNames(List<String> observationVariableNames) {
        this.observationVariableNames = observationVariableNames;
    }

    public ObservationSearchRequest observationVariablePUIs(List<String> observationVariablePUIs) {
        this.observationVariablePUIs = observationVariablePUIs;
        return this;
    }

    public ObservationSearchRequest addObservationVariablePUIsItem(String observationVariablePUIsItem) {
        if (this.observationVariablePUIs == null) {
            this.observationVariablePUIs = new ArrayList<String>();
        }
        this.observationVariablePUIs.add(observationVariablePUIsItem);
        return this;
    }

    /**
     * The Permanent Unique Identifier of an Observation Variable, usually in the form of a URI
     *
     * @return observationVariablePUIs
     **/
    @Schema(example = "[\"http://my-traits.com/trait/CO_123:0008012\",\"http://my-traits.com/trait/CO_123:0007261\"]", description = "The Permanent Unique Identifier of an Observation Variable, usually in the form of a URI")
    public List<String> getObservationVariablePUIs() {
        return observationVariablePUIs;
    }

    public void setObservationVariablePUIs(List<String> observationVariablePUIs) {
        this.observationVariablePUIs = observationVariablePUIs;
    }

    public ObservationSearchRequest page(Integer page) {
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

    public ObservationSearchRequest pageSize(Integer pageSize) {
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

    public ObservationSearchRequest programDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
        return this;
    }

    public ObservationSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

    public ObservationSearchRequest programNames(List<String> programNames) {
        this.programNames = programNames;
        return this;
    }

    public ObservationSearchRequest addProgramNamesItem(String programNamesItem) {
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

    public ObservationSearchRequest seasonDbIds(List<String> seasonDbIds) {
        this.seasonDbIds = seasonDbIds;
        return this;
    }

    public ObservationSearchRequest addSeasonDbIdsItem(String seasonDbIdsItem) {
        if (this.seasonDbIds == null) {
            this.seasonDbIds = new ArrayList<String>();
        }
        this.seasonDbIds.add(seasonDbIdsItem);
        return this;
    }

    /**
     * The year or Phenotyping campaign of a multi-annual study (trees, grape, ...)
     *
     * @return seasonDbIds
     **/
    @Schema(example = "[\"Spring 2018\",\"Season A\"]", description = "The year or Phenotyping campaign of a multi-annual study (trees, grape, ...)")
    public List<String> getSeasonDbIds() {
        return seasonDbIds;
    }

    public void setSeasonDbIds(List<String> seasonDbIds) {
        this.seasonDbIds = seasonDbIds;
    }

    public ObservationSearchRequest studyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
        return this;
    }

    public ObservationSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
        if (this.studyDbIds == null) {
            this.studyDbIds = new ArrayList<String>();
        }
        this.studyDbIds.add(studyDbIdsItem);
        return this;
    }

    /**
     * List of study identifiers to search for
     *
     * @return studyDbIds
     **/
    @Schema(example = "[\"cf6c4bd4\",\"691e69d6\"]", description = "List of study identifiers to search for")
    public List<String> getStudyDbIds() {
        return studyDbIds;
    }

    public void setStudyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
    }

    public ObservationSearchRequest studyNames(List<String> studyNames) {
        this.studyNames = studyNames;
        return this;
    }

    public ObservationSearchRequest addStudyNamesItem(String studyNamesItem) {
        if (this.studyNames == null) {
            this.studyNames = new ArrayList<String>();
        }
        this.studyNames.add(studyNamesItem);
        return this;
    }

    /**
     * List of study names to filter search results
     *
     * @return studyNames
     **/
    @Schema(example = "[\"The First Bob Study 2017\",\"Wheat Yield Trial 246\"]", description = "List of study names to filter search results")
    public List<String> getStudyNames() {
        return studyNames;
    }

    public void setStudyNames(List<String> studyNames) {
        this.studyNames = studyNames;
    }

    public ObservationSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public ObservationSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
        if (this.trialDbIds == null) {
            this.trialDbIds = new ArrayList<String>();
        }
        this.trialDbIds.add(trialDbIdsItem);
        return this;
    }

    /**
     * The ID which uniquely identifies a trial to search for
     *
     * @return trialDbIds
     **/
    @Schema(example = "[\"d2593dc2\",\"9431a731\"]", description = "The ID which uniquely identifies a trial to search for")
    public List<String> getTrialDbIds() {
        return trialDbIds;
    }

    public void setTrialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
    }

    public ObservationSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public ObservationSearchRequest addTrialNamesItem(String trialNamesItem) {
        if (this.trialNames == null) {
            this.trialNames = new ArrayList<String>();
        }
        this.trialNames.add(trialNamesItem);
        return this;
    }

    /**
     * The human readable name of a trial to search for
     *
     * @return trialNames
     **/
    @Schema(example = "[\"All Yield Trials 2016\",\"Disease Resistance Study Comparison Group\"]", description = "The human readable name of a trial to search for")
    public List<String> getTrialNames() {
        return trialNames;
    }

    public void setTrialNames(List<String> trialNames) {
        this.trialNames = trialNames;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObservationSearchRequest observationSearchRequest = (ObservationSearchRequest) o;
        return Objects.equals(this.commonCropNames, observationSearchRequest.commonCropNames) &&
                Objects.equals(this.externalReferenceIDs, observationSearchRequest.externalReferenceIDs) &&
                Objects.equals(this.externalReferenceIds, observationSearchRequest.externalReferenceIds) &&
                Objects.equals(this.externalReferenceSources, observationSearchRequest.externalReferenceSources) &&
                Objects.equals(this.germplasmDbIds, observationSearchRequest.germplasmDbIds) &&
                Objects.equals(this.germplasmNames, observationSearchRequest.germplasmNames) &&
                Objects.equals(this.locationDbIds, observationSearchRequest.locationDbIds) &&
                Objects.equals(this.locationNames, observationSearchRequest.locationNames) &&
                Objects.equals(this.observationDbIds, observationSearchRequest.observationDbIds) &&
                Objects.equals(this.observationLevelRelationships, observationSearchRequest.observationLevelRelationships) &&
                Objects.equals(this.observationLevels, observationSearchRequest.observationLevels) &&
                Objects.equals(this.observationTimeStampRangeEnd, observationSearchRequest.observationTimeStampRangeEnd) &&
                Objects.equals(this.observationTimeStampRangeStart, observationSearchRequest.observationTimeStampRangeStart) &&
                Objects.equals(this.observationUnitDbIds, observationSearchRequest.observationUnitDbIds) &&
                Objects.equals(this.observationVariableDbIds, observationSearchRequest.observationVariableDbIds) &&
                Objects.equals(this.observationVariableNames, observationSearchRequest.observationVariableNames) &&
                Objects.equals(this.observationVariablePUIs, observationSearchRequest.observationVariablePUIs) &&
                Objects.equals(this.page, observationSearchRequest.page) &&
                Objects.equals(this.pageSize, observationSearchRequest.pageSize) &&
                Objects.equals(this.programDbIds, observationSearchRequest.programDbIds) &&
                Objects.equals(this.programNames, observationSearchRequest.programNames) &&
                Objects.equals(this.seasonDbIds, observationSearchRequest.seasonDbIds) &&
                Objects.equals(this.studyDbIds, observationSearchRequest.studyDbIds) &&
                Objects.equals(this.studyNames, observationSearchRequest.studyNames) &&
                Objects.equals(this.trialDbIds, observationSearchRequest.trialDbIds) &&
                Objects.equals(this.trialNames, observationSearchRequest.trialNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, germplasmDbIds, germplasmNames, locationDbIds, locationNames, observationDbIds, observationLevelRelationships, observationLevels, observationTimeStampRangeEnd, observationTimeStampRangeStart, observationUnitDbIds, observationVariableDbIds, observationVariableNames, observationVariablePUIs, page, pageSize, programDbIds, programNames, seasonDbIds, studyDbIds, studyNames, trialDbIds, trialNames);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservationSearchRequest {\n");

        sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
        sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
        sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
        sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
        sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
        sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
        sb.append("    locationDbIds: ").append(toIndentedString(locationDbIds)).append("\n");
        sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
        sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
        sb.append("    observationLevelRelationships: ").append(toIndentedString(observationLevelRelationships)).append("\n");
        sb.append("    observationLevels: ").append(toIndentedString(observationLevels)).append("\n");
        sb.append("    observationTimeStampRangeEnd: ").append(toIndentedString(observationTimeStampRangeEnd)).append("\n");
        sb.append("    observationTimeStampRangeStart: ").append(toIndentedString(observationTimeStampRangeStart)).append("\n");
        sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
        sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
        sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
        sb.append("    observationVariablePUIs: ").append(toIndentedString(observationVariablePUIs)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
        sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
        sb.append("    seasonDbIds: ").append(toIndentedString(seasonDbIds)).append("\n");
        sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
        sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
        sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
        sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
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