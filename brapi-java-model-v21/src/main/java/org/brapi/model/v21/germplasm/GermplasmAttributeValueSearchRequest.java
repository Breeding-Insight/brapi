/*
 * BrAPI-Germplasm
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.germplasm;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GermplasmAttributeValueSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:45:22.672Z[GMT]")
public class GermplasmAttributeValueSearchRequest {
    @SerializedName("attributeDbIds")
    private List<String> attributeDbIds = null;

    @SerializedName("attributeNames")
    private List<String> attributeNames = null;

    @SerializedName("attributeValueDbIds")
    private List<String> attributeValueDbIds = null;

    @SerializedName("commonCropNames")
    private List<String> commonCropNames = null;

    /**
     * &lt;p&gt;Class of the scale, entries can be&lt;/p&gt; &lt;p&gt;\&quot;Code\&quot; -  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. \&quot;75VD\&quot; means \&quot;75 %\&quot; of the plant is infected and the plant is very delayed.&lt;/p&gt; &lt;p&gt;\&quot;Date\&quot; - The date class is for events expressed in a time format, See ISO 8601&lt;/p&gt; &lt;p&gt;\&quot;Duration\&quot; - The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months&lt;/p&gt; &lt;p&gt;\&quot;Nominal\&quot; - Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories&lt;/p&gt; &lt;p&gt;\&quot;Numerical\&quot; - Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches&lt;/p&gt; &lt;p&gt;\&quot;Ordinal\&quot; - Ordinal scales are scales composed of ordered categories&lt;/p&gt; &lt;p&gt;\&quot;Text\&quot; - A free text is used to express the trait.&lt;/p&gt;
     */
    @JsonAdapter(DataTypesEnum.Adapter.class)
    public enum DataTypesEnum {
        CODE("Code"),
        DATE("Date"),
        DURATION("Duration"),
        NOMINAL("Nominal"),
        NUMERICAL("Numerical"),
        ORDINAL("Ordinal"),
        TEXT("Text");

        private String value;

        DataTypesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataTypesEnum fromValue(String input) {
            for (DataTypesEnum b : DataTypesEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<DataTypesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DataTypesEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public DataTypesEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return DataTypesEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("dataTypes")
    private List<DataTypesEnum> dataTypes = null;

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

    @SerializedName("methodDbIds")
    private List<String> methodDbIds = null;

    @SerializedName("ontologyDbIds")
    private List<String> ontologyDbIds = null;

    @SerializedName("page")
    private Integer page = null;

    @SerializedName("pageSize")
    private Integer pageSize = null;

    @SerializedName("programDbIds")
    private List<String> programDbIds = null;

    @SerializedName("programNames")
    private List<String> programNames = null;

    @SerializedName("scaleDbIds")
    private List<String> scaleDbIds = null;

    @SerializedName("traitClasses")
    private List<String> traitClasses = null;

    @SerializedName("traitDbIds")
    private List<String> traitDbIds = null;

    public GermplasmAttributeValueSearchRequest attributeDbIds(List<String> attributeDbIds) {
        this.attributeDbIds = attributeDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addAttributeDbIdsItem(String attributeDbIdsItem) {
        if (this.attributeDbIds == null) {
            this.attributeDbIds = new ArrayList<String>();
        }
        this.attributeDbIds.add(attributeDbIdsItem);
        return this;
    }

    /**
     * List of Germplasm Attribute IDs to search for
     *
     * @return attributeDbIds
     **/
    @Schema(example = "[\"2ef15c9f\",\"318e7f7d\"]", description = "List of Germplasm Attribute IDs to search for")
    public List<String> getAttributeDbIds() {
        return attributeDbIds;
    }

    public void setAttributeDbIds(List<String> attributeDbIds) {
        this.attributeDbIds = attributeDbIds;
    }

    public GermplasmAttributeValueSearchRequest attributeNames(List<String> attributeNames) {
        this.attributeNames = attributeNames;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addAttributeNamesItem(String attributeNamesItem) {
        if (this.attributeNames == null) {
            this.attributeNames = new ArrayList<String>();
        }
        this.attributeNames.add(attributeNamesItem);
        return this;
    }

    /**
     * List of human readable Germplasm Attribute names to search for
     *
     * @return attributeNames
     **/
    @Schema(example = "[\"Plant Height 1\",\"Root Color\"]", description = "List of human readable Germplasm Attribute names to search for")
    public List<String> getAttributeNames() {
        return attributeNames;
    }

    public void setAttributeNames(List<String> attributeNames) {
        this.attributeNames = attributeNames;
    }

    public GermplasmAttributeValueSearchRequest attributeValueDbIds(List<String> attributeValueDbIds) {
        this.attributeValueDbIds = attributeValueDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addAttributeValueDbIdsItem(String attributeValueDbIdsItem) {
        if (this.attributeValueDbIds == null) {
            this.attributeValueDbIds = new ArrayList<String>();
        }
        this.attributeValueDbIds.add(attributeValueDbIdsItem);
        return this;
    }

    /**
     * List of Germplasm Attribute Value IDs to search for
     *
     * @return attributeValueDbIds
     **/
    @Schema(example = "[\"ca4636d0\",\"c8a92409\"]", description = "List of Germplasm Attribute Value IDs to search for")
    public List<String> getAttributeValueDbIds() {
        return attributeValueDbIds;
    }

    public void setAttributeValueDbIds(List<String> attributeValueDbIds) {
        this.attributeValueDbIds = attributeValueDbIds;
    }

    public GermplasmAttributeValueSearchRequest commonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

    public GermplasmAttributeValueSearchRequest dataTypes(List<DataTypesEnum> dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addDataTypesItem(DataTypesEnum dataTypesItem) {
        if (this.dataTypes == null) {
            this.dataTypes = new ArrayList<DataTypesEnum>();
        }
        this.dataTypes.add(dataTypesItem);
        return this;
    }

    /**
     * List of scale data types to filter search results
     *
     * @return dataTypes
     **/
    @Schema(example = "[\"Numerical\",\"Ordinal\",\"Text\"]", description = "List of scale data types to filter search results")
    public List<DataTypesEnum> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(List<DataTypesEnum> dataTypes) {
        this.dataTypes = dataTypes;
    }

    public GermplasmAttributeValueSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

    public GermplasmAttributeValueSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

    public GermplasmAttributeValueSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

    public GermplasmAttributeValueSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

    public GermplasmAttributeValueSearchRequest germplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

    public GermplasmAttributeValueSearchRequest methodDbIds(List<String> methodDbIds) {
        this.methodDbIds = methodDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addMethodDbIdsItem(String methodDbIdsItem) {
        if (this.methodDbIds == null) {
            this.methodDbIds = new ArrayList<String>();
        }
        this.methodDbIds.add(methodDbIdsItem);
        return this;
    }

    /**
     * List of methods to filter search results
     *
     * @return methodDbIds
     **/
    @Schema(example = "[\"07e34f83\",\"d3d5517a\"]", description = "List of methods to filter search results")
    public List<String> getMethodDbIds() {
        return methodDbIds;
    }

    public void setMethodDbIds(List<String> methodDbIds) {
        this.methodDbIds = methodDbIds;
    }

    public GermplasmAttributeValueSearchRequest ontologyDbIds(List<String> ontologyDbIds) {
        this.ontologyDbIds = ontologyDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addOntologyDbIdsItem(String ontologyDbIdsItem) {
        if (this.ontologyDbIds == null) {
            this.ontologyDbIds = new ArrayList<String>();
        }
        this.ontologyDbIds.add(ontologyDbIdsItem);
        return this;
    }

    /**
     * List of ontology IDs to search for
     *
     * @return ontologyDbIds
     **/
    @Schema(example = "[\"f44f7b23\",\"a26b576e\"]", description = "List of ontology IDs to search for")
    public List<String> getOntologyDbIds() {
        return ontologyDbIds;
    }

    public void setOntologyDbIds(List<String> ontologyDbIds) {
        this.ontologyDbIds = ontologyDbIds;
    }

    public GermplasmAttributeValueSearchRequest page(Integer page) {
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

    public GermplasmAttributeValueSearchRequest pageSize(Integer pageSize) {
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

    public GermplasmAttributeValueSearchRequest programDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

    public GermplasmAttributeValueSearchRequest programNames(List<String> programNames) {
        this.programNames = programNames;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addProgramNamesItem(String programNamesItem) {
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

    public GermplasmAttributeValueSearchRequest scaleDbIds(List<String> scaleDbIds) {
        this.scaleDbIds = scaleDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addScaleDbIdsItem(String scaleDbIdsItem) {
        if (this.scaleDbIds == null) {
            this.scaleDbIds = new ArrayList<String>();
        }
        this.scaleDbIds.add(scaleDbIdsItem);
        return this;
    }

    /**
     * List of scales to filter search results
     *
     * @return scaleDbIds
     **/
    @Schema(example = "[\"a13ecffa\",\"7e1afe4f\"]", description = "List of scales to filter search results")
    public List<String> getScaleDbIds() {
        return scaleDbIds;
    }

    public void setScaleDbIds(List<String> scaleDbIds) {
        this.scaleDbIds = scaleDbIds;
    }

    public GermplasmAttributeValueSearchRequest traitClasses(List<String> traitClasses) {
        this.traitClasses = traitClasses;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addTraitClassesItem(String traitClassesItem) {
        if (this.traitClasses == null) {
            this.traitClasses = new ArrayList<String>();
        }
        this.traitClasses.add(traitClassesItem);
        return this;
    }

    /**
     * List of trait classes to filter search results
     *
     * @return traitClasses
     **/
    @Schema(example = "[\"morphological\",\"phenological\",\"agronomical\"]", description = "List of trait classes to filter search results")
    public List<String> getTraitClasses() {
        return traitClasses;
    }

    public void setTraitClasses(List<String> traitClasses) {
        this.traitClasses = traitClasses;
    }

    public GermplasmAttributeValueSearchRequest traitDbIds(List<String> traitDbIds) {
        this.traitDbIds = traitDbIds;
        return this;
    }

    public GermplasmAttributeValueSearchRequest addTraitDbIdsItem(String traitDbIdsItem) {
        if (this.traitDbIds == null) {
            this.traitDbIds = new ArrayList<String>();
        }
        this.traitDbIds.add(traitDbIdsItem);
        return this;
    }

    /**
     * List of trait unique ID to filter search results
     *
     * @return traitDbIds
     **/
    @Schema(example = "[\"ef81147b\",\"78d82fad\"]", description = "List of trait unique ID to filter search results")
    public List<String> getTraitDbIds() {
        return traitDbIds;
    }

    public void setTraitDbIds(List<String> traitDbIds) {
        this.traitDbIds = traitDbIds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GermplasmAttributeValueSearchRequest germplasmAttributeValueSearchRequest = (GermplasmAttributeValueSearchRequest) o;
        return Objects.equals(this.attributeDbIds, germplasmAttributeValueSearchRequest.attributeDbIds) &&
                Objects.equals(this.attributeNames, germplasmAttributeValueSearchRequest.attributeNames) &&
                Objects.equals(this.attributeValueDbIds, germplasmAttributeValueSearchRequest.attributeValueDbIds) &&
                Objects.equals(this.commonCropNames, germplasmAttributeValueSearchRequest.commonCropNames) &&
                Objects.equals(this.dataTypes, germplasmAttributeValueSearchRequest.dataTypes) &&
                Objects.equals(this.externalReferenceIDs, germplasmAttributeValueSearchRequest.externalReferenceIDs) &&
                Objects.equals(this.externalReferenceIds, germplasmAttributeValueSearchRequest.externalReferenceIds) &&
                Objects.equals(this.externalReferenceSources, germplasmAttributeValueSearchRequest.externalReferenceSources) &&
                Objects.equals(this.germplasmDbIds, germplasmAttributeValueSearchRequest.germplasmDbIds) &&
                Objects.equals(this.germplasmNames, germplasmAttributeValueSearchRequest.germplasmNames) &&
                Objects.equals(this.methodDbIds, germplasmAttributeValueSearchRequest.methodDbIds) &&
                Objects.equals(this.ontologyDbIds, germplasmAttributeValueSearchRequest.ontologyDbIds) &&
                Objects.equals(this.page, germplasmAttributeValueSearchRequest.page) &&
                Objects.equals(this.pageSize, germplasmAttributeValueSearchRequest.pageSize) &&
                Objects.equals(this.programDbIds, germplasmAttributeValueSearchRequest.programDbIds) &&
                Objects.equals(this.programNames, germplasmAttributeValueSearchRequest.programNames) &&
                Objects.equals(this.scaleDbIds, germplasmAttributeValueSearchRequest.scaleDbIds) &&
                Objects.equals(this.traitClasses, germplasmAttributeValueSearchRequest.traitClasses) &&
                Objects.equals(this.traitDbIds, germplasmAttributeValueSearchRequest.traitDbIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeDbIds, attributeNames, attributeValueDbIds, commonCropNames, dataTypes, externalReferenceIDs, externalReferenceIds, externalReferenceSources, germplasmDbIds, germplasmNames, methodDbIds, ontologyDbIds, page, pageSize, programDbIds, programNames, scaleDbIds, traitClasses, traitDbIds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GermplasmAttributeValueSearchRequest {\n");

        sb.append("    attributeDbIds: ").append(toIndentedString(attributeDbIds)).append("\n");
        sb.append("    attributeNames: ").append(toIndentedString(attributeNames)).append("\n");
        sb.append("    attributeValueDbIds: ").append(toIndentedString(attributeValueDbIds)).append("\n");
        sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
        sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
        sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
        sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
        sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
        sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
        sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
        sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
        sb.append("    ontologyDbIds: ").append(toIndentedString(ontologyDbIds)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
        sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
        sb.append("    scaleDbIds: ").append(toIndentedString(scaleDbIds)).append("\n");
        sb.append("    traitClasses: ").append(toIndentedString(traitClasses)).append("\n");
        sb.append("    traitDbIds: ").append(toIndentedString(traitDbIds)).append("\n");
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
