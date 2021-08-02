package org.brapi.v2.model.germ.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPITraitDataType;

/**
 * GermplasmAttributeValueSearchRequest
 */


public class BrAPIGermplasmAttributeValueSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("germplasmDbIds")
  @Valid
  private List<String> germplasmDbIds = null;

  @JsonProperty("germplasmNames")
  @Valid
  private List<String> germplasmNames = null;

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

  @JsonProperty("attributeValueDbIds")
  @Valid
  private List<String> attributeValueDbIds = null;

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

  @JsonProperty("traitClasses")
  @Valid
  private List<String> traitClasses = null;

  @JsonProperty("traitDbIds")
  @Valid
  private List<String> traitDbIds = null;

  public BrAPIGermplasmAttributeValueSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
    if (this.germplasmDbIds == null) {
      this.germplasmDbIds = new ArrayList<String>();
    }
    this.germplasmDbIds.add(germplasmDbIdsItem);
    return this;
  }

  /**
   * List of IDs which uniquely identify germplasm to search for
   * @return germplasmDbIds
  **/
  
  
    public List<String> getGermplasmDbIds() {
    return germplasmDbIds;
  }

  public void setGermplasmDbIds(List<String> germplasmDbIds) {
    this.germplasmDbIds = germplasmDbIds;
  }

  public BrAPIGermplasmAttributeValueSearchRequest germplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
    if (this.germplasmNames == null) {
      this.germplasmNames = new ArrayList<String>();
    }
    this.germplasmNames.add(germplasmNamesItem);
    return this;
  }

  /**
   * List of human readable names to identify germplasm to search for
   * @return germplasmNames
  **/
  
  
    public List<String> getGermplasmNames() {
    return germplasmNames;
  }

  public void setGermplasmNames(List<String> germplasmNames) {
    this.germplasmNames = germplasmNames;
  }

  public BrAPIGermplasmAttributeValueSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
    this.externalReferenceIDs = externalReferenceIDs;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
    this.externalReferenceSources = externalReferenceSources;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest attributeDbIds(List<String> attributeDbIds) {
    this.attributeDbIds = attributeDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addAttributeDbIdsItem(String attributeDbIdsItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest attributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addAttributeNamesItem(String attributeNamesItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest attributeValueDbIds(List<String> attributeValueDbIds) {
    this.attributeValueDbIds = attributeValueDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addAttributeValueDbIdsItem(String attributeValueDbIdsItem) {
    if (this.attributeValueDbIds == null) {
      this.attributeValueDbIds = new ArrayList<String>();
    }
    this.attributeValueDbIds.add(attributeValueDbIdsItem);
    return this;
  }

  /**
   * List of Germplasm Attribute Value IDs to search for
   * @return attributeValueDbIds
  **/
  
  
    public List<String> getAttributeValueDbIds() {
    return attributeValueDbIds;
  }

  public void setAttributeValueDbIds(List<String> attributeValueDbIds) {
    this.attributeValueDbIds = attributeValueDbIds;
  }

  public BrAPIGermplasmAttributeValueSearchRequest dataTypes(List<BrAPITraitDataType> dataTypes) {
    this.dataTypes = dataTypes;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addDataTypesItem(BrAPITraitDataType dataTypesItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest methodDbIds(List<String> methodDbIds) {
    this.methodDbIds = methodDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addMethodDbIdsItem(String methodDbIdsItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest ontologyDbIds(List<String> ontologyDbIds) {
    this.ontologyDbIds = ontologyDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addOntologyDbIdsItem(String ontologyDbIdsItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest scaleDbIds(List<String> scaleDbIds) {
    this.scaleDbIds = scaleDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addScaleDbIdsItem(String scaleDbIdsItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest traitClasses(List<String> traitClasses) {
    this.traitClasses = traitClasses;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addTraitClassesItem(String traitClassesItem) {
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

  public BrAPIGermplasmAttributeValueSearchRequest traitDbIds(List<String> traitDbIds) {
    this.traitDbIds = traitDbIds;
    return this;
  }

  public BrAPIGermplasmAttributeValueSearchRequest addTraitDbIdsItem(String traitDbIdsItem) {
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
    BrAPIGermplasmAttributeValueSearchRequest germplasmAttributeValueSearchRequest = (BrAPIGermplasmAttributeValueSearchRequest) o;
    return Objects.equals(this.germplasmDbIds, germplasmAttributeValueSearchRequest.germplasmDbIds) &&
        Objects.equals(this.germplasmNames, germplasmAttributeValueSearchRequest.germplasmNames) &&
        Objects.equals(this.externalReferenceIDs, germplasmAttributeValueSearchRequest.externalReferenceIDs) &&
        Objects.equals(this.externalReferenceSources, germplasmAttributeValueSearchRequest.externalReferenceSources) &&
        Objects.equals(this.attributeDbIds, germplasmAttributeValueSearchRequest.attributeDbIds) &&
        Objects.equals(this.attributeNames, germplasmAttributeValueSearchRequest.attributeNames) &&
        Objects.equals(this.attributeValueDbIds, germplasmAttributeValueSearchRequest.attributeValueDbIds) &&
        Objects.equals(this.dataTypes, germplasmAttributeValueSearchRequest.dataTypes) &&
        Objects.equals(this.methodDbIds, germplasmAttributeValueSearchRequest.methodDbIds) &&
        Objects.equals(this.ontologyDbIds, germplasmAttributeValueSearchRequest.ontologyDbIds) &&
        Objects.equals(this.scaleDbIds, germplasmAttributeValueSearchRequest.scaleDbIds) &&
        Objects.equals(this.traitClasses, germplasmAttributeValueSearchRequest.traitClasses) &&
        Objects.equals(this.traitDbIds, germplasmAttributeValueSearchRequest.traitDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbIds, germplasmNames, externalReferenceIDs, externalReferenceSources, attributeDbIds, attributeNames, attributeValueDbIds, dataTypes, methodDbIds, ontologyDbIds, scaleDbIds, traitClasses, traitDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmAttributeValueSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
    sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
    sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
    sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
    sb.append("    attributeDbIds: ").append(toIndentedString(attributeDbIds)).append("\n");
    sb.append("    attributeNames: ").append(toIndentedString(attributeNames)).append("\n");
    sb.append("    attributeValueDbIds: ").append(toIndentedString(attributeValueDbIds)).append("\n");
    sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
    sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
    sb.append("    ontologyDbIds: ").append(toIndentedString(ontologyDbIds)).append("\n");
    sb.append("    scaleDbIds: ").append(toIndentedString(scaleDbIds)).append("\n");
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
