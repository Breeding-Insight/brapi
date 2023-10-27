package org.brapi.v2.model.geno;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.brapi.v2.model.BrAPIEnum;

import java.io.IOException;

/**
 * The type of samples taken. ex. &#x27;DNA&#x27;, &#x27;RNA&#x27;, &#x27;Tissue&#x27;, etc
 */
public enum BrAPISampleTypeEnum implements BrAPIEnum {
    DNA("DNA"),
    RNA("RNA"),
    TISSUE("TISSUE"),
    MIXED("MIXED");

    private String value;

    BrAPISampleTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BrAPISampleTypeEnum fromValue(String input) {
        for (BrAPISampleTypeEnum b : BrAPISampleTypeEnum.values()) {
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

    public static class Adapter extends TypeAdapter<BrAPISampleTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final BrAPISampleTypeEnum enumeration) throws IOException {
            jsonWriter.value(String.valueOf(enumeration.getValue()));
        }

        @Override
        public BrAPISampleTypeEnum read(final JsonReader jsonReader) throws IOException {
            Object value = jsonReader.nextString();
            return BrAPISampleTypeEnum.fromValue((String) (value));
        }
    }
}
