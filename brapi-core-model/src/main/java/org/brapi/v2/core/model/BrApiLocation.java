package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.Map;

/**
 * Location
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiLocation {
  @JsonProperty("locationDbId")
  private String locationDbId;

  @JsonProperty("abbreviation")
  private String abbreviation;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("coordinateDescription")
  private String coordinateDescription;

  @JsonProperty("coordinateUncertainty")
  private String coordinateUncertainty;

  @JsonProperty("coordinates")
  private BrApiGeoJSON coordinates;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("countryName")
  private String countryName;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("environmentType")
  private String environmentType;

  @JsonProperty("exposure")
  private String exposure;

  @JsonProperty("externalReferences")
  private BrApiExternalReferences externalReferences;

  @JsonProperty("instituteAddress")
  private String instituteAddress;

  @JsonProperty("instituteName")
  private String instituteName;

  @JsonProperty("locationName")
  private String locationName;

  @JsonProperty("locationType")
  private String locationType;

  @JsonProperty("siteStatus")
  private String siteStatus;

  @JsonProperty("slope")
  private String slope;

  @JsonProperty("topography")
  private String topography;

}
