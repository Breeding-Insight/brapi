package org.brapi.v2.model.core;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIWSMIMEDataTypes;

/**
 * Service
 */


public class BrAPIService {
	/**
	 * Gets or Sets methods
	 */
	public enum MethodsEnum {
		GET("GET"),

		POST("POST"),

		PUT("PUT"),

		DELETE("DELETE");

		@JsonCreator
		public static MethodsEnum fromValue(String text) {
			for (MethodsEnum b : MethodsEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		MethodsEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	/**
	 * Gets or Sets versions
	 */
	public enum VersionsEnum {
		_0("2.0"),

		_1("2.1"),

		_2("2.2");

		@JsonCreator
		public static VersionsEnum fromValue(String text) {
			for (VersionsEnum b : VersionsEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		VersionsEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	@JsonProperty("dataTypes")
	@Valid
	private List<BrAPIWSMIMEDataTypes> dataTypes = null;

	@JsonProperty("methods")
	@Valid
	private List<MethodsEnum> methods = new ArrayList<MethodsEnum>();

	@JsonProperty("service")
	private String service = null;
	@JsonProperty("versions")
	@Valid
	private List<VersionsEnum> versions = new ArrayList<VersionsEnum>();

	public BrAPIService addDataTypesItem(BrAPIWSMIMEDataTypes dataTypesItem) {
		if (this.dataTypes == null) {
			this.dataTypes = new ArrayList<BrAPIWSMIMEDataTypes>();
		}
		this.dataTypes.add(dataTypesItem);
		return this;
	}

	public BrAPIService addMethodsItem(MethodsEnum methodsItem) {
		this.methods.add(methodsItem);
		return this;
	}

	public BrAPIService addVersionsItem(VersionsEnum versionsItem) {
		this.versions.add(versionsItem);
		return this;
	}

	public BrAPIService dataTypes(List<BrAPIWSMIMEDataTypes> dataTypes) {
		this.dataTypes = dataTypes;
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
		BrAPIService service = (BrAPIService) o;
		return Objects.equals(this.dataTypes, service.dataTypes) && Objects.equals(this.methods, service.methods)
				&& Objects.equals(this.service, service.service) && Objects.equals(this.versions, service.versions);
	}

	/**
	 * The possible data formats returned by the available call
	 * 
	 * @return dataTypes
	 **/
	
	@Valid
	public List<BrAPIWSMIMEDataTypes> getDataTypes() {
		return dataTypes;
	}

	/**
	 * The possible HTTP Methods to be used with the available call
	 * 
	 * @return methods
	 **/
	
	

	public List<MethodsEnum> getMethods() {
		return methods;
	}

	/**
	 * The name of the available call as recorded in the documentation
	 * 
	 * @return service
	 **/
	
	

	public String getService() {
		return service;
	}

	/**
	 * The supported versions of a particular call
	 * 
	 * @return versions
	 **/
	
	

	public List<VersionsEnum> getVersions() {
		return versions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataTypes, methods, service, versions);
	}

	public BrAPIService methods(List<MethodsEnum> methods) {
		this.methods = methods;
		return this;
	}

	public BrAPIService service(String service) {
		this.service = service;
		return this;
	}

	public void setDataTypes(List<BrAPIWSMIMEDataTypes> dataTypes) {
		this.dataTypes = dataTypes;
	}

	public void setMethods(List<MethodsEnum> methods) {
		this.methods = methods;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setVersions(List<VersionsEnum> versions) {
		this.versions = versions;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Service {\n");

		sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
		sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
		sb.append("    service: ").append(toIndentedString(service)).append("\n");
		sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BrAPIService versions(List<VersionsEnum> versions) {
		this.versions = versions;
		return this;
	}
}
