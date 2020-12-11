package io.swagger.client.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.ExternalReferences;
import io.swagger.client.model.GeoJSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;


/**
 * ImageNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class ImageNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("copyright")
  private String copyright = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("descriptiveOntologyTerms")
  @Valid
  private List<String> descriptiveOntologyTerms = null;

  @JsonProperty("externalReferences")
  private ExternalReferences externalReferences = null;

  @JsonProperty("imageFileName")
  private String imageFileName = null;

  @JsonProperty("imageFileSize")
  private Integer imageFileSize = null;

  @JsonProperty("imageHeight")
  private Integer imageHeight = null;

  @JsonProperty("imageLocation")
  private GeoJSON imageLocation = null;

  @JsonProperty("imageName")
  private String imageName = null;

  @JsonProperty("imageTimeStamp")
  private OffsetDateTime imageTimeStamp = null;

  @JsonProperty("imageURL")
  private String imageURL = null;

  @JsonProperty("imageWidth")
  private Integer imageWidth = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("observationDbIds")
  @Valid
  private List<String> observationDbIds = null;

  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId = null;

  public ImageNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public ImageNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ImageNewRequest copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

  /**
   * The copyright information of this image. Example 'Copyright 2018 Bob Robertson'
   * @return copyright
  **/
  
  
    public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public ImageNewRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The human readable description of an image.
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ImageNewRequest descriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
    this.descriptiveOntologyTerms = descriptiveOntologyTerms;
    return this;
  }

  public ImageNewRequest addDescriptiveOntologyTermsItem(String descriptiveOntologyTermsItem) {
    if (this.descriptiveOntologyTerms == null) {
      this.descriptiveOntologyTerms = new ArrayList<String>();
    }
    this.descriptiveOntologyTerms.add(descriptiveOntologyTermsItem);
    return this;
  }

  /**
   * A list of terms to formally describe the image. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.
   * @return descriptiveOntologyTerms
  **/
  
  
    public List<String> getDescriptiveOntologyTerms() {
    return descriptiveOntologyTerms;
  }

  public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
    this.descriptiveOntologyTerms = descriptiveOntologyTerms;
  }

  public ImageNewRequest externalReferences(ExternalReferences externalReferences) {
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

  public ImageNewRequest imageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
    return this;
  }

  /**
   * The name of the image file. Might be the same as 'imageName', but could be different.
   * @return imageFileName
  **/
  
  
    public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }

  public ImageNewRequest imageFileSize(Integer imageFileSize) {
    this.imageFileSize = imageFileSize;
    return this;
  }

  /**
   * The size of the image in Bytes.
   * @return imageFileSize
  **/
  
  
    public Integer getImageFileSize() {
    return imageFileSize;
  }

  public void setImageFileSize(Integer imageFileSize) {
    this.imageFileSize = imageFileSize;
  }

  public ImageNewRequest imageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

  /**
   * The height of the image in Pixels.
   * @return imageHeight
  **/
  
  
    public Integer getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }

  public ImageNewRequest imageLocation(GeoJSON imageLocation) {
    this.imageLocation = imageLocation;
    return this;
  }

  /**
   * Get imageLocation
   * @return imageLocation
  **/
  
  
    @Valid
    public GeoJSON getImageLocation() {
    return imageLocation;
  }

  public void setImageLocation(GeoJSON imageLocation) {
    this.imageLocation = imageLocation;
  }

  public ImageNewRequest imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * The human readable name of an image. Might be the same as 'imageFileName', but could be different.
   * @return imageName
  **/
  
  
    public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ImageNewRequest imageTimeStamp(OffsetDateTime imageTimeStamp) {
    this.imageTimeStamp = imageTimeStamp;
    return this;
  }

  /**
   * The date and time the image was taken
   * @return imageTimeStamp
  **/
  
  
    @Valid
    public OffsetDateTime getImageTimeStamp() {
    return imageTimeStamp;
  }

  public void setImageTimeStamp(OffsetDateTime imageTimeStamp) {
    this.imageTimeStamp = imageTimeStamp;
  }

  public ImageNewRequest imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

  /**
   * The complete, absolute URI path to the image file. Images might be stored on a different host or path than the BrAPI web server.
   * @return imageURL
  **/
  
  
    public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public ImageNewRequest imageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

  /**
   * The width of the image in Pixels.
   * @return imageWidth
  **/
  
  
    public Integer getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
  }

  public ImageNewRequest mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The file type of the image. Examples 'image/jpeg', 'image/png', 'image/svg', etc
   * @return mimeType
  **/
  
  
  @Pattern(regexp="image/.*")   
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public ImageNewRequest observationDbIds(List<String> observationDbIds) {
    this.observationDbIds = observationDbIds;
    return this;
  }

  public ImageNewRequest addObservationDbIdsItem(String observationDbIdsItem) {
    if (this.observationDbIds == null) {
      this.observationDbIds = new ArrayList<String>();
    }
    this.observationDbIds.add(observationDbIdsItem);
    return this;
  }

  /**
   * A list of observation Ids this image is associated with, if applicable.
   * @return observationDbIds
  **/
  
  
    public List<String> getObservationDbIds() {
    return observationDbIds;
  }

  public void setObservationDbIds(List<String> observationDbIds) {
    this.observationDbIds = observationDbIds;
  }

  public ImageNewRequest observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  /**
   * The related observation unit identifier, if relevant.
   * @return observationUnitDbId
  **/
  
  
    public String getObservationUnitDbId() {
    return observationUnitDbId;
  }

  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageNewRequest imageNewRequest = (ImageNewRequest) o;
    return Objects.equals(this.additionalInfo, imageNewRequest.additionalInfo) &&
        Objects.equals(this.copyright, imageNewRequest.copyright) &&
        Objects.equals(this.description, imageNewRequest.description) &&
        Objects.equals(this.descriptiveOntologyTerms, imageNewRequest.descriptiveOntologyTerms) &&
        Objects.equals(this.externalReferences, imageNewRequest.externalReferences) &&
        Objects.equals(this.imageFileName, imageNewRequest.imageFileName) &&
        Objects.equals(this.imageFileSize, imageNewRequest.imageFileSize) &&
        Objects.equals(this.imageHeight, imageNewRequest.imageHeight) &&
        Objects.equals(this.imageLocation, imageNewRequest.imageLocation) &&
        Objects.equals(this.imageName, imageNewRequest.imageName) &&
        Objects.equals(this.imageTimeStamp, imageNewRequest.imageTimeStamp) &&
        Objects.equals(this.imageURL, imageNewRequest.imageURL) &&
        Objects.equals(this.imageWidth, imageNewRequest.imageWidth) &&
        Objects.equals(this.mimeType, imageNewRequest.mimeType) &&
        Objects.equals(this.observationDbIds, imageNewRequest.observationDbIds) &&
        Objects.equals(this.observationUnitDbId, imageNewRequest.observationUnitDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, copyright, description, descriptiveOntologyTerms, externalReferences, imageFileName, imageFileSize, imageHeight, imageLocation, imageName, imageTimeStamp, imageURL, imageWidth, mimeType, observationDbIds, observationUnitDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageNewRequest {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptiveOntologyTerms: ").append(toIndentedString(descriptiveOntologyTerms)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    imageFileSize: ").append(toIndentedString(imageFileSize)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageTimeStamp: ").append(toIndentedString(imageTimeStamp)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
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
