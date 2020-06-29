/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
  private String blockNumber;

  private String entryNumber;

  /**
   * The type of entry for this observation unit. ex. \"CHECK\", \"TEST\", \"FILLER\"
   */
  public enum EntryTypeEnum {
    CHECK,
    TEST,
    FILLER;
  }
  private EntryTypeEnum entryType;

  private BrApiGeoJSON geoCoordinates;

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
  private PositionCoordinateType positionCoordinateXType;

  private String positionCoordinateY;

  private PositionCoordinateType positionCoordinateYType;

  private String replicate;

}
