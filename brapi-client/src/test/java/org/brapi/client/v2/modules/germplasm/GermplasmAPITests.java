package org.brapi.client.v2.modules.germplasm;

import com.github.filosganga.geogson.model.Coordinates;
import com.github.filosganga.geogson.model.Point;
import com.github.filosganga.geogson.model.positions.SinglePosition;
import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiGeoJSON;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.germplasm.model.*;
import org.brapi.v2.germplasm.model.request.GermplasmRequest;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GermplasmAPITests extends BrAPIClientTest {

    private GermplasmAPI germplasmAPI = new GermplasmAPI(this.client);
    private BrApiGermplasm germplasm;

    @Test
    @SneakyThrows
    public void getProgramsSuccess() {

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm();

        assertEquals(true, !germplasm.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramsPageFilter() {
        GermplasmRequest baseRequest = GermplasmRequest.builder()
                .page(0)
                .pageSize(1)
                .build();

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm(baseRequest);

        assertEquals(true, germplasm.size() == 1, "More than one program was returned");
    }

    @Test
    @SneakyThrows
    @Order(1)
    public void createGermplasmSuccess() {

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test_key", "test_value");
        List<BrApiGermplasmDonor> donors = new ArrayList<>();
        donors.add(BrApiGermplasmDonor.builder()
                .donorInstituteCode("001")
                .donorAccessionNumber("A0002")
                .germplasmPUI("0000000009")
                .build()
        );
        List<BrApiExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(BrApiExternalReference.builder()
                .referenceID(UUID.randomUUID().toString())
                .referenceSource("http://brapi.org")
                .build()
        );
        List<BrApiGermplasmOrigin> germplasmOrigins = new ArrayList<>();
        germplasmOrigins.add(BrApiGermplasmOrigin.builder()
            .coordinateUncertainty("20")
            .coordinates(BrApiGeoJSON.builder()
                .type("Feature")
                .geometry(new Point(new SinglePosition(Coordinates.of(76, 120, 125))))
                .build()
            )
            .build()
        );
        List<BrApiGermplasmStorageType> storageTypes = new ArrayList<>();
        storageTypes.add(BrApiGermplasmStorageType.builder()
                .code(BrApiGermplasmStorageTypeCode._10)
                .description(BrApiGermplasmStorageTypeCode._10.getDescription())
                .build()
        );
        List<BrApiGermplasmSynonym> synonyms = new ArrayList<>();
        synonyms.add(BrApiGermplasmSynonym.builder()
                .type("PRE-Code")
                .synonym("Res. Tomatillo")
                .build()
        );
        List<BrApiGermplasmTaxon> taxons = new ArrayList<>();
        taxons.add(BrApiGermplasmTaxon.builder()
                .sourceName("BrAPI")
                .taxonId("00002")
                .build()
        );

        BrApiGermplasm brApiGermplasm = BrApiGermplasm.builder()
                .accessionNumber("A000002")
                .acquisitionDate(new Date(System.currentTimeMillis()))
                .additionalInfo(additionalInfo)
                .biologicalStatusOfAccessionCode(BrApiBiologicalStatusOfAccessionCode._100)
                .biologicalStatusOfAccessionDescription(BrApiBiologicalStatusOfAccessionCode._100.getDescription())
                .collection("resistance population")
                .commonCropName("Tomatillo")
                .countryOfOriginCode("United States")
                .defaultDisplayName("Resistant Tamatillo")
                .documentationURL("http://brapi.org")
                .donors(donors)
                .externalReferences(externalReferences)
                .genus("Tomato")
                .germplasmName("Tamatillo Resistant")
                //.germplasmOrigin(germplasmOrigins)
                .germplasmPUI("0000000001")
                .germplasmPreprocessing("transplanted from study 2351")
                .instituteCode("0001")
                .instituteName("BrAPI Institute")
                .pedigree("A000003/A000002")
                .seedSource("A000003/A000002")
                .seedSourceDescription("Branches were collected from a 10-year-old tree")
                .species("Tomato")
                .speciesAuthority("BrAPI")
                //.storageTypes(storageTypes)
                .subtaxa("Tomato")
                .subtaxaAuthority("BrAPI")
                .synonyms(synonyms)
                .taxonIds(taxons)
                .build();

        Optional<BrApiGermplasm> createdGermplasm = this.germplasmAPI.createGermplasm(brApiGermplasm);

        assertEquals(true, createdGermplasm.isPresent());
        BrApiGermplasm germplasm = createdGermplasm.get();
        assertEquals(true, germplasm.getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
        assertEquals(brApiGermplasm.getGermplasmName(), germplasm.getGermplasmName(), "Germplasm Name was not parsed properly");

        this.germplasm = germplasm;
    }

    @Test
    @SneakyThrows
    public void createMultipleGermplasmSuccess() {

        BrApiGermplasm brApiGermplasm1 = BrApiGermplasm.builder()
                .germplasmName("test1")
                .build();
        BrApiGermplasm brApiGermplasm2 = BrApiGermplasm.builder()
                .germplasmName("test2")
                .build();
        List<BrApiGermplasm> brApiGermplasmList = new ArrayList<>();
        brApiGermplasmList.add(brApiGermplasm1);
        brApiGermplasmList.add(brApiGermplasm2);

        List<BrApiGermplasm> createdGermplasm = this.germplasmAPI.createGermplasm(brApiGermplasmList);

        assertEquals(true, createdGermplasm.size() == 2);
        assertEquals(brApiGermplasm1.getGermplasmName(), createdGermplasm.get(0).getGermplasmName(), "Sent name and returned germplasm name does not match");
        assertEquals(true, createdGermplasm.get(0).getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
        assertEquals("test2", createdGermplasm.get(1).getGermplasmName(), "Sent name and returned germplasm name does not match");
        assertEquals(true, createdGermplasm.get(1).getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createGermplasmIdPresentFailure() {

        BrApiGermplasm brApiGermplasm = BrApiGermplasm.builder()
                .germplasmName("new test program")
                .germplasmDbId("id1123")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiGermplasm> createdGermplasm = this.germplasmAPI.createGermplasm(brApiGermplasm);
        });
    }

    @Test
    @SneakyThrows
    public void createGermplasmEmptySuccess() {
        BrApiGermplasm brApiGermplasm = new BrApiGermplasm();
        Optional<BrApiGermplasm> createdGermplasm = this.germplasmAPI.createGermplasm(brApiGermplasm);

        assertEquals(true, createdGermplasm.isPresent());
        BrApiGermplasm germplasm = createdGermplasm.get();
        assertEquals(true, germplasm.getGermplasmDbId() != null, "Germplasm Id was not parsed properly");
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void getProgramByIDSuccess() {
        Optional<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasmById(this.germplasm.getGermplasmDbId());

        assertEquals(true, germplasm.isPresent(), "Program was not returned");

        // Check the response was parsed correctly.
        BrApiGermplasm brApiGermplasm = germplasm.get();
        assertEquals(this.germplasm.getAccessionNumber(), brApiGermplasm.getAccessionNumber(), "Wrong Accession number");
        assertEquals(this.germplasm.getAcquisitionDate(), brApiGermplasm.getAcquisitionDate(), "Wrong Aquisition date");
        // Check deep
        assertEquals(true, brApiGermplasm.getAdditionalInfo() != null, "Additional info was not populated");
        Map<String, String> additionalInfo = brApiGermplasm.getAdditionalInfo();
        assertEquals(true, additionalInfo.size() > 0, "Additional info was not parsed correctly");

        assertEquals(this.germplasm.getBiologicalStatusOfAccessionCode(), brApiGermplasm.getBiologicalStatusOfAccessionCode(), "Wrong Biological status of accession code");
        assertEquals(this.germplasm.getBiologicalStatusOfAccessionDescription(), brApiGermplasm.getBiologicalStatusOfAccessionDescription(), "Wrong Biological status of accession description");
        assertEquals(this.germplasm.getBreedingMethodDbId(), brApiGermplasm.getBreedingMethodDbId(), "Wrong breeding method db id");
        assertEquals(this.germplasm.getCollection(), brApiGermplasm.getCollection(), "Wrong collection");
        assertEquals(this.germplasm.getCommonCropName(), brApiGermplasm.getCommonCropName(), "Wrong common crop name");
        assertEquals(this.germplasm.getCountryOfOriginCode(), brApiGermplasm.getCountryOfOriginCode(), "Wrong country of origin");
        assertEquals(this.germplasm.getDefaultDisplayName(), brApiGermplasm.getDefaultDisplayName(), "Wrong default display name");
        assertEquals(this.germplasm.getDocumentationURL(), brApiGermplasm.getDocumentationURL(), "Wrong documentation url");
        // Check deep
        //TODO: Uncomment when brapi donors is fixed
        /*
        List<BrApiGermplasmDonor> donors = brApiGermplasm.getDonors();
        assertEquals(true, donors != null, "Donors was not populated");
        assertEquals(true, donors.size() > 0, "Donors list was not populated");
        assertEquals(this.germplasm.getDonors().get(0).getDonorAccessionNumber(), donors.get(0).getDonorAccessionNumber(), "Wrong donor accession number");
        assertEquals(this.germplasm.getDonors().get(0).getDonorInstituteCode(), donors.get(0).getDonorInstituteCode(), "Wrong donor institute code");
        assertEquals(this.germplasm.getDonors().get(0).getGermplasmPUI(), donors.get(0).getGermplasmPUI(), "Wrong Donor Germplasm PUI");
        */

        // Check deeper
        List<BrApiExternalReference> externalReferences = brApiGermplasm.getExternalReferences();
        assertEquals(true, externalReferences != null, "External references was not populated");
        assertEquals(true, externalReferences.size() > 0, "External references list was not populated");
        assertEquals(this.germplasm.getExternalReferences().get(0).getReferenceID(), externalReferences.get(0).getReferenceID(), "Wrong External reference id");
        assertEquals(this.germplasm.getExternalReferences().get(0).getReferenceSource(), externalReferences.get(0).getReferenceSource(), "Wrong External reference source");

        assertEquals(this.germplasm.getGenus(), brApiGermplasm.getGenus(), "Wrong genus");
        assertEquals(this.germplasm.getGermplasmDbId(), brApiGermplasm.getGermplasmDbId(), "Wrong germplasm db id");
        assertEquals(this.germplasm.getGermplasmName(), brApiGermplasm.getGermplasmName(), "Wrong germplasm name");
        //TODO: Uncomment when brapi germplasm origin is working
        //assertEquals(this.germplasm.getGermplasmOrigin(), brApiGermplasm.getGermplasmOrigin(), "Wrong germplasm origin");
        assertEquals(this.germplasm.getGermplasmPUI(), brApiGermplasm.getGermplasmPUI(), "Wrong germplasm PUI");
        assertEquals(this.germplasm.getGermplasmPreprocessing(), brApiGermplasm.getGermplasmPreprocessing(),  "Wrong germplasm preprocessing");
        //TODO: Uncomment these when brapi institutes are fixed
        //assertEquals(this.germplasm.getInstituteCode(), brApiGermplasm.getInstituteCode(), "Wrong institute code");
        //assertEquals(this.germplasm.getInstituteName(), brApiGermplasm.getInstituteName(), "Wrong institute name");
        assertEquals(this.germplasm.getPedigree(), brApiGermplasm.getPedigree(), "Wrong pedigree");
        assertEquals(this.germplasm.getSeedSource(), brApiGermplasm.getSeedSource(), "Wrong seed source");
        assertEquals(this.germplasm.getSeedSourceDescription(), brApiGermplasm.getSeedSourceDescription(), "Wrong seed source description");
        assertEquals(this.germplasm.getSpecies(), brApiGermplasm.getSpecies(), "Wrong species");
        assertEquals(this.germplasm.getSpeciesAuthority(), brApiGermplasm.getSpeciesAuthority(), "Wrong species authority");
        // Check deeper
        // TODO: Check this once storage types are working or the POST
        /*
        List<BrApiGermplasmStorageType> storageTypes = brApiGermplasm.getStorageTypes();
        assertEquals(true, storageTypes != null, "Storage types was not populated");
        assertEquals(true, storageTypes.size() > 0, "Storage types list was not populated");
        assertEquals(this.germplasm.getStorageTypes().get(0).getDescription(), storageTypes.get(0).getDescription(), "Wrong Storage type description");
        assertEquals(this.germplasm.getStorageTypes().get(0).getCode(), storageTypes.get(0).getCode(), "Wrong Storage type code");
        */

        assertEquals(this.germplasm.getSubtaxa(), brApiGermplasm.getSubtaxa(), "Wrong subtaxa");
        assertEquals(this.germplasm.getSubtaxaAuthority(), brApiGermplasm.getSubtaxaAuthority(), "Wrong subtaxa authority");
        // Check deeper
        // TODO: Uncomment when synonyms are working
        /*
        List<BrApiGermplasmSynonym> synonyms = brApiGermplasm.getSynonyms();
        assertEquals(true, synonyms != null, "Synonyms was not populated");
        assertEquals(true, synonyms.size() > 0, "Synonyms list was not populated");
        assertEquals(this.germplasm.getSynonyms().get(0).getSynonym(), synonyms.get(0).getSynonym(), "Wrong synonym");
        assertEquals(this.germplasm.getSynonyms().get(0).getType(), synonyms.get(0).getType(), "Wrong type");
        */

        // Check deeper
        // TODO: Uncomment when taxons are working
        /*
        List<BrApiGermplasmTaxon> taxons = brApiGermplasm.getTaxonIds();
        assertEquals(true, taxons != null, "Taxons was not populated");
        assertEquals(true, taxons.size() > 0, "Taxons list was not populated");
        assertEquals(this.germplasm.getTaxonIds().get(0).getSourceName(), taxons.get(0).getSourceName(), "Wrong Taxon source name");
        assertEquals(this.germplasm.getTaxonIds().get(0).getTaxonId(), taxons.get(0).getTaxonId(), "Wrong Taxon id");
        */
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void getGermplasmByExternalReferenceIDSuccess() {
        GermplasmRequest germplasmRequest = GermplasmRequest.builder()
                .externalReferenceID(this.germplasm.getExternalReferences().get(0).getReferenceID())
                .build();

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm(germplasmRequest);

        assertEquals(true, germplasm.size() == 1, "Wrong number of germplasm returned");
    }

    @Test
    @SneakyThrows
    public void getGermplasmByExternalReferenceIDDoesNotExist() {
        GermplasmRequest germplasmRequest = GermplasmRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm(germplasmRequest);

        assertEquals(true, germplasm.size() == 0, "List of programs was not empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByIdMissingID() {

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiGermplasm> program = this.germplasmAPI.getGermplasmById("does not exist");
        });

        // Check out return message is returned
        String errorMsg = exception.getMessage();
        assertEquals(true, errorMsg.length() > 0, "Error message was not returned");
    }

    @Test
    @SneakyThrows
    @Order(3)
    public void updateProgramSuccess() {
        BrApiGermplasm germplasm = this.germplasm;
        germplasm.setGermplasmName("updated_name");
        germplasm.setAccessionNumber("A000004");

        // Check that it is a success and all data matches
        Optional<BrApiGermplasm> updatedGermplasmResult = this.germplasmAPI.updateGermplasm(germplasm);

        assertEquals(true, updatedGermplasmResult.isPresent(), "Germplasm was not returned");
        BrApiGermplasm updatedGermplasm = updatedGermplasmResult.get();
        assertEquals(germplasm.getGermplasmName(), updatedGermplasm.getGermplasmName(), "Wrong Germplasm name");
        assertEquals(germplasm.getAccessionNumber(), updatedGermplasm.getAccessionNumber(), "Wrong Program objective");
    }

    @Test
    @SneakyThrows
    public void updateProgramBadId() {
        // Check that it throws a 404
        BrApiGermplasm germplasm = this.germplasm;
        germplasm.setGermplasmDbId("i_do_not_exist");

        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiGermplasm> updatedGermplasmResult = this.germplasmAPI.updateGermplasm(germplasm);
        });
    }

    @Test
    @SneakyThrows
    public void updateProgramMissingId() {
        // Check that it throws an APIException
        BrApiGermplasm brApiGermplasm = BrApiGermplasm.builder()
                .germplasmName("new test program")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiGermplasm> updateGermplasm = this.germplasmAPI.updateGermplasm(brApiGermplasm);
        });
    }
}
