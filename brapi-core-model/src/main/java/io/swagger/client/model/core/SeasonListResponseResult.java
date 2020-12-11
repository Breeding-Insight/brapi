package io.swagger.client.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.BrAPIResponseResult;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * SeasonListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class SeasonListResponseResult implements BrAPIResponseResult<Season>  {
  @JsonProperty("data")
  @Valid
  private List<Season> data = new ArrayList<Season>();

  public SeasonListResponseResult data(List<Season> data) {
    this.data = data;
    return this;
  }

  public SeasonListResponseResult addDataItem(Season dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<Season> getData() {
    return data;
  }

  public void setData(List<Season> data) {
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
    SeasonListResponseResult seasonListResponseResult = (SeasonListResponseResult) o;
    return Objects.equals(this.data, seasonListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonListResponseResult {\n");
    
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
