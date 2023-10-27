package org.brapi.v2.model.pheno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * ImageSearchRequest
 */

public class BrAPIImageSearchRequest extends BrAPISearchRequestParametersPaging {

	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("descriptiveOntologyTerms")
	private List<String> descriptiveOntologyTerms = null;

	@JsonProperty("imageDbIds")
	private List<String> imageDbIds = null;

	@JsonProperty("imageFileNames")
	private List<String> imageFileNames = null;

	@JsonProperty("imageFileSizeMax")
	private Integer imageFileSizeMax = null;

	@JsonProperty("imageFileSizeMin")
	private Integer imageFileSizeMin = null;

	@JsonProperty("imageHeightMax")
	private Integer imageHeightMax = null;

	@JsonProperty("imageHeightMin")
	private Integer imageHeightMin = null;

	@JsonProperty("imageLocation")
	private BrApiGeoJSON imageLocation = null;

	@JsonProperty("imageNames")
	private List<String> imageNames = null;

	@JsonProperty("imageTimeStampRangeEnd")
	private OffsetDateTime imageTimeStampRangeEnd = null;

	@JsonProperty("imageTimeStampRangeStart")
	private OffsetDateTime imageTimeStampRangeStart = null;

	@JsonProperty("imageWidthMax")
	private Integer imageWidthMax = null;

	@JsonProperty("imageWidthMin")
	private Integer imageWidthMin = null;

	@JsonProperty("mimeTypes")
	private List<String> mimeTypes = null;

	@JsonProperty("observationDbIds")
	private List<String> observationDbIds = null;

	@JsonProperty("observationUnitDbIds")
	private List<String> observationUnitDbIds = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	public BrAPIImageSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIImageSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

	public BrAPIImageSearchRequest imageDbIds(List<String> imageDbIds) {
		this.imageDbIds = imageDbIds;
		return this;
	}

	public BrAPIImageSearchRequest addImageDbIdsItem(String imageDbIdsItem) {
		if (this.imageDbIds == null) {
			this.imageDbIds = new ArrayList<String>();
		}
		this.imageDbIds.add(imageDbIdsItem);
		return this;
	}

	public List<String> getImageDbIds() {
		return imageDbIds;
	}

	public void setImageDbIds(List<String> imageDbIds) {
		this.imageDbIds = imageDbIds;
	}

