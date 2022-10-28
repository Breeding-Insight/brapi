/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.phenotype;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;

/**
 * ObservationUnit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:44:48.481Z[GMT]")
public class ObservationUnit {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("crossDbId")
    private String crossDbId = null;

    @SerializedName("crossName")
    private String crossName = null;

    @SerializedName("externalReferences")
    private List<ExternalReferencesInner> externalReferences = null;

    @SerializedName("germplasmDbId")
    private String germplasmDbId = null;

    @SerializedName("germplasmName")
    private String germplasmName = null;

    @SerializedName("locationDbId")
    private String locationDbId = null;

    @SerializedName("locationName")
    private String locationName = null;

    @SerializedName("observationUnitDbId")
    private String observationUnitDbId = null;

    @SerializedName("observationUnitName")
    private String observationUnitName = null;

    @SerializedName("observationUnitPUI")
    private String observationUnitPUI = null;

    @SerializedName("observationUnitPosition")
    private ObservationUnitObservationUnitPosition observationUnitPosition = null;

    @SerializedName("observations")
    private List<ObservationUnitObservations> observations = null;

    @SerializedName("programDbId")
    private String programDbId = null;

    @SerializedName("programName")
    private String programName = null;

    @SerializedName("seedLotDbId")
    private String seedLotDbId = null;

    @SerializedName("seedLotName")
    private String seedLotName = null;

    @SerializedName("studyDbId")
    private String studyDbId = null;

    @SerializedName("studyName")
    private String studyName = null;

    @SerializedName("treatments")
    private List<ObservationUnitTreatments> treatments = null;

    @SerializedName("trialDbId")
    private String trialDbId = null;

    @SerializedName("trialName")
    private String trialName = null;

    public ObservationUnit additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public ObservationUnit putAdditionalInfoItem(String key, String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<String, String>();
        }
        this.additionalInfo.put(key, additionalInfoItem);
        return this;
    }

    /**
     * A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.
     *
     * @return additionalInfo
     **/
    @Schema(description = "A free space containing any additional information related to a particular object. A data source may provide any JSON object, unrestriced by the BrAPI specification.")
    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ObservationUnit crossDbId(String crossDbId) {
        this.crossDbId = crossDbId;
        return this;
    }

    /**
     * the unique identifier for a cross
     *
     * @return crossDbId
     **/
    @Schema(example = "d105fd6f", description = "the unique identifier for a cross")
    public String getCrossDbId() {
        return crossDbId;
    }

    public void setCrossDbId(String crossDbId) {
        this.crossDbId = crossDbId;
    }

    public ObservationUnit crossName(String crossName) {
        this.crossName = crossName;
        return this;
    }

    /**
     * the human readable name for a cross
     *
     * @return crossName
     **/
    @Schema(example = "my_Crosses_2018_01", description = "the human readable name for a cross")
    public String getCrossName() {
        return crossName;
    }

    public void setCrossName(String crossName) {
        this.crossName = crossName;
    }

    public ObservationUnit externalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public ObservationUnit addExternalReferencesItem(ExternalReferencesInner externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<ExternalReferencesInner>();
        }
        this.externalReferences.add(externalReferencesItem);
        return this;
    }

    /**
     * An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.
     *
     * @return externalReferences
     **/
    @Schema(example = "[{\"referenceId\":\"doi:10.155454/12341234\",\"referenceSource\":\"DOI\"},{\"referenceId\":\"75a50e76\",\"referenceSource\":\"Remote Data Collection Upload Tool\"}]", description = "An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.")
    public List<ExternalReferencesInner> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<ExternalReferencesInner> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public ObservationUnit germplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a germplasm
     *
     * @return germplasmDbId
     **/
    @Schema(example = "e9d9ed57", description = "The ID which uniquely identifies a germplasm")
    public String getGermplasmDbId() {
        return germplasmDbId;
    }

    public void setGermplasmDbId(String germplasmDbId) {
        this.germplasmDbId = germplasmDbId;
    }

    public ObservationUnit germplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
        return this;
    }

    /**
     * Name of the germplasm. It can be the preferred name and does not have to be unique.
     *
     * @return germplasmName
     **/
    @Schema(example = "A0000001", description = "Name of the germplasm. It can be the preferred name and does not have to be unique.")
    public String getGermplasmName() {
        return germplasmName;
    }

    public void setGermplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
    }

    public ObservationUnit locationDbId(String locationDbId) {
        this.locationDbId = locationDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a location, associated with this study
     *
     * @return locationDbId
     **/
    @Schema(example = "0e208b20", description = "The ID which uniquely identifies a location, associated with this study")
    public String getLocationDbId() {
        return locationDbId;
    }

    public void setLocationDbId(String locationDbId) {
        this.locationDbId = locationDbId;
    }

    public ObservationUnit locationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * The human readable name of a location associated with this study
     *
     * @return locationName
     **/
    @Schema(example = "Field Station Alpha", description = "The human readable name of a location associated with this study")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public ObservationUnit observationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies an observation unit  MIAPPE V1.1 (DM-70) Observation unit ID - Identifier used to identify the observation unit in data files containing the values observed or measured on that unit. Must be locally unique.
     *
     * @return observationUnitDbId
     **/
    @Schema(example = "8c67503c", description = "The ID which uniquely identifies an observation unit  MIAPPE V1.1 (DM-70) Observation unit ID - Identifier used to identify the observation unit in data files containing the values observed or measured on that unit. Must be locally unique. ")
    public String getObservationUnitDbId() {
        return observationUnitDbId;
    }

    public void setObservationUnitDbId(String observationUnitDbId) {
        this.observationUnitDbId = observationUnitDbId;
    }

    public ObservationUnit observationUnitName(String observationUnitName) {
        this.observationUnitName = observationUnitName;
        return this;
    }

    /**
     * A human readable name for an observation unit
     *
     * @return observationUnitName
     **/
    @Schema(example = "Plot 1", description = "A human readable name for an observation unit")
    public String getObservationUnitName() {
        return observationUnitName;
    }

    public void setObservationUnitName(String observationUnitName) {
        this.observationUnitName = observationUnitName;
    }

    public ObservationUnit observationUnitPUI(String observationUnitPUI) {
        this.observationUnitPUI = observationUnitPUI;
        return this;
    }

    /**
     * A Permanent Unique Identifier for an observation unit  MIAPPE V1.1 (DM-72) External ID - Identifier for the observation unit in a persistent repository, comprises the name of the repository and the identifier of the observation unit therein. The EBI Biosamples repository can be used. URI are recommended when possible.
     *
     * @return observationUnitPUI
     **/
    @Schema(example = "http://pui.per/plot/1a9afc14", description = "A Permanent Unique Identifier for an observation unit  MIAPPE V1.1 (DM-72) External ID - Identifier for the observation unit in a persistent repository, comprises the name of the repository and the identifier of the observation unit therein. The EBI Biosamples repository can be used. URI are recommended when possible.")
    public String getObservationUnitPUI() {
        return observationUnitPUI;
    }

    public void setObservationUnitPUI(String observationUnitPUI) {
        this.observationUnitPUI = observationUnitPUI;
    }

    public ObservationUnit observationUnitPosition(ObservationUnitObservationUnitPosition observationUnitPosition) {
        this.observationUnitPosition = observationUnitPosition;
        return this;
    }

    /**
     * Get observationUnitPosition
     *
     * @return observationUnitPosition
     **/
    @Schema(description = "")
    public ObservationUnitObservationUnitPosition getObservationUnitPosition() {
        return observationUnitPosition;
    }

    public void setObservationUnitPosition(ObservationUnitObservationUnitPosition observationUnitPosition) {
        this.observationUnitPosition = observationUnitPosition;
    }

    public ObservationUnit observations(List<ObservationUnitObservations> observations) {
        this.observations = observations;
        return this;
    }

    public ObservationUnit addObservationsItem(ObservationUnitObservations observationsItem) {
        if (this.observations == null) {
            this.observations = new ArrayList<ObservationUnitObservations>();
        }
        this.observations.add(observationsItem);
        return this;
    }

    /**
     * All observations attached to this observation unit.   Default for this field is null or omitted. Do NOT include data in this field unless the &#x27;includeObservations&#x27; flag is explicitly set to True.
     *
     * @return observations
     **/
    @Schema(description = "All observations attached to this observation unit.   Default for this field is null or omitted. Do NOT include data in this field unless the 'includeObservations' flag is explicitly set to True.")
    public List<ObservationUnitObservations> getObservations() {
        return observations;
    }

    public void setObservations(List<ObservationUnitObservations> observations) {
        this.observations = observations;
    }

    public ObservationUnit programDbId(String programDbId) {
        this.programDbId = programDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a program
     *
     * @return programDbId
     **/
    @Schema(example = "2d763a7a", description = "The ID which uniquely identifies a program")
    public String getProgramDbId() {
        return programDbId;
    }

    public void setProgramDbId(String programDbId) {
        this.programDbId = programDbId;
    }

    public ObservationUnit programName(String programName) {
        this.programName = programName;
        return this;
    }

    /**
     * The human readable name of a program
     *
     * @return programName
     **/
    @Schema(example = "The Perfect Breeding Program", description = "The human readable name of a program")
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public ObservationUnit seedLotDbId(String seedLotDbId) {
        this.seedLotDbId = seedLotDbId;
        return this;
    }

    /**
     * The unique identifier for the originating Seed Lot
     *
     * @return seedLotDbId
     **/
    @Schema(example = "261ecb09", description = "The unique identifier for the originating Seed Lot")
    public String getSeedLotDbId() {
        return seedLotDbId;
    }

    public void setSeedLotDbId(String seedLotDbId) {
        this.seedLotDbId = seedLotDbId;
    }

    public ObservationUnit seedLotName(String seedLotName) {
        this.seedLotName = seedLotName;
        return this;
    }

    /**
     * A human readable name for the originating Seed Lot
     *
     * @return seedLotName
     **/
    @Schema(example = "Seed Lot Alpha", description = "A human readable name for the originating Seed Lot")
    public String getSeedLotName() {
        return seedLotName;
    }

    public void setSeedLotName(String seedLotName) {
        this.seedLotName = seedLotName;
    }

    public ObservationUnit studyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a study within the given database server
     *
     * @return studyDbId
     **/
    @Schema(example = "9865addc", description = "The ID which uniquely identifies a study within the given database server")
    public String getStudyDbId() {
        return studyDbId;
    }

    public void setStudyDbId(String studyDbId) {
        this.studyDbId = studyDbId;
    }

    public ObservationUnit studyName(String studyName) {
        this.studyName = studyName;
        return this;
    }

    /**
     * The human readable name for a study
     *
     * @return studyName
     **/
    @Schema(example = "Purple_Tomato_1", description = "The human readable name for a study")
    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public ObservationUnit treatments(List<ObservationUnitTreatments> treatments) {
        this.treatments = treatments;
        return this;
    }

    public ObservationUnit addTreatmentsItem(ObservationUnitTreatments treatmentsItem) {
        if (this.treatments == null) {
            this.treatments = new ArrayList<ObservationUnitTreatments>();
        }
        this.treatments.add(treatmentsItem);
        return this;
    }

    /**
     * List of treatments applied to an observation unit.  MIAPPE V1.1 (DM-74) Observation Unit factor value - List of values for each factor applied to the observation unit.
     *
     * @return treatments
     **/
    @Schema(description = "List of treatments applied to an observation unit.  MIAPPE V1.1 (DM-74) Observation Unit factor value - List of values for each factor applied to the observation unit.")
    public List<ObservationUnitTreatments> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<ObservationUnitTreatments> treatments) {
        this.treatments = treatments;
    }

    public ObservationUnit trialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a trial
     *
     * @return trialDbId
     **/
    @Schema(example = "776a609c", description = "The ID which uniquely identifies a trial")
    public String getTrialDbId() {
        return trialDbId;
    }

    public void setTrialDbId(String trialDbId) {
        this.trialDbId = trialDbId;
    }

    public ObservationUnit trialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * The human readable name of a trial
     *
     * @return trialName
     **/
    @Schema(example = "Purple Tomato", description = "The human readable name of a trial")
    public String getTrialName() {
        return trialName;
    }

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObservationUnit observationUnit = (ObservationUnit) o;
        return Objects.equals(this.additionalInfo, observationUnit.additionalInfo) &&
                Objects.equals(this.crossDbId, observationUnit.crossDbId) &&
                Objects.equals(this.crossName, observationUnit.crossName) &&
                Objects.equals(this.externalReferences, observationUnit.externalReferences) &&
                Objects.equals(this.germplasmDbId, observationUnit.germplasmDbId) &&
                Objects.equals(this.germplasmName, observationUnit.germplasmName) &&
                Objects.equals(this.locationDbId, observationUnit.locationDbId) &&
                Objects.equals(this.locationName, observationUnit.locationName) &&
                Objects.equals(this.observationUnitDbId, observationUnit.observationUnitDbId) &&
                Objects.equals(this.observationUnitName, observationUnit.observationUnitName) &&
                Objects.equals(this.observationUnitPUI, observationUnit.observationUnitPUI) &&
                Objects.equals(this.observationUnitPosition, observationUnit.observationUnitPosition) &&
                Objects.equals(this.observations, observationUnit.observations) &&
                Objects.equals(this.programDbId, observationUnit.programDbId) &&
                Objects.equals(this.programName, observationUnit.programName) &&
                Objects.equals(this.seedLotDbId, observationUnit.seedLotDbId) &&
                Objects.equals(this.seedLotName, observationUnit.seedLotName) &&
                Objects.equals(this.studyDbId, observationUnit.studyDbId) &&
                Objects.equals(this.studyName, observationUnit.studyName) &&
                Objects.equals(this.treatments, observationUnit.treatments) &&
                Objects.equals(this.trialDbId, observationUnit.trialDbId) &&
                Objects.equals(this.trialName, observationUnit.trialName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, crossDbId, crossName, externalReferences, germplasmDbId, germplasmName, locationDbId, locationName, observationUnitDbId, observationUnitName, observationUnitPUI, observationUnitPosition, observations, programDbId, programName, seedLotDbId, seedLotName, studyDbId, studyName, treatments, trialDbId, trialName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObservationUnit {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    crossDbId: ").append(toIndentedString(crossDbId)).append("\n");
        sb.append("    crossName: ").append(toIndentedString(crossName)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
        sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
        sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
        sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
        sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
        sb.append("    observationUnitName: ").append(toIndentedString(observationUnitName)).append("\n");
        sb.append("    observationUnitPUI: ").append(toIndentedString(observationUnitPUI)).append("\n");
        sb.append("    observationUnitPosition: ").append(toIndentedString(observationUnitPosition)).append("\n");
        sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
        sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
        sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
        sb.append("    seedLotDbId: ").append(toIndentedString(seedLotDbId)).append("\n");
        sb.append("    seedLotName: ").append(toIndentedString(seedLotName)).append("\n");
        sb.append("    studyDbId: ").append(toIndentedString(studyDbId)).append("\n");
        sb.append("    studyName: ").append(toIndentedString(studyName)).append("\n");
        sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
        sb.append("    trialDbId: ").append(toIndentedString(trialDbId)).append("\n");
        sb.append("    trialName: ").append(toIndentedString(trialName)).append("\n");
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
