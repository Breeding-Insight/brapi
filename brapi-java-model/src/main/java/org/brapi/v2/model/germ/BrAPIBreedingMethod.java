package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;






/**
 * BreedingMethod
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIBreedingMethod   {
  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("breedingMethodDbId")
  private String breedingMethodDbId = null;

  @JsonProperty("breedingMethodName")
  private String breedingMethodName = null;

  @JsonProperty("description")
  private String description = null;

  public BrAPIBreedingMethod abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * an abbreviation for the name of this breeding method
   * @return abbreviation
  **/
  
  
    public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public BrAPIBreedingMethod breedingMethodDbId(String breedingMethodDbId) {
    this.breedingMethodDbId = breedingMethodDbId;
    return this;
  }

  /**
   * the unique identifier for this breeding method
   * @return breedingMethodDbId
  **/
  
      

    public String getBreedingMethodDbId() {
    return breedingMethodDbId;
  }

  public void setBreedingMethodDbId(String breedingMethodDbId) {
    this.breedingMethodDbId = breedingMethodDbId;
  }

  public BrAPIBreedingMethod breedingMethodName(String breedingMethodName) {
    this.breedingMethodName = breedingMethodName;
    return this;
  }

  /**
   * human readable name of the breeding method
   * @return breedingMethodName
  **/
  
  
    public String getBreedingMethodName() {
    return breedingMethodName;
  }

  public void setBreedingMethodName(String breedingMethodName) {
    this.breedingMethodName = breedingMethodName;
  }

  public BrAPIBreedingMethod description(String description) {
    this.description = description;
    return this;
  }

  /**
   * human readable description of the breeding method
   * @return description
  **/
  
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIBreedingMethod breedingMethod = (BrAPIBreedingMethod) o;
    return Objects.equals(this.abbreviation, breedingMethod.abbreviation) &&
        Objects.equals(this.breedingMethodDbId, breedingMethod.breedingMethodDbId) &&
        Objects.equals(this.breedingMethodName, breedingMethod.breedingMethodName) &&
        Objects.equals(this.description, breedingMethod.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, breedingMethodDbId, breedingMethodName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreedingMethod {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    breedingMethodDbId: ").append(toIndentedString(breedingMethodDbId)).append("\n");
    sb.append("    breedingMethodName: ").append(toIndentedString(breedingMethodName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
