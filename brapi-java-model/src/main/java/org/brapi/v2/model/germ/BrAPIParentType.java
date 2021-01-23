package org.brapi.v2.model.germ;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIParentType implements BrAPIEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    SELF("SELF"),
    
    POPULATION("POPULATION");

    private String value;

    BrAPIParentType(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIParentType fromValue(String text) {
      for (BrAPIParentType b : BrAPIParentType.values()) {
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
