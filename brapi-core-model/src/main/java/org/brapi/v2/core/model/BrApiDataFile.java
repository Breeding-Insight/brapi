package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A dataFile contains a URL and the relevant file metadata to represent a file
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiDataFile {
    /**
     * A human readable description of the file contents
     **/
    @JsonProperty("fileDescription")
    private String fileDescription;

    /**
     * The MD5 Hash of the file contents to be used as a check sum
     **/
    @JsonProperty("fileMD5Hash")
    private String fileMD5Hash;

    /**
     * The name of the file
     **/
    @JsonProperty("fileName")
    private String fileName;

    /**
     * The size of the file in bytes
     **/
    @JsonProperty("fileSize")
    private Integer fileSize;

    /**
     * The type or format of the file. Preferably MIME Type.
     **/
    @JsonProperty("fileType")
    private String fileType;

    /**
     * The absolute URL where the file is located
     **/
    @JsonProperty("fileURL")
    private String fileURL;

}
