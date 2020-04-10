package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Model202AcceptedSearchResponseResult
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiModel202AcceptedSearchResponseResult {
  @JsonProperty("searchResultsDbId")
  private String searchResultsDbId;
}
