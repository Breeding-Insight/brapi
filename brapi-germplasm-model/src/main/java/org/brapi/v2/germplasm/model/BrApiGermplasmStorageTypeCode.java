package org.brapi.v2.germplasm.model;

import lombok.Getter;
import org.brapi.v2.core.model.BrApiEnum;

@Getter
public enum BrApiGermplasmStorageTypeCode implements BrApiEnum {

    _10("10", "Seed collection"),
    _11("11", "Short term"),
    _12("12", "Medium term"),
    _13("13", "Long term"),
    _20("20", "Field collection"),
    _30("30", "In vitro collection"),
    _40("40", "Cryo-preserved collection"),
    _50("50", "DNA collection"),
    _99("99", "Other");

    private String value;
    private String description;

    BrApiGermplasmStorageTypeCode(String value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String getBrapiValue() {
        return value;
    }
}
