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
  private String personDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private String description;

  private String emailAddress;

  private List<BrApiExternalReference> externalReferences;

  private String firstName;

  private String lastName;

  private String mailingAddress;

  private String middleName;

  private String phoneNumber;

  private String userID;

}
