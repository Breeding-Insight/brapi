package org.brapi.client.v2;

import lombok.AccessLevel;
import lombok.Getter;

public abstract class BrAPIEndpoint {
    @Getter(AccessLevel.PROTECTED)
    private BrAPIClient brAPIClient;

    protected BrAPIEndpoint(BrAPIClient brAPIClient) {
        this.brAPIClient = brAPIClient;
    }
}
