package io.swagger.client.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

/**
 * A &#x60;Call&#x60; represents the determination of genotype with respect to a particular &#x60;Variant&#x60;.  It may include associated information such as quality and phasing. For example, a call might assign a probability of 0.32 to the occurrence of a SNP named RS_1234 in a call set with the name NA_12345.
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class Call   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("callSetDbId")
  private String callSetDbId = null;

  @JsonProperty("callSetName")
  private String callSetName = null;

  @JsonProperty("genotype")
  private ListValue genotype = null;

  @JsonProperty("genotype_likelihood")
  @Valid
  private List<Double> genotypeLikelihood = null;

  @JsonProperty("phaseSet")
  private String phaseSet = null;

  @JsonProperty("variantDbId")
  private String variantDbId = null;

  @JsonProperty("variantName")
  private String variantName = null;

  public Call additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public Call putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public Call callSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
    return this;
  }

  /**
   * The ID of the call set this variant call belongs to.  If this field is not present, the ordering of the call sets from a `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match the ordering of the calls on this `Variant`. The number of results will also be the same.
   * @return callSetDbId
  **/
  
  
    public String getCallSetDbId() {
    return callSetDbId;
  }

  public void setCallSetDbId(String callSetDbId) {
    this.callSetDbId = callSetDbId;
  }

  public Call callSetName(String callSetName) {
    this.callSetName = callSetName;
    return this;
  }

  /**
   * The name of the call set this variant call belongs to. If this field is not present, the ordering of the call sets from a `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match the ordering of the calls on this `Variant`. The number of results will also be the same.
   * @return callSetName
  **/
  
  
    public String getCallSetName() {
    return callSetName;
  }

  public void setCallSetName(String callSetName) {
    this.callSetName = callSetName;
  }

  public Call genotype(ListValue genotype) {
    this.genotype = genotype;
    return this;
  }

  /**
   * Get genotype
   * @return genotype
  **/
  
  
    @Valid
    public ListValue getGenotype() {
    return genotype;
  }

  public void setGenotype(ListValue genotype) {
    this.genotype = genotype;
  }

  public Call genotypeLikelihood(List<Double> genotypeLikelihood) {
    this.genotypeLikelihood = genotypeLikelihood;
    return this;
  }

  public Call addGenotypeLikelihoodItem(Double genotypeLikelihoodItem) {
    if (this.genotypeLikelihood == null) {
      this.genotypeLikelihood = new ArrayList<Double>();
    }
    this.genotypeLikelihood.add(genotypeLikelihoodItem);
    return this;
  }

  /**
   * The genotype likelihood for this variant call. Each array entry represents how likely a specific genotype is for this call as log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The value ordering is defined by the GL tag in the VCF spec.
   * @return genotypeLikelihood
  **/
  
  
    public List<Double> getGenotypeLikelihood() {
    return genotypeLikelihood;
  }

  public void setGenotypeLikelihood(List<Double> genotypeLikelihood) {
    this.genotypeLikelihood = genotypeLikelihood;
  }

  public Call phaseSet(String phaseSet) {
    this.phaseSet = phaseSet;
    return this;
  }

  /**
   * If this field is populated, this variant call's genotype ordering implies the phase of the bases and is consistent with any other variant calls on the same contig which have the same phase set string.
   * @return phaseSet
  **/
  
  
    public String getPhaseSet() {
    return phaseSet;
  }

  public void setPhaseSet(String phaseSet) {
    this.phaseSet = phaseSet;
  }

  public Call variantDbId(String variantDbId) {
    this.variantDbId = variantDbId;
    return this;
  }

  /**
   * The ID of the variant this call belongs to.
   * @return variantDbId
  **/
  
  
    public String getVariantDbId() {
    return variantDbId;
  }

  public void setVariantDbId(String variantDbId) {
    this.variantDbId = variantDbId;
  }

  public Call variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

  /**
   * The name of the variant this call belongs to.
   * @return variantName
  **/
  
  
    public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.additionalInfo, call.additionalInfo) &&
        Objects.equals(this.callSetDbId, call.callSetDbId) &&
        Objects.equals(this.callSetName, call.callSetName) &&
        Objects.equals(this.genotype, call.genotype) &&
        Objects.equals(this.genotypeLikelihood, call.genotypeLikelihood) &&
        Objects.equals(this.phaseSet, call.phaseSet) &&
        Objects.equals(this.variantDbId, call.variantDbId) &&
        Objects.equals(this.variantName, call.variantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, callSetDbId, callSetName, genotype, genotypeLikelihood, phaseSet, variantDbId, variantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    callSetDbId: ").append(toIndentedString(callSetDbId)).append("\n");
    sb.append("    callSetName: ").append(toIndentedString(callSetName)).append("\n");
    sb.append("    genotype: ").append(toIndentedString(genotype)).append("\n");
    sb.append("    genotypeLikelihood: ").append(toIndentedString(genotypeLikelihood)).append("\n");
    sb.append("    phaseSet: ").append(toIndentedString(phaseSet)).append("\n");
    sb.append("    variantDbId: ").append(toIndentedString(variantDbId)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
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
