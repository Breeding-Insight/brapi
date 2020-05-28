package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
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
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class BrApiVariable {
  private String observationVariableDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private String commonCropName;

  @Valid
  private List<String> contextOfUse;

  private String defaultValue;

  private String documentationURL;

  private List<BrApiExternalReference> externalReferences;

  private String growthStage;

  private String institution;

  private String language;

  private BrApiMethod method;

  private BrApiOntologyReference ontologyReference;

  private BrApiScale scale;

  private String scientist;

  private String status;

  private OffsetDateTime submissionTimestamp;

  @Valid
  private List<String> synonyms;

  private BrApiTrait trait;

  private String observationVariableName;

}
