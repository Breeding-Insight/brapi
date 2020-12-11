package io.swagger.client.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.ExternalReferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

import javax.validation.Valid;

/**
 * TrialNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class TrialNewRequest   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contact> contacts = null;

  @JsonProperty("datasetAuthorships")
  @Valid
  private List<TrialNewRequestDatasetAuthorships> datasetAuthorships = null;

  @JsonProperty("documentationURL")
  private String documentationURL = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("externalReferences")
  private ExternalReferences externalReferences = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

  @JsonProperty("programName")
  private String programName = null;

  @JsonProperty("publications")
  @Valid
  private List<TrialNewRequestPublications> publications = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("trialDescription")
  private String trialDescription = null;

  @JsonProperty("trialName")
  private String trialName = null;

  @JsonProperty("trialPUI")
  private String trialPUI = null;

  public TrialNewRequest active(Boolean active) {
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

  public TrialNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public TrialNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public TrialNewRequest commonCropName(String commonCropName) {
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

  public TrialNewRequest contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public TrialNewRequest addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * List of contact entities associated with this trial
   * @return contacts
  **/
  
      @Valid
    public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public TrialNewRequest datasetAuthorships(List<TrialNewRequestDatasetAuthorships> datasetAuthorships) {
    this.datasetAuthorships = datasetAuthorships;
    return this;
  }

  public TrialNewRequest addDatasetAuthorshipsItem(TrialNewRequestDatasetAuthorships datasetAuthorshipsItem) {
    if (this.datasetAuthorships == null) {
      this.datasetAuthorships = new ArrayList<TrialNewRequestDatasetAuthorships>();
    }
    this.datasetAuthorships.add(datasetAuthorshipsItem);
    return this;
  }

  /**
   * License and citation information for the data in this trial
   * @return datasetAuthorships
  **/
  
      @Valid
    public List<TrialNewRequestDatasetAuthorships> getDatasetAuthorships() {
    return datasetAuthorships;
  }

  public void setDatasetAuthorships(List<TrialNewRequestDatasetAuthorships> datasetAuthorships) {
    this.datasetAuthorships = datasetAuthorships;
  }

  public TrialNewRequest documentationURL(String documentationURL) {
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

  public TrialNewRequest endDate(LocalDate endDate) {
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

  public TrialNewRequest externalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public ExternalReferences getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
  }

  public TrialNewRequest programDbId(String programDbId) {
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

  public TrialNewRequest programName(String programName) {
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

  public TrialNewRequest publications(List<TrialNewRequestPublications> publications) {
    this.publications = publications;
    return this;
  }

  public TrialNewRequest addPublicationsItem(TrialNewRequestPublications publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<TrialNewRequestPublications>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-9) Associated publication - An identifier for a literature publication where the investigation is described. Use of DOIs is recommended.
   * @return publications
  **/
  
      @Valid
    public List<TrialNewRequestPublications> getPublications() {
    return publications;
  }

  public void setPublications(List<TrialNewRequestPublications> publications) {
    this.publications = publications;
  }

  public TrialNewRequest startDate(LocalDate startDate) {
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

  public TrialNewRequest trialDescription(String trialDescription) {
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

  public TrialNewRequest trialName(String trialName) {
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

  public TrialNewRequest trialPUI(String trialPUI) {
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
    TrialNewRequest trialNewRequest = (TrialNewRequest) o;
    return Objects.equals(this.active, trialNewRequest.active) &&
        Objects.equals(this.additionalInfo, trialNewRequest.additionalInfo) &&
        Objects.equals(this.commonCropName, trialNewRequest.commonCropName) &&
        Objects.equals(this.contacts, trialNewRequest.contacts) &&
        Objects.equals(this.datasetAuthorships, trialNewRequest.datasetAuthorships) &&
        Objects.equals(this.documentationURL, trialNewRequest.documentationURL) &&
        Objects.equals(this.endDate, trialNewRequest.endDate) &&
        Objects.equals(this.externalReferences, trialNewRequest.externalReferences) &&
        Objects.equals(this.programDbId, trialNewRequest.programDbId) &&
        Objects.equals(this.programName, trialNewRequest.programName) &&
        Objects.equals(this.publications, trialNewRequest.publications) &&
        Objects.equals(this.startDate, trialNewRequest.startDate) &&
        Objects.equals(this.trialDescription, trialNewRequest.trialDescription) &&
        Objects.equals(this.trialName, trialNewRequest.trialName) &&
        Objects.equals(this.trialPUI, trialNewRequest.trialPUI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalInfo, commonCropName, contacts, datasetAuthorships, documentationURL, endDate, externalReferences, programDbId, programName, publications, startDate, trialDescription, trialName, trialPUI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialNewRequest {\n");
    
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
