package org.brapi.v2.model.germ;

import java.util.Objects;

public class BrAPIGermplasmStorageTypes {
	private BrAPIGermplasmStorageTypesEnum code;
	private String description;

	public BrAPIGermplasmStorageTypes(BrAPIGermplasmStorageTypesEnum code) {
		this.code = code;
		this.description = code.getDescription();
	}

	public BrAPIGermplasmStorageTypesEnum getCode() {
		return code;
	}

	public void setCode(BrAPIGermplasmStorageTypesEnum code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o != null && this.getClass() == o.getClass()) {
			BrAPIGermplasmStorageTypes germplasmStorageType = (BrAPIGermplasmStorageTypes)o;
			return Objects.equals(this.code, germplasmStorageType.code) && Objects.equals(this.description, germplasmStorageType.description);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return Objects.hash(this.code, this.description);
	}

	public String toString() {
        return "class BrAPIGermplasmStorageTypes {\n" +
                "    code: " + this.toIndentedString(this.code) + "\n" +
                "    description: " + this.toIndentedString(this.description) + "\n" +
                "}";
	}

	private String toIndentedString(Object o) {
		return o == null ? "null" : o.toString().replace("\n", "\n    ");
	}
}
