package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * Program
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiProgram {
  @JsonProperty("programDbId")
  private String programDbId;

  @JsonProperty("abbreviation")
  private String abbreviation;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("commonCropName")
  @NotNull
  private String commonCropName;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("externalReferences")
  @Valid
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("leadPersonDbId")
  private String leadPersonDbId;

  @JsonProperty("leadPersonName")
  private String leadPersonName;

  @JsonProperty("objective")
  private String objective;

  @JsonProperty("programName")
  @NotNull
  private String programName;

}
