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
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("date")
  @Valid
  private List<OffsetDateTime> date;

  @JsonProperty("eventDbId")
  private String eventDbId;

  @JsonProperty("eventDescription")
  private String eventDescription;

  @JsonProperty("eventParameters")
  @Valid
  private List<BrApiEventParameters> eventParameters;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("eventTypeDbId")
  private String eventTypeDbId;

  @JsonProperty("observationUnitDbIds")
  @Valid
  private List<String> observationUnitDbIds;

  @JsonProperty("studyDbId")
  private String studyDbId;

}
