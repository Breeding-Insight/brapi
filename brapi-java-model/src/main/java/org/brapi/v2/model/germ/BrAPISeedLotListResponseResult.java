package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.germ.BrAPISeedLot;


/**
 * SeedLotListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPISeedLotListResponseResult implements BrAPIResponseResult<BrAPISeedLot>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPISeedLot> data = new ArrayList<BrAPISeedLot>();

  public BrAPISeedLotListResponseResult data(List<BrAPISeedLot> data) {
    this.data = data;
    return this;
  }

  public BrAPISeedLotListResponseResult addDataItem(BrAPISeedLot dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPISeedLot> getData() {
    return data;
  }

  public void setData(List<BrAPISeedLot> data) {
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
    BrAPISeedLotListResponseResult seedLotListResponseResult = (BrAPISeedLotListResponseResult) o;
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
