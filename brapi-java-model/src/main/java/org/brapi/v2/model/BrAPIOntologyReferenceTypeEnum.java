package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIOntologyReferenceTypeEnum implements BrAPIEnum {
    OBO("OBO"),
    RDF("RDF"),
    WEBPAGE("WEBPAGE");

    private String value;

    BrAPIOntologyReferenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIOntologyReferenceTypeEnum fromValue(String text) {
      for (BrAPIOntologyReferenceTypeEnum b : BrAPIOntologyReferenceTypeEnum.values()) {
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
