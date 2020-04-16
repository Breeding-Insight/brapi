package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * TrialNewRequestPublications
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiRequestPublications {
  @JsonProperty("publicationPUI")
  private String publicationPUI;

  @JsonProperty("publicationReference")
  private String publicationReference;
}
