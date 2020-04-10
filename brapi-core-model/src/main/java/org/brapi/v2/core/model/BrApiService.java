package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Service
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiService {
  @JsonProperty("dataTypes")
  @Valid
  private List<BrApiWSMIMEDataTypes> dataTypes;

  @JsonProperty("methods")
  @Valid
  private List<MethodsEnum> methods = new ArrayList<MethodsEnum>();

  @JsonProperty("service")
  private String service;

  @JsonProperty("versions")
  @Valid
  private List<VersionsEnum> versions = new ArrayList<VersionsEnum>();

  /**
   * Gets or Sets methods
   */
  public enum MethodsEnum {
    GET,
    POST,
    PUT,
    DELETE;
  }

  /**
   * Gets or Sets versions
   */
  public enum VersionsEnum {
    _0("2.0"),

    _1("2.1"),

    _2("2.2");

    private String value;

    VersionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VersionsEnum fromValue(String text) {
      for (VersionsEnum b : VersionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

}
