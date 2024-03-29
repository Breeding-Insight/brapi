package org.brapi.v2.model.core;

import java.time.OffsetDateTime;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIDataLink;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;
import org.brapi.v2.model.pheno.BrAPIObservationUnitHierarchyLevel;

/**
 * Study
 */

public class BrAPIStudy {
	@JsonProperty("studyDbId")
	private String studyDbId = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("contacts")
	private List<BrAPIContact> contacts = null;

	@JsonProperty("culturalPractices")
	private String culturalPractices = null;

	@JsonProperty("dataLinks")
	private List<BrAPIDataLink> dataLinks = null;

	@JsonProperty("documentationURL")
	private String documentationURL = null;

	@JsonProperty("endDate")
	private OffsetDateTime endDate = null;

	@JsonProperty("environmentParameters")
	private List<BrAPIEnvironmentParameter> environmentParameters = null;

	@JsonProperty("experimentalDesign")
	private BrAPIStudyExperimentalDesign experimentalDesign = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("growthFacility")
	private BrAPIStudyGrowthFacility growthFacility = null;

	@JsonProperty("lastUpdate")
	private BrAPIStudyLastUpdate lastUpdate = null;

	@JsonProperty("license")
	private String license = null;

	@JsonProperty("locationDbId")
	private String locationDbId = null;

	@JsonProperty("locationName")
	private String locationName = null;

	@JsonProperty("observationLevels")
	private List<BrAPIObservationUnitHierarchyLevel> observationLevels = null;

	@JsonProperty("observationUnitsDescription")
	private String observationUnitsDescription = null;

	@JsonProperty("observationVariableDbIds")
	private List<String> observationVariableDbIds = null;

	@JsonProperty("seasons")
	private List<String> seasons = null;

	@JsonProperty("startDate")
	private OffsetDateTime startDate = null;

	@JsonProperty("studyCode")
	private String studyCode = null;

	@JsonProperty("studyDescription")
	private String studyDescription = null;

	@JsonProperty("studyName")
	private String studyName = null;

	@JsonProperty("studyPUI")
	private String studyPUI = null;

	@JsonProperty("studyType")
	private String studyType = null;

	@JsonProperty("trialDbId")
	private String trialDbId = null;

	@JsonProperty("trialName")
	private String trialName = null;

	private final transient Gson gson = new Gson();

	/**
	 * The ID which uniquely identifies a study within the given database server
	 * MIAPPE V1.1 (DM-11) Study unique ID - Unique identifier comprising the name
	 * or identifier for the institution/database hosting the submission of the
	 * study data, and the identifier of the study in that institution.
	 * 
	 * @return studyDbId
	 **/

	public String getStudyDbId() {
		return studyDbId;
	}

