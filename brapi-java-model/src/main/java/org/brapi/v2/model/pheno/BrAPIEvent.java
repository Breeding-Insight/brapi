package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

/**
 * Event
 */

public class BrAPIEvent {
	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@Deprecated
	@JsonProperty("date")
	private List<OffsetDateTime> date = null;

	@JsonProperty("eventDateRange")
	private BrAPIEventDateRange eventDateRange = null;

	@JsonProperty("eventDbId")
	private String eventDbId = null;

	@JsonProperty("eventDescription")
	private String eventDescription = null;

	@JsonProperty("eventParameters")
	private List<BrAPIEventParameters> eventParameters = null;

	@JsonProperty("eventType")
	private String eventType = null;

	@JsonProperty("eventTypeDbId")
	private String eventTypeDbId = null;

	@JsonProperty("observationUnitDbIds")
	private List<String> observationUnitDbIds = null;

	@JsonProperty("studyDbId")
	private String studyDbId = null;

	@JsonProperty("studyName")
	private String studyName = null;

	private final transient Gson gson = new Gson();

	public BrAPIEvent additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIEvent putAdditionalInfoItem(String key, Object additionalInfoItem) {
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

	@Deprecated
	public BrAPIEvent date(List<OffsetDateTime> date) {
		this.date = date;
		return this;
	}

	@Deprecated
	public BrAPIEvent addDateItem(OffsetDateTime dateItem) {
		if (this.date == null) {
			this.date = new ArrayList<OffsetDateTime>();
		}
		this.date.add(dateItem);
		return this;
	}

	/**
	 * A list of dates when the event occured MIAPPE V1.1 (DM-68) Event date - Date
	 * and time of the event.
	 * 
	 * @return date
	 **/

	@Deprecated
	public List<OffsetDateTime> getDate() {
		return date;
	}

	@Deprecated
	public void setDate(List<OffsetDateTime> date) {
		this.date = date;
	}

	public BrAPIEvent eventDateRange(BrAPIEventDateRange eventDateRange) {
		this.eventDateRange = eventDateRange;
		return this;
	}

	/**
	 * Get eventDateRange
	 *
	 * @return eventDateRange
	 **/
	public BrAPIEventDateRange getEventDateRange() {
		return eventDateRange;
	}

	public void setEventDateRange(BrAPIEventDateRange eventDateRange) {
		this.eventDateRange = eventDateRange;
	}

	public BrAPIEvent eventDbId(String eventDbId) {
		this.eventDbId = eventDbId;
		return this;
	}

	/**
	 * Internal database identifier
	 * 
	 * @return eventDbId
	 **/

	public String getEventDbId() {
		return eventDbId;
	}

	public void setEventDbId(String eventDbId) {
		this.eventDbId = eventDbId;
	}

	public BrAPIEvent eventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
		return this;
	}

	/**
	 * A detailed, human-readable description of this event MIAPPE V1.1 (DM-67)
	 * Event description - Description of the event, including details such as
	 * amount applied and possibly duration of the event.
	 * 
	 * @return eventDescription
	 **/

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public BrAPIEvent eventParameters(List<BrAPIEventParameters> eventParameters) {
		this.eventParameters = eventParameters;
		return this;
	}

	public BrAPIEvent addEventParametersItem(BrAPIEventParameters eventParametersItem) {
		if (this.eventParameters == null) {
			this.eventParameters = new ArrayList<BrAPIEventParameters>();
		}
		this.eventParameters.add(eventParametersItem);
		return this;
	}

	/**
	 * A list of objects describing additional event parameters. Each of the
	 * following accepts a human-readable value or URI
	 * 
	 * @return eventParameters
	 **/

	public List<BrAPIEventParameters> getEventParameters() {
		return eventParameters;
	}

	public void setEventParameters(List<BrAPIEventParameters> eventParameters) {
		this.eventParameters = eventParameters;
	}

	public BrAPIEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * General category for this event (e.g. Sowing, Watering, Rain). Each eventType
	 * should correspond to exactly one eventTypeDbId, if provided. MIAPPE V1.1
	 * (DM-65) Event type - Short name of the event.
	 * 
	 * @return eventType
	 **/

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public BrAPIEvent eventTypeDbId(String eventTypeDbId) {
		this.eventTypeDbId = eventTypeDbId;
		return this;
	}

	/**
	 * An identifier for this event type, in the form of an ontology class reference
	 * MIAPPE V1.1 (DM-66) Event accession number - Accession number of the event
	 * type in a suitable controlled vocabulary (Crop Ontology).
	 * 
	 * @return eventTypeDbId
	 **/

	public String getEventTypeDbId() {
		return eventTypeDbId;
	}

	public void setEventTypeDbId(String eventTypeDbId) {
		this.eventTypeDbId = eventTypeDbId;
	}

	public BrAPIEvent observationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public BrAPIEvent addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
		if (this.observationUnitDbIds == null) {
			this.observationUnitDbIds = new ArrayList<String>();
		}
		this.observationUnitDbIds.add(observationUnitDbIdsItem);
		return this;
	}

	/**
	 * A list of the affected observation units. If this parameter is not given, it
	 * is understood that the event affected all units in the study
	 * 
	 * @return observationUnitDbIds
	 **/

	public List<String> getObservationUnitDbIds() {
		return observationUnitDbIds;
	}

	public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
	}

	public BrAPIEvent studyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
		return this;
	}

	/**
	 * The study in which the event occurred
	 * 
	 * @return studyDbId
	 **/

	public String getStudyDbId() {
		return studyDbId;
	}

	public void setStudyDbId(String studyDbId) {
		this.studyDbId = studyDbId;
	}

	public BrAPIEvent studyName(String studyName) {
		this.studyName = studyName;
		return this;
	}

	/**
	 * The human readable name of a study
	 *
	 * @return studyName
	 **/
	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIEvent event = (BrAPIEvent) o;
		return Objects.equals(this.additionalInfo, event.additionalInfo) && Objects.equals(this.date, event.date)
				&& Objects.equals(this.eventDbId, event.eventDbId)
				&& Objects.equals(this.eventDescription, event.eventDescription)
				&& Objects.equals(this.eventParameters, event.eventParameters)
				&& Objects.equals(this.eventType, event.eventType)
				&& Objects.equals(this.eventTypeDbId, event.eventTypeDbId)
				&& Objects.equals(this.observationUnitDbIds, event.observationUnitDbIds)
				&& Objects.equals(this.studyDbId, event.studyDbId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, date, eventDbId, eventDescription, eventParameters, eventType,
				eventTypeDbId, observationUnitDbIds, studyDbId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Event {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    eventDbId: ").append(toIndentedString(eventDbId)).append("\n");
		sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
		sb.append("    eventParameters: ").append(toIndentedString(eventParameters)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    eventTypeDbId: ").append(toIndentedString(eventTypeDbId)).append("\n");
		sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
		sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
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
