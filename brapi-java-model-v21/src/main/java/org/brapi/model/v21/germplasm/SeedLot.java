/*
 * BrAPI-Germplasm
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/RESTfulness\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Response_Structure\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Dates_and_Times\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Location_Coordinates\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Error_Handling\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://wiki.brapi.org/index.php/Search_Services\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.1</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/brapi-V2.1/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm/2.1\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm21.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.model.v21.germplasm;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.*;

/**
 * SeedLot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-25T17:45:22.672Z[GMT]")
public class SeedLot {
    @SerializedName("additionalInfo")
    private Map<String, String> additionalInfo = null;

    @SerializedName("amount")
    private BigDecimal amount = null;

    @SerializedName("contentMixture")
    private List<SeedLotContentMixture> contentMixture = null;

    @SerializedName("createdDate")
    private OffsetDateTime createdDate = null;

    @SerializedName("externalReferences")
    private List<CrossExternalReferences> externalReferences = null;

    @SerializedName("lastUpdated")
    private OffsetDateTime lastUpdated = null;

    @SerializedName("locationDbId")
    private String locationDbId = null;

    @SerializedName("locationName")
    private String locationName = null;

    @SerializedName("programDbId")
    private String programDbId = null;

    @SerializedName("programName")
    private String programName = null;

    @SerializedName("seedLotDbId")
    private String seedLotDbId = null;

    @SerializedName("seedLotDescription")
    private String seedLotDescription = null;

    @SerializedName("seedLotName")
    private String seedLotName = null;

    @SerializedName("sourceCollection")
    private String sourceCollection = null;

    @SerializedName("storageLocation")
    private String storageLocation = null;

    @SerializedName("units")
    private String units = null;

    public SeedLot additionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public SeedLot putAdditionalInfoItem(String key, String additionalInfoItem) {
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

    public SeedLot amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The current balance of the amount of material in a SeedLot. Could be a count (seeds, bulbs, etc) or a weight (kg of seed).
     *
     * @return amount
     **/
    @Schema(example = "561", description = "The current balance of the amount of material in a SeedLot. Could be a count (seeds, bulbs, etc) or a weight (kg of seed).")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SeedLot contentMixture(List<SeedLotContentMixture> contentMixture) {
        this.contentMixture = contentMixture;
        return this;
    }

    public SeedLot addContentMixtureItem(SeedLotContentMixture contentMixtureItem) {
        if (this.contentMixture == null) {
            this.contentMixture = new ArrayList<SeedLotContentMixture>();
        }
        this.contentMixture.add(contentMixtureItem);
        return this;
    }

    /**
     * The mixture of germplasm present in the seed lot. &lt;br/&gt; If this seed lot only contains a single germplasm, the response should contain the name  and DbId of that germplasm with a mixturePercentage value of 100 &lt;br/&gt; If the seed lot contains a mixture of different germplasm, the response should contain  the name and DbId every germplasm present. The mixturePercentage field should contain  the ratio of each germplasm in the total mixture. All of the mixturePercentage values  in this array should sum to equal 100.
     *
     * @return contentMixture
     **/
    @Schema(description = "The mixture of germplasm present in the seed lot. <br/> If this seed lot only contains a single germplasm, the response should contain the name  and DbId of that germplasm with a mixturePercentage value of 100 <br/> If the seed lot contains a mixture of different germplasm, the response should contain  the name and DbId every germplasm present. The mixturePercentage field should contain  the ratio of each germplasm in the total mixture. All of the mixturePercentage values  in this array should sum to equal 100.")
    public List<SeedLotContentMixture> getContentMixture() {
        return contentMixture;
    }

    public void setContentMixture(List<SeedLotContentMixture> contentMixture) {
        this.contentMixture = contentMixture;
    }

    public SeedLot createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * The time stamp for when this seed lot was created
     *
     * @return createdDate
     **/
    @Schema(description = "The time stamp for when this seed lot was created")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public SeedLot externalReferences(List<CrossExternalReferences> externalReferences) {
        this.externalReferences = externalReferences;
        return this;
    }

    public SeedLot addExternalReferencesItem(CrossExternalReferences externalReferencesItem) {
        if (this.externalReferences == null) {
            this.externalReferences = new ArrayList<CrossExternalReferences>();
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
    public List<CrossExternalReferences> getExternalReferences() {
        return externalReferences;
    }

    public void setExternalReferences(List<CrossExternalReferences> externalReferences) {
        this.externalReferences = externalReferences;
    }

    public SeedLot lastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * The timestamp for the last update to this Seed Lot (including transactions)
     *
     * @return lastUpdated
     **/
    @Schema(description = "The timestamp for the last update to this Seed Lot (including transactions)")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public SeedLot locationDbId(String locationDbId) {
        this.locationDbId = locationDbId;
        return this;
    }

    /**
     * The unique identifier for a Location
     *
     * @return locationDbId
     **/
    @Schema(example = "3cfdd67d", description = "The unique identifier for a Location")
    public String getLocationDbId() {
        return locationDbId;
    }

    public void setLocationDbId(String locationDbId) {
        this.locationDbId = locationDbId;
    }

    public SeedLot locationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * A human readable name for a location
     *
     * @return locationName
     **/
    @Schema(example = "Location 1", description = "A human readable name for a location")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public SeedLot programDbId(String programDbId) {
        this.programDbId = programDbId;
        return this;
    }

    /**
     * The unique DbId of the breeding program this Seed Lot belongs to
     *
     * @return programDbId
     **/
    @Schema(example = "e972d569", description = "The unique DbId of the breeding program this Seed Lot belongs to")
    public String getProgramDbId() {
        return programDbId;
    }

    public void setProgramDbId(String programDbId) {
        this.programDbId = programDbId;
    }

    public SeedLot programName(String programName) {
        this.programName = programName;
        return this;
    }

    /**
     * The human readable name of the breeding program this Seed Lot belongs to
     *
     * @return programName
     **/
    @Schema(example = "Tomatillo_Breeding_Program", description = "The human readable name of the breeding program this Seed Lot belongs to")
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public SeedLot seedLotDbId(String seedLotDbId) {
        this.seedLotDbId = seedLotDbId;
        return this;
    }

    /**
     * Unique DbId for the Seed Lot
     *
     * @return seedLotDbId
     **/
    @Schema(example = "261ecb09", description = "Unique DbId for the Seed Lot")
    public String getSeedLotDbId() {
        return seedLotDbId;
    }

    public void setSeedLotDbId(String seedLotDbId) {
        this.seedLotDbId = seedLotDbId;
    }

    public SeedLot seedLotDescription(String seedLotDescription) {
        this.seedLotDescription = seedLotDescription;
        return this;
    }

    /**
     * A general description of this Seed Lot
     *
     * @return seedLotDescription
     **/
    @Schema(example = "This is a description of a seed lot", description = "A general description of this Seed Lot")
    public String getSeedLotDescription() {
        return seedLotDescription;
    }

    public void setSeedLotDescription(String seedLotDescription) {
        this.seedLotDescription = seedLotDescription;
    }

    public SeedLot seedLotName(String seedLotName) {
        this.seedLotName = seedLotName;
        return this;
    }

    /**
     * A human readable name for this Seed Lot
     *
     * @return seedLotName
     **/
    @Schema(example = "Seed Lot Alpha", description = "A human readable name for this Seed Lot")
    public String getSeedLotName() {
        return seedLotName;
    }

    public void setSeedLotName(String seedLotName) {
        this.seedLotName = seedLotName;
    }

    public SeedLot sourceCollection(String sourceCollection) {
        this.sourceCollection = sourceCollection;
        return this;
    }

    /**
     * The description of the source where this material was originally collected (wild, nursery, etc)
     *
     * @return sourceCollection
     **/
    @Schema(example = "nursery", description = "The description of the source where this material was originally collected (wild, nursery, etc)")
    public String getSourceCollection() {
        return sourceCollection;
    }

    public void setSourceCollection(String sourceCollection) {
        this.sourceCollection = sourceCollection;
    }

    public SeedLot storageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Description the storage location
     *
     * @return storageLocation
     **/
    @Schema(example = "The storage location is an massive, underground, bunker.", description = "Description the storage location")
    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public SeedLot units(String units) {
        this.units = units;
        return this;
    }

    /**
     * A description of the things being counted in a SeedLot (seeds, bulbs, kg, tree, etc)
     *
     * @return units
     **/
    @Schema(example = "seeds", description = "A description of the things being counted in a SeedLot (seeds, bulbs, kg, tree, etc)")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeedLot seedLot = (SeedLot) o;
        return Objects.equals(this.additionalInfo, seedLot.additionalInfo) &&
                Objects.equals(this.amount, seedLot.amount) &&
                Objects.equals(this.contentMixture, seedLot.contentMixture) &&
                Objects.equals(this.createdDate, seedLot.createdDate) &&
                Objects.equals(this.externalReferences, seedLot.externalReferences) &&
                Objects.equals(this.lastUpdated, seedLot.lastUpdated) &&
                Objects.equals(this.locationDbId, seedLot.locationDbId) &&
                Objects.equals(this.locationName, seedLot.locationName) &&
                Objects.equals(this.programDbId, seedLot.programDbId) &&
                Objects.equals(this.programName, seedLot.programName) &&
                Objects.equals(this.seedLotDbId, seedLot.seedLotDbId) &&
                Objects.equals(this.seedLotDescription, seedLot.seedLotDescription) &&
                Objects.equals(this.seedLotName, seedLot.seedLotName) &&
                Objects.equals(this.sourceCollection, seedLot.sourceCollection) &&
                Objects.equals(this.storageLocation, seedLot.storageLocation) &&
                Objects.equals(this.units, seedLot.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, amount, contentMixture, createdDate, externalReferences, lastUpdated, locationDbId, locationName, programDbId, programName, seedLotDbId, seedLotDescription, seedLotName, sourceCollection, storageLocation, units);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeedLot {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    contentMixture: ").append(toIndentedString(contentMixture)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    locationDbId: ").append(toIndentedString(locationDbId)).append("\n");
        sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
        sb.append("    programDbId: ").append(toIndentedString(programDbId)).append("\n");
        sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
        sb.append("    seedLotDbId: ").append(toIndentedString(seedLotDbId)).append("\n");
        sb.append("    seedLotDescription: ").append(toIndentedString(seedLotDescription)).append("\n");
        sb.append("    seedLotName: ").append(toIndentedString(seedLotName)).append("\n");
        sb.append("    sourceCollection: ").append(toIndentedString(sourceCollection)).append("\n");
        sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
