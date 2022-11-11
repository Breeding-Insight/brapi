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

import com.google.gson.JsonObject;
import lombok.SneakyThrows;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.LocationQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponse;
import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.core.BrAPILocation;
import org.brapi.v2.model.core.request.BrAPILocationSearchRequest;
import org.brapi.v2.model.core.response.BrAPILocationListResponse;
import org.brapi.v2.model.core.response.BrAPILocationSingleResponse;
import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LocationsAPITests extends BrAPIClientTest {

    private LocationsApi locationsAPI = new LocationsApi(this.apiClient);
    private String externalReferenceID = "testId";
    private String externalReferenceSource = "testSource";
    private BrAPILocation createdLocation;

    @Test
    public void createLocationIdPresent() throws ApiException {
    	BrAPILocation brApiLocation = new BrAPILocation().locationDbId("test");
        ApiResponse<BrAPILocationListResponse> location = locationsAPI.locationsPost(Arrays.asList(brApiLocation));
        
        assertNotEquals(brApiLocation.getLocationDbId(), location.getBody().getResult().getData().get(0).getLocationDbId());
    }

    @Test
    public void createLocationNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPILocationListResponse> location = locationsAPI.locationsPost(null);
        });
    }

    @Test
    public void createLocationMultipleIdPresent() throws ApiException {
    	BrAPILocation brApiLocation = new BrAPILocation().locationDbId("test");
    	BrAPILocation brApiLocation1 = new BrAPILocation();
        List<BrAPILocation> brApiLocations = new ArrayList<>();
        brApiLocations.add(brApiLocation);
        brApiLocations.add(brApiLocation1);

        ApiResponse<BrAPILocationListResponse> location = locationsAPI.locationsPost(brApiLocations);

        assertNotEquals(brApiLocation.getLocationDbId(), location.getBody().getResult().getData().get(0).getLocationDbId());
        assertNotEquals(brApiLocation1.getLocationDbId(), location.getBody().getResult().getData().get(1).getLocationDbId());

    }

    @Test
    public void createLocationMultipleEmptyList() throws ApiException {
        List<BrAPILocation> brApiLocations = new ArrayList<>();

        ApiResponse<BrAPILocationListResponse> location = locationsAPI.locationsPost(brApiLocations);
        
        assertTrue(location.getBody().getResult().getData().isEmpty());

    }

    @Test
    public void createLocationMultipleNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPILocationListResponse> location = locationsAPI.locationsPost(null);
        });
    }

    @Test
    @Order(1)
    @SneakyThrows
    public void createLocationSuccess() {
        BrAPILocation brApiLocation = buildTestLocation();
        ApiResponse<BrAPILocationListResponse> locationBody = locationsAPI.locationsPost(Arrays.asList(brApiLocation));
        BrAPILocation location = locationBody.getBody().getResult().getData().get(0);
        assertFalse(location.getLocationDbId() == null, "Location id missing");
        locationAssertEquals(brApiLocation, location);

        this.createdLocation = location;
    }

    private BrAPILocation buildTestLocation() {
        List<BrAPIExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(
				new BrAPIExternalReference()
				.referenceID(externalReferenceID)
				.referenceSource(externalReferenceSource));

        JsonObject additionalInfo = new JsonObject();
        additionalInfo.addProperty("test", "test");

        BrAPILocation brApiLocation = new BrAPILocation()
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
                .exposure("Structure, no exposure");

        return brApiLocation;
    }

    private void locationAssertEquals(BrAPILocation expected, BrAPILocation actual) {
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
        BrAPILocation brApiLocation1 = new BrAPILocation().locationName("new test location1");
        BrAPILocation brApiLocation2 = new BrAPILocation().locationName("new test location2");
        
        List<BrAPILocation> locations = new ArrayList<>();
        locations.add(brApiLocation1);
        locations.add(brApiLocation2);

        ApiResponse<BrAPILocationListResponse> locationsBody = locationsAPI.locationsPost(locations);

        List<BrAPILocation> createdLocations = locationsBody.getBody().getResult().getData();
        assertEquals(true, createdLocations.size() == 2);
        assertEquals(true, createdLocations.get(0).getLocationDbId() != null, "Location id missing");
        assertEquals(true, createdLocations.get(1).getLocationDbId() != null, "Location id missing");

        assertEquals(brApiLocation1.getLocationName(), createdLocations.get(0).getLocationName(), "Location name mismatch");
        assertEquals(brApiLocation2.getLocationName(), createdLocations.get(1).getLocationName(), "Location name mismatch");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsSuccess() {
        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(new LocationQueryParams());

        assertEquals(true, !locations.getBody().getResult().getData().isEmpty(), "List of locations was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsPageFilter() {

        LocationQueryParams baseRequest = LocationQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(baseRequest);

        assertEquals(true, locations.getBody().getResult().getData().size() == 1, "More than one location was returned");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsByExternalReferenceIdSuccess() {
        LocationQueryParams locationsRequest = LocationQueryParams.builder()
                .externalReferenceID(externalReferenceID)
                .build();

        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(locationsRequest);

        assertEquals(true, locations.getBody().getResult().getData().size() > 0, "List of locations was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsByExternalReferenceSourceSuccess() {
        LocationQueryParams locationsRequest = LocationQueryParams.builder()
                .externalReferenceSource(externalReferenceSource)
                .build();

        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(locationsRequest);

        assertEquals(true, locations.getBody().getResult().getData().size() > 0, "List of locations was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsByLocationType() {
        LocationQueryParams locationsRequest = LocationQueryParams.builder()
                .locationType(createdLocation.getLocationType())
                .build();

        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(locationsRequest);

        assertEquals(true, locations.getBody().getResult().getData().size() > 0, "List of locations was empty");
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationsByLocationId() {
        LocationQueryParams locationsRequest = LocationQueryParams.builder()
                .locationDbId(createdLocation.getLocationDbId())
                .build();

        ApiResponse<BrAPILocationListResponse> locations = locationsAPI.locationsGet(locationsRequest);

        assertEquals(true, locations.getBody().getResult().getData().size() > 0, "List of locations was empty");
    }

    @Test
    public void getLocationByIdMissingId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPILocationSingleResponse> location = locationsAPI.locationsLocationDbIdGet(null);
        });
    }

    @Test
    @SneakyThrows
    @Order(2)
    void getLocationByIdSuccess() {
        ApiResponse<BrAPILocationSingleResponse> optionalLocation = locationsAPI.locationsLocationDbIdGet(createdLocation.getLocationDbId());

        BrAPILocation location = optionalLocation.getBody().getResult();
        assertEquals(true, location.getLocationDbId() != null, "locationDbId was not parsed properly.");
        locationAssertEquals(createdLocation, location);
    }

    @Test
    @SneakyThrows
    void getLocationByIdInvalid() {
    	ApiException exception = assertThrows(ApiException.class, () -> {
            ApiResponse<BrAPILocationSingleResponse> location = locationsAPI.locationsLocationDbIdGet("badLocationId");
        });
        assertEquals(400, exception.getCode());
    }

    @Test
    @SneakyThrows
    @Order(2)
    public void updateLocationSuccess() {
        BrAPILocation location = this.createdLocation;
        location.setLocationName("updated_name");

        // Check that it is a success and all data matches
        ApiResponse<BrAPILocationSingleResponse> updatedLocationResult = this.locationsAPI.locationsLocationDbIdPut(createdLocation.getLocationDbId(), location);

        BrAPILocation updatedLocation = updatedLocationResult.getBody().getResult();
        locationAssertEquals(location, updatedLocation);
    }

    @Test
    @SneakyThrows
    public void updateLocationMissingId() {
        // Check that it throws an ApiException
        BrAPILocation brApiLocation = new BrAPILocation().locationName("new test location");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPILocationSingleResponse> updatedLocationResult = this.locationsAPI.locationsLocationDbIdPut(null, brApiLocation);
        });
    }

    @Test
    public void updateLocationNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ApiResponse<BrAPILocationSingleResponse> updatedLocationResult = this.locationsAPI.locationsLocationDbIdPut(null, null);
        });
    }

    @Test
    @Order(3)
    @SneakyThrows
    public void searchLocationByName() {
        BrAPILocationSearchRequest locationSearchRequest = new BrAPILocationSearchRequest();
        List<String> names = new ArrayList<>();
        names.add("updated_name");
        locationSearchRequest.setLocationNames(names);
        ApiResponse<Pair<Optional<BrAPILocationListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = locationsAPI.searchLocationsPost(locationSearchRequest);
        BrAPILocationListResponse locationResponse = response.getBody().getLeft().get();

        assertEquals(true, locationResponse.getResult().getData().size() > 0, "List of locations was empty");

    }

}
