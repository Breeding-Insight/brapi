package org.brapi.v2.model.core.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.core.BrAPIPerson;

/**
 * PersonListResponseResult
 */


public class BrAPIPersonListResponseResult implements BrAPIResponseResult<BrAPIPerson>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIPerson> data = new ArrayList<BrAPIPerson>();

  public BrAPIPersonListResponseResult data(List<BrAPIPerson> data) {
    this.data = data;
    return this;
  }

  public BrAPIPersonListResponseResult addDataItem(BrAPIPerson dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of people
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIPerson> getData() {
    return data;
  }

  public void setData(List<BrAPIPerson> data) {
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
    BrAPIPersonListResponseResult personListResponseResult = (BrAPIPersonListResponseResult) o;
    return Objects.equals(this.data, personListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonListResponseResult {\n");
    
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
