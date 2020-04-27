package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.request.TraitsRequest;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TraitsAPITests extends BrAPIClientTest {

    private TraitsAPI traitsAPI = new TraitsAPI(this.client);
    private String externalReferenceID = "test";
    public String traitId = "trait_attribute1";

    @Test
    @SneakyThrows
    void getTraitsSuccess() {
        List<BrApiTrait> traits = this.traitsAPI.getTraits();

        assertEquals(true, !traits.isEmpty(), "List of programs was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
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

    @Test
    @SneakyThrows
    public void createTraitsMultipleSuccess() {
        BrApiTrait brApiTrait = BrApiTrait.builder()
                .traitName("new test trait1")
                .build();
        BrApiTrait brApiTrait2 = BrApiTrait.builder()
                .traitName("new test trait2")
                .build();
        List<BrApiTrait> traits = new ArrayList<>();
        traits.add(brApiTrait);
        traits.add(brApiTrait2);

        List<BrApiTrait> createdTraits = this.traitsAPI.createTraits(traits);

        assertEquals(true, createdTraits.size() == 2);
        assertEquals(true, createdTraits.get(0).getTraitDbId() != null, "Program Id was not parsed properly");

        assertEquals("new test trait1", createdTraits.get(0).getTraitName(), "Program Name was not parsed properly");
        assertEquals("new test trait2", createdTraits.get(1).getTraitName(), "Program Name was not parsed properly");
    }

    @Test
    @SneakyThrows
    @Order(1)
    public void createTraitSuccess() {
        BrApiExternalReference brApiExternalReference = BrApiExternalReference.builder()
                .referenceID(externalReferenceID)
                .build();
        List<BrApiExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(brApiExternalReference);
        BrApiTrait brApiTrait = BrApiTrait.builder()
                .traitName("new test trait")
                .externalReferences(externalReferences)
                .build();

        Optional<BrApiTrait> createdTrait = this.traitsAPI.createTrait(brApiTrait);

        assertEquals(true, createdTrait.isPresent());
        BrApiTrait trait = createdTrait.get();
        assertEquals("new test trait", trait.getTraitName(), "Program Name was not parsed properly");
    }

    @Test
    @SneakyThrows
    public void createTraitIdPresent(){
        BrApiTrait brApiTrait = BrApiTrait.builder()
                .traitDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiTrait> traits = this.traitsAPI.createTrait(brApiTrait);
        });
    }

    @Test
    @SneakyThrows
    public void createTraitsMultipleIdPresent(){
        BrApiTrait brApiTrait = BrApiTrait.builder()
                .traitDbId("test")
                .build();
        BrApiTrait brApiTrait1 = new BrApiTrait();
        List<BrApiTrait> brApiTraits = new ArrayList<>();
        brApiTraits.add(brApiTrait);
        brApiTraits.add(brApiTrait1);

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiTrait> traits = this.traitsAPI.createTraits(brApiTraits);
        });
    }
}
