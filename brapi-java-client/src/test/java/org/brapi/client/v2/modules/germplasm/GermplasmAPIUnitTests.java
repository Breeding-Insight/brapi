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

package org.brapi.client.v2.modules.germplasm;

import lombok.SneakyThrows;
import okhttp3.Call;

import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.GermplasmQueryParams;
import org.brapi.v2.model.core.response.BrAPIProgramListResponse;
import org.brapi.v2.model.germ.response.BrAPIGermplasmListResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GermplasmAPIUnitTests {

    GermplasmApi germplasmAPI;

    @BeforeAll
    public void setUp() throws ApiException {
        BrAPIClient mockClient = Mockito.mock(BrAPIClient.class);
    	BrAPIClient realClient = new BrAPIClient("http://test");
    	Call dummyCall = realClient.buildCall("/test", "GET", new HashMap<>(), new HashMap<>(), null, new HashMap<>(), new HashMap<>(), new String[] {});
    	when(mockClient.escapeString(any(String.class))).thenReturn("http://test");
    	when(mockClient.buildCall(any(String.class), any(String.class), any(Map.class), any(Map.class), any(), any(Map.class), any(Map.class), any(String[].class))).thenReturn(dummyCall);
        when(mockClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null, new BrAPIGermplasmListResponse()));

        germplasmAPI = new GermplasmApi(mockClient);
    }

    @Test
    @SneakyThrows
    public void getGermplasmEmptyBody() {
        ApiResponse<BrAPIGermplasmListResponse> brApiGermplasm = germplasmAPI.germplasmGet(new GermplasmQueryParams());

        assertNotNull(brApiGermplasm);
    }
}
