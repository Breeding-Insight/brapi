package io.swagger.client.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.SearchRequestParametersPaging;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * GermplasmSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class GermplasmSearchRequest extends SearchRequestParametersPaging  {
  @JsonProperty("commonCropNames")
  @Valid
  private List<String> commonCropNames = null;

  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("studyDbIds")
  @Valid
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  @Valid
  private List<String> studyNames = null;

  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("accessionNumbers")
  @Valid
  private List<String> accessionNumbers = null;

  @JsonProperty("collections")
  @Valid
  private List<String> collections = null;

  @JsonProperty("genus")
  @Valid
  private List<String> genus = null;

  @JsonProperty("germplasmPUIs")
  @Valid
  private List<String> germplasmPUIs = null;

  @JsonProperty("parentDbIds")
  @Valid
  private List<String> parentDbIds = null;

  @JsonProperty("progenyDbIds")
  @Valid
  private List<String> progenyDbIds = null;

  @JsonProperty("species")
  @Valid
  private List<String> species = null;

  @JsonProperty("synonyms")
  @Valid
  private List<String> synonyms = null;

  public GermplasmSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public GermplasmSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
    if (this.commonCropNames == null) {
      this.commonCropNames = new ArrayList<String>();
    }
    this.commonCropNames.add(commonCropNamesItem);
    return this;
  }

  /**
   * Common name for the crop which this program is for
   * @return commonCropNames
  **/
  
  
    public List<String> getCommonCropNames() {
    return commonCropNames;
  }

  public void setCommonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
  }

  public GermplasmSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public GermplasmSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * List of IDs which uniquely identify germplasm to search for
   * @return germplasmDbIds
  **/
  
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public GermplasmSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public GermplasmSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * List of human readable names to identify germplasm to search for
   * @return germplasmNames
  **/
  
  
    public List<String> getGermplasmNames() {
    return germplasmNames;
  }

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public GermplasmSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public GermplasmSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
    if (this.studyDbIds == null) {
      this.studyDbIds = new ArrayList<String>();
    }
    this.studyDbIds.add(studyDbIdsItem);
    return this;
  }

  /**
   * List of study identifiers to search for
   * @return studyDbIds
  **/
  
  
    public List<String> getStudyDbIds() {
    return studyDbIds;
  }

  public void setStudyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
  }

  public GermplasmSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public GermplasmSearchRequest addStudyNamesItem(String studyNamesItem) {
    if (this.studyNames == null) {
      this.studyNames = new ArrayList<String>();
    }
    this.studyNames.add(studyNamesItem);
    return this;
  }

  /**
   * List of study names to filter search results
   * @return studyNames
  **/
  
  
    public List<String> getStudyNames() {
    return studyNames;
  }

  public void setStudyNames(List<String> studyNames) {
    this.studyNames = studyNames;
  }

  public GermplasmSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public GermplasmSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * List of external references for the trait to search for
   * @return externalReferenceIDs
  **/
  
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public GermplasmSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public GermplasmSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
    if (this.externalReferenceSources == null) {
      this.externalReferenceSources = new ArrayList<String>();
    }
    this.externalReferenceSources.add(externalReferenceSourcesItem);
    return this;
  }

  /**
   * List of external references sources for the trait to search for
   * @return externalReferenceSources
  **/
  
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public GermplasmSearchRequest accessionNumbers(List<String> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
    return this;
  }

  public GermplasmSearchRequest addAccessionNumbersItem(String accessionNumbersItem) {
    if (this.accessionNumbers == null) {
      this.accessionNumbers = new ArrayList<String>();
    }
    this.accessionNumbers.add(accessionNumbersItem);
    return this;
  }

  /**
   * List unique identifiers for accessions within a genebank
   * @return accessionNumbers
  **/
  
  
    public List<String> getAccessionNumbers() {
    return accessionNumbers;
  }

  public void setAccessionNumbers(List<String> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
  }

  public GermplasmSearchRequest collections(List<String> collections) {
    this.collections = collections;
    return this;
  }

  public GermplasmSearchRequest addCollectionsItem(String collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<String>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * A specific panel/collection/population name this germplasm belongs to.
   * @return collections
  **/
  
  
    public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  public GermplasmSearchRequest genus(List<String> genus) {
    this.genus = genus;
    return this;
  }

  public GermplasmSearchRequest addGenusItem(String genusItem) {
    if (this.genus == null) {
      this.genus = new ArrayList<String>();
    }
    this.genus.add(genusItem);
    return this;
  }

  /**
   * List of Genus names to identify germplasm
   * @return genus
  **/
  
  
    public List<String> getGenus() {
    return genus;
  }

  public void setGenus(List<String> genus) {
    this.genus = genus;
  }

  public GermplasmSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
    this.germplasmPUIs = germplasmPUIs;
    return this;
  }

  public GermplasmSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
    if (this.germplasmPUIs == null) {
      this.germplasmPUIs = new ArrayList<String>();
    }
    this.germplasmPUIs.add(germplasmPUIsItem);
    return this;
  }

  /**
   * List of Permanent Unique Identifiers to identify germplasm
   * @return germplasmPUIs
  **/
  
  
    public List<String> getGermplasmPUIs() {
    return germplasmPUIs;
  }

  public void setGermplasmPUIs(List<String> germplasmPUIs) {
    this.germplasmPUIs = germplasmPUIs;
  }

  public GermplasmSearchRequest parentDbIds(List<String> parentDbIds) {
    this.parentDbIds = parentDbIds;
    return this;
  }

  public GermplasmSearchRequest addParentDbIdsItem(String parentDbIdsItem) {
    if (this.parentDbIds == null) {
      this.parentDbIds = new ArrayList<String>();
    }
    this.parentDbIds.add(parentDbIdsItem);
    return this;
  }

  /**
   * Search for Germplasm with these parents
   * @return parentDbIds
  **/
  
  
    public List<String> getParentDbIds() {
    return parentDbIds;
  }

  public void setParentDbIds(List<String> parentDbIds) {
    this.parentDbIds = parentDbIds;
  }

  public GermplasmSearchRequest progenyDbIds(List<String> progenyDbIds) {
    this.progenyDbIds = progenyDbIds;
    return this;
  }

  public GermplasmSearchRequest addProgenyDbIdsItem(String progenyDbIdsItem) {
    if (this.progenyDbIds == null) {
      this.progenyDbIds = new ArrayList<String>();
    }
    this.progenyDbIds.add(progenyDbIdsItem);
    return this;
  }

  /**
   * Search for Germplasm with these children
   * @return progenyDbIds
  **/
  
  
    public List<String> getProgenyDbIds() {
    return progenyDbIds;
  }

  public void setProgenyDbIds(List<String> progenyDbIds) {
    this.progenyDbIds = progenyDbIds;
  }

  public GermplasmSearchRequest species(List<String> species) {
    this.species = species;
    return this;
  }

  public GermplasmSearchRequest addSpeciesItem(String speciesItem) {
    if (this.species == null) {
      this.species = new ArrayList<String>();
    }
    this.species.add(speciesItem);
    return this;
  }

  /**
   * List of Species names to identify germplasm
   * @return species
  **/
  
  
    public List<String> getSpecies() {
    return species;
  }

  public void setSpecies(List<String> species) {
    this.species = species;
  }

  public GermplasmSearchRequest synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public GermplasmSearchRequest addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

  /**
   * List of alternative names or IDs used to reference this germplasm
   * @return synonyms
  **/
  
  
    public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmSearchRequest germplasmSearchRequest = (GermplasmSearchRequest) o;
    return Objects.equals(this.commonCropNames, germplasmSearchRequest.commonCropNames) &&
        Objects.equals(this.germplasmDbIds, germplasmSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, germplasmSearchRequest.germplasmNames) &&
        Objects.equals(this.studyDbIds, germplasmSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, germplasmSearchRequest.studyNames) &&
        Objects.equals(this.externalReferenceIDs, germplasmSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, germplasmSearchRequest.externalReferenceSources) &&
        Objects.equals(this.accessionNumbers, germplasmSearchRequest.accessionNumbers) &&
        Objects.equals(this.collections, germplasmSearchRequest.collections) &&
        Objects.equals(this.genus, germplasmSearchRequest.genus) &&
        Objects.equals(this.germplasmPUIs, germplasmSearchRequest.germplasmPUIs) &&
        Objects.equals(this.parentDbIds, germplasmSearchRequest.parentDbIds) &&
        Objects.equals(this.progenyDbIds, germplasmSearchRequest.progenyDbIds) &&
        Objects.equals(this.species, germplasmSearchRequest.species) &&
        Objects.equals(this.synonyms, germplasmSearchRequest.synonyms) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonCropNames, germplasmDbIds, germplasmNames, studyDbIds, studyNames, externalReferenceIDs, externalReferenceSources, accessionNumbers, collections, genus, germplasmPUIs, parentDbIds, progenyDbIds, species, synonyms, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    germplasmPUIs: ").append(toIndentedString(germplasmPUIs)).append("\n");
    sb.append("    parentDbIds: ").append(toIndentedString(parentDbIds)).append("\n");
    sb.append("    progenyDbIds: ").append(toIndentedString(progenyDbIds)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
