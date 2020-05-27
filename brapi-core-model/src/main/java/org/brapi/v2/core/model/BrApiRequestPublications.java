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
  private String publicationPUI;

  private String publicationReference;
}
