package org.brapi.v2.model.germ;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;

/**
 * BrAPISeedLot
 */

public class BrAPISeedLot {
	@JsonProperty("additionalInfo")
	@JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("amount")
	private BigDecimal amount = null;

	@JsonProperty("contentMixture")
	private List<BrAPISeedLotContentMixture> contentMixture = null;

	@JsonProperty("createdDate")
	private OffsetDateTime createdDate = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@Deprecated
	@JsonProperty("germplasmDbId")
	private String germplasmDbId = null;

	@JsonProperty("lastUpdated")
	private OffsetDateTime lastUpdated = null;

	@JsonProperty("locationDbId")
	private String locationDbId = null;

	@JsonProperty("locationName")
	private String locationName = null;

	@JsonProperty("programDbId")
	private String programDbId = null;

	@JsonProperty("programName")
	private String programName = null;

	@JsonProperty("seedLotDbId")
	private String seedLotDbId = null;

	@JsonProperty("seedLotDescription")
	private String seedLotDescription = null;

	@JsonProperty("seedLotName")
	private String seedLotName = null;

	@JsonProperty("sourceCollection")
	private String sourceCollection = null;

	@JsonProperty("storageLocation")
	private String storageLocation = null;

	@JsonProperty("units")
	private String units = null;

	private final transient Gson gson = new Gson();

	public BrAPISeedLot additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPISeedLot putAdditionalInfoItem(String key, Object additionalInfoItem) {
		if (this.additionalInfo == null) {
			this.additionalInfo = new JsonObject();
		}
		JsonElement newElement = gson.toJsonTree(additionalInfoItem);
		this.additionalInfo.add(key, newElement);
		return this;
	}

	/**
	 * A free space containing any additional information related to a particular
	 * object. A data source may provide any JSON object, unrestriced by the BrAPI
	 * specification.
	 *
	 * @return additionalInfo
	 **/

	public JsonObject getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPISeedLot amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * The current balance of the amount of material in a BrAPISeedLot. Could be a
	 * count (seeds, bulbs, etc) or a weight (kg of seed).
	 *
	 * @return amount
	 **/

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BrAPISeedLot contentMixture(List<BrAPISeedLotContentMixture> contentMixture) {
		this.contentMixture = contentMixture;
		return this;
	}

	public BrAPISeedLot addContentMixtureItem(BrAPISeedLotContentMixture contentMixtureItem) {
		if (this.contentMixture == null) {
			this.contentMixture = new ArrayList<BrAPISeedLotContentMixture>();
		}
		this.contentMixture.add(contentMixtureItem);
		return this;
	}

	/**
	 * The mixture of germplasm present in the seed lot. &lt;br/&gt; If this seed
	 * lot only contains a single germplasm, the response should contain the name
	 * and DbId of that germplasm with a mixturePercentage value of 100 &lt;br/&gt;
	 * If the seed lot contains a mixture of different germplasm, the response
	 * should contain the name and DbId every germplasm present. The
	 * mixturePercentage field should contain the ratio of each germplasm in the
	 * total mixture. All of the mixturePercentage values in this array should sum
	 * to equal 100.
	 *
	 * @return contentMixture
	 **/

	public List<BrAPISeedLotContentMixture> getContentMixture() {
		return contentMixture;
	}

	public void setContentMixture(List<BrAPISeedLotContentMixture> contentMixture) {
		this.contentMixture = contentMixture;
	}

	public BrAPISeedLot createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	/**
	 * The time stamp for when this seed lot was created
	 *
	 * @return createdDate
	 **/

	public OffsetDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public BrAPISeedLot externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	public BrAPISeedLot addExternalReferencesItem(BrAPIExternalReference externalReferencesItem) {
		if (this.externalReferences == null) {
			this.externalReferences = new ArrayList<BrAPIExternalReference>();
		}
		this.externalReferences.add(externalReferencesItem);
		return this;
	}

	/**
	 * An array of external reference ids. These are references to this piece of
	 * data in an external system. Could be a simple string or a URI.
	 *
	 * @return externalReferences
	 **/

	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	@Deprecated
	public BrAPISeedLot germplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	/**
	 * The unique identifier for a Location
	 *
	 * @return locationDbId
	 **/

	@Deprecated
	public String getGermplasmDbId() {
		return germplasmDbId;
	}

	@Deprecated
	public void setGermplasmDbId(String germplasmDbId) {
		this.germplasmDbId = germplasmDbId;
	}

	public BrAPISeedLot lastUpdated(OffsetDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
		return this;
	}

	/**
	 * The timestamp for the last update to this Seed Lot (including transactions)
	 *
	 * @return lastUpdated
	 **/

