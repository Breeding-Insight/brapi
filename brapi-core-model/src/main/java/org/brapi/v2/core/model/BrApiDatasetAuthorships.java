package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * TrialNewRequestDatasetAuthorships
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiDatasetAuthorships {
  @JsonProperty("datasetPUI")
  private String datasetPUI;

  @JsonProperty("license")
  private String license;

  @JsonProperty("publicReleaseDate")
  private LocalDate publicReleaseDate;

  @JsonProperty("submissionDate")
  private LocalDate submissionDate;

}
