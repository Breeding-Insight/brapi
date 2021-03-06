package org.brapi.v2.model.germ.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;


/**
 * GermplasmAttributeCategoryListResponseResult
 */


public class BrAPIGermplasmAttributeCategoryListResponseResult implements BrAPIResponseResult<String>  {
  @JsonProperty("data")
  @Valid
  private List<String> data = new ArrayList<String>();

  public BrAPIGermplasmAttributeCategoryListResponseResult data(List<String> data) {
    this.data = data;
    return this;
  }

  public BrAPIGermplasmAttributeCategoryListResponseResult addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
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
    BrAPIGermplasmAttributeCategoryListResponseResult germplasmAttributeCategoryListResponseResult = (BrAPIGermplasmAttributeCategoryListResponseResult) o;
    return Objects.equals(this.data, germplasmAttributeCategoryListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeCategoryListResponseResult {\n");
    
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
