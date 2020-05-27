package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Copied from RFC 7946 Section 3.1.1  A position is an array of numbers. There MUST be two or more elements. The first two elements are longitude and latitude, or easting and northing, precisely in that order and using decimal numbers. Altitude or elevation MAY be included as an optional third element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiPointGeometry implements BrApiOneOfGeoJSONSearchAreaGeometry, BrApiOneOfGeoJSONGeometry {
  private BrApiPosition coordinates;

  private String type = "Point";

}
