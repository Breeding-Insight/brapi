package org.brapi.v2.model.pheno;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.BrAPIOntologyReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

/**
 * Method
 */

public class BrAPIMethod {
	@JsonProperty("methodDbId")
	private String methodDbId = null;

	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("bibliographicalReference")
	private String bibliographicalReference = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("formula")
	private String formula = null;

	@JsonProperty("methodClass")
	private String methodClass = null;

	@JsonProperty("methodName")
	private String methodName = null;

	@JsonProperty("methodPUI")
	private String methodPUI = null;

	@JsonProperty("ontologyReference")
	private BrAPIOntologyReference ontologyReference = null;

	private final transient Gson gson = new Gson();

	public BrAPIMethod methodDbId(String methodDbId) {
		this.methodDbId = methodDbId;
		return this;
	}

	/**
	 * Method unique identifier
	 * 
	 * @return methodDbId
	 **/

	public String getMethodDbId() {
		return methodDbId;
	}

	public void setMethodDbId(String methodDbId) {
		this.methodDbId = methodDbId;
	}

	public BrAPIMethod additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIMethod putAdditionalInfoItem(String key, Object additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new JsonObject();
		}
		JsonElement newElement = gson.toJsonTree(additionalInfoItem);
		this.additionalInfo.add(key, newElement);
		return this;
	}

	/**
	 * Additional arbitrary info
	 *
	 * @return additionalInfo
	 **/

	public JsonObject getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPIMethod bibliographicalReference(String bibliographicalReference) {
		this.bibliographicalReference = bibliographicalReference;
		return this;
	}

	/**
	 * Bibliographical reference describing the method. MIAPPE V1.1 (DM-91)
	 * Reference associated to the method - URI/DOI of reference describing the
	 * method.
	 *
	 * @return bibliographicalReference
	 **/

	public String getBibliographicalReference() {
		return bibliographicalReference;
	}

	public void setBibliographicalReference(String bibliographicalReference) {
		this.bibliographicalReference = bibliographicalReference;
	}

	public BrAPIMethod description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Method description MIAPPE V1.1 (DM-90) Method description - Textual
	 * description of the method, which may extend a method defined in an external
	 * reference with specific parameters, e.g. growth stage, inoculation precise
	 * organ (leaf number)
	 *
	 * @return description
	 **/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BrAPIMethod externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 *
	 * @return externalReferences
	 **/

	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIMethod formula(String formula) {
		this.formula = formula;
		return this;
	}

	/**
	 * For computational methods i.e., when the method consists in assessing the
	 * trait by computing measurements, write the generic formula used for the
	 * calculation
	 *
	 * @return formula
	 **/

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public BrAPIMethod methodClass(String methodClass) {
		this.methodClass = methodClass;
		return this;
	}

	/**
	 * Method class (examples: \"Measurement\", \"Counting\", \"Estimation\",
	 * \"Computation\", etc.)
	 *
	 * @return methodClass
	 **/

	public String getMethodClass() {
		return methodClass;
	}

	public void setMethodClass(String methodClass) {
		this.methodClass = methodClass;
	}

	public BrAPIMethod methodName(String methodName) {
		this.methodName = methodName;
		return this;
	}

	/**
	 * Human readable name for the method MIAPPE V1.1 (DM-88) Method Name of the
	 * method of observation
	 *
	 * @return methodName
	 **/

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public BrAPIMethod ontologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
		return this;
	}

	public BrAPIMethod methodPUI(String methodPUI) {
		this.methodPUI = methodPUI;
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Method, usually in the form of a URI
	 *
	 * @return methodPUI
	 **/
	public String getMethodPUI() {
		return methodPUI;
	}

	public void setMethodPUI(String methodPUI) {
		this.methodPUI = methodPUI;
	}

	/**
	 * Get ontologyReference
	 *
	 * @return ontologyReference
	 **/

	public BrAPIOntologyReference getOntologyReference() {
		return ontologyReference;
	}

	public void setOntologyReference(BrAPIOntologyReference ontologyReference) {
		this.ontologyReference = ontologyReference;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIMethod method = (BrAPIMethod) o;
		return Objects.equals(this.additionalInfo, method.additionalInfo)
				&& Objects.equals(this.bibliographicalReference, method.bibliographicalReference)
				&& Objects.equals(this.description, method.description)
				&& Objects.equals(this.externalReferences, method.externalReferences)
				&& Objects.equals(this.formula, method.formula) && Objects.equals(this.methodClass, method.methodClass)
				&& Objects.equals(this.methodDbId, method.methodDbId)
				&& Objects.equals(this.methodName, method.methodName)
				&& Objects.equals(this.methodPUI, method.methodPUI)
				&& Objects.equals(this.ontologyReference, method.ontologyReference);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, bibliographicalReference, description, externalReferences, formula,
				methodClass, methodDbId, methodName, methodPUI, ontologyReference);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Method {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    bibliographicalReference: ").append(toIndentedString(bibliographicalReference)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
		sb.append("    methodClass: ").append(toIndentedString(methodClass)).append("\n");
		sb.append("    methodDbId: ").append(toIndentedString(methodDbId)).append("\n");
		sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
		sb.append("    methodPUI: ").append(toIndentedString(methodPUI)).append("\n");
		sb.append("    ontologyReference: ").append(toIndentedString(ontologyReference)).append("\n");
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
