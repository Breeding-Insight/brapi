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

package org.brapi.client.v2.model.queryParams.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class ProgramQueryParams extends BrAPIQueryParams {

    private String commonCropName;
    private String programDbId;
    private String programName;
    private String abbreviation;
    private String externalReferenceSource;
    private String externalReferenceId;
    @Deprecated
    private String externalReferenceID;
    
    public String getExternalReferenceId() {
		return externalReferenceId;
	}
    public String externalReferenceId() {
		return externalReferenceId;
	}
	public void setExternalReferenceId(String externalReferenceId) {
		this.externalReferenceId = externalReferenceId;
	}

	@Deprecated
	public String getExternalReferenceID() {
		return externalReferenceID;
	}
	@Deprecated
	public String externalReferenceID() {
		return externalReferenceID;
	}
	@Deprecated
	public void setExternalReferenceID(String externalReferenceID) {
		this.externalReferenceID = externalReferenceID;
	}
}
