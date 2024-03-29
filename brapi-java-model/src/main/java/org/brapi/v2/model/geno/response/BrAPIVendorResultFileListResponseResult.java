package org.brapi.v2.model.geno.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.geno.BrAPIVendorResultFile;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * VendorResultFileListResponseResult
 */


public class BrAPIVendorResultFileListResponseResult implements BrAPIResponseResult<BrAPIVendorResultFile>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIVendorResultFile> data = new ArrayList<BrAPIVendorResultFile>();

  public BrAPIVendorResultFileListResponseResult data(List<BrAPIVendorResultFile> data) {
    this.data = data;
    return this;
  }

  public BrAPIVendorResultFileListResponseResult addDataItem(BrAPIVendorResultFile dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIVendorResultFile> getData() {
    return data;
  }

  public void setData(List<BrAPIVendorResultFile> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIVendorResultFileListResponseResult vendorResultFileListResponseResult = (BrAPIVendorResultFileListResponseResult) o;
    return Objects.equals(this.data, vendorResultFileListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorResultFileListResponseResult {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
