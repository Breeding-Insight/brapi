package org.brapi.v2.model.germ;

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

}
