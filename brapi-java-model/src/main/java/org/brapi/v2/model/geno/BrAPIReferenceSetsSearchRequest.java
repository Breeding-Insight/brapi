package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * ReferenceSetsSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-04-24T19:42:22.574Z[GMT]")
public class BrAPIReferenceSetsSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("accession")
  @Valid
  private List<String> accession = null;

  @JsonProperty("assemblyPUI")
  @Valid
  private List<String> assemblyPUI = null;

  @JsonProperty("md5checksum")
  @Valid
  private List<String> md5checksum = null;

  @JsonProperty("referenceSetDbIds")
  @Valid
  private List<String> referenceSetDbIds = null;

  public BrAPIReferenceSetsSearchRequest accession(List<String> accession) {
    this.accession = accession;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addAccessionItem(String accessionItem) {
    if (this.accession == null) {
      this.accession = new ArrayList<String>();
    }
    this.accession.add(accessionItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `accession` matches this string (case-sensitive, exact match).
   * @return accession
  **/
  
  
    public List<String> getAccession() {
    return accession;
  }

  public void setAccession(List<String> accession) {
    this.accession = accession;
  }

  public BrAPIReferenceSetsSearchRequest assemblyPUI(List<String> assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addAssemblyPUIItem(String assemblyPUIItem) {
    if (this.assemblyPUI == null) {
      this.assemblyPUI = new ArrayList<String>();
    }
    this.assemblyPUI.add(assemblyPUIItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `assemblyId` matches this string (case-sensitive, exact match).
   * @return assemblyPUI
  **/
  
  
    public List<String> getAssemblyPUI() {
    return assemblyPUI;
  }

  public void setAssemblyPUI(List<String> assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
  }

  public BrAPIReferenceSetsSearchRequest md5checksum(List<String> md5checksum) {
    this.md5checksum = md5checksum;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addMd5checksumItem(String md5checksumItem) {
    if (this.md5checksum == null) {
      this.md5checksum = new ArrayList<String>();
    }
    this.md5checksum.add(md5checksumItem);
    return this;
  }

  /**
   * If set, return the reference sets for which the `md5checksum` matches this string (case-sensitive, exact match).
   * @return md5checksum
  **/
  
  
    public List<String> getMd5checksum() {
    return md5checksum;
  }

  public void setMd5checksum(List<String> md5checksum) {
    this.md5checksum = md5checksum;
  }

  public BrAPIReferenceSetsSearchRequest referenceSetDbIds(List<String> referenceSetDbIds) {
    this.referenceSetDbIds = referenceSetDbIds;
    return this;
  }

  public BrAPIReferenceSetsSearchRequest addReferenceSetDbIdsItem(String referenceSetDbIdsItem) {
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
    BrAPIReferenceSetsSearchRequest referenceSetsSearchRequest = (BrAPIReferenceSetsSearchRequest) o;
    return Objects.equals(this.accession, referenceSetsSearchRequest.accession) &&
        Objects.equals(this.assemblyPUI, referenceSetsSearchRequest.assemblyPUI) &&
        Objects.equals(this.md5checksum, referenceSetsSearchRequest.md5checksum) &&
        Objects.equals(this.referenceSetDbIds, referenceSetsSearchRequest.referenceSetDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accession, assemblyPUI, md5checksum, referenceSetDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSetsSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
    sb.append("    assemblyPUI: ").append(toIndentedString(assemblyPUI)).append("\n");
    sb.append("    md5checksum: ").append(toIndentedString(md5checksum)).append("\n");
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
