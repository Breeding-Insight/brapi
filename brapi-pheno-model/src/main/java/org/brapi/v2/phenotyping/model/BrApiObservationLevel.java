package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * observation levels available in this database
 */
public enum BrApiObservationLevel {
  FIELD("field"),
  PLOT("plot"),
  SUBPLOT("subplot"),
  PLANT("plant"),
  SAMPLE("sample");

  private String value;

  BrApiObservationLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrApiObservationLevel fromValue(String text) {
    for (BrApiObservationLevel b : BrApiObservationLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
