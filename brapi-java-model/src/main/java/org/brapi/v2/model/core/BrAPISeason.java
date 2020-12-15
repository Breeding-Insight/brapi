package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Season
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPISeason   {
  @JsonProperty("seasonDbId")
  private String seasonDbId = null;

  @JsonProperty("seasonName")
  private String seasonName = null;

  @JsonProperty("year")
  private Integer year = null;

  public BrAPISeason seasonDbId(String seasonDbId) {
    this.seasonDbId = seasonDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a season. For backward compatibility it can be a string like '2012', '1957-2004'
   * @return seasonDbId
  **/
  
    public String getSeasonDbId() {
    return seasonDbId;
  }

  public void setSeasonDbId(String seasonDbId) {
    this.seasonDbId = seasonDbId;
  }

  public BrAPISeason seasonName(String seasonName) {
    this.seasonName = seasonName;
    return this;
  }

  /**
   * Name of the season. ex. 'Spring', 'Q2', 'Season A', etc.
   * @return seasonName
  **/
  
  
    public String getSeasonName() {
    return seasonName;
  }

  public void setSeasonName(String seasonName) {
    this.seasonName = seasonName;
  }

  public BrAPISeason year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * The 4 digit year of the season.
   * @return year
  **/
  
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPISeason season = (BrAPISeason) o;
    return Objects.equals(this.seasonDbId, season.seasonDbId) &&
        Objects.equals(this.seasonName, season.seasonName) &&
        Objects.equals(this.year, season.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seasonDbId, seasonName, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Season {\n");
    
    sb.append("    seasonDbId: ").append(toIndentedString(seasonDbId)).append("\n");
    sb.append("    seasonName: ").append(toIndentedString(seasonName)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
