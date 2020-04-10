package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiGeoJSON;

/**
 * All positional and layout information related to this Observation Unit  MIAPPE V1.1 (DM-73) Spatial distribution - Type and value of a spatial coordinate (georeference or relative) or level of observation (plot 45, subblock 7, block 2) provided as a key-value pair of the form type:value. Levels of observation must be consistent with those listed in the Study section.
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiObservationUnitPosition {
  @JsonProperty("blockNumber")
  private String blockNumber;

  @JsonProperty("entryNumber")
  private String entryNumber;

  /**
   * The type of entry for this observation unit. ex. \"CHECK\", \"TEST\", \"FILLER\"
   */
  public enum EntryTypeEnum {
    CHECK,
    TEST,
    FILLER;
  }
  @JsonProperty("entryType")
  private EntryTypeEnum entryType;

  @JsonProperty("geoCoordinates")
  private BrApiGeoJSON geoCoordinates;

  @JsonProperty("positionCoordinateX")
  private String positionCoordinateX;

  /**
   * The type of positional coordinate used. Must be one of the following values  LONGITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  LATITUDE - ISO 6709 standard, WGS84 geodetic datum. See 'Location Coordinate Encoding' for details  PLANTED_ROW - The physical planted row number   PLANTED_INDIVIDUAL - The physical counted number, could be independant or within a planted row  GRID_ROW - The row index number of a square grid overlay  GRID_COL - The column index number of a square grid overlay  MEASURED_ROW - The distance in meters from a defined 0-th row  MEASURED_COL - The distance in meters from a defined 0-th column
   */
  public enum PositionCoordinateType {
    LONGITUDE,
    LATITUDE,
    PLANTED_ROW,
    PLANTED_INDIVIDUAL,
    GRID_ROW,
    GRID_COL,
    MEASURED_ROW,
    MEASURED_COL;
  }
  @JsonProperty("positionCoordinateXType")
  private PositionCoordinateType positionCoordinateXType;

  @JsonProperty("positionCoordinateY")
  private String positionCoordinateY;

  @JsonProperty("positionCoordinateYType")
  private PositionCoordinateType positionCoordinateYType;

  @JsonProperty("replicate")
  private String replicate;

}
