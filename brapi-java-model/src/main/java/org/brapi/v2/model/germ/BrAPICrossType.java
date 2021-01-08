package org.brapi.v2.model.germ;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPICrossType implements BrAPIEnum {
    BIPARENTAL("BIPARENTAL"),
    
    SELF("SELF"),
    
    OPEN_POLLINATED("OPEN_POLLINATED"),
    
    BULK("BULK"),
    
    BULK_SELFED("BULK_SELFED"),
    
    BULK_OPEN_POLLINATED("BULK_OPEN_POLLINATED"),
    
    DOUBLE_HAPLOID("DOUBLE_HAPLOID");

    private String value;

    BrAPICrossType(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPICrossType fromValue(String text) {
      for (BrAPICrossType b : BrAPICrossType.values()) {
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
