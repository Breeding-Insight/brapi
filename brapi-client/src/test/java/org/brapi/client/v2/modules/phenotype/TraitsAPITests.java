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
        Optional<BrApiTrait> traits = this.traitsAPI.getTraitById(traitId);

        assertEquals(true, traits.isPresent(), "An empty optional was returned");
    }

    @Test
    @SneakyThrows
    public void getTraitByIdMissingID() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiTrait> traits = this.traitsAPI.getTraitById(null);
        });
    }
}
