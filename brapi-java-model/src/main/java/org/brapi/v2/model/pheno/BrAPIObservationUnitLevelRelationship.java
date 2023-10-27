package org.brapi.v2.model.pheno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ObservationUnitLevelRelationship
 */

public class BrAPIObservationUnitLevelRelationship extends BrAPIObservationUnitHierarchyLevel {
	@JsonProperty("levelCode")
	private String levelCode = null;

	@JsonProperty("observationUnitDbId")
	private String observationUnitDbId = null;

	public BrAPIObservationUnitLevelRelationship levelCode(String levelCode) {
		this.levelCode = levelCode;
		return this;
	}

	/**
	 * An ID code for this level tag. Identify this observation unit by each level
	 * of the hierarchy where it exists
	 * 
	 * @return levelCode
	 **/

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public BrAPIObservationUnitLevelRelationship observationUnitDbId(String observationUnitDbId) {
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}

	/**
	 * An ID code for this level tag. Identify this observation unit by each level
	 * of the hierarchy where it exists
	 * 
	 * @return levelCode
	 **/

	public String getObservationUnitDbId() {
		return observationUnitDbId;
	}

	public void setObservationUnitDbId(String observationUnitDbId) {
		this.observationUnitDbId = observationUnitDbId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIObservationUnitLevelRelationship observationUnitLevelRelationship = (BrAPIObservationUnitLevelRelationship) o;
		return Objects.equals(this.levelCode, observationUnitLevelRelationship.levelCode) 
				&& Objects.equals(this.observationUnitDbId, observationUnitLevelRelationship.observationUnitDbId) 
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(levelCode, observationUnitDbId, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ObservationUnitLevelRelationship {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    levelCode: ").append(toIndentedString(levelCode)).append("\n");
		sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
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
