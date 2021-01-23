package org.brapi.v2.model.germ;

import java.time.LocalDate;
import java.util.*;

import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;


/**
 * Germplasm
 */


public class BrAPIGermplasm {
	@JsonProperty("germplasmDbId")
	private String germplasmDbId = null;

	@JsonProperty("accessionNumber")
	private String accessionNumber = null;

	@JsonProperty("acquisitionDate")
	private LocalDate acquisitionDate = null;

	@JsonProperty("additionalInfo")
	@Valid
	private Map<String, String> additionalInfo = null;

	@JsonProperty("biologicalStatusOfAccessionCode")
	private BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode = null;

	@JsonProperty("biologicalStatusOfAccessionDescription")
	private String biologicalStatusOfAccessionDescription = null;

	@JsonProperty("breedingMethodDbId")
	private String breedingMethodDbId = null;

	@JsonProperty("collection")
	private String collection = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("countryOfOriginCode")
	private String countryOfOriginCode = null;

	@JsonProperty("defaultDisplayName")
	private String defaultDisplayName = null;

	@JsonProperty("documentationURL")
	private String documentationURL = null;

	@JsonProperty("donors")
	@Valid
	private List<BrAPIGermplasmDonors> donors = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("genus")
	private String genus = null;

	@JsonProperty("germplasmName")
	private String germplasmName = null;

	@JsonProperty("germplasmOrigin")
	@Valid
	private List<BrAPIGermplasmOrigin> germplasmOrigin = null;

	@JsonProperty("germplasmPUI")
	private String germplasmPUI = null;

	@JsonProperty("germplasmPreprocessing")
	private String germplasmPreprocessing = null;

	@JsonProperty("instituteCode")
	private String instituteCode = null;

	@JsonProperty("instituteName")
	private String instituteName = null;

	@JsonProperty("pedigree")
	private String pedigree = null;

	@JsonProperty("seedSource")
	private String seedSource = null;

	@JsonProperty("seedSourceDescription")
	private String seedSourceDescription = null;

	@JsonProperty("species")
	private String species = null;

	@JsonProperty("speciesAuthority")
	private String speciesAuthority = null;

	@JsonProperty("storageTypes")
	@Valid
	private List<BrAPIGermplasmStorageTypes> storageTypes = null;

	@JsonProperty("subtaxa")
	private String subtaxa = null;

	@JsonProperty("subtaxaAuthority")
	private String subtaxaAuthority = null;

	@JsonProperty("synonyms")
	@Valid
	private List<BrAPIGermplasmSynonyms> synonyms = null;

	@JsonProperty("taxonIds")
	@Valid
	private List<BrAPITaxonID> taxonIds = null;

	public BrAPIGermplasm germplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a germplasm within the given database server
	 * MIAPPE V1.1 (DM-41) Biological material ID - Code used to identify the
	 * biological material in the data file. Should be unique within the
	 * Investigation. Can correspond to experimental plant ID, seed lot ID, etc.
	 * This material identification is different from a BiosampleID which
	 * corresponds to Observation Unit or Samples sections below.
	 *
	 * @return germplasmDbId
	 **/



	public String getGermplasmDbId() {
		return germplasmDbId;
	}

