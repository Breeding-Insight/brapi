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
  private String datasetPUI;

  private String license;

  private LocalDate publicReleaseDate;

  private LocalDate submissionDate;

}
