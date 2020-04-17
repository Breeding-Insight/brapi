package org.brapi.client.v2;

import lombok.Getter;
import lombok.SneakyThrows;
import okhttp3.*;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.core.model.BrApiProgram;
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
