package org.brapi.v2.model.geno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * ReferencesSearchRequest
 */


public class BrAPIReferencesSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("accessions")
  @Valid
  private List<String> accessions = null;

  @JsonProperty("isDerived")
  private Boolean isDerived = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("md5checksums")
  @Valid
  private List<String> md5checksums = null;

  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("referenceDbIds")
  @Valid
  private List<String> referenceDbIds = null;

  @JsonProperty("referenceSetDbIds")
  @Valid
  private List<String> referenceSetDbIds = null;

  public BrAPIReferencesSearchRequest accessions(List<String> accessions) {
    this.accessions = accessions;
    return this;
  }

  public BrAPIReferencesSearchRequest addAccessionsItem(String accessionsItem) {
    if (this.accessions == null) {
      this.accessions = new ArrayList<String>();
    }
    this.accessions.add(accessionsItem);
    return this;
  }

  /**
   * If specified, return the references for which the `accession` matches this string (case-sensitive, exact match).
   * @return accessions
  **/
  
  
    public List<String> getAccessions() {
    return accessions;
  }

  public void setAccessions(List<String> accessions) {
    this.accessions = accessions;
  }

  public BrAPIReferencesSearchRequest isDerived(Boolean isDerived) {
    this.isDerived = isDerived;
    return this;
  }

  /**
   * A sequence X is said to be derived from source sequence Y, if X and Y are of the same length and the per-base sequence divergence at A/C/G/T bases is sufficiently small. Two sequences derived from the same official sequence share the same coordinates and annotations, and can be replaced with the official sequence for certain use cases.
   * @return isDerived
  **/
  
  
    public Boolean isIsDerived() {
    return isDerived;
  }

  public void setIsDerived(Boolean isDerived) {
    this.isDerived = isDerived;
  }

  public BrAPIReferencesSearchRequest maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * The minimum length of this reference's sequence.
   * @return maxLength
  **/
  
  
    public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public BrAPIReferencesSearchRequest md5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
    return this;
  }

  public BrAPIReferencesSearchRequest addMd5checksumsItem(String md5checksumsItem) {
    if (this.md5checksums == null) {
      this.md5checksums = new ArrayList<String>();
    }
    this.md5checksums.add(md5checksumsItem);
    return this;
  }

  /**
   * If specified, return the references for which the `md5checksum` matches this string (case-sensitive, exact match).
   * @return md5checksums
  **/
  
  
    public List<String> getMd5checksums() {
    return md5checksums;
  }

  public void setMd5checksums(List<String> md5checksums) {
    this.md5checksums = md5checksums;
  }

  public BrAPIReferencesSearchRequest minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * The minimum length of this reference's sequence.
   * @return minLength
  **/
  
  
    public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public BrAPIReferencesSearchRequest referenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addReferenceDbIdsItem(String referenceDbIdsItem) {
    if (this.referenceDbIds == null) {
      this.referenceDbIds = new ArrayList<String>();
    }
    this.referenceDbIds.add(referenceDbIdsItem);
    return this;
  }

  /**
   * The `References` to search.
   * @return referenceDbIds
  **/
  
  
    public List<String> getReferenceDbIds() {
    return referenceDbIds;
  }

  public void setReferenceDbIds(List<String> referenceDbIds) {
    this.referenceDbIds = referenceDbIds;
  }

  public BrAPIReferencesSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public BrAPIReferencesSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
    if (this.referenceSetDbIds == null) {
      this.referenceSetDbIds = new ArrayList<String>();
    }
    this.referenceSetDbIds.add(referenceSetDbIdsItem);
    return this;
  }

  /**
   * The `ReferenceSets` to search.
   * @return referenceSetDbIds
  **/
  
  
    public List<String> getReferenceSetDbIds() {
    return referenceSetDbIds;
  }

  public void setReferenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIReferencesSearchRequest referencesSearchRequest = (BrAPIReferencesSearchRequest) o;
    return Objects.equals(this.accessions, referencesSearchRequest.accessions) &&
        Objects.equals(this.isDerived, referencesSearchRequest.isDerived) &&
        Objects.equals(this.maxLength, referencesSearchRequest.maxLength) &&
        Objects.equals(this.md5checksums, referencesSearchRequest.md5checksums) &&
        Objects.equals(this.minLength, referencesSearchRequest.minLength) &&
        Objects.equals(this.referenceDbIds, referencesSearchRequest.referenceDbIds) &&
        Objects.equals(this.referenceSetDbIds, referencesSearchRequest.referenceSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessions, isDerived, maxLength, md5checksums, minLength, referenceDbIds, referenceSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencesSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessions: ").append(toIndentedString(accessions)).append("\n");
    sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    md5checksums: ").append(toIndentedString(md5checksums)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    referenceDbIds: ").append(toIndentedString(referenceDbIds)).append("\n");
    sb.append("    referenceSetDbIds: ").append(toIndentedString(referenceSetDbIds)).append("\n");
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
