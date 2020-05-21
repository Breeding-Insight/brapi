package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.brapi.v2.phenotyping.model.request.VariablesRequest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariablesAPITests extends BrAPIClientTest {

    private VariablesAPI variablesAPI = new VariablesAPI(this.client);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrApiVariable createdVariable;

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesSuccess() {
        List<BrApiVariable> variables = variablesAPI.getVariables();

        assertEquals(true, !variables.isEmpty(), "List of variables was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesPageFilter() {
        VariablesRequest baseRequest = VariablesRequest.builder()
                .page(0)
                .pageSize(1)
                .build();

        List<BrApiVariable> scales = variablesAPI.getVariables(baseRequest);

        assertEquals(true, scales.size() == 1, "More than one variable was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesByExternalReferenceIdSuccess() {
        VariablesRequest scalesRequest = VariablesRequest.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        List<BrApiVariable> variables = variablesAPI.getVariables(scalesRequest);

        assertEquals(true, variables.size() > 0, "List of variables was empty");
    }
    

}
