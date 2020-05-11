package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.BrApiMethod;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MethodsAPITests extends BrAPIClientTest {

    private MethodsAPI methodsAPI = new MethodsAPI(this.client);
    private String externalReferenceID = "test";
    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";

    @Test
    public void createMethodIdPresent() {
        BrApiMethod brApiMethod = BrApiMethod.builder()
                .methodDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiMethod> method = this.methodsAPI.createMethod(brApiMethod);
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
            List<BrApiMethod> methods = this.methodsAPI.createMethods(brApiMethods);
        });
    }

    @Test
    @SneakyThrows
    public void createMethodSuccess() {
        BrApiExternalReference brApiExternalReference = BrApiExternalReference.builder()
                .referenceID(externalReferenceID)
                .referenceSource("test")
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

        Optional<BrApiMethod> createdMethod = this.methodsAPI.createMethod(brApiMethod);

        assertTrue(createdMethod.isPresent());
        BrApiMethod method = createdMethod.get();

        assertFalse(method.getMethodDbId() == null, "Method id missing");
        methodAssertEquals(brApiMethod, method);
    }

    private void methodAssertEquals(BrApiMethod expected, BrApiMethod actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Method additionalInfo mismatch");
        assertEquals(expected.getMethodName(), actual.getMethodName(), "Method name mismatch");
        assertEquals(expected.getBibliographicalReference(), actual.getBibliographicalReference(), "Method bibliographical mismatch");
        assertEquals(expected.getOntologyReference(), actual.getOntologyReference(), "Method ontology reference mismatch");
        assertEquals(expected.getDescription(), actual.getDescription(), "Method description mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Method external reference mismatch");
        assertEquals(expected.getFormula(), actual.getFormula(), "Method formula mismatch");
        assertEquals(expected.getMethodClass(), actual.getMethodClass(), "Method class mismatch");
    }

    @Test
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

        List<BrApiMethod> createdMethods = this.methodsAPI.createMethods(methods);

        assertEquals(true, createdMethods.size() == 2);
        assertEquals(true, createdMethods.get(0).getMethodDbId() != null, "Method id missing");
        assertEquals(true, createdMethods.get(1).getMethodDbId() != null, "Method id missing");

        assertEquals(brApiMethod.getMethodName(), createdMethods.get(0).getMethodName(), "Method name mismatch");
        assertEquals(brApiMethod2.getMethodName(), createdMethods.get(1).getMethodName(), "Method name mismatch");
    }

}
