package org.brapi.v2.core.model.request;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class ProgramsRequest extends BaseRequest {

    private String commonCropName;
    private String programDbId;
    private String programName;
    private String abbreviation;
    private String externalReferenceID;
    private String externalReferenceSource;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        if (page != null) params.put("page", page.toString());
        if (pageSize != null) params.put("pageSize", pageSize.toString());
        if (commonCropName != null) params.put("commonCropName", commonCropName);
        if (programDbId != null) params.put("programDbId", programDbId);
        if (programName != null) params.put("programName", programName);
        if (abbreviation != null) params.put("abbreviation", abbreviation);
        if (externalReferenceID != null) params.put("externalReferenceID", externalReferenceID);
        if (externalReferenceSource != null) params.put("externalReferenceSource", externalReferenceSource);

        return params;

    }
}
