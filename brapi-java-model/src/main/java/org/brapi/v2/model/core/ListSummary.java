package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * ListSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class ListSummary extends ListBaseFields  {
  @JsonProperty("listDbId")
  private String listDbId = null;

  public ListSummary listDbId(String listDbId) {
    this.listDbId = listDbId;
    return this;
  }

  /**
   * The unique identifier for a List
   * @return listDbId
  **/
  
      

    public String getListDbId() {
    return listDbId;
  }

  public void setListDbId(String listDbId) {
    this.listDbId = listDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSummary listSummary = (ListSummary) o;
    return Objects.equals(this.listDbId, listSummary.listDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listDbId: ").append(toIndentedString(listDbId)).append("\n");
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
