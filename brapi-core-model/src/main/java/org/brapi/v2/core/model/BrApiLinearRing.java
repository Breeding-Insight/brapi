package org.brapi.v2.core.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;

/**
 * An array of at least four positions where the first equals the last
 */
@EqualsAndHashCode
@ToString
public class BrApiLinearRing extends ArrayList<BrApiPosition>  {

}
