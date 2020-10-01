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
    WILD("100", "Wild"),
    NATURAL("110", "Natural"),
    SEMI_NATURAL_WILD("120", "Semi-natural/wild"),
    SEMI_NATURAL_SOWN("130", "Semi-natural/sown"),
    WEEDY("200", "Weedy"),
    TRADITIONAL_CULTIVAR_LANDRACE("300", "Traditional cultivar/landrace"),
    BREEDING_RESEARCH_MATERIAL("400", "Breeding/research material"),
    BREEDERS_LINE("410", "Breeders line"),
    SYNTHETIC_POPULATION("411", "Synthetic population"),
    HYBRID("412", "Hybrid"),
    FOUNDER_STOCK_BASE_POPULATION("413", "Founder stock/base population"),
    INBRED_LINE("414", "Inbred line (parent of hybrid cultivar)"),
    SEGREGATING_POPULATION("415", "Segregating population"),
    CLONAL_SELECTION("416", "Clonal selection"),
    GENETIC_STOCK("420", "Genetic stock"),
    MUTANT("421", "Mutant (e.g. induced/insertion mutants, tilling populations)"),
    CYTOGENETIC_STOCKS("422", "Cytogenetic stocks (e.g. chromosome addition/substitution, aneuploids, amphiploids)"),
    OTHER_GENETIC_STOCKS("423", "Other genetic stocks (e.g. mapping populations)"),
    IMPROVED_CULTIVAR("500", "Advanced or improved cultivar (conventional breeding methods)"),
    GMO("600", "GMO (by genetic engineering)"),
    OTHER("999", "Other (Elaborate in REMARKS field)");

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
