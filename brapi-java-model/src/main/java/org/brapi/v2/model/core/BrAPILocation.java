package org.brapi.v2.model.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrApiGeoJSON;

import javax.validation.Valid;


/**
 * Location
 */


public class BrAPILocation {
  @JsonProperty("locationDbId")
  private String locationDbId = null;

  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("coordinateDescription")
  private String coordinateDescription = null;

  @JsonProperty("coordinateUncertainty")
  private String coordinateUncertainty = null;

  @JsonProperty("coordinates")
  private BrApiGeoJSON coordinates = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryName")
  private String countryName = null;

  @JsonProperty("documentationURL")
  private String documentationURL = null;

  @JsonProperty("environmentType")
  private String environmentType = null;

  @JsonProperty("exposure")
  private String exposure = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("instituteAddress")
  private String instituteAddress = null;

  @JsonProperty("instituteName")
  private String instituteName = null;

  @JsonProperty("locationName")
  private String locationName = null;

  @JsonProperty("locationType")
  private String locationType = null;

  @JsonProperty("siteStatus")
  private String siteStatus = null;

  @JsonProperty("slope")
  private String slope = null;

  @JsonProperty("topography")
  private String topography = null;

  public BrAPILocation locationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
    return this;
  }

  /**
   * The unique identifier for a Location
   * @return locationDbId
   **/


  public String getLocationDbId() {
    return locationDbId;
  }

  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  public BrAPILocation abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * An abbreviation which represents this location
   * @return abbreviation
   **/


  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public BrAPILocation additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPILocation putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public BrAPILocation coordinateDescription(String coordinateDescription) {
    this.coordinateDescription = coordinateDescription;
    return this;
  }

  /**
   * Describes the precision and landmarks of the coordinate values used for this location. (ex. the site, the nearest town, a 10 kilometers radius circle, +/- 20 meters, etc)
   * @return coordinateDescription
   **/


  public String getCoordinateDescription() {
    return coordinateDescription;
  }

  public void setCoordinateDescription(String coordinateDescription) {
    this.coordinateDescription = coordinateDescription;
  }

  public BrAPILocation coordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
    return this;
  }

  /**
   * Uncertainty associated with the coordinates in meters. Leave the value empty if the uncertainty is unknown.
   * @return coordinateUncertainty
   **/


  public String getCoordinateUncertainty() {
    return coordinateUncertainty;
  }

  public void setCoordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
  }

  public BrAPILocation coordinates(BrApiGeoJSON coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   **/


  @Valid
  public BrApiGeoJSON getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(BrApiGeoJSON coordinates) {
    this.coordinates = coordinates;
  }

  public BrAPILocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   *  [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec MIAPPE V1.1 (DM-17) Geographic location (country) - The country where the experiment took place, either as a full name or preferably as a 2-letter code.
   * @return countryCode
   **/


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public BrAPILocation countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * The full name of the country where this location is  MIAPPE V1.1 (DM-17) Geographic location (country) - The country where the experiment took place, either as a full name or preferably as a 2-letter code.
   * @return countryName
   **/


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public BrAPILocation documentationURL(String documentationURL) {
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

  public BrAPILocation environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

  /**
   * Describes the general type of environment of the location. (ex. forest, field, nursery, etc)
   * @return environmentType
   **/


  public String getEnvironmentType() {
    return environmentType;
  }

  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  public BrAPILocation exposure(String exposure) {
    this.exposure = exposure;
    return this;
  }

  /**
   * Describes the level of protection/exposure for things like sun light and wind.
   * @return exposure
   **/


  public String getExposure() {
    return exposure;
  }

  public void setExposure(String exposure) {
    this.exposure = exposure;
  }

  public BrAPILocation externalReferences(List<BrAPIExternalReference> externalReferences) {
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

  public BrAPILocation instituteAddress(String instituteAddress) {
    this.instituteAddress = instituteAddress;
    return this;
  }

  /**
   * The street address of the institute representing this location  MIAPPE V1.1 (DM-16) Contact institution - Name and address of the institution responsible for the study.
   * @return instituteAddress
   **/


  public String getInstituteAddress() {
    return instituteAddress;
  }

  public void setInstituteAddress(String instituteAddress) {
    this.instituteAddress = instituteAddress;
  }

  public BrAPILocation instituteName(String instituteName) {
    this.instituteName = instituteName;
    return this;
  }

  /**
   * Each institute/laboratory can have several experimental field  MIAPPE V1.1 (DM-16) Contact institution - Name and address of the institution responsible for the study.
   * @return instituteName
   **/


  public String getInstituteName() {
    return instituteName;
  }

  public void setInstituteName(String instituteName) {
    this.instituteName = instituteName;
  }

  public BrAPILocation locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * A human readable name for this location  MIAPPE V1.1 (DM-18) Experimental site name - The name of the natural site, experimental field, greenhouse, phenotyping facility, etc. where the experiment took place.
   * @return locationName
   **/


  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public BrAPILocation locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * The type of location this represents (ex. Breeding Location, Storage Location, etc)
   * @return locationType
   **/


  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public BrAPILocation siteStatus(String siteStatus) {
    this.siteStatus = siteStatus;
    return this;
  }

  /**
   * Description of the accessibility of the location (ex. Public, Private)
   * @return siteStatus
   **/


  public String getSiteStatus() {
    return siteStatus;
  }

  public void setSiteStatus(String siteStatus) {
    this.siteStatus = siteStatus;
  }

  public BrAPILocation slope(String slope) {
    this.slope = slope;
    return this;
  }

  /**
   * Describes the approximate slope (height/distance) of the location.
   * @return slope
   **/


  public String getSlope() {
    return slope;
  }

  public void setSlope(String slope) {
    this.slope = slope;
  }

  public BrAPILocation topography(String topography) {
    this.topography = topography;
    return this;
  }

  /**
   * Describes the topography of the land at the location. (ex. Plateau, Cirque, Hill, Valley, etc)
   * @return topography
   **/


  public String getTopography() {
    return topography;
  }

  public void setTopography(String topography) {
    this.topography = topography;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPILocation location = (BrAPILocation) o;
    return Objects.equals(this.locationDbId, location.locationDbId) &&
            Objects.equals(this.abbreviation, location.abbreviation) &&
            Objects.equals(this.additionalInfo, location.additionalInfo) &&
            Objects.equals(this.coordinateDescription, location.coordinateDescription) &&
            Objects.equals(this.coordinateUncertainty, location.coordinateUncertainty) &&
            Objects.equals(this.coordinates, location.coordinates) &&
            Objects.equals(this.countryCode, location.countryCode) &&
            Objects.equals(this.countryName, location.countryName) &&
            Objects.equals(this.documentationURL, location.documentationURL) &&
            Objects.equals(this.environmentType, location.environmentType) &&
            Objects.equals(this.exposure, location.exposure) &&
            Objects.equals(this.externalReferences, location.externalReferences) &&
            Objects.equals(this.instituteAddress, location.instituteAddress) &&
            Objects.equals(this.instituteName, location.instituteName) &&
            Objects.equals(this.locationName, location.locationName) &&
            Objects.equals(this.locationType, location.locationType) &&
            Objects.equals(this.siteStatus, location.siteStatus) &&
            Objects.equals(this.slope, location.slope) &&
            Objects.equals(this.topography, location.topography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationDbId, abbreviation, additionalInfo, coordinateDescription, coordinateUncertainty, coordinates, countryCode, countryName, documentationURL, environmentType, exposure, externalReferences, instituteAddress, instituteName, locationName, locationType, siteStatus, slope, topography);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    coordinateDescription: ").append(toIndentedString(coordinateDescription)).append("\n");
    sb.append("    coordinateUncertainty: ").append(toIndentedString(coordinateUncertainty)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    instituteAddress: ").append(toIndentedString(instituteAddress)).append("\n");
    sb.append("    instituteName: ").append(toIndentedString(instituteName)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    siteStatus: ").append(toIndentedString(siteStatus)).append("\n");
    sb.append("    slope: ").append(toIndentedString(slope)).append("\n");
    sb.append("    topography: ").append(toIndentedString(topography)).append("\n");
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
