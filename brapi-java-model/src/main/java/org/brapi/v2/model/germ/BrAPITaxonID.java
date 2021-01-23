package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * TaxonID
 */


public class BrAPITaxonID   {
  @JsonProperty("sourceName")
  private String sourceName = null;

  @JsonProperty("taxonId")
  private String taxonId = null;

  public BrAPITaxonID sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  /**
   * The human readable name of the taxonomy provider
   * @return sourceName
  **/
  
      

    public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public BrAPITaxonID taxonId(String taxonId) {
    this.taxonId = taxonId;
    return this;
  }

  /**
   * The identifier (name, ID, URI) of a particular taxonomy within the source provider
   * @return taxonId
  **/
  
      

    public String getTaxonId() {
    return taxonId;
  }

  public void setTaxonId(String taxonId) {
    this.taxonId = taxonId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPITaxonID taxonID = (BrAPITaxonID) o;
    return Objects.equals(this.sourceName, taxonID.sourceName) &&
        Objects.equals(this.taxonId, taxonID.taxonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceName, taxonId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxonID {\n");
    
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    taxonId: ").append(toIndentedString(taxonId)).append("\n");
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
