package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * The experimental and statistical design full description plus a category PUI taken from crop research ontology or agronomy ontology
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiExperimentalDesign {
  private String PUI;

  private String description;

}
