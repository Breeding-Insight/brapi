package org.brapi.v2.model.geno.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SampleSearchRequest
 */


public class BrAPISampleSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("commonCropNames")
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

  @JsonProperty("observationUnitDbIds")
  @Valid
  private List<String> observationUnitDbIds = null;

  @JsonProperty("plateDbIds")
  @Valid
  private List<String> plateDbIds = null;

  @JsonProperty("plateNames")
  private List<String> plateNames = null;

  @JsonProperty("programDbIds")
  private List<String> programDbIds = null;

  @JsonProperty("programNames")
  private List<String> programNames = null;

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

  @JsonProperty("sampleGroupDbIds")
  private List<String> sampleGroupDbIds = null;

  @JsonProperty("sampleNames")
  private List<String> sampleNames = null;

  @JsonProperty("trialDbIds")
  private List<String> trialDbIds = null;

  @JsonProperty("trialNames")
  private List<String> trialNames = null;

  public BrAPISampleSearchRequest commonCropNames(List<String> commonCropNames) {
    this.commonCropNames = commonCropNames;
    return this;
  }

  public BrAPISampleSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

  public BrAPISampleSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
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

  public BrAPISampleSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPISampleSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
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

  public BrAPISampleSearchRequest studyDbIds(List<String> studyDbIds) {
    this.studyDbIds = studyDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

  public BrAPISampleSearchRequest studyNames(List<String> studyNames) {
    this.studyNames = studyNames;
    return this;
  }

  public BrAPISampleSearchRequest addStudyNamesItem(String studyNamesItem) {
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

  public BrAPISampleSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPISampleSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPISampleSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPISampleSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPISampleSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
    this.observationUnitDbIds = observationUnitDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
    if (this.observationUnitDbIds == null) {
      this.observationUnitDbIds = new ArrayList<String>();
    }
    this.observationUnitDbIds.add(observationUnitDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies an observation unit
   * @return observationUnitDbIds
  **/
  
  
    public List<String> getObservationUnitDbIds() {
    return observationUnitDbIds;
  }

  public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
    this.observationUnitDbIds = observationUnitDbIds;
  }

  public BrAPISampleSearchRequest plateDbIds(List<String> plateDbIds) {
    this.plateDbIds = plateDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addPlateDbIdsItem(String plateDbIdsItem) {
    if (this.plateDbIds == null) {
      this.plateDbIds = new ArrayList<String>();
    }
    this.plateDbIds.add(plateDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a plate of samples
   * @return plateDbIds
  **/
  
  
    public List<String> getPlateDbIds() {
    return plateDbIds;
  }

  public void setPlateDbIds(List<String> plateDbIds) {
    this.plateDbIds = plateDbIds;
  }

  public BrAPISampleSearchRequest plateNames(List<String> plateNames) {
    this.plateNames = plateNames;
    return this;
  }

  public BrAPISampleSearchRequest addPlateNamesItem(String plateNamesItem) {
    if (this.plateNames == null) {
      this.plateNames = new ArrayList<String>();
    }
    this.plateNames.add(plateNamesItem);
    return this;
  }

  /**
   * The human readable name of a &#x60;Plate&#x60; of &#x60;Samples&#x60;
   *
   * @return plateNames
   **/
  public List<String> getPlateNames() {
    return plateNames;
  }

  public void setPlateNames(List<String> plateNames) {
    this.plateNames = plateNames;
  }

  public BrAPISampleSearchRequest programDbIds(List<String> programDbIds) {
    this.programDbIds = programDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

  public BrAPISampleSearchRequest programNames(List<String> programNames) {
    this.programNames = programNames;
    return this;
  }

  public BrAPISampleSearchRequest addProgramNamesItem(String programNamesItem) {
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

  public BrAPISampleSearchRequest sampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
    return this;
  }

  public BrAPISampleSearchRequest addSampleDbIdsItem(String sampleDbIdsItem) {
    if (this.sampleDbIds == null) {
      this.sampleDbIds = new ArrayList<String>();
    }
    this.sampleDbIds.add(sampleDbIdsItem);
    return this;
  }

  /**
   * The ID which uniquely identifies a sample
   * @return sampleDbIds
  **/
  
  
    public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

    public BrAPISampleSearchRequest sampleGroupDbIds(List<String> sampleGroupDbIds) {
        this.sampleGroupDbIds = sampleGroupDbIds;
        return this;
    }

    public BrAPISampleSearchRequest addSampleGroupDbIdsItem(String sampleGroupDbIdsItem) {
        if (this.sampleGroupDbIds == null) {
            this.sampleGroupDbIds = new ArrayList<String>();
        }
        this.sampleGroupDbIds.add(sampleGroupDbIdsItem);
        return this;
    }

    /**
     * The unique identifier for a group of related &#x60;Samples&#x60;
     *
     * @return sampleGroupDbIds
     **/
    public List<String> getSampleGroupDbIds() {
        return sampleGroupDbIds;
    }

    public void setSampleGroupDbIds(List<String> sampleGroupDbIds) {
        this.sampleGroupDbIds = sampleGroupDbIds;
    }

    public BrAPISampleSearchRequest sampleNames(List<String> sampleNames) {
        this.sampleNames = sampleNames;
        return this;
    }

    public BrAPISampleSearchRequest addSampleNamesItem(String sampleNamesItem) {
        if (this.sampleNames == null) {
            this.sampleNames = new ArrayList<String>();
        }
        this.sampleNames.add(sampleNamesItem);
        return this;
    }

    /**
     * The human readable name of the &#x60;Sample&#x60;
     *
     * @return sampleNames
     **/
    public List<String> getSampleNames() {
        return sampleNames;
    }

    public void setSampleNames(List<String> sampleNames) {
        this.sampleNames = sampleNames;
    }

    public BrAPISampleSearchRequest trialDbIds(List<String> trialDbIds) {
        this.trialDbIds = trialDbIds;
        return this;
    }

    public BrAPISampleSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

    public BrAPISampleSearchRequest trialNames(List<String> trialNames) {
        this.trialNames = trialNames;
        return this;
    }

    public BrAPISampleSearchRequest addTrialNamesItem(String trialNamesItem) {
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
    BrAPISampleSearchRequest sampleSearchRequest = (BrAPISampleSearchRequest) o;
    return Objects.equals(this.commonCropNames, sampleSearchRequest.commonCropNames) &&
        Objects.equals(this.germplasmDbIds, sampleSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, sampleSearchRequest.germplasmNames) &&
        Objects.equals(this.studyDbIds, sampleSearchRequest.studyDbIds) &&
        Objects.equals(this.studyNames, sampleSearchRequest.studyNames) &&
        Objects.equals(this.externalReferenceIDs, sampleSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, sampleSearchRequest.externalReferenceSources) &&
        Objects.equals(this.observationUnitDbIds, sampleSearchRequest.observationUnitDbIds) &&
        Objects.equals(this.plateDbIds, sampleSearchRequest.plateDbIds) &&
        Objects.equals(this.sampleDbIds, sampleSearchRequest.sampleDbIds) &&
        Objects.equals(this.plateNames, sampleSearchRequest.plateNames) &&
        Objects.equals(this.programDbIds, sampleSearchRequest.programDbIds) &&
        Objects.equals(this.programNames, sampleSearchRequest.programNames) &&
        Objects.equals(this.sampleGroupDbIds, sampleSearchRequest.sampleGroupDbIds) &&
        Objects.equals(this.sampleNames, sampleSearchRequest.sampleNames) &&
        Objects.equals(this.trialDbIds, sampleSearchRequest.trialDbIds) &&
        Objects.equals(this.trialNames, sampleSearchRequest.trialNames) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonCropNames, germplasmDbIds, germplasmNames, studyDbIds, studyNames, externalReferenceIDs, externalReferenceSources, observationUnitDbIds, plateDbIds, plateNames, programDbIds, programNames, sampleDbIds, sampleGroupDbIds, sampleNames, trialDbIds, trialNames, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampleSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
    sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
    sb.append("    plateDbIds: ").append(toIndentedString(plateDbIds)).append("\n");
    sb.append("    plateNames: ").append(toIndentedString(plateNames)).append("\n");
    sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
    sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
    sb.append("    sampleDbIds: ").append(toIndentedString(sampleDbIds)).append("\n");
    sb.append("    sampleGroupDbIds: ").append(toIndentedString(sampleGroupDbIds)).append("\n");
    sb.append("    sampleNames: ").append(toIndentedString(sampleNames)).append("\n");
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
