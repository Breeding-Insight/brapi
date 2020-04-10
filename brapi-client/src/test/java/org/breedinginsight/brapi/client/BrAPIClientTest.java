package org.breedinginsight.brapi.client;

import org.breedinginsight.brapi.client.v2.endpoints.BrAPIClient;

public class BrAPIClientTest {

    protected String brapiTestServer;
    protected BrAPIClient client;

    public BrAPIClientTest() {
        brapiTestServer = "https://test-server.brapi.org/";
        client = new BrAPIClient(brapiTestServer);
    }

}
