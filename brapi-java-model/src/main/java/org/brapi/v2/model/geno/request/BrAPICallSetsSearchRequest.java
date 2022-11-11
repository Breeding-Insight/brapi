package org.brapi.v2.model.geno.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CallSetsSearchRequest
 */


public class BrAPICallSetsSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("callSetNames")
  @Valid
  private List<String> callSetNames = null;

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

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

  @JsonProperty("sampleNames")
  @Valid
  private List<String> sampleNames = null;

  @JsonProperty("studyDbIds")
  private List<String> studyDbIds = null;

  @JsonProperty("studyNames")
  private List<String> studyNames = null;

  @JsonProperty("trialDbIds")
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  private List<String> trialNames = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;


  public BrAPICallSetsSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

  public BrAPICallSetsSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public BrAPICallSetsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * Only return call sets with these DbIds (case-sensitive, exact match).
   * @return callSetDbIds
  **/
  
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public BrAPICallSetsSearchRequest callSetNames(List<String> callSetNames) {
    this.callSetNames = callSetNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addCallSetNamesItem(String callSetNamesItem) {
    if (this.callSetNames == null) {
      this.callSetNames = new ArrayList<String>();
    }
    this.callSetNames.add(callSetNamesItem);
    return this;
  }

  /**
   * Only return call sets with these names (case-sensitive, exact match).
   * @return callSetNames
  **/
  
  
    public List<String> getCallSetNames() {
    return callSetNames;
  }

  public void setCallSetNames(List<String> callSetNames) {
    this.callSetNames = callSetNames;
  }

  public BrAPICallSetsSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public BrAPICallSetsSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPICallSetsSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPICallSetsSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPICallSetsSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPICallSetsSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public BrAPICallSetsSearchRequest sampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addSampleDbIdsItem(String sampleDbIdsItem) {
    if (this.sampleDbIds == null) {
      this.sampleDbIds = new ArrayList<String>();
    }
    this.sampleDbIds.add(sampleDbIdsItem);
    return this;
  }

  /**
   * Return only call sets generated from the provided Biosample IDs.
   * @return sampleDbIds
  **/
  
  
    public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

  public BrAPICallSetsSearchRequest sampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addSampleNamesItem(String sampleNamesItem) {
    if (this.sampleNames == null) {
      this.sampleNames = new ArrayList<String>();
    }
    this.sampleNames.add(sampleNamesItem);
    return this;
  }

  /**
   * Return only call sets generated from the provided Biosample human readable names.
   * @return sampleNames
  **/
  
  
    public List<String> getSampleNames() {
    return sampleNames;
  }

  public void setSampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
  }

  public BrAPICallSetsSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

  public BrAPICallSetsSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addStudyNamesItem(String studyNamesItem) {
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

  public BrAPICallSetsSearchRequest trialDbIds(List<String> trialDbIds) {
    this.trialDbIds = trialDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

  public BrAPICallSetsSearchRequest trialNames(List<String> trialNames) {
    this.trialNames = trialNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addTrialNamesItem(String trialNamesItem) {
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

  public BrAPICallSetsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
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
    BrAPICallSetsSearchRequest callSetsSearchRequest = (BrAPICallSetsSearchRequest) o;
    return Objects.equals(this.germplasmDbIds, callSetsSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, callSetsSearchRequest.germplasmNames) &&
        Objects.equals(this.callSetDbIds, callSetsSearchRequest.callSetDbIds) &&
        Objects.equals(this.callSetNames, callSetsSearchRequest.callSetNames) &&
        Objects.equals(this.commonCropNames, callSetsSearchRequest.commonCropNames) &&
        Objects.equals(this.externalReferenceIDs, callSetsSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceIds, callSetsSearchRequest.externalReferenceIds) &&
        Objects.equals(this.externalReferenceSources, callSetsSearchRequest.externalReferenceSources) &&
        Objects.equals(this.programDbIds, callSetsSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, callSetsSearchRequest.programNames) &&
        Objects.equals(this.sampleDbIds, callSetsSearchRequest.sampleDbIds) &&
        Objects.equals(this.sampleNames, callSetsSearchRequest.sampleNames) &&
        Objects.equals(this.studyDbIds, callSetsSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, callSetsSearchRequest.studyNames) &&
        Objects.equals(this.trialDbIds, callSetsSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, callSetsSearchRequest.trialNames) &&
        Objects.equals(this.variantSetDbIds, callSetsSearchRequest.variantSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbIds, germplasmNames, callSetDbIds, callSetNames, commonCropNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, programDbIds, programNames, sampleDbIds, sampleNames, studyDbIds, studyNames, trialDbIds, trialNames, variantSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSetsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    callSetNames: ").append(toIndentedString(callSetNames)).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    sampleDbIds: ").append(toIndentedString(sampleDbIds)).append("\n");
    sb.append("    sampleNames: ").append(toIndentedString(sampleNames)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
    sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
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
