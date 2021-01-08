package org.brapi.v2.model.geno;

import org.brapi.v2.model.BrAPIEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BrAPIVendorServicePlatformMarkerTypeEnum implements BrAPIEnum {
    FIXED("FIXED"),
    DISCOVERABLE("DISCOVERABLE");

    private String value;

    BrAPIVendorServicePlatformMarkerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIVendorServicePlatformMarkerTypeEnum fromValue(String text) {
      for (BrAPIVendorServicePlatformMarkerTypeEnum b : BrAPIVendorServicePlatformMarkerTypeEnum.values()) {
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
