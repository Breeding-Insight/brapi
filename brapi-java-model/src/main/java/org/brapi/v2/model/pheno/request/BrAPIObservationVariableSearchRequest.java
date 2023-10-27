package org.brapi.v2.model.pheno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;
import org.brapi.v2.model.pheno.BrAPITraitDataType;

/**
 * BrAPIObservationVariableSearchRequest
 */

public class BrAPIObservationVariableSearchRequest extends BrAPISearchRequestParametersPaging {
	@JsonProperty("commonCropNames")
	private List<String> commonCropNames = null;

	@JsonProperty("dataTypes")
	private List<BrAPITraitDataType> dataTypes = null;

	@Deprecated
	@JsonProperty("externalReferenceIDs")
	private List<String> externalReferenceIDs = null;

	@JsonProperty("externalReferenceIds")
	private List<String> externalReferenceIds = null;

	@JsonProperty("externalReferenceSources")
	private List<String> externalReferenceSources = null;

	@JsonProperty("methodDbIds")
	private List<String> methodDbIds = null;

	@JsonProperty("methodNames")
	private List<String> methodNames = null;

	@JsonProperty("methodPUIs")
	private List<String> methodPUIs = null;

	@JsonProperty("observationVariableDbIds")
	private List<String> observationVariableDbIds = null;

	@JsonProperty("observationVariableNames")
	private List<String> observationVariableNames = null;

	@JsonProperty("observationVariablePUIs")
	private List<String> observationVariablePUIs = null;

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

	@Deprecated
	@JsonProperty("studyDbId")
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

