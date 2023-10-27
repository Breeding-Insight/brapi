package org.brapi.v2.model.germ.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPITraitDataType;

/**
 * BrAPIGermplasmAttributeSearchRequest
 */

public class BrAPIGermplasmAttributeSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("attributeCategories")
	private List<String> attributeCategories = null;

	@JsonProperty("attributeDbIds")
	private List<String> attributeDbIds = null;

	@JsonProperty("attributeNames")
	private List<String> attributeNames = null;

	@JsonProperty("attributePUIs")
	private List<String> attributePUIs = null;

	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("dataTypes")
	private List<BrAPITraitDataType> dataTypes = null;

	@JsonProperty("externalReferenceIDs")
	@Deprecated
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("germplasmDbIds")
	private List<String> germplasmDbIds = null;

	@JsonProperty("germplasmNames")
	private List<String> germplasmNames = null;

	@JsonProperty("methodDbIds")
	private List<String> methodDbIds = null;

	@JsonProperty("methodNames")
	private List<String> methodNames = null;

	@JsonProperty("methodPUIs")
	private List<String> methodPUIs = null;

	@JsonProperty("ontologyDbIds")
	private List<String> ontologyDbIds = null;

	@JsonProperty("programDbIds")
	private List<String> programDbIds = null;

	@JsonProperty("programNames")
	private List<String> programNames = null;

	@JsonProperty("scaleDbIds")
	private List<String> scaleDbIds = null;

	@JsonProperty("scaleNames")
	private List<String> scaleNames = null;

	@JsonProperty("scalePUIs")
	private List<String> scalePUIs = null;

	@JsonProperty("studyDbId")
	@Deprecated
	private List<String> studyDbId = null;

	@JsonProperty("studyDbIds")
	private List<String> studyDbIds = null;

	@JsonProperty("studyNames")
	private List<String> studyNames = null;

	@JsonProperty("traitAttributePUIs")
	private List<String> traitAttributePUIs = null;

	@JsonProperty("traitAttributes")
	private List<String> traitAttributes = null;

	@JsonProperty("traitClasses")
	private List<String> traitClasses = null;

	@JsonProperty("traitDbIds")
	private List<String> traitDbIds = null;

	@JsonProperty("traitEntities")
	private List<String> traitEntities = null;

	@JsonProperty("traitEntityPUIs")
	private List<String> traitEntityPUIs = null;

	@JsonProperty("traitNames")
	private List<String> traitNames = null;

	@JsonProperty("traitPUIs")
	private List<String> traitPUIs = null;

	@JsonProperty("trialDbIds")
	private List<String> trialDbIds = null;

	@JsonProperty("trialNames")
	private List<String> trialNames = null;

	public BrAPIGermplasmAttributeSearchRequest attributeCategories(List<String> attributeCategories) {
		this.attributeCategories = attributeCategories;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addAttributeCategoriesItem(String attributeCategoriesItem) {
		if (this.attributeCategories == null) {
			this.attributeCategories = new ArrayList<String>();
		}
		this.attributeCategories.add(attributeCategoriesItem);
		return this;
	}

	/**
	 * General category for the attribute. very similar to Trait class.
	 *
	 * @return attributeCategories
	 **/
	public List<String> getAttributeCategories() {
		return attributeCategories;
	}

	public void setAttributeCategories(List<String> attributeCategories) {
		this.attributeCategories = attributeCategories;
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
	 *
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
	 *
	 * @return attributeNames
	 **/
	public List<String> getAttributeNames() {
		return attributeNames;
	}

	public void setAttributeNames(List<String> attributeNames) {
		this.attributeNames = attributeNames;
	}

	public BrAPIGermplasmAttributeSearchRequest attributePUIs(List<String> attributePUIs) {
		this.attributePUIs = attributePUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addAttributePUIsItem(String attributePUIsItem) {
		if (this.attributePUIs == null) {
			this.attributePUIs = new ArrayList<String>();
		}
		this.attributePUIs.add(attributePUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of an Attribute, usually in the form of a URI
	 *
	 * @return attributePUIs
	 **/
	public List<String> getAttributePUIs() {
		return attributePUIs;
	}

	public void setAttributePUIs(List<String> attributePUIs) {
		this.attributePUIs = attributePUIs;
	}

	public BrAPIGermplasmAttributeSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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
	 *
	 * @return dataTypes
	 **/
	public List<BrAPITraitDataType> getDataTypes() {
		return dataTypes;
	}

	public void setDataTypes(List<BrAPITraitDataType> dataTypes) {
		this.dataTypes = dataTypes;
	}

	@Deprecated
	public BrAPIGermplasmAttributeSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIGermplasmAttributeSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPIGermplasmAttributeSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

	public BrAPIGermplasmAttributeSearchRequest germplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addGermplasmDbIdsItem(String germplasmDbIdsItem) {
		if (this.germplasmDbIds == null) {
			this.germplasmDbIds = new ArrayList<String>();
		}
		this.germplasmDbIds.add(germplasmDbIdsItem);
		return this;
	}

	/**
	 * List of IDs which uniquely identify germplasm to search for
	 *
	 * @return germplasmDbIds
	 **/
	public List<String> getGermplasmDbIds() {
		return germplasmDbIds;
	}

	public void setGermplasmDbIds(List<String> germplasmDbIds) {
		this.germplasmDbIds = germplasmDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest germplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addGermplasmNamesItem(String germplasmNamesItem) {
		if (this.germplasmNames == null) {
			this.germplasmNames = new ArrayList<String>();
		}
		this.germplasmNames.add(germplasmNamesItem);
		return this;
	}

	/**
	 * List of human readable names to identify germplasm to search for
	 *
	 * @return germplasmNames
	 **/
	public List<String> getGermplasmNames() {
		return germplasmNames;
	}

	public void setGermplasmNames(List<String> germplasmNames) {
		this.germplasmNames = germplasmNames;
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
	 *
	 * @return methodDbIds
	 **/
	public List<String> getMethodDbIds() {
		return methodDbIds;
	}

	public void setMethodDbIds(List<String> methodDbIds) {
		this.methodDbIds = methodDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest methodNames(List<String> methodNames) {
		this.methodNames = methodNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addMethodNamesItem(String methodNamesItem) {
		if (this.methodNames == null) {
			this.methodNames = new ArrayList<String>();
		}
		this.methodNames.add(methodNamesItem);
		return this;
	}

	/**
	 * Human readable name for the method &lt;br/&gt;MIAPPE V1.1 (DM-88) Method Name
	 * of the method of observation
	 *
	 * @return methodNames
	 **/
	public List<String> getMethodNames() {
		return methodNames;
	}

	public void setMethodNames(List<String> methodNames) {
		this.methodNames = methodNames;
	}

	public BrAPIGermplasmAttributeSearchRequest methodPUIs(List<String> methodPUIs) {
		this.methodPUIs = methodPUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addMethodPUIsItem(String methodPUIsItem) {
		if (this.methodPUIs == null) {
			this.methodPUIs = new ArrayList<String>();
		}
		this.methodPUIs.add(methodPUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Method, usually in the form of a URI
	 *
	 * @return methodPUIs
	 **/
	public List<String> getMethodPUIs() {
		return methodPUIs;
	}

	public void setMethodPUIs(List<String> methodPUIs) {
		this.methodPUIs = methodPUIs;
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
	 *
	 * @return ontologyDbIds
	 **/
	public List<String> getOntologyDbIds() {
		return ontologyDbIds;
	}

	public void setOntologyDbIds(List<String> ontologyDbIds) {
		this.ontologyDbIds = ontologyDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPIGermplasmAttributeSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addProgramNamesItem(String programNamesItem) {
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
	 * The unique identifier for a Scale
	 *
	 * @return scaleDbIds
	 **/
	public List<String> getScaleDbIds() {
		return scaleDbIds;
	}

	public void setScaleDbIds(List<String> scaleDbIds) {
		this.scaleDbIds = scaleDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest scaleNames(List<String> scaleNames) {
		this.scaleNames = scaleNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addScaleNamesItem(String scaleNamesItem) {
		if (this.scaleNames == null) {
			this.scaleNames = new ArrayList<String>();
		}
		this.scaleNames.add(scaleNamesItem);
		return this;
	}

	/**
	 * Name of the scale &lt;br/&gt;MIAPPE V1.1 (DM-92) Scale Name of the scale
	 * associated with the variable
	 *
	 * @return scaleNames
	 **/
	public List<String> getScaleNames() {
		return scaleNames;
	}

	public void setScaleNames(List<String> scaleNames) {
		this.scaleNames = scaleNames;
	}

	public BrAPIGermplasmAttributeSearchRequest scalePUIs(List<String> scalePUIs) {
		this.scalePUIs = scalePUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addScalePUIsItem(String scalePUIsItem) {
		if (this.scalePUIs == null) {
			this.scalePUIs = new ArrayList<String>();
		}
		this.scalePUIs.add(scalePUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Scale, usually in the form of a URI
	 *
	 * @return scalePUIs
	 **/
	public List<String> getScalePUIs() {
		return scalePUIs;
	}

	public void setScalePUIs(List<String> scalePUIs) {
		this.scalePUIs = scalePUIs;
	}

	@Deprecated
	public BrAPIGermplasmAttributeSearchRequest studyDbId(List<String> studyDbId) {
		this.studyDbId = studyDbId;
		return this;
	}

	@Deprecated
	public BrAPIGermplasmAttributeSearchRequest addStudyDbIdItem(String studyDbIdItem) {
		if (this.studyDbId == null) {
			this.studyDbId = new ArrayList<String>();
		}
		this.studyDbId.add(studyDbIdItem);
		return this;
	}

	/**
	 * **Deprecated in v2.1** Please use &#x60;studyDbIds&#x60;. Github issue number
	 * #483 &lt;br&gt;The unique ID of a studies to filter on
	 *
	 * @return studyDbId
	 **/
	@Deprecated
	public List<String> getStudyDbId() {
		return studyDbId;
	}

	@Deprecated
	public void setStudyDbId(List<String> studyDbId) {
		this.studyDbId = studyDbId;
	}

	public BrAPIGermplasmAttributeSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
		if (this.studyDbIds == null) {
			this.studyDbIds = new ArrayList<String>();
		}
		this.studyDbIds.add(studyDbIdsItem);
		return this;
	}

	/**
	 * List of study identifiers to search for
	 *
	 * @return studyDbIds
	 **/
	public List<String> getStudyDbIds() {
		return studyDbIds;
	}

	public void setStudyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addStudyNamesItem(String studyNamesItem) {
		if (this.studyNames == null) {
			this.studyNames = new ArrayList<String>();
		}
		this.studyNames.add(studyNamesItem);
		return this;
	}

	/**
	 * List of study names to filter search results
	 *
	 * @return studyNames
	 **/
	public List<String> getStudyNames() {
		return studyNames;
	}

	public void setStudyNames(List<String> studyNames) {
		this.studyNames = studyNames;
	}

	public BrAPIGermplasmAttributeSearchRequest traitAttributePUIs(List<String> traitAttributePUIs) {
		this.traitAttributePUIs = traitAttributePUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitAttributePUIsItem(String traitAttributePUIsItem) {
		if (this.traitAttributePUIs == null) {
			this.traitAttributePUIs = new ArrayList<String>();
		}
		this.traitAttributePUIs.add(traitAttributePUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Trait Attribute, usually in the form of
	 * a URI &lt;br/&gt;A trait can be decomposed as \&quot;Trait\&quot; &#x3D;
	 * \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the attribute is the observed
	 * feature (or characteristic) of the entity e.g., for \&quot;grain
	 * colour\&quot;, attribute &#x3D; \&quot;colour\&quot;
	 *
	 * @return traitAttributePUIs
	 **/
	public List<String> getTraitAttributePUIs() {
		return traitAttributePUIs;
	}

	public void setTraitAttributePUIs(List<String> traitAttributePUIs) {
		this.traitAttributePUIs = traitAttributePUIs;
	}

	public BrAPIGermplasmAttributeSearchRequest traitAttributes(List<String> traitAttributes) {
		this.traitAttributes = traitAttributes;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitAttributesItem(String traitAttributesItem) {
		if (this.traitAttributes == null) {
			this.traitAttributes = new ArrayList<String>();
		}
		this.traitAttributes.add(traitAttributesItem);
		return this;
	}

	/**
	 * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot;
	 * + \&quot;Attribute\&quot;, the attribute is the observed feature (or
	 * characteristic) of the entity e.g., for \&quot;grain colour\&quot;, attribute
	 * &#x3D; \&quot;colour\&quot;
	 *
	 * @return traitAttributes
	 **/
	public List<String> getTraitAttributes() {
		return traitAttributes;
	}

	public void setTraitAttributes(List<String> traitAttributes) {
		this.traitAttributes = traitAttributes;
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
	 *
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
	 * The unique identifier for a Trait
	 *
	 * @return traitDbIds
	 **/
	public List<String> getTraitDbIds() {
		return traitDbIds;
	}

	public void setTraitDbIds(List<String> traitDbIds) {
		this.traitDbIds = traitDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest traitEntities(List<String> traitEntities) {
		this.traitEntities = traitEntities;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitEntitiesItem(String traitEntitiesItem) {
		if (this.traitEntities == null) {
			this.traitEntities = new ArrayList<String>();
		}
		this.traitEntities.add(traitEntitiesItem);
		return this;
	}

	/**
	 * A trait can be decomposed as \&quot;Trait\&quot; &#x3D; \&quot;Entity\&quot;
	 * + \&quot;Attribute\&quot;, the entity is the part of the plant that the trait
	 * refers to e.g., for \&quot;grain colour\&quot;, entity &#x3D;
	 * \&quot;grain\&quot;
	 *
	 * @return traitEntities
	 **/
	public List<String> getTraitEntities() {
		return traitEntities;
	}

	public void setTraitEntities(List<String> traitEntities) {
		this.traitEntities = traitEntities;
	}

	public BrAPIGermplasmAttributeSearchRequest traitEntityPUIs(List<String> traitEntityPUIs) {
		this.traitEntityPUIs = traitEntityPUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitEntityPUIsItem(String traitEntityPUIsItem) {
		if (this.traitEntityPUIs == null) {
			this.traitEntityPUIs = new ArrayList<String>();
		}
		this.traitEntityPUIs.add(traitEntityPUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Trait Entity, usually in the form of a
	 * URI &lt;br/&gt;A trait can be decomposed as \&quot;Trait\&quot; &#x3D;
	 * \&quot;Entity\&quot; + \&quot;Attribute\&quot;, the entity is the part of the
	 * plant that the trait refers to e.g., for \&quot;grain colour\&quot;, entity
	 * &#x3D; \&quot;grain\&quot;
	 *
	 * @return traitEntityPUIs
	 **/
	public List<String> getTraitEntityPUIs() {
		return traitEntityPUIs;
	}

	public void setTraitEntityPUIs(List<String> traitEntityPUIs) {
		this.traitEntityPUIs = traitEntityPUIs;
	}

	public BrAPIGermplasmAttributeSearchRequest traitNames(List<String> traitNames) {
		this.traitNames = traitNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitNamesItem(String traitNamesItem) {
		if (this.traitNames == null) {
			this.traitNames = new ArrayList<String>();
		}
		this.traitNames.add(traitNamesItem);
		return this;
	}

	/**
	 * The human readable name of a trait &lt;br/&gt;MIAPPE V1.1 (DM-86) Trait -
	 * Name of the (plant or environmental) trait under observation
	 *
	 * @return traitNames
	 **/
	public List<String> getTraitNames() {
		return traitNames;
	}

	public void setTraitNames(List<String> traitNames) {
		this.traitNames = traitNames;
	}

	public BrAPIGermplasmAttributeSearchRequest traitPUIs(List<String> traitPUIs) {
		this.traitPUIs = traitPUIs;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTraitPUIsItem(String traitPUIsItem) {
		if (this.traitPUIs == null) {
			this.traitPUIs = new ArrayList<String>();
		}
		this.traitPUIs.add(traitPUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of a Trait, usually in the form of a URI
	 *
	 * @return traitPUIs
	 **/
	public List<String> getTraitPUIs() {
		return traitPUIs;
	}

	public void setTraitPUIs(List<String> traitPUIs) {
		this.traitPUIs = traitPUIs;
	}

	public BrAPIGermplasmAttributeSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
		if (this.trialDbIds == null) {
			this.trialDbIds = new ArrayList<String>();
		}
		this.trialDbIds.add(trialDbIdsItem);
		return this;
	}

	/**
	 * The ID which uniquely identifies a trial to search for
	 *
	 * @return trialDbIds
	 **/
	public List<String> getTrialDbIds() {
		return trialDbIds;
	}

	public void setTrialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
	}

	public BrAPIGermplasmAttributeSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPIGermplasmAttributeSearchRequest addTrialNamesItem(String trialNamesItem) {
		if (this.trialNames == null) {
			this.trialNames = new ArrayList<String>();
		}
		this.trialNames.add(trialNamesItem);
		return this;
	}

	/**
	 * The human readable name of a trial to search for
	 *
	 * @return trialNames
	 **/
	public List<String> getTrialNames() {
		return trialNames;
	}

	public void setTrialNames(List<String> trialNames) {
		this.trialNames = trialNames;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrAPIGermplasmAttributeSearchRequest germplasmAttributeSearchRequest = (BrAPIGermplasmAttributeSearchRequest) o;
		return Objects.equals(this.attributeCategories, germplasmAttributeSearchRequest.attributeCategories)
				&& Objects.equals(this.attributeDbIds, germplasmAttributeSearchRequest.attributeDbIds)
				&& Objects.equals(this.attributeNames, germplasmAttributeSearchRequest.attributeNames)
				&& Objects.equals(this.attributePUIs, germplasmAttributeSearchRequest.attributePUIs)
				&& Objects.equals(this.commonCropNames, germplasmAttributeSearchRequest.commonCropNames)
				&& Objects.equals(this.dataTypes, germplasmAttributeSearchRequest.dataTypes)
				&& Objects.equals(this.externalReferenceIDs, germplasmAttributeSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, germplasmAttributeSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources,
						germplasmAttributeSearchRequest.externalReferenceSources)
				&& Objects.equals(this.germplasmDbIds, germplasmAttributeSearchRequest.germplasmDbIds)
				&& Objects.equals(this.germplasmNames, germplasmAttributeSearchRequest.germplasmNames)
				&& Objects.equals(this.methodDbIds, germplasmAttributeSearchRequest.methodDbIds)
				&& Objects.equals(this.methodNames, germplasmAttributeSearchRequest.methodNames)
				&& Objects.equals(this.methodPUIs, germplasmAttributeSearchRequest.methodPUIs)
				&& Objects.equals(this.ontologyDbIds, germplasmAttributeSearchRequest.ontologyDbIds)
				&& Objects.equals(this.programDbIds, germplasmAttributeSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, germplasmAttributeSearchRequest.programNames)
				&& Objects.equals(this.scaleDbIds, germplasmAttributeSearchRequest.scaleDbIds)
				&& Objects.equals(this.scaleNames, germplasmAttributeSearchRequest.scaleNames)
				&& Objects.equals(this.scalePUIs, germplasmAttributeSearchRequest.scalePUIs)
				&& Objects.equals(this.studyDbId, germplasmAttributeSearchRequest.studyDbId)
				&& Objects.equals(this.studyDbIds, germplasmAttributeSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, germplasmAttributeSearchRequest.studyNames)
				&& Objects.equals(this.traitAttributePUIs, germplasmAttributeSearchRequest.traitAttributePUIs)
				&& Objects.equals(this.traitAttributes, germplasmAttributeSearchRequest.traitAttributes)
				&& Objects.equals(this.traitClasses, germplasmAttributeSearchRequest.traitClasses)
				&& Objects.equals(this.traitDbIds, germplasmAttributeSearchRequest.traitDbIds)
				&& Objects.equals(this.traitEntities, germplasmAttributeSearchRequest.traitEntities)
				&& Objects.equals(this.traitEntityPUIs, germplasmAttributeSearchRequest.traitEntityPUIs)
				&& Objects.equals(this.traitNames, germplasmAttributeSearchRequest.traitNames)
				&& Objects.equals(this.traitPUIs, germplasmAttributeSearchRequest.traitPUIs)
				&& Objects.equals(this.trialDbIds, germplasmAttributeSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, germplasmAttributeSearchRequest.trialNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(attributeCategories, attributeDbIds, attributeNames, attributePUIs, commonCropNames,
				dataTypes, externalReferenceIDs, externalReferenceIds, externalReferenceSources, germplasmDbIds,
				germplasmNames, methodDbIds, methodNames, methodPUIs, ontologyDbIds, programDbIds, programNames,
				scaleDbIds, scaleNames, scalePUIs, studyDbId, studyDbIds, studyNames, traitAttributePUIs,
				traitAttributes, traitClasses, traitDbIds, traitEntities, traitEntityPUIs, traitNames, traitPUIs,
				trialDbIds, trialNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIGermplasmAttributeSearchRequest {\n");

		sb.append("    attributeCategories: ").append(toIndentedString(attributeCategories)).append("\n");
		sb.append("    attributeDbIds: ").append(toIndentedString(attributeDbIds)).append("\n");
		sb.append("    attributeNames: ").append(toIndentedString(attributeNames)).append("\n");
		sb.append("    attributePUIs: ").append(toIndentedString(attributePUIs)).append("\n");
		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    germplasmDbIds: ").append(toIndentedString(germplasmDbIds)).append("\n");
		sb.append("    germplasmNames: ").append(toIndentedString(germplasmNames)).append("\n");
		sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
		sb.append("    methodNames: ").append(toIndentedString(methodNames)).append("\n");
		sb.append("    methodPUIs: ").append(toIndentedString(methodPUIs)).append("\n");
		sb.append("    ontologyDbIds: ").append(toIndentedString(ontologyDbIds)).append("\n");
		sb.append("    programDbIds: ").append(toIndentedString(programDbIds)).append("\n");
		sb.append("    programNames: ").append(toIndentedString(programNames)).append("\n");
		sb.append("    scaleDbIds: ").append(toIndentedString(scaleDbIds)).append("\n");
		sb.append("    scaleNames: ").append(toIndentedString(scaleNames)).append("\n");
		sb.append("    scalePUIs: ").append(toIndentedString(scalePUIs)).append("\n");
		sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
		sb.append("    studyDbIds: ").append(toIndentedString(studyDbIds)).append("\n");
		sb.append("    studyNames: ").append(toIndentedString(studyNames)).append("\n");
		sb.append("    traitAttributePUIs: ").append(toIndentedString(traitAttributePUIs)).append("\n");
		sb.append("    traitAttributes: ").append(toIndentedString(traitAttributes)).append("\n");
		sb.append("    traitClasses: ").append(toIndentedString(traitClasses)).append("\n");
		sb.append("    traitDbIds: ").append(toIndentedString(traitDbIds)).append("\n");
		sb.append("    traitEntities: ").append(toIndentedString(traitEntities)).append("\n");
		sb.append("    traitEntityPUIs: ").append(toIndentedString(traitEntityPUIs)).append("\n");
		sb.append("    traitNames: ").append(toIndentedString(traitNames)).append("\n");
		sb.append("    traitPUIs: ").append(toIndentedString(traitPUIs)).append("\n");
		sb.append("    trialDbIds: ").append(toIndentedString(trialDbIds)).append("\n");
		sb.append("    trialNames: ").append(toIndentedString(trialNames)).append("\n");
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
