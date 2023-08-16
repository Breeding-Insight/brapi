package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalReferencesInner
 */

public class BrAPIExternalReference {
	@JsonProperty("referenceId")
	private String referenceId = null;

	@JsonProperty("referenceID")
	@Deprecated
	private String referenceID = null;

	@JsonProperty("referenceSource")
	private String referenceSource = null;

	public BrAPIExternalReference referenceId(String referenceId) {
		this.referenceId = referenceId;
		return this;
	}

	/**
	 * The external reference ID. Could be a simple string or a URI.
	 * 
	 * @return referenceID
	 **/

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	
	@Deprecated
	public BrAPIExternalReference referenceID(String referenceID) {
		this.referenceID = referenceID;
		return this;
	}

	/**
	 * The external reference ID. Could be a simple string or a URI.
	 * 
	 * @return referenceID
	 **/

	@Deprecated
	public String getReferenceID() {
		return referenceID;
	}

	@Deprecated
	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public BrAPIExternalReference referenceSource(String referenceSource) {
		this.referenceSource = referenceSource;
		return this;
	}

	/**
	 * An identifier for the source system or database of this reference
	 * 
	 * @return referenceSource
	 **/

	public String getReferenceSource() {
		return referenceSource;
	}

	public void setReferenceSource(String referenceSource) {
		this.referenceSource = referenceSource;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIExternalReference externalReferencesInner = (BrAPIExternalReference) o;
		return Objects.equals(this.referenceID, externalReferencesInner.referenceID)
				&& Objects.equals(this.referenceSource, externalReferencesInner.referenceSource);
	}

	@Override
	public int hashCode() {
		return Objects.hash(referenceID, referenceSource);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalReferencesInner {\n");

		sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
		sb.append("    referenceSource: ").append(toIndentedString(referenceSource)).append("\n");
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
