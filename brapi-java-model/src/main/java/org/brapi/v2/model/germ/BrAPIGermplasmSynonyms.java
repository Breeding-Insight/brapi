package org.brapi.v2.model.germ;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;





/**
 * GermplasmSynonyms
 */


public class BrAPIGermplasmSynonyms {
  @JsonProperty("synonym")
  private String synonym = null;

  @JsonProperty("type")
  private String type = null;

  public BrAPIGermplasmSynonyms synonym(String synonym) {
    this.synonym = synonym;
    return this;
  }

  /**
   * Alternative name or ID used to reference this germplasm
   * @return synonym
  **/
  
  
    public String getSynonym() {
    return synonym;
  }

  public void setSynonym(String synonym) {
    this.synonym = synonym;
  }

  public BrAPIGermplasmSynonyms type(String type) {
    this.type = type;
    return this;
  }

  /**
   * A descriptive classification for this synonym
   * @return type
  **/
  
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrAPIGermplasmSynonyms germplasmSynonyms = (BrAPIGermplasmSynonyms) o;
    return Objects.equals(this.synonym, germplasmSynonyms.synonym) &&
        Objects.equals(this.type, germplasmSynonyms.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synonym, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GermplasmSynonyms {\n");
    
    sb.append("    synonym: ").append(toIndentedString(synonym)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
