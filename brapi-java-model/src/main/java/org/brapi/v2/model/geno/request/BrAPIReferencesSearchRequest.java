package org.brapi.v2.model.geno.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReferencesSearchRequest
 */


public class BrAPIReferencesSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("accessions")
  @Valid
  private List<String> accessions = null;

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

  @JsonProperty("isDerived")
  private Boolean isDerived = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("md5checksums")
  @Valid
  private List<String> md5checksums = null;

  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("programDbIds")
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  private List<String> programNames = null;

  @JsonProperty("referenceDbIds")
  @Valid
  private List<String> referenceDbIds = null;

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

  public BrAPIReferencesSearchRequest accessions(List<String> accessions) {
    this.accessions = accessions;
    return this;
  }

  public BrAPIReferencesSearchRequest addAccessionsItem(String accessionsItem) {
    if (this.accessions == null) {
      this.accessions = new ArrayList<String>();
    }
    this.accessions.add(accessionsItem);
    return this;
  }

  /**
   * If specified, return the references for which the `accession` matches this string (case-sensitive, exact match).
   * @return accessions
  **/
  
  
    public List<String> getAccessions() {
    return accessions;
  }

  public void setAccessions(List<String> accessions) {
    this.accessions = accessions;
  }

  public BrAPIReferencesSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPIReferencesSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public BrAPIReferencesSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIReferencesSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPIReferencesSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIReferencesSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPIReferencesSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

  public BrAPIReferencesSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPIReferencesSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public BrAPIReferencesSearchRequest isDerived(Boolean isDerived) {
    this.isDerived = isDerived;
    return this;
  }

  /**
   * A sequence X is said to be derived from source sequence Y, if X and Y are of the same length and the per-base sequence divergence at A/C/G/T bases is sufficiently small. Two sequences derived from the same official sequence share the same coordinates and annotations, and can be replaced with the official sequence for certain use cases.
   * @return isDerived
  **/
  
  
    public Boolean isIsDerived() {
    return isDerived;
  }

  public void setIsDerived(Boolean isDerived) {
    this.isDerived = isDerived;
  }

  public BrAPIReferencesSearchRequest maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * The minimum length of this reference's sequence.
   * @return maxLength
  **/
  
  
    public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public BrAPIReferencesSearchRequest md5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
    return this;
  }

  public BrAPIReferencesSearchRequest addMd5checksumsItem(String md5checksumsItem) {
    if (this.md5checksums == null) {
      this.md5checksums = new ArrayList<String>();
    }
    this.md5checksums.add(md5checksumsItem);
    return this;
  }

  /**
   * If specified, return the references for which the `md5checksum` matches this string (case-sensitive, exact match).
   * @return md5checksums
  **/
  
  
    public List<String> getMd5checksums() {
    return md5checksums;
  }

  public void setMd5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
  }

  public BrAPIReferencesSearchRequest minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * The minimum length of this reference's sequence.
   * @return minLength
  **/
  
  
    public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public BrAPIReferencesSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

  public BrAPIReferencesSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPIReferencesSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public BrAPIReferencesSearchRequest referenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addReferenceDbIdsItem(String referenceDbIdsItem) {
    if (this.referenceDbIds == null) {
      this.referenceDbIds = new ArrayList<String>();
    }
    this.referenceDbIds.add(referenceDbIdsItem);
    return this;
  }

  /**
   * The `References` to search.
   * @return referenceDbIds
  **/
  
  
    public List<String> getReferenceDbIds() {
    return referenceDbIds;
  }

  public void setReferenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
  }

  public BrAPIReferencesSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
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

    public BrAPIReferencesSearchRequest studyDbIds(List<String> studyDbIds) {
        this.studyDbIds = studyDbIds;
        return this;
    }

    public BrAPIReferencesSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

    public BrAPIReferencesSearchRequest studyNames(List<String> studyNames) {
        this.studyNames = studyNames;
        return this;
    }

    public BrAPIReferencesSearchRequest addStudyNamesItem(String studyNamesItem) {
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

    public BrAPIReferencesSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public BrAPIReferencesSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

    public BrAPIReferencesSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public BrAPIReferencesSearchRequest addTrialNamesItem(String trialNamesItem) {
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
    BrAPIReferencesSearchRequest referencesSearchRequest = (BrAPIReferencesSearchRequest) o;
    return Objects.equals(this.accessions, referencesSearchRequest.accessions) &&
        Objects.equals(this.commonCropNames, referencesSearchRequest.commonCropNames) &&
        Objects.equals(this.externalReferenceIDs, referencesSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, referencesSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, referencesSearchRequest.externalReferenceSources) &&
        Objects.equals(this.germplasmDbIds, referencesSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, referencesSearchRequest.germplasmNames) &&
        Objects.equals(this.isDerived, referencesSearchRequest.isDerived) &&
        Objects.equals(this.maxLength, referencesSearchRequest.maxLength) &&
        Objects.equals(this.md5checksums, referencesSearchRequest.md5checksums) &&
        Objects.equals(this.minLength, referencesSearchRequest.minLength) &&
        Objects.equals(this.programDbIds, referencesSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, referencesSearchRequest.programNames) &&
        Objects.equals(this.referenceDbIds, referencesSearchRequest.referenceDbIds) &&
        Objects.equals(this.referenceSetDbIds, referencesSearchRequest.referenceSetDbIds) &&
        Objects.equals(this.studyDbIds, referencesSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, referencesSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, referencesSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, referencesSearchRequest.trialNames) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessions, isDerived, maxLength, md5checksums, minLength, referenceDbIds, referenceSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencesSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessions: ").append(toIndentedString(accessions)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    md5checksums: ").append(toIndentedString(md5checksums)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    referenceDbIds: ").append(toIndentedString(referenceDbIds)).append("\n");
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
