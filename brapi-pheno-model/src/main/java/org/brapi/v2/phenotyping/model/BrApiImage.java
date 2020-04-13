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
  @JsonProperty("imageDbId")
  private String imageDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("copyright")
  private String copyright;

  @JsonProperty("description")
  private String description;

  @JsonProperty("descriptiveOntologyTerms")
  @Valid
  private List<String> descriptiveOntologyTerms;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("imageFileName")
  private String imageFileName;

  @JsonProperty("imageFileSize")
  private Integer imageFileSize;

  @JsonProperty("imageHeight")
  private Integer imageHeight;

  @JsonProperty("imageLocation")
  private BrApiGeoJSON imageLocation;

  @JsonProperty("imageName")
  private String imageName;

  @JsonProperty("imageTimeStamp")
  private OffsetDateTime imageTimeStamp;

  @JsonProperty("imageURL")
  private String imageURL;

  @JsonProperty("imageWidth")
  private Integer imageWidth;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("observationDbIds")
  @Valid
  private List<String> observationDbIds;

  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId;

}
