package org.brapi.v2.model.core.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * BrAPILocationSearchRequest
 */

public class BrAPILocationSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("abbreviations")
	private List<String> abbreviations = null;

	@JsonProperty("altitudeMax")
	private BigDecimal altitudeMax = null;

	@JsonProperty("altitudeMin")
	private BigDecimal altitudeMin = null;

	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("coordinates")
	private BrApiGeoJSON coordinates = null;

	@JsonProperty("countryCodes")
	private List<String> countryCodes = null;

	@JsonProperty("countryNames")
	private List<String> countryNames = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("instituteAddresses")
	private List<String> instituteAddresses = null;

	@JsonProperty("instituteNames")
	private List<String> instituteNames = null;

	@JsonProperty("locationDbIds")
	private List<String> locationDbIds = null;

	@JsonProperty("locationNames")
	private List<String> locationNames = null;

	@JsonProperty("locationTypes")
	private List<String> locationTypes = null;

	@JsonProperty("parentLocationDbIds")
	private List<String> parentLocationDbIds = null;

	@JsonProperty("parentLocationNames")
	private List<String> parentLocationNames = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	public BrAPILocationSearchRequest abbreviations(List<String> abbreviations) {
		this.abbreviations = abbreviations;
		return this;
	}

	public BrAPILocationSearchRequest addAbbreviationsItem(String abbreviationsItem) {
		if (this.abbreviations == null) {
			this.abbreviations = new ArrayList<String>();
		}
		this.abbreviations.add(abbreviationsItem);
		return this;
	}

	/**
	 * A list of shortened human readable names for a set of Locations
	 *
	 * @return abbreviations
	 **/
	public List<String> getAbbreviations() {
		return abbreviations;
	}

	public void setAbbreviations(List<String> abbreviations) {
		this.abbreviations = abbreviations;
	}

	public BrAPILocationSearchRequest altitudeMax(BigDecimal altitudeMax) {
		this.altitudeMax = altitudeMax;
		return this;
	}

	/**
	 * The maximum altitude to search for
	 *
	 * @return altitudeMax
	 **/
	public BigDecimal getAltitudeMax() {
		return altitudeMax;
	}

	public void setAltitudeMax(BigDecimal altitudeMax) {
		this.altitudeMax = altitudeMax;
	}

	public BrAPILocationSearchRequest altitudeMin(BigDecimal altitudeMin) {
		this.altitudeMin = altitudeMin;
		return this;
	}

	/**
	 * The minimum altitude to search for
	 *
	 * @return altitudeMin
	 **/
	public BigDecimal getAltitudeMin() {
		return altitudeMin;
	}

	public void setAltitudeMin(BigDecimal altitudeMin) {
		this.altitudeMin = altitudeMin;
	}

	public BrAPILocationSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPILocationSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

	public BrAPILocationSearchRequest coordinates(BrApiGeoJSON coordinates) {
		this.coordinates = coordinates;
		return this;
	}

	/**
	 * Get coordinates
	 *
	 * @return coordinates
	 **/
	public BrApiGeoJSON getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(BrApiGeoJSON coordinates) {
		this.coordinates = coordinates;
	}

	public BrAPILocationSearchRequest countryCodes(List<String> countryCodes) {
		this.countryCodes = countryCodes;
		return this;
	}

	public BrAPILocationSearchRequest addCountryCodesItem(String countryCodesItem) {
		if (this.countryCodes == null) {
			this.countryCodes = new ArrayList<String>();
		}
		this.countryCodes.add(countryCodesItem);
		return this;
	}

	/**
	 * [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec
	 *
	 * @return countryCodes
	 **/
	public List<String> getCountryCodes() {
		return countryCodes;
	}

	public void setCountryCodes(List<String> countryCodes) {
		this.countryCodes = countryCodes;
	}

	public BrAPILocationSearchRequest countryNames(List<String> countryNames) {
		this.countryNames = countryNames;
		return this;
	}

	public BrAPILocationSearchRequest addCountryNamesItem(String countryNamesItem) {
		if (this.countryNames == null) {
			this.countryNames = new ArrayList<String>();
		}
		this.countryNames.add(countryNamesItem);
		return this;
	}

	/**
	 * The full name of the country to search for
	 *
	 * @return countryNames
	 **/
	public List<String> getCountryNames() {
		return countryNames;
	}

	public void setCountryNames(List<String> countryNames) {
		this.countryNames = countryNames;
	}

	public BrAPILocationSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPILocationSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
		if (this.externalReferenceIDs == null) {
			this.externalReferenceIDs = new ArrayList<String>();
		}
		this.externalReferenceIDs.add(externalReferenceIDsItem);
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;externalReferenceIds&#x60;. Github
	 * issue number #460 &lt;br&gt;List of external reference IDs. Could be a simple
	 * strings or a URIs. (use with &#x60;externalReferenceSources&#x60; parameter)
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

	public BrAPILocationSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPILocationSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

	public BrAPILocationSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPILocationSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
		if (this.externalReferenceSources == null) {
			this.externalReferenceSources = new ArrayList<String>();
		}
		this.externalReferenceSources.add(externalReferenceSourcesItem);
		return this;
	}

	/**
	 * List of identifiers for the source system or database of an external
	 * reference (use with &#x60;externalReferenceIDs&#x60; parameter)
	 *
	 * @return externalReferenceSources
	 **/
	public List<String> getExternalReferenceSources() {
		return externalReferenceSources;
	}

	public void setExternalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
	}

	public BrAPILocationSearchRequest instituteAddresses(List<String> instituteAddresses) {
		this.instituteAddresses = instituteAddresses;
		return this;
	}

	public BrAPILocationSearchRequest addInstituteAddressesItem(String instituteAddressesItem) {
		if (this.instituteAddresses == null) {
			this.instituteAddresses = new ArrayList<String>();
		}
		this.instituteAddresses.add(instituteAddressesItem);
		return this;
	}

	/**
	 * The street address of the institute to search for
	 *
	 * @return instituteAddresses
	 **/
	public List<String> getInstituteAddresses() {
		return instituteAddresses;
	}

	public void setInstituteAddresses(List<String> instituteAddresses) {
		this.instituteAddresses = instituteAddresses;
	}

	public BrAPILocationSearchRequest instituteNames(List<String> instituteNames) {
		this.instituteNames = instituteNames;
		return this;
	}

	public BrAPILocationSearchRequest addInstituteNamesItem(String instituteNamesItem) {
		if (this.instituteNames == null) {
			this.instituteNames = new ArrayList<String>();
		}
		this.instituteNames.add(instituteNamesItem);
		return this;
	}

	/**
	 * The name of the institute to search for
	 *
	 * @return instituteNames
	 **/
	public List<String> getInstituteNames() {
		return instituteNames;
	}

	public void setInstituteNames(List<String> instituteNames) {
		this.instituteNames = instituteNames;
	}

	public BrAPILocationSearchRequest locationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
		return this;
	}

	public BrAPILocationSearchRequest addLocationDbIdsItem(String locationDbIdsItem) {
		if (this.locationDbIds == null) {
			this.locationDbIds = new ArrayList<String>();
		}
		this.locationDbIds.add(locationDbIdsItem);
		return this;
	}

	/**
	 * The location ids to search for
	 *
	 * @return locationDbIds
	 **/
	public List<String> getLocationDbIds() {
		return locationDbIds;
	}

	public void setLocationDbIds(List<String> locationDbIds) {
		this.locationDbIds = locationDbIds;
	}

	public BrAPILocationSearchRequest locationNames(List<String> locationNames) {
		this.locationNames = locationNames;
		return this;
	}

	public BrAPILocationSearchRequest addLocationNamesItem(String locationNamesItem) {
		if (this.locationNames == null) {
			this.locationNames = new ArrayList<String>();
		}
		this.locationNames.add(locationNamesItem);
		return this;
	}

	/**
	 * A human readable names to search for
	 *
	 * @return locationNames
	 **/
	public List<String> getLocationNames() {
		return locationNames;
	}

	public void setLocationNames(List<String> locationNames) {
		this.locationNames = locationNames;
	}

	public BrAPILocationSearchRequest locationTypes(List<String> locationTypes) {
		this.locationTypes = locationTypes;
		return this;
	}

	public BrAPILocationSearchRequest addLocationTypesItem(String locationTypesItem) {
		if (this.locationTypes == null) {
			this.locationTypes = new ArrayList<String>();
		}
		this.locationTypes.add(locationTypesItem);
		return this;
	}

	/**
	 * The type of location this represents (ex. Breeding Location, Storage
	 * Location, etc)
	 *
	 * @return locationTypes
	 **/
	public List<String> getLocationTypes() {
		return locationTypes;
	}

	public void setLocationTypes(List<String> locationTypes) {
		this.locationTypes = locationTypes;
	}

	public BrAPILocationSearchRequest parentLocationDbIds(List<String> parentLocationDbIds) {
		this.parentLocationDbIds = parentLocationDbIds;
		return this;
	}

	public BrAPILocationSearchRequest addParentLocationDbIdsItem(String parentLocationDbIdsItem) {
		if (this.parentLocationDbIds == null) {
			this.parentLocationDbIds = new ArrayList<String>();
		}
		this.parentLocationDbIds.add(parentLocationDbIdsItem);
		return this;
	}

	/**
	 * The unique identifier for a Location &lt;br/&gt; The Parent Location defines
	 * the encompassing location that this location belongs to. For example, an
	 * Institution might have multiple Field Stations inside it and each Field
	 * Station might have multiple Fields.
	 *
	 * @return parentLocationDbIds
	 **/
	public List<String> getParentLocationDbIds() {
		return parentLocationDbIds;
	}

	public void setParentLocationDbIds(List<String> parentLocationDbIds) {
		this.parentLocationDbIds = parentLocationDbIds;
	}

	public BrAPILocationSearchRequest parentLocationNames(List<String> parentLocationNames) {
		this.parentLocationNames = parentLocationNames;
		return this;
	}

	public BrAPILocationSearchRequest addParentLocationNamesItem(String parentLocationNamesItem) {
		if (this.parentLocationNames == null) {
			this.parentLocationNames = new ArrayList<String>();
		}
		this.parentLocationNames.add(parentLocationNamesItem);
		return this;
	}

	/**
	 * A human readable name for a location &lt;br/&gt; The Parent Location defines
	 * the encompassing location that this location belongs to. For example, an
	 * Institution might have multiple Field Stations inside it and each Field
	 * Station might have multiple Fields.
	 *
	 * @return parentLocationNames
	 **/
	public List<String> getParentLocationNames() {
		return parentLocationNames;
	}

	public void setParentLocationNames(List<String> parentLocationNames) {
		this.parentLocationNames = parentLocationNames;
	}

	public BrAPILocationSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPILocationSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPILocationSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPILocationSearchRequest addProgramNamesItem(String programNamesItem) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPILocationSearchRequest locationSearchRequest = (BrAPILocationSearchRequest) o;
		return Objects.equals(this.abbreviations, locationSearchRequest.abbreviations)
				&& Objects.equals(this.altitudeMax, locationSearchRequest.altitudeMax)
				&& Objects.equals(this.altitudeMin, locationSearchRequest.altitudeMin)
				&& Objects.equals(this.commonCropNames, locationSearchRequest.commonCropNames)
				&& Objects.equals(this.coordinates, locationSearchRequest.coordinates)
				&& Objects.equals(this.countryCodes, locationSearchRequest.countryCodes)
				&& Objects.equals(this.countryNames, locationSearchRequest.countryNames)
				&& Objects.equals(this.externalReferenceIDs, locationSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, locationSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources, locationSearchRequest.externalReferenceSources)
				&& Objects.equals(this.instituteAddresses, locationSearchRequest.instituteAddresses)
				&& Objects.equals(this.instituteNames, locationSearchRequest.instituteNames)
				&& Objects.equals(this.locationDbIds, locationSearchRequest.locationDbIds)
				&& Objects.equals(this.locationNames, locationSearchRequest.locationNames)
				&& Objects.equals(this.locationTypes, locationSearchRequest.locationTypes)
				&& Objects.equals(this.parentLocationDbIds, locationSearchRequest.parentLocationDbIds)
				&& Objects.equals(this.parentLocationNames, locationSearchRequest.parentLocationNames)
				&& Objects.equals(this.programDbIds, locationSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, locationSearchRequest.programNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(abbreviations, altitudeMax, altitudeMin, commonCropNames, coordinates, countryCodes,
				countryNames, externalReferenceIDs, externalReferenceIds, externalReferenceSources, instituteAddresses,
				instituteNames, locationDbIds, locationNames, locationTypes, parentLocationDbIds, parentLocationNames,
				programDbIds, programNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPILocationSearchRequest {\n");

		sb.append("    abbreviations: ").append(toIndentedString(abbreviations)).append("\n");
		sb.append("    altitudeMax: ").append(toIndentedString(altitudeMax)).append("\n");
		sb.append("    altitudeMin: ").append(toIndentedString(altitudeMin)).append("\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
		sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
		sb.append("    countryNames: ").append(toIndentedString(countryNames)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    instituteAddresses: ").append(toIndentedString(instituteAddresses)).append("\n");
		sb.append("    instituteNames: ").append(toIndentedString(instituteNames)).append("\n");
		sb.append("    locationDbIds: ").append(toIndentedString(locationDbIds)).append("\n");
		sb.append("    locationNames: ").append(toIndentedString(locationNames)).append("\n");
		sb.append("    locationTypes: ").append(toIndentedString(locationTypes)).append("\n");
		sb.append("    parentLocationDbIds: ").append(toIndentedString(parentLocationDbIds)).append("\n");
		sb.append("    parentLocationNames: ").append(toIndentedString(parentLocationNames)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
