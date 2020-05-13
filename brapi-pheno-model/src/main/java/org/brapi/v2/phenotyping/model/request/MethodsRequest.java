package org.brapi.v2.phenotyping.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class MethodsRequest extends ObservationVariablesRequest {

    private String methodDbId;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (methodDbId != null) params.put("methodDbId", methodDbId);

        return params;

    }
}
