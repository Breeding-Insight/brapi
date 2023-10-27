package org.brapi.v2.model.geno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import org.brapi.v2.model.BrAPIExternalReference;
import org.brapi.v2.model.NullableJsonElementTypeAdapterFactory;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**
 * A &#x60;Reference&#x60; is a canonical assembled contig, intended to act as a
 * reference coordinate space for other genomic annotations. A single
 * &#x60;Reference&#x60; might represent the human chromosome 1, for instance.
 * &#x60;References&#x60; are designed to be immutable.
 */



public class BrAPIReference {
	@JsonProperty("additionalInfo")
    @Valid
    @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
	private JsonObject additionalInfo = null;

	@JsonProperty("commonCropName")
	private String commonCropName = null;

	@JsonProperty("externalReferences")
	private List<BrAPIExternalReference> externalReferences = null;

	@JsonProperty("isDerived")
	private Boolean isDerived = null;

	@JsonProperty("length")
	private Integer length = null;

	@JsonProperty("md5checksum")
	private String md5checksum = null;

	@JsonProperty("referenceDbId")
	private String referenceDbId = null;

	@JsonProperty("referenceName")
	private String referenceName = null;

	@JsonProperty("referenceSetDbId")
	private String referenceSetDbId = null;

	@JsonProperty("referenceSetName")
	private String referenceSetName = null;

	@JsonProperty("sourceAccessions")
	@Valid
	private List<String> sourceAccessions = null;

	@JsonProperty("sourceDivergence")
	private Float sourceDivergence = null;

	@JsonProperty("sourceGermplasm")
	private List<BrAPIReferenceSourceGermplasm> sourceGermplasm = null;

	@JsonProperty("sourceURI")
	private String sourceURI = null;

	@JsonProperty("species")
	private BrAPIOntologyTerm species = null;

	private final transient Gson gson = new Gson();

	public String getReferenceSetDbId() {
		return referenceSetDbId;
	}

	public void setReferenceSetDbId(String referenceSetDbId) {
		this.referenceSetDbId = referenceSetDbId;
	}

	public BrAPIReference additionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public BrAPIReference putAdditionalInfoItem(String key, Object additionalInfoItem) {
        if (this.additionalInfo == null) {
          this.additionalInfo = new JsonObject();
        }
        JsonElement newElement = gson.toJsonTree(additionalInfoItem);
        this.additionalInfo.add(key, newElement);
        return this;
  	}

	/**
	 * Additional arbitrary info
	 * 
	 * @return additionalInfo
	 **/
	

	public JsonObject getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(JsonObject additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public BrAPIReference commonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
		return this;
	}

	/**
	 * Common name for the crop
	 *
	 * @return commonCropName
	 **/
	public String getCommonCropName() {
		return commonCropName;
	}

	public void setCommonCropName(String commonCropName) {
		this.commonCropName = commonCropName;
	}

