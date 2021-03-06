package org.brapi.v2.model.pheno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.pheno.BrAPITrait;


/**
 * TraitListResponseResult
 */


public class BrAPITraitListResponseResult implements BrAPIResponseResult<BrAPITrait> {
	@JsonProperty("data")
	@Valid
	private List<BrAPITrait> data = new ArrayList<BrAPITrait>();

	public BrAPITraitListResponseResult data(List<BrAPITrait> data) {
		this.data = data;
		return this;
	}

	public BrAPITraitListResponseResult addDataItem(BrAPITrait dataItem) {
		this.data.add(dataItem);
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
	
	
	@Valid
	public List<BrAPITrait> getData() {
		return data;
	}

	public void setData(List<BrAPITrait> data) {
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
		BrAPITraitListResponseResult traitListResponseResult = (BrAPITraitListResponseResult) o;
		return Objects.equals(this.data, traitListResponseResult.data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TraitListResponseResult {\n");

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
