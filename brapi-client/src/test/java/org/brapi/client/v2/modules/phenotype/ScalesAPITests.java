package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ScalesAPITests extends BrAPIClientTest {

    private ScalesAPI scalesAPI = new ScalesAPI(this.client);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrApiScale createdScale;

    // depends on this existing in test db until we can create our own
    // don't have GET /ontologies yet either
    private String validOntologyDbId = "ontology_attribute1";

    @Test
    public void createScaleIdPresent() {
        BrApiScale brApiScale = BrApiScale.builder()
                .scaleDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiScale> scale = scalesAPI.createScale(brApiScale);
        });
    }

    @Test
    public void createScaleNull() {
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiScale> scale = scalesAPI.createScale(null);
        });
    }

    @Test
    public void createScaleMultipleIdPresent() {
        BrApiScale brApiScale = BrApiScale.builder()
                .scaleDbId("test")
                .build();
        BrApiScale brApiScale1 = new BrApiScale();
        List<BrApiScale> brApiScales = new ArrayList<>();
        brApiScales.add(brApiScale);
        brApiScales.add(brApiScale1);

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiScale> scales = scalesAPI.createScales(brApiScales);
        });
    }

    @Test
    public void createScaleMultipleEmptyList() {

        List<BrApiScale> brApiScales = new ArrayList<>();

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiScale> scales = scalesAPI.createScales(brApiScales);
        });
    }

    @Test
    public void createScaleMultipleNull() {

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiScale> scales = scalesAPI.createScales(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createScaleSuccess() {
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

        BrApiScaleCategories low = BrApiScaleCategories.builder()
                .label("low")
                .value("0")
                .build();
        BrApiScaleCategories high = BrApiScaleCategories.builder()
                .label("high")
                .value("5")
                .build();
        List<BrApiScaleCategories> categories = new ArrayList<>();
        categories.add(low);
        categories.add(high);

        BrApiTraitDataType dataType = BrApiTraitDataType.TEXT;
        BrApiScaleValidValues validValues = BrApiScaleValidValues.builder()
                .min(0)
                .max(5)
                .categories(categories)
                .build();

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");
        BrApiScale brApiScale = BrApiScale.builder()
                .additionalInfo(additionalInfo)
                .externalReferences(externalReferences)
                .ontologyReference(brApiOntologyReference)
                .dataType(dataType)
                .decimalPlaces(2)
                .scaleName("test scale")
                .validValues(validValues)
                .build();

        Optional<BrApiScale> createdScale = scalesAPI.createScale(brApiScale);

        assertTrue(createdScale.isPresent());
        BrApiScale scale = createdScale.get();

        assertFalse(scale.getScaleDbId() == null, "Scale id missing");
        scaleAssertEquals(brApiScale, scale);

        this.createdScale = scale;
    }

    private void scaleAssertEquals(BrApiScale expected, BrApiScale actual) {
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
    public void createScalesMultipleSuccess() {
        BrApiScale brApiScale = BrApiScale.builder()
                .scaleName("new test scale1")
                .build();
        BrApiScale brApiScale2 = BrApiScale.builder()
                .scaleName("new test scale2")
                .build();
        List<BrApiScale> scales = new ArrayList<>();
        scales.add(brApiScale);
        scales.add(brApiScale2);

        List<BrApiScale> createdScales = scalesAPI.createScales(scales);

        assertEquals(true, createdScales.size() == 2);
        assertEquals(true, createdScales.get(0).getScaleDbId() != null, "Scale id missing");
        assertEquals(true, createdScales.get(1).getScaleDbId() != null, "Scale id missing");

        assertEquals(brApiScale.getScaleName(), createdScales.get(0).getScaleName(), "Scale name mismatch");
        assertEquals(brApiScale2.getScaleName(), createdScales.get(1).getScaleName(), "Scale name mismatch");
    }
}
