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
import org.brapi.client.v2.model.queryParams.phenotype.VariableQueryParams;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.pheno.BrAPIMethod;
import org.brapi.v2.model.pheno.BrAPIObservationVariable;
import org.brapi.v2.model.pheno.BrAPIScale;
import org.brapi.v2.model.pheno.BrAPITrait;
import org.brapi.v2.model.pheno.response.BrAPIObservationVariableListResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationVariableSingleResponse;
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
	private BrAPIObservationVariable createdVariable;

	// depends on this existing in test db until we can create our own
	// don't have GET /ontologies yet either
	private String validOntologyDbId = "ontology_attribute1";
	private String validCrop = "Tomatillo";

	@Test
	public void createVariableIdPresent() throws ApiException {
		ApiResponse<BrAPIObservationVariableListResponse> variable = variablesAPI
				.variablesPost(Arrays.asList(new BrAPIObservationVariable()));

	}

	@Test
	public void createVariableNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationVariableListResponse> variable = variablesAPI.variablesPost(null);
		});
	}

	@Test
	public void createVariableMultipleIdPresent() throws ApiException {
		BrAPIObservationVariable brApiVariable = new BrAPIObservationVariable().observationVariableName("test");
		BrAPIObservationVariable brApiVariable1 = new BrAPIObservationVariable();
		List<BrAPIObservationVariable> brApiVariables = new ArrayList<>();
		brApiVariables.add(brApiVariable);
		brApiVariables.add(brApiVariable1);

		ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI.variablesPost(brApiVariables);

	}

	@Test
	public void createVariableMultipleEmptyList() throws ApiException {

		List<BrAPIObservationVariable> brApiVariables = new ArrayList<>();

		ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI.variablesPost(brApiVariables);

	}

	@Test
	public void createVariableMultipleNull() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI.variablesPost(null);
		});
	}

	@Test
	@Order(1)
	@SneakyThrows
	public void createVariableSuccess() {

		BrAPIObservationVariable brApiVariable = buildTestVariable();
		List<BrAPIObservationVariable> brApiVariableList = new ArrayList<>();
		brApiVariableList.add(brApiVariable);

		ApiResponse<BrAPIObservationVariableListResponse> createdVariable = variablesAPI
				.variablesPost(brApiVariableList);

		assertNotNull(createdVariable);
		BrAPIObservationVariable variable = createdVariable.getBody().getResult().getData().get(0);

		assertFalse(variable.getObservationVariableDbId() == null, "Variable id missing");
		variableAssertEquals(brApiVariable, variable);

		this.createdVariable = variable;
	}

	private BrAPIObservationVariable buildTestVariable() {

		BrAPIExternalReference brApiExternalReference = new BrAPIExternalReference().referenceID(externalReferenceID)
				.referenceSource(externalReferenceSource);

		List<BrAPIExternalReference> externalReferences = new ArrayList<>();
		externalReferences.add(brApiExternalReference);

		BrAPIOntologyReference brApiOntologyReference = new BrAPIOntologyReference().ontologyDbId(validOntologyDbId)
				.ontologyName("Ontology.org").version("17");

		Map<String, String> additionalInfo = new HashMap<>();
		additionalInfo.put("test", "test");

		List<String> contextOfUse = new ArrayList<>();
		contextOfUse.add("test context 1");
		contextOfUse.add("test context 2");

		List<String> synonyms = new ArrayList<>();
		contextOfUse.add("test synonym 1");
		contextOfUse.add("test synonym 2");

		BrAPITrait trait = new BrAPITrait();
		trait.setTraitName("test trait");

		BrAPIMethod method = new BrAPIMethod();
		method.setMethodName("test method");

		BrAPIScale scale = new BrAPIScale();
		scale.setScaleName("scale scale");

		OffsetDateTime timestamp = OffsetDateTime.parse("2020-05-26T20:45:10Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

		BrAPIObservationVariable brApiVariable = (BrAPIObservationVariable) new BrAPIObservationVariable()
				.observationVariableName("test variable").additionalInfo(additionalInfo).commonCropName(validCrop)
				.contextOfUse(contextOfUse).defaultValue("test default").documentationURL("http://www.test.com")
				.externalReferences(externalReferences).growthStage("test stage").institution("test institution")
				.language("test language").ontologyReference(brApiOntologyReference).scientist("test scientist")
				.status("test status").submissionTimestamp(timestamp).synonyms(synonyms).trait(trait).scale(scale)
				.method(method);

		return brApiVariable;

	}

	private void variableAssertEquals(BrAPIObservationVariable expected, BrAPIObservationVariable actual) {
		assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Variable additionalInfo mismatch");
		assertEquals(expected.getCommonCropName(), actual.getCommonCropName(), "Variable commonCropName mismatch");
		assertEquals(expected.getContextOfUse(), actual.getContextOfUse(), "Variable contextOfUse mismatch");
		assertEquals(expected.getDefaultValue(), actual.getDefaultValue(), "Variable defaultValue mismatch");
		assertEquals(expected.getDocumentationURL(), actual.getDocumentationURL(),
				"Variable documentationUrl mismatch");
		assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(),
				"Variable ontology dbId mismatch");
		assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(),
				"Variable ontology name mismatch");
		assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(),
				"Variable ontology version mismatch");
		assertEquals(expected.getExternalReferences(), actual.getExternalReferences(),
				"Variable external reference mismatch");
		assertEquals(expected.getGrowthStage(), actual.getGrowthStage(), "Variable growthStage mismatch");
		assertEquals(expected.getInstitution(), actual.getInstitution(), "Variable institution mismatch");
		assertEquals(expected.getLanguage(), actual.getLanguage(), "Variable language mismatch");
		assertEquals(expected.getScientist(), actual.getScientist(), "Variable scientist mismatch");
		assertEquals(expected.getStatus(), actual.getStatus(), "Variable status mismatch");
		assertEquals(expected.getSubmissionTimestamp(), actual.getSubmissionTimestamp(),
				"Variable submissionTimestamp mismatch");
		assertEquals(expected.getSynonyms(), actual.getSynonyms(), "Variable synonyms mismatch");
		assertEquals(expected.getObservationVariableName(), actual.getObservationVariableName(),
				"Variable name mismatch");
		assertEquals(expected.getTrait().getTraitName(), actual.getTrait().getTraitName(), "Variable trait mismatch");
		assertEquals(expected.getScale().getScaleName(), actual.getScale().getScaleName(), "Variable scale mismatch");
		assertEquals(expected.getMethod().getMethodName(), actual.getMethod().getMethodName(),
				"Variable method mismatch");
	}

	@Test
	@Order(1)
	@SneakyThrows
	public void createVariablesMultipleSuccess() {
		BrAPIObservationVariable brApiVariable = new BrAPIObservationVariable()
				.observationVariableName("new test variable1");

		BrAPIObservationVariable brApiVariable2 = new BrAPIObservationVariable()
				.observationVariableName("new test variable2");

		List<BrAPIObservationVariable> variables = new ArrayList<>();
		variables.add(brApiVariable);
		variables.add(brApiVariable2);

		ApiResponse<BrAPIObservationVariableListResponse> createdVariablesRes = variablesAPI.variablesPost(variables);

		List<BrAPIObservationVariable> createdVariables = createdVariablesRes.getBody().getResult().getData();

		assertEquals(true, createdVariables.size() == 2);
		assertEquals(true, createdVariables.get(0).getObservationVariableDbId() != null, "Variable id missing");
		assertEquals(true, createdVariables.get(1).getObservationVariableDbId() != null, "Variable id missing");

		assertEquals(brApiVariable.getObservationVariableName(), createdVariables.get(0).getObservationVariableName(),
				"Variable name mismatch");
		assertEquals(brApiVariable2.getObservationVariableName(), createdVariables.get(1).getObservationVariableName(),
				"Variable name mismatch");
	}

	@Test
	@SneakyThrows
	@Order(2)
	void getVariablesSuccess() {
		ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI
				.variablesGet(new VariableQueryParams());

		assertEquals(false, variables.getBody().getResult().getData().isEmpty(), "List of variables was empty");
	}

	@Test
	@SneakyThrows
	@Order(2)
	void getVariablesPageFilter() {
		VariableQueryParams baseRequest = VariableQueryParams.builder().page(0).pageSize(1).build();

		ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI.variablesGet(baseRequest);

		assertEquals(true, variables.getBody().getResult().getData().size() == 1,
				"More than one variable was returned");
	}

	@Test
	@SneakyThrows
	@Order(2)
	void getVariablesByExternalReferenceIdSuccess() {
		VariableQueryParams variablesRequest = VariableQueryParams.builder().externalReferenceID(externalReferenceID)
				.build();

		ApiResponse<BrAPIObservationVariableListResponse> variables = variablesAPI.variablesGet(variablesRequest);

		assertEquals(true, variables.getBody().getResult().getData().size() > 0, "List of variables was empty");
	}

	@Test
	public void getVariableByIdMissingId() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationVariableSingleResponse> variable = variablesAPI
					.variablesObservationVariableDbIdGet(null);
		});
	}

	@Test
	@SneakyThrows
	@Order(2)
	void getVariableByIdSuccess() {
		ApiResponse<BrAPIObservationVariableSingleResponse> optionalObservationVariable = variablesAPI
				.variablesObservationVariableDbIdGet(createdVariable.getObservationVariableDbId());

		assertNotNull(optionalObservationVariable, "An empty optional was returned");
		BrAPIObservationVariable variable = optionalObservationVariable.getBody().getResult();
		assertEquals(true, variable.getObservationVariableDbId() != null, "VariableDbId was not parsed properly.");
		variableAssertEquals((BrAPIObservationVariable) createdVariable, variable);
	}

	@Test
	@SneakyThrows
	void getVariableByIdInvalid() {
		ApiException exception = assertThrows(ApiException.class, () -> {
			ApiResponse<BrAPIObservationVariableSingleResponse> variable = variablesAPI
					.variablesObservationVariableDbIdGet("badVariableId");
		});
        assertEquals(404, exception.getCode());
	}

	@Test
	@SneakyThrows
	@Order(2)
	public void updateVariableSuccess() {
		BrAPIObservationVariable variable = this.createdVariable;
		variable.setObservationVariableName("updated_name");

		// Check that it is a success and all data matches
		ApiResponse<BrAPIObservationVariableSingleResponse> updatedVaribleResult = this.variablesAPI
				.variablesObservationVariableDbIdPut(this.createdVariable.getObservationVariableDbId(), variable);

		assertNotNull(updatedVaribleResult, "Variable was not returned");
		BrAPIObservationVariable updatedVariable = updatedVaribleResult.getBody().getResult();
		variableAssertEquals(variable, updatedVariable);
	}

	@Test
	@SneakyThrows
	public void updateVariableMissingId() {
		// Check that it throws an ApiException
		BrAPIObservationVariable brApiVariable = new BrAPIObservationVariable()
				.observationVariableName("new test variable");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationVariableSingleResponse> updatedVariableResult = this.variablesAPI
					.variablesObservationVariableDbIdPut(null, brApiVariable);
		});
	}

	@Test
	public void updateVariableNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIObservationVariableSingleResponse> variable = this.variablesAPI
					.variablesObservationVariableDbIdPut("fake id", null);
		});
	}

}
