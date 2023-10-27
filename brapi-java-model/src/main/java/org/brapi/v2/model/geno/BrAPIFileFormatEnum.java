package org.brapi.v2.model.geno;

import org.brapi.v2.model.BrAPIEnum;

/**
 * fileFormat defines the MIME type of the file (ie text/csv, application/excel, application/zip). This should also be reflected in the Accept and ContentType HTTP headers for every relevant request and response.
 */
public enum BrAPIFileFormatEnum implements BrAPIEnum {
    TEXT_CSV("text/csv"),
    TEXT_TSV("text/tsv"),
    APPLICATION_EXCEL("application/excel"),
    APPLICATION_ZIP("application/zip"),
    APPLICATION_JSON("application/json");

    private String value;

    BrAPIFileFormatEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrAPIFileFormatEnum fromValue(String input) {
        for (BrAPIFileFormatEnum b : BrAPIFileFormatEnum.values()) {
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
