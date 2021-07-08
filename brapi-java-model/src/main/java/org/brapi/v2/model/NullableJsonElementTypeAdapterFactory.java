package org.brapi.v2.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Copied from: https://github.com/google/gson/pull/1688
 *
 * Factory for deserializing {@link JsonElement} and all of its subclasses as
 * {@code null} instead of {@code JsonNull.INSTANCE}.
 *
 * <p>Must <b>only</b> be used in combination with {@link JsonAdapter @JsonAdapter}
 * on fields:
 * <pre>
 * class MyClass {
 *     &#x40;JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
 *     JsonElement f;
 * }
 * </pre>
 */
public class NullableJsonElementTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if (JsonElement.class.isAssignableFrom(type.getRawType())) {
            // Due to Gson issue #1028 have to call getAdapter(...) instead of getDelegateAdapter(...)
            TypeAdapter<JsonElement> delegateAdapter = gson.getAdapter(JsonElement.class);

            // Safe due to type check at beginning
            @SuppressWarnings("unchecked")
            TypeAdapter<T> adapter = (TypeAdapter<T>) new NullableJsonElementTypeAdapter(delegateAdapter);
            return adapter;
        } else {
            return null;
        }
    }

    private static class NullableJsonElementTypeAdapter extends TypeAdapter<JsonElement> {
        private final TypeAdapter<JsonElement> delegate;

        public NullableJsonElementTypeAdapter(TypeAdapter<JsonElement> delegate) {
            this.delegate = delegate;
        }

        @Override
        public void write(JsonWriter out, JsonElement value) throws IOException {
            delegate.write(out, value);
        }

        @Override
        public JsonElement read(JsonReader in) throws IOException {
            if (in.peek() == JsonToken.NULL) {
                return null;
            } else {
                return delegate.read(in);
            }
        }
    }
}
