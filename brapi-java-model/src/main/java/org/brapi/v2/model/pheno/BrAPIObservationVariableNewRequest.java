package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * ObservationVariableNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservationVariableNewRequest extends BrAPIVariableBaseClass {
	@JsonProperty("observationVariableName")
	private String observationVariableName = null;

	public BrAPIObservationVariableNewRequest observationVariableName(String observationVariableName) {
		this.observationVariableName = observationVariableName;
		return this;
	}

	public String getObservationVariableName() {
		return observationVariableName;
	}

	public void setObservationVariableName(String observationVariableName) {
		this.observationVariableName = observationVariableName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIObservationVariableNewRequest observationVariableNewRequest = (BrAPIObservationVariableNewRequest) o;
		return Objects.equals(this.observationVariableName, observationVariableNewRequest.observationVariableName)
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(observationVariableName, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ObservationVariableNewRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    observationVariableName: ").append(toIndentedString(observationVariableName)).append("\n");
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
