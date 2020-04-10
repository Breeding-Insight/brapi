package org.brapi.v2.core.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

/**
 * An array of external reference ids. These are references to this piece of data in an external system. Could be a simple string or a URI.
 */
@EqualsAndHashCode
@ToString
public class BrApiExternalReferences extends ArrayList<BrApiExternalReferencesInner>  {

    public BrApiExternalReferences() {
        super();
    }

    public BrApiExternalReferences(Collection<BrApiExternalReferencesInner> c) {
        super(c);
    }

}
