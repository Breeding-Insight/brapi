package org.brapi.v2.model.core.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;

/**
 * CommonCropNamesResponseResult
 */


public class BrAPICommonCropNamesResponseResult implements BrAPIResponseResult<String>  {
  @JsonProperty("data")
  @Valid
  private List<String> data = new ArrayList<String>();

  public BrAPICommonCropNamesResponseResult data(List<String> data) {
    this.data = data;
    return this;
  }

  public BrAPICommonCropNamesResponseResult addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * array of crop names available on the server
   * @return data
  **/
  
      

    public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
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
    BrAPICommonCropNamesResponseResult commonCropNamesResponseResult = (BrAPICommonCropNamesResponseResult) o;
    return Objects.equals(this.data, commonCropNamesResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonCropNamesResponseResult {\n");
    
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
