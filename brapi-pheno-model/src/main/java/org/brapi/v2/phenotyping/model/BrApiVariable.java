package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Variable
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiVariable {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("commonCropName")
  private String commonCropName;

  @JsonProperty("contextOfUse")
  @Valid
  private List<String> contextOfUse;

  @JsonProperty("defaultValue")
  private String defaultValue;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("growthStage")
  private String growthStage;

  @JsonProperty("institution")
  private String institution;

  @JsonProperty("language")
  private String language;

  @JsonProperty("method")
  private BrApiMethod method;

  @JsonProperty("ontologyReference")
  private BrApiOntologyReference ontologyReference;

  @JsonProperty("scale")
  private BrApiScale scale;

  @JsonProperty("scientist")
  private String scientist;

  @JsonProperty("status")
  private String status;

  @JsonProperty("submissionTimestamp")
  private OffsetDateTime submissionTimestamp;

  @JsonProperty("synonyms")
  @Valid
  private List<String> synonyms;

  @JsonProperty("trait")
  private BrApiTrait trait;

}
