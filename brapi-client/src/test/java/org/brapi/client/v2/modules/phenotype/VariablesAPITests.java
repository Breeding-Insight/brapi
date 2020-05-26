package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.brapi.v2.phenotyping.model.BrApiScale;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.brapi.v2.phenotyping.model.request.VariablesRequest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class VariablesAPITests extends BrAPIClientTest {

    private VariablesAPI variablesAPI = new VariablesAPI(this.client);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrApiVariable createdVariable;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";
    private String validCrop = "Tomatillo";

    @Test
    public void createVariableIdPresent() {
        BrApiVariable brApiVariable = BrApiVariable.builder()
                .observationVariableDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiVariable> variable = variablesAPI.createVariable(brApiVariable);
        });
    }

    @Test
    public void createVariableNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiVariable> variable = variablesAPI.createVariable(null);
        });
    }

    @Test
    public void createVariableMultipleIdPresent() {
        BrApiVariable brApiVariable = BrApiVariable.builder()
                .observationVariableDbId("test")
                .build();
        BrApiVariable brApiVariable1 = new BrApiVariable();
        List<BrApiVariable> brApiVariables = new ArrayList<>();
        brApiVariables.add(brApiVariable);
        brApiVariables.add(brApiVariable1);

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiVariable> variables = variablesAPI.createVariables(brApiVariables);
        });
    }

    @Test
    public void createVariableMultipleEmptyList() {

        List<BrApiVariable> brApiVariables = new ArrayList<>();

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiVariable> variables = variablesAPI.createVariables(brApiVariables);
        });
    }

    @Test
    public void createVariableMultipleNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            List<BrApiVariable> variables = variablesAPI.createVariables(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createVariableSuccess() {
        BrApiExternalReference brApiExternalReference = BrApiExternalReference.builder()
                .referenceID(externalReferenceID)
                .referenceSource(externalReferenceSource)
                .build();
        List<BrApiExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(brApiExternalReference);

        BrApiOntologyReference brApiOntologyReference = BrApiOntologyReference.builder()
                .ontologyDbId(validOntologyDbId)
                .ontologyName("Ontology.org")
                .version("17")
                .build();

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");

        List<String> contextOfUse = new ArrayList<>();
        contextOfUse.add("test context 1");
        contextOfUse.add("test context 2");

        List<String> synonyms = new ArrayList<>();
        contextOfUse.add("test synonym 1");
        contextOfUse.add("test synonym 2");

        BrApiTrait trait = BrApiTrait.builder()
                .traitName("test trait")
                .build();

        BrApiMethod method = BrApiMethod.builder()
                .methodName("test method")
                .build();

        BrApiScale scale = BrApiScale.builder()
                .scaleName("scale scale")
                .build();

        OffsetDateTime timestamp = OffsetDateTime.parse("2020-05-26T20:45:10Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        BrApiVariable brApiVariable = BrApiVariable.builder()
                .additionalInfo(additionalInfo)
                .commonCropName(validCrop)
                .contextOfUse(contextOfUse)
                .defaultValue("test default")
                .documentationURL("http://www.test.com")
                .externalReferences(externalReferences)
                .growthStage("test stage")
                .institution("test institution")
                .language("test language")
                .ontologyReference(brApiOntologyReference)
                .scientist("test scientist")
                .status("test status")
                .submissionTimestamp(timestamp)
                .synonyms(synonyms)
                .observationVariableName("test variable")
                .trait(trait)
                .scale(scale)
                .method(method)
                .build();

        Optional<BrApiVariable> createdVariable = variablesAPI.createVariable(brApiVariable);

        assertTrue(createdVariable.isPresent());
        BrApiVariable variable = createdVariable.get();

        assertFalse(variable.getObservationVariableDbId() == null, "Variable id missing");
        variableAssertEquals(brApiVariable, variable);

        this.createdVariable = variable;
    }

    private void variableAssertEquals(BrApiVariable expected, BrApiVariable actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Variable additionalInfo mismatch");
        assertEquals(expected.getCommonCropName(), actual.getCommonCropName(), "Variable commonCropName mismatch");
        assertEquals(expected.getContextOfUse(), actual.getContextOfUse(), "Variable contextOfUse mismatch");
        assertEquals(expected.getDefaultValue(), actual.getDefaultValue(), "Variable defaultValue mismatch");
        assertEquals(expected.getDocumentationURL(), actual.getDocumentationURL(), "Variable documentationUrl mismatch");
        assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(), "Scale ontology dbId mismatch");
        assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(), "Scale ontology name mismatch");
        assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(), "Scale ontology version mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Scale external reference mismatch");
        assertEquals(expected.getGrowthStage(), actual.getGrowthStage(), "Variable growthStage mismatch");
        assertEquals(expected.getInstitution(), actual.getInstitution(), "Variable institution mismatch");
        assertEquals(expected.getLanguage(), actual.getLanguage(), "Variable language mismatch");
        assertEquals(expected.getScientist(), actual.getScientist(), "Variable scientist mismatch");
        assertEquals(expected.getStatus(), actual.getStatus(), "Variable status mismatch");
        assertEquals(expected.getSubmissionTimestamp(), actual.getSubmissionTimestamp(), "Variable submissionTimestamp mismatch");
        assertEquals(expected.getSynonyms(), actual.getSynonyms(), "Variable synonyms mismatch");
        assertEquals(expected.getObservationVariableName(), actual.getObservationVariableName(), "Variable name mismatch");
        assertEquals(expected.getTrait().getTraitName(), actual.getTrait().getTraitName(), "Variable trait mismatch");
        assertEquals(expected.getScale().getScaleName(), actual.getScale().getScaleName(), "Variable scale mismatch");
        assertEquals(expected.getMethod().getMethodName(), actual.getMethod().getMethodName(), "Variable method mismatch");
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createVariablesMultipleSuccess() {
        BrApiVariable brApiVariable = BrApiVariable.builder()
                .observationVariableName("new test variable1")
                .build();
        BrApiVariable brApiVariable2 = BrApiVariable.builder()
                .observationVariableName("new test variable2")
                .build();
        List<BrApiVariable> variables = new ArrayList<>();
        variables.add(brApiVariable);
        variables.add(brApiVariable2);

        List<BrApiVariable> createdVariables = variablesAPI.createVariables(variables);

        assertEquals(true, createdVariables.size() == 2);
        assertEquals(true, createdVariables.get(0).getObservationVariableDbId() != null, "Variable id missing");
        assertEquals(true, createdVariables.get(1).getObservationVariableDbId() != null, "Variable id missing");

        assertEquals(brApiVariable.getObservationVariableName(), createdVariables.get(0).getObservationVariableName(), "Variable name mismatch");
        assertEquals(brApiVariable2.getObservationVariableName(), createdVariables.get(1).getObservationVariableName(), "Variable name mismatch");
    }

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
