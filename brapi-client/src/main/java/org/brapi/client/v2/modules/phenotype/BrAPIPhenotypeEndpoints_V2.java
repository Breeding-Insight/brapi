package org.brapi.client.v2.modules.phenotype;

import org.brapi.client.v2.BrAPIEndpoints_V2;

public class BrAPIPhenotypeEndpoints_V2 extends BrAPIEndpoints_V2 {

    public static String getTraitsPath() {
        return getRootPath() + "/traits";
    }

    public static String getTraitsByIdPath(String traitId) {
        return String.format(getRootPath() + "/traits/%s", traitId);
    }

}
