package org.brapi.v2.model.core;

import com.google.gson.JsonObject;
import org.brapi.v2.model.BrAPIExternalReference;

import java.util.List;
import java.util.Map;

import java.time.OffsetDateTime;

public interface BrAPIListBaseFieldsInterface {

	public BrAPIListBaseFieldsInterface additionalInfo(JsonObject additionalInfo);

	public BrAPIListBaseFieldsInterface putAdditionalInfoItem(String key, Object additionalInfoItem);

	public JsonObject getAdditionalInfo();

	public void setAdditionalInfo(JsonObject additionalInfo);

	public BrAPIListBaseFieldsInterface dateCreated(OffsetDateTime dateCreated);

	public OffsetDateTime getDateCreated();

	public void setDateCreated(OffsetDateTime dateCreated);

	public BrAPIListBaseFieldsInterface dateModified(OffsetDateTime dateModified);

	public OffsetDateTime getDateModified();

	public void setDateModified(OffsetDateTime dateModified);

	public BrAPIListBaseFieldsInterface externalReferences(List<BrAPIExternalReference> externalReferences);

	public List<BrAPIExternalReference> getExternalReferences();

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences);

	public BrAPIListBaseFieldsInterface listDescription(String listDescription);

	public String getListDescription();

	public void setListDescription(String listDescription);

	public BrAPIListBaseFieldsInterface listName(String listName);

	public String getListName();

	public void setListName(String listName);

	public BrAPIListBaseFieldsInterface listOwnerName(String listOwnerName);

	public String getListOwnerName();

	public void setListOwnerName(String listOwnerName);

	public BrAPIListBaseFieldsInterface listOwnerPersonDbId(String listOwnerPersonDbId);

	public String getListOwnerPersonDbId();

	public void setListOwnerPersonDbId(String listOwnerPersonDbId);

	public BrAPIListBaseFieldsInterface listSize(Integer listSize);

	public Integer getListSize();

	public void setListSize(Integer listSize);

	public BrAPIListBaseFieldsInterface listSource(String listSource);

	public String getListSource();

	public void setListSource(String listSource);

	public BrAPIListBaseFieldsInterface listType(BrAPIListTypes listType);

	public BrAPIListTypes getListType();

	public void setListType(BrAPIListTypes listType);

}
