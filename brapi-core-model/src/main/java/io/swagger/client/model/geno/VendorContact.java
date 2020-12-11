package io.swagger.client.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * VendorContact
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class VendorContact   {
  @JsonProperty("vendorAddress")
  private String vendorAddress = null;

  @JsonProperty("vendorCity")
  private String vendorCity = null;

  @JsonProperty("vendorContactName")
  private String vendorContactName = null;

  @JsonProperty("vendorCountry")
  private String vendorCountry = null;

  @JsonProperty("vendorDescription")
  private String vendorDescription = null;

  @JsonProperty("vendorEmail")
  private String vendorEmail = null;

  @JsonProperty("vendorName")
  private String vendorName = null;

  @JsonProperty("vendorPhone")
  private String vendorPhone = null;

  @JsonProperty("vendorURL")
  private String vendorURL = null;

  public VendorContact vendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
    return this;
  }

  /**
   * The street address of the vendor
   * @return vendorAddress
  **/
  
  
    public String getVendorAddress() {
    return vendorAddress;
  }

  public void setVendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
  }

  public VendorContact vendorCity(String vendorCity) {
    this.vendorCity = vendorCity;
    return this;
  }

  /**
   * The name of the city where the vendor is located
   * @return vendorCity
  **/
  
  
    public String getVendorCity() {
    return vendorCity;
  }

  public void setVendorCity(String vendorCity) {
    this.vendorCity = vendorCity;
  }

  public VendorContact vendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
    return this;
  }

  /**
   * The name or identifier of the primary vendor contact
   * @return vendorContactName
  **/
  
  
    public String getVendorContactName() {
    return vendorContactName;
  }

  public void setVendorContactName(String vendorContactName) {
    this.vendorContactName = vendorContactName;
  }

  public VendorContact vendorCountry(String vendorCountry) {
    this.vendorCountry = vendorCountry;
    return this;
  }

  /**
   * The name of the country where the vendor is located
   * @return vendorCountry
  **/
  
  
    public String getVendorCountry() {
    return vendorCountry;
  }

  public void setVendorCountry(String vendorCountry) {
    this.vendorCountry = vendorCountry;
  }

  public VendorContact vendorDescription(String vendorDescription) {
    this.vendorDescription = vendorDescription;
    return this;
  }

  /**
   * A description of the vendor
   * @return vendorDescription
  **/
  
  
    public String getVendorDescription() {
    return vendorDescription;
  }

  public void setVendorDescription(String vendorDescription) {
    this.vendorDescription = vendorDescription;
  }

  public VendorContact vendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
    return this;
  }

  /**
   * The primary email address used to contact the vendor
   * @return vendorEmail
  **/
  
  
    public String getVendorEmail() {
    return vendorEmail;
  }

  public void setVendorEmail(String vendorEmail) {
    this.vendorEmail = vendorEmail;
  }

  public VendorContact vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * The human readable name of the vendor
   * @return vendorName
  **/
  
      

    public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public VendorContact vendorPhone(String vendorPhone) {
    this.vendorPhone = vendorPhone;
    return this;
  }

  /**
   * The primary phone number used to contact the vendor
   * @return vendorPhone
  **/
  
  
    public String getVendorPhone() {
    return vendorPhone;
  }

  public void setVendorPhone(String vendorPhone) {
    this.vendorPhone = vendorPhone;
  }

  public VendorContact vendorURL(String vendorURL) {
    this.vendorURL = vendorURL;
    return this;
  }

  /**
   * The primary URL for the vendor
   * @return vendorURL
  **/
  
  
    public String getVendorURL() {
    return vendorURL;
  }

  public void setVendorURL(String vendorURL) {
    this.vendorURL = vendorURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorContact vendorContact = (VendorContact) o;
    return Objects.equals(this.vendorAddress, vendorContact.vendorAddress) &&
        Objects.equals(this.vendorCity, vendorContact.vendorCity) &&
        Objects.equals(this.vendorContactName, vendorContact.vendorContactName) &&
        Objects.equals(this.vendorCountry, vendorContact.vendorCountry) &&
        Objects.equals(this.vendorDescription, vendorContact.vendorDescription) &&
        Objects.equals(this.vendorEmail, vendorContact.vendorEmail) &&
        Objects.equals(this.vendorName, vendorContact.vendorName) &&
        Objects.equals(this.vendorPhone, vendorContact.vendorPhone) &&
        Objects.equals(this.vendorURL, vendorContact.vendorURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorAddress, vendorCity, vendorContactName, vendorCountry, vendorDescription, vendorEmail, vendorName, vendorPhone, vendorURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorContact {\n");
    
    sb.append("    vendorAddress: ").append(toIndentedString(vendorAddress)).append("\n");
    sb.append("    vendorCity: ").append(toIndentedString(vendorCity)).append("\n");
    sb.append("    vendorContactName: ").append(toIndentedString(vendorContactName)).append("\n");
    sb.append("    vendorCountry: ").append(toIndentedString(vendorCountry)).append("\n");
    sb.append("    vendorDescription: ").append(toIndentedString(vendorDescription)).append("\n");
    sb.append("    vendorEmail: ").append(toIndentedString(vendorEmail)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorPhone: ").append(toIndentedString(vendorPhone)).append("\n");
    sb.append("    vendorURL: ").append(toIndentedString(vendorURL)).append("\n");
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
