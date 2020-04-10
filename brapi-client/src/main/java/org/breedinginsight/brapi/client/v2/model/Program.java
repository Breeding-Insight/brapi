package org.breedinginsight.brapi.client.v2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Builder
@Accessors(fluent = true)
@RequiredArgsConstructor
public class Program {

    private final String abbreviation;
    private final String commonCropName;
    private final String documentationUrl;
    private final List<ExternalReference> externalReferences;
    private final String leadPersonDbId;
    private final String leadPersonName;
    private final String objective;
    private final String programDbId;
    private final String programName;
}
