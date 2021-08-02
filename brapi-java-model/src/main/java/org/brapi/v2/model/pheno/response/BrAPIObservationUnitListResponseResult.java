package org.brapi.v2.model.pheno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.pheno.BrAPIObservationUnit;


/**
 * ObservationUnitListResponseResult
 */


public class BrAPIObservationUnitListResponseResult implements BrAPIResponseResult<BrAPIObservationUnit>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIObservationUnit> data = new ArrayList<BrAPIObservationUnit>();

  public BrAPIObservationUnitListResponseResult data(List<BrAPIObservationUnit> data) {
    this.data = data;
    return this;
  }

  public BrAPIObservationUnitListResponseResult addDataItem(BrAPIObservationUnit dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIObservationUnit> getData() {
    return data;
  }

  public void setData(List<BrAPIObservationUnit> data) {
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
    BrAPIObservationUnitListResponseResult observationUnitListResponseResult = (BrAPIObservationUnitListResponseResult) o;
    return Objects.equals(this.data, observationUnitListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitListResponseResult {\n");
    
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
