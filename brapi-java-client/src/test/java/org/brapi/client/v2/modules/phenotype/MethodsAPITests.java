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
import org.brapi.client.v2.model.queryParams.phenotype.MethodQueryParams;
import org.brapi.v2.model.BrAPIExternalReferenceList;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.pheno.BrAPIMethod;
import org.brapi.v2.model.pheno.BrAPIMethodBaseClass;
import org.brapi.v2.model.pheno.BrAPIMethodListResponse;
import org.brapi.v2.model.pheno.BrAPIMethodSingleResponse;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsAPITests extends BrAPIClientTest {

    private MethodsApi methodsAPI = new MethodsApi(this.apiClient);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrAPIMethod createdMethod;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";

    @Test
    public void createMethodIdPresent() {
        BrAPIMethod brApiMethod = new BrAPIMethod().methodDbId("test");
        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> method = methodsAPI.methodsPost(Arrays.asList(brApiMethod));
        });
    }

    @Test
    public void createMethodNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> method = methodsAPI.methodsPost(null);
        });
    }

    @Test
    public void createMethodMultipleIdPresent() {
        BrAPIMethod brApiMethod = new BrAPIMethod().methodDbId("test");
        BrAPIMethod brApiMethod1 = new BrAPIMethod();
        List<BrAPIMethodBaseClass> brApiMethods = new ArrayList<>();
        brApiMethods.add(brApiMethod);
        brApiMethods.add(brApiMethod1);

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> method = methodsAPI.methodsPost(brApiMethods);
        });
    }

    @Test
    public void createMethodMultipleEmptyList() {

        List<BrAPIMethodBaseClass> brApiMethods = new ArrayList<>();

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> method = methodsAPI.methodsPost(brApiMethods);
        });
    }

    @Test
    public void createMethodMultipleNull() {

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> method = methodsAPI.methodsPost(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createMethodSuccess() {
        BrAPIExternalReference brApiExternalReference = new BrAPIExternalReference()
                .referenceID(externalReferenceID)
                .referenceSource(externalReferenceSource);
        BrAPIExternalReferenceList externalReferences = new BrAPIExternalReferenceList();
        externalReferences.add(brApiExternalReference);

        BrAPIOntologyReference brApiOntologyReference = new BrAPIOntologyReference()
                .ontologyDbId(validOntologyDbId)
                .ontologyName("Ontology.org")
                .version("17");

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");
        BrAPIMethodBaseClass brApiMethod = new BrAPIMethod()
                .additionalInfo(additionalInfo)
                .externalReferences(externalReferences)
                .ontologyReference(brApiOntologyReference)
                .bibliographicalReference("test bib")
                .description("test method description")
                .formula("test = test + 1")
                .methodClass("test class")
                .methodName("new test method");

        ApiResponse<BrAPIMethodListResponse> createdMethod = methodsAPI.methodsPost(Arrays.asList(brApiMethod));

        assertNotNull(createdMethod);
        BrAPIMethod method = createdMethod.getBody().getResult().getData().get(0);

        assertFalse(method.getMethodDbId() == null, "Method id missing");
        methodAssertEquals(brApiMethod, method);

        this.createdMethod = method;
    }

    private void methodAssertEquals(BrAPIMethodBaseClass expected, BrAPIMethod actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Method additionalInfo mismatch");
        assertEquals(expected.getMethodName(), actual.getMethodName(), "Method name mismatch");
        assertEquals(expected.getBibliographicalReference(), actual.getBibliographicalReference(), "Method bibliographical mismatch");
        assertEquals(expected.getOntologyReference().getOntologyDbId(), actual.getOntologyReference().getOntologyDbId(), "Method ontology dbId mismatch");
        assertEquals(expected.getOntologyReference().getOntologyName(), actual.getOntologyReference().getOntologyName(), "Method ontology name mismatch");
        assertEquals(expected.getOntologyReference().getVersion(), actual.getOntologyReference().getVersion(), "Method ontology version mismatch");
        assertEquals(expected.getDescription(), actual.getDescription(), "Method description mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Method external reference mismatch");
        assertEquals(expected.getFormula(), actual.getFormula(), "Method formula mismatch");
        assertEquals(expected.getMethodClass(), actual.getMethodClass(), "Method class mismatch");
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createMethodsMultipleSuccess() {
        BrAPIMethodBaseClass brApiMethod = new BrAPIMethodBaseClass().methodName("new test method1");
        BrAPIMethodBaseClass brApiMethod2 = new BrAPIMethodBaseClass().methodName("new test method2");
        List<BrAPIMethodBaseClass> methods = new ArrayList<>();
        methods.add(brApiMethod);
        methods.add(brApiMethod2);

        ApiResponse<BrAPIMethodListResponse> createdMethodsRes = methodsAPI.methodsPost(methods);

        List<BrAPIMethod>  createdMethods = createdMethodsRes.getBody().getResult().getData();
        assertEquals(true, createdMethods.size() == 2);
        assertEquals(true, createdMethods.get(0).getMethodDbId() != null, "Method id missing");
        assertEquals(true, createdMethods.get(1).getMethodDbId() != null, "Method id missing");

        assertEquals(brApiMethod.getMethodName(), createdMethods.get(0).getMethodName(), "Method name mismatch");
        assertEquals(brApiMethod2.getMethodName(), createdMethods.get(1).getMethodName(), "Method name mismatch");
    }

    @Test
    public void getMethodsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIMethodListResponse> methods = this.methodsAPI.methodsGet(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsSuccess() {
        ApiResponse<BrAPIMethodListResponse> methods = methodsAPI.methodsGet(new MethodQueryParams());

        assertNotNull(methods, "List of methods was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsPageFilter() {
        MethodQueryParams baseRequest = MethodQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<BrAPIMethodListResponse> methods = methodsAPI.methodsGet(baseRequest);

        assertEquals(true, methods.getBody().getResult().getData().size() == 1, "More than one method was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsByExternalReferenceIdSuccess() {
        MethodQueryParams methodsRequest = MethodQueryParams.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        ApiResponse<BrAPIMethodListResponse> methods = methodsAPI.methodsGet(methodsRequest);

        assertEquals(true, methods.getBody().getResult().getData().size() > 0, "List of methods was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsByExternalReferenceSourceSuccess() {
        MethodQueryParams methodsRequest = MethodQueryParams.builder()
                .externalReferenceSource(externalReferenceSource)
                .build();

        ApiResponse<BrAPIMethodListResponse> methods = methodsAPI.methodsGet(methodsRequest);

        assertEquals(true, methods.getBody().getResult().getData().size() > 0, "List of methods was empty");
    }

    @Test
    @SneakyThrows
    void getMethodByExternalReferenceIdInvalid() {
        MethodQueryParams methodsRequest = MethodQueryParams.builder()
                .externalReferenceSource("badExternalReferenceId")
                .build();

        ApiResponse<BrAPIMethodListResponse> methods = methodsAPI.methodsGet(methodsRequest);
        assertEquals(true, methods.getBody().getResult().getData().isEmpty(), "A method was found that shouldn't have been");
    }

    @Test
    public void getMethodByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIMethodSingleResponse> method = methodsAPI.methodsMethodDbIdGet(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodByIdSuccess() {
        ApiResponse<BrAPIMethodSingleResponse> optionalMethod = methodsAPI.methodsMethodDbIdGet(createdMethod.getMethodDbId());

        assertNotNull(optionalMethod, "An empty optional was returned");
        BrAPIMethod method = optionalMethod.getBody().getResult();
        assertEquals(true, method.getMethodDbId() != null, "MethodDbId was not parsed properly.");
        methodAssertEquals(createdMethod, method);
    }

    @Test
    @SneakyThrows
    void getMethodByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            ApiResponse<BrAPIMethodSingleResponse> method = methodsAPI.methodsMethodDbIdGet("badMethodId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateMethodSuccess() {
        BrAPIMethod method = this.createdMethod;
        method.setMethodName("updated_name");
        method.setDescription("updated_description");

        // Check that it is a success and all data matches
        ApiResponse<BrAPIMethodSingleResponse> updatedMethodResult = this.methodsAPI.methodsMethodDbIdPut(this.createdMethod.getMethodDbId(), method);

        assertNotNull(updatedMethodResult, "Method was not returned");
        BrAPIMethod updatedMethod = updatedMethodResult.getBody().getResult();
        methodAssertEquals(method, updatedMethod);
    }

    @Test
    @SneakyThrows
    public void updateMethodMissingId() {
        // Check that it throws an APIException
        BrAPIMethodBaseClass brApiMethod = new BrAPIMethod().methodName("new test method");

        ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPIMethodSingleResponse> updatedMethodResult = this.methodsAPI.methodsMethodDbIdPut(null, brApiMethod);
        });
    }

    @Test
    public void updateMethodNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPIMethodSingleResponse> method = this.methodsAPI.methodsMethodDbIdPut("fake dbid", null);
        });
    }

}
