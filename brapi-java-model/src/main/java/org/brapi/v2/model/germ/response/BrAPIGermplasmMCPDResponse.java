package org.brapi.v2.model.germ.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponse;
import org.brapi.v2.model.BrAPIContext;
import org.brapi.v2.model.BrAPIMetadata;
import org.brapi.v2.model.germ.BrAPIGermplasmMCPD;


/**
 * GermplasmMCPDResponse
 */


public class BrAPIGermplasmMCPDResponse implements BrAPIResponse<BrAPIGermplasmMCPD>  {
  @JsonProperty("@context")
  private BrAPIContext _atContext = null;

  @JsonProperty("metadata")
  private BrAPIMetadata metadata = null;

  @JsonProperty("result")
  private BrAPIGermplasmMCPD result = null;

  public BrAPIGermplasmMCPDResponse _atContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
    return this;
  }

  

  public void setAtContext(BrAPIContext _atContext) {
    this._atContext = _atContext;
  }

  public BrAPIGermplasmMCPDResponse metadata(BrAPIMetadata metadata) {
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

  public BrAPIGermplasmMCPDResponse result(BrAPIGermplasmMCPD result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  
      

    @Valid
    public BrAPIGermplasmMCPD getResult() {
    return result;
  }

  public void setResult(BrAPIGermplasmMCPD result) {
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
    BrAPIGermplasmMCPDResponse germplasmMCPDResponse = (BrAPIGermplasmMCPDResponse) o;
    return Objects.equals(this._atContext, germplasmMCPDResponse._atContext) &&
        Objects.equals(this.metadata, germplasmMCPDResponse.metadata) &&
        Objects.equals(this.result, germplasmMCPDResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, metadata, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDResponse {\n");
    
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
