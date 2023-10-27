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
 * A &#x60;ReferenceSet&#x60; is a set of &#x60;Reference&#x60; s which typically comprise a reference assembly, such as &#x60;GRCH_38&#x60;. A &#x60;ReferenceSet&#x60; defines a common coordinate space for comparing reference-aligned experimental data.
 */



public class BrAPIReferenceSet   {
  @JsonProperty("additionalInfo")
  @Valid
  @JsonAdapter(NullableJsonElementTypeAdapterFactory.class)
  private JsonObject additionalInfo = null;

  @JsonProperty("assemblyPUI")
  private String assemblyPUI = null;

  @JsonProperty("commonCropName")
  private String commonCropName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("externalReferences")
  private List<BrAPIExternalReference> externalReferences = null;

  @JsonProperty("isDerived")
  private Boolean isDerived = null;

  @JsonProperty("md5checksum")
  private String md5checksum = null;

  @JsonProperty("referenceSetDbId")
  private String referenceSetDbId = null;

  @JsonProperty("referenceSetName")
  private String referenceSetName = null;

  @JsonProperty("sourceAccessions")
  @Valid
  private List<String> sourceAccessions = null;

  @JsonProperty("sourceGermplasm")
  private List<BrAPIReferenceSetSourceGermplasm> sourceGermplasm = null;

  @JsonProperty("sourceURI")
  private String sourceURI = null;

  @JsonProperty("species")
  private BrAPIOntologyTerm species = null;

  private final transient Gson gson = new Gson();

