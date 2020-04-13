package org.brapi.client.v2;

import org.brapi.client.v2.BrAPIClient;

public class BrAPIClientTest {

    protected String brapiTestServer;
    protected BrAPIClient client;

    public BrAPIClientTest() {
        brapiTestServer = "https://test-server.brapi.org/";
        client = new BrAPIClient(brapiTestServer);
    }

}
