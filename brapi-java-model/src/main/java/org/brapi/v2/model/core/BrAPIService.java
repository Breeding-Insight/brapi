package org.brapi.v2.model.core;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPIEnum;
import org.brapi.v2.model.BrAPIWSMIMEDataTypes;

/**
 * Service
 */

public class BrAPIService {

	@JsonProperty("contentTypes")
	private List<BrAPIWSMIMEDataTypes> contentTypes = null;

	@Deprecated
	@JsonProperty("dataTypes")
	private List<BrAPIWSMIMEDataTypes> dataTypes = null;

	@JsonProperty("methods")
	private List<MethodsEnum> methods = new ArrayList<MethodsEnum>();

	@JsonProperty("service")
	private String service = null;

	@JsonProperty("versions")
	private List<VersionsEnum> versions = new ArrayList<VersionsEnum>();

	public BrAPIService addContentTypesItem(BrAPIWSMIMEDataTypes contentTypesItem) {
		if (this.contentTypes == null) {
			this.contentTypes = new ArrayList<BrAPIWSMIMEDataTypes>();
		}
		this.contentTypes.add(contentTypesItem);
		return this;
	}

	public BrAPIService contentTypes(List<BrAPIWSMIMEDataTypes> contentTypes) {
		this.contentTypes = contentTypes;
		return this;
	}

	public List<BrAPIWSMIMEDataTypes> getContentTypes() {
		return contentTypes;
	}

	public void setContentTypes(List<BrAPIWSMIMEDataTypes> contentTypes) {
		this.contentTypes = contentTypes;
	}

	@Deprecated
	public BrAPIService addDataTypesItem(BrAPIWSMIMEDataTypes dataTypesItem) {
		if (this.dataTypes == null) {
			this.dataTypes = new ArrayList<BrAPIWSMIMEDataTypes>();
		}
		this.dataTypes.add(dataTypesItem);
		return this;
	}

	@Deprecated
	public BrAPIService dataTypes(List<BrAPIWSMIMEDataTypes> dataTypes) {
		this.dataTypes = dataTypes;
		return this;
	}

	@Deprecated
	public List<BrAPIWSMIMEDataTypes> getDataTypes() {
		return dataTypes;
	}

	@Deprecated
	public void setDataTypes(List<BrAPIWSMIMEDataTypes> dataTypes) {
		this.dataTypes = dataTypes;
	}

	public BrAPIService addMethodsItem(MethodsEnum methodsItem) {
		this.methods.add(methodsItem);
		return this;
	}

	public List<MethodsEnum> getMethods() {
		return methods;
	}

	public BrAPIService methods(List<MethodsEnum> methods) {
		this.methods = methods;
		return this;
	}

	public void setMethods(List<MethodsEnum> methods) {
		this.methods = methods;
	}

	public String getService() {
		return service;
	}

	public BrAPIService service(String service) {
		this.service = service;
		return this;
	}

	public void setService(String service) {
		this.service = service;
	}

	public BrAPIService addVersionsItem(VersionsEnum versionsItem) {
		this.versions.add(versionsItem);
		return this;
	}

	public List<VersionsEnum> getVersions() {
		return versions;
	}

	public void setVersions(List<VersionsEnum> versions) {
		this.versions = versions;
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
		return Objects.equals(this.dataTypes, service.dataTypes)
				&& Objects.equals(this.contentTypes, service.contentTypes)
				&& Objects.equals(this.methods, service.methods) && Objects.equals(this.service, service.service)
				&& Objects.equals(this.versions, service.versions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataTypes, methods, service, versions);
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

	public enum MethodsEnum implements BrAPIEnum {
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

		@Override
		public String getBrapiValue() {
			// TODO Auto-generated method stub
			return value;
		}
	}

	/**
	 * Gets or Sets versions
	 */
	public enum VersionsEnum implements BrAPIEnum {
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

		@Override
		public String getBrapiValue() {
			return value;
		}
	}
}
