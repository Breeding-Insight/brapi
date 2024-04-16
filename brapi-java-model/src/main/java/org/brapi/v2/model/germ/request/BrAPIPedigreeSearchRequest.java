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

package org.brapi.v2.model.germ.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * PedigreeSearchRequest
 */

public class BrAPIPedigreeSearchRequest extends BrAPISearchRequestParametersPaging {
    @JsonProperty("accessionNumbers")
    private List<String> accessionNumbers = null;

    @JsonProperty("binomialNames")
    private List<String> binomialNames = null;

    @JsonProperty("collections")
    private List<String> collections = null;

    @JsonProperty("commonCropNames")
    private List<String> commonCropNames = null;

    @JsonProperty("externalReferenceIDs")
    private List<String> externalReferenceIDs = null;

    @JsonProperty("externalReferenceIds")
    private List<String> externalReferenceIds = null;

    @JsonProperty("externalReferenceSources")
    private List<String> externalReferenceSources = null;

    @JsonProperty("familyCodes")
    private List<String> familyCodes = null;

    @JsonProperty("genus")
    private List<String> genus = null;

    @JsonProperty("germplasmDbIds")
    private List<String> germplasmDbIds = null;

    @JsonProperty("germplasmNames")
    private List<String> germplasmNames = null;

    @JsonProperty("germplasmPUIs")
    private List<String> germplasmPUIs = null;

    @JsonProperty("includeFullTree")
    private Boolean includeFullTree = null;

    @JsonProperty("includeParents")
    private Boolean includeParents = null;

    @JsonProperty("includeProgeny")
    private Boolean includeProgeny = null;

    @JsonProperty("includeSiblings")
    private Boolean includeSiblings = null;

    @JsonProperty("instituteCodes")
    private List<String> instituteCodes = null;

    @JsonProperty("page")
    private Integer page = null;

    @JsonProperty("pageSize")
    private Integer pageSize = null;

    @JsonProperty("pedigreeDepth")
    private Integer pedigreeDepth = null;

    @JsonProperty("progenyDepth")
    private Integer progenyDepth = null;

    @JsonProperty("programDbIds")
    private List<String> programDbIds = null;

    @JsonProperty("programNames")
    private List<String> programNames = null;

    @JsonProperty("species")
    private List<String> species = null;

    @JsonProperty("studyDbIds")
    private List<String> studyDbIds = null;

    @JsonProperty("studyNames")
    private List<String> studyNames = null;

    @JsonProperty("synonyms")
    private List<String> synonyms = null;

    @JsonProperty("trialDbIds")
    private List<String> trialDbIds = null;

    @JsonProperty("trialNames")
    private List<String> trialNames = null;

    public BrAPIPedigreeSearchRequest accessionNumbers(List<String> accessionNumbers) {
        this.accessionNumbers = accessionNumbers;
        return this;
    }

    public BrAPIPedigreeSearchRequest addAccessionNumbersItem(String accessionNumbersItem) {
        if (this.accessionNumbers == null) {
            this.accessionNumbers = new ArrayList<String>();
        }
        this.accessionNumbers.add(accessionNumbersItem);
        return this;
    }

    /**
     * A collection of unique identifiers for materials or germplasm within a genebank  MCPD (v2.1) (ACCENUMB) 2. This is the unique identifier for accessions within a genebank, and is assigned when a sample is entered into the genebank collection (e.g. \&quot;PI 113869\&quot;).
     *
     * @return accessionNumbers
     **/
    public List<String> getAccessionNumbers() {
        return accessionNumbers;
    }

    public void setAccessionNumbers(List<String> accessionNumbers) {
        this.accessionNumbers = accessionNumbers;
    }

    public BrAPIPedigreeSearchRequest binomialNames(List<String> binomialNames) {
        this.binomialNames = binomialNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addBinomialNamesItem(String binomialNamesItem) {
        if (this.binomialNames == null) {
            this.binomialNames = new ArrayList<String>();
        }
        this.binomialNames.add(binomialNamesItem);
        return this;
    }

    /**
     * List of the full binomial name (scientific name) to identify a germplasm
     *
     * @return binomialNames
     **/
    public List<String> getBinomialNames() {
        return binomialNames;
    }

    public void setBinomialNames(List<String> binomialNames) {
        this.binomialNames = binomialNames;
    }

    public BrAPIPedigreeSearchRequest collections(List<String> collections) {
        this.collections = collections;
        return this;
    }

    public BrAPIPedigreeSearchRequest addCollectionsItem(String collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<String>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    /**
     * A specific panel/collection/population name this germplasm belongs to.
     *
     * @return collections
     **/
    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public BrAPIPedigreeSearchRequest commonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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
    public List<String> getCommonCropNames() {
        return commonCropNames;
    }

    public void setCommonCropNames(List<String> commonCropNames) {
        this.commonCropNames = commonCropNames;
    }

    public BrAPIPedigreeSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
        return this;
    }

    public BrAPIPedigreeSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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
    public List<String> getExternalReferenceIDs() {
        return externalReferenceIDs;
    }

    public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
        this.externalReferenceIDs = externalReferenceIDs;
    }

