package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.pheno.BrAPIImage;


/**
 * ImageListResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIImageListResponseResult implements BrAPIResponseResult<BrAPIImage>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIImage> data = new ArrayList<BrAPIImage>();

  public BrAPIImageListResponseResult data(List<BrAPIImage> data) {
    this.data = data;
    return this;
  }

  public BrAPIImageListResponseResult addDataItem(BrAPIImage dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of image meta data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIImage> getData() {
    return data;
  }

  public void setData(List<BrAPIImage> data) {
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
    BrAPIImageListResponseResult imageListResponseResult = (BrAPIImageListResponseResult) o;
    return Objects.equals(this.data, imageListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageListResponseResult {\n");
    
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
