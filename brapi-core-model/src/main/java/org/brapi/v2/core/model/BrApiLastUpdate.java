package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;

/**
 * The date and time when this study was last modified
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiLastUpdate {
  private OffsetDateTime timestamp;

  private String version;

}
