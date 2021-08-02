package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

/**
 * A VariantSet is a collection of variants and variant calls intended to be analyzed together.
 */



public class BrAPIVariantSet   {
  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("analysis")
  @Valid
  private List<BrAPIAnalysis> analysis = null;

  @JsonProperty("availableFormats")
  @Valid
  private List<BrAPIVariantSetAvailableFormats> availableFormats = null;

  @JsonProperty("callSetCount")
  private Integer callSetCount = null;

  @JsonProperty("referenceSetDbId")
  private String referenceSetDbId = null;

  @JsonProperty("studyDbId")
  private String studyDbId = null;

  @JsonProperty("variantCount")
  private Integer variantCount = null;

  @JsonProperty("variantSetDbId")
  private String variantSetDbId = null;

  @JsonProperty("variantSetName")
  private String variantSetName = null;

  private final transient Gson gson = new Gson();

  public BrAPIVariantSet additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIVariantSet putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new JsonObject();
    }
    JsonElement newElement = gson.toJsonTree(additionalInfoItem);
    this.additionalInfo.add(key, newElement);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public JsonObject getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIVariantSet analysis(List<BrAPIAnalysis> analysis) {
    this.analysis = analysis;
    return this;
  }

  public BrAPIVariantSet addAnalysisItem(BrAPIAnalysis analysisItem) {
    if (this.analysis == null) {
      this.analysis = new ArrayList<BrAPIAnalysis>();
    }
    this.analysis.add(analysisItem);
    return this;
  }

  /**
   * Set of Analysis descriptors for this VariantSet
   * @return analysis
  **/
  
      @Valid
    public List<BrAPIAnalysis> getAnalysis() {
    return analysis;
  }

  public void setAnalysis(List<BrAPIAnalysis> analysis) {
    this.analysis = analysis;
  }

  public BrAPIVariantSet availableFormats(List<BrAPIVariantSetAvailableFormats> availableFormats) {
    this.availableFormats = availableFormats;
    return this;
  }

  public BrAPIVariantSet addAvailableFormatsItem(BrAPIVariantSetAvailableFormats availableFormatsItem) {
    if (this.availableFormats == null) {
      this.availableFormats = new ArrayList<BrAPIVariantSetAvailableFormats>();
    }
    this.availableFormats.add(availableFormatsItem);
    return this;
  }

  /**
   * When the data for a VariantSet is retrieved, it can be retrieved in a variety of data formats and file formats.   dataFormat defines the structure of the data within a file (ie DartSeq, VCF, Hapmap, tabular, etc)  fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.
   * @return availableFormats
  **/
  
      @Valid
    public List<BrAPIVariantSetAvailableFormats> getAvailableFormats() {
    return availableFormats;
  }

  public void setAvailableFormats(List<BrAPIVariantSetAvailableFormats> availableFormats) {
    this.availableFormats = availableFormats;
  }

  public BrAPIVariantSet callSetCount(Integer callSetCount) {
    this.callSetCount = callSetCount;
    return this;
  }

  /**
   * The number of CallSets included in this VariantSet
   * @return callSetCount
  **/
  
  
    public Integer getCallSetCount() {
    return callSetCount;
  }

  public void setCallSetCount(Integer callSetCount) {
    this.callSetCount = callSetCount;
  }

  public BrAPIVariantSet referenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
    return this;
  }

  /**
   * The ID of the reference set that describes the sequences used by the variants in this set.
   * @return referenceSetDbId
  **/
  
  
    public String getReferenceSetDbId() {
    return referenceSetDbId;
  }

  public void setReferenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
  }

  public BrAPIVariantSet studyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  /**
   * The ID of the dataset this variant set belongs to.
   * @return studyDbId
  **/
  
  
    public String getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  public BrAPIVariantSet variantCount(Integer variantCount) {
    this.variantCount = variantCount;
    return this;
  }

  /**
   * The number of Variants included in this VariantSet
   * @return variantCount
  **/
  
  
    public Integer getVariantCount() {
    return variantCount;
  }

  public void setVariantCount(Integer variantCount) {
    this.variantCount = variantCount;
  }

  public BrAPIVariantSet variantSetDbId(String variantSetDbId) {
    this.variantSetDbId = variantSetDbId;
    return this;
  }

  /**
   * The variant set ID.
   * @return variantSetDbId
  **/
  
  
    public String getVariantSetDbId() {
    return variantSetDbId;
  }

  public void setVariantSetDbId(String variantSetDbId) {
    this.variantSetDbId = variantSetDbId;
  }

  public BrAPIVariantSet variantSetName(String variantSetName) {
    this.variantSetName = variantSetName;
    return this;
  }

  /**
   * The variant set name.
   * @return variantSetName
  **/
  
  
    public String getVariantSetName() {
    return variantSetName;
  }

  public void setVariantSetName(String variantSetName) {
    this.variantSetName = variantSetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVariantSet variantSet = (BrAPIVariantSet) o;
    return Objects.equals(this.additionalInfo, variantSet.additionalInfo) &&
        Objects.equals(this.analysis, variantSet.analysis) &&
        Objects.equals(this.availableFormats, variantSet.availableFormats) &&
        Objects.equals(this.callSetCount, variantSet.callSetCount) &&
        Objects.equals(this.referenceSetDbId, variantSet.referenceSetDbId) &&
        Objects.equals(this.studyDbId, variantSet.studyDbId) &&
        Objects.equals(this.variantCount, variantSet.variantCount) &&
        Objects.equals(this.variantSetDbId, variantSet.variantSetDbId) &&
        Objects.equals(this.variantSetName, variantSet.variantSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, analysis, availableFormats, callSetCount, referenceSetDbId, studyDbId, variantCount, variantSetDbId, variantSetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSet {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    availableFormats: ").append(toIndentedString(availableFormats)).append("\n");
    sb.append("    callSetCount: ").append(toIndentedString(callSetCount)).append("\n");
    sb.append("    referenceSetDbId: ").append(toIndentedString(referenceSetDbId)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    variantCount: ").append(toIndentedString(variantCount)).append("\n");
    sb.append("    variantSetDbId: ").append(toIndentedString(variantSetDbId)).append("\n");
    sb.append("    variantSetName: ").append(toIndentedString(variantSetName)).append("\n");
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
