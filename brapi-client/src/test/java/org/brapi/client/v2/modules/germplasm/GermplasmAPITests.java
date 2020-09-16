package org.brapi.client.v2.modules.germplasm;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.client.v2.modules.core.ProgramsAPI;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.brapi.v2.germplasm.model.*;
import org.brapi.v2.germplasm.model.request.GermplasmRequest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GermplasmAPITests extends BrAPIClientTest {

    private GermplasmAPI germplasmAPI = new GermplasmAPI(this.client);
    private String germplasmId = "germplasm1";

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

    /*@Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDSuccess() {
        GermplasmRequest germplasmRequest = GermplasmRequest.builder()
                .externalReferenceID(this.externalReferenceID)
                .build();

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm(germplasmRequest);

        assertEquals(true, germplasm.size() > 0, "List of programs was empty");
    }

    @Test
    @SneakyThrows
    public void getProgramByExternalReferenceIDDoesNotExist() {
        GermplasmRequest germplasmRequest = GermplasmRequest.builder()
                .externalReferenceID("will not exist")
                .build();

        List<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasm(germplasmRequest);

        assertEquals(true, germplasm.size() == 0, "List of programs was not empty");
    }*/

    @Test
    @SneakyThrows
    public void getProgramByIDSuccess() {
        Optional<BrApiGermplasm> germplasm = this.germplasmAPI.getGermplasmById(this.germplasmId);

        assertEquals(true, germplasm.isPresent(), "Program was not returned");

        // Check the response was parsed correctly.
        BrApiGermplasm brApiGermplasm = germplasm.get();
        assertEquals(true, brApiGermplasm.getAccessionNumber() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getAcquisitionDate() != null, "Accession number was not populated");
        // Check deep
        assertEquals(true, brApiGermplasm.getAdditionalInfo() != null, "Additional info was not populated");
        Map<String, String> additionalInfo = brApiGermplasm.getAdditionalInfo();
        assertEquals(true, additionalInfo.size() > 0, "Additional info was not parsed correctly");

        assertEquals(true, brApiGermplasm.getBiologicalStatusOfAccessionCode() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getBiologicalStatusOfAccessionDescription() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getBreedingMethodDbId() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getCollection() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getCommonCropName() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getCountryOfOriginCode() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getDefaultDisplayName() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getDocumentationURL() != null, "Accession number was not populated");
        // Check deep
        List<BrApiGermplasmDonor> donors = brApiGermplasm.getDonors();
        assertEquals(true, donors != null, "Donors was not populated");
        assertEquals(true, donors.size() > 0, "Donors list was not populated");
        assertEquals(true, donors.get(0).getDonorAccessionNumber() != null, "Donor Accession Number was not populated");
        assertEquals(true, donors.get(0).getDonorInstituteCode() != null, "Donor Institute Code was not populated");
        assertEquals(true, donors.get(0).getGermplasmPUI() != null, "Donor Germplasm PUI was not populated");

        // Check deeper
        List<BrApiExternalReference> externalReferences = brApiGermplasm.getExternalReferences();
        assertEquals(true, externalReferences != null, "External references was not populated");
        assertEquals(true, externalReferences.size() > 0, "External references list was not populated");
        assertEquals(true, externalReferences.get(0).getReferenceID() != null, "External reference id was not populated");
        assertEquals(true, externalReferences.get(0).getReferenceSource() != null, "External reference source was not populated");

        assertEquals(true, brApiGermplasm.getGenus() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getGermplasmDbId() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getGermplasmName() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getGermplasmOrigin() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getGermplasmPUI() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getGermplasmPreprocessing() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getInstituteCode() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getInstituteName() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getPedigree() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getSeedSource() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getSeedSourceDescription() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getSpecies() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getSpeciesAuthority() != null, "Accession number was not populated");
        // Check deeper
        List<BrApiGermplasmStorageType> storageTypes = brApiGermplasm.getStorageTypes();
        assertEquals(true, storageTypes != null, "Storage types was not populated");
        assertEquals(true, storageTypes.size() > 0, "Storage types list was not populated");
        assertEquals(true, storageTypes.get(0).getDescription() != null, "Storage type description was not populated");
        assertEquals(true, storageTypes.get(0).getCode() != null, "Storage type code was not populated");

        assertEquals(true, brApiGermplasm.getSubtaxa() != null, "Accession number was not populated");
        assertEquals(true, brApiGermplasm.getSubtaxaAuthority() != null, "Accession number was not populated");
        // Check deeper
        List<BrApiGermplasmSynonym> synonyms = brApiGermplasm.getSynonyms();
        assertEquals(true, synonyms != null, "Synonyms was not populated");
        assertEquals(true, synonyms.size() > 0, "Synonyms list was not populated");
        assertEquals(true, synonyms.get(0).getSynonym() != null, "Synonyms synonym was not populated");
        assertEquals(true, synonyms.get(0).getType() != null, "Synonyms type was not populated");

        // Check deeper
        List<BrApiGermplasmTaxon> taxons = brApiGermplasm.getTaxonIds();
        assertEquals(true, taxons != null, "Taxons was not populated");
        assertEquals(true, taxons.size() > 0, "Taxons list was not populated");
        assertEquals(true, taxons.get(0).getSourceName() != null, "Taxon source name not populated");
        assertEquals(true, taxons.get(0).getTaxonId() != null, "Taxon id not populated");
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
}
