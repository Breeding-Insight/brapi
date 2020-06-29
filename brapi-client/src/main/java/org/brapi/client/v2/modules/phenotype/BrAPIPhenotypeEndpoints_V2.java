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

    public static String getVariablesByIdPath(String variableId) {
        return getVariablesPath() + "/" + variableId;
    }

}
