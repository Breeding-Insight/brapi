package org.brapi.v2.model.pheno;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIObservationUnitHierarchyLevelEnum implements BrAPIEnum {
    STUDY("study"),
    FIELD("field"),
    ENTRY("entry"),
    REP("rep"),
    BLOCK("block"),
    SUB_BLOCK("sub-block"),
    PLOT("plot"),
    SUB_PLOT("sub-plot"),
    PLANT("plant"),
    POT("pot"),
    SAMPLE("sample");

    private String value;

    BrAPIObservationUnitHierarchyLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIObservationUnitHierarchyLevelEnum fromValue(String text) {
      for (BrAPIObservationUnitHierarchyLevelEnum b : BrAPIObservationUnitHierarchyLevelEnum.values()) {
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
