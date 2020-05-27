package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * An array of Linear Rings. Each Linear Ring is an array of Points.   A Point is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiPolygonGeometry implements BrApiOneOfGeoJSONSearchAreaGeometry, BrApiOneOfGeoJSONGeometry {
  private BrApiPolygon coordinates;

  private String type = "Polygon";

}
