/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.client.v2.modules.core;

import org.brapi.client.v2.BrAPIEndpoints_V2;

public class BrAPICoreEndpoints_V2 extends BrAPIEndpoints_V2 {

    public static String getProgramsPath() {
        return getRootPath() + "/trials";
    }

    public static String getProgramsByIdPath(String trialId) {
        return String.format(getRootPath() + "/trials/%s", trialId);
    }

    public static String getTrialsPath() {
        return getRootPath() + "/trials";
    }

    public static String getTrialsByIdPath(String trialId) {
        return String.format(getRootPath() + "/trials/%s", trialId);
    }

    public static String getLocationsPath() {
        return getRootPath() + "/locations";
    }

    public static String getLocationsByIdPath(String locationId) {
        return getLocationsPath() + "/" + locationId;
    }
}
