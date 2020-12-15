package org.brapi.v2.model.core;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * Person
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
public class BrAPIPerson extends BrAPIPersonNewRequest  {
  @JsonProperty("personDbId")
  private String personDbId = null;

  public BrAPIPerson personDbId(String personDbId) {
    this.personDbId = personDbId;
    return this;
  }

  /**
   * Unique ID for a person
   * @return personDbId
  **/
  
      

    public String getPersonDbId() {
    return personDbId;
  }

  public void setPersonDbId(String personDbId) {
    this.personDbId = personDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIPerson person = (BrAPIPerson) o;
    return Objects.equals(this.personDbId, person.personDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    personDbId: ").append(toIndentedString(personDbId)).append("\n");
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
