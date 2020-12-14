package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import org.brapi.v2.model.germ.GermplasmMCPDDonorInfoDonorInstitute;

/**
 * Information about the donor
 */


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class GermplasmMCPDDonorInfo   {
  @JsonProperty("donorAccessionNumber")
  private String donorAccessionNumber = null;

  @JsonProperty("donorAccessionPui")
  private String donorAccessionPui = null;

  @JsonProperty("donorInstitute")
  private GermplasmMCPDDonorInfoDonorInstitute donorInstitute = null;

  public GermplasmMCPDDonorInfo donorAccessionNumber(String donorAccessionNumber) {
    this.donorAccessionNumber = donorAccessionNumber;
    return this;
  }

  /**
   * MCPD (v2.1) (DONORNUMB) 23. Identifier assigned to an accession by the donor. Follows ACCENUMB standard.
   * @return donorAccessionNumber
  **/
  
  
    public String getDonorAccessionNumber() {
    return donorAccessionNumber;
  }

  public void setDonorAccessionNumber(String donorAccessionNumber) {
    this.donorAccessionNumber = donorAccessionNumber;
  }

  public GermplasmMCPDDonorInfo donorAccessionPui(String donorAccessionPui) {
    this.donorAccessionPui = donorAccessionPui;
    return this;
  }

  /**
   * PUI (DOI mostly) of the accession in the donor system.
   * @return donorAccessionPui
  **/
  
  
    public String getDonorAccessionPui() {
    return donorAccessionPui;
  }

  public void setDonorAccessionPui(String donorAccessionPui) {
    this.donorAccessionPui = donorAccessionPui;
  }

  public GermplasmMCPDDonorInfo donorInstitute(GermplasmMCPDDonorInfoDonorInstitute donorInstitute) {
    this.donorInstitute = donorInstitute;
    return this;
  }

  /**
   * Get donorInstitute
   * @return donorInstitute
  **/
  
  
    @Valid
    public GermplasmMCPDDonorInfoDonorInstitute getDonorInstitute() {
    return donorInstitute;
  }

  public void setDonorInstitute(GermplasmMCPDDonorInfoDonorInstitute donorInstitute) {
    this.donorInstitute = donorInstitute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmMCPDDonorInfo germplasmMCPDDonorInfo = (GermplasmMCPDDonorInfo) o;
    return Objects.equals(this.donorAccessionNumber, germplasmMCPDDonorInfo.donorAccessionNumber) &&
        Objects.equals(this.donorAccessionPui, germplasmMCPDDonorInfo.donorAccessionPui) &&
        Objects.equals(this.donorInstitute, germplasmMCPDDonorInfo.donorInstitute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donorAccessionNumber, donorAccessionPui, donorInstitute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDDonorInfo {\n");
    
    sb.append("    donorAccessionNumber: ").append(toIndentedString(donorAccessionNumber)).append("\n");
    sb.append("    donorAccessionPui: ").append(toIndentedString(donorAccessionPui)).append("\n");
    sb.append("    donorInstitute: ").append(toIndentedString(donorInstitute)).append("\n");
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
