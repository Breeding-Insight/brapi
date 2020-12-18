package org.brapi.v2.model.germ;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;


/**
 * SeedLotTransaction
 */


public class BrAPISeedLotTransaction  {
  @JsonProperty("transactionDbId")
  private String transactionDbId = null;

  @JsonProperty("additionalInfo")
  @Valid
  private Map<String, String> additionalInfo = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("fromSeedLotDbId")
  private String fromSeedLotDbId = null;

  @JsonProperty("toSeedLotDbId")
  private String toSeedLotDbId = null;

  @JsonProperty("transactionDescription")
  private String transactionDescription = null;

  @JsonProperty("transactionTimestamp")
  private OffsetDateTime transactionTimestamp = null;

  @JsonProperty("units")
  private String units = null;

  public BrAPISeedLotTransaction transactionDbId(String transactionDbId) {
    this.transactionDbId = transactionDbId;
    return this;
  }

  /**
   * Unique DbId for the Seed Lot Transaction
   * @return transactionDbId
  **/
  
      

    public String getTransactionDbId() {
    return transactionDbId;
  }

  public void setTransactionDbId(String transactionDbId) {
    this.transactionDbId = transactionDbId;
  }

  public BrAPISeedLotTransaction additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPISeedLotTransaction putAdditionalInfoItem(String key, String additionalInfoItem) {
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

  public BrAPISeedLotTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of units being transfered. Could be a count (seeds, bulbs, etc) or a weight (kg of seed).
   * @return amount
   **/


  @Valid
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BrAPISeedLotTransaction externalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  /**
   * Get externalReferences
   * @return externalReferences
   **/


  @Valid
  public List<BrAPIExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public BrAPISeedLotTransaction fromSeedLotDbId(String fromSeedLotDbId) {
    this.fromSeedLotDbId = fromSeedLotDbId;
    return this;
  }

  /**
   * The identifier for the Seed Lot being transfered out of
   * @return fromSeedLotDbId
   **/


  public String getFromSeedLotDbId() {
    return fromSeedLotDbId;
  }

  public void setFromSeedLotDbId(String fromSeedLotDbId) {
    this.fromSeedLotDbId = fromSeedLotDbId;
  }

  public BrAPISeedLotTransaction toSeedLotDbId(String toSeedLotDbId) {
    this.toSeedLotDbId = toSeedLotDbId;
    return this;
  }

  /**
   * The identifier for the Seed Lot being transfered into
   * @return toSeedLotDbId
   **/


  public String getToSeedLotDbId() {
    return toSeedLotDbId;
  }

  public void setToSeedLotDbId(String toSeedLotDbId) {
    this.toSeedLotDbId = toSeedLotDbId;
  }

  public BrAPISeedLotTransaction transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * A general description of this Seed Lot Transaction
   * @return transactionDescription
   **/


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public BrAPISeedLotTransaction transactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

  /**
   * The time stamp for when the transaction occured
   * @return transactionTimestamp
   **/


  @Valid
  public OffsetDateTime getTransactionTimestamp() {
    return transactionTimestamp;
  }

  public void setTransactionTimestamp(OffsetDateTime transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }

  public BrAPISeedLotTransaction units(String units) {
    this.units = units;
    return this;
  }

  /**
   * Description of the things being transfered in this transaction (seeds, bulbs, kg, etc)
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
    BrAPISeedLotTransaction seedLotTransaction = (BrAPISeedLotTransaction) o;
    return Objects.equals(this.transactionDbId, seedLotTransaction.transactionDbId) &&
            Objects.equals(this.additionalInfo, seedLotTransaction.additionalInfo) &&
            Objects.equals(this.amount, seedLotTransaction.amount) &&
            Objects.equals(this.externalReferences, seedLotTransaction.externalReferences) &&
            Objects.equals(this.fromSeedLotDbId, seedLotTransaction.fromSeedLotDbId) &&
            Objects.equals(this.toSeedLotDbId, seedLotTransaction.toSeedLotDbId) &&
            Objects.equals(this.transactionDescription, seedLotTransaction.transactionDescription) &&
            Objects.equals(this.transactionTimestamp, seedLotTransaction.transactionTimestamp) &&
            Objects.equals(this.units, seedLotTransaction.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDbId, additionalInfo, amount, externalReferences, fromSeedLotDbId, toSeedLotDbId, transactionDescription, transactionTimestamp, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedLotTransaction {\n");
    sb.append("    transactionDbId: ").append(toIndentedString(transactionDbId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    fromSeedLotDbId: ").append(toIndentedString(fromSeedLotDbId)).append("\n");
    sb.append("    toSeedLotDbId: ").append(toIndentedString(toSeedLotDbId)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
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
