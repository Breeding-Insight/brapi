/*
 * BrAPI-Genotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.genotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;

/**
 * The details of a vendor order
 */
@Schema(description = "The details of a vendor order")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T14:54:00.515Z[GMT]")
public class VendorOrder {
    @SerializedName("clientId")
    private String clientId = null;

    @SerializedName("numberOfSamples")
    private Integer numberOfSamples = null;

    @SerializedName("orderId")
    private String orderId = null;

    @SerializedName("requiredServiceInfo")
    private Map<String, String> requiredServiceInfo = null;

    @SerializedName("serviceIds")
    private List<String> serviceIds = new ArrayList<String>();

    public VendorOrder clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the correct billing and contact info.
     *
     * @return clientId
     **/
    @Schema(example = "7b51ad15", required = true, description = "A unique, alpha-numeric ID which identifies the client to the vendor. Used to connect the order to the correct billing and contact info.")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public VendorOrder numberOfSamples(Integer numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
        return this;
    }

    /**
     * The total number of samples contained in this request. Used for billing and basic validation of the request.
     *
     * @return numberOfSamples
     **/
    @Schema(example = "180", required = true, description = "The total number of samples contained in this request. Used for billing and basic validation of the request.")
    public Integer getNumberOfSamples() {
        return numberOfSamples;
    }

    public void setNumberOfSamples(Integer numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
    }

    public VendorOrder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * The order id returned by the vendor when the order was successfully submitted.
     *
     * @return orderId
     **/
    @Schema(example = "96ba0ca3", required = true, description = "The order id returned by the vendor when the order was successfully submitted.")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public VendorOrder requiredServiceInfo(Map<String, String> requiredServiceInfo) {
        this.requiredServiceInfo = requiredServiceInfo;
        return this;
    }

    public VendorOrder putRequiredServiceInfoItem(String key, String requiredServiceInfoItem) {
        if (this.requiredServiceInfo == null) {
            this.requiredServiceInfo = new HashMap<String, String>();
        }
        this.requiredServiceInfo.put(key, requiredServiceInfoItem);
        return this;
    }

    /**
     * A map of additional data required by the requested service. This includes things like Volume and Concentration.
     *
     * @return requiredServiceInfo
     **/
    @Schema(example = "{\"extractDNA\":\"true\",\"genus\":\"Zea\",\"species\":\"mays\",\"volumePerWell\":\"2.3 ml\"}", description = "A map of additional data required by the requested service. This includes things like Volume and Concentration.")
    public Map<String, String> getRequiredServiceInfo() {
        return requiredServiceInfo;
    }

    public void setRequiredServiceInfo(Map<String, String> requiredServiceInfo) {
        this.requiredServiceInfo = requiredServiceInfo;
    }

    public VendorOrder serviceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }

    public VendorOrder addServiceIdsItem(String serviceIdsItem) {
        this.serviceIds.add(serviceIdsItem);
        return this;
    }

    /**
     * A list of unique, alpha-numeric ID which identify the requested services to be applied to this order.  A Vendor Service defines what platform, technology, and markers will be used.  A list of available service IDs can be retrieved from the Vendor Specs.
     *
     * @return serviceIds
     **/
    @Schema(example = "[\"e8f60f64\",\"05bd925a\",\"b698fb5e\"]", required = true, description = "A list of unique, alpha-numeric ID which identify the requested services to be applied to this order.  A Vendor Service defines what platform, technology, and markers will be used.  A list of available service IDs can be retrieved from the Vendor Specs.")
    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VendorOrder vendorOrder = (VendorOrder) o;
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}