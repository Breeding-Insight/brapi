package org.brapi.v2.model.geno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersTokenPaging;
/**
 * CallsSearchRequest
 */


public class BrAPICallsSearchRequest extends BrAPISearchRequestParametersTokenPaging  {
  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("expandHomozygotes")
  private Boolean expandHomozygotes = null;

  @JsonProperty("sepPhased")
  private String sepPhased = null;

  @JsonProperty("sepUnphased")
  private String sepUnphased = null;

  @JsonProperty("unknownString")
  private String unknownString = null;

  @JsonProperty("variantDbIds")
  @Valid
  private List<String> variantDbIds = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  public BrAPICallsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public BrAPICallsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * The CallSet to search.
   * @return callSetDbIds
  **/
  
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public BrAPICallsSearchRequest expandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
    return this;
  }

  /**
   * Should homozygotes be expanded (true) or collapsed into a single occurence (false)
   * @return expandHomozygotes
  **/
  
  
    public Boolean isExpandHomozygotes() {
    return expandHomozygotes;
  }

  public void setExpandHomozygotes(Boolean expandHomozygotes) {
    this.expandHomozygotes = expandHomozygotes;
  }

  public BrAPICallsSearchRequest sepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
    return this;
  }

  /**
   * The string used as a separator for phased allele calls.
   * @return sepPhased
  **/
  
  
    public String getSepPhased() {
    return sepPhased;
  }

  public void setSepPhased(String sepPhased) {
    this.sepPhased = sepPhased;
  }

  public BrAPICallsSearchRequest sepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
    return this;
  }

  /**
   * The string used as a separator for unphased allele calls.
   * @return sepUnphased
  **/
  
  
    public String getSepUnphased() {
    return sepUnphased;
  }

  public void setSepUnphased(String sepUnphased) {
    this.sepUnphased = sepUnphased;
  }

  public BrAPICallsSearchRequest unknownString(String unknownString) {
    this.unknownString = unknownString;
    return this;
  }

  /**
   * The string used as a representation for missing data.
   * @return unknownString
  **/
  
  
    public String getUnknownString() {
    return unknownString;
  }

  public void setUnknownString(String unknownString) {
    this.unknownString = unknownString;
  }

  public BrAPICallsSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public BrAPICallsSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * The Variant to search.
   * @return variantDbIds
  **/
  
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }

  public BrAPICallsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public BrAPICallsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
    if (this.variantSetDbIds == null) {
      this.variantSetDbIds = new ArrayList<String>();
    }
    this.variantSetDbIds.add(variantSetDbIdsItem);
    return this;
  }

  /**
   * The VariantSet to search.
   * @return variantSetDbIds
  **/
  
  
    public List<String> getVariantSetDbIds() {
    return variantSetDbIds;
  }

  public void setVariantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPICallsSearchRequest callsSearchRequest = (BrAPICallsSearchRequest) o;
    return Objects.equals(this.callSetDbIds, callsSearchRequest.callSetDbIds) &&
        Objects.equals(this.expandHomozygotes, callsSearchRequest.expandHomozygotes) &&
        Objects.equals(this.sepPhased, callsSearchRequest.sepPhased) &&
        Objects.equals(this.sepUnphased, callsSearchRequest.sepUnphased) &&
        Objects.equals(this.unknownString, callsSearchRequest.unknownString) &&
        Objects.equals(this.variantDbIds, callsSearchRequest.variantDbIds) &&
        Objects.equals(this.variantSetDbIds, callsSearchRequest.variantSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callSetDbIds, expandHomozygotes, sepPhased, sepUnphased, unknownString, variantDbIds, variantSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    expandHomozygotes: ").append(toIndentedString(expandHomozygotes)).append("\n");
    sb.append("    sepPhased: ").append(toIndentedString(sepPhased)).append("\n");
    sb.append("    sepUnphased: ").append(toIndentedString(sepUnphased)).append("\n");
    sb.append("    unknownString: ").append(toIndentedString(unknownString)).append("\n");
    sb.append("    variantDbIds: ").append(toIndentedString(variantDbIds)).append("\n");
    sb.append("    variantSetDbIds: ").append(toIndentedString(variantSetDbIds)).append("\n");
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
