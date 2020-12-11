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

import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.junit.jupiter.api.*;

import io.swagger.client.model.core.Program;
import io.swagger.client.model.core.ProgramListResponse;
import io.swagger.client.model.core.ProgramNewRequest;
import io.swagger.client.model.core.ProgramSingleResponse;
import io.swagger.client.org.brapi.client.api.core.ProgramsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProgramsAPITests extends BrAPIClientTest {

    //TODO: Maybe query these before tests instead of hard coding.
    private String programId = "program3";
    private String externalReferenceID = "https://brapi.org/specification";
    private Program createdProgram;

    private ProgramsApi programsAPI = new ProgramsApi(apiClient);

    @Test
    @SneakyThrows
    public void getProgramsSuccess() {

        ProgramListResponse programs = this.programsAPI.programsGet(null, null, null, null, null, null, 0, 1000, null);

        assertEquals(true, !programs.getResult().getData().isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramsPageFilter() {
        ProgramsRequest baseRequest = ProgramsRequest.builder()
                .page(0)
                .pageSize(1)
                .build();

        ProgramListResponse programs = this.programsAPI.programsGet(null, null, null, null, null, null, 0, 1, null);

        assertEquals(true, programs.getResult().getData().size() == 1, "More than one program was returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        ProgramSingleResponse program = this.programsAPI.programsProgramDbIdGet(programId, null);

        assertEquals(true, program != null, "Program was not returned");

        // Check the response was parsed correctly.
        Program brApiProgram = program.getResult();
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
        	ProgramSingleResponse program = this.programsAPI.programsProgramDbIdGet("fake_id", null);
        });

        // Check out return message is returned
        String errorMsg = exception.getMessage();
        assertEquals(true, errorMsg.length() > 0, "Error message was not returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDSuccess() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID(this.externalReferenceID)
                .build();

        ProgramListResponse programs = this.programsAPI.programsGet(null, null, null, null, null, null, 0, 1000, null);

        assertEquals(true, programs.getResult().getData().size() > 0, "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        ProgramListResponse programs = this.programsAPI.programsGet(null, null, null, null, null, null, 0, 1000, null);

        assertEquals(true, programs.getResult().getData().size() == 0, "List of programs was not empty");
    }

    @Test
    @SneakyThrows
    public void createProgramSuccess() {

        ProgramNewRequest brApiProgram = new ProgramNewRequest()
                .programName("new test program");

        ProgramListResponse createdProgram = this.programsAPI.programsPost(Arrays.asList(brApiProgram), null);

        assertEquals(true, createdProgram != null);
        Program program = createdProgram.getResult().getData().get(0);
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
        assertEquals("new test program", program.getProgramName(), "Program Name was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createMultipleProgramsSuccess() {

    	ProgramNewRequest brApiProgram1 = new ProgramNewRequest()
                .programName("test1");
    	ProgramNewRequest brApiProgram2 = new ProgramNewRequest()
                .programName("test2");
        List<ProgramNewRequest> brApiPrograms = new ArrayList<>();
        brApiPrograms.add(brApiProgram1);
        brApiPrograms.add(brApiProgram2);

        ProgramListResponse response = this.programsAPI.programsPost(brApiPrograms, null);

        List<Program> createdPrograms = response.getResult().getData();
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
    	ProgramNewRequest brApiProgram = new ProgramNewRequest();
        ProgramListResponse response = this.programsAPI.programsPost(Arrays.asList(brApiProgram), null);

        assertEquals(true, response != null);
        Program program = response.getResult().getData().get(0);
        this.createdProgram = program;
        assertEquals(true, program.getProgramDbId() != null, "Program Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateProgramSuccess() {
        Program program = this.createdProgram;
        program.setProgramName("updated_name");
        program.setObjective("planting stuff");

        // Check that it is a success and all data matches
        ProgramSingleResponse updatedProgramResult = this.programsAPI.programsProgramDbIdPut(createdProgram.getProgramDbId(), program, null);

        assertNotNull(updatedProgramResult, "Program was not returned");
        Program updatedProgram = updatedProgramResult.getResult();
        assertEquals("updated_name", updatedProgram.getProgramName(), "Program name was not parsed correctly");
        assertEquals("planting stuff", updatedProgram.getObjective(), "Program objective was not parsed correctly");

    }

    @Test
    @SneakyThrows
    public void updateProgramMissingId() {
        // Check that it throws an APIException
        ProgramNewRequest brApiProgram = new ProgramNewRequest()
                .programName("new test program");

        APIException exception = assertThrows(APIException.class, () -> {
            ProgramSingleResponse updatedProgramResult = this.programsAPI.programsProgramDbIdPut("fake_id", brApiProgram, null);
        });
    }
}
