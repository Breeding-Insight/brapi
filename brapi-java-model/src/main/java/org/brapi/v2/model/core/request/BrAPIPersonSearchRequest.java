package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * BrAPIPersonSearchRequest
 */

public class BrAPIPersonSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("emailAddresses")
	private List<String> emailAddresses = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("firstNames")
	private List<String> firstNames = null;

	@JsonProperty("lastNames")
	private List<String> lastNames = null;

	@JsonProperty("mailingAddresses")
	private List<String> mailingAddresses = null;

	@JsonProperty("middleNames")
	private List<String> middleNames = null;

	@JsonProperty("personDbIds")
	private List<String> personDbIds = null;

	@JsonProperty("phoneNumbers")
	private List<String> phoneNumbers = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	@JsonProperty("userIDs")
	private List<String> userIDs = null;

	public BrAPIPersonSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIPersonSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
		if (this.commonCropNames == null) {
			this.commonCropNames = new ArrayList<String>();
		}
		this.commonCropNames.add(commonCropNamesItem);
		return this;
	}

	/**
	 * The BrAPI Common Crop Name is the simple, generalized, widely accepted name
	 * of the organism being researched. It is most often used in multi-crop systems
	 * where digital resources need to be divided at a high level. Things like
	 * &#x27;Maize&#x27;, &#x27;Wheat&#x27;, and &#x27;Rice&#x27; are examples of
	 * common crop names. Use this parameter to only return results associated with
	 * the given crops. Use &#x60;GET /commoncropnames&#x60; to find the list of
	 * available crops on a server.
	 *
	 * @return commonCropNames
	 **/
	public List<String> getCommonCropNames() {
		return commonCropNames;
	}

	public void setCommonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
	}

	public BrAPIPersonSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIPersonSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
		if (this.externalReferenceIds == null) {
			this.externalReferenceIds = new ArrayList<String>();
		}
		this.externalReferenceIds.add(externalReferenceIdsItem);
		return this;
	}

	/**
	 * List of external reference IDs. Could be a simple strings or a URIs. (use
	 * with &#x60;externalReferenceSources&#x60; parameter)
	 *
	 * @return externalReferenceIds
	 **/
	public List<String> getExternalReferenceIds() {
		return externalReferenceIds;
	}

	public void setExternalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
	}

	@Deprecated
	public BrAPIPersonSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIPersonSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
		if (this.externalReferenceIDs == null) {
			this.externalReferenceIDs = new ArrayList<String>();
		}
		this.externalReferenceIDs.add(externalReferenceIDsItem);
		return this;
	}

	/**
	 * List of external references for the trait to search for
	 * 
	 * @return externalReferenceIDs
	 **/

	@Deprecated
	public List<String> getExternalReferenceIDs() {
		return externalReferenceIDs;
	}

	@Deprecated
	public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
	}

	public BrAPIPersonSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIPersonSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
		if (this.externalReferenceSources == null) {
			this.externalReferenceSources = new ArrayList<String>();
		}
		this.externalReferenceSources.add(externalReferenceSourcesItem);
		return this;
	}

	/**
	 * List of external references sources for the trait to search for
	 * 
	 * @return externalReferenceSources
	 **/

	public List<String> getExternalReferenceSources() {
		return externalReferenceSources;
	}

	public void setExternalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
	}

	public BrAPIPersonSearchRequest emailAddresses(List<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
		return this;
	}

	public BrAPIPersonSearchRequest addEmailAddressesItem(String emailAddressesItem) {
		if (this.emailAddresses == null) {
			this.emailAddresses = new ArrayList<String>();
		}
		this.emailAddresses.add(emailAddressesItem);
		return this;
	}

	/**
	 * email address for this person
	 * 
	 * @return emailAddresses
	 **/

	public List<String> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	public BrAPIPersonSearchRequest firstNames(List<String> firstNames) {
		this.firstNames = firstNames;
		return this;
	}

	public BrAPIPersonSearchRequest addFirstNamesItem(String firstNamesItem) {
		if (this.firstNames == null) {
			this.firstNames = new ArrayList<String>();
		}
		this.firstNames.add(firstNamesItem);
		return this;
	}

	/**
	 * Persons first name
	 * 
	 * @return firstNames
	 **/

	public List<String> getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(List<String> firstNames) {
		this.firstNames = firstNames;
	}

	public BrAPIPersonSearchRequest lastNames(List<String> lastNames) {
		this.lastNames = lastNames;
		return this;
	}

	public BrAPIPersonSearchRequest addLastNamesItem(String lastNamesItem) {
		if (this.lastNames == null) {
			this.lastNames = new ArrayList<String>();
		}
		this.lastNames.add(lastNamesItem);
		return this;
	}

	/**
	 * Persons last name
	 * 
	 * @return lastNames
	 **/

	public List<String> getLastNames() {
		return lastNames;
	}

	public void setLastNames(List<String> lastNames) {
		this.lastNames = lastNames;
	}

	public BrAPIPersonSearchRequest mailingAddresses(List<String> mailingAddresses) {
		this.mailingAddresses = mailingAddresses;
		return this;
	}

	public BrAPIPersonSearchRequest addMailingAddressesItem(String mailingAddressesItem) {
		if (this.mailingAddresses == null) {
			this.mailingAddresses = new ArrayList<String>();
		}
		this.mailingAddresses.add(mailingAddressesItem);
		return this;
	}

	/**
	 * physical address of this person
	 * 
	 * @return mailingAddresses
	 **/

	public List<String> getMailingAddresses() {
		return mailingAddresses;
	}

	public void setMailingAddresses(List<String> mailingAddresses) {
		this.mailingAddresses = mailingAddresses;
	}

	public BrAPIPersonSearchRequest middleNames(List<String> middleNames) {
		this.middleNames = middleNames;
		return this;
	}

	public BrAPIPersonSearchRequest addMiddleNamesItem(String middleNamesItem) {
		if (this.middleNames == null) {
			this.middleNames = new ArrayList<String>();
		}
		this.middleNames.add(middleNamesItem);
		return this;
	}

	/**
	 * Persons middle name
	 * 
	 * @return middleNames
	 **/

	public List<String> getMiddleNames() {
		return middleNames;
	}

	public void setMiddleNames(List<String> middleNames) {
		this.middleNames = middleNames;
	}

	public BrAPIPersonSearchRequest personDbIds(List<String> personDbIds) {
		this.personDbIds = personDbIds;
		return this;
	}

	public BrAPIPersonSearchRequest addPersonDbIdsItem(String personDbIdsItem) {
		if (this.personDbIds == null) {
			this.personDbIds = new ArrayList<String>();
		}
		this.personDbIds.add(personDbIdsItem);
		return this;
	}

	/**
	 * Unique ID for this person
	 * 
	 * @return personDbIds
	 **/

	public List<String> getPersonDbIds() {
		return personDbIds;
	}

	public void setPersonDbIds(List<String> personDbIds) {
		this.personDbIds = personDbIds;
	}

	public BrAPIPersonSearchRequest phoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		return this;
	}

	public BrAPIPersonSearchRequest addPhoneNumbersItem(String phoneNumbersItem) {
		if (this.phoneNumbers == null) {
			this.phoneNumbers = new ArrayList<String>();
		}
		this.phoneNumbers.add(phoneNumbersItem);
		return this;
	}

	/**
	 * phone number of this person
	 * 
	 * @return phoneNumbers
	 **/

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public BrAPIPersonSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIPersonSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
		if (this.programDbIds == null) {
			this.programDbIds = new ArrayList<String>();
		}
		this.programDbIds.add(programDbIdsItem);
		return this;
	}

	/**
	 * A BrAPI Program represents the high level organization or group who is
	 * responsible for conducting trials and studies. Things like Breeding Programs
	 * and Funded Projects are considered BrAPI Programs. Use this parameter to only
	 * return results associated with the given programs. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programDbIds
	 **/
	public List<String> getProgramDbIds() {
		return programDbIds;
	}

	public void setProgramDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
	}

	public BrAPIPersonSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIPersonSearchRequest addProgramNamesItem(String programNamesItem) {
		if (this.programNames == null) {
			this.programNames = new ArrayList<String>();
		}
		this.programNames.add(programNamesItem);
		return this;
	}

	/**
	 * Use this parameter to only return results associated with the given program
	 * names. Program names are not required to be unique. Use &#x60;GET
	 * /programs&#x60; to find the list of available programs on a server.
	 *
	 * @return programNames
	 **/
	public List<String> getProgramNames() {
		return programNames;
	}

	public void setProgramNames(List<String> programNames) {
		this.programNames = programNames;
	}

	public BrAPIPersonSearchRequest userIDs(List<String> userIDs) {
		this.userIDs = userIDs;
		return this;
	}

	public BrAPIPersonSearchRequest addUserIDsItem(String userIDsItem) {
		if (this.userIDs == null) {
			this.userIDs = new ArrayList<String>();
		}
		this.userIDs.add(userIDsItem);
		return this;
	}

	/**
	 * A systems user ID associated with this person. Different from personDbId
	 * because you could have a person who is not a user of the system.
	 * 
	 * @return userIDs
	 **/

	public List<String> getUserIDs() {
		return userIDs;
	}

	public void setUserIDs(List<String> userIDs) {
		this.userIDs = userIDs;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIPersonSearchRequest personSearchRequest = (BrAPIPersonSearchRequest) o;
		return Objects.equals(this.commonCropNames, personSearchRequest.commonCropNames)
				&& Objects.equals(this.emailAddresses, personSearchRequest.emailAddresses)
				&& Objects.equals(this.externalReferenceIDs, personSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, personSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources, personSearchRequest.externalReferenceSources)
				&& Objects.equals(this.firstNames, personSearchRequest.firstNames)
				&& Objects.equals(this.lastNames, personSearchRequest.lastNames)
				&& Objects.equals(this.mailingAddresses, personSearchRequest.mailingAddresses)
				&& Objects.equals(this.middleNames, personSearchRequest.middleNames)
				&& Objects.equals(this.personDbIds, personSearchRequest.personDbIds)
				&& Objects.equals(this.phoneNumbers, personSearchRequest.phoneNumbers)
				&& Objects.equals(this.programDbIds, personSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, personSearchRequest.programNames)
				&& Objects.equals(this.userIDs, personSearchRequest.userIDs) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, emailAddresses, externalReferenceIDs, externalReferenceIds,
				externalReferenceSources, firstNames, lastNames, mailingAddresses, middleNames, personDbIds,
				phoneNumbers, programDbIds, programNames, userIDs);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIPersonSearchRequest {\n");

		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    firstNames: ").append(toIndentedString(firstNames)).append("\n");
		sb.append("    lastNames: ").append(toIndentedString(lastNames)).append("\n");
		sb.append("    mailingAddresses: ").append(toIndentedString(mailingAddresses)).append("\n");
		sb.append("    middleNames: ").append(toIndentedString(middleNames)).append("\n");
		sb.append("    personDbIds: ").append(toIndentedString(personDbIds)).append("\n");
		sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("    userIDs: ").append(toIndentedString(userIDs)).append("\n");
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
