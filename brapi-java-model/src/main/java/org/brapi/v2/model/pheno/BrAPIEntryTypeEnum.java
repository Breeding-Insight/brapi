package org.brapi.v2.model.pheno;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIEntryTypeEnum implements BrAPIEnum {
    CHECK("CHECK"),
    TEST("TEST"),
    FILLER("FILLER");

    private String value;

    BrAPIEntryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIEntryTypeEnum fromValue(String text) {
      for (BrAPIEntryTypeEnum b : BrAPIEntryTypeEnum.values()) {
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
