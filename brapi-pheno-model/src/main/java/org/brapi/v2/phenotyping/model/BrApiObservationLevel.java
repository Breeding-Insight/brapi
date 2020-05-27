package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.brapi.v2.core.model.BrApiEnum;

/**
 * observation levels available in this database
 */
public enum BrApiObservationLevel implements BrApiEnum {
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
  public String getBrapiValue() {
    return value;
  }
}
