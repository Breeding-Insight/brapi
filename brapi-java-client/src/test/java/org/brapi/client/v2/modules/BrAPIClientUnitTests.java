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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.MockedBrAPIClient;
import org.brapi.client.v2.model.exceptions.*;
import org.brapi.client.v2.model.queryParams.core.ProgramQueryParams;
import org.brapi.client.v2.modules.core.ProgramsApi;
import org.brapi.v2.model.core.response.BrAPIProgramListResponse;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrAPIClientUnitTests {

    private ProgramsApi programsAPI;
    private MockedBrAPIClient mockedBrAPIClient = new MockedBrAPIClient();

    @BeforeAll
    public void setUp() {
        programsAPI = new ProgramsApi(mockedBrAPIClient.getBrAPIClient());
    }

    @Test
    @SneakyThrows
    public void brapiClientNotFoundStatus() {

        mockedBrAPIClient.mockHttpClientResponse(404, "");
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientBadRequestStatus() {

        mockedBrAPIClient.mockHttpClientResponse(400, "");
        HttpBadRequestException exception = assertThrows(HttpBadRequestException.class, () -> {
            ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientUnauthorizedStatus() {

        mockedBrAPIClient.mockHttpClientResponse(401, "");
        HttpUnauthorizedException exception = assertThrows(HttpUnauthorizedException.class, () -> {
            ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientForbiddenStatus() {

        mockedBrAPIClient.mockHttpClientResponse(403, "");
        HttpForbiddenException exception = assertThrows(HttpForbiddenException.class, () -> {
            ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());
        });
    }

    @Test
    @SneakyThrows
    public void brapiClientInternalServerErrorStatus() {

        mockedBrAPIClient.mockHttpClientResponse(500, "");
        HttpInternalServerError exception = assertThrows(HttpInternalServerError.class, () -> {
            ApiResponse<BrAPIProgramListResponse> programs = this.programsAPI.programsGet(new ProgramQueryParams());
        });
    }

}
