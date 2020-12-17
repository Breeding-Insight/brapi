package org.brapi.v2.model.geno.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.BrAPISearchRequestParametersPaging;

/**
 * MarkerPositionSearchRequest
 */


public class BrAPIMarkerPositionSearchRequest extends BrAPISearchRequestParametersPaging  {
  @JsonProperty("linkageGroupNames")
  @Valid
  private List<String> linkageGroupNames = null;

  @JsonProperty("mapDbIds")
  @Valid
  private List<String> mapDbIds = null;

  @JsonProperty("maxPosition")
  private Integer maxPosition = null;

  @JsonProperty("minPosition")
  private Integer minPosition = null;

  @JsonProperty("variantDbIds")
  @Valid
  private List<String> variantDbIds = null;

  public BrAPIMarkerPositionSearchRequest linkageGroupNames(List<String> linkageGroupNames) {
    this.linkageGroupNames = linkageGroupNames;
    return this;
  }

  public BrAPIMarkerPositionSearchRequest addLinkageGroupNamesItem(String linkageGroupNamesItem) {
    if (this.linkageGroupNames == null) {
      this.linkageGroupNames = new ArrayList<String>();
    }
    this.linkageGroupNames.add(linkageGroupNamesItem);
    return this;
  }

  /**
   * The Uniquely Identifiable name of this linkage group
   * @return linkageGroupNames
  **/
  
  
    public List<String> getLinkageGroupNames() {
    return linkageGroupNames;
  }

  public void setLinkageGroupNames(List<String> linkageGroupNames) {
    this.linkageGroupNames = linkageGroupNames;
  }

  public BrAPIMarkerPositionSearchRequest mapDbIds(List<String> mapDbIds) {
    this.mapDbIds = mapDbIds;
    return this;
  }

  public BrAPIMarkerPositionSearchRequest addMapDbIdsItem(String mapDbIdsItem) {
    if (this.mapDbIds == null) {
      this.mapDbIds = new ArrayList<String>();
    }
    this.mapDbIds.add(mapDbIdsItem);
    return this;
  }

  /**
   * The unique ID of the map
   * @return mapDbIds
  **/
  
  
    public List<String> getMapDbIds() {
    return mapDbIds;
  }

  public void setMapDbIds(List<String> mapDbIds) {
    this.mapDbIds = mapDbIds;
  }

  public BrAPIMarkerPositionSearchRequest maxPosition(Integer maxPosition) {
    this.maxPosition = maxPosition;
    return this;
  }

  /**
   * The maximum position
   * @return maxPosition
  **/
  
  
    public Integer getMaxPosition() {
    return maxPosition;
  }

  public void setMaxPosition(Integer maxPosition) {
    this.maxPosition = maxPosition;
  }

  public BrAPIMarkerPositionSearchRequest minPosition(Integer minPosition) {
    this.minPosition = minPosition;
    return this;
  }

  /**
   * The minimum position
   * @return minPosition
  **/
  
  
    public Integer getMinPosition() {
    return minPosition;
  }

  public void setMinPosition(Integer minPosition) {
    this.minPosition = minPosition;
  }

  public BrAPIMarkerPositionSearchRequest variantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
    return this;
  }

  public BrAPIMarkerPositionSearchRequest addVariantDbIdsItem(String variantDbIdsItem) {
    if (this.variantDbIds == null) {
      this.variantDbIds = new ArrayList<String>();
    }
    this.variantDbIds.add(variantDbIdsItem);
    return this;
  }

  /**
   * Internal db identifier
   * @return variantDbIds
  **/
  
  
    public List<String> getVariantDbIds() {
    return variantDbIds;
  }

  public void setVariantDbIds(List<String> variantDbIds) {
    this.variantDbIds = variantDbIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIMarkerPositionSearchRequest markerPositionSearchRequest = (BrAPIMarkerPositionSearchRequest) o;
    return Objects.equals(this.linkageGroupNames, markerPositionSearchRequest.linkageGroupNames) &&
        Objects.equals(this.mapDbIds, markerPositionSearchRequest.mapDbIds) &&
        Objects.equals(this.maxPosition, markerPositionSearchRequest.maxPosition) &&
        Objects.equals(this.minPosition, markerPositionSearchRequest.minPosition) &&
        Objects.equals(this.variantDbIds, markerPositionSearchRequest.variantDbIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkageGroupNames, mapDbIds, maxPosition, minPosition, variantDbIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkerPositionSearchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkageGroupNames: ").append(toIndentedString(linkageGroupNames)).append("\n");
    sb.append("    mapDbIds: ").append(toIndentedString(mapDbIds)).append("\n");
    sb.append("    maxPosition: ").append(toIndentedString(maxPosition)).append("\n");
    sb.append("    minPosition: ").append(toIndentedString(minPosition)).append("\n");
    sb.append("    variantDbIds: ").append(toIndentedString(variantDbIds)).append("\n");
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
