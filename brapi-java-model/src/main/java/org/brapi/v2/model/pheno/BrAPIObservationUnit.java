package org.brapi.v2.model.pheno;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.pheno.BrAPIObservation;
import org.brapi.v2.model.pheno.BrAPIObservationUnitNewRequest;

/**
 * ObservationUnit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class BrAPIObservationUnit extends BrAPIObservationUnitNewRequest  {
  @JsonProperty("observationUnitDbId")
  private String observationUnitDbId = null;

  @JsonProperty("observations")
  @Valid
  private List<BrAPIObservation> observations = null;

  public BrAPIObservationUnit observationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies an observation unit  MIAPPE V1.1 (DM-70) Observation unit ID - Identifier used to identify the observation unit in data files containing the values observed or measured on that unit. Must be locally unique. 
   * @return observationUnitDbId
  **/
  
  
    public String getObservationUnitDbId() {
    return observationUnitDbId;
  }

  public void setObservationUnitDbId(String observationUnitDbId) {
    this.observationUnitDbId = observationUnitDbId;
  }

  public BrAPIObservationUnit observations(List<BrAPIObservation> observations) {
    this.observations = observations;
    return this;
  }

  public BrAPIObservationUnit addObservationsItem(BrAPIObservation observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<BrAPIObservation>();
    }
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * All observations attached to this observation unit.   Default for this field is null or omitted. Do NOT include data in this field unless the 'includeObservations' flag is explicitly set to True.
   * @return observations
  **/
  
      @Valid
    public List<BrAPIObservation> getObservations() {
    return observations;
  }

  public void setObservations(List<BrAPIObservation> observations) {
    this.observations = observations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIObservationUnit observationUnit = (BrAPIObservationUnit) o;
    return Objects.equals(this.observationUnitDbId, observationUnit.observationUnitDbId) &&
        Objects.equals(this.observations, observationUnit.observations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationUnitDbId, observations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    observationUnitDbId: ").append(toIndentedString(observationUnitDbId)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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
