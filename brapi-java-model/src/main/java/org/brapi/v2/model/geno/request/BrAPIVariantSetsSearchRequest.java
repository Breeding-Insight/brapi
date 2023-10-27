package org.brapi.v2.model.geno.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VariantSetsSearchRequest
 */


public class BrAPIVariantSetsSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("commonCropNames")
  private List<String> commonCropNames = null;

  @JsonProperty("externalReferenceIDs")
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceIds")
  private List<String> externalReferenceIds = null;

  @JsonProperty("externalReferenceSources")
  private List<String> externalReferenceSources = null;

  @JsonProperty("programDbIds")
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  private List<String> programNames = null;

  @JsonProperty("referenceDbIds")
  private List<String> referenceDbIds = null;

  @JsonProperty("referenceSetDbIds")
  private List<String> referenceSetDbIds = null;

  @JsonProperty("studyDbIds")
  @Valid
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  @Valid
  private List<String> studyNames = null;

  @JsonProperty("trialDbIds")
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  private List<String> trialNames = null;

  @JsonProperty("variantDbIds")
  @Valid
  private List<String> variantDbIds = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  public BrAPIVariantSetsSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public BrAPIVariantSetsSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPIVariantSetsSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
    this.externalReferenceIds = externalReferenceIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

  public BrAPIVariantSetsSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPIVariantSetsSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

  public BrAPIVariantSetsSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public BrAPIVariantSetsSearchRequest referenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addReferenceDbIdsItem(String referenceDbIdsItem) {
    if (this.referenceDbIds == null) {
      this.referenceDbIds = new ArrayList<String>();
    }
    this.referenceDbIds.add(referenceDbIdsItem);
    return this;
  }

  /**
   * The unique identifier representing a genotype Reference
   *
   * @return referenceDbIds
   **/
  public List<String> getReferenceDbIds() {
    return referenceDbIds;
  }

  public void setReferenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
  }

  public BrAPIVariantSetsSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
    if (this.referenceSetDbIds == null) {
      this.referenceSetDbIds = new ArrayList<String>();
    }
    this.referenceSetDbIds.add(referenceSetDbIdsItem);
    return this;
  }

  /**
   * The unique identifier representing a genotype ReferenceSet
   *
   * @return referenceSetDbIds
   **/
  public List<String> getReferenceSetDbIds() {
    return referenceSetDbIds;
  }

  public void setReferenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
  }

  public BrAPIVariantSetsSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

  public BrAPIVariantSetsSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addStudyNamesItem(String studyNamesItem) {
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

  public BrAPIVariantSetsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * The CallSet to search.
   * @return callSetDbIds
  **/
  
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public BrAPIVariantSetsSearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

  public BrAPIVariantSetsSearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addTrialNamesItem(String trialNamesItem) {
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

  public BrAPIVariantSetsSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * The Variant to search.
   * @return variantDbIds
  **/
  
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public BrAPIVariantSetsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public BrAPIVariantSetsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * The VariantSet to search.
   * @return variantSetDbIds
  **/
  
  
    public List<String> getVariantSetDbIds() {
    return variantSetDbIds;
  }

  public void setVariantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVariantSetsSearchRequest variantSetsSearchRequest = (BrAPIVariantSetsSearchRequest) o;
    return Objects.equals(this.callSetDbIds, variantSetsSearchRequest.callSetDbIds) &&
            Objects.equals(this.commonCropNames, variantSetsSearchRequest.commonCropNames) &&
            Objects.equals(this.externalReferenceIDs, variantSetsSearchRequest.externalReferenceIDs) &&
            Objects.equals(this.externalReferenceIds, variantSetsSearchRequest.externalReferenceIds) &&
            Objects.equals(this.externalReferenceSources, variantSetsSearchRequest.externalReferenceSources) &&
            Objects.equals(this.programDbIds, variantSetsSearchRequest.programDbIds) &&
            Objects.equals(this.programNames, variantSetsSearchRequest.programNames) &&
            Objects.equals(this.referenceDbIds, variantSetsSearchRequest.referenceDbIds) &&
            Objects.equals(this.referenceSetDbIds, variantSetsSearchRequest.referenceSetDbIds) &&
            Objects.equals(this.studyDbIds, variantSetsSearchRequest.studyDbIds) &&
            Objects.equals(this.studyNames, variantSetsSearchRequest.studyNames) &&
            Objects.equals(this.trialDbIds, variantSetsSearchRequest.trialDbIds) &&
            Objects.equals(this.trialNames, variantSetsSearchRequest.trialNames) &&
            Objects.equals(this.variantDbIds, variantSetsSearchRequest.variantDbIds) &&
            Objects.equals(this.variantSetDbIds, variantSetsSearchRequest.variantSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, programDbIds, programNames, referenceDbIds, referenceSetDbIds, studyDbIds, studyNames, trialDbIds, trialNames, variantDbIds, variantSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSetsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    referenceDbIds: ").append(toIndentedString(referenceDbIds)).append("\n");
    sb.append("    referenceSetDbIds: ").append(toIndentedString(referenceSetDbIds)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
    sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
    sb.append("    variantDbIds: ").append(toIndentedString(variantDbIds)).append("\n");
    sb.append("    variantSetDbIds: ").append(toIndentedString(variantSetDbIds)).append("\n");
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
