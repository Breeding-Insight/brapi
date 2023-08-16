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

package org.brapi.client.v2.modules.germplasm;

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.BrAPIClientTest;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.PedigreeQueryParams;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.germ.BrAPIPedigreeNode;
import org.brapi.v2.model.germ.response.BrAPIPedigreeListResponse;
import org.junit.jupiter.api.*;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PedigreeAPITests extends BrAPIClientTest {

    private PedigreeApi pedigreeAPI = new PedigreeApi(this.apiClient);
    
    //From src/test/resources/sql/germplasm.sql
    private LinkedList<String> germplasmDbIds = new LinkedList<String>(Arrays.asList("pedigreeTest1", "pedigreeTest2", "pedigreeTest3", "pedigreeTest4"));
    
    @Test
    public void getPedigreeSuccess() throws Exception {

        ApiResponse<BrAPIPedigreeListResponse> pedigree = this.pedigreeAPI.pedigreeGet(new PedigreeQueryParams());

        assertEquals(false, pedigree.getBody().getResult().getData().isEmpty(), "List of pedigree was empty");
    }

    @Test
    public void getsPedigreePageFilter() throws Exception {
        PedigreeQueryParams baseRequest = PedigreeQueryParams.builder()
                .page(0)
                .pageSize(1)
                .build();

        ApiResponse<BrAPIPedigreeListResponse> pedigree = this.pedigreeAPI.pedigreeGet(baseRequest);

        assertEquals(true, pedigree.getBody().getResult().getData().size() == 1, "More than one pedigree was returned");
    }

    @Test
    public void createPedigreeSuccess() throws Exception {

        Map<String, String> additionalInfo = new HashMap<String, String>();
        additionalInfo.put("test_key", "test_value");
        List<BrAPIExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(new BrAPIExternalReference()
                .referenceID(UUID.randomUUID().toString())
                .referenceSource("http://brapi.org")
        );
        BrAPIPedigreeNode pedigreeNode = new BrAPIPedigreeNode()
                .additionalInfo(additionalInfo)
                .defaultDisplayName("Resistant Tamatillo")
                .externalReferences(externalReferences)
                .germplasmDbId(germplasmDbIds.pop())
                .germplasmPUI("0000000001")
                .pedigreeString("A000003/A000002");

        ApiResponse<BrAPIPedigreeListResponse> createdPedigree = this.pedigreeAPI.pedigreePost(Arrays.asList(pedigreeNode));

        assertNotNull(createdPedigree);
        BrAPIPedigreeNode pedigree = createdPedigree.getBody().getResult().getData().get(0);
        assertEquals(true, pedigree.getGermplasmDbId() != null, "Pedigree Id was not parsed properly");
        assertEquals(pedigreeNode.getPedigreeString(), pedigree.getPedigreeString(), "Pedigree Name was not parsed properly");
    }

    @Test
    public void createMultiplePedigreeSuccess() throws Exception {

        BrAPIPedigreeNode brApiPedigree1 = new BrAPIPedigreeNode().germplasmDbId(germplasmDbIds.pop());
        BrAPIPedigreeNode brApiPedigree2 = new BrAPIPedigreeNode().germplasmDbId(germplasmDbIds.pop());
        List<BrAPIPedigreeNode> brApiPedigreeList = new ArrayList<>();
        brApiPedigreeList.add(brApiPedigree1);
        brApiPedigreeList.add(brApiPedigree2);

        ApiResponse<BrAPIPedigreeListResponse> createdPedigreeRes = this.pedigreeAPI.pedigreePost(brApiPedigreeList);

        List<BrAPIPedigreeNode> createdPedigree = createdPedigreeRes.getBody().getResult().getData();
        assertEquals(true, createdPedigree.size() == 2);
        assertEquals(brApiPedigree1.getGermplasmDbId(), createdPedigree.get(0).getGermplasmDbId(), "Sent name and returned pedigree name does not match");
        assertEquals(brApiPedigree2.getGermplasmDbId(), createdPedigree.get(1).getGermplasmDbId(), "Sent name and returned pedigree name does not match");
    }

    @Test
    public void createPedigreeIdPresentFailure() throws Exception {
        BrAPIPedigreeNode brApiPedigree = new BrAPIPedigreeNode()
                .germplasmDbId("new test pedigree");

        ApiException exception = assertThrows(ApiException.class, () -> {
            this.pedigreeAPI.pedigreePost(Arrays.asList(brApiPedigree));
        });
        
        assertEquals(400, exception.getCode()); //germplasm id not found
    }

    @Test
    public void getPedigreeByExternalReferenceIDSuccess() throws Exception {
    	List<BrAPIExternalReference> externalReferences = new ArrayList<>();
        externalReferences.add(new BrAPIExternalReference()
                .referenceID(UUID.randomUUID().toString())
                .referenceSource("http://test")
        );
        BrAPIPedigreeNode brApiPedigree = new BrAPIPedigreeNode().externalReferences(externalReferences).germplasmDbId(germplasmDbIds.pop());
        this.pedigreeAPI.pedigreePost(Arrays.asList(brApiPedigree));
    	
        PedigreeQueryParams pedigreeRequest = PedigreeQueryParams.builder()
                .externalReferenceId(externalReferences.get(0).getReferenceID())
                .externalReferenceSource(externalReferences.get(0).getReferenceSource())
                .build();

        ApiResponse<BrAPIPedigreeListResponse> pedigree = this.pedigreeAPI.pedigreeGet(pedigreeRequest);

        assertEquals(true, pedigree.getBody().getResult().getData().size() == 1, "Wrong number of pedigree returned");
    }

    @Test
    public void getPedigreeByExternalReferenceIDDoesNotExist() throws Exception {
        PedigreeQueryParams pedigreeRequest = PedigreeQueryParams.builder()
                .externalReferenceId("will not exist")
                .build();

        ApiResponse<BrAPIPedigreeListResponse> pedigree = this.pedigreeAPI.pedigreeGet(pedigreeRequest);

        assertEquals(true, pedigree.getBody().getResult().getData().size() == 0, "List of pedigree was not empty");
    }

    @Test
    public void updatePedigreeSuccess() throws Exception {
        ApiResponse<BrAPIPedigreeListResponse> pedigreeList = this.pedigreeAPI.pedigreeGet(new PedigreeQueryParams());
    	BrAPIPedigreeNode pedigree = pedigreeList.getBody().getResult().getData().get(0);
        pedigree.setPedigreeString("updatePedString");

        Map<String, BrAPIPedigreeNode> req = new HashMap<String, BrAPIPedigreeNode>();
        req.put(pedigree.getGermplasmDbId(), pedigree);
        
        ApiResponse<BrAPIPedigreeListResponse> updatedPedigreeResult = this.pedigreeAPI.pedigreePut(req);

        assertNotNull(updatedPedigreeResult, "Pedigree was not returned");
        BrAPIPedigreeNode updatedPedigree = updatedPedigreeResult.getBody().getResult().getData().get(0);
        assertEquals(pedigree.getPedigreeString(), updatedPedigree.getPedigreeString(), "Wrong pedigree name");
    }

    @Test
    public void updatePedigreeBadId() throws Exception {
        // Check that it throws a 404
        BrAPIPedigreeNode pedigree = new BrAPIPedigreeNode();
        pedigree.setGermplasmDbId("i_do_not_exist");

        Map<String, BrAPIPedigreeNode> req = new HashMap<String, BrAPIPedigreeNode>();
        req.put(pedigree.getGermplasmDbId(), pedigree);
        
        ApiException exception = assertThrows(ApiException.class, () -> {
        	this.pedigreeAPI.pedigreePut(req);
        });
        assertEquals(400, exception.getCode());
    }
}
