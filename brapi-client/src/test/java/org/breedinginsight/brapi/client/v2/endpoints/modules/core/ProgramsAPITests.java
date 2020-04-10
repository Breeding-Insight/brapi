package org.breedinginsight.brapi.client.v2.endpoints.modules.core;

import lombok.SneakyThrows;
import org.breedinginsight.brapi.client.BrAPIClientTest;
import org.breedinginsight.brapi.client.v2.endpoints.modules.core.ProgramsAPI;
import org.breedinginsight.brapi.client.v2.model.Program;
import org.breedinginsight.brapi.client.v2.endpoints.model.exceptions.HttpNotFoundException;
import org.breedinginsight.brapi.client.v2.endpoints.model.request.ProgramsRequest;
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
        List<Program> programs = this.programsAPI.getPrograms();

        assertEquals(true, !programs.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        Optional<Program> program = this.programsAPI.getProgramById(this.programId);

        assertEquals(true, program.isPresent(), "Program was not returned");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdMissingID() {

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<Program> program = this.programsAPI.getProgramById("does not exist");
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

        List<Program> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() > 0, "List of programs was empty");
    }

    // This one fails because search parameters are not implemented yet.
    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        ProgramsRequest programsRequest = ProgramsRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        List<Program> programs = this.programsAPI.getPrograms(programsRequest);

        assertEquals(true, programs.size() == 0, "List of programs was not empty");
    }
}
