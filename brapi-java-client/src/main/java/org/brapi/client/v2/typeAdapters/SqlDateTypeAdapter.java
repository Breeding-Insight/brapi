package org.brapi.client.v2.typeAdapters;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * Gson TypeAdapter for java.sql.Date type
 * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
 * (more efficient than SimpleDateFormat).
 */
public class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

    private DateFormat dateFormat;

    public SqlDateTypeAdapter() {
    }

    public SqlDateTypeAdapter(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public void write(JsonWriter out, java.sql.Date date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            String value;
            if (dateFormat != null) {
                value = dateFormat.format(date);
            } else {
                value = date.toString();
            }
            out.value(value);
        }
    }

    @Override
    public java.sql.Date read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        String date = in.nextString();
        try {
            if (dateFormat != null) {
                return new java.sql.Date(dateFormat.parse(date).getTime());
            }
            return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }
}