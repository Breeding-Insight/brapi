package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.brapi.v2.core.model.BrApiEnum;

/**
 * valid header fields
 */
public enum HeaderRowName implements BrApiEnum {
  OBSERVATIONTIMESTAMP("observationTimeStamp"),
  STUDYDBID("studyDbId"),
  STUDYNAME("studyName"),
  GERMPLASMDBID("germplasmDbId"),
  GERMPLASMNAME("germplasmName"),
  OBSERVATIONUNITDBID("observationUnitDbId"),
  OBSERVATIONUNITNAME("observationUnitName"),
  PLOTNUMBER("plotNumber"),
  PLANTNUMBER("plantNumber"),
  BLOCKNUMBER("blockNumber"),
  ENTRYNUMBER("entryNumber"),
  REPLICATE("replicate"),
  POSITIONCOORDINATEX("positionCoordinateX"),
  POSITIONCOORDINATEY("positionCoordinateY");

  private String value;

  HeaderRowName(String value) {
    this.value = value;
  }

  @Override
  public String getBrapiValue() {
    return value;
  }
}
