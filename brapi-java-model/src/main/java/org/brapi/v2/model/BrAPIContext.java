package org.brapi.v2.model;

import java.util.Objects;

import java.util.ArrayList;




/**
 * The JSON-LD Context is used to provide JSON-LD definitions to each field in a
 * JSON object. By providing an array of context file urls, a BrAPI response
 * object becomes JSON-LD compatible. For more information, see
 * https://w3c.github.io/json-ld-syntax/#the-context
 */



public class BrAPIContext extends ArrayList<String> {
	private static final long serialVersionUID = 6638807737898652599L;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Context {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
