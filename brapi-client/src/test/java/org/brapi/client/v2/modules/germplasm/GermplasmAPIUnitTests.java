package org.brapi.client.v2.modules.germplasm;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.germplasm.model.BrApiGermplasm;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GermplasmAPIUnitTests {

    GermplasmAPI germplasmAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        germplasmAPI = new GermplasmAPI(brAPIClient);
    }

    @Test
    @SneakyThrows
    public void getProgramsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiGermplasm> brApiGermplasm = germplasmAPI.getGermplasm();

        assertEquals(0, brApiGermplasm.size(), "List size is greater than 0");
    }
}
