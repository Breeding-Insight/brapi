package org.brapi.v2.model.pheno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.filosganga.geogson.model.Feature;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.pheno.BrAPIObservationUnitLevelRelationship;

/**
 * All positional and layout information related to this Observation Unit  MIAPPE V1.1 (DM-73) Spatial distribution - Type and value of a spatial coordinate (georeference or relative) or level of observation (plot 45, subblock 7, block 2) provided as a key-value pair of the form type:value. Levels of observation must be consistent with those listed in the Study section.
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservationUnitPosition   {

  @JsonProperty("entryType")
  private BrAPIEntryTypeEnum entryType = null;

  @JsonProperty("geoCoordinates")
  private BrApiGeoJSON geoCoordinates = null;

  @JsonProperty("observationLevel")
  private BrAPIObservationUnitLevelRelationship observationLevel = null;

  @JsonProperty("observationLevelRelationships")
  @Valid
  private List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships = null;

  @JsonProperty("positionCoordinateX")
  private String positionCoordinateX = null;

  @JsonProperty("positionCoordinateXType")
  private BrAPIPositionCoordinateTypeEnum positionCoordinateXType = null;

  @JsonProperty("positionCoordinateY")
  private String positionCoordinateY = null;

  @JsonProperty("positionCoordinateYType")
  private BrAPIPositionCoordinateTypeEnum positionCoordinateYType = null;

  public BrAPIObservationUnitPosition entryType(BrAPIEntryTypeEnum entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * The type of entry for this observation unit. ex. \"CHECK\", \"TEST\", \"FILLER\"
   * @return entryType
  **/
  
  
    public BrAPIEntryTypeEnum getEntryType() {
    return entryType;
  }

  public void setEntryType(BrAPIEntryTypeEnum entryType) {
    this.entryType = entryType;
  }

  public BrAPIObservationUnitPosition geoCoordinates(BrApiGeoJSON geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
    return this;
  }

  /**
   * Get geoCoordinates
   * @return geoCoordinates
  **/
  
  
    @Valid
    public BrApiGeoJSON getGeoCoordinates() {
    return geoCoordinates;
  }

  public void setGeoCoordinates(BrApiGeoJSON geoCoordinates) {
    this.geoCoordinates = geoCoordinates;
  }

  public BrAPIObservationUnitPosition observationLevel(BrAPIObservationUnitLevelRelationship observationLevel) {
    this.observationLevel = observationLevel;
    return this;
  }

  /**
   * Get observationLevel
   * @return observationLevel
  **/
  
  
    public BrAPIObservationUnitLevelRelationship getObservationLevel() {
    return observationLevel;
  }

  public void setObservationLevel(BrAPIObservationUnitLevelRelationship observationLevel) {
    this.observationLevel = observationLevel;
  }

  public BrAPIObservationUnitPosition observationLevelRelationships(List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships) {
    this.observationLevelRelationships = observationLevelRelationships;
    return this;
  }

  public BrAPIObservationUnitPosition addObservationLevelRelationshipsItem(BrAPIObservationUnitLevelRelationship observationLevelRelationshipsItem) {
    if (this.observationLevelRelationships == null) {
      this.observationLevelRelationships = new ArrayList<BrAPIObservationUnitLevelRelationship>();
    }
    this.observationLevelRelationships.add(observationLevelRelationshipsItem);
    return this;
  }

  /**
   * Observation levels indicate the granularity level at which the measurements are taken.   `levelName` defines the level   `levelOrder` defines where that level exists in the hierarchy of levels. `levelOrder`s lower numbers are at the top of the hierarchy (ie field > 0) and higher numbers are at the bottom of the hierarchy (ie plant > 6).   `levelCode` is an ID code for this level tag. Identify this observation unit by each level of the hierarchy where it exists
   * @return observationLevelRelationships
  **/
  
      @Valid
    public List<BrAPIObservationUnitLevelRelationship> getObservationLevelRelationships() {
    return observationLevelRelationships;
  }

  public void setObservationLevelRelationships(List<BrAPIObservationUnitLevelRelationship> observationLevelRelationships) {
    this.observationLevelRelationships = observationLevelRelationships;
  }

  public BrAPIObservationUnitPosition positionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
    return this;
  }

  /**
   * The X position coordinate for an observation unit. Different systems may use different coordinate systems.
   * @return positionCoordinateX
  **/
  
  
    public String getPositionCoordinateX() {
    return positionCoordinateX;
  }

  public void setPositionCoordinateX(String positionCoordinateX) {
    this.positionCoordinateX = positionCoordinateX;
  }

  public BrAPIObservationUnitPosition positionCoordinateXType(BrAPIPositionCoordinateTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
    return this;
  }

  /**
   * The type of positional coordinate used. Must be one of the following values  LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  PLANTED_ROW - The physical planted row number   PLANTED_INDIVIDUAL - The physical counted number, could be independant or within a planted row  GRID_ROW - The row index number of a square grid overlay  GRID_COL - The column index number of a square grid overlay  MEASURED_ROW - The distance in meters from a defined 0-th row  MEASURED_COL - The distance in meters from a defined 0-th column
   * @return positionCoordinateXType
  **/
  
  
    public BrAPIPositionCoordinateTypeEnum getPositionCoordinateXType() {
    return positionCoordinateXType;
  }

  public void setPositionCoordinateXType(BrAPIPositionCoordinateTypeEnum positionCoordinateXType) {
    this.positionCoordinateXType = positionCoordinateXType;
  }

  public BrAPIObservationUnitPosition positionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
    return this;
  }

  /**
   * The Y position coordinate for an observation unit. Different systems may use different coordinate systems.
   * @return positionCoordinateY
  **/
  
  
    public String getPositionCoordinateY() {
    return positionCoordinateY;
  }

  public void setPositionCoordinateY(String positionCoordinateY) {
    this.positionCoordinateY = positionCoordinateY;
  }

  public BrAPIObservationUnitPosition positionCoordinateYType(BrAPIPositionCoordinateTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
    return this;
  }

  /**
   * The type of positional coordinate used. Must be one of the following values  LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  PLANTED_ROW - The physical planted row number   PLANTED_INDIVIDUAL - The physical counted number, could be independant or within a planted row  GRID_ROW - The row index number of a square grid overlay  GRID_COL - The column index number of a square grid overlay  MEASURED_ROW - The distance in meters from a defined 0-th row  MEASURED_COL - The distance in meters from a defined 0-th column
   * @return positionCoordinateYType
  **/
  
  
    public BrAPIPositionCoordinateTypeEnum getPositionCoordinateYType() {
    return positionCoordinateYType;
  }

  public void setPositionCoordinateYType(BrAPIPositionCoordinateTypeEnum positionCoordinateYType) {
    this.positionCoordinateYType = positionCoordinateYType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnitPosition observationUnitPosition = (BrAPIObservationUnitPosition) o;
    return Objects.equals(this.entryType, observationUnitPosition.entryType) &&
        Objects.equals(this.geoCoordinates, observationUnitPosition.geoCoordinates) &&
        Objects.equals(this.observationLevel, observationUnitPosition.observationLevel) &&
        Objects.equals(this.observationLevelRelationships, observationUnitPosition.observationLevelRelationships) &&
        Objects.equals(this.positionCoordinateX, observationUnitPosition.positionCoordinateX) &&
        Objects.equals(this.positionCoordinateXType, observationUnitPosition.positionCoordinateXType) &&
        Objects.equals(this.positionCoordinateY, observationUnitPosition.positionCoordinateY) &&
        Objects.equals(this.positionCoordinateYType, observationUnitPosition.positionCoordinateYType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryType, geoCoordinates, observationLevel, observationLevelRelationships, positionCoordinateX, positionCoordinateXType, positionCoordinateY, positionCoordinateYType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitPosition {\n");
    
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    geoCoordinates: ").append(toIndentedString(geoCoordinates)).append("\n");
    sb.append("    observationLevel: ").append(toIndentedString(observationLevel)).append("\n");
    sb.append("    observationLevelRelationships: ").append(toIndentedString(observationLevelRelationships)).append("\n");
    sb.append("    positionCoordinateX: ").append(toIndentedString(positionCoordinateX)).append("\n");
    sb.append("    positionCoordinateXType: ").append(toIndentedString(positionCoordinateXType)).append("\n");
    sb.append("    positionCoordinateY: ").append(toIndentedString(positionCoordinateY)).append("\n");
    sb.append("    positionCoordinateYType: ").append(toIndentedString(positionCoordinateYType)).append("\n");
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
