package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListItem
 */
public class BrAPIListItem  {
    @JsonProperty("listItemDbId")
    private String listItemDbId = null;

    @JsonProperty("position")
    private Integer position = null;

    // This represents the actual value stored in the list_item table
    @JsonProperty("item")
    private String item = null;


    public String getListItemDbId() {
        return listItemDbId;
    }

    public void setListItemDbId(String listItemDbId) {
        this.listItemDbId = listItemDbId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
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
        BrAPIListItem ListItem = (BrAPIListItem) o;
        return Objects.equals(this.listItemDbId, ListItem.listItemDbId) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listItemDbId, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListItem {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    listDbId: ").append(toIndentedString(listItemDbId)).append("\n");
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


