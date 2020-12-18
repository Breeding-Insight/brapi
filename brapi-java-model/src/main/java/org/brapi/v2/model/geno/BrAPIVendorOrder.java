package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;


/**
 * The details of a vendor order
 */



public class BrAPIVendorOrder   {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("numberOfSamples")
  private Integer numberOfSamples = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("requiredServiceInfo")
  @Valid
  private Map<String, String> requiredServiceInfo = null;

  @JsonProperty("serviceIds")
  @Valid
  private List<String> serviceIds = new ArrayList<String>();

  public BrAPIVendorOrder clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the correct billing and contact info.
   * @return clientId
  **/
  
      

    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public BrAPIVendorOrder numberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
    return this;
  }

  /**
   * The total number of samples contained in this request. Used for billing and basic validation of the request.
   * @return numberOfSamples
  **/
  
      

    public Integer getNumberOfSamples() {
    return numberOfSamples;
  }

  public void setNumberOfSamples(Integer numberOfSamples) {
    this.numberOfSamples = numberOfSamples;
  }

  public BrAPIVendorOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * The order id returned by the vendor when the order was successfully submitted.
   * @return orderId
  **/
  
      

    public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public BrAPIVendorOrder requiredServiceInfo(Map<String, String> requiredServiceInfo) {
    this.requiredServiceInfo = requiredServiceInfo;
    return this;
  }

  public BrAPIVendorOrder putRequiredServiceInfoItem(String key, String requiredServiceInfoItem) {
    if (this.requiredServiceInfo == null) {
      this.requiredServiceInfo = new HashMap<String, String>();
    }
    this.requiredServiceInfo.put(key, requiredServiceInfoItem);
    return this;
  }

  /**
   * A map of additional data required by the requested service. This includes things like Volume and Concentration.
   * @return requiredServiceInfo
  **/
  
  
    public Map<String, String> getRequiredServiceInfo() {
    return requiredServiceInfo;
  }

  public void setRequiredServiceInfo(Map<String, String> requiredServiceInfo) {
    this.requiredServiceInfo = requiredServiceInfo;
  }

  public BrAPIVendorOrder serviceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
    return this;
  }

  public BrAPIVendorOrder addServiceIdsItem(String serviceIdsItem) {
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

  /**
   * A list of unique, alpha-numeric ID which identify the requested services to be applied to this order.  A Vendor Service defines what platform, technology, and markers will be used.  A list of available service IDs can be retrieved from the Vendor Specs.
   * @return serviceIds
  **/
  
      

    public List<String> getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorOrder vendorOrder = (BrAPIVendorOrder) o;
    return Objects.equals(this.clientId, vendorOrder.clientId) &&
        Objects.equals(this.numberOfSamples, vendorOrder.numberOfSamples) &&
        Objects.equals(this.orderId, vendorOrder.orderId) &&
        Objects.equals(this.requiredServiceInfo, vendorOrder.requiredServiceInfo) &&
        Objects.equals(this.serviceIds, vendorOrder.serviceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, numberOfSamples, orderId, requiredServiceInfo, serviceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorOrder {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    numberOfSamples: ").append(toIndentedString(numberOfSamples)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    requiredServiceInfo: ").append(toIndentedString(requiredServiceInfo)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
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
