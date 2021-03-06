package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * Response to an order request
 */



public class BrAPIVendorOrderSubmission   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("shipmentForms")
  @Valid
  private List<BrAPIShipmentForm> shipmentForms = null;

  public BrAPIVendorOrderSubmission orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * A unique, alpha-numeric ID which identifies the order
   * @return orderId
  **/
  
      

    public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public BrAPIVendorOrderSubmission shipmentForms(List<BrAPIShipmentForm> shipmentForms) {
    this.shipmentForms = shipmentForms;
    return this;
  }

  public BrAPIVendorOrderSubmission addShipmentFormsItem(BrAPIShipmentForm shipmentFormsItem) {
    if (this.shipmentForms == null) {
      this.shipmentForms = new ArrayList<BrAPIShipmentForm>();
    }
    this.shipmentForms.add(shipmentFormsItem);
    return this;
  }

  /**
   * Array of paper forms which need to be printed and included with the physical shipment
   * @return shipmentForms
  **/
  
      @Valid
    public List<BrAPIShipmentForm> getShipmentForms() {
    return shipmentForms;
  }

  public void setShipmentForms(List<BrAPIShipmentForm> shipmentForms) {
    this.shipmentForms = shipmentForms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorOrderSubmission vendorOrderSubmission = (BrAPIVendorOrderSubmission) o;
    return Objects.equals(this.orderId, vendorOrderSubmission.orderId) &&
        Objects.equals(this.shipmentForms, vendorOrderSubmission.shipmentForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, shipmentForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorOrderSubmission {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    shipmentForms: ").append(toIndentedString(shipmentForms)).append("\n");
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
