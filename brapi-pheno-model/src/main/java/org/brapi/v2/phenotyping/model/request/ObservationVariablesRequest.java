package org.brapi.v2.phenotyping.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.request.BaseRequest;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class ObservationVariablesRequest extends BaseRequest {

    protected String observationVariableDbId;
    protected String externalReferenceID;
    protected String externalReferenceSource;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (observationVariableDbId != null) params.put("observationVariableDbId", observationVariableDbId);
        if (externalReferenceID != null) params.put("externalReferenceID", externalReferenceID);
        if (externalReferenceSource != null) params.put("externalReferenceSource", externalReferenceSource);

        return params;

    }

}
