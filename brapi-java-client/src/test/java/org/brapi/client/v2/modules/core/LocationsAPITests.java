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
public class LocationsAPITests extends BrAPIClientTest {

	private LocationsApi api = new LocationsApi(this.apiClient);

	@Test
	public void createLocationIdPresent() throws ApiException {
		BrAPILocation brApiLocation = new BrAPILocation().locationDbId("test");
		ApiResponse<BrAPILocationListResponse> location = api.locationsPost(Arrays.asList(brApiLocation));

		assertNotEquals(brApiLocation.getLocationDbId(),
				location.getBody().getResult().getData().get(0).getLocationDbId());
	}

	@Test
	public void createLocationNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			api.locationsPost(null);
		});
	}

	@Test
	public void createLocationMultipleIdPresent() throws ApiException {
		BrAPILocation loc1 = new BrAPILocation().locationName("test name 1");
		BrAPILocation loc2 = new BrAPILocation().locationName("test name 2");
		List<BrAPILocation> brApiLocations = Arrays.asList(loc1, loc2);

		ApiResponse<BrAPILocationListResponse> locations = api.locationsPost(brApiLocations);

		assertNotNull(locations.getBody().getResult().getData().get(0).getLocationDbId());
		assertNotNull(locations.getBody().getResult().getData().get(1).getLocationDbId());
		assertEquals(loc1.getLocationName(), locations.getBody().getResult().getData().get(0).getLocationName());
		assertEquals(loc2.getLocationName(), locations.getBody().getResult().getData().get(1).getLocationName());

	}

	@Test
	public void createLocationMultipleEmptyList() throws ApiException {
		List<BrAPILocation> brApiLocations = new ArrayList<>();

		ApiResponse<BrAPILocationListResponse> location = api.locationsPost(brApiLocations);

		assertTrue(location.getBody().getResult().getData().isEmpty());

	}

	@Test
	public void createLocationMultipleNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			api.locationsPost(null);
		});
	}

	@Test
	@SneakyThrows
	public void createLocationSuccess() {
		BrAPILocation brApiLocation = buildTestLocation();
		ApiResponse<BrAPILocationListResponse> locationBody = api.locationsPost(Arrays.asList(brApiLocation));
		BrAPILocation location = locationBody.getBody().getResult().getData().get(0);
		assertFalse(location.getLocationDbId() == null, "Location id missing");
		locationAssertEquals(brApiLocation, location);
	}

	private BrAPILocation buildTestLocation() {
		List<BrAPIExternalReference> externalReferences = new ArrayList<>();
		externalReferences.add(new BrAPIExternalReference().referenceId("refID").referenceID("refID").referenceSource("refSource"));

		JsonObject additionalInfo = new JsonObject();
		additionalInfo.addProperty("test", "test");

		BrAPILocation brApiLocation = new BrAPILocation().locationName("Test location").locationType("Storage location")
				.abbreviation("TL").additionalInfo(additionalInfo)
				.coordinateDescription("North East corner of greenhouse").coordinateUncertainty("20")
				.coordinates(BrApiGeoJSON.builder().type("Feature")
						.geometry(new Point(new SinglePosition(Coordinates.of(-76.501884, 42.443962, 125)))).build())
				.countryName("United States").countryCode("USA").documentationURL("https://brapi.org")
				.instituteName("Cornell University").instituteAddress("525 Tower Rd Ithaca, NY 14850")
				.topography("Hill").slope("0").environmentType("Nursery").siteStatus("Private")
				.externalReferences(externalReferences).exposure("Structure, no exposure");

		return brApiLocation;
	}

	private void locationAssertEquals(BrAPILocation expected, BrAPILocation actual) {
		assertEquals(expected.getAdditionalInfo(), actual.getAdditionalInfo(), "Location additionalInfo mismatch");
		assertEquals(expected.getAbbreviation(), actual.getAbbreviation(), "Location abbreviation mismatch");
		assertEquals(expected.getCoordinateDescription(), actual.getCoordinateDescription(),
				"Location coordinateDescription mismatch");
		assertEquals(expected.getCoordinates(), actual.getCoordinates(), "Location coordinates mismatch");
		assertEquals(expected.getCoordinateUncertainty(), actual.getCoordinateUncertainty(),
				"Location coordinateUncertainty mismatch");
		assertEquals(expected.getCountryCode(), actual.getCountryCode(), "Location countryCode mismatch");
		assertEquals(expected.getCountryName(), actual.getCountryName(), "Location countryName mismatch");
		assertEquals(expected.getLocationName(), actual.getLocationName(), "Location name mismatch");
		assertEquals(expected.getLocationType(), actual.getLocationType(), "Location type mismatch");
		assertEquals(expected.getCountryName(), actual.getCountryName(), "Location countryName mismatch");
		assertEquals(expected.getEnvironmentType(), actual.getEnvironmentType(), "Location environmentType mismatch");
		assertEquals(expected.getExposure(), actual.getExposure(), "Location exposure mistmatch");
		assertEquals(expected.getInstituteName(), actual.getInstituteName(), "Location instituteName mismatch");
		assertEquals(expected.getInstituteAddress(), actual.getInstituteAddress(),
				"Location instituteAddress mismatch");
		assertEquals(expected.getSiteStatus(), actual.getSiteStatus(), "Location siteStatus mismatch");
		assertEquals(expected.getSlope(), actual.getSlope(), "Location slope mismatch");
		assertEquals(expected.getTopography(), actual.getTopography(), "Location topography mismatch");
		assertEquals(expected.getDocumentationURL(), actual.getDocumentationURL(),
				"Location documentationUrl mismatch");
		assertEquals(expected.getExternalReferences(), actual.getExternalReferences(),
				"Location external reference mismatch");
	}

	@Test
	@SneakyThrows
	public void createLocationsMultipleSuccess() {
		BrAPILocation brApiLocation1 = new BrAPILocation().locationName("new test location1");
		BrAPILocation brApiLocation2 = new BrAPILocation().locationName("new test location2");

		List<BrAPILocation> locations = new ArrayList<>();
		locations.add(brApiLocation1);
		locations.add(brApiLocation2);

		ApiResponse<BrAPILocationListResponse> locationsBody = api.locationsPost(locations);

		List<BrAPILocation> createdLocations = locationsBody.getBody().getResult().getData();
		assertEquals(true, createdLocations.size() == 2);
		assertEquals(true, createdLocations.get(0).getLocationDbId() != null, "Location id missing");
		assertEquals(true, createdLocations.get(1).getLocationDbId() != null, "Location id missing");

		assertEquals(brApiLocation1.getLocationName(), createdLocations.get(0).getLocationName(),
				"Location name mismatch");
		assertEquals(brApiLocation2.getLocationName(), createdLocations.get(1).getLocationName(),
				"Location name mismatch");
	}

	@Test
	@SneakyThrows
	void getLocationsSuccess() {
		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(new LocationQueryParams());

		assertFalse(locations.getBody().getResult().getData().isEmpty(), "List of locations was empty");
	}

	@Test
	@SneakyThrows
	void getLocationsPageFilter() {
		LocationQueryParams baseRequest = LocationQueryParams.builder().page(0).pageSize(1).build();

		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(baseRequest);

		assertEquals(1, locations.getBody().getResult().getData().size(), "More than one location was returned");
	}

	@Test
	@SneakyThrows
	void getLocationsByExternalReferenceIdSuccess() {
		LocationQueryParams locationsRequest = LocationQueryParams.builder()
				.externalReferenceId("https://brapi.org/specification").build();

		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(locationsRequest);

		assertEquals(3, locations.getBody().getResult().getData().size(), "Unexpected number of results");
	}

	@Test
	@SneakyThrows
	void getLocationsByExternalReferenceSourceSuccess() {
		LocationQueryParams locationsRequest = LocationQueryParams.builder().externalReferenceSource("BrAPI Doc")
				.build();

		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(locationsRequest);

		assertEquals(3, locations.getBody().getResult().getData().size(), "Unexpected number of results");
	}

	@Test
	@SneakyThrows
	void getLocationsByLocationType() {
		LocationQueryParams locationsRequest = LocationQueryParams.builder().locationType("Storage location").build();

		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(locationsRequest);

		assertEquals(1, locations.getBody().getResult().getData().size(), "Unexpected number of results");
	}

	@Test
	@SneakyThrows
	void getLocationsByLocationId() {
		String locationDbId = "location_01";
		LocationQueryParams locationsRequest = LocationQueryParams.builder().locationDbId(locationDbId).build();

		ApiResponse<BrAPILocationListResponse> locations = api.locationsGet(locationsRequest);

		assertEquals(true, locations.getBody().getResult().getData().size() > 0, "List of locations was empty");
	}

	@Test
	public void getLocationByIdMissingId() {
		assertThrows(IllegalArgumentException.class, () -> {
			api.locationsLocationDbIdGet(null);
		});
	}

	@Test
	@SneakyThrows
	void getLocationByIdSuccess() {
		String locationDbId = "location_01";
		ApiResponse<BrAPILocationSingleResponse> optionalLocation = api.locationsLocationDbIdGet(locationDbId);

		BrAPILocation location = optionalLocation.getBody().getResult();
		assertNotNull(location.getLocationDbId(), "locationDbId was not parsed properly.");
		assertEquals(locationDbId, location.getLocationDbId());
	}

	@Test
	@SneakyThrows
	void getLocationByIdInvalid() {
		ApiException exception = assertThrows(ApiException.class, () -> {
			api.locationsLocationDbIdGet("badLocationId");
		});
		assertEquals(404, exception.getCode());
	}

	@Test
	@SneakyThrows
	public void updateLocationSuccess() {
		String locationDbId = "location_01";
		BrAPILocation location = new BrAPILocation().locationDbId(locationDbId).locationName("updated_name");

		// Check that it is a success and all data matches
		ApiResponse<BrAPILocationSingleResponse> updatedLocationResult = this.api.locationsLocationDbIdPut(locationDbId,
				location);

		BrAPILocation updatedLocation = updatedLocationResult.getBody().getResult();
		assertEquals(locationDbId, updatedLocation.getLocationDbId());
		assertEquals(location.getLocationName(), updatedLocation.getLocationName());
	}

	@Test
	@SneakyThrows
	public void updateLocationMissingId() {
		// Check that it throws an ApiException
		BrAPILocation brApiLocation = new BrAPILocation().locationName("new test location");

		assertThrows(IllegalArgumentException.class, () -> {
			this.api.locationsLocationDbIdPut(null, brApiLocation);
		});
	}

	@Test
	public void updateLocationNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.api.locationsLocationDbIdPut(null, null);
		});
	}

	@Test
	@SneakyThrows
	public void searchLocationByName() {
		BrAPILocationSearchRequest body = new BrAPILocationSearchRequest().addLocationDbIdsItem("location_01")
				.addLocationDbIdsItem("location_02");

		ApiResponse<Pair<Optional<BrAPILocationListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = api
				.searchLocationsPost(body);

		Optional<BrAPILocationListResponse> listResponse = response.getBody().getLeft();
		Optional<BrAPIAcceptedSearchResponse> searchIdResponse = response.getBody().getRight();
		// only results are returned
		assertTrue(listResponse.isPresent());
		assertFalse(searchIdResponse.isPresent());

		assertEquals(2, listResponse.get().getResult().getData().size(), "unexpected number of items returned");

	}

	@Test
	public void searchAttributesSearchResultsDbIdGetTest() throws ApiException {
		BrAPILocationSearchRequest baseRequest = new BrAPILocationSearchRequest().addLocationDbIdsItem("location_01")
				.addLocationDbIdsItem("location_02").addLocationDbIdsItem("location_03")
				.addLocationDbIdsItem("location_01").addLocationDbIdsItem("location_02")
				.addLocationDbIdsItem("location_03");

		ApiResponse<Pair<Optional<BrAPILocationListResponse>, Optional<BrAPIAcceptedSearchResponse>>> response = this.api
				.searchLocationsPost(baseRequest);
		Optional<BrAPILocationListResponse> listResponse = response.getBody().getLeft();
		Optional<BrAPIAcceptedSearchResponse> searchIdResponse = response.getBody().getRight();
		// only search ID is returned
		assertFalse(listResponse.isPresent());
		assertTrue(searchIdResponse.isPresent());

		// Get results from search ID
		ApiResponse<Pair<Optional<BrAPILocationListResponse>, Optional<BrAPIAcceptedSearchResponse>>> searchResponse = this.api
				.searchLocationsSearchResultsDbIdGet(searchIdResponse.get().getResult().getSearchResultsDbId(), 0, 10);
		Optional<BrAPILocationListResponse> listResponse2 = searchResponse.getBody().getLeft();
		Optional<BrAPIAcceptedSearchResponse> searchIdResponse2 = searchResponse.getBody().getRight();
		// only results are returned
		assertTrue(listResponse2.isPresent());
		assertFalse(searchIdResponse2.isPresent());

		assertEquals(3, listResponse2.get().getResult().getData().size(), "unexpected number of items returned");
	}
}
