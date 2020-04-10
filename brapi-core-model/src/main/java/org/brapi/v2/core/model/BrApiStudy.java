package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
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
  @JsonProperty("studyDbId")
  private String studyDbId;

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

  @JsonProperty("culturalPractices")
  private String culturalPractices;

  @JsonProperty("dataLinks")
  @Valid
  private List<BrApiDataLink> dataLinks;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("endDate")
  private OffsetDateTime endDate;

  @JsonProperty("environmentParameters")
  @Valid
  private List<BrApiEnvironmentParameter> environmentParameters;

  @JsonProperty("experimentalDesign")
  private BrApiExperimentalDesign experimentalDesign;

  @JsonProperty("externalReferences")
  private BrApiExternalReferences externalReferences;

  @JsonProperty("growthFacility")
  private BrApiGrowthFacility growthFacility;

  @JsonProperty("lastUpdate")
  private BrApiLastUpdate lastUpdate;

  @JsonProperty("license")
  private String license;

  @JsonProperty("locationDbId")
  private String locationDbId;

  @JsonProperty("locationName")
  private String locationName;

  @JsonProperty("observationUnitsDescription")
  private String observationUnitsDescription;

  @JsonProperty("seasons")
  @Valid
  private List<String> seasons;

  @JsonProperty("startDate")
  private OffsetDateTime startDate;

  @JsonProperty("studyDescription")
  private String studyDescription;

  @JsonProperty("studyName")
  private String studyName;

  @JsonProperty("studyPUI")
  private String studyPUI;

  @JsonProperty("studyType")
  private String studyType;

  @JsonProperty("trialDbId")
  private String trialDbId;

  @JsonProperty("trialName")
  private String trialName;

}
