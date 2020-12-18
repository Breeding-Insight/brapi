package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * SearchRequestParametersPaging
 */


public class BrAPISearchRequestParametersPaging   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public BrAPISearchRequestParametersPaging page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.
   * @return page
  **/
  
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public BrAPISearchRequestParametersPaging pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The size of the pages to be returned. Default is `1000`.
   * @return pageSize
  **/
  
  
    public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPISearchRequestParametersPaging searchRequestParametersPaging = (BrAPISearchRequestParametersPaging) o;
    return Objects.equals(this.page, searchRequestParametersPaging.page) &&
        Objects.equals(this.pageSize, searchRequestParametersPaging.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequestParametersPaging {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
