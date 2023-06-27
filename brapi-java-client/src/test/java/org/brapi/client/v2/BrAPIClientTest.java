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

import lombok.Getter;
import lombok.SneakyThrows;
import org.brapi.client.v2.auth.Authentication;
import org.brapi.client.v2.auth.OAuth;
import org.junit.jupiter.api.AfterAll;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.images.PullPolicy;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BrAPIClientTest {

    private static final String dbName = "bitest";
    private static final String dbPassword = "postgres";
    protected String brapiTestServer;
    protected BrAPIClient apiClient;

    @Getter
    private Network network;
    @Getter
    private GenericContainer brapiContainer;
    @Getter
    private GenericContainer dbContainer;

    public BrAPIClientTest() {
        network = Network.newNetwork();
        dbContainer = new GenericContainer<>("postgres:11.4")
                .withNetwork(network)
                .withNetworkAliases("testdb")
                .withImagePullPolicy(PullPolicy.defaultPolicy())
                .withExposedPorts(5432)
                .withEnv("POSTGRES_DB", dbName)
                .withEnv("POSTGRES_PASSWORD", dbPassword)
                .waitingFor(Wait.forLogMessage(".*LOG:  database system is ready to accept connections.*", 1).withStartupTimeout(Duration.of(2, ChronoUnit.MINUTES)));

        brapiContainer = new GenericContainer<>("breedinginsight/brapi-java-server:develop")
                .withNetwork(network)
                .withImagePullPolicy(PullPolicy.alwaysPull())
                .withExposedPorts(8080)
                .withEnv("BRAPI_DB_SERVER",
                        String.format("%s:%s",
                                "testdb",
                                5432))
                .withEnv("BRAPI_DB", "postgres")
                .withEnv("BRAPI_DB_USER", "postgres")
                .withEnv("BRAPI_DB_PASSWORD", "postgres")
                .withClasspathResourceMapping("brapi/properties/application.properties", "/home/brapi/properties/application.properties", BindMode.READ_ONLY)
                .waitingFor(Wait.forLogMessage(".*: Started BrapiTestServer in \\d*.\\d* seconds.*", 1).withStartupTimeout(Duration.ofMinutes(1)));

        dbContainer.start();
        brapiContainer.start();

        //brapiTestServer = "http://localhost:8080/brapi/v2";

        Integer containerPort = brapiContainer.getMappedPort(8080);
        String containerIp = brapiContainer.getContainerIpAddress();
        brapiTestServer = String.format("http://%s:%s/", containerIp, containerPort);

        apiClient = new BrAPIClient(brapiTestServer, 30000);

        Authentication authorizationToken = apiClient.getAuthentication("AuthorizationToken");
        if(authorizationToken instanceof OAuth) {
            ((OAuth)authorizationToken).setAccessToken("YYYY");
        }
    }

    @SneakyThrows
    @AfterAll
    public void stopContainers() {
        dbContainer.stop();
        brapiContainer.stop();
        network.close();
    }

}
