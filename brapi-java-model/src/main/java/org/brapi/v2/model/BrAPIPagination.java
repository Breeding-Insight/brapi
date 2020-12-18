package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;




/**
 * BasePagination
 */


public abstract class BrAPIPagination {
	@JsonProperty("pageSize")
	private Integer pageSize = 1000;

	@JsonProperty("totalCount")
	private Integer totalCount = null;

	@JsonProperty("totalPages")
	private Integer totalPages = null;

	public BrAPIPagination pageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	/**
	 * The number of data elements returned, aka the size of the current page. If
	 * the requested page does not have enough elements to fill a page at the
	 * requested page size, this field should indicate the actual number of elements
	 * returned.
	 * 
	 * @return pageSize
	 **/
	
	

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public BrAPIPagination totalCount(Integer totalCount) {
		this.totalCount = totalCount;
		return this;
	}

	/**
	 * The total number of elements that are available on the server and match the
	 * requested query paramters.
	 * 
	 * @return totalCount
	 **/
	

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public BrAPIPagination totalPages(Integer totalPages) {
		this.totalPages = totalPages;
		return this;
	}

	/**
	 * The total number of pages of elements available on the server. This should be
	 * calculated with the following formula. totalPages = CEILING( totalCount /
	 * requested_page_size)
	 * 
	 * @return totalPages
	 **/
	

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIPagination basePagination = (BrAPIPagination) o;
		return Objects.equals(this.pageSize, basePagination.pageSize)
				&& Objects.equals(this.totalCount, basePagination.totalCount)
				&& Objects.equals(this.totalPages, basePagination.totalPages);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pageSize, totalCount, totalPages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BasePagination {\n");

		sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
		sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
		sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

	public abstract void setCurrentPage(Integer page);

	public abstract void setCurrentPage(String pageToken);

	public abstract Integer getCurrentPage() ;
}
