package io.swagger.client.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.client.model.BrAPIResponse;
import io.swagger.client.model.Context;
import io.swagger.client.model.Metadata;
import io.swagger.client.model.germ.CrossingProject;

import javax.validation.Valid;


/**
 * CrossingProjectListResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class CrossingProjectsSingleResponse implements BrAPIResponse<CrossingProject>  {
  @JsonProperty("@context")
  private Context _atContext = null;

  @JsonProperty("metadata")
  private Metadata metadata = null;

  @JsonProperty("result")
  private CrossingProject result = null;

  public CrossingProjectsSingleResponse _atContext(Context _atContext) {
    this._atContext = _atContext;
    return this;
  }

  

  public void setAtContext(Context _atContext) {
    this._atContext = _atContext;
  }

  public CrossingProjectsSingleResponse metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  
      

    @Valid
    public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public CrossingProjectsSingleResponse result(CrossingProject result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  
      

    @Valid
    public CrossingProject getResult() {
    return result;
  }

  public void setResult(CrossingProject result) {
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
    CrossingProjectsSingleResponse crossingProjectListResponse = (CrossingProjectsSingleResponse) o;
    return Objects.equals(this._atContext, crossingProjectListResponse._atContext) &&
        Objects.equals(this.metadata, crossingProjectListResponse.metadata) &&
        Objects.equals(this.result, crossingProjectListResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossingProjectListResponse {\n");
    
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
