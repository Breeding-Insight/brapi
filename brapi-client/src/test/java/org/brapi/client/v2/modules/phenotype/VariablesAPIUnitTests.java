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
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class VariablesAPIUnitTests {

    VariablesAPI variablesAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        variablesAPI = new VariablesAPI(brAPIClient);
    }


    @Test
    @SneakyThrows
    void createVariablesEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiVariable> brApiVariable = variablesAPI.createVariable(new BrApiVariable());

        assertEquals(false, brApiVariable.isPresent(), "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void updateVariablesEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());

        BrApiVariable variable = BrApiVariable.builder()
                .observationVariableDbId("test")
                .build();

        Optional<BrApiVariable> brApiVariable = variablesAPI.updateVariable(variable);

        assertEquals(false, brApiVariable.isPresent(), "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getVariablesEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiVariable> brApiVariables = variablesAPI.getVariables();

        assertEquals(0, brApiVariables.size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    void getVariablesByIdEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiVariable> brApiVariable = variablesAPI.getVariableById("test");

        assertEquals(false, brApiVariable.isPresent(), "Empty optional was not returned.");
    }

}
