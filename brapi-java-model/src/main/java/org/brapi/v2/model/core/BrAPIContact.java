package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * Contact
 */


public class BrAPIContact   {
  @JsonProperty("contactDbId")
  private String contactDbId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("instituteName")
  private String instituteName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orcid")
  private String orcid = null;

  @JsonProperty("type")
  private String type = null;

  public BrAPIContact contactDbId(String contactDbId) {
    this.contactDbId = contactDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies this contact  MIAPPE V1.1 (DM-33) Person ID - An identifier for the data submitter. If that submitter is an individual, ORCID identifiers are recommended.
   * @return contactDbId
  **/
  
      

    public String getContactDbId() {
    return contactDbId;
  }

  public void setContactDbId(String contactDbId) {
    this.contactDbId = contactDbId;
  }

  public BrAPIContact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The contacts email address  MIAPPE V1.1 (DM-32) Person email - The electronic mail address of the person.
   * @return email
  **/
  
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BrAPIContact instituteName(String instituteName) {
    this.instituteName = instituteName;
    return this;
  }

  /**
   * The name of the institution which this contact is part of  MIAPPE V1.1 (DM-35) Person affiliation - The institution the person belongs to
   * @return instituteName
  **/
  
  
    public String getInstituteName() {
    return instituteName;
  }

  public void setInstituteName(String instituteName) {
    this.instituteName = instituteName;
  }

  public BrAPIContact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of this contact person  MIAPPE V1.1 (DM-31) Person name - The name of the person (either full name or as used in scientific publications)
   * @return name
  **/
  
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrAPIContact orcid(String orcid) {
    this.orcid = orcid;
    return this;
  }

  /**
   * The Open Researcher and Contributor ID for this contact person (orcid.org)  MIAPPE V1.1 (DM-33) Person ID - An identifier for the data submitter. If that submitter is an individual, ORCID identifiers are recommended.
   * @return orcid
  **/
  
  
    public String getOrcid() {
    return orcid;
  }

  public void setOrcid(String orcid) {
    this.orcid = orcid;
  }

  public BrAPIContact type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of person this contact represents (ex: Coordinator, Scientist, PI, etc.)  MIAPPE V1.1 (DM-34) Person role - Type of contribution of the person to the investigation
   * @return type
  **/
  
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIContact contact = (BrAPIContact) o;
    return Objects.equals(this.contactDbId, contact.contactDbId) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.instituteName, contact.instituteName) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.orcid, contact.orcid) &&
        Objects.equals(this.type, contact.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactDbId, email, instituteName, name, orcid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactDbId: ").append(toIndentedString(contactDbId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    instituteName: ").append(toIndentedString(instituteName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orcid: ").append(toIndentedString(orcid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
