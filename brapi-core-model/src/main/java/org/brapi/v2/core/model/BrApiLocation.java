package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Location
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiLocation {
  private String locationDbId;

  private String abbreviation;

  @Valid
  private Map<String, String> additionalInfo;

  private String coordinateDescription;

  private String coordinateUncertainty;

  private BrApiGeoJSON coordinates;

  private String countryCode;

  private String countryName;

  private String documentationURL;

  private String environmentType;

  private String exposure;

  private List<BrApiExternalReference> externalReferences;

  private String instituteAddress;

  private String instituteName;

  private String locationName;

  private String locationType;

  private String siteStatus;

  private String slope;

  private String topography;

}
