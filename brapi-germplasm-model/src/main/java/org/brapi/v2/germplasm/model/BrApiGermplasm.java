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

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasm {
    private String accessionNumber;
    private Date acquisitionDate;
    private Map<String, String> additionalInfo;
    private BrApiBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode;
    private String biologicalStatusOfAccessionDescription;
    private String breedingMethodDbId;
    private String collection;
    private String commonCropName;
    private String countryOfOriginCode;
    private String defaultDisplayName;
    private String documentationURL;
    private List<BrApiGermplasmDonor> donors;
    private List<BrApiExternalReference> externalReferences;
    private String genus;
    private String germplasmDbId;
    private String germplasmName;
    private List<BrApiGermplasmOrigin> germplasmOrigin;
    private String germplasmPUI;
    private String germplasmPreprocessing;
    private String instituteCode;
    private String instituteName;
    private String pedigree;
    private String seedSource;
    private String seedSourceDescription;
    private String species;
    private String speciesAuthority;
    private List<BrApiGermplasmStorageType> storageTypes;
    private String subtaxa;
    private String subtaxaAuthority;
    private List<BrApiGermplasmSynonym> synonyms;
    private List<BrApiGermplasmTaxon> taxonIds;
}
