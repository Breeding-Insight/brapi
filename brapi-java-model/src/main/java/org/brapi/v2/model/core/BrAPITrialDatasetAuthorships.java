package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

import javax.validation.Valid;

/**
 * TrialDatasetAuthorships
 */


public class BrAPITrialDatasetAuthorships {
  @JsonProperty("datasetPUI")
  private String datasetPUI = null;

  @JsonProperty("license")
  private String license = null;

  @JsonProperty("publicReleaseDate")
  private LocalDate publicReleaseDate = null;

  @JsonProperty("submissionDate")
  private LocalDate submissionDate = null;

  public BrAPITrialDatasetAuthorships datasetPUI(String datasetPUI) {
    this.datasetPUI = datasetPUI;
    return this;
  }

  /**
   * Get datasetPUI
   * @return datasetPUI
  **/
  
  
    public String getDatasetPUI() {
    return datasetPUI;
  }

  public void setDatasetPUI(String datasetPUI) {
    this.datasetPUI = datasetPUI;
  }

  public BrAPITrialDatasetAuthorships license(String license) {
    this.license = license;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-7) License - License for the reuse of the data associated with this investigation. The Creative Commons licenses cover most use cases and are recommended.
   * @return license
  **/
  
  
    public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public BrAPITrialDatasetAuthorships publicReleaseDate(LocalDate publicReleaseDate) {
    this.publicReleaseDate = publicReleaseDate;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-6) Public release date - Date of first public release of the dataset presently being described.
   * @return publicReleaseDate
  **/
  
  
    @Valid
    public LocalDate getPublicReleaseDate() {
    return publicReleaseDate;
  }

  public void setPublicReleaseDate(LocalDate publicReleaseDate) {
    this.publicReleaseDate = publicReleaseDate;
  }

  public BrAPITrialDatasetAuthorships submissionDate(LocalDate submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }

  /**
   * MIAPPE V1.1 (DM-5) Submission date - Date of submission of the dataset presently being described to a host repository.
   * @return submissionDate
  **/
  
  
    @Valid
    public LocalDate getSubmissionDate() {
    return submissionDate;
  }

  public void setSubmissionDate(LocalDate submissionDate) {
    this.submissionDate = submissionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPITrialDatasetAuthorships trialDatasetAuthorships = (BrAPITrialDatasetAuthorships) o;
    return Objects.equals(this.datasetPUI, trialDatasetAuthorships.datasetPUI) &&
        Objects.equals(this.license, trialDatasetAuthorships.license) &&
        Objects.equals(this.publicReleaseDate, trialDatasetAuthorships.publicReleaseDate) &&
        Objects.equals(this.submissionDate, trialDatasetAuthorships.submissionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetPUI, license, publicReleaseDate, submissionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialDatasetAuthorships {\n");
    
    sb.append("    datasetPUI: ").append(toIndentedString(datasetPUI)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    publicReleaseDate: ").append(toIndentedString(publicReleaseDate)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
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
