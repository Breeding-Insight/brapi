package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * A string representation of the reference base alleles.
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:53.794Z[GMT]")
public class BrAPIReferenceBases   {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("sequence")
  private String sequence = null;

  public BrAPIReferenceBases nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. This field will be empty if there are not any additional results.
   * @return nextPageToken
  **/
  
  
    public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public BrAPIReferenceBases offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The offset position (0-based) of the given sequence from the start of this `Reference`. This value will differ for each page in a request.
   * @return offset
  **/
  
  
    public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public BrAPIReferenceBases sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * A sub-string of the bases that make up this reference. Bases are represented as IUPAC-IUB codes; this string matches the regular expression `[ACGTMRWSYKVHDBN]*`.
   * @return sequence
  **/
  
  
    public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIReferenceBases referenceBases = (BrAPIReferenceBases) o;
    return Objects.equals(this.nextPageToken, referenceBases.nextPageToken) &&
        Objects.equals(this.offset, referenceBases.offset) &&
        Objects.equals(this.sequence, referenceBases.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, offset, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceBases {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
