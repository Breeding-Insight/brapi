package org.brapi.client.v2.typeAdapters;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gson TypeAdapter for JSR310 OffsetDateTime type
 */
public class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

    private DateTimeFormatter formatter;

    public OffsetDateTimeTypeAdapter() {
        this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    /**
     * Member used to solve https://github.com/Breeding-Insight/brapi/pull/31
     * This is the expected shortened date without a timestamp e.g 1992-01-08.
     * Goal is to replace these dates with a default timestamp 1992-01-08T00:00:00Z
     */
    private static String shortDateFormat = "yyyy-MM-dd";

    public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void setFormat(DateTimeFormatter dateFormat) {
        this.formatter = dateFormat;
    }

    @Override
    public void write(JsonWriter out, OffsetDateTime date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(formatter.format(date));
        }
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                if (date.endsWith("+0000")) {
                    date = date.substring(0, date.length()-5) + "Z";
                }
                //using the shortDateFormat field, check if the new date is the same length,
                //if it is then append a timestamp.
                if (date.length() == shortDateFormat.length()) {
                    date = date + "T00:00:00Z";
                }
                //catch any date parsing exception, set to null if exception occurs
                OffsetDateTime parsedDate;
                try {
                    parsedDate = OffsetDateTime.parse(date, formatter);
                } catch (java.time.format.DateTimeParseException e) {
                    parsedDate = null;
                }
                return parsedDate;
        }
    }
}
