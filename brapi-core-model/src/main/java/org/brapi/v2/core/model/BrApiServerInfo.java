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
  @Valid
  private List<BrApiService> calls = new ArrayList<BrApiService>();

  private String contactEmail;

  private String documentationURL;

  private String location;

  private String organizationName;

  private String organizationURL;

  private String serverDescription;

  private String serverName;

}
