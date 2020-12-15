package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Information about the location where the sample was collected
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIGermplasmMCPDCollectingInfoCollectingSite   {
  @JsonProperty("coordinateUncertainty")
  private String coordinateUncertainty = null;

  @JsonProperty("elevation")
  private String elevation = null;

  @JsonProperty("georeferencingMethod")
  private String georeferencingMethod = null;

  @JsonProperty("latitudeDecimal")
  private String latitudeDecimal = null;

  @JsonProperty("latitudeDegrees")
  private String latitudeDegrees = null;

  @JsonProperty("locationDescription")
  private String locationDescription = null;

  @JsonProperty("longitudeDecimal")
  private String longitudeDecimal = null;

  @JsonProperty("longitudeDegrees")
  private String longitudeDegrees = null;

  @JsonProperty("spatialReferenceSystem")
  private String spatialReferenceSystem = null;

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite coordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
    return this;
  }

  /**
   * MCPD (v2.1) (COORDUNCERT) 15.5 Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown.
   * @return coordinateUncertainty
  **/
  
  
    public String getCoordinateUncertainty() {
    return coordinateUncertainty;
  }

  public void setCoordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite elevation(String elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * MCPD (v2.1) (ELEVATION) 16. Elevation of collecting site expressed in metres above sea level. Negative values are allowed.
   * @return elevation
  **/
  
  
    public String getElevation() {
    return elevation;
  }

  public void setElevation(String elevation) {
    this.elevation = elevation;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite georeferencingMethod(String georeferencingMethod) {
    this.georeferencingMethod = georeferencingMethod;
    return this;
  }

  /**
   * MCPD (v2.1) (GEOREFMETH) 15.7  The georeferencing method used (GPS, determined from map, gazetteer, or estimated using software). Leave the value empty if georeferencing method is not known.
   * @return georeferencingMethod
  **/
  
  
    public String getGeoreferencingMethod() {
    return georeferencingMethod;
  }

  public void setGeoreferencingMethod(String georeferencingMethod) {
    this.georeferencingMethod = georeferencingMethod;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite latitudeDecimal(String latitudeDecimal) {
    this.latitudeDecimal = latitudeDecimal;
    return this;
  }

  /**
   * MCPD (v2.1) (DECLATITUDE) 15.1 Latitude expressed in decimal degrees. Positive values are North of the Equator; negative values are South of the Equator (e.g. -44.6975).
   * @return latitudeDecimal
  **/
  
  
    public String getLatitudeDecimal() {
    return latitudeDecimal;
  }

  public void setLatitudeDecimal(String latitudeDecimal) {
    this.latitudeDecimal = latitudeDecimal;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite latitudeDegrees(String latitudeDegrees) {
    this.latitudeDegrees = latitudeDegrees;
    return this;
  }

  /**
   * MCPD (v2.1) (LATITUDE) 15.2 Degrees (2 digits) minutes (2 digits), and seconds (2 digits) followed by N (North) or S (South) (e.g. 103020S). Every missing digit (minutes or seconds) should be indicated with a hyphen. Leading zeros are required (e.g. 10
   * @return latitudeDegrees
  **/
  
  
    public String getLatitudeDegrees() {
    return latitudeDegrees;
  }

  public void setLatitudeDegrees(String latitudeDegrees) {
    this.latitudeDegrees = latitudeDegrees;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * MCPD (v2.1) (COLLSITE) 14. Location information below the country level that describes where the accession was collected, preferable in English. This might include the distance in kilometres and direction from the nearest town, village or map grid reference point, (e.g. 7 km south of Townsville).
   * @return locationDescription
  **/
  
  
    public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite longitudeDecimal(String longitudeDecimal) {
    this.longitudeDecimal = longitudeDecimal;
    return this;
  }

  /**
   * MCPD (v2.1) (DECLONGITUDE) 15.3 Longitude expressed in decimal degrees. Positive values are East of the Greenwich Meridian; negative values are West of the Greenwich Meridian (e.g. +120.9123).
   * @return longitudeDecimal
  **/
  
  
    public String getLongitudeDecimal() {
    return longitudeDecimal;
  }

  public void setLongitudeDecimal(String longitudeDecimal) {
    this.longitudeDecimal = longitudeDecimal;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite longitudeDegrees(String longitudeDegrees) {
    this.longitudeDegrees = longitudeDegrees;
    return this;
  }

  /**
   * MCPD (v2.1) (LONGITUDE) 15.4 Degrees (3 digits), minutes (2 digits), and seconds (2 digits) followed by E (East) or W (West) (e.g. 0762510W). Every missing digit (minutes or seconds) should be indicated with a hyphen. Leading zeros are required (e.g. 076
   * @return longitudeDegrees
  **/
  
  
    public String getLongitudeDegrees() {
    return longitudeDegrees;
  }

  public void setLongitudeDegrees(String longitudeDegrees) {
    this.longitudeDegrees = longitudeDegrees;
  }

  public BrAPIGermplasmMCPDCollectingInfoCollectingSite spatialReferenceSystem(String spatialReferenceSystem) {
    this.spatialReferenceSystem = spatialReferenceSystem;
    return this;
  }

  /**
   * MCPD (v2.1) (COORDDATUM) 15.6 The geodetic datum or spatial reference system upon which the coordinates given in decimal latitude and decimal longitude are based (e.g. WGS84). The GPS uses the WGS84 datum.
   * @return spatialReferenceSystem
  **/
  
  
    public String getSpatialReferenceSystem() {
    return spatialReferenceSystem;
  }

  public void setSpatialReferenceSystem(String spatialReferenceSystem) {
    this.spatialReferenceSystem = spatialReferenceSystem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmMCPDCollectingInfoCollectingSite germplasmMCPDCollectingInfoCollectingSite = (BrAPIGermplasmMCPDCollectingInfoCollectingSite) o;
    return Objects.equals(this.coordinateUncertainty, germplasmMCPDCollectingInfoCollectingSite.coordinateUncertainty) &&
        Objects.equals(this.elevation, germplasmMCPDCollectingInfoCollectingSite.elevation) &&
        Objects.equals(this.georeferencingMethod, germplasmMCPDCollectingInfoCollectingSite.georeferencingMethod) &&
        Objects.equals(this.latitudeDecimal, germplasmMCPDCollectingInfoCollectingSite.latitudeDecimal) &&
        Objects.equals(this.latitudeDegrees, germplasmMCPDCollectingInfoCollectingSite.latitudeDegrees) &&
        Objects.equals(this.locationDescription, germplasmMCPDCollectingInfoCollectingSite.locationDescription) &&
        Objects.equals(this.longitudeDecimal, germplasmMCPDCollectingInfoCollectingSite.longitudeDecimal) &&
        Objects.equals(this.longitudeDegrees, germplasmMCPDCollectingInfoCollectingSite.longitudeDegrees) &&
        Objects.equals(this.spatialReferenceSystem, germplasmMCPDCollectingInfoCollectingSite.spatialReferenceSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinateUncertainty, elevation, georeferencingMethod, latitudeDecimal, latitudeDegrees, locationDescription, longitudeDecimal, longitudeDegrees, spatialReferenceSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDCollectingInfoCollectingSite {\n");
    
    sb.append("    coordinateUncertainty: ").append(toIndentedString(coordinateUncertainty)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    georeferencingMethod: ").append(toIndentedString(georeferencingMethod)).append("\n");
    sb.append("    latitudeDecimal: ").append(toIndentedString(latitudeDecimal)).append("\n");
    sb.append("    latitudeDegrees: ").append(toIndentedString(latitudeDegrees)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    longitudeDecimal: ").append(toIndentedString(longitudeDecimal)).append("\n");
    sb.append("    longitudeDegrees: ").append(toIndentedString(longitudeDegrees)).append("\n");
    sb.append("    spatialReferenceSystem: ").append(toIndentedString(spatialReferenceSystem)).append("\n");
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
