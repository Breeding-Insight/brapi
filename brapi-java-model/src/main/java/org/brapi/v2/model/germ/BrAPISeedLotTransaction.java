package org.brapi.v2.model.germ;

import java.util.Objects;

import org.brapi.v2.model.germ.BrAPISeedLotNewTransactionRequest;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * SeedLotTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPISeedLotTransaction extends BrAPISeedLotNewTransactionRequest  {
  @JsonProperty("transactionDbId")
  private String transactionDbId = null;

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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedLotTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionDbId: ").append(toIndentedString(transactionDbId)).append("\n");
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
