package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets WSMIMEDataTypes
 */
public enum BrApiWSMIMEDataTypes {
  APPLICATION_JSON("application/json"),
    TEXT_CSV("text/csv"),
    TEXT_TSV("text/tsv"),
    APPLICATION_FLAPJACK("application/flapjack");

  private String value;

  BrApiWSMIMEDataTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrApiWSMIMEDataTypes fromValue(String text) {
    for (BrApiWSMIMEDataTypes b : BrApiWSMIMEDataTypes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
