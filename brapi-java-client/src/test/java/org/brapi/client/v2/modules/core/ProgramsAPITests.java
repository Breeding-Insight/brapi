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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.client.v2.model.queryParams.core.ProgramQueryParams;
import org.brapi.v2.model.core.BrAPIProgram;
import org.brapi.v2.model.core.response.BrAPIProgramListResponse;
import org.brapi.v2.model.core.response.BrAPIProgramSingleResponse;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProgramsAPITests extends BrAPIClientTest {

    //TODO: Maybe query these before tests instead of hard coding.
    private String programId = "program3";
    private String externalReferenceID = "https://brapi.org/specification";
    private BrAPIProgram createdProgram;

    private ProgramsApi programsAPI = new ProgramsApi(apiClient);

    @Test
    @SneakyThrows
    public void getProgramsSuccess() {

        ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());

        assertEquals(true, !programs.getBody().getResult().getData().isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramsPageFilter() {
        ProgramQueryParams baseRequest = ProgramQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(baseRequest);

        assertEquals(true, programs.getBody().getResult().getData().size() == 1, "More than one program was returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        ApiResponse<BrAPIProgramSingleResponse> program = this.programsAPI.programsProgramDbIdGet(programId);

        assertEquals(true, program != null, "Program was not returned");

        // Check the response was parsed correctly.
        BrAPIProgram brApiProgram = program.getBody().getResult();
        assertEquals(true, brApiProgram.getAbbreviation() != null, "Abbreviation was not populated");
        assertEquals(true, brApiProgram.getAdditionalInfo() != null, "Additional Info was not populated");
        assertEquals(true, brApiProgram.getAdditionalInfo().size() > 0, "Additional Info had no entries");
        assertEquals(true, brApiProgram.getCommonCropName() != null, "Common crop name was not populated");
        assertEquals(true, brApiProgram.getDocumentationURL() != null, "Documentation url was not populated");
        assertEquals(true, brApiProgram.getExternalReferences() != null, "External references were not populated");
        assertEquals(true, brApiProgram.getExternalReferences().get(0).getReferenceSource() != null, "Reference source was not populated");
        assertEquals(true, brApiProgram.getExternalReferences().get(0).getReferenceID() != null, "Reference Id was not populated");
        assertEquals(true, brApiProgram.getLeadPersonDbId() != null, "Lead person id was not populated");
        assertEquals(true, brApiProgram.getLeadPersonName() != null, "Lead person name were not populated");
        assertEquals(true, brApiProgram.getObjective() != null, "Objective was not populated");
        assertEquals(true, brApiProgram.getProgramDbId() != null, "Program DbId was not populated");
        assertEquals(true, brApiProgram.getProgramName() != null, "Program name was not populated");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdMissingID() {

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
        	ApiResponse<BrAPIProgramSingleResponse> program = this.programsAPI.programsProgramDbIdGet("fake_id");
        });

        // Check out return message is returned
        String errorMsg = exception.getMessage();
        assertEquals(true, errorMsg.length() > 0, "Error message was not returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDSuccess() {
        ProgramQueryParams programsRequest = ProgramQueryParams.builder()
                .externalReferenceID(this.externalReferenceID)
                .build();

        ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(programsRequest);

        assertEquals(true, programs.getBody().getResult().getData().size() > 0, "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        ProgramQueryParams programsRequest = ProgramQueryParams.builder()
                .externalReferenceID("will not exist")
                .build();

        ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(programsRequest);

        assertEquals(true, programs.getBody().getResult().getData().size() == 0, "List of programs was not empty");
    }

    @Test
    @SneakyThrows
    public void createProgramSuccess() {

        BrAPIProgram brApiProgram = new BrAPIProgram()
                .programName("new test program");

        ApiResponse<BrAPIProgramListResponse> createdProgram = this.programsAPI.programsPost(Arrays.asList(brApiProgram));

        assertEquals(true, createdProgram != null);
        BrAPIProgram program = createdProgram.getBody().getResult().getData().get(0);
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
        assertEquals("new test program", program.getProgramName(), "Program Name was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createMultipleProgramsSuccess() {

        BrAPIProgram brApiProgram1 = new BrAPIProgram()
                .programName("test1");
        BrAPIProgram brApiProgram2 = new BrAPIProgram()
                .programName("test2");
        List<BrAPIProgram> brApiPrograms = new ArrayList<>();
        brApiPrograms.add(brApiProgram1);
        brApiPrograms.add(brApiProgram2);

        ApiResponse<BrAPIProgramListResponse> response = this.programsAPI.programsPost(brApiPrograms);

        List<BrAPIProgram> createdPrograms = response.getBody().getResult().getData();
        assertEquals(true, createdPrograms.size() == 2);
        assertEquals("test1", createdPrograms.get(0).getProgramName(), "Sent name and returned program name does not match");
        assertEquals(true, createdPrograms.get(0).getProgramDbId() != null, "Program Id was not parsed properly");
        assertEquals("test2", createdPrograms.get(1).getProgramName(), "Sent name and returned program name does not match");
        assertEquals(true, createdPrograms.get(1).getProgramDbId() != null, "Program Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    @Order(1)
    public void createProgramEmptyProgramSuccess() {
        BrAPIProgram brApiProgram = new BrAPIProgram();
        ApiResponse<BrAPIProgramListResponse> response = this.programsAPI.programsPost(Arrays.asList(brApiProgram));

        assertEquals(true, response != null);
        BrAPIProgram program = response.getBody().getResult().getData().get(0);
        this.createdProgram = program;
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateProgramSuccess() {
        BrAPIProgram program = this.createdProgram;
        program.setProgramName("updated_name");
        program.setObjective("planting stuff");

        // Check that it is a success and all data matches
        ApiResponse<BrAPIProgramSingleResponse> updatedProgramResult = this.programsAPI.programsProgramDbIdPut(createdProgram.getProgramDbId(), program);

        assertNotNull(updatedProgramResult, "Program was not returned");
        BrAPIProgram updatedProgram = updatedProgramResult.getBody().getResult();
        assertEquals("updated_name", updatedProgram.getProgramName(), "Program name was not parsed correctly");
        assertEquals("planting stuff", updatedProgram.getObjective(), "Program objective was not parsed correctly");

    }

    @Test
    @SneakyThrows
    public void updateProgramMissingId() {
        // Check that it throws an APIException
        BrAPIProgram brApiProgram = new BrAPIProgram()
                .programName("new test program");

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIProgramSingleResponse> updatedProgramResult = this.programsAPI.programsProgramDbIdPut("fake_id", brApiProgram);
        });
    }
}
