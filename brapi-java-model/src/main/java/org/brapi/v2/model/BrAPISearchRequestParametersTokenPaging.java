package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * SearchRequestParametersTokenPaging
 */


public class BrAPISearchRequestParametersTokenPaging extends BrAPISearchRequestParametersPaging {
  @JsonProperty("pageToken")
  private String pageToken = null;

  public BrAPISearchRequestParametersTokenPaging pageSize(Integer pageSize) {
    super.pageSize(pageSize);
    return this;
  }

  /**
   * The size of the pages to be returned. Default is `1000`.
   * @return pageSize
  **/
  
  
  public BrAPISearchRequestParametersTokenPaging pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Used to request a specific page of data to be returned.  Tokenized pages are for large data sets which can not be efficiently broken into indexed pages. Use the nextPageToken and prevPageToken from a prior response to construct a query and move to the next or previous page respectively. 
   * @return pageToken
  **/
  
  
    public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPISearchRequestParametersTokenPaging searchRequestParametersTokenPaging = (BrAPISearchRequestParametersTokenPaging) o;
    return Objects.equals(super.getPageSize(), searchRequestParametersTokenPaging.getPageSize()) &&
        Objects.equals(this.pageToken, searchRequestParametersTokenPaging.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getPageSize(), pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestParametersTokenPaging {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(super.getPageSize())).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
