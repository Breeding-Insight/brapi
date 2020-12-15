package org.brapi.v2.model;

import java.util.Objects;

import org.brapi.v2.model.BrAPIExternalReference;

import java.util.ArrayList;


/**
 * An array of external reference ids. These are references to this piece of
 * data in an external system. Could be a simple string or a URI.
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIExternalReferenceList extends ArrayList<BrAPIExternalReference> {

	private static final long serialVersionUID = -4795437173672218910L;
	
	public BrAPIExternalReferenceList addReference(String referenceId, String referenceSource) {
		BrAPIExternalReference inner = new BrAPIExternalReference()
				.referenceID(referenceId).referenceSource(referenceSource);
		this.add(inner);
		return this;
	}

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
		sb.append("class ExternalReferences {\n");
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