	public void setGermplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
	}

	public BrAPIGermplasm accessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
		return this;
	}

	/**
	 * This is the unique identifier for accessions within a genebank, and is
	 * assigned when a sample is entered into the genebank collection
	 *
	 * @return accessionNumber
	 **/


	public String getAccessionNumber() {
		return accessionNumber;
	}

	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}

	public BrAPIGermplasm acquisitionDate(LocalDate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	/**
	 * The date this germplasm was acquired by the genebank MCPD (v2.1) (ACQDATE)
	 * 12. Date on which the accession entered the collection [YYYYMMDD] where YYYY
	 * is the year, MM is the month and DD is the day. Missing data (MM or DD)
	 * should be indicated with hyphens or \"00\" [double zero].
	 *
	 * @return acquisitionDate
	 **/


	@Valid
	public LocalDate getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(LocalDate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public BrAPIGermplasm additionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIGermplasm putAdditionalInfoItem(String key, String additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new HashMap<String, String>();
		}
		this.additionalInfo.put(key, additionalInfoItem);
		return this;
	}

	/**
	 * Additional arbitrary info
	 *
	 * @return additionalInfo
	 **/


	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPIGermplasm biologicalStatusOfAccessionCode(
			BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode) {
		this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
		return this;
	}

	/**
	 * MCPD (v2.1) (SAMPSTAT) 19. The coding scheme proposed can be used at 3
	 * different levels of detail: either by using the general codes such as 100,
	 * 200, 300, 400, or by using the more specific codes such as 110, 120, etc.
	 * 100) Wild 110) Natural 120) Semi-natural/wild 130) Semi-natural/sown 200)
	 * Weedy 300) Traditional cultivar/landrace 400) Breeding/research material 410)
	 * Breeders line 411) Synthetic population 412) Hybrid 413) Founder stock/base
	 * population 414) Inbred line (parent of hybrid cultivar) 415) Segregating
	 * population 416) Clonal selection 420) Genetic stock 421) Mutant (e.g.
	 * induced/insertion mutants, tilling populations) 422) Cytogenetic stocks (e.g.
	 * chromosome addition/substitution, aneuploids, amphiploids) 423) Other genetic
	 * stocks (e.g. mapping populations) 500) Advanced or improved cultivar
	 * (conventional breeding methods) 600) GMO (by genetic engineering) 999) Other
	 * (Elaborate in REMARKS field)
	 *
	 * @return biologicalStatusOfAccessionCode
	 **/


	public BrAPIBiologicalStatusOfAccessionCode getBiologicalStatusOfAccessionCode() {
		return biologicalStatusOfAccessionCode;
	}

	public void setBiologicalStatusOfAccessionCode(BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode) {
		this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
	}

	public BrAPIGermplasm biologicalStatusOfAccessionDescription(String biologicalStatusOfAccessionDescription) {
		this.biologicalStatusOfAccessionDescription = biologicalStatusOfAccessionDescription;
		return this;
	}

	/**
	 * Supplemental text description for 'biologicalStatusOfAccessionCode'
	 *
	 * @return biologicalStatusOfAccessionDescription
	 **/


	public String getBiologicalStatusOfAccessionDescription() {
		return biologicalStatusOfAccessionDescription;
	}

	public void setBiologicalStatusOfAccessionDescription(String biologicalStatusOfAccessionDescription) {
		this.biologicalStatusOfAccessionDescription = biologicalStatusOfAccessionDescription;
	}

	public BrAPIGermplasm breedingMethodDbId(String breedingMethodDbId) {
		this.breedingMethodDbId = breedingMethodDbId;
		return this;
	}

	/**
	 * The unique identifier for the breeding method used to create this germplasm
	 *
	 * @return breedingMethodDbId
	 **/


	public String getBreedingMethodDbId() {
		return breedingMethodDbId;
	}

	public void setBreedingMethodDbId(String breedingMethodDbId) {
		this.breedingMethodDbId = breedingMethodDbId;
	}

	public BrAPIGermplasm collection(String collection) {
		this.collection = collection;
		return this;
	}

	/**
	 * A specific panel/collection/population name this germplasm belongs to.
	 *
	 * @return collection
	 **/


	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public BrAPIGermplasm commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPIGermplasm countryOfOriginCode(String countryOfOriginCode) {
		this.countryOfOriginCode = countryOfOriginCode;
		return this;
	}

	/**
	 * 3-letter ISO 3166-1 code of the country in which the sample was originally
	 * collected MCPD (v2.1) (ORIGCTY) 13. 3-letter ISO 3166-1 code of the country
	 * in which the sample was originally collected (e.g. landrace, crop wild
	 * relative, farmers variety), bred or selected (breeding lines, GMOs,
	 * segregating populations, hybrids, modern cultivars, etc.). Note- Descriptors
	 * 14 to 16 below should be completed accordingly only if it was \"collected\".
	 *
	 * @return countryOfOriginCode
	 **/


	public String getCountryOfOriginCode() {
		return countryOfOriginCode;
	}

	public void setCountryOfOriginCode(String countryOfOriginCode) {
		this.countryOfOriginCode = countryOfOriginCode;
	}

	public BrAPIGermplasm defaultDisplayName(String defaultDisplayName) {
		this.defaultDisplayName = defaultDisplayName;
		return this;
	}

	/**
	 * Human readable name used for display purposes
	 *
	 * @return defaultDisplayName
	 **/


	public String getDefaultDisplayName() {
		return defaultDisplayName;
	}

	public void setDefaultDisplayName(String defaultDisplayName) {
		this.defaultDisplayName = defaultDisplayName;
	}

	public BrAPIGermplasm documentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
		return this;
	}

	/**
	 * A URL to the human readable documentation of this object
	 *
	 * @return documentationURL
	 **/


	public String getDocumentationURL() {
		return documentationURL;
	}

	public void setDocumentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
	}

	public BrAPIGermplasm donors(List<BrAPIGermplasmDonors> donors) {
		this.donors = donors;
		return this;
	}

	public BrAPIGermplasm addDonorsItem(BrAPIGermplasmDonors donorsItem) {
		if (this.donors == null) {
			this.donors = new ArrayList<BrAPIGermplasmDonors>();
		}
		this.donors.add(donorsItem);
		return this;
	}

	/**
	 * List of donor institutes
	 *
	 * @return donors
	 **/

	@Valid
	public List<BrAPIGermplasmDonors> getDonors() {
		return donors;
	}

	public void setDonors(List<BrAPIGermplasmDonors> donors) {
		this.donors = donors;
	}

	public BrAPIGermplasm externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 *
	 * @return externalReferences
	 **/


	@Valid
	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIGermplasm genus(String genus) {
		this.genus = genus;
		return this;
	}

	/**
	 * Genus name for taxon. Initial uppercase letter required. MCPD (v2.1) (GENUS)
	 * 5. Genus name for taxon. Initial uppercase letter required. MIAPPE V1.1
	 * (DM-43) Genus - Genus name for the organism under study, according to
	 * standard scientific nomenclature.
	 *
	 * @return genus
	 **/


	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public BrAPIGermplasm germplasmName(String germplasmName) {
		this.germplasmName = germplasmName;
		return this;
	}

	public String getGermplasmName() {
		return germplasmName;
	}

	public void setGermplasmName(String germplasmName) {
		this.germplasmName = germplasmName;
	}

	public BrAPIGermplasm germplasmOrigin(List<BrAPIGermplasmOrigin> germplasmOrigin) {
		this.germplasmOrigin = germplasmOrigin;
		return this;
	}

	public BrAPIGermplasm addGermplasmOriginItem(BrAPIGermplasmOrigin germplasmOriginItem) {
		if (this.germplasmOrigin == null) {
			this.germplasmOrigin = new ArrayList<BrAPIGermplasmOrigin>();
		}
		this.germplasmOrigin.add(germplasmOriginItem);
		return this;
	}

	/**
	 * Information for material (orchard, natural sites, ...). Geographic
	 * identification of the plants from which seeds or cutting have been taken to
	 * produce that germplasm.
	 *
	 * @return germplasmOrigin
	 **/

	@Valid
	public List<BrAPIGermplasmOrigin> getGermplasmOrigin() {
		return germplasmOrigin;
	}

	public void setGermplasmOrigin(List<BrAPIGermplasmOrigin> germplasmOrigin) {
		this.germplasmOrigin = germplasmOrigin;
	}

	public BrAPIGermplasm germplasmPUI(String germplasmPUI) {
		this.germplasmPUI = germplasmPUI;
		return this;
	}

	public String getGermplasmPUI() {
		return germplasmPUI;
	}

	public void setGermplasmPUI(String germplasmPUI) {
		this.germplasmPUI = germplasmPUI;
	}

	public BrAPIGermplasm germplasmPreprocessing(String germplasmPreprocessing) {
		this.germplasmPreprocessing = germplasmPreprocessing;
		return this;
	}

	/**
	 * Description of any process or treatment applied uniformly to the germplasm,
	 * prior to the study itself. Can be provided as free text or as an accession
	 * number from a suitable controlled vocabulary.
	 *
	 * @return germplasmPreprocessing
	 **/


	public String getGermplasmPreprocessing() {
		return germplasmPreprocessing;
	}

	public void setGermplasmPreprocessing(String germplasmPreprocessing) {
		this.germplasmPreprocessing = germplasmPreprocessing;
	}

	public BrAPIGermplasm instituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
		return this;
	}

	/**
	 * The code for the Institute that has bred the material. MCPD (v2.1) (INSTCODE)
	 * 1. FAO WIEWS code of the institute where the accession is maintained. The
	 * codes consist of the 3-letter ISO 3166 country code of the country where the
	 * institute is located plus a number (e.g. PER001). The current set of
	 * institute codes is available from http://www.fao.org/wiews. For those
	 * institutes not yet having an FAO Code, or for those with \"obsolete\" codes,
	 * see \"Common formatting rules (v)\".
	 *
	 * @return instituteCode
	 **/


	public String getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public BrAPIGermplasm instituteName(String instituteName) {
		this.instituteName = instituteName;
		return this;
	}

	/**
	 * The name of the institution which bred the material
	 *
	 * @return instituteName
	 **/


	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public BrAPIGermplasm pedigree(String pedigree) {
		this.pedigree = pedigree;
		return this;
	}

	/**
	 * The cross name and optional selection history.
	 *
	 * @return pedigree
	 **/


	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}

	public BrAPIGermplasm seedSource(String seedSource) {
		this.seedSource = seedSource;
		return this;
	}

	/**
	 * The source of the seed
	 *
	 * @return seedSource
	 **/


	public String getSeedSource() {
		return seedSource;
	}

	public void setSeedSource(String seedSource) {
		this.seedSource = seedSource;
	}

	public BrAPIGermplasm seedSourceDescription(String seedSourceDescription) {
		this.seedSourceDescription = seedSourceDescription;
		return this;
	}

	/**
	 * Description of the material source
	 *
	 * @return seedSourceDescription
	 **/


	public String getSeedSourceDescription() {
		return seedSourceDescription;
	}

	public void setSeedSourceDescription(String seedSourceDescription) {
		this.seedSourceDescription = seedSourceDescription;
	}

	public BrAPIGermplasm species(String species) {
		this.species = species;
		return this;
	}

	/**
	 * Specific epithet portion of the scientific name in lowercase letters. MCPD
	 * (v2.1) (SPECIES) 6. Specific epithet portion of the scientific name in
	 * lowercase letters. Only the following abbreviation is allowed: \"sp.\" MIAPPE
	 * V1.1 (DM-44) Species - Species name (formally: specific epithet) for the
	 * organism under study, according to standard scientific nomenclature.
	 *
	 * @return species
	 **/


	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public BrAPIGermplasm speciesAuthority(String speciesAuthority) {
		this.speciesAuthority = speciesAuthority;
		return this;
	}

	/**
	 * The authority organization responsible for tracking and maintaining the
	 * species name MCPD (v2.1) (SPAUTHOR) 7. Provide the authority for the species
	 * name.
	 *
	 * @return speciesAuthority
	 **/


	public String getSpeciesAuthority() {
		return speciesAuthority;
	}

	public void setSpeciesAuthority(String speciesAuthority) {
		this.speciesAuthority = speciesAuthority;
	}

	public BrAPIGermplasm storageTypes(List<BrAPIGermplasmStorageTypes> storageTypes) {
		this.storageTypes = storageTypes;
		return this;
	}

	public BrAPIGermplasm addStorageTypesItem(BrAPIGermplasmStorageTypes storageTypesItem) {
		if (this.storageTypes == null) {
			this.storageTypes = new ArrayList<BrAPIGermplasmStorageTypes>();
		}
		this.storageTypes.add(storageTypesItem);
		return this;
	}

	/**
	 * The type of storage this germplasm is kept in at a genebank.
	 *
	 * @return storageTypes
	 **/

	@Valid
	public List<BrAPIGermplasmStorageTypes> getStorageTypes() {
		return storageTypes;
	}

	public void setStorageTypes(List<BrAPIGermplasmStorageTypes> storageTypes) {
		this.storageTypes = storageTypes;
	}

	public BrAPIGermplasm subtaxa(String subtaxa) {
		this.subtaxa = subtaxa;
		return this;
	}

	/**
	 * Subtaxon can be used to store any additional taxonomic identifier. MCPD
	 * (v2.1) (SUBTAXA) 8. Subtaxon can be used to store any additional taxonomic
	 * identifier. The following abbreviations are allowed: \"subsp.\" (for
	 * subspecies); \"convar.\" (for convariety); \"var.\" (for variety); \"f.\"
	 * (for form); \"Group\" (for \"cultivar group\"). MIAPPE V1.1 (DM-44)
	 * Infraspecific name - Name of any subtaxa level, including variety, crossing
	 * name, etc. It can be used to store any additional taxonomic identifier.
	 * Either free text description or key-value pair list format (the key is the
	 * name of the rank and the value is the value of the rank). Ranks can be among
	 * the following terms: subspecies, cultivar, variety, subvariety, convariety,
	 * group, subgroup, hybrid, line, form, subform. For MCPD compliance, the
	 * following abbreviations are allowed: subsp. (subspecies); convar.
	 * (convariety); var. (variety); f. (form); Group (cultivar group).
	 *
	 * @return subtaxa
	 **/


	public String getSubtaxa() {
		return subtaxa;
	}

	public void setSubtaxa(String subtaxa) {
		this.subtaxa = subtaxa;
	}

	public BrAPIGermplasm subtaxaAuthority(String subtaxaAuthority) {
		this.subtaxaAuthority = subtaxaAuthority;
		return this;
	}

	/**
	 * The authority organization responsible for tracking and maintaining the
	 * subtaxon information MCPD (v2.1) (SUBTAUTHOR) 9. Provide the subtaxon
	 * authority at the most detailed taxonomic level.
	 *
	 * @return subtaxaAuthority
	 **/


	public String getSubtaxaAuthority() {
		return subtaxaAuthority;
	}

	public void setSubtaxaAuthority(String subtaxaAuthority) {
		this.subtaxaAuthority = subtaxaAuthority;
	}

	public BrAPIGermplasm synonyms(List<BrAPIGermplasmSynonyms> synonyms) {
		this.synonyms = synonyms;
		return this;
	}

	public BrAPIGermplasm addSynonymsItem(BrAPIGermplasmSynonyms synonymsItem) {
		if (this.synonyms == null) {
			this.synonyms = new ArrayList<BrAPIGermplasmSynonyms>();
		}
		this.synonyms.add(synonymsItem);
		return this;
	}

	/**
	 * List of alternative names or IDs used to reference this germplasm
	 *
	 * @return synonyms
	 **/

	@Valid
	public List<BrAPIGermplasmSynonyms> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(List<BrAPIGermplasmSynonyms> synonyms) {
		this.synonyms = synonyms;
	}

	public BrAPIGermplasm taxonIds(List<BrAPITaxonID> taxonIds) {
		this.taxonIds = taxonIds;
		return this;
	}

	public BrAPIGermplasm addTaxonIdsItem(BrAPITaxonID taxonIdsItem) {
		if (this.taxonIds == null) {
			this.taxonIds = new ArrayList<BrAPITaxonID>();
		}
		this.taxonIds.add(taxonIdsItem);
		return this;
	}

	/**
	 * The list of IDs for this SPECIES from different sources. If present, NCBI
	 * Taxon should be always listed as \"ncbiTaxon\" preferably with a purl. The
	 * rank of this ID should be species. MIAPPE V1.1 (DM-42) Organism - An
	 * identifier for the organism at the species level. Use of the NCBI taxon ID is
	 * recommended.
	 *
	 * @return taxonIds
	 **/

	@Valid
	public List<BrAPITaxonID> getTaxonIds() {
		return taxonIds;
	}

	public void setTaxonIds(List<BrAPITaxonID> taxonIds) {
		this.taxonIds = taxonIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIGermplasm germplasm = (BrAPIGermplasm) o;
		return Objects.equals(this.germplasmDbId, germplasm.germplasmDbId) &&
				Objects.equals(this.accessionNumber, germplasm.accessionNumber)
				&& Objects.equals(this.acquisitionDate, germplasm.acquisitionDate)
				&& Objects.equals(this.additionalInfo, germplasm.additionalInfo)
				&& Objects.equals(this.biologicalStatusOfAccessionCode,
								  germplasm.biologicalStatusOfAccessionCode)
				&& Objects.equals(this.biologicalStatusOfAccessionDescription,
								  germplasm.biologicalStatusOfAccessionDescription)
				&& Objects.equals(this.breedingMethodDbId, germplasm.breedingMethodDbId)
				&& Objects.equals(this.collection, germplasm.collection)
				&& Objects.equals(this.commonCropName, germplasm.commonCropName)
				&& Objects.equals(this.countryOfOriginCode, germplasm.countryOfOriginCode)
				&& Objects.equals(this.defaultDisplayName, germplasm.defaultDisplayName)
				&& Objects.equals(this.documentationURL, germplasm.documentationURL)
				&& Objects.equals(this.donors, germplasm.donors)
				&& Objects.equals(this.externalReferences, germplasm.externalReferences)
				&& Objects.equals(this.genus, germplasm.genus)
				&& Objects.equals(this.germplasmName, germplasm.germplasmName)
				&& Objects.equals(this.germplasmOrigin, germplasm.germplasmOrigin)
				&& Objects.equals(this.germplasmPUI, germplasm.germplasmPUI)
				&& Objects.equals(this.germplasmPreprocessing, germplasm.germplasmPreprocessing)
				&& Objects.equals(this.instituteCode, germplasm.instituteCode)
				&& Objects.equals(this.instituteName, germplasm.instituteName)
				&& Objects.equals(this.pedigree, germplasm.pedigree)
				&& Objects.equals(this.seedSource, germplasm.seedSource)
				&& Objects.equals(this.seedSourceDescription, germplasm.seedSourceDescription)
				&& Objects.equals(this.species, germplasm.species)
				&& Objects.equals(this.speciesAuthority, germplasm.speciesAuthority)
				&& Objects.equals(this.storageTypes, germplasm.storageTypes)
				&& Objects.equals(this.subtaxa, germplasm.subtaxa)
				&& Objects.equals(this.subtaxaAuthority, germplasm.subtaxaAuthority)
				&& Objects.equals(this.synonyms, germplasm.synonyms)
				&& Objects.equals(this.taxonIds, germplasm.taxonIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(germplasmDbId, accessionNumber, acquisitionDate, additionalInfo, biologicalStatusOfAccessionCode,
							biologicalStatusOfAccessionDescription, breedingMethodDbId, collection, commonCropName,
							countryOfOriginCode, defaultDisplayName, documentationURL, donors, externalReferences, genus,
							germplasmName, germplasmOrigin, germplasmPUI, germplasmPreprocessing, instituteCode, instituteName,
							pedigree, seedSource, seedSourceDescription, species, speciesAuthority, storageTypes, subtaxa,
							subtaxaAuthority, synonyms, taxonIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Germplasm {\n");
		sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
		sb.append("    accessionNumber: ").append(toIndentedString(accessionNumber)).append("\n");
		sb.append("    acquisitionDate: ").append(toIndentedString(acquisitionDate)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    biologicalStatusOfAccessionCode: ").append(toIndentedString(biologicalStatusOfAccessionCode))
		  .append("\n");
		sb.append("    biologicalStatusOfAccessionDescription: ")
		  .append(toIndentedString(biologicalStatusOfAccessionDescription)).append("\n");
		sb.append("    breedingMethodDbId: ").append(toIndentedString(breedingMethodDbId)).append("\n");
		sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    countryOfOriginCode: ").append(toIndentedString(countryOfOriginCode)).append("\n");
		sb.append("    defaultDisplayName: ").append(toIndentedString(defaultDisplayName)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    donors: ").append(toIndentedString(donors)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
		sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
		sb.append("    germplasmOrigin: ").append(toIndentedString(germplasmOrigin)).append("\n");
		sb.append("    germplasmPUI: ").append(toIndentedString(germplasmPUI)).append("\n");
		sb.append("    germplasmPreprocessing: ").append(toIndentedString(germplasmPreprocessing)).append("\n");
		sb.append("    instituteCode: ").append(toIndentedString(instituteCode)).append("\n");
		sb.append("    instituteName: ").append(toIndentedString(instituteName)).append("\n");
		sb.append("    pedigree: ").append(toIndentedString(pedigree)).append("\n");
		sb.append("    seedSource: ").append(toIndentedString(seedSource)).append("\n");
		sb.append("    seedSourceDescription: ").append(toIndentedString(seedSourceDescription)).append("\n");
		sb.append("    species: ").append(toIndentedString(species)).append("\n");
		sb.append("    speciesAuthority: ").append(toIndentedString(speciesAuthority)).append("\n");
		sb.append("    storageTypes: ").append(toIndentedString(storageTypes)).append("\n");
		sb.append("    subtaxa: ").append(toIndentedString(subtaxa)).append("\n");
		sb.append("    subtaxaAuthority: ").append(toIndentedString(subtaxaAuthority)).append("\n");
		sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
		sb.append("    taxonIds: ").append(toIndentedString(taxonIds)).append("\n");
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
