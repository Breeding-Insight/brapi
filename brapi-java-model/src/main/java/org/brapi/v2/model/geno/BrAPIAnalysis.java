package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import javax.validation.Valid;

/**
 * An analysis contains an interpretation of one or several experiments. (e.g. SNVs, copy number variations, methylation status) together with information about the methodology used.
 */



public class BrAPIAnalysis   {
  @JsonProperty("analysisDbId")
  private String analysisDbId = null;

  @JsonProperty("analysisName")
  private String analysisName = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("software")
  @Valid
  private List<String> software = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  public BrAPIAnalysis analysisDbId(String analysisDbId) {
    this.analysisDbId = analysisDbId;
    return this;
  }

  /**
   * Unique identifier for this analysis description
   * @return analysisDbId
  **/
  
  
    public String getAnalysisDbId() {
    return analysisDbId;
  }

  public void setAnalysisDbId(String analysisDbId) {
    this.analysisDbId = analysisDbId;
  }

  public BrAPIAnalysis analysisName(String analysisName) {
    this.analysisName = analysisName;
    return this;
  }

  /**
   * A human readable name for this analysis
   * @return analysisName
  **/
  
  
    public String getAnalysisName() {
    return analysisName;
  }

  public void setAnalysisName(String analysisName) {
    this.analysisName = analysisName;
  }

  public BrAPIAnalysis created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The time at which this record was created, in ISO 8601 format.
   * @return created
  **/
  
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public BrAPIAnalysis description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human readable description of the analysis
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrAPIAnalysis software(List<String> software) {
    this.software = software;
    return this;
  }

  public BrAPIAnalysis addSoftwareItem(String softwareItem) {
    if (this.software == null) {
      this.software = new ArrayList<String>();
    }
    this.software.add(softwareItem);
    return this;
  }

  /**
   * The software run to generate this analysis.
   * @return software
  **/
  
  
    public List<String> getSoftware() {
    return software;
  }

  public void setSoftware(List<String> software) {
    this.software = software;
  }

  public BrAPIAnalysis type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of analysis.
   * @return type
  **/
  
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BrAPIAnalysis updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The time at which this record was last updated, in ISO 8601 format.
   * @return updated
  **/
  
  
    @Valid
    public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIAnalysis analysis = (BrAPIAnalysis) o;
    return Objects.equals(this.analysisDbId, analysis.analysisDbId) &&
        Objects.equals(this.analysisName, analysis.analysisName) &&
        Objects.equals(this.created, analysis.created) &&
        Objects.equals(this.description, analysis.description) &&
        Objects.equals(this.software, analysis.software) &&
        Objects.equals(this.type, analysis.type) &&
        Objects.equals(this.updated, analysis.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisDbId, analysisName, created, description, software, type, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analysis {\n");
    
    sb.append("    analysisDbId: ").append(toIndentedString(analysisDbId)).append("\n");
    sb.append("    analysisName: ").append(toIndentedString(analysisName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
