package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;

import javax.validation.Valid;
import java.util.List;

/**
 * TraitBaseClass
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiTrait {
  @JsonProperty("traitDbId")
  private String traitDbId;

  @JsonProperty("alternativeAbbreviations")
  @Valid
  private List<String> alternativeAbbreviations;

  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("entity")
  private String entity;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("mainAbbreviation")
  private String mainAbbreviation;

  @JsonProperty("ontologyReference")
  private BrApiOntologyReference ontologyReference;

  @JsonProperty("status")
  private String status;

  @JsonProperty("synonyms")
  @Valid
  private List<String> synonyms;

  @JsonProperty("traitClass")
  private String traitClass;

  @JsonProperty("traitDescription")
  private String traitDescription;

  @JsonProperty("traitName")
  private String traitName;

}
