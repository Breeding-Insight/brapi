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
    private String fileDescription;

    /**
     * The MD5 Hash of the file contents to be used as a check sum
     **/
    private String fileMD5Hash;

    /**
     * The name of the file
     **/
    private String fileName;

    /**
     * The size of the file in bytes
     **/
    private Integer fileSize;

    /**
     * The type or format of the file. Preferably MIME Type.
     **/
    private String fileType;

    /**
     * The absolute URL where the file is located
     **/
    private String fileURL;

}