	@Deprecated
	public BrAPIImageSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIImageSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPIImageSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIImageSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public BrAPIImageSearchRequest descriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
		return this;
	}

	public BrAPIImageSearchRequest addDescriptiveOntologyTermsItem(String descriptiveOntologyTermsItem) {
		if (this.descriptiveOntologyTerms == null) {
			this.descriptiveOntologyTerms = new ArrayList<String>();
		}
		this.descriptiveOntologyTerms.add(descriptiveOntologyTermsItem);
		return this;
	}

	/**
	 * A list of terms to formally describe the image to search for. Each item could
	 * be a simple Tag, an Ontology reference Id, or a full ontology URL.
	 * 
	 * @return descriptiveOntologyTerms
	 **/

	public List<String> getDescriptiveOntologyTerms() {
		return descriptiveOntologyTerms;
	}

	public void setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
	}

	public BrAPIImageSearchRequest imageFileNames(List<String> imageFileNames) {
		this.imageFileNames = imageFileNames;
		return this;
	}

	public BrAPIImageSearchRequest addImageFileNamesItem(String imageFileNamesItem) {
		if (this.imageFileNames == null) {
			this.imageFileNames = new ArrayList<String>();
		}
		this.imageFileNames.add(imageFileNamesItem);
		return this;
	}

	/**
	 * Image file names to search for.
	 * 
	 * @return imageFileNames
	 **/

	public List<String> getImageFileNames() {
		return imageFileNames;
	}

	public void setImageFileNames(List<String> imageFileNames) {
		this.imageFileNames = imageFileNames;
	}

	public BrAPIImageSearchRequest imageFileSizeMax(Integer imageFileSizeMax) {
		this.imageFileSizeMax = imageFileSizeMax;
		return this;
	}

	/**
	 * A maximum image file size to search for.
	 * 
	 * @return imageFileSizeMax
	 **/

	public Integer getImageFileSizeMax() {
		return imageFileSizeMax;
	}

	public void setImageFileSizeMax(Integer imageFileSizeMax) {
		this.imageFileSizeMax = imageFileSizeMax;
	}

	public BrAPIImageSearchRequest imageFileSizeMin(Integer imageFileSizeMin) {
		this.imageFileSizeMin = imageFileSizeMin;
		return this;
	}

	/**
	 * A minimum image file size to search for.
	 * 
	 * @return imageFileSizeMin
	 **/

	public Integer getImageFileSizeMin() {
		return imageFileSizeMin;
	}

	public void setImageFileSizeMin(Integer imageFileSizeMin) {
		this.imageFileSizeMin = imageFileSizeMin;
	}

	public BrAPIImageSearchRequest imageHeightMax(Integer imageHeightMax) {
		this.imageHeightMax = imageHeightMax;
		return this;
	}

	/**
	 * A maximum image height to search for.
	 * 
	 * @return imageHeightMax
	 **/

	public Integer getImageHeightMax() {
		return imageHeightMax;
	}

	public void setImageHeightMax(Integer imageHeightMax) {
		this.imageHeightMax = imageHeightMax;
	}

	public BrAPIImageSearchRequest imageHeightMin(Integer imageHeightMin) {
		this.imageHeightMin = imageHeightMin;
		return this;
	}

	/**
	 * A minimum image height to search for.
	 * 
	 * @return imageHeightMin
	 **/

	public Integer getImageHeightMin() {
		return imageHeightMin;
	}

	public void setImageHeightMin(Integer imageHeightMin) {
		this.imageHeightMin = imageHeightMin;
	}

	public BrAPIImageSearchRequest imageLocation(BrApiGeoJSON imageLocation) {
		this.imageLocation = imageLocation;
		return this;
	}

	/**
	 * Get imageLocation
	 * 
	 * @return imageLocation
	 **/

	public BrApiGeoJSON getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(BrApiGeoJSON imageLocation) {
		this.imageLocation = imageLocation;
	}

	public BrAPIImageSearchRequest imageNames(List<String> imageNames) {
		this.imageNames = imageNames;
		return this;
	}

	public BrAPIImageSearchRequest addImageNamesItem(String imageNamesItem) {
		if (this.imageNames == null) {
			this.imageNames = new ArrayList<String>();
		}
		this.imageNames.add(imageNamesItem);
		return this;
	}

	/**
	 * Human readable names to search for.
	 * 
	 * @return imageNames
	 **/

	public List<String> getImageNames() {
		return imageNames;
	}

	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}

	public BrAPIImageSearchRequest imageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
		this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
		return this;
	}

	/**
	 * The latest timestamp to search for.
	 * 
	 * @return imageTimeStampRangeEnd
	 **/

	public OffsetDateTime getImageTimeStampRangeEnd() {
		return imageTimeStampRangeEnd;
	}

	public void setImageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
		this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
	}

	public BrAPIImageSearchRequest imageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
		this.imageTimeStampRangeStart = imageTimeStampRangeStart;
		return this;
	}

	/**
	 * The earliest timestamp to search for.
	 * 
	 * @return imageTimeStampRangeStart
	 **/

	public OffsetDateTime getImageTimeStampRangeStart() {
		return imageTimeStampRangeStart;
	}

	public void setImageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
		this.imageTimeStampRangeStart = imageTimeStampRangeStart;
	}

	public BrAPIImageSearchRequest imageWidthMax(Integer imageWidthMax) {
		this.imageWidthMax = imageWidthMax;
		return this;
	}

	/**
	 * A maximum image width to search for.
	 * 
	 * @return imageWidthMax
	 **/

	public Integer getImageWidthMax() {
		return imageWidthMax;
	}

	public void setImageWidthMax(Integer imageWidthMax) {
		this.imageWidthMax = imageWidthMax;
	}

	public BrAPIImageSearchRequest imageWidthMin(Integer imageWidthMin) {
		this.imageWidthMin = imageWidthMin;
		return this;
	}

	/**
	 * A minimum image width to search for.
	 * 
	 * @return imageWidthMin
	 **/

	public Integer getImageWidthMin() {
		return imageWidthMin;
	}

	public void setImageWidthMin(Integer imageWidthMin) {
		this.imageWidthMin = imageWidthMin;
	}

	public BrAPIImageSearchRequest mimeTypes(List<String> mimeTypes) {
		this.mimeTypes = mimeTypes;
		return this;
	}

	public BrAPIImageSearchRequest addMimeTypesItem(String mimeTypesItem) {
		if (this.mimeTypes == null) {
			this.mimeTypes = new ArrayList<String>();
		}
		this.mimeTypes.add(mimeTypesItem);
		return this;
	}

	/**
	 * A set of image file types to search for.
	 * 
	 * @return mimeTypes
	 **/

	public List<String> getMimeTypes() {
		return mimeTypes;
	}

	public void setMimeTypes(List<String> mimeTypes) {
		this.mimeTypes = mimeTypes;
	}

	public BrAPIImageSearchRequest observationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
		return this;
	}

	public BrAPIImageSearchRequest addObservationDbIdsItem(String observationDbIdsItem) {
		if (this.observationDbIds == null) {
			this.observationDbIds = new ArrayList<String>();
		}
		this.observationDbIds.add(observationDbIdsItem);
		return this;
	}

	/**
	 * A list of observation Ids this image is associated with to search for
	 * 
	 * @return observationDbIds
	 **/

	public List<String> getObservationDbIds() {
		return observationDbIds;
	}

	public void setObservationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
	}

	public BrAPIImageSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public BrAPIImageSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
		if (this.observationUnitDbIds == null) {
			this.observationUnitDbIds = new ArrayList<String>();
		}
		this.observationUnitDbIds.add(observationUnitDbIdsItem);
		return this;
	}

	/**
	 * A set of observation unit identifiers to search for.
	 * 
	 * @return observationUnitDbIds
	 **/

	public List<String> getObservationUnitDbIds() {
		return observationUnitDbIds;
	}

	public void setObservationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
	}

	public BrAPIImageSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIImageSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPIImageSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIImageSearchRequest addProgramNamesItem(String programNamesItem) {
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
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIImageSearchRequest imageSearchRequest = (BrAPIImageSearchRequest) o;
		return Objects.equals(this.commonCropNames, imageSearchRequest.commonCropNames)
				&& Objects.equals(this.externalReferenceIds, imageSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceIDs, imageSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceSources, imageSearchRequest.externalReferenceSources)
				&& Objects.equals(this.descriptiveOntologyTerms, imageSearchRequest.descriptiveOntologyTerms)
				&& Objects.equals(this.imageFileNames, imageSearchRequest.imageFileNames)
				&& Objects.equals(this.imageFileSizeMax, imageSearchRequest.imageFileSizeMax)
				&& Objects.equals(this.imageFileSizeMin, imageSearchRequest.imageFileSizeMin)
				&& Objects.equals(this.imageHeightMax, imageSearchRequest.imageHeightMax)
				&& Objects.equals(this.imageHeightMin, imageSearchRequest.imageHeightMin)
				&& Objects.equals(this.imageLocation, imageSearchRequest.imageLocation)
				&& Objects.equals(this.imageNames, imageSearchRequest.imageNames)
				&& Objects.equals(this.imageTimeStampRangeEnd, imageSearchRequest.imageTimeStampRangeEnd)
				&& Objects.equals(this.imageTimeStampRangeStart, imageSearchRequest.imageTimeStampRangeStart)
				&& Objects.equals(this.imageWidthMax, imageSearchRequest.imageWidthMax)
				&& Objects.equals(this.imageWidthMin, imageSearchRequest.imageWidthMin)
				&& Objects.equals(this.mimeTypes, imageSearchRequest.mimeTypes)
				&& Objects.equals(this.observationDbIds, imageSearchRequest.observationDbIds)
				&& Objects.equals(this.observationUnitDbIds, imageSearchRequest.observationUnitDbIds)
				&& Objects.equals(this.programDbIds, imageSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, imageSearchRequest.programNames) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, externalReferenceIds, externalReferenceIDs, externalReferenceSources,
				descriptiveOntologyTerms, imageFileNames, imageFileSizeMax, imageFileSizeMin, imageHeightMax,
				imageHeightMin, imageLocation, imageNames, imageTimeStampRangeEnd, imageTimeStampRangeStart,
				imageWidthMax, imageWidthMin, mimeTypes, observationDbIds, observationUnitDbIds, programDbIds,
				programNames, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ImageSearchRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    descriptiveOntologyTerms: ").append(toIndentedString(descriptiveOntologyTerms)).append("\n");
		sb.append("    imageFileNames: ").append(toIndentedString(imageFileNames)).append("\n");
		sb.append("    imageFileSizeMax: ").append(toIndentedString(imageFileSizeMax)).append("\n");
		sb.append("    imageFileSizeMin: ").append(toIndentedString(imageFileSizeMin)).append("\n");
		sb.append("    imageHeightMax: ").append(toIndentedString(imageHeightMax)).append("\n");
		sb.append("    imageHeightMin: ").append(toIndentedString(imageHeightMin)).append("\n");
		sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
		sb.append("    imageNames: ").append(toIndentedString(imageNames)).append("\n");
		sb.append("    imageTimeStampRangeEnd: ").append(toIndentedString(imageTimeStampRangeEnd)).append("\n");
		sb.append("    imageTimeStampRangeStart: ").append(toIndentedString(imageTimeStampRangeStart)).append("\n");
		sb.append("    imageWidthMax: ").append(toIndentedString(imageWidthMax)).append("\n");
		sb.append("    imageWidthMin: ").append(toIndentedString(imageWidthMin)).append("\n");
		sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
		sb.append("    observationDbIds: ").append(toIndentedString(observationDbIds)).append("\n");
		sb.append("    observationUnitDbIds: ").append(toIndentedString(observationUnitDbIds)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
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
