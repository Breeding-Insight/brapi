package org.brapi.v2.germplasm.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasmDonor {
    private String donorAccessionNumber;
    private String donorInstituteCode;
    private String germplasmPUI;
}
