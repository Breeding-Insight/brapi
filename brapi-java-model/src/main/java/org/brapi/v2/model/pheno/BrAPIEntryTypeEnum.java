package org.brapi.v2.model.pheno;

import lombok.NonNull;
import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIEntryTypeEnum implements BrAPIEnum {
    CHECK("CHECK"),
    TEST("TEST"),
    FILLER("FILLER");

    private String value;

    BrAPIEntryTypeEnum(@NonNull String value) {
      this.value = value.toUpperCase();
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIEntryTypeEnum fromValue(@NonNull String text) {
      for (BrAPIEntryTypeEnum b : BrAPIEntryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text.toUpperCase())) {
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
