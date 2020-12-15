package org.brapi.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIContext;
import org.brapi.v2.model.BrAPIMetadata;
import org.brapi.v2.model.BrAPIAcceptedSearchResponseResult;

/**
 * Model202AcceptedSearchResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIAcceptedSearchResponse   {
  @JsonProperty("@context")
  private BrAPIContext _atContext = null;

  @JsonProperty("metadata")
  private BrAPIMetadata metadata = null;

  @JsonProperty("result")
  private BrAPIAcceptedSearchResponseResult result = null;

  public BrAPIAcceptedSearchResponse _atContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
  **/
  
  
    @Valid
    public BrAPIContext getAtContext() {
    return _atContext;
  }

  public void setAtContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
  }

  public BrAPIAcceptedSearchResponse metadata(BrAPIMetadata metadata) {
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

  public BrAPIAcceptedSearchResponse result(BrAPIAcceptedSearchResponseResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  
  
    @Valid
    public BrAPIAcceptedSearchResponseResult getResult() {
    return result;
  }

  public void setResult(BrAPIAcceptedSearchResponseResult result) {
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
    BrAPIAcceptedSearchResponse _202AcceptedSearchResponse = (BrAPIAcceptedSearchResponse) o;
    return Objects.equals(this._atContext, _202AcceptedSearchResponse._atContext) &&
        Objects.equals(this.metadata, _202AcceptedSearchResponse.metadata) &&
        Objects.equals(this.result, _202AcceptedSearchResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model202AcceptedSearchResponse {\n");
    
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
