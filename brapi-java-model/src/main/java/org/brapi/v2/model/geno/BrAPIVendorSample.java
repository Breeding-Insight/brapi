package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIOntologyReference;


/**
 * VendorSample
 */


public class BrAPIVendorSample   {
  @JsonProperty("clientSampleBarCode")
  private String clientSampleBarCode = null;

  @JsonProperty("clientSampleId")
  private String clientSampleId = null;

  @JsonProperty("column")
  private Integer column = null;

  @JsonProperty("comments")
  private String comments = null;

  @JsonProperty("concentration")
  private BrAPIMeasurement concentration = null;

  @JsonProperty("organismName")
  private String organismName = null;

  @JsonProperty("row")
  private String row = null;

  @JsonProperty("speciesName")
  private String speciesName = null;

  @JsonProperty("taxonomyOntologyReference")
  private BrAPIOntologyReference taxonomyOntologyReference = null;

  @JsonProperty("tissueType")
  private String tissueType = null;

  @JsonProperty("tissueTypeOntologyReference")
  private BrAPIOntologyReference tissueTypeOntologyReference = null;

  @JsonProperty("volume")
  private BrAPIMeasurement volume = null;

  @JsonProperty("well")
  private String well = null;

  public BrAPIVendorSample clientSampleBarCode(String clientSampleBarCode) {
    this.clientSampleBarCode = clientSampleBarCode;
    return this;
  }

  /**
   * (Optional) The value of the bar code attached to this sample
   * @return clientSampleBarCode
  **/
  
  
    public String getClientSampleBarCode() {
    return clientSampleBarCode;
  }

  public void setClientSampleBarCode(String clientSampleBarCode) {
    this.clientSampleBarCode = clientSampleBarCode;
  }

  public BrAPIVendorSample clientSampleId(String clientSampleId) {
    this.clientSampleId = clientSampleId;
    return this;
  }

  /**
   * The ID which uniquely identifies this sample to the client making the request
   * @return clientSampleId
  **/
  
      

    public String getClientSampleId() {
    return clientSampleId;
  }

  public void setClientSampleId(String clientSampleId) {
    this.clientSampleId = clientSampleId;
  }

  public BrAPIVendorSample column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * The Column identifier for this samples location in the plate
   * minimum: 1
   * maximum: 12
   * @return column
  **/
  
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public BrAPIVendorSample comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Generic comments about this sample for the vendor
   * @return comments
  **/
  
  
    public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public BrAPIVendorSample concentration(BrAPIMeasurement concentration) {
    this.concentration = concentration;
    return this;
  }

  /**
   * Get concentration
   * @return concentration
  **/
  
  
    @Valid
    public BrAPIMeasurement getConcentration() {
    return concentration;
  }

  public void setConcentration(BrAPIMeasurement concentration) {
    this.concentration = concentration;
  }

  public BrAPIVendorSample organismName(String organismName) {
    this.organismName = organismName;
    return this;
  }

  /**
   * Scientific organism name
   * @return organismName
  **/
  
  
    public String getOrganismName() {
    return organismName;
  }

  public void setOrganismName(String organismName) {
    this.organismName = organismName;
  }

  public BrAPIVendorSample row(String row) {
    this.row = row;
    return this;
  }

  /**
   * The Row identifier for this samples location in the plate
   * @return row
  **/
  
  
    public String getRow() {
    return row;
  }

  public void setRow(String row) {
    this.row = row;
  }

  public BrAPIVendorSample speciesName(String speciesName) {
    this.speciesName = speciesName;
    return this;
  }

  /**
   * Scientific species name
   * @return speciesName
  **/
  
  
    public String getSpeciesName() {
    return speciesName;
  }

  public void setSpeciesName(String speciesName) {
    this.speciesName = speciesName;
  }

  public BrAPIVendorSample taxonomyOntologyReference(BrAPIOntologyReference taxonomyOntologyReference) {
    this.taxonomyOntologyReference = taxonomyOntologyReference;
    return this;
  }

