package org.breedinginsight.brapi.client.v2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@Accessors(fluent = true)
@RequiredArgsConstructor
public class ExternalReference {

    private final String referenceID;
    private final String referenceSource;

}
