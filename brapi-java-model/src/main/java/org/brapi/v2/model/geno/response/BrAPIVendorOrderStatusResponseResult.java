package org.brapi.v2.model.geno.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonValue;
import org.brapi.v2.model.BrAPIEnum;


/**
 * VendorOrderStatusResponseResult
 */


public class BrAPIVendorOrderStatusResponseResult   {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum implements BrAPIEnum {
    REGISTERED("registered"),
    
    RECEIVED("received"),
    
    INPROGRESS("inProgress"),
    
    COMPLETED("completed"),
    
    REJECTED("rejected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equalsIgnoreCase(text)) {
          return b;
        }
      }
      return null;
    }

    @Override
    public String getBrapiValue() {
      return value;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public BrAPIVendorOrderStatusResponseResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorOrderStatusResponseResult vendorOrderStatusResponseResult = (BrAPIVendorOrderStatusResponseResult) o;
    return Objects.equals(this.status, vendorOrderStatusResponseResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorOrderStatusResponseResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
