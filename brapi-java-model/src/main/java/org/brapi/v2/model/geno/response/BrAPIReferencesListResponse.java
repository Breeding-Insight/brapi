package org.brapi.v2.model.geno.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponse;
import org.brapi.v2.model.BrAPIContext;
import org.brapi.v2.model.BrAPIMetadata;


/**
 * ReferencesListResponse
 */


public class BrAPIReferencesListResponse implements BrAPIResponse<BrAPIReferencesListResponseResult>  {
  @JsonProperty("@context")
  private BrAPIContext _atContext = null;

  @JsonProperty("metadata")
  private BrAPIMetadata metadata = null;

  @JsonProperty("result")
  private BrAPIReferencesListResponseResult result = null;

  public BrAPIReferencesListResponse _atContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
    return this;
  }

  

  public void setAtContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
  }

  public BrAPIReferencesListResponse metadata(BrAPIMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  
      

    @Valid
    public BrAPIMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(BrAPIMetadata metadata) {
    this.metadata = metadata;
  }

  public BrAPIReferencesListResponse result(BrAPIReferencesListResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  
      

    @Valid
    public BrAPIReferencesListResponseResult getResult() {
    return result;
  }

  public void setResult(BrAPIReferencesListResponseResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIReferencesListResponse referencesListResponse = (BrAPIReferencesListResponse) o;
    return Objects.equals(this._atContext, referencesListResponse._atContext) &&
        Objects.equals(this.metadata, referencesListResponse.metadata) &&
        Objects.equals(this.result, referencesListResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencesListResponse {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
