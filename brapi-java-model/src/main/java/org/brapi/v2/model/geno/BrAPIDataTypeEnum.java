package org.brapi.v2.model.geno;

import org.brapi.v2.model.BrAPIEnum;

/**
 * The type of field represented in this data matrix. This is intended to help parse the data out of JSON.
 */
public enum BrAPIDataTypeEnum implements BrAPIEnum {
    STRING("string"),
    INTEGER("integer"),
    FLOAT("float"),
    BOOLEAN("boolean");

    private String value;

    BrAPIDataTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrAPIDataTypeEnum fromValue(String input) {
        for (BrAPIDataTypeEnum b : BrAPIDataTypeEnum.values()) {
            if (b.value.equals(input)) {
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
