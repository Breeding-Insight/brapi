package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * GermplasmMCPDDonorInfoDonorInstitute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class GermplasmMCPDDonorInfoDonorInstitute   {
  @JsonProperty("instituteCode")
  private String instituteCode = null;

  @JsonProperty("instituteName")
  private String instituteName = null;

  public GermplasmMCPDDonorInfoDonorInstitute instituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
    return this;
  }

  /**
   * MCPD (v2.1) (DONORCODE) 22. FAO WIEWS code of the donor institute. Follows INSTCODE standard.
   * @return instituteCode
  **/
  
  
    public String getInstituteCode() {
    return instituteCode;
  }

  public void setInstituteCode(String instituteCode) {
    this.instituteCode = instituteCode;
  }

  public GermplasmMCPDDonorInfoDonorInstitute instituteName(String instituteName) {
    this.instituteName = instituteName;
    return this;
  }

  /**
   * MCPD (v2.1) (DONORNAME) 22.1  Name of the donor institute (or person). This descriptor should be used only if DONORCODE can not be filled because the FAO WIEWS code for this institute is not available.
   * @return instituteName
  **/
  
  
    public String getInstituteName() {
    return instituteName;
  }

  public void setInstituteName(String instituteName) {
    this.instituteName = instituteName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GermplasmMCPDDonorInfoDonorInstitute germplasmMCPDDonorInfoDonorInstitute = (GermplasmMCPDDonorInfoDonorInstitute) o;
    return Objects.equals(this.instituteCode, germplasmMCPDDonorInfoDonorInstitute.instituteCode) &&
        Objects.equals(this.instituteName, germplasmMCPDDonorInfoDonorInstitute.instituteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instituteCode, instituteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDDonorInfoDonorInstitute {\n");
    
    sb.append("    instituteCode: ").append(toIndentedString(instituteCode)).append("\n");
    sb.append("    instituteName: ").append(toIndentedString(instituteName)).append("\n");
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
