/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.phenotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.*;

/**
 * ImageNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ImageNewRequest {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("copyright")
    private String copyright = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("descriptiveOntologyTerms")
    private List<String> descriptiveOntologyTerms = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("imageFileName")
    private String imageFileName = null;

    @SerializedName("imageFileSize")
    private Integer imageFileSize = null;

    @SerializedName("imageHeight")
    private Integer imageHeight = null;

    @SerializedName("imageLocation")
    private GeoJSON imageLocation = null;

    @SerializedName("imageName")
    private String imageName = null;

    @SerializedName("imageTimeStamp")
    private OffsetDateTime imageTimeStamp = null;

    @SerializedName("imageURL")
    private String imageURL = null;

    @SerializedName("imageWidth")
    private Integer imageWidth = null;

    @SerializedName("mimeType")
    private String mimeType = null;

    @SerializedName("observationDbIds")
    private List<String> observationDbIds = null;

    @SerializedName("observationUnitDbId")
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
     * A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.
     *
     * @return additionalInfo
     **/
    @Schema(description = "A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.")
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
     * The copyright information of this image. Example &#x27;Copyright 2018 Bob Robertson&#x27;
     *
     * @return copyright
     **/
    @Schema(example = "Copyright 2018 Bob Robertson", description = "The copyright information of this image. Example 'Copyright 2018 Bob Robertson'")
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
     *
     * @return description
     **/
    @Schema(example = "This is a picture of a tomato", description = "The human readable description of an image.")
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
     *
     * @return descriptiveOntologyTerms
     **/
    @Schema(example = "[\"doi:10.1002/0470841559\",\"Red\",\"ncbi:0300294\"]", description = "A list of terms to formally describe the image. Each item could be a simple Tag, an Ontology reference Id, or a full ontology URL.")
    public List<String> getDescriptiveOntologyTerms() {
        return descriptiveOntologyTerms;
    }

    public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
        this.descriptiveOntologyTerms = descriptiveOntologyTerms;
    }

    public ImageNewRequest externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ImageNewRequest addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReferencesInner>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.
     *
     * @return externalReferences
     **/
    @Schema(example = "[{\"referenceId\":\"doi:10.155454/12341234\",\"referenceSource\":\"DOI\"},{\"referenceId\":\"75a50e76\",\"referenceSource\":\"Remote Data Collection Upload Tool\"}]", description = "An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.")
    public List<ExternalReferencesInner> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public ImageNewRequest imageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
        return this;
    }

    /**
     * The name of the image file. Might be the same as &#x27;imageName&#x27;, but could be different.
     *
     * @return imageFileName
     **/
    @Schema(example = "image_0000231.jpg", description = "The name of the image file. Might be the same as 'imageName', but could be different.")
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
     *
     * @return imageFileSize
     **/
    @Schema(example = "50000", description = "The size of the image in Bytes.")
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
     *
     * @return imageHeight
     **/
    @Schema(example = "550", description = "The height of the image in Pixels.")
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
     *
     * @return imageLocation
     **/
    @Schema(description = "")
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
     * The human readable name of an image. Might be the same as &#x27;imageFileName&#x27;, but could be different.
     *
     * @return imageName
     **/
    @Schema(example = "Tomato Image 1", description = "The human readable name of an image. Might be the same as 'imageFileName', but could be different.")
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
     *
     * @return imageTimeStamp
     **/
    @Schema(description = "The date and time the image was taken")
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
     *
     * @return imageURL
     **/
    @Schema(example = "https://wiki.brapi.org/images/tomato", description = "The complete, absolute URI path to the image file. Images might be stored on a different host or path than the BrAPI web server.")
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
     *
     * @return imageWidth
     **/
    @Schema(example = "700", description = "The width of the image in Pixels.")
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
     * The file type of the image. Examples &#x27;image/jpeg&#x27;, &#x27;image/png&#x27;, &#x27;image/svg&#x27;, etc
     *
     * @return mimeType
     **/
    @Schema(example = "image/jpeg", description = "The file type of the image. Examples 'image/jpeg', 'image/png', 'image/svg', etc")
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
     *
     * @return observationDbIds
     **/
    @Schema(example = "[\"d05dd235\",\"8875177d\",\"c08e81b6\"]", description = "A list of observation Ids this image is associated with, if applicable.")
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
     *
     * @return observationUnitDbId
     **/
    @Schema(example = "b7e690b6", description = "The related observation unit identifier, if relevant.")
    public String getObservationUnitDbId() {
        return observationUnitDbId;
    }

    public void setObservationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
    }


    @Override
    public boolean equals(Object o) {
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
