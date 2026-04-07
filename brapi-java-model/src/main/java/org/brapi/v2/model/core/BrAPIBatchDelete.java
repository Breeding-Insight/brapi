package org.brapi.v2.model.core;

import java.time.OffsetDateTime;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.Gson;
import org.brapi.v2.model.BrAPIExternalReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

/**
 * BatchDelete
 */

public class BrAPIBatchDelete {
    @JsonProperty("batchDeleteDbId")
    private String batchDeleteDbId = null;

    @JsonProperty("dateCreated")
    private Date dateCreated;

    @JsonProperty("dateModified")
    private Date dateModified;

    @JsonProperty("batchDeleteDescription")
    private String batchDeleteDescription;

    @JsonProperty("batchDeleteName")
    private String batchDeleteName;

    @JsonProperty("batchDeleteOwnerName")
    private String batchDeleteOwnerName;

    @JsonProperty("batchDeleteSource")
    private String batchDeleteSource;

    @JsonProperty("additionalInfo")
    private Object additionalInfo;

    @JsonProperty("externalReferences")
    private List<BrAPIExternalReference> externalReferences = null;

    @JsonProperty("batchDeleteOwnerPersonDbId")
    private String batchDeleteOwnerPersonDbId;

    @JsonProperty("batchDeleteSize")
    private Integer batchDeleteSize;

    public enum BatchDeleteTypes {
        GERMPLASM("germplasm"),
        LISTS("lists"),
        TRIALS("trials"),
        SAMPLES("samples");


        private final String value;

