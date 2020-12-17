package org.brapi.v2.model.pheno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.pheno.BrAPIOntology;


/**
 * OntologyListResponseResult
 */


public class BrAPIOntologyListResponseResult implements BrAPIResponseResult<BrAPIOntology>  {
  @JsonProperty("data")
  @Valid
  private List<BrAPIOntology> data = new ArrayList<BrAPIOntology>();

  public BrAPIOntologyListResponseResult data(List<BrAPIOntology> data) {
    this.data = data;
    return this;
  }

  public BrAPIOntologyListResponseResult addDataItem(BrAPIOntology dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  
      
    @Valid
    public List<BrAPIOntology> getData() {
    return data;
  }

  public void setData(List<BrAPIOntology> data) {
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
    BrAPIOntologyListResponseResult ontologyListResponseResult = (BrAPIOntologyListResponseResult) o;
    return Objects.equals(this.data, ontologyListResponseResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyListResponseResult {\n");
    
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
