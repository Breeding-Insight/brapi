package org.brapi.v2.model.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIExternalReference;

import javax.validation.Valid;


/**
 * Person
 */


public class BrAPIPerson {
  @JsonProperty("personDbId")
  private String personDbId = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("mailingAddress")
  private String mailingAddress = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("userID")
  private String userID = null;

  public BrAPIPerson personDbId(String personDbId) {
    this.personDbId = personDbId;
    return this;
  }

  /**
   * Unique ID for a person
   * @return personDbId
   **/



  public String getPersonDbId() {
    return personDbId;
  }

  public void setPersonDbId(String personDbId) {
    this.personDbId = personDbId;
  }

  public BrAPIPerson additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIPerson putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
   **/


  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIPerson description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of this person
   * @return description
   **/


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrAPIPerson emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * email address for this person
   * @return emailAddress
   **/


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public BrAPIPerson externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/


  @Valid
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPIPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Persons first name
   * @return firstName
   **/


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BrAPIPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Persons last name
   * @return lastName
   **/


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BrAPIPerson mailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

  /**
   * physical address of this person
   * @return mailingAddress
   **/


  public String getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
  }

  public BrAPIPerson middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Persons middle name
   * @return middleName
   **/


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public BrAPIPerson phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * phone number of this person
   * @return phoneNumber
   **/


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public BrAPIPerson userID(String userID) {
    this.userID = userID;
    return this;
  }

  /**
   * A systems user ID associated with this person. Different from personDbId because you could have a person who is not a user of the system.
   * @return userID
   **/


  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIPerson person = (BrAPIPerson) o;
    return Objects.equals(this.personDbId, person.personDbId)
            && Objects.equals(this.additionalInfo, person.additionalInfo) &&
            Objects.equals(this.description, person.description) &&
            Objects.equals(this.emailAddress, person.emailAddress) &&
            Objects.equals(this.externalReferences, person.externalReferences) &&
            Objects.equals(this.firstName, person.firstName) &&
            Objects.equals(this.lastName, person.lastName) &&
            Objects.equals(this.mailingAddress, person.mailingAddress) &&
            Objects.equals(this.middleName, person.middleName) &&
            Objects.equals(this.phoneNumber, person.phoneNumber) &&
            Objects.equals(this.userID, person.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personDbId, additionalInfo, description, emailAddress, externalReferences, firstName, lastName, mailingAddress, middleName, phoneNumber, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    personDbId: ").append(toIndentedString(personDbId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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
