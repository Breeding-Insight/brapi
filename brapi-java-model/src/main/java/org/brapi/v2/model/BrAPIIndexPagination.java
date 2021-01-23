package org.brapi.v2.model;

import java.util.Objects;

import org.brapi.v2.model.BrAPIPagination;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * IndexPagination
 */


public class BrAPIIndexPagination extends BrAPIPagination {
	@JsonProperty("currentPage")
	private Integer currentPage = 0;

	public BrAPIIndexPagination currentPage(Integer currentPage) {
		this.currentPage = currentPage;
		return this;
	}

	/**
	 * The index number for the returned page of data. This should always match the
	 * requested page number or the default page (0).
	 * 
	 * @return currentPage
	 **/
	
	

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = Integer.parseInt(currentPage);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIIndexPagination indexPagination = (BrAPIIndexPagination) o;
		return Objects.equals(this.currentPage, indexPagination.currentPage) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentPage, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IndexPagination {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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
