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
public class BrApiExternalReference {
  private String referenceID;

  private String referenceSource;

}
