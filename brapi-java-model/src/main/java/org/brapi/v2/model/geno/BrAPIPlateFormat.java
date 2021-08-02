package org.brapi.v2.model.geno;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Enum for plate formats, usually \"PLATE_96\" for a 96 well plate or \"TUBES\" for plateless format
 */
public enum BrAPIPlateFormat implements BrAPIEnum {
  PLATE_96("PLATE_96"),
    TUBES("TUBES");

  private String value;

  BrAPIPlateFormat(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrAPIPlateFormat fromValue(String text) {
    for (BrAPIPlateFormat b : BrAPIPlateFormat.values()) {
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
