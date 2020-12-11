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

package org.brapi.client.v2;

import lombok.Getter;
import lombok.SneakyThrows;
import okhttp3.*;

import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MockedBrAPIClient {

    @Mock
    @Getter
    BrAPIClient brAPIClient;
    @Mock
    OkHttpClient okHttpClient;
    @Mock
    Response response;
    @Mock
    Call call;
    @Mock
    BrAPIRequest request;

    public MockedBrAPIClient() {
        MockitoAnnotations.initMocks(this);
    }

    @SneakyThrows
    public void mockHttpClientResponse(Integer statusCode, String body) {
        when(brAPIClient.getHttpClient()).thenReturn(okHttpClient);
        when(brAPIClient.brapiURI()).thenReturn("https://www.test.com");
        when(okHttpClient.newCall(any(Request.class))).thenReturn(call);
        when(call.execute()).thenReturn(response);
        when(response.code()).thenReturn(statusCode);
        when(response.body()).thenReturn(ResponseBody.create(body, MediaType.get("application/json")));
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenCallRealMethod();

        if (statusCode == 200) {
            when(response.isSuccessful()).thenReturn(true);
        }
    }

}
