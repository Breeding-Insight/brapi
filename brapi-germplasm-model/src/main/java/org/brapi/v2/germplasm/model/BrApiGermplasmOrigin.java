package org.brapi.v2.germplasm.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiGeoJSON;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasmOrigin {
    private String coordinateUncertainty;
    private BrApiGeoJSON coordinates;
}
