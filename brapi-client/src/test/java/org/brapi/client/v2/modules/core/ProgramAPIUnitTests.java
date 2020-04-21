package org.brapi.client.v2.modules.core;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
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
