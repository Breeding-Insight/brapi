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

package org.brapi.client.v2.modules.germplasm;

import com.github.filosganga.geogson.model.Coordinates;
import com.github.filosganga.geogson.model.Point;
import com.github.filosganga.geogson.model.positions.SinglePosition;

import com.google.gson.JsonObject;
import lombok.SneakyThrows;

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.GermplasmQueryParams;
import org.brapi.client.v2.model.queryParams.phenotype.ScaleQueryParams;
import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.germ.BrAPIBiologicalStatusOfAccessionCode;
import org.brapi.v2.model.germ.BrAPIGermplasm;
import org.brapi.v2.model.germ.response.BrAPIGermplasmListResponse;
import org.brapi.v2.model.germ.BrAPIGermplasmDonors;
import org.brapi.v2.model.germ.BrAPIGermplasmSynonyms;
import org.brapi.v2.model.germ.BrAPIGermplasmOrigin;
import org.brapi.v2.model.germ.response.BrAPIGermplasmSingleResponse;
import org.brapi.v2.model.pheno.BrAPIScale;
import org.brapi.v2.model.pheno.response.BrAPIScaleListResponse;
import org.brapi.v2.model.germ.BrAPIGermplasmStorageTypes;
import org.brapi.v2.model.germ.BrAPIGermplasmStorageTypesEnum;
import org.brapi.v2.model.germ.BrAPITaxonID;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GermplasmAPITests extends BrAPIClientTest {

    private GermplasmApi germplasmAPI = new GermplasmApi(this.apiClient);
    private BrAPIGermplasm germplasm;

    @Test
    public void getGermplasmSuccess() throws Exception {

        ApiResponse<BrAPIGermplasmListResponse> germplasm = this.germplasmAPI.germplasmGet(new GermplasmQueryParams());

        assertEquals(false, germplasm.getBody().getResult().getData().isEmpty(), "List of germplasm was empty");
    }

    @Test
    public void getsGermplasmPageFilter() throws Exception {
        GermplasmQueryParams baseRequest = GermplasmQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<BrAPIGermplasmListResponse> germplasm = this.germplasmAPI.germplasmGet(baseRequest);

        assertEquals(true, germplasm.getBody().getResult().getData().size() == 1, "More than one germplasm was returned");
    }

    @Test
    @Order(1)
    public void createGermplasmSuccess() throws Exception {

        JsonObject additionalInfo = new JsonObject();
        additionalInfo.addProperty("test_key", "test_value");
        List<BrAPIGermplasmDonors> donors = new ArrayList<>();
        donors.add(new BrAPIGermplasmDonors()
                .donorInstituteCode("001")
                .donorAccessionNumber("A0002")
                .germplasmPUI("0000000009")
        );
        List<BrAPIExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(new BrAPIExternalReference()
                .referenceID(UUID.randomUUID().toString())
                .referenceSource("http://brapi.org")
        );
        List<BrAPIGermplasmOrigin> germplasmOrigins = new ArrayList<>();
        germplasmOrigins.add(new BrAPIGermplasmOrigin()
            .coordinateUncertainty("20")
            .coordinates(BrApiGeoJSON.builder()
                .type("Feature")
                .geometry(new Point(new SinglePosition(Coordinates.of(76, 120, 125))))
                .build()
            )
        );
        List<BrAPIGermplasmStorageTypes> storageTypes = new ArrayList<>();
        storageTypes.add(new BrAPIGermplasmStorageTypes(BrAPIGermplasmStorageTypesEnum._10));
        List<BrAPIGermplasmSynonyms> synonyms = new ArrayList<>();
        synonyms.add(new BrAPIGermplasmSynonyms()
                .type("PRE-Code")
                .synonym("Res. Tomatillo")
        );
        List<BrAPITaxonID> taxons = new ArrayList<>();
        taxons.add(new BrAPITaxonID()
                .sourceName("BrAPI")
                .taxonId("00002")
        );

        BrAPIGermplasm brApiGermplasm = new BrAPIGermplasm()
                .accessionNumber("A000002")
                .acquisitionDate(LocalDate.now())
                .additionalInfo(additionalInfo)
                .biologicalStatusOfAccessionCode(BrAPIBiologicalStatusOfAccessionCode._100)
                .biologicalStatusOfAccessionDescription(BrAPIBiologicalStatusOfAccessionCode._100.getDescription())
                .collection("resistance population")
                .commonCropName("Tomatillo")
                .countryOfOriginCode("United States")
                .defaultDisplayName("Resistant Tamatillo")
                .documentationURL("http://brapi.org")
                .donors(donors)
                .externalReferences(externalReferences)
                .genus("Tomato")
                .germplasmName("Tamatillo Resistant")
                .germplasmOrigin(germplasmOrigins)
                .germplasmPUI("0000000001")
                .germplasmPreprocessing("transplanted from study 2351")
                .instituteCode("0001")
                .instituteName("BrAPI Institute")
                .pedigree("A000003/A000002")
                .seedSource("A000003/A000002")
                .seedSourceDescription("Branches were collected from a 10-year-old tree")
                .species("Tomato")
                .speciesAuthority("BrAPI")
                .storageTypes(storageTypes)
                .subtaxa("Tomato")
                .subtaxaAuthority("BrAPI")
                .synonyms(synonyms)
                .taxonIds(taxons);

        ApiResponse<BrAPIGermplasmListResponse> createdGermplasm = this.germplasmAPI.germplasmPost(Arrays.asList(brApiGermplasm));

        assertNotNull(createdGermplasm);
        BrAPIGermplasm germplasm = createdGermplasm.getBody().getResult().getData().get(0);
        assertEquals(true, germplasm.getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
        assertEquals(brApiGermplasm.getGermplasmName(), germplasm.getGermplasmName(), "Germplasm Name was not parsed properly");

        this.germplasm = germplasm;
    }

    @Test
    public void createMultipleGermplasmSuccess() throws Exception {

        BrAPIGermplasm brApiGermplasm1 = new BrAPIGermplasm().germplasmName("test1");
        BrAPIGermplasm brApiGermplasm2 = new BrAPIGermplasm().germplasmName("test2");
        List<BrAPIGermplasm> brApiGermplasmList = new ArrayList<>();
        brApiGermplasmList.add(brApiGermplasm1);
        brApiGermplasmList.add(brApiGermplasm2);

        ApiResponse<BrAPIGermplasmListResponse> createdGermplasmRes = this.germplasmAPI.germplasmPost(brApiGermplasmList);

        List<BrAPIGermplasm> createdGermplasm = createdGermplasmRes.getBody().getResult().getData();
        assertEquals(true, createdGermplasm.size() == 2);
        assertEquals(brApiGermplasm1.getGermplasmName(), createdGermplasm.get(0).getGermplasmName(), "Sent name and returned germplasm name does not match");
        assertEquals(true, createdGermplasm.get(0).getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
        assertEquals(brApiGermplasm2.getGermplasmName(), createdGermplasm.get(1).getGermplasmName(), "Sent name and returned germplasm name does not match");
        assertEquals(true, createdGermplasm.get(1).getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
    }

    @Test
    public void createGermplasmIdPresentFailure() throws Exception {
        BrAPIGermplasm brApiGermplasm = new BrAPIGermplasm()
                .germplasmName("new test germplasm");

            ApiResponse<BrAPIGermplasmListResponse> createdGermplasm = this.germplasmAPI.germplasmPost(Arrays.asList(brApiGermplasm));

        assertNotNull(createdGermplasm);
    }

    @Test
    public void createGermplasmEmptySuccess() throws Exception {
        BrAPIGermplasm brApiGermplasm = new BrAPIGermplasm();
        ApiResponse<BrAPIGermplasmListResponse> createdGermplasm = this.germplasmAPI.germplasmPost(Arrays.asList(brApiGermplasm));

        assertNotNull(createdGermplasm);
        BrAPIGermplasm germplasm = createdGermplasm.getBody().getResult().getData().get(0);
        assertEquals(true, germplasm.getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
    }

    @Test
    @Order(2)
    public void getGermplasmByIDSuccess() throws Exception {
		BrAPIGermplasm existingGermplasm = this.germplasm;
        ApiResponse<BrAPIGermplasmSingleResponse> germplasmRes = this.germplasmAPI.germplasmGermplasmDbIdGet(existingGermplasm.getGermplasmDbId());

        assertNotNull(germplasmRes, "Germplasm was not returned");

        // Check the response was parsed correctly.
        BrAPIGermplasm brApiGermplasm = germplasmRes.getBody().getResult();
        assertEquals(existingGermplasm.getAccessionNumber(), brApiGermplasm.getAccessionNumber(), "Wrong Accession number");
        assertEquals(existingGermplasm.getAcquisitionDate(), brApiGermplasm.getAcquisitionDate(), "Wrong Aquisition date");
        // Check deep
        assertEquals(true, brApiGermplasm.getAdditionalInfo() != null, "Additional info was not populated");
        JsonObject additionalInfo = brApiGermplasm.getAdditionalInfo();
        assertEquals(true, additionalInfo.size() > 0, "Additional info was not parsed correctly");

        assertEquals(existingGermplasm.getBiologicalStatusOfAccessionCode(), brApiGermplasm.getBiologicalStatusOfAccessionCode(), "Wrong Biological status of accession code");
        assertEquals(existingGermplasm.getBiologicalStatusOfAccessionDescription(), brApiGermplasm.getBiologicalStatusOfAccessionDescription(), "Wrong Biological status of accession description");
        assertEquals(existingGermplasm.getBreedingMethodDbId(), brApiGermplasm.getBreedingMethodDbId(), "Wrong breeding method db id");
        assertEquals(existingGermplasm.getCollection(), brApiGermplasm.getCollection(), "Wrong collection");
        assertEquals(existingGermplasm.getCommonCropName(), brApiGermplasm.getCommonCropName(), "Wrong common crop name");
        assertEquals(existingGermplasm.getCountryOfOriginCode(), brApiGermplasm.getCountryOfOriginCode(), "Wrong country of origin");
        assertEquals(existingGermplasm.getDefaultDisplayName(), brApiGermplasm.getDefaultDisplayName(), "Wrong default display name");
        assertEquals(existingGermplasm.getDocumentationURL(), brApiGermplasm.getDocumentationURL(), "Wrong documentation url");
        // Check deep
        List<BrAPIGermplasmDonors> donors = brApiGermplasm.getDonors();
        assertEquals(true, donors != null, "Donors was not populated");
        assertEquals(true, donors.size() > 0, "Donors list was not populated");
        assertEquals(existingGermplasm.getDonors().get(0).getDonorAccessionNumber(), donors.get(0).getDonorAccessionNumber(), "Wrong donor accession number");
        assertEquals(existingGermplasm.getDonors().get(0).getDonorInstituteCode(), donors.get(0).getDonorInstituteCode(), "Wrong donor institute code");
        assertEquals(existingGermplasm.getDonors().get(0).getGermplasmPUI(), donors.get(0).getGermplasmPUI(), "Wrong Donor Germplasm PUI");

        // Check deeper
        List<BrAPIExternalReference> externalReferences = brApiGermplasm.getExternalReferences();
        assertEquals(true, externalReferences != null, "External references was not populated");
        assertEquals(true, externalReferences.size() > 0, "External references list was not populated");
        assertEquals(existingGermplasm.getExternalReferences().get(0).getReferenceID(), externalReferences.get(0).getReferenceID(), "Wrong External reference id");
        assertEquals(existingGermplasm.getExternalReferences().get(0).getReferenceSource(), externalReferences.get(0).getReferenceSource(), "Wrong External reference source");

        assertEquals(existingGermplasm.getGenus(), brApiGermplasm.getGenus(), "Wrong genus");
        assertEquals(existingGermplasm.getGermplasmDbId(), brApiGermplasm.getGermplasmDbId(), "Wrong germplasm db id");
        assertEquals(existingGermplasm.getGermplasmName(), brApiGermplasm.getGermplasmName(), "Wrong germplasm name");

        assertEquals(existingGermplasm.getGermplasmOrigin(), brApiGermplasm.getGermplasmOrigin(), "Wrong germplasm origin");
        assertEquals(existingGermplasm.getGermplasmPUI(), brApiGermplasm.getGermplasmPUI(), "Wrong germplasm PUI");
        assertEquals(existingGermplasm.getGermplasmPreprocessing(), brApiGermplasm.getGermplasmPreprocessing(),  "Wrong germplasm preprocessing");

        assertEquals(existingGermplasm.getInstituteCode(), brApiGermplasm.getInstituteCode(), "Wrong institute code");
        assertEquals(existingGermplasm.getInstituteName(), brApiGermplasm.getInstituteName(), "Wrong institute name");
        assertEquals(existingGermplasm.getPedigree(), brApiGermplasm.getPedigree(), "Wrong pedigree");
        assertEquals(existingGermplasm.getSeedSource(), brApiGermplasm.getSeedSource(), "Wrong seed source");
        assertEquals(existingGermplasm.getSeedSourceDescription(), brApiGermplasm.getSeedSourceDescription(), "Wrong seed source description");
        assertEquals(existingGermplasm.getSpecies(), brApiGermplasm.getSpecies(), "Wrong species");
        assertEquals(existingGermplasm.getSpeciesAuthority(), brApiGermplasm.getSpeciesAuthority(), "Wrong species authority");
        // Check deeper
        List<BrAPIGermplasmStorageTypes> storageTypes = brApiGermplasm.getStorageTypes();
        assertEquals(true, storageTypes != null, "Storage types was not populated");
        assertEquals(true, storageTypes.size() > 0, "Storage types list was not populated");
        assertEquals(existingGermplasm.getStorageTypes().get(0).getDescription(), storageTypes.get(0).getDescription(), "Wrong Storage type description");
        assertEquals(existingGermplasm.getStorageTypes().get(0).getCode(), storageTypes.get(0).getCode(), "Wrong Storage type code");

        assertEquals(existingGermplasm.getSubtaxa(), brApiGermplasm.getSubtaxa(), "Wrong subtaxa");
        assertEquals(existingGermplasm.getSubtaxaAuthority(), brApiGermplasm.getSubtaxaAuthority(), "Wrong subtaxa authority");
        // Check deeper
        List<BrAPIGermplasmSynonyms> synonyms = brApiGermplasm.getSynonyms();
        assertEquals(true, synonyms != null, "Synonyms was not populated");
        assertEquals(true, synonyms.size() > 0, "Synonyms list was not populated");
        assertEquals(existingGermplasm.getSynonyms().get(0).getSynonym(), synonyms.get(0).getSynonym(), "Wrong synonym");
        assertEquals(existingGermplasm.getSynonyms().get(0).getType(), synonyms.get(0).getType(), "Wrong type");

        // Check deeper
        List<BrAPITaxonID> taxons = brApiGermplasm.getTaxonIds();
        assertEquals(true, taxons != null, "Taxons was not populated");
        assertEquals(true, taxons.size() > 0, "Taxons list was not populated");
        assertEquals(existingGermplasm.getTaxonIds().get(0).getSourceName(), taxons.get(0).getSourceName(), "Wrong Taxon source name");
        assertEquals(existingGermplasm.getTaxonIds().get(0).getTaxonId(), taxons.get(0).getTaxonId(), "Wrong Taxon id");
    }

    @Test
    @Order(2)
    public void getGermplasmByExternalReferenceIDSuccess() throws Exception {
    	List<BrAPIExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(new BrAPIExternalReference()
                .referenceID(UUID.randomUUID().toString())
                .referenceSource("http://test")
        );
        BrAPIGermplasm brApiGermplasm = new BrAPIGermplasm().externalReferences(externalReferences);
        ApiResponse<BrAPIGermplasmListResponse> createdGermplasm = this.germplasmAPI.germplasmPost(Arrays.asList(brApiGermplasm));
    	
        GermplasmQueryParams germplasmRequest = GermplasmQueryParams.builder()
                .externalReferenceID(externalReferences.get(0).getReferenceID())
                .externalReferenceSource(externalReferences.get(0).getReferenceSource())
                .build();

        ApiResponse<BrAPIGermplasmListResponse> germplasm = this.germplasmAPI.germplasmGet(germplasmRequest);

        assertEquals(true, germplasm.getBody().getResult().getData().size() == 1, "Wrong number of germplasm returned");
    }

    @Test
    public void getGermplasmByExternalReferenceIDDoesNotExist() throws Exception {
        GermplasmQueryParams germplasmRequest = GermplasmQueryParams.builder()
                .externalReferenceID("will not exist")
                .build();

        ApiResponse<BrAPIGermplasmListResponse> germplasm = this.germplasmAPI.germplasmGet(germplasmRequest);

        assertEquals(true, germplasm.getBody().getResult().getData().size() == 0, "List of germplasm was not empty");
    }

    @Test
    public void getGermplasmByIdNotExist() throws Exception {

    	ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIGermplasmSingleResponse> germplasm = this.germplasmAPI.germplasmGermplasmDbIdGet("fake dbid");
        });
        assertEquals(404, exception.getCode());

        // Check out return message is returned
        String errorMsg = exception.getResponseBody();
        assertEquals(true, errorMsg.length() > 0, "Error message was not returned");
    }

    @Test
    @Order(3)
    public void updateGermplasmSuccess() throws Exception {
    	BrAPIGermplasm germplasm = this.germplasm;
        germplasm.setGermplasmName("updated_name");
        germplasm.setAccessionNumber("A000004");

        // Check that it is a success and all data matches
        ApiResponse<BrAPIGermplasmSingleResponse> updatedGermplasmResult = this.germplasmAPI.germplasmGermplasmDbIdPut(germplasm.getGermplasmDbId(), germplasm);

        assertNotNull(updatedGermplasmResult, "Germplasm was not returned");
        BrAPIGermplasm updatedGermplasm = updatedGermplasmResult.getBody().getResult();
        assertEquals(germplasm.getGermplasmName(), updatedGermplasm.getGermplasmName(), "Wrong germplasm name");
        assertEquals(germplasm.getAccessionNumber(), updatedGermplasm.getAccessionNumber(), "Wrong germplasm accession number");
    }

    @Test
    public void updateGermplasmBadId() throws Exception {
        // Check that it throws a 404
        BrAPIGermplasm germplasm = new BrAPIGermplasm();
        germplasm.setGermplasmDbId("i_do_not_exist");

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIGermplasmSingleResponse> updatedGermplasmResult =  this.germplasmAPI.germplasmGermplasmDbIdPut("i_do_not_exist", germplasm);
        });
        assertEquals(404, exception.getCode());
    }

    @Test
    public void updateGermplasmMissingId() throws Exception {
        String updateGermplasmIdMissingError = "germplasmDbId cannot be null";
        // Check that it throws an APIException
        BrAPIGermplasm brApiGermplasm = new BrAPIGermplasm().germplasmName("new test germplasm");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIGermplasmSingleResponse> updateGermplasm =  this.germplasmAPI.germplasmGermplasmDbIdPut(null, germplasm);
        });

        assertEquals(updateGermplasmIdMissingError, exception.getMessage(), "Wrong error message");
    }
}
