package org.brapi.v2.model.geno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.geno.BrAPILinkageGroup;


/**
 * LinkageGroupListResponseResult
 */


public class BrAPILinkageGroupListResponseResult implements BrAPIResponseResult<BrAPILinkageGroup>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPILinkageGroup> data = new ArrayList<BrAPILinkageGroup>();

  public BrAPILinkageGroupListResponseResult data(List<BrAPILinkageGroup> data) {
    this.data = data;
    return this;
  }

  public BrAPILinkageGroupListResponseResult addDataItem(BrAPILinkageGroup dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPILinkageGroup> getData() {
    return data;
  }

  public void setData(List<BrAPILinkageGroup> data) {
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
    BrAPILinkageGroupListResponseResult linkageGroupListResponseResult = (BrAPILinkageGroupListResponseResult) o;
    return Objects.equals(this.data, linkageGroupListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkageGroupListResponseResult {\n");
    
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
