package org.brapi.v2.model.geno.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReferenceSetsSearchRequest
 */


public class BrAPIReferenceSetsSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("accession")
  @Valid
  private List<String> accession = null;

  @JsonProperty("assemblyPUI")
  @Valid
  private List<String> assemblyPUI = null;

  @JsonProperty("commonCropNames")
  private List<String> commonCropNames = null;

  @JsonProperty("externalReferenceIDs")
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceIds")
  private List<String> externalReferenceIds = null;

  @JsonProperty("externalReferenceSources")
  private List<String> externalReferenceSources = null;

  @JsonProperty("germplasmDbIds")
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  private List<String> germplasmNames = null;

  @JsonProperty("md5checksum")
  @Valid
  private List<String> md5checksum = null;

  @JsonProperty("programDbIds")
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  private List<String> programNames = null;

  @JsonProperty("referenceSetDbIds")
  @Valid
  private List<String> referenceSetDbIds = null;

  @JsonProperty("studyDbIds")
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  private List<String> studyNames = null;

  @JsonProperty("trialDbIds")
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  private List<String> trialNames = null;

  public BrAPIReferenceSetsSearchRequest accession(List<String> accession) {
    this.accession = accession;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addAccessionItem(String accessionItem) {
    if (this.accession == null) {
      this.accession = new ArrayList<String>();
    }
    this.accession.add(accessionItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `accession` matches this string (case-sensitive, exact match).
   * @return accession
  **/
  
  
    public List<String> getAccession() {
    return accession;
  }

  public void setAccession(List<String> accession) {
    this.accession = accession;
  }

  public BrAPIReferenceSetsSearchRequest assemblyPUI(List<String> assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addAssemblyPUIItem(String assemblyPUIItem) {
    if (this.assemblyPUI == null) {
      this.assemblyPUI = new ArrayList<String>();
    }
    this.assemblyPUI.add(assemblyPUIItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `assemblyId` matches this string (case-sensitive, exact match).
   * @return assemblyPUI
  **/
  
  
    public List<String> getAssemblyPUI() {
    return assemblyPUI;
  }

  public void setAssemblyPUI(List<String> assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
  }

  public BrAPIReferenceSetsSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public BrAPIReferenceSetsSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPIReferenceSetsSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPIReferenceSetsSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

  public BrAPIReferenceSetsSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public BrAPIReferenceSetsSearchRequest md5checksum(List<String> md5checksum) {
    this.md5checksum = md5checksum;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addMd5checksumItem(String md5checksumItem) {
    if (this.md5checksum == null) {
      this.md5checksum = new ArrayList<String>();
    }
    this.md5checksum.add(md5checksumItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `md5checksum` matches this string (case-sensitive, exact match).
   * @return md5checksum
  **/
  
  
    public List<String> getMd5checksum() {
    return md5checksum;
  }

  public void setMd5checksum(List<String> md5checksum) {
    this.md5checksum = md5checksum;
  }

  public BrAPIReferenceSetsSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

  public BrAPIReferenceSetsSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public BrAPIReferenceSetsSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
    if (this.referenceSetDbIds == null) {
      this.referenceSetDbIds = new ArrayList<String>();
    }
    this.referenceSetDbIds.add(referenceSetDbIdsItem);
    return this;
  }

  /**
   * The `ReferenceSets` to search.
   * @return referenceSetDbIds
  **/
  
  
    public List<String> getReferenceSetDbIds() {
    return referenceSetDbIds;
  }

  public void setReferenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
  }

    public BrAPIReferenceSetsSearchRequest studyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
        return this;
    }

    public BrAPIReferenceSetsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

    public BrAPIReferenceSetsSearchRequest studyNames(List<String> studyNames) {
        this.studyNames = studyNames;
        return this;
    }

    public BrAPIReferenceSetsSearchRequest addStudyNamesItem(String studyNamesItem) {
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

    public BrAPIReferenceSetsSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public BrAPIReferenceSetsSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

    public BrAPIReferenceSetsSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public BrAPIReferenceSetsSearchRequest addTrialNamesItem(String trialNamesItem) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIReferenceSetsSearchRequest referenceSetsSearchRequest = (BrAPIReferenceSetsSearchRequest) o;
    return Objects.equals(this.accession, referenceSetsSearchRequest.accession) &&
        Objects.equals(this.assemblyPUI, referenceSetsSearchRequest.assemblyPUI) &&
        Objects.equals(this.commonCropNames, referenceSetsSearchRequest.commonCropNames) &&
        Objects.equals(this.externalReferenceIDs, referenceSetsSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, referenceSetsSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, referenceSetsSearchRequest.externalReferenceSources) &&
        Objects.equals(this.germplasmDbIds, referenceSetsSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, referenceSetsSearchRequest.germplasmNames) &&
        Objects.equals(this.md5checksum, referenceSetsSearchRequest.md5checksum) &&
        Objects.equals(this.programDbIds, referenceSetsSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, referenceSetsSearchRequest.programNames) &&
        Objects.equals(this.referenceSetDbIds, referenceSetsSearchRequest.referenceSetDbIds) &&
        Objects.equals(this.studyDbIds, referenceSetsSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, referenceSetsSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, referenceSetsSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, referenceSetsSearchRequest.trialNames) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accession, assemblyPUI, md5checksum, referenceSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSetsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
    sb.append("    assemblyPUI: ").append(toIndentedString(assemblyPUI)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    md5checksum: ").append(toIndentedString(md5checksum)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    referenceSetDbIds: ").append(toIndentedString(referenceSetDbIds)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
