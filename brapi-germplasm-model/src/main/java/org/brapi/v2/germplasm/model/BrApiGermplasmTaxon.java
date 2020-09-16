package org.brapi.v2.germplasm.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasmTaxon {
    private String sourceName;
    private String taxonId;
}
