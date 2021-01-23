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
import org.brapi.client.v2.model.queryParams.phenotype.TraitQueryParams;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.pheno.BrAPITrait;
import org.brapi.v2.model.pheno.response.BrAPITraitListResponse;
import org.brapi.v2.model.pheno.response.BrAPITraitSingleResponse;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TraitsAPITests extends BrAPIClientTest {

	private TraitsApi traitsAPI = new TraitsApi(this.apiClient);
	private String externalReferenceID = "test";
	private BrAPITrait createdTrait;

	@Test
	@SneakyThrows
	public void createTraitIdPresent() {
		BrAPITrait brApiTrait = new BrAPITrait().traitDbId("test");
		ApiResponse<BrAPITraitListResponse> traits = this.traitsAPI.traitsPost(Arrays.asList(brApiTrait));
	}

	@Test
	@SneakyThrows
	public void createTraitsMultipleIdPresent() {
		BrAPITrait brApiTrait = new BrAPITrait().traitDbId("test");
		BrAPITrait brApiTrait1 = new BrAPITrait();
		List<BrAPITrait> brApiTraits = Arrays.asList(brApiTrait, brApiTrait1);

		ApiResponse<BrAPITraitListResponse> traits = this.traitsAPI.traitsPost(brApiTraits);
	}

	@Test
	@SneakyThrows
	@Order(1)
	public void createTraitSuccess() {
		BrAPITrait brApiTrait = buildDummy();

		ApiResponse<BrAPITraitListResponse> createdTrait = this.traitsAPI.traitsPost(Arrays.asList(brApiTrait));

		assertNotNull(createdTrait);
		BrAPITrait trait = createdTrait.getBody().getResult().getData().get(0);
		assertEquals("new test trait", trait.getTraitName(), "Program Name was not parsed properly");
		this.createdTrait = trait;
	}
	
	private BrAPITrait buildDummy() {
		BrAPIExternalReference brApiExternalReference = new BrAPIExternalReference().referenceID(externalReferenceID);
		List<BrAPIExternalReference> externalReferences = new ArrayList<>();
		externalReferences.add(brApiExternalReference);
		List<String> alternativeAbbreviations = new ArrayList<>();
		alternativeAbbreviations.add("test abbrev");
		Map<String, String> additionalInfo = new HashMap<>();
		additionalInfo.put("test", "test");
		return new BrAPITrait()
				.alternativeAbbreviations(alternativeAbbreviations)
				.attribute("test")
				.additionalInfo(additionalInfo)
				.entity("trait")
				.externalReferences(externalReferences)
				.mainAbbreviation("trait")
				.ontologyReference(new BrAPIOntologyReference().ontologyDbId("ontology_attribute1"))
				.status("trait")
				.synonyms(alternativeAbbreviations)
				.traitClass("test")
				.traitDescription("a trait for things")
				.traitName("new test trait");
	}

	@Test
	@SneakyThrows
	void getTraitsSuccess() {
		ApiResponse<BrAPITraitListResponse> traits = this.traitsAPI.traitsGet(new TraitQueryParams());

		assertEquals(false, traits.getBody().getResult().getData().isEmpty(), "List of programs was empty");
	}

	@Test
	@SneakyThrows
	void getTraitsPageFilter() {
		TraitQueryParams baseRequest = TraitQueryParams.builder().page(0).pageSize(1).build();

		ApiResponse<BrAPITraitListResponse> traits = this.traitsAPI.traitsGet(baseRequest);

		assertEquals(true, traits.getBody().getResult().getData().size() == 1, "More than one trait was returned");
	}

	@Test
	@SneakyThrows
	@Order(2)
	void getTraitsByExternalReferenceIdSuccess() {
		TraitQueryParams traitsRequest = TraitQueryParams.builder().externalReferenceID(this.externalReferenceID)
				.build();

		ApiResponse<BrAPITraitListResponse> traits = this.traitsAPI.traitsGet(traitsRequest);

		assertEquals(true, traits.getBody().getResult().getData().size() > 0, "List of programs was empty");
	}

	@Test
	@SneakyThrows
	@Order(3)
	void getTraitByIdSuccess() {
		BrAPITrait newTrait = buildDummy();
		ApiResponse<BrAPITraitListResponse> createdTraitList = this.traitsAPI.traitsPost(Arrays.asList(newTrait));
		BrAPITrait createdTrait = createdTraitList.getBody().getResult().getData().get(0);
		ApiResponse<BrAPITraitSingleResponse> optionalTrait = this.traitsAPI.traitsTraitDbIdGet(createdTrait.getTraitDbId());

		assertNotNull(optionalTrait, "An empty optional was returned");
		BrAPITrait trait = optionalTrait.getBody().getResult();
		assertEquals(true, trait.getTraitDbId() != null, "TraitDbId was not parsed properly.");
		assertEquals(true, trait.getAlternativeAbbreviations() != null, "Alternative Abbreviations was not parsed properly.");
		assertEquals(true, trait.getAlternativeAbbreviations().size() > 0, "Alternative abbreviations was not parsed properly.");
		assertEquals(true, trait.getAttribute() != null, "Attribute was not parsed properly.");
		assertEquals(true, trait.getAdditionalInfo() != null, "Additional Info was not parsed properly.");
		assertEquals(true, trait.getEntity() != null, "Entity was not parsed properly.");
		assertEquals(true, trait.getExternalReferences() != null, "External References were not parsed properly.");
		assertEquals(true, trait.getExternalReferences().get(0).getReferenceID() != null, "External Reference was not parsed properly.");
		assertEquals(true, trait.getMainAbbreviation() != null, "Main abbreviations were not parsed properly.");
		assertEquals(true, trait.getOntologyReference() != null, "Ontology reference was not parsed properly.");
		assertEquals(true, trait.getStatus() != null, "Status was not parsed properly.");
		assertEquals(true, trait.getSynonyms() != null, "Synonyms were not parsed properly.");
		assertEquals(true, trait.getSynonyms().size() > 0, "Synonyms were not parsed properly.");
		assertEquals(true, trait.getTraitClass() != null, "Trait class was not parsed properly.");
		assertEquals(true, trait.getTraitDescription() != null, "Trait description was not parsed properly.");
		assertEquals(true, trait.getTraitName() != null, "Trait name was not parsed properly.");
	}

	@Test
	@SneakyThrows
	public void getTraitByIdMissingID() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPITraitSingleResponse> traits = this.traitsAPI.traitsTraitDbIdGet(null);
		});
	}

	@Test
	@SneakyThrows
	public void createTraitsMultipleSuccess() {
		BrAPITrait brApiTrait = new BrAPITrait().traitName("new test trait1");
		BrAPITrait brApiTrait2 = new BrAPITrait().traitName("new test trait2");
		List<BrAPITrait> traits = Arrays.asList(brApiTrait, brApiTrait2);

		ApiResponse<BrAPITraitListResponse> createdTraitsRes = this.traitsAPI.traitsPost(traits);

		List<BrAPITrait> createdTraits = createdTraitsRes.getBody().getResult().getData();
		assertEquals(true, createdTraits.size() == 2);
		assertEquals(true, createdTraits.get(0).getTraitDbId() != null, "Program Id was not parsed properly");

		assertEquals("new test trait1", createdTraits.get(0).getTraitName(), "Program Name was not parsed properly");
		assertEquals("new test trait2", createdTraits.get(1).getTraitName(), "Program Name was not parsed properly");
	}

	@Test
	@SneakyThrows
	@Order(4)
	public void updateTraitSuccess() {
		BrAPITrait trait = this.createdTrait;
		trait.setTraitName("updated_name");
		trait.setTraitDescription("recording stuff");
		trait.setOntologyReference(null);

		// Check that it is a success and all data matches
		ApiResponse<BrAPITraitSingleResponse> updatedTraitResult = this.traitsAPI
				.traitsTraitDbIdPut(this.createdTrait.getTraitDbId(), trait);

		assertNotNull(updatedTraitResult, "Program was not returned");
		BrAPITrait updatedTrait = updatedTraitResult.getBody().getResult();
		assertEquals(trait.getTraitName(), updatedTrait.getTraitName(), "Program name was not parsed correctly");
		assertEquals(trait.getTraitDescription(), updatedTrait.getTraitDescription(),
				"Program objective was not parsed correctly");

	}

	@Test
	@SneakyThrows
	public void updateTraitMissingId() {
		// Check that it throws an APIException
		BrAPITrait brApiTrait = new BrAPITrait().traitName("new test trait");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPITraitSingleResponse> updatedTraitResult = this.traitsAPI.traitsTraitDbIdPut(null,
					brApiTrait);
		});
	}
}
