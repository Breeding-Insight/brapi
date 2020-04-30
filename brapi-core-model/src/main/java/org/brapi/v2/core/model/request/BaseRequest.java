package org.brapi.v2.core.model.request;


import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseRequest {

    protected Integer page;
    protected Integer pageSize;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        if (page != null) params.put("page", page.toString());
        if (pageSize != null) params.put("pageSize", pageSize.toString());

        return params;
    }

}
