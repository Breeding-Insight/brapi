package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

/**
 * VendorSpecification
 */


public class BrAPIVendorSpecification   {
  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("services")
  @Valid
  private List<BrAPIVendorSpecificationService> services = null;

  @JsonProperty("vendorContact")
  private BrAPIVendorContact vendorContact = null;

  private final transient Gson gson = new Gson();

  public BrAPIVendorSpecification additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIVendorSpecification putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new JsonObject();
    }
    JsonElement newElement = gson.toJsonTree(additionalInfoItem);
    this.additionalInfo.add(key, newElement);
    return this;
  }

  /**
   * Additional arbitrary information specific to a particular Vendor. Look for the Vendors specific API documentation for more details
   * @return additionalInfo
  **/
  
  
    public JsonObject getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIVendorSpecification services(List<BrAPIVendorSpecificationService> services) {
    this.services = services;
    return this;
  }

  public BrAPIVendorSpecification addServicesItem(BrAPIVendorSpecificationService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<BrAPIVendorSpecificationService>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * List of platform specifications available at the vendor
   * @return services
  **/
  
      @Valid
    public List<BrAPIVendorSpecificationService> getServices() {
    return services;
  }

  public void setServices(List<BrAPIVendorSpecificationService> services) {
    this.services = services;
  }

  public BrAPIVendorSpecification vendorContact(BrAPIVendorContact vendorContact) {
    this.vendorContact = vendorContact;
    return this;
  }

  /**
   * Get vendorContact
   * @return vendorContact
  **/
  
  
    @Valid
    public BrAPIVendorContact getVendorContact() {
    return vendorContact;
  }

  public void setVendorContact(BrAPIVendorContact vendorContact) {
    this.vendorContact = vendorContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorSpecification vendorSpecification = (BrAPIVendorSpecification) o;
    return Objects.equals(this.additionalInfo, vendorSpecification.additionalInfo) &&
        Objects.equals(this.services, vendorSpecification.services) &&
        Objects.equals(this.vendorContact, vendorSpecification.vendorContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, services, vendorContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecification {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    vendorContact: ").append(toIndentedString(vendorContact)).append("\n");
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