	public BrAPIReference externalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
		return this;
	}

	/**
	 * Get externalReferences
	 * @return externalReferences
	 **/


	@Valid
	public List<BrAPIExternalReference> getExternalReferences() {
		return externalReferences;
	}

	public void setExternalReferences(List<BrAPIExternalReference> externalReferences) {
		this.externalReferences = externalReferences;
	}

	public BrAPIReference isDerived(Boolean isDerived) {
		this.isDerived = isDerived;
		return this;
	}

	/**
	 * A sequence X is said to be derived from source sequence Y, if X and Y are of
	 * the same length and the per-base sequence divergence at A/C/G/T bases is
	 * sufficiently small. Two sequences derived from the same official sequence
	 * share the same coordinates and annotations, and can be replaced with the
	 * official sequence for certain use cases.
	 * 
	 * @return isDerived
	 **/
	

	public Boolean isIsDerived() {
		return isDerived;
	}

	public void setIsDerived(Boolean isDerived) {
		this.isDerived = isDerived;
	}

	public BrAPIReference length(Integer length) {
		this.length = length;
		return this;
	}

	/**
	 * The length of this reference's sequence.
	 * 
	 * @return length
	 **/
	

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public BrAPIReference md5checksum(String md5checksum) {
		this.md5checksum = md5checksum;
		return this;
	}

	/**
	 * The MD5 checksum uniquely representing this `Reference` as a lower-case
	 * hexadecimal string, calculated as the MD5 of the upper-case sequence
	 * excluding all whitespace characters (this is equivalent to SQ:M5 in SAM).
	 * 
	 * @return md5checksum
	 **/
	

	public String getMd5checksum() {
		return md5checksum;
	}

	public void setMd5checksum(String md5checksum) {
		this.md5checksum = md5checksum;
	}

	public BrAPIReference referenceDbId(String referenceDbId) {
		this.referenceDbId = referenceDbId;
		return this;
	}

	/**
	 * The reference ID. Unique within the repository.
	 * 
	 * @return referenceDbId
	 **/
	

	public String getReferenceDbId() {
		return referenceDbId;
	}

	public void setReferenceDbId(String referenceDbId) {
		this.referenceDbId = referenceDbId;
	}

	public BrAPIReference referenceName(String referenceName) {
		this.referenceName = referenceName;
		return this;
	}

	/**
	 * The unique name of this reference within the Reference Set (e.g. '22').
	 * 
	 * @return referenceName
	 **/
	

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public BrAPIReference referenceSetName(String referenceSetName) {
		this.referenceSetName = referenceSetName;
		return this;
	}

	/**
	 * The human readable name of a &#x60;ReferenceSet&#x60;
	 *
	 * @return referenceSetName
	 **/
	public String getReferenceSetName() {
		return referenceSetName;
	}

	public void setReferenceSetName(String referenceSetName) {
		this.referenceSetName = referenceSetName;
	}

	public BrAPIReference sourceAccessions(List<String> sourceAccessions) {
		this.sourceAccessions = sourceAccessions;
		return this;
	}

	public BrAPIReference addSourceAccessionsItem(String sourceAccessionsItem) {
		if (this.sourceAccessions == null) {
			this.sourceAccessions = new ArrayList<String>();
		}
		this.sourceAccessions.add(sourceAccessionsItem);
		return this;
	}

	/**
	 * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) which must
	 * include a version number, e.g. `GCF_000001405.26`.
	 * 
	 * @return sourceAccessions
	 **/
	

	public List<String> getSourceAccessions() {
		return sourceAccessions;
	}

	public void setSourceAccessions(List<String> sourceAccessions) {
		this.sourceAccessions = sourceAccessions;
	}

	public BrAPIReference sourceDivergence(Float sourceDivergence) {
		this.sourceDivergence = sourceDivergence;
		return this;
	}

	/**
	 * The `sourceDivergence` is the fraction of non-indel bases that do not match
	 * the reference this message was derived from.
	 * 
	 * @return sourceDivergence
	 **/
	

	public Float getSourceDivergence() {
		return sourceDivergence;
	}

	public void setSourceDivergence(Float sourceDivergence) {
		this.sourceDivergence = sourceDivergence;
	}

	public BrAPIReference sourceGermplasm(List<BrAPIReferenceSourceGermplasm> sourceGermplasm) {
		this.sourceGermplasm = sourceGermplasm;
		return this;
	}

	public BrAPIReference addSourceGermplasmItem(BrAPIReferenceSourceGermplasm sourceGermplasmItem) {
		if (this.sourceGermplasm == null) {
			this.sourceGermplasm = new ArrayList<BrAPIReferenceSourceGermplasm>();
		}
		this.sourceGermplasm.add(sourceGermplasmItem);
		return this;
	}

	/**
	 * All known corresponding Germplasm
	 *
	 * @return sourceGermplasm
	 **/
	public List<BrAPIReferenceSourceGermplasm> getSourceGermplasm() {
		return sourceGermplasm;
	}

	public void setSourceGermplasm(List<BrAPIReferenceSourceGermplasm> sourceGermplasm) {
		this.sourceGermplasm = sourceGermplasm;
	}

	public BrAPIReference sourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
		return this;
	}

	/**
	 * The URI from which the sequence was obtained. Specifies a FASTA format
	 * file/string with one name, sequence pair. In most cases, clients should call
	 * the `getReferenceBases()` method to obtain sequence bases for a `Reference`
	 * instead of attempting to retrieve this URI.
	 * 
	 * @return sourceURI
	 **/
	

	public String getSourceURI() {
		return sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
	}

	public BrAPIReference species(BrAPIOntologyTerm species) {
		this.species = species;
		return this;
	}

	/**
	 * Get species
	 * 
	 * @return species
	 **/
	

	@Valid
	public BrAPIOntologyTerm getSpecies() {
		return species;
	}

	public void setSpecies(BrAPIOntologyTerm species) {
		this.species = species;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIReference reference = (BrAPIReference) o;
		return Objects.equals(this.additionalInfo, reference.additionalInfo)
				&& Objects.equals(this.commonCropName, reference.commonCropName)
				&& Objects.equals(this.externalReferences, reference.externalReferences)
				&& Objects.equals(this.isDerived, reference.isDerived) && Objects.equals(this.length, reference.length)
				&& Objects.equals(this.md5checksum, reference.md5checksum)
				&& Objects.equals(this.referenceDbId, reference.referenceDbId)
				&& Objects.equals(this.referenceName, reference.referenceName)
				&& Objects.equals(this.referenceSetDbId, reference.referenceSetDbId)
				&& Objects.equals(this.referenceSetName, reference.referenceSetName)
				&& Objects.equals(this.sourceAccessions, reference.sourceAccessions)
				&& Objects.equals(this.sourceDivergence, reference.sourceDivergence)
				&& Objects.equals(this.sourceGermplasm, reference.sourceGermplasm)
				&& Objects.equals(this.sourceURI, reference.sourceURI)
				&& Objects.equals(this.species, reference.species);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalInfo, commonCropName, externalReferences, isDerived, length, md5checksum, referenceDbId, referenceName,
							referenceSetDbId, referenceSetName, sourceAccessions, sourceDivergence, sourceGermplasm, sourceURI, species);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Reference {\n");

		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
		sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
		sb.append("    length: ").append(toIndentedString(length)).append("\n");
		sb.append("    md5checksum: ").append(toIndentedString(md5checksum)).append("\n");
		sb.append("    referenceDbId: ").append(toIndentedString(referenceDbId)).append("\n");
		sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
        sb.append("    referenceSetDbId: ").append(toIndentedString(referenceSetDbId)).append("\n");
        sb.append("    referenceSetName: ").append(toIndentedString(referenceSetName)).append("\n");
		sb.append("    sourceAccessions: ").append(toIndentedString(sourceAccessions)).append("\n");
		sb.append("    sourceDivergence: ").append(toIndentedString(sourceDivergence)).append("\n");
        sb.append("    sourceGermplasm: ").append(toIndentedString(sourceGermplasm)).append("\n");
		sb.append("    sourceURI: ").append(toIndentedString(sourceURI)).append("\n");
		sb.append("    species: ").append(toIndentedString(species)).append("\n");
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
