package org.breedinginsight.brapi.client.v2.endpoints;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.breedinginsight.brapi.client.v2.endpoints.model.response.Metadata;

@FunctionalInterface
public interface ResponseHandlerFunction<R> {
    R apply(Metadata metadata, JsonElement resultJson, Gson gson);
}

