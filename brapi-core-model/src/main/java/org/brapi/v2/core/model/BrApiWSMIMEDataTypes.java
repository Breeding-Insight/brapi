package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets WSMIMEDataTypes
 */
public enum BrApiWSMIMEDataTypes implements BrApiEnum {
  APPLICATION_JSON("application/json"),
    TEXT_CSV("text/csv"),
    TEXT_TSV("text/tsv"),
    APPLICATION_FLAPJACK("application/flapjack");

  private String value;

  BrApiWSMIMEDataTypes(String value) {
    this.value = value;
  }

  @Override
  public String getBrapiValue() {
    return value;
  }
}
