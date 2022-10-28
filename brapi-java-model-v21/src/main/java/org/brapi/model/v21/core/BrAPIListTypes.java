package org.brapi.model.v21.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ListTypes
 */
public enum BrAPIListTypes implements BrAPIEnum {
    GERMPLASM("germplasm"),
    MARKERS("markers"),
    PROGRAMS("programs"),
    TRIALS("trials"),
    STUDIES("studies"),
    OBSERVATIONUNITS("observationUnits"),
    OBSERVATIONS("observations"),
    OBSERVATIONVARIABLES("observationVariables"),
    SAMPLES("samples");

    private final String value;

    BrAPIListTypes(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static BrAPIListTypes fromValue(String text) {
        for (BrAPIListTypes b : BrAPIListTypes.values()) {
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
