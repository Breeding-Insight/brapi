package org.brapi.v2.model.geno;

import org.brapi.v2.model.BrAPIEnum;

/**
 * The dimension of the matrix being paginated
 */
public enum BrAPIDimensionEnum implements BrAPIEnum {
    CALLSETS("CALLSETS"),
    VARIANTS("VARIANTS");

    private String value;

    BrAPIDimensionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrAPIDimensionEnum fromValue(String input) {
        for (BrAPIDimensionEnum b : BrAPIDimensionEnum.values()) {
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
