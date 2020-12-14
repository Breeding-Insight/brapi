package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Model202AcceptedSearchResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class Model202AcceptedSearchResponseResult   {
  @JsonProperty("searchResultsDbId")
  private String searchResultsDbId = null;

  public Model202AcceptedSearchResponseResult searchResultsDbId(String searchResultsDbId) {
    this.searchResultsDbId = searchResultsDbId;
    return this;
  }

  /**
   * Get searchResultsDbId
   * @return searchResultsDbId
  **/
  
  
    public String getSearchResultsDbId() {
    return searchResultsDbId;
  }

  public void setSearchResultsDbId(String searchResultsDbId) {
    this.searchResultsDbId = searchResultsDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model202AcceptedSearchResponseResult _202AcceptedSearchResponseResult = (Model202AcceptedSearchResponseResult) o;
    return Objects.equals(this.searchResultsDbId, _202AcceptedSearchResponseResult.searchResultsDbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchResultsDbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model202AcceptedSearchResponseResult {\n");
    
    sb.append("    searchResultsDbId: ").append(toIndentedString(searchResultsDbId)).append("\n");
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
