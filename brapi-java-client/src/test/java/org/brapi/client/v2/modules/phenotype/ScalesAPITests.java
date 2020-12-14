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
import org.brapi.client.v2.model.queryParams.phenotype.ScaleQueryParams;
import org.brapi.v2.model.ExternalReferences;
import org.brapi.v2.model.ExternalReferencesInner;
import org.brapi.v2.model.OntologyReference;
import org.brapi.v2.model.pheno.Scale;
import org.brapi.v2.model.pheno.ScaleBaseClass;
import org.brapi.v2.model.pheno.ScaleBaseClassValidValues;
import org.brapi.v2.model.pheno.ScaleBaseClassValidValuesCategories;
import org.brapi.v2.model.pheno.ScaleListResponse;
import org.brapi.v2.model.pheno.ScaleSingleResponse;
import org.brapi.v2.model.pheno.TraitDataType;
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
    private Scale createdScale;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";

    @Test
    public void scalesPostIdPresent() {
        Scale brApiScale = new Scale().scaleDbId("test");
                
        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ScaleListResponse> scale = scalesAPI.scalesPost(Arrays.asList(brApiScale));
        });
    }

    @Test
    public void scalesPostNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ScaleListResponse> scale = scalesAPI.scalesPost(null);
        });
    }

    @Test
    public void scalesPostMultipleIdPresent() {
        Scale brApiScale = new Scale().scaleDbId("test");
                
        Scale brApiScale1 = new Scale();
        List<ScaleBaseClass> brApiScales = new ArrayList<>();
        brApiScales.add(brApiScale);
        brApiScales.add(brApiScale1);

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ScaleListResponse> scales = scalesAPI.scalesPost(brApiScales);
        });
    }

    @Test
    public void scalesPostMultipleEmptyList() {

        List<ScaleBaseClass> brApiScales = new ArrayList<>();

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ScaleListResponse> scales = scalesAPI.scalesPost(brApiScales);
        });
    }

    @Test
    public void scalesPostMultipleNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ScaleListResponse> scales = scalesAPI.scalesPost(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void scalesPostSuccess() {
        ExternalReferencesInner brApiExternalReference = new ExternalReferencesInner()
                .referenceID(externalReferenceID)
                .referenceSource(externalReferenceSource);
                
        ExternalReferences externalReferences = new ExternalReferences();
        externalReferences.add(brApiExternalReference);

        OntologyReference brApiOntologyReference = new OntologyReference()
                .ontologyDbId(validOntologyDbId)
                .ontologyName("Ontology.org")
                .version("17");                

        ScaleBaseClassValidValuesCategories low = new ScaleBaseClassValidValuesCategories().label("low").value("0");
        ScaleBaseClassValidValuesCategories high = new ScaleBaseClassValidValuesCategories().label("high").value("5");
                        
        List<ScaleBaseClassValidValuesCategories> categories = Arrays.asList(low, high);

        TraitDataType dataType = TraitDataType.TEXT;
        ScaleBaseClassValidValues validValues = new ScaleBaseClassValidValues()
        		.min(0).max(5)
                .categories(categories);
                
        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");
        ScaleBaseClass brApiScale = new Scale()
                .additionalInfo(additionalInfo)
                .externalReferences(externalReferences)
                .ontologyReference(brApiOntologyReference)
                .dataType(dataType)
                .decimalPlaces(2)
                .scaleName("test scale")
                .validValues(validValues);
                
        ApiResponse<ScaleListResponse> createdScale = scalesAPI.scalesPost(Arrays.asList(brApiScale));

        assertNotNull(createdScale);
        Scale scale = createdScale.getBody().getResult().getData().get(0);

        assertFalse(scale.getScaleDbId() == null, "Scale id missing");
        scaleAssertEquals(brApiScale, scale);

        this.createdScale = scale;
    }

    private void scaleAssertEquals(ScaleBaseClass expected, Scale actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Scale additionalInfo mismatch");
        assertEquals(expected.getScaleName(), actual.getScaleName(), "Scale name mismatch");
        assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(), "Scale ontology dbId mismatch");
        assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(), "Scale ontology name mismatch");
        assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(), "Scale ontology version mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Scale external reference mismatch");
        assertEquals(expected.getDataType(), actual.getDataType(), "Scale data type mismatch");
        assertEquals(expected.getDecimalPlaces(), actual.getDecimalPlaces(), "Scale decimal places mismatch");
        assertEquals(expected.getValidValues(), actual.getValidValues(), "Scale valid values mismatch");
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void scalesPostsMultipleSuccess() {
        ScaleBaseClass brApiScale = new Scale().scaleName("new test scale1");
        ScaleBaseClass brApiScale2 = new Scale().scaleName("new test scale2");
                
        List<ScaleBaseClass> scales = Arrays.asList(brApiScale, brApiScale2);

        ApiResponse<ScaleListResponse> createdScalesRes = scalesAPI.scalesPost(scales);

        List<Scale> createdScales = createdScalesRes.getBody().getResult().getData();
        assertEquals(true, createdScales.size() == 2);
        assertEquals(true, createdScales.get(0).getScaleDbId() != null, "Scale id missing");
        assertEquals(true, createdScales.get(1).getScaleDbId() != null, "Scale id missing");

        assertEquals(brApiScale.getScaleName(), createdScales.get(0).getScaleName(), "Scale name mismatch");
        assertEquals(brApiScale2.getScaleName(), createdScales.get(1).getScaleName(), "Scale name mismatch");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesSuccess() {
        ApiResponse<ScaleListResponse> scales = scalesAPI.scalesGet(new ScaleQueryParams());

        assertEquals(false, scales.getBody().getResult().getData().isEmpty(), "List of scales was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesPageFilter() {
        ScaleQueryParams baseRequest = ScaleQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<ScaleListResponse> scales = scalesAPI.scalesGet(baseRequest);

        assertEquals(true, scales.getBody().getResult().getData().size() == 1, "More than one scale was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesByExternalReferenceIdSuccess() {
        ScaleQueryParams scalesRequest = ScaleQueryParams.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        ApiResponse<ScaleListResponse> scales = scalesAPI.scalesGet(scalesRequest);

        assertEquals(true, scales.getBody().getResult().getData().size() > 0, "List of scales was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesByExternalReferenceSourceSuccess() {
        ScaleQueryParams scalesRequest = ScaleQueryParams.builder()
                .externalReferenceSource(externalReferenceSource)
                .build();

        ApiResponse<ScaleListResponse> scales = scalesAPI.scalesGet(scalesRequest);

        assertEquals(true, scales.getBody().getResult().getData().size() > 0, "List of scales was empty");
    }

    @Test
    public void getScaleByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ScaleSingleResponse> scale = scalesAPI.scalesScaleDbIdGet(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScaleByIdSuccess() {
        ApiResponse<ScaleSingleResponse> optionalScale = scalesAPI.scalesScaleDbIdGet(createdScale.getScaleDbId());

        assertNotNull(optionalScale, "An empty optional was returned");
        Scale scale = optionalScale.getBody().getResult();
        assertEquals(true, scale.getScaleDbId() != null, "ScaleDbId was not parsed properly.");
        scaleAssertEquals(createdScale, scale);
    }

    @Test
    @SneakyThrows
    void getScaleByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            ApiResponse<ScaleSingleResponse> scale = scalesAPI.scalesScaleDbIdGet("badScaleId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateScaleSuccess() {
        Scale scale = this.createdScale;
        scale.setScaleName("updated_name");

        // Check that it is a success and all data matches
        ApiResponse<ScaleSingleResponse> updatedScaleResult = this.scalesAPI.scalesScaleDbIdPut(this.createdScale.getScaleDbId(), scale);

        assertNotNull(updatedScaleResult, "Scale was not returned");
        Scale updatedScale = updatedScaleResult.getBody().getResult();
        scaleAssertEquals(scale, updatedScale);
    }

    @Test
    @SneakyThrows
    public void updateScaleMissingId() {
        // Check that it throws an ApiException
        ScaleBaseClass brApiScale = new Scale().scaleName("new test scale");
                
        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<ScaleSingleResponse> updatedScaleResult = this.scalesAPI.scalesScaleDbIdPut(null, brApiScale);
        });
    }

    @Test
    public void updateScaleNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<ScaleSingleResponse> scale = this.scalesAPI.scalesScaleDbIdPut("fake dbid", null);
        });
    }

}
