package org.brapi.client.v2.modules.core;

import lombok.SneakyThrows;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramsAPITests extends BrAPIClientTest {

    //TODO: Maybe query these before tests instead of hard coding.
    private String programId = "program3";
    private String externalReferenceID = "https://brapi.org/specification";

    private ProgramsAPI programsAPI = new ProgramsAPI(this.client);

    @Test
    @SneakyThrows
    public void getProgramsSuccess() {
        List<BrApiProgram> programs = this.programsAPI.getPrograms();

        assertEquals(true, !programs.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        Optional<BrApiProgram> program = this.programsAPI.getProgramById(this.programId);

        assertEquals(true, program.isPresent(), "Program was not returned");

        //TODO: Check the response was parsed correctly.
    }

    @Test
    @SneakyThrows
    public void getProgramByIdMissingID() {

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiProgram> program = this.programsAPI.getProgramById("does not exist");
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

        List<BrApiProgram> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() > 0, "List of programs was empty");
    }

    // This one fails because search parameters are not implemented yet.
    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        List<BrApiProgram> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() == 0, "List of programs was not empty");
    }
}
