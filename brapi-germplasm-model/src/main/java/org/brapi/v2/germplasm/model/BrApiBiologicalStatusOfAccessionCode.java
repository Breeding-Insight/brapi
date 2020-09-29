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
public enum BrApiBiologicalStatusOfAccessionCode implements BrApiEnum {
    _100("100", "Wild"),
    _110("110", "Natural"),
    _120("120", "Semi-natural/wild"),
    _130("130", "Semi-natural/sown"),
    _200("200", "Weedy"),
    _300("300", "Traditional cultivar/landrace"),
    _400("400", "Breeding/research material"),
    _410("410", "Breeders line"),
    _411("411", "Synthetic population"),
    _412("412", "Hybrid"),
    _413("413", "Founder stock/base population"),
    _414("414", "Inbred line (parent of hybrid cultivar)"),
    _415("415", "Segregating population"),
    _416("416", "Clonal selection"),
    _420("420", "Genetic stock"),
    _421("421", "Mutant (e.g. induced/insertion mutants, tilling populations)"),
    _422("422", "Cytogenetic stocks (e.g. chromosome addition/substitution, aneuploids, amphiploids)"),
    _423("423", "Other genetic stocks (e.g. mapping populations)"),
    _500("500", "Advanced or improved cultivar (conventional breeding methods)"),
    _600("600", "GMO (by genetic engineering)"),
    _999("999", "Other (Elaborate in REMARKS field)");

    private String value;
    private String description;

    BrApiBiologicalStatusOfAccessionCode(String value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String getBrapiValue() {
        return value;
    }
}
