package org.brapi.v2.model.pheno;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.pheno.BrAPIObservationTableObservationVariables;

/**
 * ObservationTable
 */


public class BrAPIObservationTable   {
  @JsonProperty("data")
  @Valid
  private List<List<String>> data = null;

  @JsonProperty("headerRow")
  @Valid
  private List<BrAPIObservationTableHeaderRowEnum> headerRow = null;

  @JsonProperty("observationVariables")
  @Valid
  private List<BrAPIObservationTableObservationVariables> observationVariables = null;

  public BrAPIObservationTable data(List<List<String>> data) {
    this.data = data;
    return this;
  }

  public BrAPIObservationTable addDataItem(List<String> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<List<String>>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Matrix of observation data recorded for different observation variables across different observation units
   * @return data
  **/
  
      @Valid
    public List<List<String>> getData() {
    return data;
  }

  public void setData(List<List<String>> data) {
    this.data = data;
  }

  public BrAPIObservationTable headerRow(List<BrAPIObservationTableHeaderRowEnum> headerRow) {
    this.headerRow = headerRow;
    return this;
  }

  public BrAPIObservationTable addHeaderRowItem(BrAPIObservationTableHeaderRowEnum headerRowItem) {
    if (this.headerRow == null) {
      this.headerRow = new ArrayList<BrAPIObservationTableHeaderRowEnum>();
    }
    this.headerRow.add(headerRowItem);
    return this;
  }

  /**
   * <p>The table is REQUIRED to have the following columns</p> <ul>   <li>observationUnitDbId - Each row is related to one Observation Unit</li>   <li>observationTimeStamp - Each row is has a time stamp for when the observation was taken</li>   <li>At least one column with an observationVariableDbId</li> </ul> <p>The table may have any or all of the following OPTIONAL columns. Included columns are decided by the server developer</p> <ul>   <li>observationUnitName</li>   <li>studyDbId</li>   <li>studyName</li>   <li>germplasmDbId</li>   <li>germplasmName</li>   <li>positionCoordinateX</li>   <li>positionCoordinateY</li>   <li>year</li> </ul> <p>The table also may have any number of Observation Unit Hierarchy Level columns. For example:</p> <ul>   <li>field</li>   <li>plot</li>   <li>sub-plot</li>   <li>plant</li>   <li>pot</li>   <li>block</li>   <li>entry</li>   <li>rep</li> </ul> <p>The JSON representation provides a pair of extra arrays for defining the headers of the table.  The first array \"headerRow\" will always contain \"observationUnitDbId\" and any or all of the OPTIONAL column header names.  The second array \"observationVariables\" contains the names and DbIds for the Observation Variables represented in the table.  By appending the two arrays, you can construct the complete header row of the table. </p>
   * @return headerRow
  **/
  
  
    public List<BrAPIObservationTableHeaderRowEnum> getHeaderRow() {
    return headerRow;
  }

  public void setHeaderRow(List<BrAPIObservationTableHeaderRowEnum> headerRow) {
    this.headerRow = headerRow;
  }

  public BrAPIObservationTable observationVariables(List<BrAPIObservationTableObservationVariables> observationVariables) {
    this.observationVariables = observationVariables;
    return this;
  }

  public BrAPIObservationTable addObservationVariablesItem(BrAPIObservationTableObservationVariables observationVariablesItem) {
    if (this.observationVariables == null) {
      this.observationVariables = new ArrayList<BrAPIObservationTableObservationVariables>();
    }
    this.observationVariables.add(observationVariablesItem);
    return this;
  }

  /**
   * The list of observation variables which have values recorded for them in the data matrix. Append to the 'headerRow' for complete header row of the table.
   * @return observationVariables
  **/
  
      @Valid
    public List<BrAPIObservationTableObservationVariables> getObservationVariables() {
    return observationVariables;
  }

  public void setObservationVariables(List<BrAPIObservationTableObservationVariables> observationVariables) {
    this.observationVariables = observationVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationTable observationTable = (BrAPIObservationTable) o;
    return Objects.equals(this.data, observationTable.data) &&
        Objects.equals(this.headerRow, observationTable.headerRow) &&
        Objects.equals(this.observationVariables, observationTable.observationVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, headerRow, observationVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationTable {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    headerRow: ").append(toIndentedString(headerRow)).append("\n");
    sb.append("    observationVariables: ").append(toIndentedString(observationVariables)).append("\n");
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
