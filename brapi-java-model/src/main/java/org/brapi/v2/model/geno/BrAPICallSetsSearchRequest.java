package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * CallSetsSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPICallSetsSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

  @JsonProperty("callSetDbIds")
  @Valid
  private List<String> callSetDbIds = null;

  @JsonProperty("callSetNames")
  @Valid
  private List<String> callSetNames = null;

  @JsonProperty("sampleDbIds")
  @Valid
  private List<String> sampleDbIds = null;

  @JsonProperty("sampleNames")
  @Valid
  private List<String> sampleNames = null;

  @JsonProperty("variantSetDbIds")
  @Valid
  private List<String> variantSetDbIds = null;

  public BrAPICallSetsSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * List of IDs which uniquely identify germplasm to search for
   * @return germplasmDbIds
  **/
  
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public BrAPICallSetsSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * List of human readable names to identify germplasm to search for
   * @return germplasmNames
  **/
  
  
    public List<String> getGermplasmNames() {
    return germplasmNames;
  }

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public BrAPICallSetsSearchRequest callSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addCallSetDbIdsItem(String callSetDbIdsItem) {
    if (this.callSetDbIds == null) {
      this.callSetDbIds = new ArrayList<String>();
    }
    this.callSetDbIds.add(callSetDbIdsItem);
    return this;
  }

  /**
   * Only return call sets with these DbIds (case-sensitive, exact match).
   * @return callSetDbIds
  **/
  
  
    public List<String> getCallSetDbIds() {
    return callSetDbIds;
  }

  public void setCallSetDbIds(List<String> callSetDbIds) {
    this.callSetDbIds = callSetDbIds;
  }

  public BrAPICallSetsSearchRequest callSetNames(List<String> callSetNames) {
    this.callSetNames = callSetNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addCallSetNamesItem(String callSetNamesItem) {
    if (this.callSetNames == null) {
      this.callSetNames = new ArrayList<String>();
    }
    this.callSetNames.add(callSetNamesItem);
    return this;
  }

  /**
   * Only return call sets with these names (case-sensitive, exact match).
   * @return callSetNames
  **/
  
  
    public List<String> getCallSetNames() {
    return callSetNames;
  }

  public void setCallSetNames(List<String> callSetNames) {
    this.callSetNames = callSetNames;
  }

  public BrAPICallSetsSearchRequest sampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addSampleDbIdsItem(String sampleDbIdsItem) {
    if (this.sampleDbIds == null) {
      this.sampleDbIds = new ArrayList<String>();
    }
    this.sampleDbIds.add(sampleDbIdsItem);
    return this;
  }

  /**
   * Return only call sets generated from the provided Biosample IDs.
   * @return sampleDbIds
  **/
  
  
    public List<String> getSampleDbIds() {
    return sampleDbIds;
  }

  public void setSampleDbIds(List<String> sampleDbIds) {
    this.sampleDbIds = sampleDbIds;
  }

  public BrAPICallSetsSearchRequest sampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
    return this;
  }

  public BrAPICallSetsSearchRequest addSampleNamesItem(String sampleNamesItem) {
    if (this.sampleNames == null) {
      this.sampleNames = new ArrayList<String>();
    }
    this.sampleNames.add(sampleNamesItem);
    return this;
  }

  /**
   * Return only call sets generated from the provided Biosample human readable names.
   * @return sampleNames
  **/
  
  
    public List<String> getSampleNames() {
    return sampleNames;
  }

  public void setSampleNames(List<String> sampleNames) {
    this.sampleNames = sampleNames;
  }

  public BrAPICallSetsSearchRequest variantSetDbIds(List<String> variantSetDbIds) {
    this.variantSetDbIds = variantSetDbIds;
    return this;
  }

  public BrAPICallSetsSearchRequest addVariantSetDbIdsItem(String variantSetDbIdsItem) {
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
    BrAPICallSetsSearchRequest callSetsSearchRequest = (BrAPICallSetsSearchRequest) o;
    return Objects.equals(this.germplasmDbIds, callSetsSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, callSetsSearchRequest.germplasmNames) &&
        Objects.equals(this.callSetDbIds, callSetsSearchRequest.callSetDbIds) &&
        Objects.equals(this.callSetNames, callSetsSearchRequest.callSetNames) &&
        Objects.equals(this.sampleDbIds, callSetsSearchRequest.sampleDbIds) &&
        Objects.equals(this.sampleNames, callSetsSearchRequest.sampleNames) &&
        Objects.equals(this.variantSetDbIds, callSetsSearchRequest.variantSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbIds, germplasmNames, callSetDbIds, callSetNames, sampleDbIds, sampleNames, variantSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallSetsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    callSetDbIds: ").append(toIndentedString(callSetDbIds)).append("\n");
    sb.append("    callSetNames: ").append(toIndentedString(callSetNames)).append("\n");
    sb.append("    sampleDbIds: ").append(toIndentedString(sampleDbIds)).append("\n");
    sb.append("    sampleNames: ").append(toIndentedString(sampleNames)).append("\n");
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
