package org.brapi.v2.model.germ;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIPlannedCrossStatus implements BrAPIEnum {
    TODO("TODO"),
    DONE("DONE"),
    SKIPPED("SKIPPED");

    private String value;

    BrAPIPlannedCrossStatus(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIPlannedCrossStatus fromValue(String text) {
      for (BrAPIPlannedCrossStatus b : BrAPIPlannedCrossStatus.values()) {
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
