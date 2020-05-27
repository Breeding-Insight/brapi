package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Study
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiStudy {
  private String studyDbId;

  private Boolean active;

  @Valid
  private Map<String, String> additionalInfo;

  private String commonCropName;

  @Valid
  private List<BrApiContact> contacts;

  private String culturalPractices;

  @Valid
  private List<BrApiDataLink> dataLinks;

  private String documentationURL;

  private OffsetDateTime endDate;

  @Valid
  private List<BrApiEnvironmentParameter> environmentParameters;

  private BrApiExperimentalDesign experimentalDesign;

  private List<BrApiExternalReference> externalReferences;

  private BrApiGrowthFacility growthFacility;

  private BrApiLastUpdate lastUpdate;

  private String license;

  private String locationDbId;

  private String locationName;

  private String observationUnitsDescription;

  @Valid
  private List<String> seasons;

  private OffsetDateTime startDate;

  private String studyDescription;

  private String studyName;

  private String studyPUI;

  private String studyType;

  private String trialDbId;

  private String trialName;

}
