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

package org.brapi.client.v2.model.queryParams.germplasm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import org.brapi.client.v2.model.queryParams.core.BrAPIQueryParams;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class GermplasmQueryParams extends BrAPIQueryParams {

    private String germplasmPUI;
    private String germplasmDbId;
    private String germplasmName;
    private String commonCropName;
    private String accessionNumber;
    private String collection;
    private String genus;
    private String species;
    private String studyDbId;
    private String synonym;
    private String parentDbId;
    private String progenyDbId;
    private String externalReferenceID;
    private String externalReferenceSource;

}