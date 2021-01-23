package org.brapi.v2.model.geno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * VendorSpecificationService
 */


public class BrAPIVendorSpecificationService   {
  @JsonProperty("serviceDescription")
  private String serviceDescription = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("servicePlatformMarkerType")
  private BrAPIVendorServicePlatformMarkerTypeEnum servicePlatformMarkerType = null;

  @JsonProperty("servicePlatformName")
  private String servicePlatformName = null;

  @JsonProperty("specificRequirements")
  @Valid
  private List<BrAPIVendorSpecificationServiceSpecificRequirements> specificRequirements = null;

  public BrAPIVendorSpecificationService serviceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

  /**
   * Description of the vendor platform
   * @return serviceDescription
  **/
  
  
    public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public BrAPIVendorSpecificationService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Unique identifier for this service
   * @return serviceId
  **/
  
      

    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public BrAPIVendorSpecificationService serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The human readable name of a platform
   * @return serviceName
  **/
  
      

    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public BrAPIVendorSpecificationService servicePlatformMarkerType(BrAPIVendorServicePlatformMarkerTypeEnum servicePlatformMarkerType) {
    this.servicePlatformMarkerType = servicePlatformMarkerType;
    return this;
  }

  /**
   * The type of markers used in this services platform
   * @return servicePlatformMarkerType
  **/
  
  
    public BrAPIVendorServicePlatformMarkerTypeEnum getServicePlatformMarkerType() {
    return servicePlatformMarkerType;
  }

  public void setServicePlatformMarkerType(BrAPIVendorServicePlatformMarkerTypeEnum servicePlatformMarkerType) {
    this.servicePlatformMarkerType = servicePlatformMarkerType;
  }

  public BrAPIVendorSpecificationService servicePlatformName(String servicePlatformName) {
    this.servicePlatformName = servicePlatformName;
    return this;
  }

  /**
   * The technology platform used by this service
   * @return servicePlatformName
  **/
  
  
    public String getServicePlatformName() {
    return servicePlatformName;
  }

  public void setServicePlatformName(String servicePlatformName) {
    this.servicePlatformName = servicePlatformName;
  }

  public BrAPIVendorSpecificationService specificRequirements(List<BrAPIVendorSpecificationServiceSpecificRequirements> specificRequirements) {
    this.specificRequirements = specificRequirements;
    return this;
  }

  public BrAPIVendorSpecificationService addSpecificRequirementsItem(BrAPIVendorSpecificationServiceSpecificRequirements specificRequirementsItem) {
    if (this.specificRequirements == null) {
      this.specificRequirements = new ArrayList<BrAPIVendorSpecificationServiceSpecificRequirements>();
    }
    this.specificRequirements.add(specificRequirementsItem);
    return this;
  }

  /**
   * Additional arbitrary requirements for a particular platform
   * @return specificRequirements
  **/
  
      @Valid
    public List<BrAPIVendorSpecificationServiceSpecificRequirements> getSpecificRequirements() {
    return specificRequirements;
  }

  public void setSpecificRequirements(List<BrAPIVendorSpecificationServiceSpecificRequirements> specificRequirements) {
    this.specificRequirements = specificRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorSpecificationService vendorSpecificationService = (BrAPIVendorSpecificationService) o;
    return Objects.equals(this.serviceDescription, vendorSpecificationService.serviceDescription) &&
        Objects.equals(this.serviceId, vendorSpecificationService.serviceId) &&
        Objects.equals(this.serviceName, vendorSpecificationService.serviceName) &&
        Objects.equals(this.servicePlatformMarkerType, vendorSpecificationService.servicePlatformMarkerType) &&
        Objects.equals(this.servicePlatformName, vendorSpecificationService.servicePlatformName) &&
        Objects.equals(this.specificRequirements, vendorSpecificationService.specificRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDescription, serviceId, serviceName, servicePlatformMarkerType, servicePlatformName, specificRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecificationService {\n");
    
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePlatformMarkerType: ").append(toIndentedString(servicePlatformMarkerType)).append("\n");
    sb.append("    servicePlatformName: ").append(toIndentedString(servicePlatformName)).append("\n");
    sb.append("    specificRequirements: ").append(toIndentedString(specificRequirements)).append("\n");
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
