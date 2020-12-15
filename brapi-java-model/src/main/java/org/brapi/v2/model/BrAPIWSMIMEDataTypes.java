package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Gets or Sets WSMIMEDataTypes
 */
public enum BrAPIWSMIMEDataTypes {
  APPLICATION_JSON("application/json"),
    TEXT_CSV("text/csv"),
    TEXT_TSV("text/tsv"),
    APPLICATION_FLAPJACK("application/flapjack"),
    APPLICATION_EXCEL("application/excel"),
    APPLICATION_ZIP("application/zip");

  private String value;

  BrAPIWSMIMEDataTypes(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BrAPIWSMIMEDataTypes fromValue(String text) {
    for (BrAPIWSMIMEDataTypes b : BrAPIWSMIMEDataTypes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
