package org.brapi.v2.model.germ;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import javax.validation.Valid;

import org.brapi.v2.model.germ.BrAPIGermplasmMCPDBreedingInstitutes;
import org.brapi.v2.model.germ.BrAPIGermplasmMCPDCollectingInfo;
import org.brapi.v2.model.germ.BrAPIGermplasmMCPDDonorInfo;
import org.brapi.v2.model.germ.BrAPIGermplasmMCPDSafetyDuplicateInstitutes;

/**
 * GermplasmMCPD
 */


public class BrAPIGermplasmMCPD   {
  @JsonProperty("accessionNames")
  @Valid
  private List<String> accessionNames = null;

  @JsonProperty("accessionNumber")
  private String accessionNumber = null;

  @JsonProperty("acquisitionDate")
  private LocalDate acquisitionDate = null;

  /**
   * MCPD (v2.1) (COLLSRC) 21. The coding scheme proposed can be used at 2 different levels of detail: either by using the general codes (in bold-face) such as 10, 20, 30, 40, etc., or by using the more specific codes, such as 11, 12, etc.   10) Wild habitat  11) Forest or woodland  12) Shrubland  13) Grassland  14) Desert or tundra  15) Aquatic habitat  20) Farm or cultivated habitat  21) Field  22) Orchard  23) Backyard, kitchen or home garden (urban, peri-urban or rural)  24) Fallow land  25) Pasture  26) Farm store  27) Threshing floor  28) Park  30) Market or shop  40) Institute, Experimental station, Research organization, Genebank  50) Seed company  60) Weedy, disturbed or ruderal habitat  61) Roadside  62) Field margin  99) Other (Elaborate in REMARKS field)
   */
  public enum AcquisitionSourceCodeEnum {
    _10("10"),
    _11("11"),
    _12("12"),
    _13("13"),
    _14("14"),
    _15("15"),
    _20("20"),
    _21("21"),
    _22("22"),
    _23("23"),
    _24("24"),
    _25("25"),
    _26("26"),
    _27("27"),
    _28("28"),
    _30("30"),
    _40("40"),
    _50("50"),
    _60("60"),
    _61("61"),
    _62("62"),
    _99("99");

    private String value;

    AcquisitionSourceCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AcquisitionSourceCodeEnum fromValue(String text) {
      for (AcquisitionSourceCodeEnum b : AcquisitionSourceCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("acquisitionSourceCode")
  private AcquisitionSourceCodeEnum acquisitionSourceCode = null;

  @JsonProperty("alternateIDs")
  @Valid
  private List<String> alternateIDs = null;

  @JsonProperty("ancestralData")
  private String ancestralData = null;

  @JsonProperty("biologicalStatusOfAccessionCode")
  private BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode = null;

  @JsonProperty("breedingInstitutes")
  @Valid
  private List<BrAPIGermplasmMCPDBreedingInstitutes> breedingInstitutes = null;

  @JsonProperty("collectingInfo")
  private BrAPIGermplasmMCPDCollectingInfo collectingInfo = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("countryOfOrigin")
  private String countryOfOrigin = null;

  @JsonProperty("donorInfo")
  private BrAPIGermplasmMCPDDonorInfo donorInfo = null;

  @JsonProperty("genus")
  private String genus = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmPUI")
  private String germplasmPUI = null;

  @JsonProperty("instituteCode")
  private String instituteCode = null;

  /**
   * MCPD (v2.1) (MLSSTAT) 27. The status of an accession with regards to the Multilateral System (MLS) of the International Treaty on Plant Genetic Resources for Food and Agriculture. Leave the value empty if the status is not known 0 No (not included) 1 Yes (included) 99 Other (elaborate in REMARKS field, e.g. \"under development\")
   */
  public enum MlsStatusEnum {
    EMPTY(""),
    
    _0("0"),
    
    _1("1"),
    
    _99("99");

    private String value;

    MlsStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MlsStatusEnum fromValue(String text) {
      for (MlsStatusEnum b : MlsStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("mlsStatus")
  private MlsStatusEnum mlsStatus = null;

  @JsonProperty("remarks")
  private String remarks = null;

  @JsonProperty("safetyDuplicateInstitutes")
  @Valid
  private List<BrAPIGermplasmMCPDSafetyDuplicateInstitutes> safetyDuplicateInstitutes = null;

  @JsonProperty("species")
  private String species = null;

  @JsonProperty("speciesAuthority")
  private String speciesAuthority = null;

  @JsonProperty("storageTypeCodes")
  @Valid
  private List<BrAPIGermplasmStorageTypesEnum> storageTypeCodes = null;

  @JsonProperty("subtaxon")
  private String subtaxon = null;

  @JsonProperty("subtaxonAuthority")
  private String subtaxonAuthority = null;

  public BrAPIGermplasmMCPD accessionNames(List<String> accessionNames) {
    this.accessionNames = accessionNames;
    return this;
  }

  public BrAPIGermplasmMCPD addAccessionNamesItem(String accessionNamesItem) {
    if (this.accessionNames == null) {
      this.accessionNames = new ArrayList<String>();
    }
    this.accessionNames.add(accessionNamesItem);
    return this;
  }

  /**
   * MCPD (v2.1) (ACCENAME) 11. Either a registered or other designation given to the material received, other than the donors accession number (23) or collecting number (3). First letter uppercase. Multiple names are separated by a semicolon without space.
   * @return accessionNames
  **/
  
  
    public List<String> getAccessionNames() {
    return accessionNames;
  }

  public void setAccessionNames(List<String> accessionNames) {
    this.accessionNames = accessionNames;
  }

  public BrAPIGermplasmMCPD accessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
    return this;
  }

  /**
   * MCPD (v2.1) (ACCENUMB) 2. This is the unique identifier for accessions within a genebank, and is assigned when a sample is entered into the genebank collection (e.g. \"PI 113869\").
   * @return accessionNumber
  **/
  
  
    public String getAccessionNumber() {
    return accessionNumber;
  }

  public void setAccessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
  }

  public BrAPIGermplasmMCPD acquisitionDate(LocalDate acquisitionDate) {
    this.acquisitionDate = acquisitionDate;
    return this;
  }

  /**
   * MCPD (v2.1) (ACQDATE) 12. Date on which the accession entered the collection [YYYYMMDD] where YYYY is the year, MM is the month and DD is the day. Missing data (MM or DD) should be indicated with hyphens or \"00\" [double zero].
   * @return acquisitionDate
  **/
  
  
    @Valid
    public LocalDate getAcquisitionDate() {
    return acquisitionDate;
  }

  public void setAcquisitionDate(LocalDate acquisitionDate) {
    this.acquisitionDate = acquisitionDate;
  }

  public BrAPIGermplasmMCPD acquisitionSourceCode(AcquisitionSourceCodeEnum acquisitionSourceCode) {
    this.acquisitionSourceCode = acquisitionSourceCode;
    return this;
  }

  /**
   * MCPD (v2.1) (COLLSRC) 21. The coding scheme proposed can be used at 2 different levels of detail: either by using the general codes (in bold-face) such as 10, 20, 30, 40, etc., or by using the more specific codes, such as 11, 12, etc.   10) Wild habitat  11) Forest or woodland  12) Shrubland  13) Grassland  14) Desert or tundra  15) Aquatic habitat  20) Farm or cultivated habitat  21) Field  22) Orchard  23) Backyard, kitchen or home garden (urban, peri-urban or rural)  24) Fallow land  25) Pasture  26) Farm store  27) Threshing floor  28) Park  30) Market or shop  40) Institute, Experimental station, Research organization, Genebank  50) Seed company  60) Weedy, disturbed or ruderal habitat  61) Roadside  62) Field margin  99) Other (Elaborate in REMARKS field)
   * @return acquisitionSourceCode
  **/
  
  
    public AcquisitionSourceCodeEnum getAcquisitionSourceCode() {
    return acquisitionSourceCode;
  }

  public void setAcquisitionSourceCode(AcquisitionSourceCodeEnum acquisitionSourceCode) {
    this.acquisitionSourceCode = acquisitionSourceCode;
  }

  public BrAPIGermplasmMCPD alternateIDs(List<String> alternateIDs) {
    this.alternateIDs = alternateIDs;
    return this;
  }

  public BrAPIGermplasmMCPD addAlternateIDsItem(String alternateIDsItem) {
    if (this.alternateIDs == null) {
      this.alternateIDs = new ArrayList<String>();
    }
    this.alternateIDs.add(alternateIDsItem);
    return this;
  }

  /**
   * MCPD (v2.1) (OTHERNUMB) 24. Any other identifiers known to exist in other collections for this accession. Use the following format: INSTCODE:ACCENUMB;INSTCODE:identifier;INSTCODE and identifier are separated by a colon without space. Pairs of INSTCODE and identifier are separated by a semicolon without space. When the institute is not known, the identifier should be preceded by a colon. 
   * @return alternateIDs
  **/
  
  
    public List<String> getAlternateIDs() {
    return alternateIDs;
  }

  public void setAlternateIDs(List<String> alternateIDs) {
    this.alternateIDs = alternateIDs;
  }

  public BrAPIGermplasmMCPD ancestralData(String ancestralData) {
    this.ancestralData = ancestralData;
    return this;
  }

  /**
   * MCPD (v2.1) (ANCEST) 20. Information about either pedigree or other description of ancestral information (e.g. parent variety in case of mutant or selection). For example a pedigree 'Hanna/7*Atlas//Turk/8*Atlas' or a description 'mutation found in Hanna', 'selection from Irene' or 'cross involving amongst others Hanna and Irene'.
   * @return ancestralData
  **/
  
  
    public String getAncestralData() {
    return ancestralData;
  }

  public void setAncestralData(String ancestralData) {
    this.ancestralData = ancestralData;
  }

  public BrAPIGermplasmMCPD biologicalStatusOfAccessionCode(BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode) {
    this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
    return this;
  }

  /**
   * MCPD (v2.1) (SAMPSTAT) 19. The coding scheme proposed can be used at 3 different levels of detail: either by using the general codes such as 100, 200, 300, 400, or by using the more specific codes such as 110, 120, etc.   100) Wild  110) Natural  120) Semi-natural/wild  130) Semi-natural/sown  200) Weedy  300) Traditional cultivar/landrace  400) Breeding/research material  410) Breeders line  411) Synthetic population  412) Hybrid  413) Founder stock/base population  414) Inbred line (parent of hybrid cultivar)  415) Segregating population  416) Clonal selection  420) Genetic stock  421) Mutant (e.g. induced/insertion mutants, tilling populations)  422) Cytogenetic stocks (e.g. chromosome addition/substitution, aneuploids,  amphiploids)  423) Other genetic stocks (e.g. mapping populations)  500) Advanced or improved cultivar (conventional breeding methods)  600) GMO (by genetic engineering)  999) Other (Elaborate in REMARKS field)
   * @return biologicalStatusOfAccessionCode
  **/
  
  
    public BrAPIBiologicalStatusOfAccessionCode getBiologicalStatusOfAccessionCode() {
    return biologicalStatusOfAccessionCode;
  }

  public void setBiologicalStatusOfAccessionCode(BrAPIBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode) {
    this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
  }

  public BrAPIGermplasmMCPD breedingInstitutes(List<BrAPIGermplasmMCPDBreedingInstitutes> breedingInstitutes) {
    this.breedingInstitutes = breedingInstitutes;
    return this;
  }

  public BrAPIGermplasmMCPD addBreedingInstitutesItem(BrAPIGermplasmMCPDBreedingInstitutes breedingInstitutesItem) {
    if (this.breedingInstitutes == null) {
      this.breedingInstitutes = new ArrayList<BrAPIGermplasmMCPDBreedingInstitutes>();
    }
    this.breedingInstitutes.add(breedingInstitutesItem);
    return this;
  }

  /**
   * Get breedingInstitutes
   * @return breedingInstitutes
  **/
  
      @Valid
    public List<BrAPIGermplasmMCPDBreedingInstitutes> getBreedingInstitutes() {
    return breedingInstitutes;
  }

  public void setBreedingInstitutes(List<BrAPIGermplasmMCPDBreedingInstitutes> breedingInstitutes) {
    this.breedingInstitutes = breedingInstitutes;
  }

  public BrAPIGermplasmMCPD collectingInfo(BrAPIGermplasmMCPDCollectingInfo collectingInfo) {
    this.collectingInfo = collectingInfo;
    return this;
  }

  /**
   * Get collectingInfo
   * @return collectingInfo
  **/
  
  
    @Valid
    public BrAPIGermplasmMCPDCollectingInfo getCollectingInfo() {
    return collectingInfo;
  }

  public void setCollectingInfo(BrAPIGermplasmMCPDCollectingInfo collectingInfo) {
    this.collectingInfo = collectingInfo;
  }

  public BrAPIGermplasmMCPD commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

  /**
   * MCPD (v2.1) (CROPNAME) 10. Common name of the crop. Example: \"malting barley\", \"mas\". 
   * @return commonCropName
  **/
  
  
    public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public BrAPIGermplasmMCPD countryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

  /**
   * MCPD (v2.1) (ORIGCTY) 13. 3-letter ISO 3166-1 code of the country in which the sample was originally collected (e.g. landrace, crop wild relative, farmers\" variety), bred or selected (breeding lines, GMOs, segregating populations, hybrids, modern cultivars, etc.). Note: Descriptors 14 to 16 below should be completed accordingly only if it was \"collected\".
   * @return countryOfOrigin
  **/
  
  
    public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public BrAPIGermplasmMCPD donorInfo(BrAPIGermplasmMCPDDonorInfo donorInfo) {
    this.donorInfo = donorInfo;
    return this;
  }

  /**
   * Get donorInfo
   * @return donorInfo
  **/
  
  
    @Valid
    public BrAPIGermplasmMCPDDonorInfo getDonorInfo() {
    return donorInfo;
  }

  public void setDonorInfo(BrAPIGermplasmMCPDDonorInfo donorInfo) {
    this.donorInfo = donorInfo;
  }

  public BrAPIGermplasmMCPD genus(String genus) {
    this.genus = genus;
    return this;
  }

  /**
   * MCPD (v2.1) (GENUS) 5. Genus name for taxon. Initial uppercase letter required.
   * @return genus
  **/
  
  
    public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public BrAPIGermplasmMCPD germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * A unique identifier which identifies a germplasm in this database
   * @return germplasmDbId
  **/
  
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIGermplasmMCPD germplasmPUI(String germplasmPUI) {
    this.germplasmPUI = germplasmPUI;
    return this;
  }

  /**
   * MCPD (v2.1) (PUID) 0. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession. The Secretariat of the International Treaty on Plant Genetic Resources for Food and Agriculture (PGRFA) is facilitating the assignment of a persistent unique identifier (PUID), in the form of a DOI, to PGRFA at the accession level. Genebanks not applying a true PUID to their accessions should use, and request recipients to use, the concatenation of INSTCODE, ACCENUMB, and GENUS as a globally unique identifier similar in most respects to the PUID whenever they exchange information on accessions with third parties.
   * @return germplasmPUI
  **/
  
  
    public String getGermplasmPUI() {
    return germplasmPUI;
  }

  public void setGermplasmPUI(String germplasmPUI) {
    this.germplasmPUI = germplasmPUI;
  }

  public BrAPIGermplasmMCPD instituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
    return this;
  }

  /**
   * MCPD (v2.1) (INSTCODE) 1. FAO WIEWS code of the institute where the accession is maintained. The codes consist of the 3-letter ISO 3166 country code of the country where the institute is located plus a number (e.g. PER001). The current set of institute codes is available from http://www.fao.org/wiews. For those institutes not yet having an FAO Code, or for those with \"obsolete\" codes, see \"Common formatting rules (v)\".
   * @return instituteCode
  **/
  
  
    public String getInstituteCode() {
    return instituteCode;
  }

  public void setInstituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
  }

  public BrAPIGermplasmMCPD mlsStatus(MlsStatusEnum mlsStatus) {
    this.mlsStatus = mlsStatus;
    return this;
  }

  /**
   * MCPD (v2.1) (MLSSTAT) 27. The status of an accession with regards to the Multilateral System (MLS) of the International Treaty on Plant Genetic Resources for Food and Agriculture. Leave the value empty if the status is not known 0 No (not included) 1 Yes (included) 99 Other (elaborate in REMARKS field, e.g. \"under development\")
   * @return mlsStatus
  **/
  
  
    public MlsStatusEnum getMlsStatus() {
    return mlsStatus;
  }

  public void setMlsStatus(MlsStatusEnum mlsStatus) {
    this.mlsStatus = mlsStatus;
  }

  public BrAPIGermplasmMCPD remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * MCPD (v2.1) (REMARKS) 28. The remarks field is used to add notes or to elaborate on descriptors with value 99 or 999 (= Other). Prefix remarks with the field name they refer to and a colon (:) without space (e.g. COLLSRC:riverside). Distinct remarks referring to different fields are separated by semi-colons without space.
   * @return remarks
  **/
  
  
    public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public BrAPIGermplasmMCPD safetyDuplicateInstitutes(List<BrAPIGermplasmMCPDSafetyDuplicateInstitutes> safetyDuplicateInstitutes) {
    this.safetyDuplicateInstitutes = safetyDuplicateInstitutes;
    return this;
  }

  public BrAPIGermplasmMCPD addSafetyDuplicateInstitutesItem(BrAPIGermplasmMCPDSafetyDuplicateInstitutes safetyDuplicateInstitutesItem) {
    if (this.safetyDuplicateInstitutes == null) {
      this.safetyDuplicateInstitutes = new ArrayList<BrAPIGermplasmMCPDSafetyDuplicateInstitutes>();
    }
    this.safetyDuplicateInstitutes.add(safetyDuplicateInstitutesItem);
    return this;
  }

  /**
   * Get safetyDuplicateInstitutes
   * @return safetyDuplicateInstitutes
  **/
  
      @Valid
    public List<BrAPIGermplasmMCPDSafetyDuplicateInstitutes> getSafetyDuplicateInstitutes() {
    return safetyDuplicateInstitutes;
  }

  public void setSafetyDuplicateInstitutes(List<BrAPIGermplasmMCPDSafetyDuplicateInstitutes> safetyDuplicateInstitutes) {
    this.safetyDuplicateInstitutes = safetyDuplicateInstitutes;
  }

  public BrAPIGermplasmMCPD species(String species) {
    this.species = species;
    return this;
  }

  /**
   * MCPD (v2.1) (SPECIES) 6. Specific epithet portion of the scientific name in lowercase letters. Only the following abbreviation is allowed: \"sp.\" 
   * @return species
  **/
  
  
    public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public BrAPIGermplasmMCPD speciesAuthority(String speciesAuthority) {
    this.speciesAuthority = speciesAuthority;
    return this;
  }

  /**
   * MCPD (v2.1) (SPAUTHOR) 7. Provide the authority for the species name.
   * @return speciesAuthority
  **/
  
  
    public String getSpeciesAuthority() {
    return speciesAuthority;
  }

  public void setSpeciesAuthority(String speciesAuthority) {
    this.speciesAuthority = speciesAuthority;
  }

  public BrAPIGermplasmMCPD storageTypeCodes(List<BrAPIGermplasmStorageTypesEnum> storageTypeCodes) {
    this.storageTypeCodes = storageTypeCodes;
    return this;
  }

  public BrAPIGermplasmMCPD addStorageTypeCodesItem(BrAPIGermplasmStorageTypesEnum storageTypeCodesItem) {
    if (this.storageTypeCodes == null) {
      this.storageTypeCodes = new ArrayList<BrAPIGermplasmStorageTypesEnum>();
    }
    this.storageTypeCodes.add(storageTypeCodesItem);
    return this;
  }

  /**
   * MCPD (v2.1) (STORAGE) 26. If germplasm is maintained under different types of storage, multiple choices are allowed, separated by a semicolon (e.g. 20;30). (Refer to FAO/IPGRI Genebank Standards 1994 for details on storage type.) 10) Seed collection 11) Short term 12) Medium term 13) Long term 20) Field collection 30) In vitro collection 40) Cryo-preserved collection 50) DNA collection 99) Other (elaborate in REMARKS field)
   * @return storageTypeCodes
  **/
  
  
    public List<BrAPIGermplasmStorageTypesEnum> getStorageTypeCodes() {
    return storageTypeCodes;
  }

  public void setStorageTypeCodes(List<BrAPIGermplasmStorageTypesEnum> storageTypeCodes) {
    this.storageTypeCodes = storageTypeCodes;
  }

  public BrAPIGermplasmMCPD subtaxon(String subtaxon) {
    this.subtaxon = subtaxon;
    return this;
  }

  /**
   * MCPD (v2.1) (SUBTAXA) 8. Subtaxon can be used to store any additional taxonomic identifier. The following abbreviations are allowed: \"subsp.\" (for subspecies); \"convar.\" (for convariety); \"var.\" (for variety); \"f.\" (for form); \"Group\" (for \"cultivar group\").
   * @return subtaxon
  **/
  
  
    public String getSubtaxon() {
    return subtaxon;
  }

  public void setSubtaxon(String subtaxon) {
    this.subtaxon = subtaxon;
  }

  public BrAPIGermplasmMCPD subtaxonAuthority(String subtaxonAuthority) {
    this.subtaxonAuthority = subtaxonAuthority;
    return this;
  }

  /**
   * MCPD (v2.1) (SUBTAUTHOR) 9. Provide the subtaxon authority at the most detailed taxonomic level.
   * @return subtaxonAuthority
  **/
  
  
    public String getSubtaxonAuthority() {
    return subtaxonAuthority;
  }

  public void setSubtaxonAuthority(String subtaxonAuthority) {
    this.subtaxonAuthority = subtaxonAuthority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmMCPD germplasmMCPD = (BrAPIGermplasmMCPD) o;
    return Objects.equals(this.accessionNames, germplasmMCPD.accessionNames) &&
        Objects.equals(this.accessionNumber, germplasmMCPD.accessionNumber) &&
        Objects.equals(this.acquisitionDate, germplasmMCPD.acquisitionDate) &&
        Objects.equals(this.acquisitionSourceCode, germplasmMCPD.acquisitionSourceCode) &&
        Objects.equals(this.alternateIDs, germplasmMCPD.alternateIDs) &&
        Objects.equals(this.ancestralData, germplasmMCPD.ancestralData) &&
        Objects.equals(this.biologicalStatusOfAccessionCode, germplasmMCPD.biologicalStatusOfAccessionCode) &&
        Objects.equals(this.breedingInstitutes, germplasmMCPD.breedingInstitutes) &&
        Objects.equals(this.collectingInfo, germplasmMCPD.collectingInfo) &&
        Objects.equals(this.commonCropName, germplasmMCPD.commonCropName) &&
        Objects.equals(this.countryOfOrigin, germplasmMCPD.countryOfOrigin) &&
        Objects.equals(this.donorInfo, germplasmMCPD.donorInfo) &&
        Objects.equals(this.genus, germplasmMCPD.genus) &&
        Objects.equals(this.germplasmDbId, germplasmMCPD.germplasmDbId) &&
        Objects.equals(this.germplasmPUI, germplasmMCPD.germplasmPUI) &&
        Objects.equals(this.instituteCode, germplasmMCPD.instituteCode) &&
        Objects.equals(this.mlsStatus, germplasmMCPD.mlsStatus) &&
        Objects.equals(this.remarks, germplasmMCPD.remarks) &&
        Objects.equals(this.safetyDuplicateInstitutes, germplasmMCPD.safetyDuplicateInstitutes) &&
        Objects.equals(this.species, germplasmMCPD.species) &&
        Objects.equals(this.speciesAuthority, germplasmMCPD.speciesAuthority) &&
        Objects.equals(this.storageTypeCodes, germplasmMCPD.storageTypeCodes) &&
        Objects.equals(this.subtaxon, germplasmMCPD.subtaxon) &&
        Objects.equals(this.subtaxonAuthority, germplasmMCPD.subtaxonAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessionNames, accessionNumber, acquisitionDate, acquisitionSourceCode, alternateIDs, ancestralData, biologicalStatusOfAccessionCode, breedingInstitutes, collectingInfo, commonCropName, countryOfOrigin, donorInfo, genus, germplasmDbId, germplasmPUI, instituteCode, mlsStatus, remarks, safetyDuplicateInstitutes, species, speciesAuthority, storageTypeCodes, subtaxon, subtaxonAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPD {\n");
    
    sb.append("    accessionNames: ").append(toIndentedString(accessionNames)).append("\n");
    sb.append("    accessionNumber: ").append(toIndentedString(accessionNumber)).append("\n");
    sb.append("    acquisitionDate: ").append(toIndentedString(acquisitionDate)).append("\n");
    sb.append("    acquisitionSourceCode: ").append(toIndentedString(acquisitionSourceCode)).append("\n");
    sb.append("    alternateIDs: ").append(toIndentedString(alternateIDs)).append("\n");
    sb.append("    ancestralData: ").append(toIndentedString(ancestralData)).append("\n");
    sb.append("    biologicalStatusOfAccessionCode: ").append(toIndentedString(biologicalStatusOfAccessionCode)).append("\n");
    sb.append("    breedingInstitutes: ").append(toIndentedString(breedingInstitutes)).append("\n");
    sb.append("    collectingInfo: ").append(toIndentedString(collectingInfo)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    donorInfo: ").append(toIndentedString(donorInfo)).append("\n");
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmPUI: ").append(toIndentedString(germplasmPUI)).append("\n");
    sb.append("    instituteCode: ").append(toIndentedString(instituteCode)).append("\n");
    sb.append("    mlsStatus: ").append(toIndentedString(mlsStatus)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    safetyDuplicateInstitutes: ").append(toIndentedString(safetyDuplicateInstitutes)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    speciesAuthority: ").append(toIndentedString(speciesAuthority)).append("\n");
    sb.append("    storageTypeCodes: ").append(toIndentedString(storageTypeCodes)).append("\n");
    sb.append("    subtaxon: ").append(toIndentedString(subtaxon)).append("\n");
    sb.append("    subtaxonAuthority: ").append(toIndentedString(subtaxonAuthority)).append("\n");
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
