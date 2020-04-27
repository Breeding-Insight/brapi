package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.client.v2.modules.core.ProgramsAPI;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.request.TraitsRequest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TraitsAPITests extends BrAPIClientTest {

    private TraitsAPI traitsAPI = new TraitsAPI(this.client);
    private String externalReferenceID = "https://brapi.org/specification";
    public String traitId = "trait_attribute1";

    @Test
    @SneakyThrows
    void getTraitsSuccess() {
        List<BrApiTrait> traits = this.traitsAPI.getTraits();

        assertEquals(true, !traits.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    void getTraitsByExternalReferenceIdSuccess() {
        TraitsRequest traitsRequest = TraitsRequest.builder()
                .externalReferenceID(this.externalReferenceID)
                .build();

        List<BrApiTrait> traits = this.traitsAPI.getTraits(traitsRequest);

        assertEquals(true, traits.size() > 0, "List of programs was empty");
    }

    @Test
    @SneakyThrows
    void getTraitByIdSuccess() {
        Optional<BrApiTrait> optionalBrApiTrait = this.traitsAPI.getTraitById(traitId);

        assertEquals(true, optionalBrApiTrait.isPresent(), "An empty optional was returned");
        BrApiTrait trait = optionalBrApiTrait.get();
        assertEquals(true, trait.getTraitDbId() != null, "TraitDbId was not parsed properly.");
        assertEquals(true, trait.getAlternativeAbbreviations() != null, "Alternative Abbreviations were not parsed properly.");
        //TODO: Test alternative abbreviations
        assertEquals(true, trait.getAttribute() != null, "Attribute was not parsed properly.");
        assertEquals(true, trait.getAdditionalInfo() != null, "Additional Info was not parsed properly.");
        //TODO: Test additional info
        assertEquals(true, trait.getEntity() != null, "Entity was not parsed properly.");
        assertEquals(true, trait.getExternalReferences() != null, "External References were not parsed properly.");
        //TODO: Test external references
        assertEquals(true, trait.getMainAbbreviation() != null, "Main abbreviations were not parsed properly.");
        assertEquals(true, trait.getOntologyReference() != null, "Ontology reference was not parsed properly.");
        //TODO: Test ontology reference
        assertEquals(true, trait.getStatus() != null, "Status was not parsed properly.");
        assertEquals(true, trait.getSynonyms() != null, "Synonyms were not parsed properly.");
        //TODO: Test synonyms
        assertEquals(true, trait.getTraitClass() != null, "Trait class was not parsed properly.");
        assertEquals(true, trait.getTraitDescription() != null, "Trait description was not parsed properly.");
        assertEquals(true, trait.getTraitName() != null, "Trait name was not parsed properly.");
    }

    @Test
    @SneakyThrows
    public void getTraitByIdMissingID() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiTrait> traits = this.traitsAPI.getTraitById(null);
        });
    }
}
