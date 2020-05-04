package org.brapi.client.v2.modules.core;

import org.brapi.client.v2.BrAPIEndpoints_V2;

public class BrAPICoreEndpoints_V2 extends BrAPIEndpoints_V2 {

    public static String getProgramsPath() {
        return getRootPath() + "/programs";
    }

    public static String getProgramsByIdPath(String programID) {
        return String.format(getRootPath() + "/programs/%s", programID);
    }
}
