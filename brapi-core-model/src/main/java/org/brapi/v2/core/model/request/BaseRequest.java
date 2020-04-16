package org.brapi.v2.core.model.request;


import java.util.HashMap;
import java.util.Map;

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
