package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListItemWithFullItem
 */
public class BrAPIListItemWithFullItem<T>  {
    @JsonProperty("listItem")
    private BrAPIListItem listItem = null;

    @JsonProperty("item")
    private T item = null;

    public BrAPIListItem getListItem() {
        return listItem;
    }

    public void setListItem(BrAPIListItem listItem) {
        this.listItem = listItem;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrAPIListItemWithFullItem<T> listItemWithFullItem = (BrAPIListItemWithFullItem<T>) o;
        return Objects.equals(this.listItem, listItemWithFullItem.listItem) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listItem, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItemWithFullItem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    listItem: ").append(toIndentedString(listItem)).append("\n");
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

