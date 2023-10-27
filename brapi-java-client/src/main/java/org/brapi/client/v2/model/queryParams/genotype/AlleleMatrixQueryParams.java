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

package org.brapi.client.v2.model.queryParams.genotype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * dimensionVariantPage The requested page number for the Variant dimension of the matrix (optional)
 * dimensionVariantPageSize The requested page size for the Variant dimension of the matrix (optional)
 * dimensionCallSetPage The requested page number for the CallSet dimension of the matrix (optional)
 * dimensionCallSetPageSize The requested page size for the CallSet dimension of the matrix (optional)
 * preview Default Value &#x3D; false &lt;br/&gt;If &#x27;preview&#x27; is set to true, then the server should return with the \&quot;dataMatrices\&quot; field as null or empty. All other data fields should be returned normally.  This is intended to be a preview and give the client a sense of how large the matrix returned will be &lt;br/&gt;If &#x27;preview&#x27; is set to false or not set (default), then the server should return all the matrix data as requested. (optional)
 * dataMatrixNames \&quot;dataMatrixNames\&quot; is a comma seperated list of names (ie &#x27;Genotype, Read Depth&#x27; etc). This list controls which data matrices are returned in the response. &lt;br&gt; This maps to a FORMAT field in the VCF file standard. (optional)
 * dataMatrixAbbreviations \&quot;dataMatrixAbbreviations\&quot; is a comma seperated list of abbreviations (ie &#x27;GT, RD&#x27; etc). This list controls which data matrices are returned in the response. &lt;br&gt; This maps to a FORMAT field in the VCF file standard. (optional)
 * positionRange The postion range to search &lt;br/&gt; Uses the format \&quot;contig:start-end\&quot; where \&quot;contig\&quot; is the chromosome or contig name, \&quot;start\&quot; is   the starting position of the range, and \&quot;end\&quot; is the ending position of the range &lt;br&gt; Example: CRHOM_1:12000-14000 (optional)
 * germplasmDbId Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * germplasmName Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; by its human readable name.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * germplasmPUI Use this parameter to only return results associated with the given &#x60;Germplasm&#x60; by its global permanent unique identifier.  &lt;br/&gt;Use &#x60;GET /germplasm&#x60; to find the list of available &#x60;Germplasm&#x60; on a server. (optional)
 * callSetDbId The ID which uniquely identifies a &#x60;CallSet&#x60; within the given database server (optional)
 * variantDbId The ID which uniquely identifies a &#x60;Variant&#x60; within the given database server (optional)
 * variantSetDbId The ID which uniquely identifies a &#x60;VariantSet&#x60; within the given database server (optional)
 * expandHomozygotes Should homozygotes be expanded (true) or collapsed into a single occurrence (false) (optional)
 * unknownString The string to use as a representation for missing data (optional)
 * sepPhased The string to use as a separator for phased allele calls (optional)
 * sepUnphased The string to use as a separator for unphased allele calls (optional)
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class AlleleMatrixQueryParams extends GenotypeQueryParams {

    private Integer dimensionVariantPage;
    private Integer dimensionVariantPageSize;
    private Integer dimensionCallSetPage;
    private Integer dimensionCallSetPageSize;
    private Boolean preview;
    private String dataMatrixNames;
    private String dataMatrixAbbreviations;
    private String positionRange;
    private String germplasmDbId;
    private String germplasmName;
    private String germplasmPUI;
    private String callSetDbId;
    private String variantDbId;
    private String variantSetDbId;
    private Boolean expandHomozygotes;
    private String unknownString;
    private String sepPhased;
    private String sepUnphased;
}
