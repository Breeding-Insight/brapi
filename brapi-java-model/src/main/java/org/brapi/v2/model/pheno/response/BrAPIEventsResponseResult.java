package org.brapi.v2.model.pheno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.pheno.BrAPIEvent;


/**
 * EventsResponseResult
 */


public class BrAPIEventsResponseResult implements BrAPIResponseResult<BrAPIEvent>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIEvent> data = new ArrayList<BrAPIEvent>();

  public BrAPIEventsResponseResult data(List<BrAPIEvent> data) {
    this.data = data;
    return this;
  }

  public BrAPIEventsResponseResult addDataItem(BrAPIEvent dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIEvent> getData() {
    return data;
  }

  public void setData(List<BrAPIEvent> data) {
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
    BrAPIEventsResponseResult eventsResponseResult = (BrAPIEventsResponseResult) o;
    return Objects.equals(this.data, eventsResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsResponseResult {\n");
    
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
