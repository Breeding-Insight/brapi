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

package org.brapi.client.v2.modules.core;

import com.github.filosganga.geogson.model.Coordinates;
import com.github.filosganga.geogson.model.Point;
import com.github.filosganga.geogson.model.positions.SinglePosition;
import lombok.SneakyThrows;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiGeoJSON;
import org.brapi.v2.core.model.BrApiLocation;
import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LocationsAPITests extends BrAPIClientTest {

    private LocationsAPI locationsAPI = new LocationsAPI(this.client);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrApiLocation createdLocation;

    @Test
    public void createLocationIdPresent() {
        BrApiLocation brApiLocation = BrApiLocation.builder()
                .locationDbId("test")
                .build();
        APIException exception = assertThrows(APIException.class, () -> {
            Optional<BrApiLocation> location = locationsAPI.createLocation(brApiLocation);
        });
    }

    @Test
    public void createLocationNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Optional<BrApiLocation> location = locationsAPI.createLocation(null);
        });
    }

    @Test
    public void createLocationMultipleIdPresent() {
        BrApiLocation brApiLocation = BrApiLocation.builder()
                .locationDbId("test")
                .build();
        BrApiLocation brApiLocation1 = new BrApiLocation();
        List<BrApiLocation> brApiLocations = new ArrayList<>();
        brApiLocations.add(brApiLocation);
        brApiLocations.add(brApiLocation1);

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiLocation> locations = locationsAPI.createLocations(brApiLocations);
        });
    }

    @Test
    public void createLocationMultipleEmptyList() {
        List<BrApiLocation> brApiLocations = new ArrayList<>();

        APIException exception = assertThrows(APIException.class, () -> {
            List<BrApiLocation> locations = locationsAPI.createLocations(brApiLocations);
        });
    }

    @Test
    public void createLocationMultipleNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            List<BrApiLocation> locations = locationsAPI.createLocations(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createLocationSuccess() {
        BrApiLocation brApiLocation = buildTestLocation();

        Optional<BrApiLocation> createdLocation = locationsAPI.createLocation(brApiLocation);

        assertTrue(createdLocation.isPresent());
        BrApiLocation location = createdLocation.get();

        assertFalse(location.getLocationDbId() == null, "Location id missing");
        locationAssertEquals(brApiLocation, location);

        this.createdLocation = location;
    }

    private BrApiLocation buildTestLocation() {
        BrApiExternalReference brApiExternalReference = BrApiExternalReference.builder()
                .referenceID(externalReferenceID)
                .referenceSource(externalReferenceSource)
                .build();
        List<BrApiExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(brApiExternalReference);

        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("test", "test");

        BrApiLocation brApiLocation = BrApiLocation.builder()
                .locationName("Test location")
                .locationType("Storage location")
                .abbreviation("TL")
                .additionalInfo(additionalInfo)
                .coordinateDescription("North East corner of greenhouse")
                .coordinateUncertainty("20")
                .coordinates(BrApiGeoJSON.builder()
                        .type("Feature")
                        .geometry(new Point(new SinglePosition(Coordinates.of(-76.501884, 42.443962, 125))))
                        .build()
                )
                .countryName("United States")
                .countryCode("USA")
                .documentationURL("https://brapi.org")
                .instituteName("Cornell University")
                .instituteAddress("525 Tower Rd Ithaca, NY 14850")
                .topography("Hill")
                .slope("0")
                .environmentType("Nursery")
                .siteStatus("Private")
                .externalReferences(externalReferences)
                .exposure("Structure, no exposure")
                .build();

        return brApiLocation;
    }

    private void locationAssertEquals(BrApiLocation expected, BrApiLocation actual) {
        assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Location additionalInfo mismatch");
        assertEquals(expected.getAbbreviation(), actual.getAbbreviation(), "Location abbreviation mismatch");
        assertEquals(expected.getCoordinateDescription(), actual.getCoordinateDescription(), "Location coordinateDescription mismatch");
        assertEquals(expected.getCoordinates(), actual.getCoordinates(), "Location coordinates mismatch");
        assertEquals(expected.getCoordinateUncertainty(), actual.getCoordinateUncertainty(), "Location coordinateUncertainty mismatch");
        assertEquals(expected.getCountryCode(), actual.getCountryCode(), "Location countryCode mismatch");
        assertEquals(expected.getCountryName(), actual.getCountryName(), "Location countryName mismatch");
        assertEquals(expected.getLocationName(), actual.getLocationName(), "Location name mismatch");
        assertEquals(expected.getLocationType(), actual.getLocationType(), "Location type mismatch");
        assertEquals(expected.getCountryName(), actual.getCountryName(), "Location countryName mismatch");
        assertEquals(expected.getEnvironmentType(), actual.getEnvironmentType(), "Location environmentType mismatch");
        assertEquals(expected.getExposure(), actual.getExposure(), "Location exposure mistmatch");
        assertEquals(expected.getInstituteName(), actual.getInstituteName(), "Location instituteName mismatch");
        assertEquals(expected.getInstituteAddress(), actual.getInstituteAddress(), "Location instituteAddress mismatch");
        assertEquals(expected.getSiteStatus(), actual.getSiteStatus(), "Location siteStatus mismatch");
        assertEquals(expected.getSlope(), actual.getSlope(), "Location slope mismatch");
        assertEquals(expected.getTopography(), actual.getTopography(), "Location topography mismatch");
        assertEquals(expected.getDocumentationURL(), actual.getDocumentationURL(), "Location documentationUrl mismatch");
        assertEquals(expected.getExternalReferences(), actual.getExternalReferences(), "Location external reference mismatch");
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createLocationsMultipleSuccess() {
        BrApiLocation brApiLocation = BrApiLocation.builder()
                .locationName("new test location1")
                .build();
        BrApiLocation brApiLocation2 = BrApiLocation.builder()
                .locationName("new test location2")
                .build();
        List<BrApiLocation> locations = new ArrayList<>();
        locations.add(brApiLocation);
        locations.add(brApiLocation2);

        List<BrApiLocation> createdLocations = locationsAPI.createLocations(locations);

        assertEquals(true, createdLocations.size() == 2);
        assertEquals(true, createdLocations.get(0).getLocationDbId() != null, "Location id missing");
        assertEquals(true, createdLocations.get(1).getLocationDbId() != null, "Location id missing");

        assertEquals(brApiLocation.getLocationName(), createdLocations.get(0).getLocationName(), "Location name mismatch");
        assertEquals(brApiLocation2.getLocationName(), createdLocations.get(1).getLocationName(), "Location name mismatch");
    }
}
