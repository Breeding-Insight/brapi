package org.brapi.v2.phenotyping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.BrApiOntologyReference;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * TraitBaseClass
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiTrait {
  private String traitDbId;

  @Valid
  private List<String> alternativeAbbreviations;

  private String attribute;

  @Valid
  private Map<String, String> additionalInfo;

  private String entity;

  private List<BrApiExternalReference> externalReferences;

  private String mainAbbreviation;

  private BrApiOntologyReference ontologyReference;

  private String status;

  @Valid
  private List<String> synonyms;

  private String traitClass;

  private String traitDescription;

  private String traitName;

}
