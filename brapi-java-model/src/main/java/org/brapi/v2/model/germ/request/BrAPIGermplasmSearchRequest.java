package org.brapi.v2.model.germ.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * BrAPIGermplasmSearchRequest
 */

public class BrAPIGermplasmSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("accessionNumbers")
	private List<String> accessionNumbers = null;

	@JsonProperty("binomialNames")
	private List<String> binomialNames = null;

	@JsonProperty("collections")
	private List<String> collections = null;

	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@Deprecated
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

	@JsonProperty("instituteCodes")
	private List<String> instituteCodes = null;

	@JsonProperty("parentDbIds")
	private List<String> parentDbIds = null;

	@JsonProperty("progenyDbIds")
	private List<String> progenyDbIds = null;

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

	public BrAPIGermplasmSearchRequest accessionNumbers(List<String> accessionNumbers) {
		this.accessionNumbers = accessionNumbers;
		return this;
	}

	public BrAPIGermplasmSearchRequest addAccessionNumbersItem(String accessionNumbersItem) {
		if (this.accessionNumbers == null) {
			this.accessionNumbers = new ArrayList<String>();
		}
		this.accessionNumbers.add(accessionNumbersItem);
		return this;
	}

	/**
	 * A collection of unique identifiers for materials or germplasm within a
	 * genebank MCPD (v2.1) (ACCENUMB) 2. This is the unique identifier for
	 * accessions within a genebank, and is assigned when a sample is entered into
	 * the genebank collection (e.g. \&quot;PI 113869\&quot;).
	 *
	 * @return accessionNumbers
	 **/

	public List<String> getAccessionNumbers() {
		return accessionNumbers;
	}

	public void setAccessionNumbers(List<String> accessionNumbers) {
		this.accessionNumbers = accessionNumbers;
	}

	public BrAPIGermplasmSearchRequest binomialNames(List<String> binomialNames) {
		this.binomialNames = binomialNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addBinomialNamesItem(String binomialNamesItem) {
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

	public BrAPIGermplasmSearchRequest collections(List<String> collections) {
		this.collections = collections;
		return this;
	}

	public BrAPIGermplasmSearchRequest addCollectionsItem(String collectionsItem) {
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

	public BrAPIGermplasmSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
		if (this.commonCropNames == null) {
			this.commonCropNames = new ArrayList<String>();
		}
		this.commonCropNames.add(commonCropNamesItem);
		return this;
	}

	/**
	 * The BrAPI Common Crop Name is the simple, generalized, widely accepted name
	 * of the organism being researched. It is most often used in multi-crop systems
	 * where digital resources need to be divided at a high level. Things like
	 * &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of
	 * common crop names. Use this parameter to only return results associated with
	 * the given crops. Use &#x60;GET /commoncropnames&#x60; to find the list of
	 * available crops on a server.
	 *
	 * @return commonCropNames
	 **/

	public List<String> getCommonCropNames() {
		return commonCropNames;
	}

	public void setCommonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
	}

	@Deprecated
	public BrAPIGermplasmSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIGermplasmSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
		if (this.externalReferenceIDs == null) {
			this.externalReferenceIDs = new ArrayList<String>();
		}
		this.externalReferenceIDs.add(externalReferenceIDsItem);
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;externalReferenceIds&#x60;. Github
	 * issue number #460 &lt;br&gt;List of external reference IDs. Could be a simple
	 * strings or a URIs. (use with &#x60;externalReferenceSources&#x60; parameter)
	 *
	 * @return externalReferenceIDs
	 **/

	@Deprecated
	public List<String> getExternalReferenceIDs() {
		return externalReferenceIDs;
	}

	@Deprecated
	public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
	}

	public BrAPIGermplasmSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
		if (this.externalReferenceIds == null) {
			this.externalReferenceIds = new ArrayList<String>();
		}
		this.externalReferenceIds.add(externalReferenceIdsItem);
		return this;
	}

	/**
	 * List of external reference IDs. Could be a simple strings or a URIs. (use
	 * with &#x60;externalReferenceSources&#x60; parameter)
	 *
	 * @return externalReferenceIds
	 **/

	public List<String> getExternalReferenceIds() {
		return externalReferenceIds;
	}

	public void setExternalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
	}

	public BrAPIGermplasmSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIGermplasmSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
		if (this.externalReferenceSources == null) {
			this.externalReferenceSources = new ArrayList<String>();
		}
		this.externalReferenceSources.add(externalReferenceSourcesItem);
		return this;
	}

	/**
	 * List of identifiers for the source system or database of an external
	 * reference (use with &#x60;externalReferenceIDs&#x60; parameter)
	 *
	 * @return externalReferenceSources
	 **/

	public List<String> getExternalReferenceSources() {
		return externalReferenceSources;
	}

	public void setExternalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
	}

	public BrAPIGermplasmSearchRequest familyCodes(List<String> familyCodes) {
		this.familyCodes = familyCodes;
		return this;
	}

	public BrAPIGermplasmSearchRequest addFamilyCodesItem(String familyCodesItem) {
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

	public BrAPIGermplasmSearchRequest genus(List<String> genus) {
		this.genus = genus;
		return this;
	}

	public BrAPIGermplasmSearchRequest addGenusItem(String genusItem) {
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

	public BrAPIGermplasmSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

	public BrAPIGermplasmSearchRequest germplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

	public BrAPIGermplasmSearchRequest germplasmPUIs(List<String> germplasmPUIs) {
		this.germplasmPUIs = germplasmPUIs;
		return this;
	}

	public BrAPIGermplasmSearchRequest addGermplasmPUIsItem(String germplasmPUIsItem) {
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

	public BrAPIGermplasmSearchRequest instituteCodes(List<String> instituteCodes) {
		this.instituteCodes = instituteCodes;
		return this;
	}

	public BrAPIGermplasmSearchRequest addInstituteCodesItem(String instituteCodesItem) {
		if (this.instituteCodes == null) {
			this.instituteCodes = new ArrayList<String>();
		}
		this.instituteCodes.add(instituteCodesItem);
		return this;
	}

	/**
	 * The code for the institute that maintains the material. &lt;br/&gt; MCPD
	 * (v2.1) (INSTCODE) 1. FAO WIEWS code of the institute where the accession is
	 * maintained. The codes consist of the 3-letter ISO 3166 country code of the
	 * country where the institute is located plus a number (e.g. PER001). The
	 * current set of institute codes is available from http://www.fao.org/wiews.
	 * For those institutes not yet having an FAO Code, or for those with
	 * \&quot;obsolete\&quot; codes, see \&quot;Common formatting rules (v)\&quot;.
	 *
	 * @return instituteCodes
	 **/

	public List<String> getInstituteCodes() {
		return instituteCodes;
	}

	public void setInstituteCodes(List<String> instituteCodes) {
		this.instituteCodes = instituteCodes;
	}

	public BrAPIGermplasmSearchRequest parentDbIds(List<String> parentDbIds) {
		this.parentDbIds = parentDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addParentDbIdsItem(String parentDbIdsItem) {
		if (this.parentDbIds == null) {
			this.parentDbIds = new ArrayList<String>();
		}
		this.parentDbIds.add(parentDbIdsItem);
		return this;
	}

	/**
	 * Search for Germplasm with these parents
	 *
	 * @return parentDbIds
	 **/

	public List<String> getParentDbIds() {
		return parentDbIds;
	}

	public void setParentDbIds(List<String> parentDbIds) {
		this.parentDbIds = parentDbIds;
	}

	public BrAPIGermplasmSearchRequest progenyDbIds(List<String> progenyDbIds) {
		this.progenyDbIds = progenyDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addProgenyDbIdsItem(String progenyDbIdsItem) {
		if (this.progenyDbIds == null) {
			this.progenyDbIds = new ArrayList<String>();
		}
		this.progenyDbIds.add(progenyDbIdsItem);
		return this;
	}

	/**
	 * Search for Germplasm with these children
	 *
	 * @return progenyDbIds
	 **/

	public List<String> getProgenyDbIds() {
		return progenyDbIds;
	}

	public void setProgenyDbIds(List<String> progenyDbIds) {
		this.progenyDbIds = progenyDbIds;
	}

	public BrAPIGermplasmSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
		if (this.programDbIds == null) {
			this.programDbIds = new ArrayList<String>();
		}
		this.programDbIds.add(programDbIdsItem);
		return this;
	}

	/**
	 * A BrAPI Program represents the high level organization or group who is
	 * responsible for conducting trials and studies. Things like Breeding Programs
	 * and Funded Projects are considered BrAPI Programs. Use this parameter to only
	 * return results associated with the given programs. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programDbIds
	 **/

	public List<String> getProgramDbIds() {
		return programDbIds;
	}

	public void setProgramDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
	}

	public BrAPIGermplasmSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addProgramNamesItem(String programNamesItem) {
		if (this.programNames == null) {
			this.programNames = new ArrayList<String>();
		}
		this.programNames.add(programNamesItem);
		return this;
	}

	/**
	 * Use this parameter to only return results associated with the given program
	 * names. Program names are not required to be unique. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programNames
	 **/

	public List<String> getProgramNames() {
		return programNames;
	}

	public void setProgramNames(List<String> programNames) {
		this.programNames = programNames;
	}

	public BrAPIGermplasmSearchRequest species(List<String> species) {
		this.species = species;
		return this;
	}

	public BrAPIGermplasmSearchRequest addSpeciesItem(String speciesItem) {
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

	public BrAPIGermplasmSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

	public BrAPIGermplasmSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addStudyNamesItem(String studyNamesItem) {
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

	public BrAPIGermplasmSearchRequest synonyms(List<String> synonyms) {
		this.synonyms = synonyms;
		return this;
	}

	public BrAPIGermplasmSearchRequest addSynonymsItem(String synonymsItem) {
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

	public BrAPIGermplasmSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPIGermplasmSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

	public BrAPIGermplasmSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPIGermplasmSearchRequest addTrialNamesItem(String trialNamesItem) {
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
		BrAPIGermplasmSearchRequest germplasmSearchRequest = (BrAPIGermplasmSearchRequest) o;
		return Objects.equals(this.accessionNumbers, germplasmSearchRequest.accessionNumbers)
				&& Objects.equals(this.binomialNames, germplasmSearchRequest.binomialNames)
				&& Objects.equals(this.collections, germplasmSearchRequest.collections)
				&& Objects.equals(this.commonCropNames, germplasmSearchRequest.commonCropNames)
				&& Objects.equals(this.externalReferenceIDs, germplasmSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, germplasmSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources, germplasmSearchRequest.externalReferenceSources)
				&& Objects.equals(this.familyCodes, germplasmSearchRequest.familyCodes)
				&& Objects.equals(this.genus, germplasmSearchRequest.genus)
				&& Objects.equals(this.germplasmDbIds, germplasmSearchRequest.germplasmDbIds)
				&& Objects.equals(this.germplasmNames, germplasmSearchRequest.germplasmNames)
				&& Objects.equals(this.germplasmPUIs, germplasmSearchRequest.germplasmPUIs)
				&& Objects.equals(this.instituteCodes, germplasmSearchRequest.instituteCodes)
				&& Objects.equals(this.parentDbIds, germplasmSearchRequest.parentDbIds)
				&& Objects.equals(this.progenyDbIds, germplasmSearchRequest.progenyDbIds)
				&& Objects.equals(this.programDbIds, germplasmSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, germplasmSearchRequest.programNames)
				&& Objects.equals(this.species, germplasmSearchRequest.species)
				&& Objects.equals(this.studyDbIds, germplasmSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, germplasmSearchRequest.studyNames)
				&& Objects.equals(this.synonyms, germplasmSearchRequest.synonyms)
				&& Objects.equals(this.trialDbIds, germplasmSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, germplasmSearchRequest.trialNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessionNumbers, binomialNames, collections, commonCropNames, externalReferenceIDs,
				externalReferenceIds, externalReferenceSources, familyCodes, genus, germplasmDbIds, germplasmNames,
				germplasmPUIs, instituteCodes, parentDbIds, progenyDbIds, programDbIds, programNames, species,
				studyDbIds, studyNames, synonyms, trialDbIds, trialNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIGermplasmSearchRequest {\n");

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
		sb.append("    instituteCodes: ").append(toIndentedString(instituteCodes)).append("\n");
		sb.append("    parentDbIds: ").append(toIndentedString(parentDbIds)).append("\n");
		sb.append("    progenyDbIds: ").append(toIndentedString(progenyDbIds)).append("\n");
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
