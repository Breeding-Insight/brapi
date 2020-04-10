package org.breedinginsight.brapi.client.v2.endpoints;

import lombok.AccessLevel;
import lombok.Getter;

public abstract class BrAPIEndpoint {
    @Getter(AccessLevel.PROTECTED)
    private BrAPIClient brAPIClient;

    protected BrAPIEndpoint(BrAPIClient brAPIClient) {
        this.brAPIClient = brAPIClient;
    }
}
