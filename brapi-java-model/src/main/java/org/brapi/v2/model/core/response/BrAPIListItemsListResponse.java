package org.brapi.v2.model.core.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIContext;
import org.brapi.v2.model.BrAPIMetadata;
import org.brapi.v2.model.BrAPIResponse;
import org.brapi.v2.model.core.BrAPIListTypes;

/**
 * ListItemsListResponse
 */
public class BrAPIListItemsListResponse<T> implements BrAPIResponse<BrAPIListItemsListResponseResult<T>> {
    @JsonProperty("@context")
    private BrAPIContext _atContext = null;

    @JsonProperty("metadata")
    private BrAPIMetadata metadata = null;

    @JsonProperty("result")
    private BrAPIListItemsListResponseResult<T> result = null;

    @JsonProperty("resultListType")
    private BrAPIListTypes resultListType = null;

    public BrAPIListItemsListResponse() {
        this._atContext = new BrAPIContext();
        this._atContext.add("context");
    }


    public void set_atContext(BrAPIContext _atContext) {
        this._atContext = _atContext;
    }
    public BrAPIListItemsListResponse<T> metadata(BrAPIMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BrAPIMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(BrAPIMetadata metadata) {
        this.metadata = metadata;
    }

    public BrAPIListItemsListResponse<T> result(BrAPIListItemsListResponseResult<T> result) {
        this.result = result;
        return this;
    }


    public BrAPIListItemsListResponseResult<T> getResult() {
        return result;
    }

    public void setResult(BrAPIListItemsListResponseResult<T> result) {
        this.result = result;
    }

    public BrAPIListTypes getResultListType() {
        return resultListType;
    }

    public void setResultListType(BrAPIListTypes resultListType) {
        this.resultListType = resultListType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrAPIListItemsListResponse<T> listItemsListResponse = (BrAPIListItemsListResponse<T>) o;
        return Objects.equals(this._atContext, listItemsListResponse._atContext)
                && Objects.equals(this.metadata, listItemsListResponse.metadata)
                && Objects.equals(this.result, listItemsListResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_atContext, metadata, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItemsListResponse {\n");

        sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
