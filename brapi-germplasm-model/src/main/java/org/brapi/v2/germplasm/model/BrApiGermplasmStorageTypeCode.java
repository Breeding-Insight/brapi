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

package org.brapi.v2.germplasm.model;

import lombok.Getter;
import org.brapi.v2.core.model.BrApiEnum;

@Getter
public enum BrApiGermplasmStorageTypeCode implements BrApiEnum {

    SEED_COLLECTION("10", "Seed collection"),
    SHORT_TERM("11", "Short term"),
    MEDIUM_TERM("12", "Medium term"),
    LONG_TERM("13", "Long term"),
    FIELD_COLLECTION("20", "Field collection"),
    IN_VITRO_COLLECTION("30", "In vitro collection"),
    CRYOPRESERVED_COLLECTION("40", "Cryo-preserved collection"),
    DNA_COLLECTION("50", "DNA collection"),
    OTHER("99", "Other");

    private String value;
    private String description;

    BrApiGermplasmStorageTypeCode(String value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String getBrapiValue() {
        return value;
    }
}
