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
import okhttp3.Call;

import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.v2.model.core.BrAPIProgram;
import org.brapi.v2.model.core.response.BrAPIProgramListResponse;
import org.brapi.v2.model.core.response.BrAPIProgramSingleResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProgramAPIUnitTests {

    ProgramsApi programsAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        programsAPI = new ProgramsApi(brAPIClient);
    }

    @Test
    @SneakyThrows
    public void getProgramsEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<BrAPIProgramListResponse> brApiPrograms = programsAPI.programsGet(null);

        assertEquals(0, brApiPrograms.getBody().getResult().getData().size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<BrAPIProgramSingleResponse> brApiProgram = programsAPI.programsProgramDbIdGet("test");

        assertNotNull(brApiProgram, "BrAPI program was not empty");
    }

    @Test
    @SneakyThrows
    public void createProgramsEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        List<BrAPIProgram> brApiPrograms = new ArrayList<>();
        BrAPIProgram brApiProgram = new BrAPIProgram().programName("test");
        brApiPrograms.add(brApiProgram);
        ApiResponse<BrAPIProgramListResponse> createdBrAPIPrograms = programsAPI.programsPost(brApiPrograms);

        assertEquals(0, createdBrAPIPrograms.getBody().getResult().getData().size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    public void createProgramEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        BrAPIProgram brApiProgram = new BrAPIProgram().programName("test");
        ApiResponse<BrAPIProgramListResponse> brApiPrograms = programsAPI.programsPost(Arrays.asList(brApiProgram));

        assertNotNull(brApiPrograms, "BrAPI program was not empty");
    }

    @Test
    @SneakyThrows
    public void updateProgramEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));

        ApiResponse<BrAPIProgramSingleResponse> brApiPrograms = programsAPI.programsProgramDbIdPut("fake DbId", null);

        assertNotNull(brApiPrograms, "BrAPI program was not empty");
    }
}
