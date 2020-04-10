package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ExternalReferencesInner
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiExternalReferencesInner {
  @JsonProperty("referenceID")
  private Object referenceID;

  @JsonProperty("referenceSource")
  private String referenceSource;

}
