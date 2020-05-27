package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Short description of the facility in which the study was carried out.
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGrowthFacility {
  private String PUI;

  private String description;

}
