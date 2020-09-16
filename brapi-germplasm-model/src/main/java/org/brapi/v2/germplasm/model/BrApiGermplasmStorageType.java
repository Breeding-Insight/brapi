package org.brapi.v2.germplasm.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasmStorageType {
    // TODO: Change once Pete fixes brapi test server
    private BrApiGermplasmStorageTypeCode code;
    private String description;
}
