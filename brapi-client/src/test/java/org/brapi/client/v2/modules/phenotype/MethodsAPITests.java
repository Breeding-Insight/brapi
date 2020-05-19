package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.brapi.v2.phenotyping.model.request.MethodsRequest;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsAPITests extends BrAPIClientTest {

    private MethodsAPI methodsAPI = new MethodsAPI(this.client);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrApiMethod createdMethod;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";

    @Test
    public void createMethodIdPresent() {
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .methodDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> method = methodsAPI.createMethod(brApiMethod);
        });
    }

    @Test
    public void createMethodNull() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> method = methodsAPI.createMethod(null);
        });
    }

    @Test
    public void createMethodMultipleIdPresent() {
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .methodDbId("test")
                .build();
        BrApiMethod brApiMethod1 = new BrApiMethod();
        List<BrApiMethod> brApiMethods = new ArrayList<>();
        brApiMethods.add(brApiMethod);
        brApiMethods.add(brApiMethod1);

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiMethod> methods = methodsAPI.createMethods(brApiMethods);
        });
    }

    @Test
    public void createMethodMultipleEmptyList() {

        List<BrApiMethod> brApiMethods = new ArrayList<>();

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiMethod> methods = methodsAPI.createMethods(brApiMethods);
        });
    }

    @Test
    public void createMethodMultipleNull() {

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiMethod> methods = methodsAPI.createMethods(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createMethodSuccess() {
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
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .additionalInfo(additionalInfo)
                .externalReferences(externalReferences)
                .ontologyReference(brApiOntologyReference)
                .bibliographicalReference("test bib")
                .description("test method description")
                .formula("test = test + 1")
                .methodClass("test class")
                .methodName("new test method")
                .build();

        Optional<BrApiMethod> createdMethod = methodsAPI.createMethod(brApiMethod);

        assertTrue(createdMethod.isPresent());
        BrApiMethod method = createdMethod.get();

        assertFalse(method.getMethodDbId() == null, "Method id missing");
        methodAssertEquals(brApiMethod, method);

        this.createdMethod = method;
    }

    private void methodAssertEquals(BrApiMethod expected, BrApiMethod actual) {
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
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .methodName("new test method1")
                .build();
        BrApiMethod brApiMethod2 = BrApiMethod.builder()
                .methodName("new test method2")
                .build();
        List<BrApiMethod> methods = new ArrayList<>();
        methods.add(brApiMethod);
        methods.add(brApiMethod2);

        List<BrApiMethod> createdMethods = methodsAPI.createMethods(methods);

        assertEquals(true, createdMethods.size() == 2);
        assertEquals(true, createdMethods.get(0).getMethodDbId() != null, "Method id missing");
        assertEquals(true, createdMethods.get(1).getMethodDbId() != null, "Method id missing");

        assertEquals(brApiMethod.getMethodName(), createdMethods.get(0).getMethodName(), "Method name mismatch");
        assertEquals(brApiMethod2.getMethodName(), createdMethods.get(1).getMethodName(), "Method name mismatch");
    }

    @Test
    public void getMethodsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            List<BrApiMethod> methods = this.methodsAPI.getMethods(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsSuccess() {
        List<BrApiMethod> methods = methodsAPI.getMethods();

        assertEquals(true, !methods.isEmpty(), "List of methods was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsPageFilter() {
        MethodsRequest baseRequest = MethodsRequest.builder()
                .page(0)
                .pageSize(1)
                .build();

        List<BrApiMethod> methods = methodsAPI.getMethods(baseRequest);

        assertEquals(true, methods.size() == 1, "More than one method was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsByExternalReferenceIdSuccess() {
        MethodsRequest methodsRequest = MethodsRequest.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        List<BrApiMethod> methods = methodsAPI.getMethods(methodsRequest);

        assertEquals(true, methods.size() > 0, "List of methods was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodsByExternalReferenceSourceSuccess() {
        MethodsRequest methodsRequest = MethodsRequest.builder()
                .externalReferenceSource(externalReferenceSource)
                .build();

        List<BrApiMethod> methods = methodsAPI.getMethods(methodsRequest);

        assertEquals(true, methods.size() > 0, "List of methods was empty");
    }

    @Test
    @SneakyThrows
    void getMethodByExternalReferenceIdInvalid() {
        MethodsRequest methodsRequest = MethodsRequest.builder()
                .externalReferenceSource("badExternalReferenceId")
                .build();

        List<BrApiMethod> methods = methodsAPI.getMethods(methodsRequest);
        assertEquals(true, methods.isEmpty(), "A method was found that shouldn't have been");
    }

    @Test
    public void getMethodByIdMissingId() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> method = methodsAPI.getMethodById(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getMethodByIdSuccess() {
        Optional<BrApiMethod> optionalBrApiMethod = methodsAPI.getMethodById(createdMethod.getMethodDbId());

        assertEquals(true, optionalBrApiMethod.isPresent(), "An empty optional was returned");
        BrApiMethod method = optionalBrApiMethod.get();
        assertEquals(true, method.getMethodDbId() != null, "MethodDbId was not parsed properly.");
        methodAssertEquals(createdMethod, method);
    }

    @Test
    @SneakyThrows
    void getMethodByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiMethod> method = methodsAPI.getMethodById("badMethodId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateMethodSuccess() {
        BrApiMethod method = this.createdMethod;
        method.setMethodName("updated_name");
        method.setDescription("updated_description");

        // Check that it is a success and all data matches
        Optional<BrApiMethod> updatedMethodResult = this.methodsAPI.updateMethod(method);

        assertEquals(true, updatedMethodResult.isPresent(), "Method was not returned");
        BrApiMethod updatedMethod = updatedMethodResult.get();
        methodAssertEquals(method, updatedMethod);
    }

    @Test
    @SneakyThrows
    public void updateMethodMissingId() {
        // Check that it throws an APIException
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .methodName("new test method")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> updatedMethodResult = this.methodsAPI.updateMethod(brApiMethod);
        });
    }

    @Test
    public void updateMethodNull() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> method = this.methodsAPI.updateMethod(null);
        });
    }

}
