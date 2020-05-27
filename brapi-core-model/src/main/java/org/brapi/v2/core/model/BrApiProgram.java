package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
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
  private String programDbId;

  private String abbreviation;

  @Valid
  private Map<String, String> additionalInfo;

  @NotNull
  private String commonCropName;

  private String documentationURL;

  @Valid
  private List<BrApiExternalReference> externalReferences;

  private String leadPersonDbId;

  private String leadPersonName;

  private String objective;

  @NotNull
  private String programName;

}
