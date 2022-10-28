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

package org.brapi.client.v21.model.queryParams.germplasm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.brapi.client.v21.ApiClient;
import org.brapi.client.v21.Pair;

import java.util.List;
import java.util.Map;

/**
 * accessionNumber The unique identifier for a material or germplasm within a genebank  MCPD (v2.1) (ACCENUMB) 2. This is the unique identifier for accessions within a genebank, and is assigned when a sample is entered into the genebank collection (e.g. \&quot;PI 113869\&quot;). (optional)
 * collection A specific panel/collection/population name this germplasm belongs to. (optional)
 * familyCode A familyCode representing the family this germplasm belongs to. (optional)
 * binomialName The full binomial name (scientific name) of a germplasm (optional)
 * genus The scientific genus of a germplasm (optional)
 * species The scientific species of a germplasm (optional)
 * synonym An alternative name or ID used to reference this germplasm (optional)
 * includeParents If this parameter is true, include the array of parents in the response (optional)
 * includeSiblings If this parameter is true, include the array of siblings in the response (optional)
 * includeProgeny If this parameter is true, include the array of progeny in the response (optional)
 * includeFullTree Recursively include ALL of the nodes present in this pedigree tree. (optional)
 * pedigreeDepth Recursively include this number of levels up the tree in the response (optional)
 * progenyDepth Recursively include this number of levels down the tree in the response (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class PedigreeQueryParams extends GermplasmQueryParams {

    private String accessionNumber;
    private String collection;
    private String familyCode;
    private String binomialName;
    private String genus;
    private String species;
    private String synonym;
    private Boolean includeParents;
    private Boolean includeSiblings;
    private Boolean includeProgeny;
    private Boolean includeFullTree;
    private Integer pedigreeDepth;
    private Integer progenyDepth;

    @Override
    public void buildQueryParams(ApiClient apiClient, List<Pair> localVarQueryParams, Map<String, String> headerParams) {
        super.buildQueryParams(apiClient, localVarQueryParams, headerParams);
        if (accessionNumber != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("accessionNumber", accessionNumber));
        if (collection != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("collection", collection));
        if (familyCode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("familyCode", familyCode));
        if (binomialName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("binomialName", binomialName));
        if (genus != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("genus", genus));
        if (species != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("species", species));
        if (synonym != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("synonym", synonym));
        if (includeParents != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("includeParents", includeParents));
        if (includeSiblings != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("includeSiblings", includeSiblings));
        if (includeProgeny != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("includeProgeny", includeProgeny));
        if (includeFullTree != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("includeFullTree", includeFullTree));
        if (pedigreeDepth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pedigreeDepth", pedigreeDepth));
        if (progenyDepth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("progenyDepth", progenyDepth));
    }
}
