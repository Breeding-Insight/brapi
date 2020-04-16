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
  @JsonProperty("season")
  private String season;

  @JsonProperty("seasonDbId")
  @NotNull
  private String seasonDbId;

  @JsonProperty("year")
  private Integer year;

}