        BatchDeleteTypes(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BatchDeleteTypes fromValue(String text) {
            for (BatchDeleteTypes b : BatchDeleteTypes.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    @JsonProperty("batchDeleteType")
    private BatchDeleteTypes batchDeleteType;

    private final transient Gson gson = new Gson();


    public BrAPIBatchDelete batchDeleteDbId(String batchDeleteDbId) {
        this.batchDeleteDbId = batchDeleteDbId;
        return this;
    }

    /**
     * The ID which uniquely identifies a batch delete within the given database server
     * @return batchDeleteDbId
     **/
    public String getBatchDeleteDbId() {
        return batchDeleteDbId;
    }

    public void setBatchDeleteDbId(String batchDeleteDbId) {
        this.batchDeleteDbId = batchDeleteDbId;
    }

    public BrAPIBatchDelete additionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Additional arbitrary info
     *
     * @return additionalInfo
     **/
    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public BrAPIBatchDelete dateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * Timestamp when the entity was first created
     * @return dateCreated
     **/
    @Valid
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public BrAPIBatchDelete dateModified(Date dateModified) {
        this.dateModified = dateModified;
        return this;
    }

    /**
     * Timestamp when the entity was last updated
     * @return dateModified
     **/
    @Valid
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public BrAPIBatchDelete externalReferences(List<BrAPIExternalReference> externalReferences) {
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

    public BrAPIBatchDelete batchDeleteDescription(String batchDeleteDescription) {
        this.batchDeleteDescription = batchDeleteDescription;
        return this;
    }

    /**
     * Description of a Batch
     * @return batchDescription
     **/

    public String getBatchDeleteDescription() {
        return batchDeleteDescription;
    }

    public void setBatchDeleteDescription(String batchDeleteDescription) {
        this.batchDeleteDescription = batchDeleteDescription;
    }

    public BrAPIBatchDelete batchDeleteName(String batchDeleteName) {
        this.batchDeleteName = batchDeleteName;
        return this;
    }

    /**
     * Human readable name of a Batch
     * @return batchName
     **/

    public String getBatchDeleteName() {
        return batchDeleteName;
    }

    public void setBatchDeleteName(String batchDeleteName) {
        this.batchDeleteName = batchDeleteName;
    }

    public BrAPIBatchDelete batchDeleteOwnerName(String batchDeleteOwnerName) {
        this.batchDeleteOwnerName = batchDeleteOwnerName;
        return this;
    }

    /**
     * Human readable name of a Batch Owner. (usually a user or person)
     * @return batchOwnerName
     **/

    public String getBatchDeleteOwnerName() {
        return batchDeleteOwnerName;
    }

    public void setBatchDeleteOwnerName(String batchDeleteOwnerName) {
        this.batchDeleteOwnerName = batchDeleteOwnerName;
    }

    public BrAPIBatchDelete batchDeleteOwnerPersonDbId(String batchDeleteOwnerPersonDbId) {
        this.batchDeleteOwnerPersonDbId = batchDeleteOwnerPersonDbId;
        return this;
    }

    /**
     * The unique identifier for a Batch Owner. (usually a user or person)
     * @return batchOwnerPersonDbId
     **/
    public String getBatchDeleteOwnerPersonDbId() {
        return batchDeleteOwnerPersonDbId;
    }

    public void setBatchDeleteOwnerPersonDbId(String batchDeleteOwnerPersonDbId) {
        this.batchDeleteOwnerPersonDbId = batchDeleteOwnerPersonDbId;
    }

    public BrAPIBatchDelete batchDeleteSize(Integer batchDeleteSize) {
        this.batchDeleteSize = batchDeleteSize;
        return this;
    }

    /**
     * The number of elements in a Batch
     * @return batchSize
     **/
    public Integer getBatchDeleteSize() {
        return batchDeleteSize;
    }

    public void setBatchDeleteSize(Integer batchDeleteSize) {
        this.batchDeleteSize = batchDeleteSize;
    }

    public BrAPIBatchDelete batchDeleteSource(String batchDeleteSource) {
        this.batchDeleteSource = batchDeleteSource;
        return this;
    }

    /**
     * The description of where a Batch originated from
     * @return batchSource
     **/
    public String getBatchDeleteSource() {
        return batchDeleteSource;
    }

    public void setBatchDeleteSource(String batchDeleteSource) {
        this.batchDeleteSource = batchDeleteSource;
    }

    public BrAPIBatchDelete batchDeleteType(BatchDeleteTypes batchDeleteType) {
        this.batchDeleteType = batchDeleteType;
        return this;
    }

    /**
     * Get batchType
     * @return batchType
     **/
    @Valid
    public BatchDeleteTypes getBatchDeleteType() {
        return batchDeleteType;
    }

    public void setBatchDeleteType(BatchDeleteTypes batchDeleteType) {
        this.batchDeleteType = batchDeleteType;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrAPIBatchDelete batchDelete = (BrAPIBatchDelete) o;
        return Objects.equals(this.additionalInfo, batchDelete.additionalInfo) &&
                Objects.equals(this.dateCreated, batchDelete.dateCreated) &&
                Objects.equals(this.dateModified, batchDelete.dateModified) &&
                Objects.equals(this.externalReferences, batchDelete.externalReferences) &&
                Objects.equals(this.batchDeleteDescription, batchDelete.batchDeleteDescription) &&
                Objects.equals(this.batchDeleteName, batchDelete.batchDeleteName) &&
                Objects.equals(this.batchDeleteOwnerName, batchDelete.batchDeleteOwnerName) &&
                Objects.equals(this.batchDeleteOwnerPersonDbId, batchDelete.batchDeleteOwnerPersonDbId) &&
                Objects.equals(this.batchDeleteSize, batchDelete.batchDeleteSize) &&
                Objects.equals(this.batchDeleteSource, batchDelete.batchDeleteSource) &&
                Objects.equals(this.batchDeleteType, batchDelete.batchDeleteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalInfo, dateCreated, dateModified, externalReferences, batchDeleteDescription, batchDeleteName, batchDeleteOwnerName, batchDeleteOwnerPersonDbId, batchDeleteSize, batchDeleteSource, batchDeleteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBaseFields {\n");

        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
        sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
        sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
        sb.append("    batchDescription: ").append(toIndentedString(batchDeleteDescription)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchDeleteName)).append("\n");
        sb.append("    batchOwnerName: ").append(toIndentedString(batchDeleteOwnerName)).append("\n");
        sb.append("    batchOwnerPersonDbId: ").append(toIndentedString(batchDeleteOwnerPersonDbId)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchDeleteSize)).append("\n");
        sb.append("    batchSource: ").append(toIndentedString(batchDeleteSource)).append("\n");
        sb.append("    batchType: ").append(toIndentedString(batchDeleteType)).append("\n");
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
