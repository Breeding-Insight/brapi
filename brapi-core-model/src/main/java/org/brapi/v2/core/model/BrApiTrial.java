package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Trial
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiTrial {
  @JsonProperty("trialDbId")
  private String trialDbId;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("commonCropName")
  private String commonCropName;

  @JsonProperty("contacts")
  @Valid
  private List<BrApiContact> contacts;

  @JsonProperty("datasetAuthorships")
  @Valid
  private List<BrApiDatasetAuthorships> datasetAuthorships;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("programDbId")
  private String programDbId;

  @JsonProperty("programName")
  private String programName;

  @JsonProperty("publications")
  @Valid
  private List<BrApiRequestPublications> publications;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("trialDescription")
  private String trialDescription;

  @JsonProperty("trialName")
  private String trialName;

  @JsonProperty("trialPUI")
  private String trialPUI;

}
