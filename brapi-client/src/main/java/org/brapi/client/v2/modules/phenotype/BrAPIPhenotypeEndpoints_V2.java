package org.brapi.client.v2.modules.phenotype;

import org.brapi.client.v2.BrAPIEndpoints_V2;

public class BrAPIPhenotypeEndpoints_V2 extends BrAPIEndpoints_V2 {

    public static String getTraitsPath() {
        return getRootPath() + "/traits";
    }

    public static String getTraitsByIdPath(String traitId) {
        return getTraitsPath() + "/" + traitId;
    }

    public static String getMethodsPath() {
        return getRootPath() + "/methods";
    }

    public static String getMethodsByIdPath(String methodId) {
        return getMethodsPath() + "/" + methodId;
    }

    public static String getScalesPath() {
        return getRootPath() + "/scales";
    }

    public static String getScalesByIdPath(String scaleId) {
        return getScalesPath() + "/" + scaleId;
    }

    public static String getVariablesPath() { return getRootPath() + "/variables"; }

}
