package org.brapi.v2.model.germ.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPITraitDataType;

/**
 * GermplasmAttributeSearchRequest
 */


public class BrAPIGermplasmAttributeSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("externalReferenceIDs")
  @Valid
  private List<String> externalReferenceIDs = null;

  @JsonProperty("externalReferenceSources")
  @Valid
  private List<String> externalReferenceSources = null;

  @JsonProperty("attributeDbIds")
  @Valid
  private List<String> attributeDbIds = null;

  @JsonProperty("attributeNames")
  @Valid
  private List<String> attributeNames = null;

  @JsonProperty("dataTypes")
  @Valid
  private List<BrAPITraitDataType> dataTypes = null;

  @JsonProperty("methodDbIds")
  @Valid
  private List<String> methodDbIds = null;

  @JsonProperty("ontologyDbIds")
  @Valid
  private List<String> ontologyDbIds = null;

  @JsonProperty("scaleDbIds")
  @Valid
  private List<String> scaleDbIds = null;

  @JsonProperty("studyDbId")
  @Valid
  private List<String> studyDbId = null;

  @JsonProperty("traitClasses")
  @Valid
  private List<String> traitClasses = null;

  @JsonProperty("traitDbIds")
  @Valid
  private List<String> traitDbIds = null;

  public BrAPIGermplasmAttributeSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
    if (this.externalReferenceIDs == null) {
      this.externalReferenceIDs = new ArrayList<String>();
    }
    this.externalReferenceIDs.add(externalReferenceIDsItem);
    return this;
  }

  /**
   * List of external references for the trait to search for
   * @return externalReferenceIDs
  **/
  
  
    public List<String> getExternalReferenceIDs() {
    return externalReferenceIDs;
  }

  public void setExternalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
  }

  public BrAPIGermplasmAttributeSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
    if (this.externalReferenceSources == null) {
      this.externalReferenceSources = new ArrayList<String>();
    }
    this.externalReferenceSources.add(externalReferenceSourcesItem);
    return this;
  }

  /**
   * List of external references sources for the trait to search for
   * @return externalReferenceSources
  **/
  
  
    public List<String> getExternalReferenceSources() {
    return externalReferenceSources;
  }

  public void setExternalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
  }

  public BrAPIGermplasmAttributeSearchRequest attributeDbIds(List<String> attributeDbIds) {
    this.attributeDbIds = attributeDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addAttributeDbIdsItem(String attributeDbIdsItem) {
    if (this.attributeDbIds == null) {
      this.attributeDbIds = new ArrayList<String>();
    }
    this.attributeDbIds.add(attributeDbIdsItem);
    return this;
  }

  /**
   * List of Germplasm Attribute IDs to search for
   * @return attributeDbIds
  **/
  
  
    public List<String> getAttributeDbIds() {
    return attributeDbIds;
  }

  public void setAttributeDbIds(List<String> attributeDbIds) {
    this.attributeDbIds = attributeDbIds;
  }

  public BrAPIGermplasmAttributeSearchRequest attributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addAttributeNamesItem(String attributeNamesItem) {
    if (this.attributeNames == null) {
      this.attributeNames = new ArrayList<String>();
    }
    this.attributeNames.add(attributeNamesItem);
    return this;
  }

  /**
   * List of human readable Germplasm Attribute names to search for
   * @return attributeNames
  **/
  
  
    public List<String> getAttributeNames() {
    return attributeNames;
  }

  public void setAttributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
  }

  public BrAPIGermplasmAttributeSearchRequest dataTypes(List<BrAPITraitDataType> dataTypes) {
    this.dataTypes = dataTypes;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addDataTypesItem(BrAPITraitDataType dataTypesItem) {
    if (this.dataTypes == null) {
      this.dataTypes = new ArrayList<BrAPITraitDataType>();
    }
    this.dataTypes.add(dataTypesItem);
    return this;
  }

  /**
   * List of scale data types to filter search results
   * @return dataTypes
  **/
  
      @Valid
    public List<BrAPITraitDataType> getDataTypes() {
    return dataTypes;
  }

  public void setDataTypes(List<BrAPITraitDataType> dataTypes) {
    this.dataTypes = dataTypes;
  }

  public BrAPIGermplasmAttributeSearchRequest methodDbIds(List<String> methodDbIds) {
    this.methodDbIds = methodDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addMethodDbIdsItem(String methodDbIdsItem) {
    if (this.methodDbIds == null) {
      this.methodDbIds = new ArrayList<String>();
    }
    this.methodDbIds.add(methodDbIdsItem);
    return this;
  }

  /**
   * List of methods to filter search results
   * @return methodDbIds
  **/
  
  
    public List<String> getMethodDbIds() {
    return methodDbIds;
  }

  public void setMethodDbIds(List<String> methodDbIds) {
    this.methodDbIds = methodDbIds;
  }

  public BrAPIGermplasmAttributeSearchRequest ontologyDbIds(List<String> ontologyDbIds) {
    this.ontologyDbIds = ontologyDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addOntologyDbIdsItem(String ontologyDbIdsItem) {
    if (this.ontologyDbIds == null) {
      this.ontologyDbIds = new ArrayList<String>();
    }
    this.ontologyDbIds.add(ontologyDbIdsItem);
    return this;
  }

  /**
   * List of ontology IDs to search for
   * @return ontologyDbIds
  **/
  
  
    public List<String> getOntologyDbIds() {
    return ontologyDbIds;
  }

  public void setOntologyDbIds(List<String> ontologyDbIds) {
    this.ontologyDbIds = ontologyDbIds;
  }

  public BrAPIGermplasmAttributeSearchRequest scaleDbIds(List<String> scaleDbIds) {
    this.scaleDbIds = scaleDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addScaleDbIdsItem(String scaleDbIdsItem) {
    if (this.scaleDbIds == null) {
      this.scaleDbIds = new ArrayList<String>();
    }
    this.scaleDbIds.add(scaleDbIdsItem);
    return this;
  }

  /**
   * List of scales to filter search results
   * @return scaleDbIds
  **/
  
  
    public List<String> getScaleDbIds() {
    return scaleDbIds;
  }

  public void setScaleDbIds(List<String> scaleDbIds) {
    this.scaleDbIds = scaleDbIds;
  }

  public BrAPIGermplasmAttributeSearchRequest studyDbId(List<String> studyDbId) {
    this.studyDbId = studyDbId;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addStudyDbIdItem(String studyDbIdItem) {
    if (this.studyDbId == null) {
      this.studyDbId = new ArrayList<String>();
    }
    this.studyDbId.add(studyDbIdItem);
    return this;
  }

  /**
   * The unique ID of a studies to filter on
   * @return studyDbId
  **/
  
  
    public List<String> getStudyDbId() {
    return studyDbId;
  }

  public void setStudyDbId(List<String> studyDbId) {
    this.studyDbId = studyDbId;
  }

  public BrAPIGermplasmAttributeSearchRequest traitClasses(List<String> traitClasses) {
    this.traitClasses = traitClasses;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addTraitClassesItem(String traitClassesItem) {
    if (this.traitClasses == null) {
      this.traitClasses = new ArrayList<String>();
    }
    this.traitClasses.add(traitClassesItem);
    return this;
  }

  /**
   * List of trait classes to filter search results
   * @return traitClasses
  **/
  
  
    public List<String> getTraitClasses() {
    return traitClasses;
  }

  public void setTraitClasses(List<String> traitClasses) {
    this.traitClasses = traitClasses;
  }

  public BrAPIGermplasmAttributeSearchRequest traitDbIds(List<String> traitDbIds) {
    this.traitDbIds = traitDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeSearchRequest addTraitDbIdsItem(String traitDbIdsItem) {
    if (this.traitDbIds == null) {
      this.traitDbIds = new ArrayList<String>();
    }
    this.traitDbIds.add(traitDbIdsItem);
    return this;
  }

  /**
   * List of trait unique ID to filter search results
   * @return traitDbIds
  **/
  
  
    public List<String> getTraitDbIds() {
    return traitDbIds;
  }

  public void setTraitDbIds(List<String> traitDbIds) {
    this.traitDbIds = traitDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmAttributeSearchRequest germplasmAttributeSearchRequest = (BrAPIGermplasmAttributeSearchRequest) o;
    return Objects.equals(this.externalReferenceIDs, germplasmAttributeSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, germplasmAttributeSearchRequest.externalReferenceSources) &&
        Objects.equals(this.attributeDbIds, germplasmAttributeSearchRequest.attributeDbIds) &&
        Objects.equals(this.attributeNames, germplasmAttributeSearchRequest.attributeNames) &&
        Objects.equals(this.dataTypes, germplasmAttributeSearchRequest.dataTypes) &&
        Objects.equals(this.methodDbIds, germplasmAttributeSearchRequest.methodDbIds) &&
        Objects.equals(this.ontologyDbIds, germplasmAttributeSearchRequest.ontologyDbIds) &&
        Objects.equals(this.scaleDbIds, germplasmAttributeSearchRequest.scaleDbIds) &&
        Objects.equals(this.studyDbId, germplasmAttributeSearchRequest.studyDbId) &&
        Objects.equals(this.traitClasses, germplasmAttributeSearchRequest.traitClasses) &&
        Objects.equals(this.traitDbIds, germplasmAttributeSearchRequest.traitDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalReferenceIDs, externalReferenceSources, attributeDbIds, attributeNames, dataTypes, methodDbIds, ontologyDbIds, scaleDbIds, studyDbId, traitClasses, traitDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    attributeDbIds: ").append(toIndentedString(attributeDbIds)).append("\n");
    sb.append("    attributeNames: ").append(toIndentedString(attributeNames)).append("\n");
    sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
    sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
    sb.append("    ontologyDbIds: ").append(toIndentedString(ontologyDbIds)).append("\n");
    sb.append("    scaleDbIds: ").append(toIndentedString(scaleDbIds)).append("\n");
    sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
    sb.append("    traitClasses: ").append(toIndentedString(traitClasses)).append("\n");
    sb.append("    traitDbIds: ").append(toIndentedString(traitDbIds)).append("\n");
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
