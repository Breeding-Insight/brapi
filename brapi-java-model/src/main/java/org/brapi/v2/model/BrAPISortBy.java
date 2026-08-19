package org.brapi.v2.model;

public class BrAPISortBy {
    private String sortedOn;
    private BrAPISortOrder  sortOrder = BrAPISortOrder.ASC;

    public BrAPISortBy(String sortedOn,
                  BrAPISortOrder sortOrder) {
        this.sortedOn = sortedOn;
        this.sortOrder = sortOrder;
    }

    public BrAPISortBy() {}

    public String getSortedOn() {
        return sortedOn;
    }

    public void setSortedOn(String sortedOn) {
        this.sortedOn = sortedOn;
    }

    public BrAPISortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BrAPISortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }
}
