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

package org.brapi.client.v2;

import org.brapi.client.v2.auth.Authentication;
import org.brapi.client.v2.auth.OAuth;

public class BrAPIClientTest {

    protected String brapiTestServer;
    protected BrAPIClient apiClient;

    public BrAPIClientTest() {
        brapiTestServer = "https://test-server.brapi.org/brapi/v2";
        apiClient = new BrAPIClient(brapiTestServer);

        Authentication authorizationToken = apiClient.getAuthentication("AuthorizationToken");
        if(authorizationToken instanceof OAuth) {
            ((OAuth)authorizationToken).setAccessToken("YYYY");
        }
    }

}
