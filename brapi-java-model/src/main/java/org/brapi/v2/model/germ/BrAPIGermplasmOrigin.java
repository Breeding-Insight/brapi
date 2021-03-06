package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.filosganga.geogson.model.Feature;

import javax.validation.Valid;

import org.brapi.v2.model.BrApiGeoJSON;

/**
 * GermplasmOrigin
 */


public class BrAPIGermplasmOrigin   {
  @JsonProperty("coordinateUncertainty")
  private String coordinateUncertainty = null;

  @JsonProperty("coordinates")
  private BrApiGeoJSON coordinates = null;

  public BrAPIGermplasmOrigin coordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
    return this;
  }

  /**
   * Uncertainty associated with the coordinates in meters. Leave the value empty if the uncertainty is unknown.
   * @return coordinateUncertainty
  **/
  
  
    public String getCoordinateUncertainty() {
    return coordinateUncertainty;
  }

  public void setCoordinateUncertainty(String coordinateUncertainty) {
    this.coordinateUncertainty = coordinateUncertainty;
  }

  public BrAPIGermplasmOrigin coordinates(BrApiGeoJSON coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  **/
  
  
    @Valid
    public BrApiGeoJSON getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(BrApiGeoJSON coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmOrigin germplasmOrigin = (BrAPIGermplasmOrigin) o;
    return Objects.equals(this.coordinateUncertainty, germplasmOrigin.coordinateUncertainty) &&
        Objects.equals(this.coordinates, germplasmOrigin.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinateUncertainty, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmOrigin {\n");
    
    sb.append("    coordinateUncertainty: ").append(toIndentedString(coordinateUncertainty)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
