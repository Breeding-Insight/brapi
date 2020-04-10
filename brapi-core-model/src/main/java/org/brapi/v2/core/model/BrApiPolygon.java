package org.brapi.v2.core.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;

/**
 * An array of linear rings
 */
@EqualsAndHashCode
@ToString
public class BrApiPolygon extends ArrayList<BrApiLinearRing>  {
}
