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
import org.brapi.client.v2.model.queryParams.phenotype.VariableQueryParams;
import org.brapi.v2.model.pheno.BrAPIObservationVariable;
import org.brapi.v2.model.pheno.response.BrAPIObservationVariableListResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationVariableSingleResponse;
import org.brapi.v2.model.pheno.response.BrAPIScaleListResponse;
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
public class VariablesAPIUnitTests {

    ObservationVariablesApi variablesAPI;

    @BeforeAll
    public void setUp()  throws ApiException {
        BrAPIClient mockClient = Mockito.mock(BrAPIClient.class);
    	BrAPIClient realClient = new BrAPIClient("http://test");
    	Call dummyCall = realClient.buildCall("/test", "GET", new HashMap<>(), new HashMap<>(), null, new HashMap<>(), new HashMap<>(), new String[] {});
    	when(mockClient.escapeString(any(String.class))).thenReturn("http://test");
    	when(mockClient.buildCall(any(String.class), any(String.class), any(Map.class), any(Map.class), any(), any(Map.class), any(Map.class), any(String[].class))).thenReturn(dummyCall);
        when(mockClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null, new BrAPIScaleListResponse()));

        variablesAPI = new ObservationVariablesApi(mockClient);
    }


    @Test
    @SneakyThrows
    void createVariablesEmptyBody() {
        ApiResponse<BrAPIObservationVariableListResponse> brApiVariable = variablesAPI.variablesPost(Arrays.asList(new BrAPIObservationVariable()));

        assertNotNull(brApiVariable, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void updateVariablesEmptyBody() {
        ApiResponse<BrAPIObservationVariableSingleResponse> brApiVariable = variablesAPI.variablesObservationVariableDbIdPut("test", new BrAPIObservationVariable());

        assertNotNull(brApiVariable, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getVariablesEmptyBody() {
        ApiResponse<BrAPIObservationVariableListResponse> brApiVariables = variablesAPI.variablesGet(new VariableQueryParams());

        assertNotNull(brApiVariables, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getVariablesByIdEmptyBody() {
        ApiResponse<BrAPIObservationVariableSingleResponse> brApiVariable = variablesAPI.variablesObservationVariableDbIdGet("test");

        assertNotNull(brApiVariable, "Empty optional was not returned.");
    }

}
