package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;


/**
 * MarkerPositionListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPIMarkerPositionListResponseResult implements BrAPIResponseResult<BrAPIMarkerPosition>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIMarkerPosition> data = new ArrayList<BrAPIMarkerPosition>();

  public BrAPIMarkerPositionListResponseResult data(List<BrAPIMarkerPosition> data) {
    this.data = data;
    return this;
  }

  public BrAPIMarkerPositionListResponseResult addDataItem(BrAPIMarkerPosition dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIMarkerPosition> getData() {
    return data;
  }

  public void setData(List<BrAPIMarkerPosition> data) {
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
    BrAPIMarkerPositionListResponseResult markerPositionListResponseResult = (BrAPIMarkerPositionListResponseResult) o;
    return Objects.equals(this.data, markerPositionListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkerPositionListResponseResult {\n");
    
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
