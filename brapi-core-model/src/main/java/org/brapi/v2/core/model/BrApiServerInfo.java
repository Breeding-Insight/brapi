package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * ServerInfo
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiServerInfo {
  @JsonProperty("calls")
  @Valid
  private List<BrApiService> calls = new ArrayList<BrApiService>();

  @JsonProperty("contactEmail")
  private String contactEmail;

  @JsonProperty("documentationURL")
  private String documentationURL;

  @JsonProperty("location")
  private String location;

  @JsonProperty("organizationName")
  private String organizationName;

  @JsonProperty("organizationURL")
  private String organizationURL;

  @JsonProperty("serverDescription")
  private String serverDescription;

  @JsonProperty("serverName")
  private String serverName;

}
