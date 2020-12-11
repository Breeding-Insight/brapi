package io.swagger.client.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.BrAPIResponseResult;
import io.swagger.client.model.germ.SeedLot;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * SeedLotListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class SeedLotListResponseResult implements BrAPIResponseResult<SeedLot>  {
  @JsonProperty("data")
  @Valid
  private List<SeedLot> data = new ArrayList<SeedLot>();

  public SeedLotListResponseResult data(List<SeedLot> data) {
    this.data = data;
    return this;
  }

  public SeedLotListResponseResult addDataItem(SeedLot dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<SeedLot> getData() {
    return data;
  }

  public void setData(List<SeedLot> data) {
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
    SeedLotListResponseResult seedLotListResponseResult = (SeedLotListResponseResult) o;
    return Objects.equals(this.data, seedLotListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedLotListResponseResult {\n");
    
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
