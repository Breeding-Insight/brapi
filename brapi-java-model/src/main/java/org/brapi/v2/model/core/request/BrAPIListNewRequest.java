package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.core.BrAPIListBaseFields;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * ListNewRequest
 */


public class BrAPIListNewRequest extends BrAPIListBaseFields {
  @JsonProperty("data")
  @Valid
  private List<String> data = null;

  public BrAPIListNewRequest data(List<String> data) {
    this.data = data;
    return this;
  }

  public BrAPIListNewRequest addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<String>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * The list of DbIds contained in this list
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
    BrAPIListNewRequest listNewRequest = (BrAPIListNewRequest) o;
    return Objects.equals(this.data, listNewRequest.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNewRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
