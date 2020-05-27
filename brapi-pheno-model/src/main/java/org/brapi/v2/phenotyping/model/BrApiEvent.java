package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Event
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiEvent {
  @Valid
  private Map<String, String> additionalInfo;

  @Valid
  private List<OffsetDateTime> date;

  private String eventDbId;

  private String eventDescription;

  @Valid
  private List<BrApiEventParameters> eventParameters;

  private String eventType;

  private String eventTypeDbId;

  @Valid
  private List<String> observationUnitDbIds;

  private String studyDbId;

}