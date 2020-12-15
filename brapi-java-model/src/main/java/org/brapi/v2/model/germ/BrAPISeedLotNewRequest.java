package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIExternalReferenceList;

/**
 * SeedLotNewRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPISeedLotNewRequest   {
  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("externalReferences")
  private BrAPIExternalReferenceList externalReferences = null;

  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("locationDbId")
  private String locationDbId = null;

  @JsonProperty("programDbId")
  private String programDbId = null;

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

  public BrAPISeedLotNewRequest additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPISeedLotNewRequest putAdditionalInfoItem(String key, String additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new HashMap<String, String>();
    }
    this.additionalInfo.put(key, additionalInfoItem);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPISeedLotNewRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Current balance of seeds in this lot. Could be a count (seeds, bulbs, etc) or a weight (kg of seed).
   * @return amount
  **/
  
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BrAPISeedLotNewRequest createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The time stamp for when this seed lot was created
   * @return createdDate
  **/
  
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public BrAPISeedLotNewRequest externalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
  **/
  
  
    @Valid
    public BrAPIExternalReferenceList getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(BrAPIExternalReferenceList externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPISeedLotNewRequest germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * Unique DbId of the Germplasm held in this Seed Lot
   * @return germplasmDbId
  **/
  
  
    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPISeedLotNewRequest lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The timestamp for the last update to this Seed Lot (including transactions)
   * @return lastUpdated
  **/
  
  
    @Valid
    public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public BrAPISeedLotNewRequest locationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
    return this;
  }

  /**
   * DbId of the storage location
   * @return locationDbId
  **/
  
  
    public String getLocationDbId() {
    return locationDbId;
  }

  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  public BrAPISeedLotNewRequest programDbId(String programDbId) {
    this.programDbId = programDbId;
    return this;
  }

  /**
   * Unique DbId of the breeding Program this Seed Lot belongs to
   * @return programDbId
  **/
  
  
    public String getProgramDbId() {
    return programDbId;
  }

  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  public BrAPISeedLotNewRequest seedLotDescription(String seedLotDescription) {
    this.seedLotDescription = seedLotDescription;
    return this;
  }

  /**
   * A general description of this Seed Lot
   * @return seedLotDescription
  **/
  
  
    public String getSeedLotDescription() {
    return seedLotDescription;
  }

  public void setSeedLotDescription(String seedLotDescription) {
    this.seedLotDescription = seedLotDescription;
  }

  public BrAPISeedLotNewRequest seedLotName(String seedLotName) {
    this.seedLotName = seedLotName;
    return this;
  }

  /**
   * A human readable name for this Seed Lot
   * @return seedLotName
  **/
  
  
    public String getSeedLotName() {
    return seedLotName;
  }

  public void setSeedLotName(String seedLotName) {
    this.seedLotName = seedLotName;
  }

  public BrAPISeedLotNewRequest sourceCollection(String sourceCollection) {
    this.sourceCollection = sourceCollection;
    return this;
  }

  /**
   * The description of the source where this material was originally collected (wild, nursery, etc)
   * @return sourceCollection
  **/
  
  
    public String getSourceCollection() {
    return sourceCollection;
  }

  public void setSourceCollection(String sourceCollection) {
    this.sourceCollection = sourceCollection;
  }

  public BrAPISeedLotNewRequest storageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  /**
   * Description the storage location
   * @return storageLocation
  **/
  
  
    public String getStorageLocation() {
    return storageLocation;
  }

  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }

  public BrAPISeedLotNewRequest units(String units) {
    this.units = units;
    return this;
  }

  /**
   * Description of the things being counted in this Seed Lot (seeds, bulbs, kg, tree, etc)
   * @return units
  **/
  
  
    public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPISeedLotNewRequest seedLotNewRequest = (BrAPISeedLotNewRequest) o;
    return Objects.equals(this.additionalInfo, seedLotNewRequest.additionalInfo) &&
        Objects.equals(this.amount, seedLotNewRequest.amount) &&
        Objects.equals(this.createdDate, seedLotNewRequest.createdDate) &&
        Objects.equals(this.externalReferences, seedLotNewRequest.externalReferences) &&
        Objects.equals(this.germplasmDbId, seedLotNewRequest.germplasmDbId) &&
        Objects.equals(this.lastUpdated, seedLotNewRequest.lastUpdated) &&
        Objects.equals(this.locationDbId, seedLotNewRequest.locationDbId) &&
        Objects.equals(this.programDbId, seedLotNewRequest.programDbId) &&
        Objects.equals(this.seedLotDescription, seedLotNewRequest.seedLotDescription) &&
        Objects.equals(this.seedLotName, seedLotNewRequest.seedLotName) &&
        Objects.equals(this.sourceCollection, seedLotNewRequest.sourceCollection) &&
        Objects.equals(this.storageLocation, seedLotNewRequest.storageLocation) &&
        Objects.equals(this.units, seedLotNewRequest.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, amount, createdDate, externalReferences, germplasmDbId, lastUpdated, locationDbId, programDbId, seedLotDescription, seedLotName, sourceCollection, storageLocation, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedLotNewRequest {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
    sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
