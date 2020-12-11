package io.swagger.client.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.BrAPIResponseResult;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * LinkageGroupListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class LinkageGroupListResponseResult implements BrAPIResponseResult<LinkageGroup>  {
  @JsonProperty("data")
  @Valid
  private List<LinkageGroup> data = new ArrayList<LinkageGroup>();

  public LinkageGroupListResponseResult data(List<LinkageGroup> data) {
    this.data = data;
    return this;
  }

  public LinkageGroupListResponseResult addDataItem(LinkageGroup dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<LinkageGroup> getData() {
    return data;
  }

  public void setData(List<LinkageGroup> data) {
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
    LinkageGroupListResponseResult linkageGroupListResponseResult = (LinkageGroupListResponseResult) o;
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
