package org.brapi.client.v2.modules.phenotype;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.v2.core.model.response.DataResponse;
import org.brapi.v2.phenotyping.model.BrApiScale;
import org.brapi.v2.phenotyping.model.request.ScalesRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScalesAPI extends BrAPIEndpoint {

    public ScalesAPI(BrAPIClient brAPIClient) {
        super(brAPIClient);
    }

    public List<BrApiScale> createScales(List<BrApiScale> brApiScales) throws HttpException, APIException {

        if (brApiScales == null) {
            throw new APIException("BrAPI scales cannot be null");
        }

        if (brApiScales.isEmpty()) {
            throw new APIException("BrAPI scales cannot be empty");
        }

        if (brApiScales.stream().anyMatch(scale -> scale.getScaleDbId() != null)) {
            throw new APIException("BrAPI scale must not have an existing scaleDbId.");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getScalesPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .data(brApiScales)
                .method(HttpMethod.POST)
                .build();

        List<BrApiScale> createdScale = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiScale>>() {}.getType();
            DataResponse<BrApiScale> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return createdScale;
    }

    public Optional<BrApiScale> createScale(BrApiScale brApiScale) throws HttpException, APIException {

        if (brApiScale == null) {
            throw new APIException("BrAPI scale cannot be null");
        }

        List<BrApiScale> brApiScales = new ArrayList<>();
        brApiScales.add(brApiScale);
        List<BrApiScale> createdScales = createScales(brApiScales);

        if (createdScales.size() == 1){
            return Optional.of(createdScales.get(0));
        }
        else {
            return Optional.empty();
        }
    }

    public List<BrApiScale> getScales(ScalesRequest scalesRequest) throws HttpException, APIException {

        if (scalesRequest == null) {
            throw new IllegalArgumentException("Scales request cannot be null");
        }

        // Build our request
        String endpoint = BrAPIPhenotypeEndpoints_V2.getScalesPath();
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(scalesRequest.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiScale> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiScale>>() {
            }.getType();
            DataResponse<BrApiScale> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiScale> getScales() throws HttpException, APIException {
        return getScales(new ScalesRequest());
    }

}
