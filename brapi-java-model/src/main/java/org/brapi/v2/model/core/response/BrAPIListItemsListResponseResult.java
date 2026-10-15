package org.brapi.v2.model.core.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.brapi.v2.model.BrAPIResponseResult;
import org.brapi.v2.model.core.BrAPIListItemWithFullItem;

import java.util.ArrayList;
import java.util.List;

/**
 * ListItemsListResponseResult
 */
public class BrAPIListItemsListResponseResult<T> implements BrAPIResponseResult<BrAPIListItemWithFullItem<T>> {
    @JsonProperty("data")
    private List<BrAPIListItemWithFullItem<T>> data = new ArrayList<>();

    public BrAPIListItemsListResponseResult<T> data(List<BrAPIListItemWithFullItem<T>> data) {
        this.data = data;
        return this;
    }

    public BrAPIListItemsListResponseResult<T> addDataItem(BrAPIListItemWithFullItem<T> dataItem) {
        this.data.add(dataItem);
        return this;
    }
    public List<BrAPIListItemWithFullItem<T>> getData() {
        return data;
    }

    public void setData(List<BrAPIListItemWithFullItem<T>> data) {
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
        BrAPIListItemsListResponseResult<T> listItemsListResponseResult = (BrAPIListItemsListResponseResult<T>) o;
        return Objects.equals(this.data, listItemsListResponseResult.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItemsListResponseResult {\n");

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