  /**
   * Get taxonomyOntologyReference
   * @return taxonomyOntologyReference
  **/
  
  
    @Valid
    public BrAPIOntologyReference getTaxonomyOntologyReference() {
    return taxonomyOntologyReference;
  }

  public void setTaxonomyOntologyReference(BrAPIOntologyReference taxonomyOntologyReference) {
    this.taxonomyOntologyReference = taxonomyOntologyReference;
  }

  public BrAPIVendorSample tissueType(String tissueType) {
    this.tissueType = tissueType;
    return this;
  }

  /**
   * The type of tissue in this sample. List of accepted tissue types can be found in the Vendor Specs.
   * @return tissueType
  **/
  
  
    public String getTissueType() {
    return tissueType;
  }

  public void setTissueType(String tissueType) {
    this.tissueType = tissueType;
  }

  public BrAPIVendorSample tissueTypeOntologyReference(BrAPIOntologyReference tissueTypeOntologyReference) {
    this.tissueTypeOntologyReference = tissueTypeOntologyReference;
    return this;
  }

  /**
   * Get tissueTypeOntologyReference
   * @return tissueTypeOntologyReference
  **/
  
  
    @Valid
    public BrAPIOntologyReference getTissueTypeOntologyReference() {
    return tissueTypeOntologyReference;
  }

  public void setTissueTypeOntologyReference(BrAPIOntologyReference tissueTypeOntologyReference) {
    this.tissueTypeOntologyReference = tissueTypeOntologyReference;
  }

  public BrAPIVendorSample volume(BrAPIMeasurement volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
  **/
  
  
    @Valid
    public BrAPIMeasurement getVolume() {
    return volume;
  }

  public void setVolume(BrAPIMeasurement volume) {
    this.volume = volume;
  }

  public BrAPIVendorSample well(String well) {
    this.well = well;
    return this;
  }

  /**
   * The Well identifier for this samples location in the plate. Usually a concatenation of Row and Column, or just a number if the samples are not part of an ordered plate.
   * @return well
  **/
  
  
    public String getWell() {
    return well;
  }

  public void setWell(String well) {
    this.well = well;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorSample vendorSample = (BrAPIVendorSample) o;
    return Objects.equals(this.clientSampleBarCode, vendorSample.clientSampleBarCode) &&
        Objects.equals(this.clientSampleId, vendorSample.clientSampleId) &&
        Objects.equals(this.column, vendorSample.column) &&
        Objects.equals(this.comments, vendorSample.comments) &&
        Objects.equals(this.concentration, vendorSample.concentration) &&
        Objects.equals(this.organismName, vendorSample.organismName) &&
        Objects.equals(this.row, vendorSample.row) &&
        Objects.equals(this.speciesName, vendorSample.speciesName) &&
        Objects.equals(this.taxonomyOntologyReference, vendorSample.taxonomyOntologyReference) &&
        Objects.equals(this.tissueType, vendorSample.tissueType) &&
        Objects.equals(this.tissueTypeOntologyReference, vendorSample.tissueTypeOntologyReference) &&
        Objects.equals(this.volume, vendorSample.volume) &&
        Objects.equals(this.well, vendorSample.well);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSampleBarCode, clientSampleId, column, comments, concentration, organismName, row, speciesName, taxonomyOntologyReference, tissueType, tissueTypeOntologyReference, volume, well);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSample {\n");
    
    sb.append("    clientSampleBarCode: ").append(toIndentedString(clientSampleBarCode)).append("\n");
    sb.append("    clientSampleId: ").append(toIndentedString(clientSampleId)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    concentration: ").append(toIndentedString(concentration)).append("\n");
    sb.append("    organismName: ").append(toIndentedString(organismName)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    speciesName: ").append(toIndentedString(speciesName)).append("\n");
    sb.append("    taxonomyOntologyReference: ").append(toIndentedString(taxonomyOntologyReference)).append("\n");
    sb.append("    tissueType: ").append(toIndentedString(tissueType)).append("\n");
    sb.append("    tissueTypeOntologyReference: ").append(toIndentedString(tissueTypeOntologyReference)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    well: ").append(toIndentedString(well)).append("\n");
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
