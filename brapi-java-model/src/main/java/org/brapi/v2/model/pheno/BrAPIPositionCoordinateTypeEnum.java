package org.brapi.v2.model.pheno;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIPositionCoordinateTypeEnum {
    LONGITUDE("LONGITUDE"),
    LATITUDE("LATITUDE"),
    PLANTED_ROW("PLANTED_ROW"),
    PLANTED_INDIVIDUAL("PLANTED_INDIVIDUAL"),
    GRID_ROW("GRID_ROW"),
    GRID_COL("GRID_COL"),
    MEASURED_ROW("MEASURED_ROW"),
    MEASURED_COL("MEASURED_COL");

    private String value;

    BrAPIPositionCoordinateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIPositionCoordinateTypeEnum fromValue(String text) {
      for (BrAPIPositionCoordinateTypeEnum b : BrAPIPositionCoordinateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
}
