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

import com.google.gson.JsonObject;
import lombok.SneakyThrows;

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.ScaleQueryParams;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.pheno.BrAPIScale;
import org.brapi.v2.model.pheno.BrAPIScaleValidValues;
import org.brapi.v2.model.pheno.BrAPIScaleValidValuesCategories;
import org.brapi.v2.model.pheno.response.BrAPIScaleListResponse;
import org.brapi.v2.model.pheno.response.BrAPIScaleSingleResponse;
import org.brapi.v2.model.pheno.BrAPITraitDataType;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ScalesAPITests extends BrAPIClientTest {

	private ScalesApi scalesAPI = new ScalesApi(this.apiClient);
	private String externalReferenceID = "testId";
	private String externalReferenceSource = "testSource";
	private BrAPIScale createdScale;

	// depends on this existing in test db until we can create our own
	// don't have GET /ontologies yet either
	private String validOntologyDbId = "ontology_attribute1";

	@Test
	public void scalesPostIdPresent() throws ApiException {
		BrAPIScale brApiScale = new BrAPIScale().scaleDbId("test");

		ApiResponse<BrAPIScaleListResponse> scale = scalesAPI.scalesPost(Arrays.asList(brApiScale));
	}

	@Test
	public void scalesPostNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIScaleListResponse> scale = scalesAPI.scalesPost(null);
		});
	}

	@Test
	public void scalesPostMultipleIdPresent() throws ApiException {
		BrAPIScale brApiScale = new BrAPIScale().scaleDbId("test");

		BrAPIScale brApiScale1 = new BrAPIScale();
		List<BrAPIScale> brApiScales = new ArrayList<>();
		brApiScales.add(brApiScale);
		brApiScales.add(brApiScale1);

		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesPost(brApiScales);
	}

	@Test
	public void scalesPostMultipleEmptyList() throws ApiException {

		List<BrAPIScale> brApiScales = new ArrayList<>();

		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesPost(brApiScales);
	}

	@Test
	public void scalesPostMultipleNull() {

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesPost(null);
		});
	}

	@Test
	@Order(1)
	public void scalesPostSuccess() throws Exception {
		BrAPIExternalReference brApiExternalReference = new BrAPIExternalReference().referenceID(externalReferenceID)
				.referenceSource(externalReferenceSource);

		List<BrAPIExternalReference> externalReferences = new ArrayList<>();
		externalReferences.add(brApiExternalReference);

		BrAPIOntologyReference brApiOntologyReference = new BrAPIOntologyReference().ontologyDbId(validOntologyDbId)
				.ontologyName("Ontology.org").version("17");

		BrAPIScaleValidValuesCategories low = new BrAPIScaleValidValuesCategories().label("low").value("0");
		BrAPIScaleValidValuesCategories high = new BrAPIScaleValidValuesCategories().label("high").value("5");

		List<BrAPIScaleValidValuesCategories> categories = Arrays.asList(low, high);

		BrAPITraitDataType dataType = BrAPITraitDataType.TEXT;
		BrAPIScaleValidValues validValues = new BrAPIScaleValidValues().min(0).minimumValue("0").max(5).maximumValue("5").categories(categories);

		JsonObject additionalInfo = new JsonObject();
		additionalInfo.addProperty("test", "test");
		BrAPIScale brApiScale = new BrAPIScale().additionalInfo(additionalInfo).externalReferences(externalReferences)
				.ontologyReference(brApiOntologyReference).dataType(dataType).decimalPlaces(2).scaleName("test scale")
				.validValues(validValues);

		ApiResponse<BrAPIScaleListResponse> createdScale = scalesAPI.scalesPost(Arrays.asList(brApiScale));

		assertNotNull(createdScale);
		BrAPIScale scale = createdScale.getBody().getResult().getData().get(0);

		assertFalse(scale.getScaleDbId() == null, "Scale id missing");
		scaleAssertEquals(brApiScale, scale);

		this.createdScale = scale;
	}

	private void scaleAssertEquals(BrAPIScale expected, BrAPIScale actual) {
		assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Scale additionalInfo mismatch");
		assertEquals(expected.getScaleName(), actual.getScaleName(), "Scale name mismatch");
		if (expected.getOntologyReference() != null && actual.getOntologyReference() != null) {
			assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(),
					"Scale ontology dbId mismatch");
			assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(),
					"Scale ontology name mismatch");
			assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(),
					"Scale ontology version mismatch");
		} else {
			assertEquals(expected.getOntologyReference(), actual.getOntologyReference(), "Scale ontology reference mismatch");
		}
		assertEquals(expected.getExternalReferences(), actual.getExternalReferences(),
				"Scale external reference mismatch");
		assertEquals(expected.getDataType(), actual.getDataType(), "Scale data type mismatch");
		assertEquals(expected.getDecimalPlaces(), actual.getDecimalPlaces(), "Scale decimal places mismatch");
		assertEquals(expected.getValidValues(), actual.getValidValues(), "Scale valid values mismatch");
	}

	@Test
	@Order(1)
	public void scalesPostsMultipleSuccess() throws Exception {
		BrAPIScale brApiScale = new BrAPIScale().scaleName("new test scale1").validValues(new BrAPIScaleValidValues().min(0).max(100));
		BrAPIScale brApiScale2 = new BrAPIScale().scaleName("new test scale2").validValues(new BrAPIScaleValidValues().min(0).max(100));

		List<BrAPIScale> scales = Arrays.asList(brApiScale, brApiScale2);

		ApiResponse<BrAPIScaleListResponse> createdScalesRes = scalesAPI.scalesPost(scales);

		List<BrAPIScale> createdScales = createdScalesRes.getBody().getResult().getData();
		assertEquals(true, createdScales.size() == 2);
		assertEquals(true, createdScales.get(0).getScaleDbId() != null, "Scale id missing");
		assertEquals(true, createdScales.get(1).getScaleDbId() != null, "Scale id missing");

		assertEquals(brApiScale.getScaleName(), createdScales.get(0).getScaleName(), "Scale name mismatch");
		assertEquals(brApiScale2.getScaleName(), createdScales.get(1).getScaleName(), "Scale name mismatch");
	}

	@Test
	@Order(2)
	void getScalesSuccess() throws Exception {
		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesGet(new ScaleQueryParams());

		assertEquals(false, scales.getBody().getResult().getData().isEmpty(), "List of scales was empty");
	}

	@Test
	@Order(2)
	void getScalesPageFilter() throws Exception {
		ScaleQueryParams baseRequest = ScaleQueryParams.builder().page(0).pageSize(1).build();

		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesGet(baseRequest);

		assertEquals(true, scales.getBody().getResult().getData().size() == 1, "More than one scale was returned");
	}

	@Test
	@Order(2)
	void getScalesByExternalReferenceIdSuccess() throws Exception {
		ScaleQueryParams scalesRequest = ScaleQueryParams.builder().externalReferenceID(externalReferenceID).build();

		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesGet(scalesRequest);

		assertEquals(true, scales.getBody().getResult().getData().size() > 0, "List of scales was empty");
	}

	@Test
	@Order(2)
	void getScalesByExternalReferenceSourceSuccess() throws Exception {
		ScaleQueryParams scalesRequest = ScaleQueryParams.builder().externalReferenceSource(externalReferenceSource)
				.build();

		ApiResponse<BrAPIScaleListResponse> scales = scalesAPI.scalesGet(scalesRequest);

		assertEquals(true, scales.getBody().getResult().getData().size() > 0, "List of scales was empty");
	}

	@Test
	public void getScaleByIdMissingId() throws Exception {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIScaleSingleResponse> scale = scalesAPI.scalesScaleDbIdGet(null);
		});
	}

	@Test
	@Order(2)
	void getScaleByIdSuccess() throws Exception {
		ApiResponse<BrAPIScaleListResponse> existingList = scalesAPI.scalesGet(new ScaleQueryParams());
		BrAPIScale existingScale = existingList.getBody().getResult().getData().get(0);
		ApiResponse<BrAPIScaleSingleResponse> optionalScale = scalesAPI.scalesScaleDbIdGet(existingScale.getScaleDbId());

		assertNotNull(optionalScale, "An empty optional was returned");
		BrAPIScale scale = optionalScale.getBody().getResult();
		assertEquals(true, scale.getScaleDbId() != null, "ScaleDbId was not parsed properly.");
		scaleAssertEquals(existingScale, scale);
	}

	@Test
	void getScaleByIdInvalid() throws Exception {
		ApiException exception = assertThrows(ApiException.class, () -> {
			ApiResponse<BrAPIScaleSingleResponse> scale = scalesAPI.scalesScaleDbIdGet("badScaleId");
		});
        assertEquals(404, exception.getCode());
	}

	@Test
	@Order(2)
	public void updateScaleSuccess() throws Exception {
		ApiResponse<BrAPIScaleListResponse> existingList = scalesAPI.scalesGet(new ScaleQueryParams());
		BrAPIScale existingScale = existingList.getBody().getResult().getData().get(0);
		existingScale.scaleName("updated_name").validValues(new BrAPIScaleValidValues().min(0).minimumValue("0").max(100).maximumValue("100").categories(Collections.emptyList()));

		// Check that it is a success and all data matches
		ApiResponse<BrAPIScaleSingleResponse> updatedScaleResult = this.scalesAPI.scalesScaleDbIdPut(existingScale.getScaleDbId(), existingScale);

		assertNotNull(updatedScaleResult, "Scale was not returned");
		BrAPIScale updatedScale = updatedScaleResult.getBody().getResult();
		scaleAssertEquals(existingScale, updatedScale);
	}

	@Test
	public void updateScaleMissingId() {
		// Check that it throws an ApiException
		BrAPIScale brApiScale = new BrAPIScale().scaleName("new test scale");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIScaleSingleResponse> updatedScaleResult = this.scalesAPI.scalesScaleDbIdPut(null,
					brApiScale);
		});
	}

	@Test
	public void updateScaleNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIScaleSingleResponse> scale = this.scalesAPI.scalesScaleDbIdPut("fake dbid", null);
		});
	}

}
