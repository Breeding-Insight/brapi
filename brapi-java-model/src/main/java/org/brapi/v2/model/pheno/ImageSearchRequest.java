package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.filosganga.geogson.model.Feature;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import javax.validation.Valid;

import org.brapi.v2.model.BrApiGeoJSON;
import org.brapi.v2.model.SearchRequestParametersPaging;

/**
 * ImageSearchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class ImageSearchRequest extends SearchRequestParametersPaging {
	@JsonProperty("externalReferenceIDs")
	@Valid
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceSources")
	@Valid
	private List<String> externalReferenceSources = null;

	@JsonProperty("descriptiveOntologyTerms")
	@Valid
	private List<String> descriptiveOntologyTerms = null;

	@JsonProperty("imageDbIds")
	@Valid
	private List<String> imageDbIds = null;

	@JsonProperty("imageFileNames")
	@Valid
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
	@Valid
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
	@Valid
	private List<String> mimeTypes = null;

	@JsonProperty("observationDbIds")
	@Valid
	private List<String> observationDbIds = null;

	@JsonProperty("observationUnitDbIds")
	@Valid
	private List<String> observationUnitDbIds = null;


	public ImageSearchRequest addImageDbIdsItem(String imageDbIdsItem) {
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

	public ImageSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public ImageSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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
	

	public List<String> getExternalReferenceIDs() {
		return externalReferenceIDs;
	}

	public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
	}

	public ImageSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public ImageSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public ImageSearchRequest descriptiveOntologyTerms(List<String> descriptiveOntologyTerms) {
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
		return this;
	}

	public ImageSearchRequest addDescriptiveOntologyTermsItem(String descriptiveOntologyTermsItem) {
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

	public ImageSearchRequest imageFileNames(List<String> imageFileNames) {
		this.imageFileNames = imageFileNames;
		return this;
	}

	public ImageSearchRequest addImageFileNamesItem(String imageFileNamesItem) {
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

	public ImageSearchRequest imageFileSizeMax(Integer imageFileSizeMax) {
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

	public ImageSearchRequest imageFileSizeMin(Integer imageFileSizeMin) {
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

	public ImageSearchRequest imageHeightMax(Integer imageHeightMax) {
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

	public ImageSearchRequest imageHeightMin(Integer imageHeightMin) {
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

	public ImageSearchRequest imageLocation(BrApiGeoJSON imageLocation) {
		this.imageLocation = imageLocation;
		return this;
	}

	/**
	 * Get imageLocation
	 * 
	 * @return imageLocation
	 **/
	

	@Valid
	public BrApiGeoJSON getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(BrApiGeoJSON imageLocation) {
		this.imageLocation = imageLocation;
	}

	public ImageSearchRequest imageNames(List<String> imageNames) {
		this.imageNames = imageNames;
		return this;
	}

	public ImageSearchRequest addImageNamesItem(String imageNamesItem) {
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

	public ImageSearchRequest imageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
		this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
		return this;
	}

	/**
	 * The latest timestamp to search for.
	 * 
	 * @return imageTimeStampRangeEnd
	 **/
	

	@Valid
	public OffsetDateTime getImageTimeStampRangeEnd() {
		return imageTimeStampRangeEnd;
	}

	public void setImageTimeStampRangeEnd(OffsetDateTime imageTimeStampRangeEnd) {
		this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
	}

	public ImageSearchRequest imageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
		this.imageTimeStampRangeStart = imageTimeStampRangeStart;
		return this;
	}

	/**
	 * The earliest timestamp to search for.
	 * 
	 * @return imageTimeStampRangeStart
	 **/
	

	@Valid
	public OffsetDateTime getImageTimeStampRangeStart() {
		return imageTimeStampRangeStart;
	}

	public void setImageTimeStampRangeStart(OffsetDateTime imageTimeStampRangeStart) {
		this.imageTimeStampRangeStart = imageTimeStampRangeStart;
	}

	public ImageSearchRequest imageWidthMax(Integer imageWidthMax) {
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

	public ImageSearchRequest imageWidthMin(Integer imageWidthMin) {
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

	public ImageSearchRequest mimeTypes(List<String> mimeTypes) {
		this.mimeTypes = mimeTypes;
		return this;
	}

	public ImageSearchRequest addMimeTypesItem(String mimeTypesItem) {
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

	public ImageSearchRequest observationDbIds(List<String> observationDbIds) {
		this.observationDbIds = observationDbIds;
		return this;
	}

	public ImageSearchRequest addObservationDbIdsItem(String observationDbIdsItem) {
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

	public ImageSearchRequest observationUnitDbIds(List<String> observationUnitDbIds) {
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public ImageSearchRequest addObservationUnitDbIdsItem(String observationUnitDbIdsItem) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ImageSearchRequest imageSearchRequest = (ImageSearchRequest) o;
		return Objects.equals(this.externalReferenceIDs, imageSearchRequest.externalReferenceIDs)
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
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalReferenceIDs, externalReferenceSources, descriptiveOntologyTerms, imageFileNames,
				imageFileSizeMax, imageFileSizeMin, imageHeightMax, imageHeightMin, imageLocation, imageNames,
				imageTimeStampRangeEnd, imageTimeStampRangeStart, imageWidthMax, imageWidthMin, mimeTypes,
				observationDbIds, observationUnitDbIds, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ImageSearchRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
