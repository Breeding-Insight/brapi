package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponse;
import org.brapi.v2.model.BrAPIContext;
import org.brapi.v2.model.BrAPIMetadata;

/**
 * ListsSingleResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIListsSingleResponse implements BrAPIResponse<BrAPIListDetails> {
	@JsonProperty("@context")
	private BrAPIContext _atContext = null;

	@JsonProperty("metadata")
	private BrAPIMetadata metadata = null;

	@JsonProperty("result")
	private BrAPIListDetails result = null;

	public BrAPIListsSingleResponse() {
		this._atContext = new BrAPIContext();
		this._atContext.add("context");
	}

	public BrAPIListsSingleResponse metadata(BrAPIMetadata metadata) {
		this.metadata = metadata;
		return this;
	}

	/**
	 * Get metadata
	 * 
	 * @return metadata
	 **/
	
	

	@Valid
	public BrAPIMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(BrAPIMetadata metadata) {
		this.metadata = metadata;
	}

	public BrAPIListsSingleResponse result(BrAPIListDetails result) {
		this.result = result;
		return this;
	}

	/**
	 * Get result
	 * 
	 * @return result
	 **/
	
	

	@Valid
	public BrAPIListDetails getResult() {
		return result;
	}

	public void setResult(BrAPIListDetails result) {
		this.result = result;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIListsSingleResponse listsSingleResponse = (BrAPIListsSingleResponse) o;
		return Objects.equals(this._atContext, listsSingleResponse._atContext)
				&& Objects.equals(this.metadata, listsSingleResponse.metadata)
				&& Objects.equals(this.result, listsSingleResponse.result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_atContext, metadata, result);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ListsSingleResponse {\n");

		sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
		sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
