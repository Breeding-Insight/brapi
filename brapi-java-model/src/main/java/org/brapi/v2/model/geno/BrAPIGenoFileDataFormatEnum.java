package org.brapi.v2.model.geno;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIGenoFileDataFormatEnum {
    DARTSEQ("DartSeq"),
    VCF("VCF"),
    HAPMAP("Hapmap"),
    TABULAR("tabular"),
    JSON("JSON");

    private String value;

    BrAPIGenoFileDataFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIGenoFileDataFormatEnum fromValue(String text) {
      for (BrAPIGenoFileDataFormatEnum b : BrAPIGenoFileDataFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
}
