package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.phenotyping.model.BrApiTrait;
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
public class TraitsAPIUnitTests {

    TraitsAPI traitsAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        traitsAPI = new TraitsAPI(brAPIClient);
    }

    @Test
    @SneakyThrows
    void getTraitsEmtpyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiTrait> brApiTraits = traitsAPI.getTraits();

        assertEquals(0, brApiTraits.size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    void getTraitsByIdEmtpyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiTrait> brApiTrait = traitsAPI.getTraitById("test");

        assertEquals(false, brApiTrait.isPresent(), "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void createTraitsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiTrait> brApiTrait = traitsAPI.createTrait(new BrApiTrait());

        assertEquals(false, brApiTrait.isPresent(), "Empty optional was not returned.");
    }

}