  public BrAPIReferenceSet additionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public BrAPIReferenceSet putAdditionalInfoItem(String key, Object additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new JsonObject();
    }
    JsonElement newElement = gson.toJsonTree(additionalInfoItem);
    this.additionalInfo.add(key, newElement);
    return this;
  }

  /**
   * Additional arbitrary info
   * @return additionalInfo
  **/
  
  
    public JsonObject getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(JsonObject additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BrAPIReferenceSet assemblyPUI(String assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
    return this;
  }

  /**
   * The remaining information is about the source of the sequences Public id of this reference set, such as `GRCH_37`.
   * @return assemblyPUI
  **/
  
  
    public String getAssemblyPUI() {
    return assemblyPUI;
  }

  public void setAssemblyPUI(String assemblyPUI) {
    this.assemblyPUI = assemblyPUI;
  }

  public BrAPIReferenceSet commonCropName(String commonCropName) {
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

  public BrAPIReferenceSet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional free text description of this reference set.
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BrAPIReferenceSet externalReferences(List<BrAPIExternalReference> externalReferences) {
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

  public BrAPIReferenceSet isDerived(Boolean isDerived) {
    this.isDerived = isDerived;
    return this;
  }

  /**
   * A reference set may be derived from a source if it contains additional sequences, or some of the sequences within it are derived (see the definition of `isDerived` in `Reference`).
   * @return isDerived
  **/
  
  
    public Boolean isIsDerived() {
    return isDerived;
  }

  public void setIsDerived(Boolean isDerived) {
    this.isDerived = isDerived;
  }

  public BrAPIReferenceSet md5checksum(String md5checksum) {
    this.md5checksum = md5checksum;
    return this;
  }

  /**
   * Order-independent MD5 checksum which identifies this `ReferenceSet`.  To compute this checksum, make a list of `Reference.md5checksum` for all `Reference` s in this set. Then sort that list, and take the MD5 hash of all the strings concatenated together. Express the hash as a lower-case hexadecimal string.
   * @return md5checksum
  **/
  
  
    public String getMd5checksum() {
    return md5checksum;
  }

  public void setMd5checksum(String md5checksum) {
    this.md5checksum = md5checksum;
  }

  public BrAPIReferenceSet referenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
    return this;
  }

  /**
   * The reference set ID. Unique in the repository.
   * @return referenceSetDbId
  **/
  
  
    public String getReferenceSetDbId() {
    return referenceSetDbId;
  }

  public void setReferenceSetDbId(String referenceSetDbId) {
    this.referenceSetDbId = referenceSetDbId;
  }

  public BrAPIReferenceSet referenceSetName(String referenceSetName) {
    this.referenceSetName = referenceSetName;
    return this;
  }

  /**
   * The reference set name.
   * @return referenceSetName
  **/
  
  
    public String getReferenceSetName() {
    return referenceSetName;
  }

  public void setReferenceSetName(String referenceSetName) {
    this.referenceSetName = referenceSetName;
  }

  public BrAPIReferenceSet sourceAccessions(List<String> sourceAccessions) {
    this.sourceAccessions = sourceAccessions;
    return this;
  }

  public BrAPIReferenceSet addSourceAccessionsItem(String sourceAccessionsItem) {
    if (this.sourceAccessions == null) {
      this.sourceAccessions = new ArrayList<String>();
    }
    this.sourceAccessions.add(sourceAccessionsItem);
    return this;
  }

  /**
   * All known corresponding accession IDs in INSDC (GenBank/ENA/DDBJ) ideally with a version number, e.g. `NC_000001.11`.
   * @return sourceAccessions
  **/
  
  
    public List<String> getSourceAccessions() {
    return sourceAccessions;
  }

  public void setSourceAccessions(List<String> sourceAccessions) {
    this.sourceAccessions = sourceAccessions;
  }

  public BrAPIReferenceSet sourceGermplasm(List<BrAPIReferenceSetSourceGermplasm> sourceGermplasm) {
    this.sourceGermplasm = sourceGermplasm;
    return this;
  }

  public BrAPIReferenceSet addSourceGermplasmItem(BrAPIReferenceSetSourceGermplasm sourceGermplasmItem) {
    if (this.sourceGermplasm == null) {
      this.sourceGermplasm = new ArrayList<BrAPIReferenceSetSourceGermplasm>();
    }
    this.sourceGermplasm.add(sourceGermplasmItem);
    return this;
  }

  /**
   * All known corresponding Germplasm
   *
   * @return sourceGermplasm
   **/
  public List<BrAPIReferenceSetSourceGermplasm> getSourceGermplasm() {
    return sourceGermplasm;
  }

  public void setSourceGermplasm(List<BrAPIReferenceSetSourceGermplasm> sourceGermplasm) {
    this.sourceGermplasm = sourceGermplasm;
  }

  public BrAPIReferenceSet sourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
    return this;
  }

  /**
   * Specifies a FASTA format file/string.
   * @return sourceURI
  **/
  
  
    public String getSourceURI() {
    return sourceURI;
  }

  public void setSourceURI(String sourceURI) {
    this.sourceURI = sourceURI;
  }

  public BrAPIReferenceSet species(BrAPIOntologyTerm species) {
    this.species = species;
    return this;
  }

  /**
   * Get species
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
    BrAPIReferenceSet referenceSet = (BrAPIReferenceSet) o;
    return Objects.equals(this.additionalInfo, referenceSet.additionalInfo) &&
        Objects.equals(this.assemblyPUI, referenceSet.assemblyPUI) &&
        Objects.equals(this.commonCropName, referenceSet.commonCropName) &&
        Objects.equals(this.description, referenceSet.description) &&
        Objects.equals(this.externalReferences, referenceSet.externalReferences) &&
        Objects.equals(this.isDerived, referenceSet.isDerived) &&
        Objects.equals(this.md5checksum, referenceSet.md5checksum) &&
        Objects.equals(this.referenceSetDbId, referenceSet.referenceSetDbId) &&
        Objects.equals(this.referenceSetName, referenceSet.referenceSetName) &&
        Objects.equals(this.sourceAccessions, referenceSet.sourceAccessions) &&
        Objects.equals(this.sourceGermplasm, referenceSet.sourceGermplasm) &&
        Objects.equals(this.sourceURI, referenceSet.sourceURI) &&
        Objects.equals(this.species, referenceSet.species);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, assemblyPUI, commonCropName, description, externalReferences, isDerived, md5checksum, referenceSetDbId, referenceSetName, sourceAccessions, sourceGermplasm, sourceURI, species);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceSet {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    assemblyPUI: ").append(toIndentedString(assemblyPUI)).append("\n");
    sb.append("    commonCropName: ").append(toIndentedString(commonCropName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
    sb.append("    md5checksum: ").append(toIndentedString(md5checksum)).append("\n");
    sb.append("    referenceSetDbId: ").append(toIndentedString(referenceSetDbId)).append("\n");
    sb.append("    referenceSetName: ").append(toIndentedString(referenceSetName)).append("\n");
    sb.append("    sourceAccessions: ").append(toIndentedString(sourceAccessions)).append("\n");
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
