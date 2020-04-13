package org.brapi.client.v2;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.brapi.v2.core.model.response.Metadata;

@FunctionalInterface
public interface ResponseHandlerFunction<R> {
    R apply(Metadata metadata, JsonElement resultJson, Gson gson);
}

