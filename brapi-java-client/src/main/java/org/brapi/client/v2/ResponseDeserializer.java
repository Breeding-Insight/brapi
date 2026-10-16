package org.brapi.client.v2;

import okhttp3.Response;
import org.brapi.client.v2.model.exceptions.ApiException;

import java.io.IOException;

@FunctionalInterface
public interface ResponseDeserializer<T> {
    T deserialize(Response response) throws ApiException, IOException;
}
