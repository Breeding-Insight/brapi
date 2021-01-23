package org.brapi.v2.model.germ.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.germ.BrAPICross;


/**
 * CrossesListResponseResult
 */


public class BrAPICrossesListResponseResult implements BrAPIResponseResult<BrAPICross>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPICross> data = new ArrayList<BrAPICross>();

  public BrAPICrossesListResponseResult data(List<BrAPICross> data) {
    this.data = data;
    return this;
  }

  public BrAPICrossesListResponseResult addDataItem(BrAPICross dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPICross> getData() {
    return data;
  }

  public void setData(List<BrAPICross> data) {
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
    BrAPICrossesListResponseResult crossesListResponseResult = (BrAPICrossesListResponseResult) o;
    return Objects.equals(this.data, crossesListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossesListResponseResult {\n");
    
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
