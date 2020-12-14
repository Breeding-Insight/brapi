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

import org.brapi.client.v2.ApiClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.queryParams.germplasm.GermplasmQueryParams;
import org.brapi.v2.model.germ.GermplasmListResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GermplasmAPIUnitTests {

    GermplasmApi germplasmAPI;
    @Mock
    ApiClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        germplasmAPI = new GermplasmApi(brAPIClient);
    }

    @Test
    @SneakyThrows
    public void getGermplasmEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<GermplasmListResponse> brApiGermplasm = germplasmAPI.germplasmGet(new GermplasmQueryParams());

        assertEquals(0, brApiGermplasm.getBody().getResult().getData().size(), "List size is greater than 0");
    }
}
