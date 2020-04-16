package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * EnvironmentParameter
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiEnvironmentParameter {
  @JsonProperty("description")
  private String description;

  @JsonProperty("parameterName")
  private String parameterName;

  @JsonProperty("parameterPUI")
  private String parameterPUI;

  @JsonProperty("unit")
  private String unit;

  @JsonProperty("unitPUI")
  private String unitPUI;

  @JsonProperty("value")
  private String value;

  @JsonProperty("valuePUI")
  private String valuePUI;

}
