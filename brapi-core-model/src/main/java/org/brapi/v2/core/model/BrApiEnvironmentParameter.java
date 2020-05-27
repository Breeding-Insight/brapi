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
  private String description;

  private String parameterName;

  private String parameterPUI;

  private String unit;

  private String unitPUI;

  private String value;

  private String valuePUI;

}
