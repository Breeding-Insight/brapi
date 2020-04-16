package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Person
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiPerson {
  @JsonProperty("personDbId")
  private String personDbId;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo;

  @JsonProperty("description")
  private String description;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("externalReferences")
  private List<BrApiExternalReference> externalReferences;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("mailingAddress")
  private String mailingAddress;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("userID")
  private String userID;

}
