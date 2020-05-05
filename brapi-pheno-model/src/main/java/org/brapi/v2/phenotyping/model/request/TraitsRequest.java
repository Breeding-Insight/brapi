package org.brapi.v2.phenotyping.model.request;

import lombok.*;
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
public class TraitsRequest extends BaseRequest {

    private String traitDbId;
    private String observationVariableDbId;
    private String externalReferenceID;
    private String externalReferenceSource;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (traitDbId != null) params.put("traitDbId", traitDbId);
        if (observationVariableDbId != null) params.put("observationVariableDbId", observationVariableDbId);
        if (externalReferenceID != null) params.put("externalReferenceID", externalReferenceID);
        if (externalReferenceSource != null) params.put("externalReferenceSource", externalReferenceSource);

        return params;

    }
}
