package org.brapi.client.v2;

import okhttp3.Response;
import org.brapi.client.v2.model.exceptions.ApiException;

import java.io.IOException;

/**
 * Generic interface to apply extra deserialization logic to handle responses in the BrAPIClient.
 * @param <T> The response type this response deserializer should apply to.
 */
@FunctionalInterface
public interface ResponseDeserializer<T> {
    T deserialize(Response response) throws ApiException, IOException;
}
