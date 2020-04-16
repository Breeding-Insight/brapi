package org.brapi.client.v2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.Map;

@Getter
@Builder
public class BrAPIRequest {
    private final String target;
    @Singular
    private final Map<String, String> parameters;
    private final Object data;
    private final String contentType;
    private final HttpMethod method;
}