	public void setStudyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
	}

	public BrAPIStudy studyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
		return this;
	}

	public BrAPIStudy active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Is this study currently active
	 * 
	 * @return active
	 **/

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public BrAPIStudy additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIStudy putAdditionalInfoItem(String key, Object additionalInfoItem) {
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

	public BrAPIStudy commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Common name for the crop associated with this study
	 * 
	 * @return commonCropName
	 **/

	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPIStudy contacts(List<BrAPIContact> contacts) {
		this.contacts = contacts;
		return this;
	}

	public BrAPIStudy addContactsItem(BrAPIContact contactsItem) {
		if (this.contacts == null) {
			this.contacts = new ArrayList<BrAPIContact>();
		}
		this.contacts.add(contactsItem);
		return this;
	}

	/**
	 * List of contact entities associated with this study
	 * 
	 * @return contacts
	 **/

	public List<BrAPIContact> getContacts() {
		return contacts;
	}

	public void setContacts(List<BrAPIContact> contacts) {
		this.contacts = contacts;
	}

	public BrAPIStudy culturalPractices(String culturalPractices) {
		this.culturalPractices = culturalPractices;
		return this;
	}

	/**
	 * MIAPPE V1.1 (DM-28) Cultural practices - General description of the cultural
	 * practices of the study.
	 * 
	 * @return culturalPractices
	 **/

	public String getCulturalPractices() {
		return culturalPractices;
	}

	public void setCulturalPractices(String culturalPractices) {
		this.culturalPractices = culturalPractices;
	}

	public BrAPIStudy dataLinks(List<BrAPIDataLink> dataLinks) {
		this.dataLinks = dataLinks;
		return this;
	}

	public BrAPIStudy addDataLinksItem(BrAPIDataLink dataLinksItem) {
		if (this.dataLinks == null) {
			this.dataLinks = new ArrayList<BrAPIDataLink>();
		}
		this.dataLinks.add(dataLinksItem);
		return this;
	}

	/**
	 * List of links to extra data files associated with this study. Extra data
	 * could include notes, images, and reference data.
	 * 
	 * @return dataLinks
	 **/

	public List<BrAPIDataLink> getDataLinks() {
		return dataLinks;
	}

	public void setDataLinks(List<BrAPIDataLink> dataLinks) {
		this.dataLinks = dataLinks;
	}

	public BrAPIStudy documentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
		return this;
	}

	/**
	 * A URL to the human readable documentation of this object
	 * 
	 * @return documentationURL
	 **/

	public String getDocumentationURL() {
		return documentationURL;
	}

	public void setDocumentationURL(String documentationURL) {
		this.documentationURL = documentationURL;
	}

	public BrAPIStudy endDate(OffsetDateTime endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * The date the study ends MIAPPE V1.1 (DM-15) End date of study - Date and, if
	 * relevant, time when the experiment ended
	 * 
	 * @return endDate
	 **/

	public OffsetDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	public BrAPIStudy environmentParameters(List<BrAPIEnvironmentParameter> environmentParameters) {
		this.environmentParameters = environmentParameters;
		return this;
	}

	public BrAPIStudy addEnvironmentParametersItem(BrAPIEnvironmentParameter environmentParametersItem) {
		if (this.environmentParameters == null) {
			this.environmentParameters = new ArrayList<BrAPIEnvironmentParameter>();
		}
		this.environmentParameters.add(environmentParametersItem);
		return this;
	}

	/**
	 * Environmental parameters that were kept constant throughout the study and did
	 * not change between observation units.
	 * 
	 * @return environmentParameters
	 **/

	public List<BrAPIEnvironmentParameter> getEnvironmentParameters() {
		return environmentParameters;
	}

	public void setEnvironmentParameters(List<BrAPIEnvironmentParameter> environmentParameters) {
		this.environmentParameters = environmentParameters;
	}

	public BrAPIStudy experimentalDesign(BrAPIStudyExperimentalDesign experimentalDesign) {
		this.experimentalDesign = experimentalDesign;
		return this;
	}

	/**
	 * Get experimentalDesign
	 * 
	 * @return experimentalDesign
	 **/

	public BrAPIStudyExperimentalDesign getExperimentalDesign() {
		return experimentalDesign;
	}

	public void setExperimentalDesign(BrAPIStudyExperimentalDesign experimentalDesign) {
		this.experimentalDesign = experimentalDesign;
	}

	public BrAPIStudy externalReferences(List<BrAPIExternalReference> externalReferences) {
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

	public BrAPIStudy growthFacility(BrAPIStudyGrowthFacility growthFacility) {
		this.growthFacility = growthFacility;
		return this;
	}

	/**
	 * Get growthFacility
	 * 
	 * @return growthFacility
	 **/

	public BrAPIStudyGrowthFacility getGrowthFacility() {
		return growthFacility;
	}

	public void setGrowthFacility(BrAPIStudyGrowthFacility growthFacility) {
		this.growthFacility = growthFacility;
	}

	public BrAPIStudy lastUpdate(BrAPIStudyLastUpdate lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get lastUpdate
	 * 
	 * @return lastUpdate
	 **/

	public BrAPIStudyLastUpdate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(BrAPIStudyLastUpdate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public BrAPIStudy license(String license) {
		this.license = license;
		return this;
	}

	/**
	 * The usage license associated with the study data
	 * 
	 * @return license
	 **/

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public BrAPIStudy locationDbId(String locationDbId) {
		this.locationDbId = locationDbId;
		return this;
	}

	/**
	 * The unique identifier for a Location
	 * 
	 * @return locationDbId
	 **/

	public String getLocationDbId() {
		return locationDbId;
	}

	public void setLocationDbId(String locationDbId) {
		this.locationDbId = locationDbId;
	}

	public BrAPIStudy locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	/**
	 * A human readable name for this location MIAPPE V1.1 (DM-18) Experimental site
	 * name - The name of the natural site, experimental field, greenhouse,
	 * phenotyping facility, etc. where the experiment took place.
	 * 
	 * @return locationName
	 **/

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public BrAPIStudy observationLevels(List<BrAPIObservationUnitHierarchyLevel> observationLevels) {
		this.observationLevels = observationLevels;
		return this;
	}

	public BrAPIStudy addObservationLevelsItem(BrAPIObservationUnitHierarchyLevel observationLevelsItem) {
		if (this.observationLevels == null) {
			this.observationLevels = new ArrayList<BrAPIObservationUnitHierarchyLevel>();
		}
		this.observationLevels.add(observationLevelsItem);
		return this;
	}

	/**
	 * Observation levels indicate the granularity level at which the measurements
	 * are taken. `levelName` defines the level, `levelOrder` defines where that
	 * level exists in the hierarchy of levels. `levelOrder`s lower numbers are at
	 * the top of the hierarchy (ie field > 0) and higher numbers are at the bottom
	 * of the hierarchy (ie plant > 6).
	 * 
	 * @return observationLevels
	 **/

	public List<BrAPIObservationUnitHierarchyLevel> getObservationLevels() {
		return observationLevels;
	}

	public void setObservationLevels(List<BrAPIObservationUnitHierarchyLevel> observationLevels) {
		this.observationLevels = observationLevels;
	}

	public BrAPIStudy observationUnitsDescription(String observationUnitsDescription) {
		this.observationUnitsDescription = observationUnitsDescription;
		return this;
	}

	/**
	 * MIAPPE V1.1 (DM-25) Observation unit description - General description of the
	 * observation units in the study.
	 * 
	 * @return observationUnitsDescription
	 **/

	public String getObservationUnitsDescription() {
		return observationUnitsDescription;
	}

	public void setObservationUnitsDescription(String observationUnitsDescription) {
		this.observationUnitsDescription = observationUnitsDescription;
	}

	public BrAPIStudy observationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public BrAPIStudy addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
		if (this.observationVariableDbIds == null) {
			this.observationVariableDbIds = new ArrayList<String>();
		}
		this.observationVariableDbIds.add(observationVariableDbIdsItem);
		return this;
	}

	/**
	 * List of observationVariableDbIds over which this study was performed.
	 * 
	 * @return observationVariableDbIds
	 **/

	public List<String> getObservationVariableDbIds() {
		return observationVariableDbIds;
	}

	public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
	}

	public BrAPIStudy seasons(List<String> seasons) {
		this.seasons = seasons;
		return this;
	}

	public BrAPIStudy addSeasonsItem(String seasonsItem) {
		if (this.seasons == null) {
			this.seasons = new ArrayList<String>();
		}
		this.seasons.add(seasonsItem);
		return this;
	}

	/**
	 * List of seasons over which this study was performed.
	 * 
	 * @return seasons
	 **/

	public List<String> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<String> seasons) {
		this.seasons = seasons;
	}

	public BrAPIStudy startDate(OffsetDateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * The date this study started MIAPPE V1.1 (DM-14) Start date of study - Date
	 * and, if relevant, time when the experiment started
	 * 
	 * @return startDate
	 **/

	public OffsetDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public BrAPIStudy studyCode(String studyCode) {
		this.studyCode = studyCode;
		return this;
	}

	/**
	 * A short human readable code for a study
	 * 
	 * @return studyCode
	 **/

	public String getStudyCode() {
		return studyCode;
	}

	public void setStudyCode(String studyCode) {
		this.studyCode = studyCode;
	}

	public BrAPIStudy studyDescription(String studyDescription) {
		this.studyDescription = studyDescription;
		return this;
	}

	/**
	 * The description of this study MIAPPE V1.1 (DM-13) Study description -
	 * Human-readable text describing the study
	 * 
	 * @return studyDescription
	 **/

	public String getStudyDescription() {
		return studyDescription;
	}

	public void setStudyDescription(String studyDescription) {
		this.studyDescription = studyDescription;
	}

	public BrAPIStudy studyName(String studyName) {
		this.studyName = studyName;
		return this;
	}

	/**
	 * The human readable name for a study MIAPPE V1.1 (DM-12) Study title -
	 * Human-readable text summarising the study
	 * 
	 * @return studyName
	 **/

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public BrAPIStudy studyPUI(String studyPUI) {
		this.studyPUI = studyPUI;
		return this;
	}

	/**
	 * A permanent unique identifier associated with this study data. For example, a
	 * URI or DOI
	 * 
	 * @return studyPUI
	 **/

	public String getStudyPUI() {
		return studyPUI;
	}

	public void setStudyPUI(String studyPUI) {
		this.studyPUI = studyPUI;
	}

	public BrAPIStudy studyType(String studyType) {
		this.studyType = studyType;
		return this;
	}

	/**
	 * The type of study being performed. ex. \"Yield Trial\", etc
	 * 
	 * @return studyType
	 **/

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public BrAPIStudy trialDbId(String trialDbId) {
		this.trialDbId = trialDbId;
		return this;
	}

	/**
	 * The ID which uniquely identifies a trial
	 * 
	 * @return trialDbId
	 **/

	public String getTrialDbId() {
		return trialDbId;
	}

	public void setTrialDbId(String trialDbId) {
		this.trialDbId = trialDbId;
	}

	public BrAPIStudy trialName(String trialName) {
		this.trialName = trialName;
		return this;
	}

	/**
	 * The human readable name of a trial
	 * 
	 * @return trialName
	 **/

	public String getTrialName() {
		return trialName;
	}

	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIStudy study = (BrAPIStudy) o;
		return Objects.equals(this.studyDbId, study.studyDbId) && Objects.equals(this.active, study.active)
				&& Objects.equals(this.additionalInfo, study.additionalInfo)
				&& Objects.equals(this.commonCropName, study.commonCropName)
				&& Objects.equals(this.contacts, study.contacts)
				&& Objects.equals(this.culturalPractices, study.culturalPractices)
				&& Objects.equals(this.dataLinks, study.dataLinks)
				&& Objects.equals(this.documentationURL, study.documentationURL)
				&& Objects.equals(this.endDate, study.endDate)
				&& Objects.equals(this.environmentParameters, study.environmentParameters)
				&& Objects.equals(this.experimentalDesign, study.experimentalDesign)
				&& Objects.equals(this.externalReferences, study.externalReferences)
				&& Objects.equals(this.growthFacility, study.growthFacility)
				&& Objects.equals(this.lastUpdate, study.lastUpdate) && Objects.equals(this.license, study.license)
				&& Objects.equals(this.locationDbId, study.locationDbId)
				&& Objects.equals(this.locationName, study.locationName)
				&& Objects.equals(this.observationLevels, study.observationLevels)
				&& Objects.equals(this.observationUnitsDescription, study.observationUnitsDescription)
				&& Objects.equals(this.seasons, study.seasons)
				&& Objects.equals(this.observationVariableDbIds, study.observationVariableDbIds)
				&& Objects.equals(this.startDate, study.startDate) && Objects.equals(this.studyCode, study.studyCode)
				&& Objects.equals(this.studyDescription, study.studyDescription)
				&& Objects.equals(this.studyName, study.studyName) && Objects.equals(this.studyPUI, study.studyPUI)
				&& Objects.equals(this.studyType, study.studyType) && Objects.equals(this.trialDbId, study.trialDbId)
				&& Objects.equals(this.trialName, study.trialName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studyDbId, active, additionalInfo, commonCropName, contacts, culturalPractices, dataLinks,
				documentationURL, endDate, environmentParameters, experimentalDesign, externalReferences,
				growthFacility, lastUpdate, license, locationDbId, locationName, observationLevels,
				observationUnitsDescription, observationVariableDbIds, seasons, startDate, studyCode, studyDescription,
				studyName, studyPUI, studyType, trialDbId, trialName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Study{\n");
		sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
		sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
		sb.append("    culturalPractices: ").append(toIndentedString(culturalPractices)).append("\n");
		sb.append("    dataLinks: ").append(toIndentedString(dataLinks)).append("\n");
		sb.append("    documentationURL: ").append(toIndentedString(documentationURL)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("    environmentParameters: ").append(toIndentedString(environmentParameters)).append("\n");
		sb.append("    experimentalDesign: ").append(toIndentedString(experimentalDesign)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    growthFacility: ").append(toIndentedString(growthFacility)).append("\n");
		sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
		sb.append("    license: ").append(toIndentedString(license)).append("\n");
		sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
		sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
		sb.append("    observationLevels: ").append(toIndentedString(observationLevels)).append("\n");
		sb.append("    observationUnitsDescription: ").append(toIndentedString(observationUnitsDescription))
				.append("\n");
		sb.append("    ObservationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
		sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    studyCode: ").append(toIndentedString(studyCode)).append("\n");
		sb.append("    studyDescription: ").append(toIndentedString(studyDescription)).append("\n");
		sb.append("    studyName: ").append(toIndentedString(studyName)).append("\n");
		sb.append("    studyPUI: ").append(toIndentedString(studyPUI)).append("\n");
		sb.append("    studyType: ").append(toIndentedString(studyType)).append("\n");
		sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
		sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
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
