/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
  @Valid
  private List<BrApiWSMIMEDataTypes> dataTypes;

  @Valid
  private List<MethodsEnum> methods = new ArrayList<MethodsEnum>();

  private String service;

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
  public enum VersionsEnum implements BrApiEnum {
    _0("2.0"),

    _1("2.1"),

    _2("2.2");

    private String value;

    VersionsEnum(String value) {
      this.value = value;
    }

    @Override
    public String getBrapiValue() {
      return value;
    }
  }

}
