package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import javax.validation.Valid;

import org.brapi.v2.model.germ.BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes;
import org.brapi.v2.model.germ.BrAPIGermplasmMCPDCollectingInfoCollectingSite;

/**
 * Information about the collection of this germplasm
 */



public class BrAPIGermplasmMCPDCollectingInfo   {
  @JsonProperty("collectingDate")
  private LocalDate collectingDate = null;

  @JsonProperty("collectingInstitutes")
  @Valid
  private List<BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes> collectingInstitutes = null;

  @JsonProperty("collectingMissionIdentifier")
  private String collectingMissionIdentifier = null;

  @JsonProperty("collectingNumber")
  private String collectingNumber = null;

  @JsonProperty("collectingSite")
  private BrAPIGermplasmMCPDCollectingInfoCollectingSite collectingSite = null;

  public BrAPIGermplasmMCPDCollectingInfo collectingDate(LocalDate collectingDate) {
    this.collectingDate = collectingDate;
    return this;
  }

  /**
   * MCPD (v2.1) (COLLDATE) 17. Collecting date of the sample [YYYYMMDD] where YYYY is the year, MM is the month and DD is the day. Missing data (MM or DD) should be indicated with hyphens or \"00\" [double zero].
   * @return collectingDate
  **/
  
  
    @Valid
    public LocalDate getCollectingDate() {
    return collectingDate;
  }

  public void setCollectingDate(LocalDate collectingDate) {
    this.collectingDate = collectingDate;
  }

  public BrAPIGermplasmMCPDCollectingInfo collectingInstitutes(List<BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes> collectingInstitutes) {
    this.collectingInstitutes = collectingInstitutes;
    return this;
  }

  public BrAPIGermplasmMCPDCollectingInfo addCollectingInstitutesItem(BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes collectingInstitutesItem) {
    if (this.collectingInstitutes == null) {
      this.collectingInstitutes = new ArrayList<BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes>();
    }
    this.collectingInstitutes.add(collectingInstitutesItem);
    return this;
  }

  /**
   * Institutes which collected the sample
   * @return collectingInstitutes
  **/
  
      @Valid
    public List<BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes> getCollectingInstitutes() {
    return collectingInstitutes;
  }

  public void setCollectingInstitutes(List<BrAPIGermplasmMCPDCollectingInfoCollectingInstitutes> collectingInstitutes) {
    this.collectingInstitutes = collectingInstitutes;
  }

  public BrAPIGermplasmMCPDCollectingInfo collectingMissionIdentifier(String collectingMissionIdentifier) {
    this.collectingMissionIdentifier = collectingMissionIdentifier;
    return this;
  }

  /**
   * MCPD (v2.1) (COLLMISSID) 4.2 Identifier of the collecting mission used by the Collecting Institute (4 or 4.1) (e.g. \"CIATFOR_052\", \"CN_426\").
   * @return collectingMissionIdentifier
  **/
  
  
    public String getCollectingMissionIdentifier() {
    return collectingMissionIdentifier;
  }

  public void setCollectingMissionIdentifier(String collectingMissionIdentifier) {
    this.collectingMissionIdentifier = collectingMissionIdentifier;
  }

  public BrAPIGermplasmMCPDCollectingInfo collectingNumber(String collectingNumber) {
    this.collectingNumber = collectingNumber;
    return this;
  }

  /**
   * MCPD (v2.1) (COLLNUMB) 3. Original identifier assigned by the collector(s) of the sample, normally composed of the name or initials of the collector(s) followed by a number (e.g. \"ab109909\"). This identifier is essential for identifying duplicates held in different collections.
   * @return collectingNumber
  **/
  
  
    public String getCollectingNumber() {
    return collectingNumber;
  }

  public void setCollectingNumber(String collectingNumber) {
    this.collectingNumber = collectingNumber;
  }

  public BrAPIGermplasmMCPDCollectingInfo collectingSite(BrAPIGermplasmMCPDCollectingInfoCollectingSite collectingSite) {
    this.collectingSite = collectingSite;
    return this;
  }

  /**
   * Get collectingSite
   * @return collectingSite
  **/
  
  
    @Valid
    public BrAPIGermplasmMCPDCollectingInfoCollectingSite getCollectingSite() {
    return collectingSite;
  }

  public void setCollectingSite(BrAPIGermplasmMCPDCollectingInfoCollectingSite collectingSite) {
    this.collectingSite = collectingSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmMCPDCollectingInfo germplasmMCPDCollectingInfo = (BrAPIGermplasmMCPDCollectingInfo) o;
    return Objects.equals(this.collectingDate, germplasmMCPDCollectingInfo.collectingDate) &&
        Objects.equals(this.collectingInstitutes, germplasmMCPDCollectingInfo.collectingInstitutes) &&
        Objects.equals(this.collectingMissionIdentifier, germplasmMCPDCollectingInfo.collectingMissionIdentifier) &&
        Objects.equals(this.collectingNumber, germplasmMCPDCollectingInfo.collectingNumber) &&
        Objects.equals(this.collectingSite, germplasmMCPDCollectingInfo.collectingSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectingDate, collectingInstitutes, collectingMissionIdentifier, collectingNumber, collectingSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmMCPDCollectingInfo {\n");
    
    sb.append("    collectingDate: ").append(toIndentedString(collectingDate)).append("\n");
    sb.append("    collectingInstitutes: ").append(toIndentedString(collectingInstitutes)).append("\n");
    sb.append("    collectingMissionIdentifier: ").append(toIndentedString(collectingMissionIdentifier)).append("\n");
    sb.append("    collectingNumber: ").append(toIndentedString(collectingNumber)).append("\n");
    sb.append("    collectingSite: ").append(toIndentedString(collectingSite)).append("\n");
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
