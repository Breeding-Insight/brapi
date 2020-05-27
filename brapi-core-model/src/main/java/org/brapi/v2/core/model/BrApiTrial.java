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
  private String trialDbId;

  private Boolean active;

  @Valid
  private Map<String, String> additionalInfo;

  private String commonCropName;

  @Valid
  private List<BrApiContact> contacts;

  @Valid
  private List<BrApiDatasetAuthorships> datasetAuthorships;

  private String documentationURL;

  private LocalDate endDate;

  private List<BrApiExternalReference> externalReferences;

  private String programDbId;

  private String programName;

  @Valid
  private List<BrApiRequestPublications> publications;

  private LocalDate startDate;

  private String trialDescription;

  private String trialName;

  private String trialPUI;

}
