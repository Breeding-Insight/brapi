/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.client.v2.modules;

import lombok.SneakyThrows;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.model.exceptions.*;
import org.brapi.v2.model.core.response.BrAPIProgramListResponse;
import org.junit.jupiter.api.*;
import com.google.gson.reflect.TypeToken;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrAPIClientUnitTests {

    private BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() throws ApiException {
    	brAPIClient = new BrAPIClient("http://brapi.org");
    }

    @Test
    @SneakyThrows
    public void brapiClientHandleResponse() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        ResponseBody responseBody = ResponseBody.create("".getBytes(), MediaType.parse("application/json"));
        Request dummyReq = brAPIClient.buildRequest("/programs", "GET", new HashMap<>(), new HashMap<>(), null, headers, new HashMap<>(), new String[] { "AuthorizationToken" });
        
        Response notFoundRes = new Response(dummyReq, Protocol.HTTP_1_1, "message", 404, null, Headers.of(headers), responseBody, null, null, null, 0, 0, null);
        HttpNotFoundException notFound = assertThrows(HttpNotFoundException.class, () -> {
            brAPIClient.handleResponse(notFoundRes, new TypeToken<BrAPIProgramListResponse>(){}.getType());
        });
        
        Response badRequestRes = new Response(dummyReq, Protocol.HTTP_1_1, "message", 400, null, Headers.of(headers), responseBody, null, null, null, 0, 0, null);
        HttpBadRequestException badRequest = assertThrows(HttpBadRequestException.class, () -> {
            brAPIClient.handleResponse(badRequestRes, new TypeToken<BrAPIProgramListResponse>(){}.getType());
        });
        
        Response unathorizedRes = new Response(dummyReq, Protocol.HTTP_1_1, "message", 401, null, Headers.of(headers), responseBody, null, null, null, 0, 0, null);
        HttpUnauthorizedException unathorized = assertThrows(HttpUnauthorizedException.class, () -> {
            brAPIClient.handleResponse(unathorizedRes, new TypeToken<BrAPIProgramListResponse>(){}.getType());
        });
        
        Response forbiddenRes = new Response(dummyReq, Protocol.HTTP_1_1, "message", 403, null, Headers.of(headers), responseBody, null, null, null, 0, 0, null);
        HttpForbiddenException forbidden = assertThrows(HttpForbiddenException.class, () -> {
            brAPIClient.handleResponse(forbiddenRes, new TypeToken<BrAPIProgramListResponse>(){}.getType());
        });
        
        Response internalRes = new Response(dummyReq, Protocol.HTTP_1_1, "message", 500, null, Headers.of(headers), responseBody, null, null, null, 0, 0, null);
        HttpInternalServerError internal = assertThrows(HttpInternalServerError.class, () -> {
            brAPIClient.handleResponse(internalRes, new TypeToken<BrAPIProgramListResponse>(){}.getType());
        });
    }

}
