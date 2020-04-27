package org.brapi.v2.phenotyping.model.request;

import lombok.*;
import lombok.experimental.Accessors;
import org.brapi.v2.core.model.request.BaseRequest;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
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

        if (page != null) params.put("page", page.toString());
        if (pageSize != null) params.put("pageSize", pageSize.toString());
        if (traitDbId != null) params.put("traitDbId", traitDbId);
        if (observationVariableDbId != null) params.put("observationVariableDbId", observationVariableDbId);
        if (externalReferenceID != null) params.put("externalReferenceID", externalReferenceID);
        if (externalReferenceSource != null) params.put("externalReferenceSource", externalReferenceSource);

        return params;

    }
}
