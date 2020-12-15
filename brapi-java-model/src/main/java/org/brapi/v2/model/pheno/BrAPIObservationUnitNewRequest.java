package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.pheno.BrAPIObservationTreatment;
import org.brapi.v2.model.pheno.BrAPIObservationUnitPosition;

/**
 * ObservationUnitNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservationUnitNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("externalReferences")
  private BrAPIExternalReferenceList externalReferences = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("locationDbId")
  private String locationDbId = null;

  @JsonProperty("locationName")
  private String locationName = null;

  @JsonProperty("observationUnitName")
  private String observationUnitName = null;

  @JsonProperty("observationUnitPUI")
  private String observationUnitPUI = null;

  @JsonProperty("observationUnitPosition")
  private BrAPIObservationUnitPosition observationUnitPosition = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

  @JsonProperty("programName")
  private String programName = null;

  @JsonProperty("seedLotDbId")
  private String seedLotDbId = null;

  @JsonProperty("studyDbId")
  private String studyDbId = null;

  @JsonProperty("studyName")
  private String studyName = null;

  @JsonProperty("treatments")
  @Valid
  private List<BrAPIObservationTreatment> treatments = null;

  @JsonProperty("trialDbId")
  private String trialDbId = null;

  @JsonProperty("trialName")
  private String trialName = null;

  public BrAPIObservationUnitNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIObservationUnitNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIObservationUnitNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public BrAPIExternalReferenceList getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPIObservationUnitNewRequest germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm
   * @return germplasmDbId
  **/
  
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIObservationUnitNewRequest germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * Name of the germplasm. It can be the preferred name and does not have to be unique.
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIObservationUnitNewRequest locationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a location, associated with this study
   * @return locationDbId
  **/
  
  
    public String getLocationDbId() {
    return locationDbId;
  }

  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  public BrAPIObservationUnitNewRequest locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * The human readable name of a location associated with this study
   * @return locationName
  **/
  
  
    public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public BrAPIObservationUnitNewRequest observationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
    return this;
  }

  /**
   * A human readable name for an observation unit
   * @return observationUnitName
  **/
  
  
    public String getObservationUnitName() {
    return observationUnitName;
  }

  public void setObservationUnitName(String observationUnitName) {
    this.observationUnitName = observationUnitName;
  }

  public BrAPIObservationUnitNewRequest observationUnitPUI(String observationUnitPUI) {
    this.observationUnitPUI = observationUnitPUI;
    return this;
  }

  /**
   * A Permanent Unique Identifier for an observation unit  MIAPPE V1.1 (DM-72) External ID - Identifier for the observation unit in a persistent repository, comprises the name of the repository and the identifier of the observation unit therein. The EBI Biosamples repository can be used. URI are recommended when possible.
   * @return observationUnitPUI
  **/
  
  
    public String getObservationUnitPUI() {
    return observationUnitPUI;
  }

  public void setObservationUnitPUI(String observationUnitPUI) {
    this.observationUnitPUI = observationUnitPUI;
  }

  public BrAPIObservationUnitNewRequest observationUnitPosition(BrAPIObservationUnitPosition observationUnitPosition) {
    this.observationUnitPosition = observationUnitPosition;
    return this;
  }

  /**
   * Get observationUnitPosition
   * @return observationUnitPosition
  **/
  
  
    @Valid
    public BrAPIObservationUnitPosition getObservationUnitPosition() {
    return observationUnitPosition;
  }

  public void setObservationUnitPosition(BrAPIObservationUnitPosition observationUnitPosition) {
    this.observationUnitPosition = observationUnitPosition;
  }

  public BrAPIObservationUnitNewRequest programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a program
   * @return programDbId
  **/
  
  
    public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public BrAPIObservationUnitNewRequest programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * The human readable name of a program
   * @return programName
  **/
  
  
    public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public BrAPIObservationUnitNewRequest seedLotDbId(String seedLotDbId) {
    this.seedLotDbId = seedLotDbId;
    return this;
  }

  /**
   * The unique identifier for the originating Seed Lot
   * @return seedLotDbId
  **/
  
  
    public String getSeedLotDbId() {
    return seedLotDbId;
  }

  public void setSeedLotDbId(String seedLotDbId) {
    this.seedLotDbId = seedLotDbId;
  }

  public BrAPIObservationUnitNewRequest studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a study within the given database server
   * @return studyDbId
  **/
  
  
    public String getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  public BrAPIObservationUnitNewRequest studyName(String studyName) {
    this.studyName = studyName;
    return this;
  }

  /**
   * The human readable name for a study
   * @return studyName
  **/
  
  
    public String getStudyName() {
    return studyName;
  }

  public void setStudyName(String studyName) {
    this.studyName = studyName;
  }

  public BrAPIObservationUnitNewRequest treatments(List<BrAPIObservationTreatment> treatments) {
    this.treatments = treatments;
    return this;
  }

  public BrAPIObservationUnitNewRequest addTreatmentsItem(BrAPIObservationTreatment treatmentsItem) {
    if (this.treatments == null) {
      this.treatments = new ArrayList<BrAPIObservationTreatment>();
    }
    this.treatments.add(treatmentsItem);
    return this;
  }

  /**
   * List of treatments applied to an observation unit.  MIAPPE V1.1 (DM-74) Observation Unit factor value - List of values for each factor applied to the observation unit.
   * @return treatments
  **/
  
      @Valid
    public List<BrAPIObservationTreatment> getTreatments() {
    return treatments;
  }

  public void setTreatments(List<BrAPIObservationTreatment> treatments) {
    this.treatments = treatments;
  }

  public BrAPIObservationUnitNewRequest trialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a trial
   * @return trialDbId
  **/
  
  
    public String getTrialDbId() {
    return trialDbId;
  }

  public void setTrialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
  }

  public BrAPIObservationUnitNewRequest trialName(String trialName) {
    this.trialName = trialName;
    return this;
  }

  /**
   * The human readable name of a trial
   * @return trialName
  **/
  
  
    public String getTrialName() {
    return trialName;
  }

  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnitNewRequest observationUnitNewRequest = (BrAPIObservationUnitNewRequest) o;
    return Objects.equals(this.additionalInfo, observationUnitNewRequest.additionalInfo) &&
        Objects.equals(this.externalReferences, observationUnitNewRequest.externalReferences) &&
        Objects.equals(this.germplasmDbId, observationUnitNewRequest.germplasmDbId) &&
        Objects.equals(this.germplasmName, observationUnitNewRequest.germplasmName) &&
        Objects.equals(this.locationDbId, observationUnitNewRequest.locationDbId) &&
        Objects.equals(this.locationName, observationUnitNewRequest.locationName) &&
        Objects.equals(this.observationUnitName, observationUnitNewRequest.observationUnitName) &&
        Objects.equals(this.observationUnitPUI, observationUnitNewRequest.observationUnitPUI) &&
        Objects.equals(this.observationUnitPosition, observationUnitNewRequest.observationUnitPosition) &&
        Objects.equals(this.programDbId, observationUnitNewRequest.programDbId) &&
        Objects.equals(this.programName, observationUnitNewRequest.programName) &&
        Objects.equals(this.seedLotDbId, observationUnitNewRequest.seedLotDbId) &&
        Objects.equals(this.studyDbId, observationUnitNewRequest.studyDbId) &&
        Objects.equals(this.studyName, observationUnitNewRequest.studyName) &&
        Objects.equals(this.treatments, observationUnitNewRequest.treatments) &&
        Objects.equals(this.trialDbId, observationUnitNewRequest.trialDbId) &&
        Objects.equals(this.trialName, observationUnitNewRequest.trialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, externalReferences, germplasmDbId, germplasmName, locationDbId, locationName, observationUnitName, observationUnitPUI, observationUnitPosition, programDbId, programName, seedLotDbId, studyDbId, studyName, treatments, trialDbId, trialName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitNewRequest {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
    sb.append("    observationUnitPUI: ").append(toIndentedString(observationUnitPUI)).append("\n");
    sb.append("    observationUnitPosition: ").append(toIndentedString(observationUnitPosition)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    seedLotDbId: ").append(toIndentedString(seedLotDbId)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    studyName: ").append(toIndentedString(studyName)).append("\n");
    sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
    sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
    sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
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
