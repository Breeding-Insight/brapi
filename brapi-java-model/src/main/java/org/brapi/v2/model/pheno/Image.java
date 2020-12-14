package org.brapi.v2.model.pheno;

import java.util.Objects;

import org.brapi.v2.model.pheno.ImageNewRequest;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Image
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
public class Image extends ImageNewRequest  {
  @JsonProperty("imageDbId")
  private String imageDbId = null;

  public Image imageDbId(String imageDbId) {
    this.imageDbId = imageDbId;
    return this;
  }

  /**
   * The unique identifier of an image
   * @return imageDbId
  **/
  
  
    public String getImageDbId() {
    return imageDbId;
  }

  public void setImageDbId(String imageDbId) {
    this.imageDbId = imageDbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.imageDbId, image.imageDbId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageDbId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageDbId: ").append(toIndentedString(imageDbId)).append("\n");
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
