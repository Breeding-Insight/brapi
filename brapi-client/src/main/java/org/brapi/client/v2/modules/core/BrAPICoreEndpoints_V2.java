package org.brapi.client.v2.modules.core;

public class BrAPICoreEndpoints_V2 {

    public static String getRootPath() {
        return "/brapi/v2";
    }

    public static String getProgramsPath() {
        return getRootPath() + "/programs";
    }

    public static String getProgramsByIdPath(String programID) {
        return String.format(getRootPath() + "/programs/%s", programID);
    }
}
