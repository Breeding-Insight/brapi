package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GermplasmDonors
 */

public class BrAPIGermplasmDonors {
	@JsonProperty("donorAccessionNumber")
	private String donorAccessionNumber = null;

	@JsonProperty("donorInstituteCode")
	private String donorInstituteCode = null;
	
	@Deprecated
	@JsonProperty("germplasmPUI")
	private String germplasmPUI = null;

	public BrAPIGermplasmDonors donorAccessionNumber(String donorAccessionNumber) {
		this.donorAccessionNumber = donorAccessionNumber;
		return this;
	}

	/**
	 * The accession number assigned by the donor MCPD (v2.1) (DONORNUMB) 23.
	 * Identifier assigned to an accession by the donor. Follows ACCENUMB standard.
	 * 
	 * @return donorAccessionNumber
	 **/

	public String getDonorAccessionNumber() {
		return donorAccessionNumber;
	}

	public void setDonorAccessionNumber(String donorAccessionNumber) {
		this.donorAccessionNumber = donorAccessionNumber;
	}

	public BrAPIGermplasmDonors donorInstituteCode(String donorInstituteCode) {
		this.donorInstituteCode = donorInstituteCode;
		return this;
	}

	/**
	 * The institute code for the donor institute MCPD (v2.1) (DONORCODE) 22. FAO
	 * WIEWS code of the donor institute. Follows INSTCODE standard.
	 * 
	 * @return donorInstituteCode
	 **/

	public String getDonorInstituteCode() {
		return donorInstituteCode;
	}

	public void setDonorInstituteCode(String donorInstituteCode) {
		this.donorInstituteCode = donorInstituteCode;
	}

	@Deprecated
	public BrAPIGermplasmDonors germplasmPUI(String germplasmPUI) {
		this.germplasmPUI = germplasmPUI;
		return this;
	}

	/**
	 * Get germplasmPUI
	 * 
	 * @return germplasmPUI
	 **/

	@Deprecated
	public String getGermplasmPUI() {
		return germplasmPUI;
	}

	@Deprecated
	public void setGermplasmPUI(String germplasmPUI) {
		this.germplasmPUI = germplasmPUI;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIGermplasmDonors germplasmDonors = (BrAPIGermplasmDonors) o;
		return Objects.equals(this.donorAccessionNumber, germplasmDonors.donorAccessionNumber)
				&& Objects.equals(this.donorInstituteCode, germplasmDonors.donorInstituteCode)
				&& Objects.equals(this.germplasmPUI, germplasmDonors.germplasmPUI);
	}

	@Override
	public int hashCode() {
		return Objects.hash(donorAccessionNumber, donorInstituteCode, germplasmPUI);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GermplasmDonors {\n");

		sb.append("    donorAccessionNumber: ").append(toIndentedString(donorAccessionNumber)).append("\n");
		sb.append("    donorInstituteCode: ").append(toIndentedString(donorInstituteCode)).append("\n");
		sb.append("    germplasmPUI: ").append(toIndentedString(germplasmPUI)).append("\n");
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
