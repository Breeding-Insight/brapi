package org.brapi.client.v2;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.brapi.v2.core.model.BrApiEnum;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class BrApiEnumTypeAdapterFactory implements TypeAdapterFactory {

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<T> rawType = (Class<T>) type.getRawType();
        if (!(rawType.isEnum() && BrApiEnum.class.isAssignableFrom(rawType))) {
            return null;
        }

        final Map<String, T> valueToNameMap = new HashMap<String, T>();
        for (T constant : rawType.getEnumConstants()) {
            valueToNameMap.put(((BrApiEnum)constant).getBrapiValue(), constant);
        }

        return new TypeAdapter<T>() {

            public void write(JsonWriter out, T value) throws IOException {
                if (value == null) {
                    out.nullValue();
                } else {
                    out.value(((BrApiEnum)value).getBrapiValue());
                }
            }

            public T read(JsonReader reader) throws IOException {
                if (reader.peek() == JsonToken.NULL) {
                    reader.nextNull();
                    return null;
                } else {
                    return valueToNameMap.get(reader.nextString());
                }
            }
        };
    }

}
