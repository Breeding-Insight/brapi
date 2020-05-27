package org.brapi.client.v2.modules.phenotype;

import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpNotFoundException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;
import org.brapi.v2.phenotyping.model.*;
import org.brapi.v2.phenotyping.model.request.ScalesRequest;
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
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
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

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
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

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesSuccess() {
        List<BrApiScale> scales = scalesAPI.getScales();

        assertEquals(true, !scales.isEmpty(), "List of scales was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesPageFilter() {
        ScalesRequest baseRequest = ScalesRequest.builder()
                .page(0)
                .pageSize(1)
                .build();

        List<BrApiScale> scales = scalesAPI.getScales(baseRequest);

        assertEquals(true, scales.size() == 1, "More than one scale was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesByExternalReferenceIdSuccess() {
        ScalesRequest scalesRequest = ScalesRequest.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        List<BrApiScale> scales = scalesAPI.getScales(scalesRequest);

        assertEquals(true, scales.size() > 0, "List of scales was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScalesByExternalReferenceSourceSuccess() {
        ScalesRequest scalesRequest = ScalesRequest.builder()
                .externalReferenceSource(externalReferenceSource)
                .build();

        List<BrApiScale> scales = scalesAPI.getScales(scalesRequest);

        assertEquals(true, scales.size() > 0, "List of scales was empty");
    }

    @Test
    public void getScaleByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiScale> scale = scalesAPI.getScaleById(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getScaleByIdSuccess() {
        Optional<BrApiScale> optionalBrApiScale = scalesAPI.getScaleById(createdScale.getScaleDbId());

        assertEquals(true, optionalBrApiScale.isPresent(), "An empty optional was returned");
        BrApiScale scale = optionalBrApiScale.get();
        assertEquals(true, scale.getScaleDbId() != null, "ScaleDbId was not parsed properly.");
        scaleAssertEquals(createdScale, scale);
    }

    @Test
    @SneakyThrows
    void getScaleByIdInvalid() {
        HttpNotFoundException exception = assertThrows(HttpNotFoundException.class, () -> {
            Optional<BrApiScale> scale = scalesAPI.getScaleById("badScaleId");
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateScaleSuccess() {
        BrApiScale scale = this.createdScale;
        scale.setScaleName("updated_name");

        // Check that it is a success and all data matches
        Optional<BrApiScale> updatedScaleResult = this.scalesAPI.updateScale(scale);

        assertEquals(true, updatedScaleResult.isPresent(), "Scale was not returned");
        BrApiScale updatedScale = updatedScaleResult.get();
        scaleAssertEquals(scale, updatedScale);
    }

    @Test
    @SneakyThrows
    public void updateScaleMissingId() {
        // Check that it throws an APIException
        BrApiScale brApiScale = BrApiScale.builder()
                .scaleName("new test scale")
                .build();

        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiScale> updatedScaleResult = this.scalesAPI.updateScale(brApiScale);
        });
    }

    @Test
    public void updateScaleNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiScale> scale = this.scalesAPI.updateScale(null);
        });
    }

}
