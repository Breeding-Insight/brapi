package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * Season
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiSeason {
  private String season;

  @NotNull
  private String seasonDbId;

  private Integer year;

}
