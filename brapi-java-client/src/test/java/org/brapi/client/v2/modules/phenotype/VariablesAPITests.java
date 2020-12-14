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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.client.v2.model.queryParams.phenotype.VariableQueryParams;
import org.brapi.v2.model.ExternalReferences;
import org.brapi.v2.model.ExternalReferencesInner;
import org.brapi.v2.model.OntologyReference;
import org.brapi.v2.model.pheno.Method;
import org.brapi.v2.model.pheno.MethodBaseClass;
import org.brapi.v2.model.pheno.ObservationVariable;
import org.brapi.v2.model.pheno.ObservationVariableListResponse;
import org.brapi.v2.model.pheno.ObservationVariableNewRequest;
import org.brapi.v2.model.pheno.ObservationVariableSingleResponse;
import org.brapi.v2.model.pheno.Scale;
import org.brapi.v2.model.pheno.ScaleBaseClass;
import org.brapi.v2.model.pheno.Trait;
import org.brapi.v2.model.pheno.TraitBaseClass;
import org.brapi.v2.model.pheno.VariableBaseClass;
import org.junit.jupiter.api.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VariablesAPITests extends BrAPIClientTest {

    private ObservationVariablesApi variablesAPI = new ObservationVariablesApi(this.apiClient);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private ObservationVariable createdVariable;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";
    private String validCrop = "Tomatillo";

    @Test
    public void createVariableIdPresent() {               
        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ObservationVariableListResponse> variable = variablesAPI.variablesPost(Arrays.asList(new ObservationVariableNewRequest()));
        });
    }

    @Test
    public void createVariableNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ObservationVariableListResponse> variable = variablesAPI.variablesPost(null);
        });
    }

    @Test
    public void createVariableMultipleIdPresent() {
    	ObservationVariableNewRequest brApiVariable = new ObservationVariableNewRequest()
                .observationVariableName("test");
    	ObservationVariableNewRequest brApiVariable1 = new ObservationVariableNewRequest();
        List<ObservationVariableNewRequest> brApiVariables = new ArrayList<>();
        brApiVariables.add(brApiVariable);
        brApiVariables.add(brApiVariable1);

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesPost(brApiVariables);
        });
    }

    @Test
    public void createVariableMultipleEmptyList() {

        List<ObservationVariableNewRequest> brApiVariables = new ArrayList<>();

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesPost(brApiVariables);
        });
    }

    @Test
    public void createVariableMultipleNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesPost(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createVariableSuccess() {

    	ObservationVariableNewRequest brApiVariable = buildTestVariable();
        List<ObservationVariableNewRequest> brApiVariableList = new ArrayList<>();
        brApiVariableList.add(brApiVariable);

        ApiResponse<ObservationVariableListResponse> createdVariable = variablesAPI.variablesPost(brApiVariableList);

        assertNotNull(createdVariable);
        ObservationVariable variable = createdVariable.getBody().getResult().getData().get(0);

        assertFalse(variable.getObservationVariableDbId() == null, "Variable id missing");
        variableAssertEquals(brApiVariable, variable);

        this.createdVariable = variable;
    }

    private ObservationVariableNewRequest buildTestVariable() {

        ExternalReferencesInner brApiExternalReference = new ExternalReferencesInner()
                .referenceID(externalReferenceID)
                .referenceSource(externalReferenceSource);
               
        ExternalReferences externalReferences = new ExternalReferences();
        externalReferences.add(brApiExternalReference);

        OntologyReference brApiOntologyReference = new OntologyReference()
                .ontologyDbId(validOntologyDbId)
                .ontologyName("Ontology.org")
                .version("17");

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");

        List<String> contextOfUse = new ArrayList<>();
        contextOfUse.add("test context 1");
        contextOfUse.add("test context 2");

        List<String> synonyms = new ArrayList<>();
        contextOfUse.add("test synonym 1");
        contextOfUse.add("test synonym 2");

        Trait trait = new Trait();
        trait.setTraitName("test trait");

        Method method = new Method();
        method.setMethodName("test method");

        Scale scale = new Scale();
        scale.setScaleName("scale scale");

        OffsetDateTime timestamp = OffsetDateTime.parse("2020-05-26T20:45:10Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        ObservationVariableNewRequest brApiVariable = (ObservationVariableNewRequest) new ObservationVariable()
                .observationVariableName("test variable")
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
                .trait(trait)
                .scale(scale)
                .method(method);
               

        return brApiVariable;

    }

    private void variableAssertEquals(ObservationVariableNewRequest expected, ObservationVariable actual) {
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
    	ObservationVariableNewRequest brApiVariable = new ObservationVariableNewRequest()
                .observationVariableName("new test variable1");
               
        ObservationVariableNewRequest brApiVariable2 = new ObservationVariableNewRequest()
                .observationVariableName("new test variable2");
               
        List<ObservationVariableNewRequest> variables = new ArrayList<>();
        variables.add(brApiVariable);
        variables.add(brApiVariable2);

        ApiResponse<ObservationVariableListResponse> createdVariablesRes = variablesAPI.variablesPost(variables);
        
        List<ObservationVariable> createdVariables = createdVariablesRes.getBody().getResult().getData();

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
        ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesGet(new VariableQueryParams());

        assertEquals(false, variables.getBody().getResult().getData().isEmpty(), "List of variables was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesPageFilter() {
    	VariableQueryParams baseRequest = VariableQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();
               

        ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesGet(baseRequest);

        assertEquals(true, variables.getBody().getResult().getData().size() == 1, "More than one variable was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariablesByExternalReferenceIdSuccess() {
    	VariableQueryParams variablesRequest = VariableQueryParams.builder()
                .externalReferenceID(externalReferenceID)
                .build();
               

        ApiResponse<ObservationVariableListResponse> variables = variablesAPI.variablesGet(variablesRequest);

        assertEquals(true, variables.getBody().getResult().getData().size() > 0, "List of variables was empty");
    }

    @Test
    public void getVariableByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ObservationVariableSingleResponse> variable = variablesAPI.variablesObservationVariableDbIdGet(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getVariableByIdSuccess() {
        ApiResponse<ObservationVariableSingleResponse> optionalObservationVariable = variablesAPI.variablesObservationVariableDbIdGet(createdVariable.getObservationVariableDbId());

        assertNotNull(optionalObservationVariable, "An empty optional was returned");
        ObservationVariable variable = optionalObservationVariable.getBody().getResult();
        assertEquals(true, variable.getObservationVariableDbId() != null, "VariableDbId was not parsed properly.");
        variableAssertEquals((ObservationVariableNewRequest) createdVariable, variable);
    }

    @Test
    @SneakyThrows
    void getVariableByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            ApiResponse<ObservationVariableSingleResponse> variable = variablesAPI.variablesObservationVariableDbIdGet("badVariableId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateVariableSuccess() {
        ObservationVariable variable = this.createdVariable;
        variable.setObservationVariableName("updated_name");

        // Check that it is a success and all data matches
        ApiResponse<ObservationVariableSingleResponse> updatedVaribleResult = this.variablesAPI.variablesObservationVariableDbIdPut(this.createdVariable.getObservationVariableDbId(), variable);

        assertNotNull(updatedVaribleResult, "Variable was not returned");
        ObservationVariable updatedVariable = updatedVaribleResult.getBody().getResult();
        variableAssertEquals(variable, updatedVariable);
    }

    @Test
    @SneakyThrows
    public void updateVariableMissingId() {
        // Check that it throws an ApiException
        ObservationVariableNewRequest brApiVariable = new ObservationVariable().observationVariableName("new test variable");

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ObservationVariableSingleResponse> updatedVariableResult = this.variablesAPI.variablesObservationVariableDbIdPut(null, brApiVariable);
        });
    }

    @Test
    public void updateVariableNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ObservationVariableSingleResponse> variable = this.variablesAPI.variablesObservationVariableDbIdPut("fake id", null);
        });
    }
    

}
