/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.brapi.v2.phenotyping.model.BrApiScale;
import org.brapi.v2.phenotyping.model.BrApiTrait;
import org.brapi.v2.phenotyping.model.BrApiVariable;
import org.brapi.v2.phenotyping.model.request.VariablesRequest;
import org.junit.jupiter.api.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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

        BrApiVariable brApiVariable = buildTestVariable();

        Optional<BrApiVariable> createdVariable = variablesAPI.createVariable(brApiVariable);

        assertTrue(createdVariable.isPresent());
        BrApiVariable variable = createdVariable.get();

        assertFalse(variable.getObservationVariableDbId() == null, "Variable id missing");
        variableAssertEquals(brApiVariable, variable);

        this.createdVariable = variable;
    }

    private BrApiVariable buildTestVariable() {

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

        return brApiVariable;

    }

    private void variableAssertEquals(BrApiVariable expected, BrApiVariable actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Variable additionalInfo mismatch");
        assertEquals(expected.getCommonCropName(), actual.getCommonCropName(), "Variable commonCropName mismatch");
        assertEquals(expected.getContextOfUse(), actual.getContextOfUse(), "Variable contextOfUse mismatch");
        assertEquals(expected.getDefaultValue(), actual.getDefaultValue(), "Variable defaultValue mismatch");
        assertEquals(expected.getDocumentationURL(), actual.getDocumentationURL(), "Variable documentationUrl mismatch");
        assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(), "Variable ontology dbId mismatch");
        assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(), "Variable ontology name mismatch");
        assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(), "Variable ontology version mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Variable external reference mismatch");
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

        List<BrApiVariable> variables = variablesAPI.getVariables(baseRequest);

        assertEquals(true, variables.size() == 1, "More than one variable was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesByExternalReferenceIdSuccess() {
        VariablesRequest variablesRequest = VariablesRequest.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        List<BrApiVariable> variables = variablesAPI.getVariables(variablesRequest);

        assertEquals(true, variables.size() > 0, "List of variables was empty");
    }

    @Test
    public void getVariableByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiVariable> variable = variablesAPI.getVariableById(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariableByIdSuccess() {
        Optional<BrApiVariable> optionalBrApiVariable = variablesAPI.getVariableById(createdVariable.getObservationVariableDbId());

        assertEquals(true, optionalBrApiVariable.isPresent(), "An empty optional was returned");
        BrApiVariable variable = optionalBrApiVariable.get();
        assertEquals(true, variable.getObservationVariableDbId() != null, "VariableDbId was not parsed properly.");
        variableAssertEquals(createdVariable, variable);
    }

    @Test
    @SneakyThrows
    void getVariableByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiVariable> variable = variablesAPI.getVariableById("badVariableId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateVariableSuccess() {
        BrApiVariable variable = this.createdVariable;
        variable.setObservationVariableName("updated_name");

        // Check that it is a success and all data matches
        Optional<BrApiVariable> updatedVaribleResult = this.variablesAPI.updateVariable(variable);

        assertEquals(true, updatedVaribleResult.isPresent(), "Variable was not returned");
        BrApiVariable updatedVariable = updatedVaribleResult.get();
        variableAssertEquals(variable, updatedVariable);
    }

    @Test
    @SneakyThrows
    public void updateVariableMissingId() {
        // Check that it throws an APIException
        BrApiVariable brApiVariable = BrApiVariable.builder()
                .observationVariableName("new test variable")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiVariable> updatedVariableResult = this.variablesAPI.updateVariable(brApiVariable);
        });
    }

    @Test
    public void updateVariableNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiVariable> variable = this.variablesAPI.updateVariable(null);
        });
    }
    

}
