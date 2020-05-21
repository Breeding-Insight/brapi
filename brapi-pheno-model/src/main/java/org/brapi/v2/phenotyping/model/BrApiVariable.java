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
@SuperBuilder
@NoArgsConstructor
public class BrApiVariable {
  @SerializedName("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @SerializedName("commonCropName")
  private String commonCropName;

  @SerializedName("contextOfUse")
  @Valid
  private List<String> contextOfUse;

  @SerializedName("defaultValue")
  private String defaultValue;

  @SerializedName("documentationURL")
  private String documentationURL;

  @SerializedName("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @SerializedName("growthStage")
  private String growthStage;

  @SerializedName("institution")
  private String institution;

  @SerializedName("language")
  private String language;

  @SerializedName("method")
  private BrApiMethod method;

  @SerializedName("ontologyReference")
  private BrApiOntologyReference ontologyReference;

  @SerializedName("scale")
  private BrApiScale scale;

  @SerializedName("scientist")
  private String scientist;

  @SerializedName("status")
  private String status;

  @SerializedName("submissionTimestamp")
  private OffsetDateTime submissionTimestamp;

  @SerializedName("synonyms")
  @Valid
  private List<String> synonyms;

  @SerializedName("trait")
  private BrApiTrait trait;

}