	public BrAPIObservationVariableSearchRequest commonCropNames(List<String> commonCropNames) {
		this.commonCropNames = commonCropNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addCommonCropNamesItem(String commonCropNamesItem) {
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

	public BrAPIObservationVariableSearchRequest dataTypes(List<BrAPITraitDataType> dataTypes) {
		this.dataTypes = dataTypes;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addDataTypesItem(BrAPITraitDataType dataTypesItem) {
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
	public BrAPIObservationVariableSearchRequest externalReferenceIDs(List<String> externalReferenceIDs) {
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	@Deprecated
	public BrAPIObservationVariableSearchRequest addExternalReferenceIDsItem(String externalReferenceIDsItem) {
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

	public BrAPIObservationVariableSearchRequest externalReferenceIds(List<String> externalReferenceIds) {
		this.externalReferenceIds = externalReferenceIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addExternalReferenceIdsItem(String externalReferenceIdsItem) {
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

	public BrAPIObservationVariableSearchRequest externalReferenceSources(List<String> externalReferenceSources) {
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addExternalReferenceSourcesItem(String externalReferenceSourcesItem) {
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

	public BrAPIObservationVariableSearchRequest methodDbIds(List<String> methodDbIds) {
		this.methodDbIds = methodDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addMethodDbIdsItem(String methodDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest methodNames(List<String> methodNames) {
		this.methodNames = methodNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addMethodNamesItem(String methodNamesItem) {
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

	public BrAPIObservationVariableSearchRequest methodPUIs(List<String> methodPUIs) {
		this.methodPUIs = methodPUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addMethodPUIsItem(String methodPUIsItem) {
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

	public BrAPIObservationVariableSearchRequest observationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
		if (this.observationVariableDbIds == null) {
			this.observationVariableDbIds = new ArrayList<String>();
		}
		this.observationVariableDbIds.add(observationVariableDbIdsItem);
		return this;
	}

	/**
	 * The DbIds of Variables to search for
	 *
	 * @return observationVariableDbIds
	 **/

	public List<String> getObservationVariableDbIds() {
		return observationVariableDbIds;
	}

	public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
		this.observationVariableDbIds = observationVariableDbIds;
	}

	public BrAPIObservationVariableSearchRequest observationVariableNames(List<String> observationVariableNames) {
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addObservationVariableNamesItem(String observationVariableNamesItem) {
		if (this.observationVariableNames == null) {
			this.observationVariableNames = new ArrayList<String>();
		}
		this.observationVariableNames.add(observationVariableNamesItem);
		return this;
	}

	/**
	 * The names of Variables to search for
	 *
	 * @return observationVariableNames
	 **/

	public List<String> getObservationVariableNames() {
		return observationVariableNames;
	}

	public void setObservationVariableNames(List<String> observationVariableNames) {
		this.observationVariableNames = observationVariableNames;
	}

	public BrAPIObservationVariableSearchRequest observationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addObservationVariablePUIsItem(String observationVariablePUIsItem) {
		if (this.observationVariablePUIs == null) {
			this.observationVariablePUIs = new ArrayList<String>();
		}
		this.observationVariablePUIs.add(observationVariablePUIsItem);
		return this;
	}

	/**
	 * The Permanent Unique Identifier of an Observation Variable, usually in the
	 * form of a URI
	 *
	 * @return observationVariablePUIs
	 **/

	public List<String> getObservationVariablePUIs() {
		return observationVariablePUIs;
	}

	public void setObservationVariablePUIs(List<String> observationVariablePUIs) {
		this.observationVariablePUIs = observationVariablePUIs;
	}

	public BrAPIObservationVariableSearchRequest ontologyDbIds(List<String> ontologyDbIds) {
		this.ontologyDbIds = ontologyDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addOntologyDbIdsItem(String ontologyDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest programDbIds(List<String> programDbIds) {
		this.programDbIds = programDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addProgramDbIdsItem(String programDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest programNames(List<String> programNames) {
		this.programNames = programNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addProgramNamesItem(String programNamesItem) {
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

	public BrAPIObservationVariableSearchRequest scaleDbIds(List<String> scaleDbIds) {
		this.scaleDbIds = scaleDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addScaleDbIdsItem(String scaleDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest scaleNames(List<String> scaleNames) {
		this.scaleNames = scaleNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addScaleNamesItem(String scaleNamesItem) {
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

	public BrAPIObservationVariableSearchRequest scalePUIs(List<String> scalePUIs) {
		this.scalePUIs = scalePUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addScalePUIsItem(String scalePUIsItem) {
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
	public BrAPIObservationVariableSearchRequest studyDbId(List<String> studyDbId) {
		this.studyDbId = studyDbId;
		return this;
	}

	@Deprecated
	public BrAPIObservationVariableSearchRequest addStudyDbIdItem(String studyDbIdItem) {
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

	public BrAPIObservationVariableSearchRequest studyDbIds(List<String> studyDbIds) {
		this.studyDbIds = studyDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addStudyDbIdsItem(String studyDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest studyNames(List<String> studyNames) {
		this.studyNames = studyNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addStudyNamesItem(String studyNamesItem) {
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

	public BrAPIObservationVariableSearchRequest traitAttributePUIs(List<String> traitAttributePUIs) {
		this.traitAttributePUIs = traitAttributePUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitAttributePUIsItem(String traitAttributePUIsItem) {
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

	public BrAPIObservationVariableSearchRequest traitAttributes(List<String> traitAttributes) {
		this.traitAttributes = traitAttributes;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitAttributesItem(String traitAttributesItem) {
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

	public BrAPIObservationVariableSearchRequest traitClasses(List<String> traitClasses) {
		this.traitClasses = traitClasses;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitClassesItem(String traitClassesItem) {
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

	public BrAPIObservationVariableSearchRequest traitDbIds(List<String> traitDbIds) {
		this.traitDbIds = traitDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitDbIdsItem(String traitDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest traitEntities(List<String> traitEntities) {
		this.traitEntities = traitEntities;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitEntitiesItem(String traitEntitiesItem) {
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

	public BrAPIObservationVariableSearchRequest traitEntityPUIs(List<String> traitEntityPUIs) {
		this.traitEntityPUIs = traitEntityPUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitEntityPUIsItem(String traitEntityPUIsItem) {
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

	public BrAPIObservationVariableSearchRequest traitNames(List<String> traitNames) {
		this.traitNames = traitNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitNamesItem(String traitNamesItem) {
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

	public BrAPIObservationVariableSearchRequest traitPUIs(List<String> traitPUIs) {
		this.traitPUIs = traitPUIs;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTraitPUIsItem(String traitPUIsItem) {
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

	public BrAPIObservationVariableSearchRequest trialDbIds(List<String> trialDbIds) {
		this.trialDbIds = trialDbIds;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTrialDbIdsItem(String trialDbIdsItem) {
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

	public BrAPIObservationVariableSearchRequest trialNames(List<String> trialNames) {
		this.trialNames = trialNames;
		return this;
	}

	public BrAPIObservationVariableSearchRequest addTrialNamesItem(String trialNamesItem) {
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
		BrAPIObservationVariableSearchRequest observationVariableSearchRequest = (BrAPIObservationVariableSearchRequest) o;
		return Objects.equals(this.commonCropNames, observationVariableSearchRequest.commonCropNames)
				&& Objects.equals(this.dataTypes, observationVariableSearchRequest.dataTypes)
				&& Objects.equals(this.externalReferenceIDs, observationVariableSearchRequest.externalReferenceIDs)
				&& Objects.equals(this.externalReferenceIds, observationVariableSearchRequest.externalReferenceIds)
				&& Objects.equals(this.externalReferenceSources,
						observationVariableSearchRequest.externalReferenceSources)
				&& Objects.equals(this.methodDbIds, observationVariableSearchRequest.methodDbIds)
				&& Objects.equals(this.methodNames, observationVariableSearchRequest.methodNames)
				&& Objects.equals(this.methodPUIs, observationVariableSearchRequest.methodPUIs)
				&& Objects.equals(this.observationVariableDbIds,
						observationVariableSearchRequest.observationVariableDbIds)
				&& Objects.equals(this.observationVariableNames,
						observationVariableSearchRequest.observationVariableNames)
				&& Objects.equals(this.observationVariablePUIs,
						observationVariableSearchRequest.observationVariablePUIs)
				&& Objects.equals(this.ontologyDbIds, observationVariableSearchRequest.ontologyDbIds)
				&& Objects.equals(this.programDbIds, observationVariableSearchRequest.programDbIds)
				&& Objects.equals(this.programNames, observationVariableSearchRequest.programNames)
				&& Objects.equals(this.scaleDbIds, observationVariableSearchRequest.scaleDbIds)
				&& Objects.equals(this.scaleNames, observationVariableSearchRequest.scaleNames)
				&& Objects.equals(this.scalePUIs, observationVariableSearchRequest.scalePUIs)
				&& Objects.equals(this.studyDbId, observationVariableSearchRequest.studyDbId)
				&& Objects.equals(this.studyDbIds, observationVariableSearchRequest.studyDbIds)
				&& Objects.equals(this.studyNames, observationVariableSearchRequest.studyNames)
				&& Objects.equals(this.traitAttributePUIs, observationVariableSearchRequest.traitAttributePUIs)
				&& Objects.equals(this.traitAttributes, observationVariableSearchRequest.traitAttributes)
				&& Objects.equals(this.traitClasses, observationVariableSearchRequest.traitClasses)
				&& Objects.equals(this.traitDbIds, observationVariableSearchRequest.traitDbIds)
				&& Objects.equals(this.traitEntities, observationVariableSearchRequest.traitEntities)
				&& Objects.equals(this.traitEntityPUIs, observationVariableSearchRequest.traitEntityPUIs)
				&& Objects.equals(this.traitNames, observationVariableSearchRequest.traitNames)
				&& Objects.equals(this.traitPUIs, observationVariableSearchRequest.traitPUIs)
				&& Objects.equals(this.trialDbIds, observationVariableSearchRequest.trialDbIds)
				&& Objects.equals(this.trialNames, observationVariableSearchRequest.trialNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commonCropNames, dataTypes, externalReferenceIDs, externalReferenceIds,
				externalReferenceSources, methodDbIds, methodNames, methodPUIs, observationVariableDbIds,
				observationVariableNames, observationVariablePUIs, ontologyDbIds, programDbIds, programNames,
				scaleDbIds, scaleNames, scalePUIs, studyDbId, studyDbIds, studyNames, traitAttributePUIs,
				traitAttributes, traitClasses, traitDbIds, traitEntities, traitEntityPUIs, traitNames, traitPUIs,
				trialDbIds, trialNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrAPIObservationVariableSearchRequest {\n");

		sb.append("    commonCropNames: ").append(toIndentedString(commonCropNames)).append("\n");
		sb.append("    dataTypes: ").append(toIndentedString(dataTypes)).append("\n");
		sb.append("    externalReferenceIDs: ").append(toIndentedString(externalReferenceIDs)).append("\n");
		sb.append("    externalReferenceIds: ").append(toIndentedString(externalReferenceIds)).append("\n");
		sb.append("    externalReferenceSources: ").append(toIndentedString(externalReferenceSources)).append("\n");
		sb.append("    methodDbIds: ").append(toIndentedString(methodDbIds)).append("\n");
		sb.append("    methodNames: ").append(toIndentedString(methodNames)).append("\n");
		sb.append("    methodPUIs: ").append(toIndentedString(methodPUIs)).append("\n");
		sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
		sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
		sb.append("    observationVariablePUIs: ").append(toIndentedString(observationVariablePUIs)).append("\n");
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
