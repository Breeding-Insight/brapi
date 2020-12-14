package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;


/**
 * GenomeMap
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class GenomeMap   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("documentationURL")
  private String documentationURL = null;

  @JsonProperty("linkageGroupCount")
  private Integer linkageGroupCount = null;

  @JsonProperty("mapDbId")
  private String mapDbId = null;

  @JsonProperty("mapName")
  private String mapName = null;

  @JsonProperty("mapPUI")
  private String mapPUI = null;

  @JsonProperty("markerCount")
  private Integer markerCount = null;

  @JsonProperty("publishedDate")
  private OffsetDateTime publishedDate = null;

  @JsonProperty("scientificName")
  private String scientificName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("unit")
  private String unit = null;

  public GenomeMap additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public GenomeMap putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public GenomeMap comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Additional comments
   * @return comments
  **/
  
  
    public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public GenomeMap commonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
    return this;
  }

  /**
   * The common name of the crop
   * @return commonCropName
  **/
  
      

    public String getCommonCropName() {
    return commonCropName;
  }

  public void setCommonCropName(String commonCropName) {
    this.commonCropName = commonCropName;
  }

  public GenomeMap documentationURL(String documentationURL) {
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

  public GenomeMap linkageGroupCount(Integer linkageGroupCount) {
    this.linkageGroupCount = linkageGroupCount;
    return this;
  }

  /**
   * The number of linkage groups present in this genomic map
   * @return linkageGroupCount
  **/
  
  
    public Integer getLinkageGroupCount() {
    return linkageGroupCount;
  }

  public void setLinkageGroupCount(Integer linkageGroupCount) {
    this.linkageGroupCount = linkageGroupCount;
  }

  public GenomeMap mapDbId(String mapDbId) {
    this.mapDbId = mapDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies this genomic map
   * @return mapDbId
  **/
  
      

    public String getMapDbId() {
    return mapDbId;
  }

  public void setMapDbId(String mapDbId) {
    this.mapDbId = mapDbId;
  }

  public GenomeMap mapName(String mapName) {
    this.mapName = mapName;
    return this;
  }

  /**
   * A human readable name for this genomic map
   * @return mapName
  **/
  
  
    public String getMapName() {
    return mapName;
  }

  public void setMapName(String mapName) {
    this.mapName = mapName;
  }

  public GenomeMap mapPUI(String mapPUI) {
    this.mapPUI = mapPUI;
    return this;
  }

  /**
   * The DOI or other permanent identifier for this genomic map
   * @return mapPUI
  **/
  
  
    public String getMapPUI() {
    return mapPUI;
  }

  public void setMapPUI(String mapPUI) {
    this.mapPUI = mapPUI;
  }

  public GenomeMap markerCount(Integer markerCount) {
    this.markerCount = markerCount;
    return this;
  }

  /**
   * The number of markers present in this genomic map
   * @return markerCount
  **/
  
  
    public Integer getMarkerCount() {
    return markerCount;
  }

  public void setMarkerCount(Integer markerCount) {
    this.markerCount = markerCount;
  }

  public GenomeMap publishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

  /**
   * The date this genome was published
   * @return publishedDate
  **/
  
  
    @Valid
    public OffsetDateTime getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
  }

  public GenomeMap scientificName(String scientificName) {
    this.scientificName = scientificName;
    return this;
  }

  /**
   * Full scientific binomial format name. This includes Genus, Species, and Sub-species
   * @return scientificName
  **/
  
  
    public String getScientificName() {
    return scientificName;
  }

  public void setScientificName(String scientificName) {
    this.scientificName = scientificName;
  }

  public GenomeMap type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of map this represents, usually \"Genetic\"
   * @return type
  **/
  
      

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GenomeMap unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The units used to describe the data in this map
   * @return unit
  **/
  
  
    public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenomeMap genomeMap = (GenomeMap) o;
    return Objects.equals(this.additionalInfo, genomeMap.additionalInfo) &&
        Objects.equals(this.comments, genomeMap.comments) &&
        Objects.equals(this.commonCropName, genomeMap.commonCropName) &&
        Objects.equals(this.documentationURL, genomeMap.documentationURL) &&
        Objects.equals(this.linkageGroupCount, genomeMap.linkageGroupCount) &&
        Objects.equals(this.mapDbId, genomeMap.mapDbId) &&
        Objects.equals(this.mapName, genomeMap.mapName) &&
        Objects.equals(this.mapPUI, genomeMap.mapPUI) &&
        Objects.equals(this.markerCount, genomeMap.markerCount) &&
        Objects.equals(this.publishedDate, genomeMap.publishedDate) &&
        Objects.equals(this.scientificName, genomeMap.scientificName) &&
        Objects.equals(this.type, genomeMap.type) &&
        Objects.equals(this.unit, genomeMap.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, comments, commonCropName, documentationURL, linkageGroupCount, mapDbId, mapName, mapPUI, markerCount, publishedDate, scientificName, type, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenomeMap {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    linkageGroupCount: ").append(toIndentedString(linkageGroupCount)).append("\n");
    sb.append("    mapDbId: ").append(toIndentedString(mapDbId)).append("\n");
    sb.append("    mapName: ").append(toIndentedString(mapName)).append("\n");
    sb.append("    mapPUI: ").append(toIndentedString(mapPUI)).append("\n");
    sb.append("    markerCount: ").append(toIndentedString(markerCount)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    scientificName: ").append(toIndentedString(scientificName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
