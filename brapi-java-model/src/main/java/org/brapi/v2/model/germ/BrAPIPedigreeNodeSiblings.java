package org.brapi.v2.model.germ;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * PedigreeNodeSiblings
 */


@Deprecated
public class BrAPIPedigreeNodeSiblings extends BrAPIPedigreeNodeSibling {

  @Deprecated
  public BrAPIPedigreeNodeSiblings germplasmDbId(String germplasmDbId) {
    super.setGermplasmDbId(germplasmDbId);
    return this;
  }

  @Deprecated
  public BrAPIPedigreeNodeSiblings germplasmName(String germplasmName) {
    super.setGermplasmName(germplasmName);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedigreeNodeSiblings {\n");
    
    sb.append("    germplasmDbId: ").append(toIndentedString(super.getGermplasmDbId())).append("\n");
    sb.append("    germplasmName: ").append(toIndentedString(super.getGermplasmName())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
