package io.swagger.client.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.BrAPIResponseResult;
import io.swagger.client.model.pheno.Scale;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;


/**
 * ScaleListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class ScaleListResponseResult implements BrAPIResponseResult<Scale> {
	@JsonProperty("data")
	@Valid
	private List<Scale> data = new ArrayList<Scale>();

	public ScaleListResponseResult data(List<Scale> data) {
		this.data = data;
		return this;
	}

	public ScaleListResponseResult addDataItem(Scale dataItem) {
		this.data.add(dataItem);
		return this;
	}

	/**
	 * Get data
	 * 
	 * @return data
	 **/
	
	
	@Valid
	public List<Scale> getData() {
		return data;
	}

	public void setData(List<Scale> data) {
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
		ScaleListResponseResult scaleListResponseResult = (ScaleListResponseResult) o;
		return Objects.equals(this.data, scaleListResponseResult.data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScaleListResponseResult {\n");

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
