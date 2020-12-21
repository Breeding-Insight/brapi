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

package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import okhttp3.Call;

import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.TraitQueryParams;
import org.brapi.v2.model.pheno.BrAPITrait;
import org.brapi.v2.model.pheno.response.BrAPIScaleListResponse;
import org.brapi.v2.model.pheno.response.BrAPITraitListResponse;
import org.brapi.v2.model.pheno.response.BrAPITraitSingleResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TraitsAPIUnitTests {

    TraitsApi traitsAPI;

    @BeforeAll
    public void setUp() throws ApiException {
        BrAPIClient mockClient = Mockito.mock(BrAPIClient.class);
    	BrAPIClient realClient = new BrAPIClient("http://test");
    	Call dummyCall = realClient.buildCall("/test", "GET", new HashMap<>(), new HashMap<>(), null, new HashMap<>(), new HashMap<>(), new String[] {});
    	when(mockClient.escapeString(any(String.class))).thenReturn("http://test");
    	when(mockClient.buildCall(any(String.class), any(String.class), any(Map.class), any(Map.class), any(), any(Map.class), any(Map.class), any(String[].class))).thenReturn(dummyCall);
        when(mockClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null, new BrAPIScaleListResponse()));

        traitsAPI = new TraitsApi(mockClient);
    }

    @Test
    @SneakyThrows
    void getTraitsEmtpyBody() {
        ApiResponse<BrAPITraitListResponse> brApiTraits = traitsAPI.traitsGet(new TraitQueryParams());

        assertNotNull(brApiTraits, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getTraitsByIdEmtpyBody() {
        ApiResponse<BrAPITraitSingleResponse> brApiTrait = traitsAPI.traitsTraitDbIdGet("test");

        assertNotNull(brApiTrait, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void createTraitsEmptyBody() {
        ApiResponse<BrAPITraitListResponse> brApiTrait = traitsAPI.traitsPost(Arrays.asList(new BrAPITrait()));

        assertNotNull(brApiTrait, "Empty optional was not returned.");
    }

}
