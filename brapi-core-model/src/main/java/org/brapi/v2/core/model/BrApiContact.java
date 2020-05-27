package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

/**
 * Contact
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiContact {

  /**
   * The ID which uniquely identifies this contact  MIAPPE V1.1 (DM-33) Person ID - An identifier for the data submitter. If that submitter is an individual, ORCID identifiers are recommended.
   **/
  @NotNull
  private String contactDbId;

  /**
   * The contacts email address  MIAPPE V1.1 (DM-32) Person email - The electronic mail address of the person.
   **/
  private String email;

  /**
   * The name of the institution which this contact is part of  MIAPPE V1.1 (DM-35) Person affiliation - The institution the person belongs to
   **/
  private String instituteName;

  /**
   * The full name of this contact person  MIAPPE V1.1 (DM-31) Person name - The name of the person (either full name or as used in scientific publications)
   **/
  private String name;

  /**
   * The Open Researcher and Contributor ID for this contact person (orcid.org)  MIAPPE V1.1 (DM-33) Person ID - An identifier for the data submitter. If that submitter is an individual, ORCID identifiers are recommended.
   **/
  private String orcid;

  /**
   * The type of person this contact represents (ex: Coordinator, Scientist, PI, etc.)  MIAPPE V1.1 (DM-34) Person role - Type of contribution of the person to the investigation
   **/
  private String type;
}
