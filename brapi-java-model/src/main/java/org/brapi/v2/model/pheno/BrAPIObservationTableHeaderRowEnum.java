package org.brapi.v2.model.pheno;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIObservationTableHeaderRowEnum implements BrAPIEnum{
    OBSERVATIONTIMESTAMP("observationTimeStamp"),
    OBSERVATIONUNITDBID("observationUnitDbId"),
    OBSERVATIONUNITNAME("observationUnitName"),
    STUDYDBID("studyDbId"),
    STUDYNAME("studyName"),
    GERMPLASMDBID("germplasmDbId"),
    GERMPLASMNAME("germplasmName"),
    POSITIONCOORDINATEX("positionCoordinateX"),
    POSITIONCOORDINATEY("positionCoordinateY"),
    YEAR("year"),
    FIELD("field"),
    PLOT("plot"),
    SUB_PLOT("sub-plot"),
    PLANT("plant"),
    POT("pot"),
    BLOCK("block"),
    ENTRY("entry"),
    REP("rep");

    private String value;

    BrAPIObservationTableHeaderRowEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIObservationTableHeaderRowEnum fromValue(String text) {
      for (BrAPIObservationTableHeaderRowEnum b : BrAPIObservationTableHeaderRowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

	@Override
	public String getBrapiValue() {
		return value;
	}
}