	public OffsetDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(OffsetDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public BrAPISeedLot locationDbId(String locationDbId) {
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

	public BrAPISeedLot locationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	/**
	 * A human readable name for a location
	 *
	 * @return locationName
	 **/

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public BrAPISeedLot programDbId(String programDbId) {
		this.programDbId = programDbId;
		return this;
	}

	/**
	 * The unique DbId of the breeding program this Seed Lot belongs to
	 *
	 * @return programDbId
	 **/

	public String getProgramDbId() {
		return programDbId;
	}

	public void setProgramDbId(String programDbId) {
		this.programDbId = programDbId;
	}

	public BrAPISeedLot programName(String programName) {
		this.programName = programName;
		return this;
	}

	/**
	 * The human readable name of the breeding program this Seed Lot belongs to
	 *
	 * @return programName
	 **/

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public BrAPISeedLot seedLotDbId(String seedLotDbId) {
		this.seedLotDbId = seedLotDbId;
		return this;
	}

	/**
	 * Unique DbId for the Seed Lot
	 *
	 * @return seedLotDbId
	 **/

	public String getSeedLotDbId() {
		return seedLotDbId;
	}

	public void setSeedLotDbId(String seedLotDbId) {
		this.seedLotDbId = seedLotDbId;
	}

	public BrAPISeedLot seedLotDescription(String seedLotDescription) {
		this.seedLotDescription = seedLotDescription;
		return this;
	}

	/**
	 * A general description of this Seed Lot
	 *
	 * @return seedLotDescription
	 **/

	public String getSeedLotDescription() {
		return seedLotDescription;
	}

	public void setSeedLotDescription(String seedLotDescription) {
		this.seedLotDescription = seedLotDescription;
	}

	public BrAPISeedLot seedLotName(String seedLotName) {
		this.seedLotName = seedLotName;
		return this;
	}

	/**
	 * A human readable name for this Seed Lot
	 *
	 * @return seedLotName
	 **/

	public String getSeedLotName() {
		return seedLotName;
	}

	public void setSeedLotName(String seedLotName) {
		this.seedLotName = seedLotName;
	}

	public BrAPISeedLot sourceCollection(String sourceCollection) {
		this.sourceCollection = sourceCollection;
		return this;
	}

	/**
	 * The description of the source where this material was originally collected
	 * (wild, nursery, etc)
	 *
	 * @return sourceCollection
	 **/

	public String getSourceCollection() {
		return sourceCollection;
	}

	public void setSourceCollection(String sourceCollection) {
		this.sourceCollection = sourceCollection;
	}

	public BrAPISeedLot storageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
		return this;
	}

	/**
	 * Description the storage location
	 *
	 * @return storageLocation
	 **/

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public BrAPISeedLot units(String units) {
		this.units = units;
		return this;
	}

	/**
	 * A description of the things being counted in a BrAPISeedLot (seeds, bulbs,
	 * kg, tree, etc)
	 *
	 * @return units
	 **/

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPISeedLot seedLot = (BrAPISeedLot) o;
		return Objects.equals(this.additionalInfo, seedLot.additionalInfo)
				&& Objects.equals(this.amount, seedLot.amount)
				&& Objects.equals(this.contentMixture, seedLot.contentMixture)
				&& Objects.equals(this.createdDate, seedLot.createdDate)
				&& Objects.equals(this.externalReferences, seedLot.externalReferences)
				&& Objects.equals(this.germplasmDbId, seedLot.germplasmDbId)
				&& Objects.equals(this.lastUpdated, seedLot.lastUpdated)
				&& Objects.equals(this.locationDbId, seedLot.locationDbId)
				&& Objects.equals(this.locationName, seedLot.locationName)
				&& Objects.equals(this.programDbId, seedLot.programDbId)
				&& Objects.equals(this.programName, seedLot.programName)
				&& Objects.equals(this.seedLotDbId, seedLot.seedLotDbId)
				&& Objects.equals(this.seedLotDescription, seedLot.seedLotDescription)
				&& Objects.equals(this.seedLotName, seedLot.seedLotName)
				&& Objects.equals(this.sourceCollection, seedLot.sourceCollection)
				&& Objects.equals(this.storageLocation, seedLot.storageLocation)
				&& Objects.equals(this.units, seedLot.units);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, amount, contentMixture, createdDate, externalReferences, germplasmDbId,
				lastUpdated, locationDbId, locationName, programDbId, programName, seedLotDbId, seedLotDescription,
				seedLotName, sourceCollection, storageLocation, units);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPISeedLot {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    contentMixture: ").append(toIndentedString(contentMixture)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
		sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
		sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
		sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
		sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
		sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
		sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
		sb.append("    seedLotDbId: ").append(toIndentedString(seedLotDbId)).append("\n");
		sb.append("    seedLotDescription: ").append(toIndentedString(seedLotDescription)).append("\n");
		sb.append("    seedLotName: ").append(toIndentedString(seedLotName)).append("\n");
		sb.append("    sourceCollection: ").append(toIndentedString(sourceCollection)).append("\n");
		sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
		sb.append("    units: ").append(toIndentedString(units)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
