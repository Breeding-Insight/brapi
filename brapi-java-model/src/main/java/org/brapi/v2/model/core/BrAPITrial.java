package org.brapi.v2.model.core;

import java.time.LocalDate;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIExternalReference;

import javax.validation.Valid;


/**
 * Trial
 */


public class BrAPITrial {
  @JsonProperty("trialDbId")
  private String trialDbId = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("contacts")
  @Valid
  private List<BrAPIContact> contacts = null;

  @JsonProperty("datasetAuthorships")
  @Valid
  private List<BrAPITrialDatasetAuthorships> datasetAuthorships = null;

  @JsonProperty("documentationURL")
  private String documentationURL = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

  @JsonProperty("programName")
  private String programName = null;

  @JsonProperty("publications")
  @Valid
  private List<BrAPITrialPublications> publications = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("trialDescription")
  private String trialDescription = null;

  @JsonProperty("trialName")
  private String trialName = null;

  @JsonProperty("trialPUI")
  private String trialPUI = null;

  /**
   * The ID which uniquely identifies a trial  MIAPPE V1.1 (DM-2) Investigation unique ID - Identifier comprising the unique name of the institution/database hosting the submission of the investigation data, and the accession number of the investigation in that institution.
   * @return trialDbId
   **/

  public String getTrialDbId() {
    return trialDbId;
  }

  public void setTrialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
  }

  public BrAPITrial trialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
    return this;
  }

  public BrAPITrial active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Is this trail currently active
   * @return active
   **/


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BrAPITrial additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPITrial putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public BrAPITrial commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

  /**
   * Common name for the crop associated with this trial
   * @return commonCropName
   **/


  public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public BrAPITrial contacts(List<BrAPIContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public BrAPITrial addContactsItem(BrAPIContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<BrAPIContact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * List of contact entities associated with this trial
   * @return contacts
   **/

  @Valid
  public List<BrAPIContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<BrAPIContact> contacts) {
    this.contacts = contacts;
  }

  public BrAPITrial datasetAuthorships(List<BrAPITrialDatasetAuthorships> datasetAuthorships) {
    this.datasetAuthorships = datasetAuthorships;
    return this;
  }

  public BrAPITrial addDatasetAuthorshipsItem(BrAPITrialDatasetAuthorships datasetAuthorshipsItem) {
    if (this.datasetAuthorships == null) {
      this.datasetAuthorships = new ArrayList<BrAPITrialDatasetAuthorships>();
    }
    this.datasetAuthorships.add(datasetAuthorshipsItem);
    return this;
  }

  /**
   * License and citation information for the data in this trial
   * @return datasetAuthorships
   **/

  @Valid
  public List<BrAPITrialDatasetAuthorships> getDatasetAuthorships() {
    return datasetAuthorships;
  }

  public void setDatasetAuthorships(List<BrAPITrialDatasetAuthorships> datasetAuthorships) {
    this.datasetAuthorships = datasetAuthorships;
  }

  public BrAPITrial documentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
    return this;
  }

  /**
   * A URL to the human readable documentation of this object
   * @return documentationURL
   **/


  public String getDocumentationURL() {
    return documentationURL;
  }

  public void setDocumentationURL(String documentationURL) {
    this.documentationURL = documentationURL;
  }

  public BrAPITrial endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date this trial ends
   * @return endDate
   **/


  @Valid
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public BrAPITrial externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/


  @Valid
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPITrial programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

  /**
   * A program identifier to search for
   * @return programDbId
   **/


  public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public BrAPITrial programName(String programName) {
    this.programName = programName;
    return this;
  }

  /**
   * Human readable name of the program
   * @return programName
   **/


  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public BrAPITrial publications(List<BrAPITrialPublications> publications) {
    this.publications = publications;
    return this;
  }

  public BrAPITrial addPublicationsItem(BrAPITrialPublications publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<BrAPITrialPublications>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-9) Associated publication - An identifier for a literature publication where the investigation is described. Use of DOIs is recommended.
   * @return publications
   **/

  @Valid
  public List<BrAPITrialPublications> getPublications() {
    return publications;
  }

  public void setPublications(List<BrAPITrialPublications> publications) {
    this.publications = publications;
  }

  public BrAPITrial startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date this trial started
   * @return startDate
   **/


  @Valid
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public BrAPITrial trialDescription(String trialDescription) {
    this.trialDescription = trialDescription;
    return this;
  }

  /**
   * The human readable description of a trial  MIAPPE V1.1 (DM-4) Investigation description - Human-readable text describing the investigation in more detail.
   * @return trialDescription
   **/


  public String getTrialDescription() {
    return trialDescription;
  }

  public void setTrialDescription(String trialDescription) {
    this.trialDescription = trialDescription;
  }

  public BrAPITrial trialName(String trialName) {
    this.trialName = trialName;
    return this;
  }

  /**
   * The human readable name of a trial  MIAPPE V1.1 (DM-3) Investigation title - Human-readable string summarising the investigation.
   * @return trialName
   **/


  public String getTrialName() {
    return trialName;
  }

  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }

  public BrAPITrial trialPUI(String trialPUI) {
    this.trialPUI = trialPUI;
    return this;
  }

  /**
   * A permanent identifier for a trial. Could be DOI or other URI formatted identifier.
   * @return trialPUI
   **/


  public String getTrialPUI() {
    return trialPUI;
  }

  public void setTrialPUI(String trialPUI) {
    this.trialPUI = trialPUI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPITrial trial = (BrAPITrial) o;
    return Objects.equals(this.trialDbId, trial.trialDbId) &&
            Objects.equals(this.active, trial.active) &&
            Objects.equals(this.additionalInfo, trial.additionalInfo) &&
            Objects.equals(this.commonCropName, trial.commonCropName) &&
            Objects.equals(this.contacts, trial.contacts) &&
            Objects.equals(this.datasetAuthorships, trial.datasetAuthorships) &&
            Objects.equals(this.documentationURL, trial.documentationURL) &&
            Objects.equals(this.endDate, trial.endDate) &&
            Objects.equals(this.externalReferences, trial.externalReferences) &&
            Objects.equals(this.programDbId, trial.programDbId) &&
            Objects.equals(this.programName, trial.programName) &&
            Objects.equals(this.publications, trial.publications) &&
            Objects.equals(this.startDate, trial.startDate) &&
            Objects.equals(this.trialDescription, trial.trialDescription) &&
            Objects.equals(this.trialName, trial.trialName) &&
            Objects.equals(this.trialPUI, trial.trialPUI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trialDbId, active, additionalInfo, commonCropName, contacts, datasetAuthorships, documentationURL, endDate, externalReferences, programDbId, programName, publications, startDate, trialDescription, trialName, trialPUI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trial {\n");
    sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    datasetAuthorships: ").append(toIndentedString(datasetAuthorships)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trialDescription: ").append(toIndentedString(trialDescription)).append("\n");
    sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
    sb.append("    trialPUI: ").append(toIndentedString(trialPUI)).append("\n");
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
