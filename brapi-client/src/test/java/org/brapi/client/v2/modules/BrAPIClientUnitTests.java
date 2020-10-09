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

package org.brapi.client.v2.modules;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.MockedBrAPIClient;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.*;
import org.brapi.client.v2.modules.core.BrAPICoreEndpoints_V2;
import org.brapi.client.v2.modules.core.ProgramsAPI;
import org.brapi.v2.core.model.BrApiProgram;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrAPIClientUnitTests {

    private ProgramsAPI programsAPI;
    private MockedBrAPIClient mockedBrAPIClient = new MockedBrAPIClient();

    @BeforeAll
    public void setUp() {
        programsAPI = new ProgramsAPI(mockedBrAPIClient.getBrAPIClient());
    }

    @Test
    @SneakyThrows
    public void brapiClientNotFoundStatus() {

        mockedBrAPIClient.mockHttpClientResponse(404, "");
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            List<BrApiProgram> programs = this.programsAPI.getPrograms();
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientBadRequestStatus() {

        mockedBrAPIClient.mockHttpClientResponse(400, "");
        HttpBadRequestException exception = assertThrows(HttpBadRequestException.class, () -> {
            List<BrApiProgram> programs = this.programsAPI.getPrograms();
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientUnauthorizedStatus() {

        mockedBrAPIClient.mockHttpClientResponse(401, "");
        HttpUnauthorizedException exception = assertThrows(HttpUnauthorizedException.class, () -> {
            List<BrApiProgram> programs = this.programsAPI.getPrograms();
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientForbiddenStatus() {

        mockedBrAPIClient.mockHttpClientResponse(403, "");
        HttpForbiddenException exception = assertThrows(HttpForbiddenException.class, () -> {
            List<BrApiProgram> programs = this.programsAPI.getPrograms();
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientInternalServerErrorStatus() {

        mockedBrAPIClient.mockHttpClientResponse(500, "");
        HttpInternalServerError exception = assertThrows(HttpInternalServerError.class, () -> {
            List<BrApiProgram> programs = this.programsAPI.getPrograms();
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientEmptyBody() {

        mockedBrAPIClient.mockHttpClientResponse(200, "");

        String endpoint = BrAPICoreEndpoints_V2.getProgramsPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .method(HttpMethod.GET)
                .build();

        BrAPIClient brAPIClient = mockedBrAPIClient.getBrAPIClient();
        Boolean response = brAPIClient.execute(request, (metadata, resultJson, gson) -> false).orElse(true);

        // Make sure our response handler was actually called
        assertEquals(true, response != null, "Response handler was not called");
        assertEquals(true, response, "orElse was not entered properly.");
    }

}
