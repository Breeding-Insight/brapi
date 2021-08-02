package org.brapi.v2.model.geno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.geno.BrAPIVariantSet;


/**
 * VariantSetsListResponseResult
 */


public class BrAPIVariantSetsListResponseResult implements BrAPIResponseResult<BrAPIVariantSet>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIVariantSet> data = new ArrayList<BrAPIVariantSet>();

  public BrAPIVariantSetsListResponseResult data(List<BrAPIVariantSet> data) {
    this.data = data;
    return this;
  }

  public BrAPIVariantSetsListResponseResult addDataItem(BrAPIVariantSet dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIVariantSet> getData() {
    return data;
  }

  public void setData(List<BrAPIVariantSet> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVariantSetsListResponseResult variantSetsListResponseResult = (BrAPIVariantSetsListResponseResult) o;
    return Objects.equals(this.data, variantSetsListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantSetsListResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
