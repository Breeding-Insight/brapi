package org.brapi.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPISortOrder implements BrAPIEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    BrAPISortOrder(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPISortOrder fromValue(String text) {
      for (BrAPISortOrder b : BrAPISortOrder.values()) {
        if (String.valueOf(b.value).equalsIgnoreCase(text)) {
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
