package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiGeoJSON;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Image
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiImage {
  private String imageDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private String copyright;

  private String description;

  @Valid
  private List<String> descriptiveOntologyTerms;

  private List<BrApiExternalReference> externalReferences;

  private String imageFileName;

  private Integer imageFileSize;

  private Integer imageHeight;

  private BrApiGeoJSON imageLocation;

  private String imageName;

  private OffsetDateTime imageTimeStamp;

  private String imageURL;

  private Integer imageWidth;

  private String mimeType;

  @Valid
  private List<String> observationDbIds;

  private String observationUnitDbId;

}
