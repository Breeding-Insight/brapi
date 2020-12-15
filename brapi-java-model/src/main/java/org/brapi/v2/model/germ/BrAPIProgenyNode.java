package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.brapi.v2.model.germ.BrAPIProgenyNodeProgeny;


/**
 * ProgenyNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:33:36.513Z[GMT]")
public class BrAPIProgenyNode   {
  @JsonProperty("germplasmDbId")
  private String germplasmDbId = null;

  @JsonProperty("germplasmName")
  private String germplasmName = null;

  @JsonProperty("progeny")
  @Valid
  private List<BrAPIProgenyNodeProgeny> progeny = new ArrayList<BrAPIProgenyNodeProgeny>();

  public BrAPIProgenyNode germplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
    return this;
  }

  /**
   * The ID which uniquely identifies a germplasm
   * @return germplasmDbId
  **/
  
      

    public String getGermplasmDbId() {
    return germplasmDbId;
  }

  public void setGermplasmDbId(String germplasmDbId) {
    this.germplasmDbId = germplasmDbId;
  }

  public BrAPIProgenyNode germplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
    return this;
  }

  /**
   * A human readable name for a germplasm
   * @return germplasmName
  **/
  
  
    public String getGermplasmName() {
    return germplasmName;
  }

  public void setGermplasmName(String germplasmName) {
    this.germplasmName = germplasmName;
  }

  public BrAPIProgenyNode progeny(List<BrAPIProgenyNodeProgeny> progeny) {
    this.progeny = progeny;
    return this;
  }

  public BrAPIProgenyNode addProgenyItem(BrAPIProgenyNodeProgeny progenyItem) {
    this.progeny.add(progenyItem);
    return this;
  }

  /**
   * List of germplasm entities which are direct children of this germplasm
   * @return progeny
  **/
  
      
    @Valid
    public List<BrAPIProgenyNodeProgeny> getProgeny() {
    return progeny;
  }

  public void setProgeny(List<BrAPIProgenyNodeProgeny> progeny) {
    this.progeny = progeny;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIProgenyNode progenyNode = (BrAPIProgenyNode) o;
    return Objects.equals(this.germplasmDbId, progenyNode.germplasmDbId) &&
        Objects.equals(this.germplasmName, progenyNode.germplasmName) &&
        Objects.equals(this.progeny, progenyNode.progeny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(germplasmDbId, germplasmName, progeny);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgenyNode {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(germplasmDbId)).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(germplasmName)).append("\n");
    sb.append("    progeny: ").append(toIndentedString(progeny)).append("\n");
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
