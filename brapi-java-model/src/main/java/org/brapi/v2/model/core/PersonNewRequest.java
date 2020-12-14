package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.brapi.v2.model.ExternalReferences;

/**
 * PersonNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class PersonNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("externalReferences")
  private ExternalReferences externalReferences = null;

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

  public PersonNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public PersonNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public PersonNewRequest description(String description) {
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

  public PersonNewRequest emailAddress(String emailAddress) {
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

  public PersonNewRequest externalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public ExternalReferences getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(ExternalReferences externalReferences) {
    this.externalReferences = externalReferences;
  }

  public PersonNewRequest firstName(String firstName) {
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

  public PersonNewRequest lastName(String lastName) {
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

  public PersonNewRequest mailingAddress(String mailingAddress) {
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

  public PersonNewRequest middleName(String middleName) {
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

  public PersonNewRequest phoneNumber(String phoneNumber) {
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

  public PersonNewRequest userID(String userID) {
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
    PersonNewRequest personNewRequest = (PersonNewRequest) o;
    return Objects.equals(this.additionalInfo, personNewRequest.additionalInfo) &&
        Objects.equals(this.description, personNewRequest.description) &&
        Objects.equals(this.emailAddress, personNewRequest.emailAddress) &&
        Objects.equals(this.externalReferences, personNewRequest.externalReferences) &&
        Objects.equals(this.firstName, personNewRequest.firstName) &&
        Objects.equals(this.lastName, personNewRequest.lastName) &&
        Objects.equals(this.mailingAddress, personNewRequest.mailingAddress) &&
        Objects.equals(this.middleName, personNewRequest.middleName) &&
        Objects.equals(this.phoneNumber, personNewRequest.phoneNumber) &&
        Objects.equals(this.userID, personNewRequest.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, description, emailAddress, externalReferences, firstName, lastName, mailingAddress, middleName, phoneNumber, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNewRequest {\n");
    
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
