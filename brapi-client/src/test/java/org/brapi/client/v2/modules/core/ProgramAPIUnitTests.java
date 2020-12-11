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

package org.brapi.client.v2.modules.core;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.modules.core.ProgramsAPI;
import org.brapi.v2.core.model.BrApiProgram;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProgramAPIUnitTests {

    ProgramsAPI programsAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        programsAPI = new ProgramsAPI(brAPIClient);
    }

    @Test
    @SneakyThrows
    public void getProgramsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiProgram> brApiPrograms = programsAPI.getPrograms();

        assertEquals(0, brApiPrograms.size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiProgram> brApiProgram = programsAPI.getProgramById("test");

        assertEquals(true, !brApiProgram.isPresent(), "BrAPI program was not empty");
    }

    @Test
    @SneakyThrows
    public void createProgramsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiProgram> brApiPrograms = new ArrayList<>();
        BrApiProgram brApiProgram = BrApiProgram.builder()
                .programName("test")
                .build();
        brApiPrograms.add(brApiProgram);
        List<BrApiProgram> createdBrAPIPrograms = programsAPI.createPrograms(brApiPrograms);

        assertEquals(0, createdBrAPIPrograms.size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    public void createProgramEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        BrApiProgram brApiProgram = BrApiProgram.builder()
                .programName("test")
                .build();
        Optional<BrApiProgram> brApiPrograms = programsAPI.createProgram(brApiProgram);

        assertEquals(true, !brApiPrograms.isPresent(), "BrAPI program was not empty");
    }

    @Test
    @SneakyThrows
    public void updateProgramEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        BrApiProgram brApiProgram = BrApiProgram.builder()
                .programDbId("test")
                .build();
        Optional<BrApiProgram> brApiPrograms = programsAPI.updateProgram(brApiProgram);

        assertEquals(true, !brApiPrograms.isPresent(), "BrAPI program was not empty");
    }
}
