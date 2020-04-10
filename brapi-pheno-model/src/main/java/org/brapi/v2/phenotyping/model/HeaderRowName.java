package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * valid header fields
 */
public enum HeaderRowName {
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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static HeaderRowName fromValue(String text) {
    for (HeaderRowName b : HeaderRowName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
