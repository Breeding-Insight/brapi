package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * DataLink
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiDataLink {
  /**
   * The structure of the data within a file. For example - VCF, table, image archive, multispectral image archives in EDAM ontology (used in Galaxy)
   **/
  @JsonProperty("dataFormat")
  private String dataFormat;

  /**
   * The general description of this data link
   **/
  @JsonProperty("description")
  private String description;

  /**
   * The MIME type of the file (ie text/csv, application/excel, application/zip).
   **/
  @JsonProperty("fileFormat")
  private String fileFormat;

  /**
   * The name of the external data link  MIAPPE V1.1 (DM-38) Data file description - Description of the format of the data file. May be a standard file format name, or a description of organization of the data in a tabular file.
   **/
  @JsonProperty("name")
  private String name;

  /**
   * The description of the origin or ownership of this linked data. Could be a formal reference to software, method, or workflow.
   **/
  @JsonProperty("provenance")
  private String provenance;

  /**
   * The general type of data. For example- Genotyping, Phenotyping raw data, Phenotyping reduced data, Environmental, etc
   **/
  @JsonProperty("scientificType")
  private String scientificType;

  /**
   * MIAPPE V1.1 (DM-37) Data file link - Link to the data file (or digital object) in a public database or in a persistent institutional repository; or identifier of the data file when submitted together with the MIAPPE submission.
   **/
  @JsonProperty("url")
  private String url;

  /**
   * MIAPPE V1.1 (DM-39) Data file version - The version of the dataset (the actual data).
   **/
  @JsonProperty("version")
  private String version;
}
