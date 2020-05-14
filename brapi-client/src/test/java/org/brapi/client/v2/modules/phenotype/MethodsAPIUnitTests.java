package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ResponseHandlerFunction;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.phenotyping.model.BrApiMethod;
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
public class MethodsAPIUnitTests {

    MethodsAPI methodsAPI;
    @Mock
    BrAPIClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        methodsAPI = new MethodsAPI(brAPIClient);
    }

    @Test
    @SneakyThrows
    void createMethodsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiMethod> brApiMethod = methodsAPI.createMethod(new BrApiMethod());

        assertEquals(false, brApiMethod.isPresent(), "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getMethodsEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        List<BrApiMethod> brApiMethods = methodsAPI.getMethods();

        assertEquals(0, brApiMethods.size(), "List size is greater than 0");
    }

    @Test
    @SneakyThrows
    void getMethodsByIdEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiMethod> brApiMethod = methodsAPI.getMethodById("test");

        assertEquals(false, brApiMethod.isPresent(), "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getMethodsByExternalReferenceIdEmptyBody() {
        when(brAPIClient.execute(any(BrAPIRequest.class), any(ResponseHandlerFunction.class)))
                .thenReturn(Optional.empty());
        Optional<BrApiMethod> brApiMethod = methodsAPI.getMethodByExternalReferenceId("test");

        assertEquals(false, brApiMethod.isPresent(), "Empty optional was not returned.");
    }



}