    public BrAPIPedigreeSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
        return this;
    }

    public BrAPIPedigreeSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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
    public List<String> getExternalReferenceIds() {
        return externalReferenceIds;
    }

    public void setExternalReferenceIds(List<String> externalReferenceIds) {
        this.externalReferenceIds = externalReferenceIds;
    }

    public BrAPIPedigreeSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
        return this;
    }

    public BrAPIPedigreeSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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
    public List<String> getExternalReferenceSources() {
        return externalReferenceSources;
    }

    public void setExternalReferenceSources(List<String> externalReferenceSources) {
        this.externalReferenceSources = externalReferenceSources;
    }

    public BrAPIPedigreeSearchRequest familyCodes(List<String> familyCodes) {
        this.familyCodes = familyCodes;
        return this;
    }

    public BrAPIPedigreeSearchRequest addFamilyCodesItem(String familyCodesItem) {
        if (this.familyCodes == null) {
            this.familyCodes = new ArrayList<String>();
        }
        this.familyCodes.add(familyCodesItem);
        return this;
    }

    /**
     * A familyCode representing the family this germplasm belongs to.
     *
     * @return familyCodes
     **/
    public List<String> getFamilyCodes() {
        return familyCodes;
    }

    public void setFamilyCodes(List<String> familyCodes) {
        this.familyCodes = familyCodes;
    }

    public BrAPIPedigreeSearchRequest genus(List<String> genus) {
        this.genus = genus;
        return this;
    }

    public BrAPIPedigreeSearchRequest addGenusItem(String genusItem) {
        if (this.genus == null) {
            this.genus = new ArrayList<String>();
        }
        this.genus.add(genusItem);
        return this;
    }

    /**
     * List of Genus names to identify germplasm
     *
     * @return genus
     **/
    public List<String> getGenus() {
        return genus;
    }

    public void setGenus(List<String> genus) {
        this.genus = genus;
    }

    public BrAPIPedigreeSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
        return this;
    }

    public BrAPIPedigreeSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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
    public List<String> getGermplasmDbIds() {
        return germplasmDbIds;
    }

    public void setGermplasmDbIds(List<String> germplasmDbIds) {
        this.germplasmDbIds = germplasmDbIds;
    }

    public BrAPIPedigreeSearchRequest germplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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
    public List<String> getGermplasmNames() {
        return germplasmNames;
    }

    public void setGermplasmNames(List<String> germplasmNames) {
        this.germplasmNames = germplasmNames;
    }

    public BrAPIPedigreeSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
        this.germplasmPUIs = germplasmPUIs;
        return this;
    }

    public BrAPIPedigreeSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
        if (this.germplasmPUIs == null) {
            this.germplasmPUIs = new ArrayList<String>();
        }
        this.germplasmPUIs.add(germplasmPUIsItem);
        return this;
    }

    /**
     * List of Permanent Unique Identifiers to identify germplasm
     *
     * @return germplasmPUIs
     **/
    public List<String> getGermplasmPUIs() {
        return germplasmPUIs;
    }

    public void setGermplasmPUIs(List<String> germplasmPUIs) {
        this.germplasmPUIs = germplasmPUIs;
    }

    public BrAPIPedigreeSearchRequest includeFullTree(Boolean includeFullTree) {
        this.includeFullTree = includeFullTree;
        return this;
    }

    /**
     * If this parameter is true, recursively include ALL of the nodes available in this pedigree tree
     *
     * @return includeFullTree
     **/
    public Boolean isIncludeFullTree() {
        return includeFullTree;
    }

    public void setIncludeFullTree(Boolean includeFullTree) {
        this.includeFullTree = includeFullTree;
    }

    public BrAPIPedigreeSearchRequest includeParents(Boolean includeParents) {
        this.includeParents = includeParents;
        return this;
    }

    /**
     * If this parameter is true, include the array of parents in the response
     *
     * @return includeParents
     **/
    public Boolean isIncludeParents() {
        return includeParents;
    }

    public void setIncludeParents(Boolean includeParents) {
        this.includeParents = includeParents;
    }

    public BrAPIPedigreeSearchRequest includeProgeny(Boolean includeProgeny) {
        this.includeProgeny = includeProgeny;
        return this;
    }

    /**
     * If this parameter is true, include the array of progeny in the response
     *
     * @return includeProgeny
     **/
    public Boolean isIncludeProgeny() {
        return includeProgeny;
    }

    public void setIncludeProgeny(Boolean includeProgeny) {
        this.includeProgeny = includeProgeny;
    }

    public BrAPIPedigreeSearchRequest includeSiblings(Boolean includeSiblings) {
        this.includeSiblings = includeSiblings;
        return this;
    }

    /**
     * If this parameter is true, include the array of siblings in the response
     *
     * @return includeSiblings
     **/
    public Boolean isIncludeSiblings() {
        return includeSiblings;
    }

    public void setIncludeSiblings(Boolean includeSiblings) {
        this.includeSiblings = includeSiblings;
    }

    public BrAPIPedigreeSearchRequest instituteCodes(List<String> instituteCodes) {
        this.instituteCodes = instituteCodes;
        return this;
    }

    public BrAPIPedigreeSearchRequest addInstituteCodesItem(String instituteCodesItem) {
        if (this.instituteCodes == null) {
            this.instituteCodes = new ArrayList<String>();
        }
        this.instituteCodes.add(instituteCodesItem);
        return this;
    }

    /**
     * The code for the institute that maintains the material.  &lt;br/&gt; MCPD (v2.1) (INSTCODE) 1. FAO WIEWS code of the institute where the accession is maintained. The codes consist of the 3-letter ISO 3166 country code of the country where the institute is located plus a number (e.g. PER001). The current set of institute codes is available from http://www.fao.org/wiews. For those institutes not yet having an FAO Code, or for those with \&quot;obsolete\&quot; codes, see \&quot;Common formatting rules (v)\&quot;.
     *
     * @return instituteCodes
     **/
    public List<String> getInstituteCodes() {
        return instituteCodes;
    }

    public void setInstituteCodes(List<String> instituteCodes) {
        this.instituteCodes = instituteCodes;
    }

    public BrAPIPedigreeSearchRequest page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;.
     *
     * @return page
     **/
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public BrAPIPedigreeSearchRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The size of the pages to be returned. Default is &#x60;1000&#x60;.
     *
     * @return pageSize
     **/
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public BrAPIPedigreeSearchRequest pedigreeDepth(Integer pedigreeDepth) {
        this.pedigreeDepth = pedigreeDepth;
        return this;
    }

    /**
     * Recursively include this number of levels up the tree in the response (parents, grand-parents, great-grand-parents, etc)
     *
     * @return pedigreeDepth
     **/
    public Integer getPedigreeDepth() {
        return pedigreeDepth;
    }

    public void setPedigreeDepth(Integer pedigreeDepth) {
        this.pedigreeDepth = pedigreeDepth;
    }

    public BrAPIPedigreeSearchRequest progenyDepth(Integer progenyDepth) {
        this.progenyDepth = progenyDepth;
        return this;
    }

    /**
     * Recursively include this number of levels down the tree in the response (children, grand-children, great-grand-children, etc)
     *
     * @return progenyDepth
     **/
    public Integer getProgenyDepth() {
        return progenyDepth;
    }

    public void setProgenyDepth(Integer progenyDepth) {
        this.progenyDepth = progenyDepth;
    }

    public BrAPIPedigreeSearchRequest programDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
        return this;
    }

    public BrAPIPedigreeSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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
    public List<String> getProgramDbIds() {
        return programDbIds;
    }

    public void setProgramDbIds(List<String> programDbIds) {
        this.programDbIds = programDbIds;
    }

    public BrAPIPedigreeSearchRequest programNames(List<String> programNames) {
        this.programNames = programNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addProgramNamesItem(String programNamesItem) {
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
    public List<String> getProgramNames() {
        return programNames;
    }

    public void setProgramNames(List<String> programNames) {
        this.programNames = programNames;
    }

    public BrAPIPedigreeSearchRequest species(List<String> species) {
        this.species = species;
        return this;
    }

    public BrAPIPedigreeSearchRequest addSpeciesItem(String speciesItem) {
        if (this.species == null) {
            this.species = new ArrayList<String>();
        }
        this.species.add(speciesItem);
        return this;
    }

    /**
     * List of Species names to identify germplasm
     *
     * @return species
     **/
    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public BrAPIPedigreeSearchRequest studyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
        return this;
    }

    public BrAPIPedigreeSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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
    public List<String> getStudyDbIds() {
        return studyDbIds;
    }

    public void setStudyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
    }

    public BrAPIPedigreeSearchRequest studyNames(List<String> studyNames) {
        this.studyNames = studyNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addStudyNamesItem(String studyNamesItem) {
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
    public List<String> getStudyNames() {
        return studyNames;
    }

    public void setStudyNames(List<String> studyNames) {
        this.studyNames = studyNames;
    }

    public BrAPIPedigreeSearchRequest synonyms(List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public BrAPIPedigreeSearchRequest addSynonymsItem(String synonymsItem) {
        if (this.synonyms == null) {
            this.synonyms = new ArrayList<String>();
        }
        this.synonyms.add(synonymsItem);
        return this;
    }

    /**
     * List of alternative names or IDs used to reference this germplasm
     *
     * @return synonyms
     **/
    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public BrAPIPedigreeSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public BrAPIPedigreeSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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
    public List<String> getTrialDbIds() {
        return trialDbIds;
    }

    public void setTrialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
    }

    public BrAPIPedigreeSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public BrAPIPedigreeSearchRequest addTrialNamesItem(String trialNamesItem) {
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
        BrAPIPedigreeSearchRequest pedigreeSearchRequest = (BrAPIPedigreeSearchRequest) o;
        return Objects.equals(this.accessionNumbers, pedigreeSearchRequest.accessionNumbers) &&
                Objects.equals(this.binomialNames, pedigreeSearchRequest.binomialNames) &&
                Objects.equals(this.collections, pedigreeSearchRequest.collections) &&
                Objects.equals(this.commonCropNames, pedigreeSearchRequest.commonCropNames) &&
                Objects.equals(this.externalReferenceIDs, pedigreeSearchRequest.externalReferenceIDs) &&
                Objects.equals(this.externalReferenceIds, pedigreeSearchRequest.externalReferenceIds) &&
                Objects.equals(this.externalReferenceSources, pedigreeSearchRequest.externalReferenceSources) &&
                Objects.equals(this.familyCodes, pedigreeSearchRequest.familyCodes) &&
                Objects.equals(this.genus, pedigreeSearchRequest.genus) &&
                Objects.equals(this.germplasmDbIds, pedigreeSearchRequest.germplasmDbIds) &&
                Objects.equals(this.germplasmNames, pedigreeSearchRequest.germplasmNames) &&
                Objects.equals(this.germplasmPUIs, pedigreeSearchRequest.germplasmPUIs) &&
                Objects.equals(this.includeFullTree, pedigreeSearchRequest.includeFullTree) &&
                Objects.equals(this.includeParents, pedigreeSearchRequest.includeParents) &&
                Objects.equals(this.includeProgeny, pedigreeSearchRequest.includeProgeny) &&
                Objects.equals(this.includeSiblings, pedigreeSearchRequest.includeSiblings) &&
                Objects.equals(this.instituteCodes, pedigreeSearchRequest.instituteCodes) &&
                Objects.equals(this.page, pedigreeSearchRequest.page) &&
                Objects.equals(this.pageSize, pedigreeSearchRequest.pageSize) &&
                Objects.equals(this.pedigreeDepth, pedigreeSearchRequest.pedigreeDepth) &&
                Objects.equals(this.progenyDepth, pedigreeSearchRequest.progenyDepth) &&
                Objects.equals(this.programDbIds, pedigreeSearchRequest.programDbIds) &&
                Objects.equals(this.programNames, pedigreeSearchRequest.programNames) &&
                Objects.equals(this.species, pedigreeSearchRequest.species) &&
                Objects.equals(this.studyDbIds, pedigreeSearchRequest.studyDbIds) &&
                Objects.equals(this.studyNames, pedigreeSearchRequest.studyNames) &&
                Objects.equals(this.synonyms, pedigreeSearchRequest.synonyms) &&
                Objects.equals(this.trialDbIds, pedigreeSearchRequest.trialDbIds) &&
                Objects.equals(this.trialNames, pedigreeSearchRequest.trialNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessionNumbers, binomialNames, collections, commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, familyCodes, genus, germplasmDbIds, germplasmNames, germplasmPUIs, includeFullTree, includeParents, includeProgeny, includeSiblings, instituteCodes, page, pageSize, pedigreeDepth, progenyDepth, programDbIds, programNames, species, studyDbIds, studyNames, synonyms, trialDbIds, trialNames);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PedigreeSearchRequest {\n");

        sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
        sb.append("    binomialNames: ").append(toIndentedString(binomialNames)).append("\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
        sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
        sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
        sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
        sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
        sb.append("    familyCodes: ").append(toIndentedString(familyCodes)).append("\n");
        sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
        sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
        sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
        sb.append("    germplasmPUIs: ").append(toIndentedString(germplasmPUIs)).append("\n");
        sb.append("    includeFullTree: ").append(toIndentedString(includeFullTree)).append("\n");
        sb.append("    includeParents: ").append(toIndentedString(includeParents)).append("\n");
        sb.append("    includeProgeny: ").append(toIndentedString(includeProgeny)).append("\n");
        sb.append("    includeSiblings: ").append(toIndentedString(includeSiblings)).append("\n");
        sb.append("    instituteCodes: ").append(toIndentedString(instituteCodes)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pedigreeDepth: ").append(toIndentedString(pedigreeDepth)).append("\n");
        sb.append("    progenyDepth: ").append(toIndentedString(progenyDepth)).append("\n");
        sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
        sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
        sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
        sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
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
