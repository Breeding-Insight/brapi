package org.brapi.v2.model.core.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.core.BrAPIBatchDelete;

/**
 * BatchDeleteListResponseResult
 */


public class BrAPIBatchDeleteListResponseResult implements BrAPIResponseResult<BrAPIBatchDelete>  {
    @JsonProperty("data")
    @Valid
    private List<BrAPIBatchDelete> data = new ArrayList<BrAPIBatchDelete>();

    public BrAPIBatchDeleteListResponseResult data(List<BrAPIBatchDelete> data) {
        this.data = data;
        return this;
    }

    public BrAPIBatchDeleteListResponseResult addDataItem(BrAPIBatchDelete dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/


    @Valid
    public List<BrAPIBatchDelete> getData() {
        return data;
    }

    public void setData(List<BrAPIBatchDelete> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BrAPIBatchDeleteListResponseResult batchDeleteListResponseResult = (BrAPIBatchDeleteListResponseResult) o;
        return Objects.equals(this.data, batchDeleteListResponseResult.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteListResponseResult {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
