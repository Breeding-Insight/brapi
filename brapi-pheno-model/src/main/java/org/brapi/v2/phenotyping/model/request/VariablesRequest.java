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
public class VariablesRequest extends ObservationVariablesRequest {
    private String traitClass;
    private String studyDbId;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (traitClass != null) params.put("traitClass", traitClass);
        if (studyDbId != null) params.put("studyDbId", studyDbId);

        return params;
    }
}
