package org.brapi.v2.model;

public class TimeAdapter {

	public static java.time.OffsetDateTime convertFrom(org.threeten.bp.OffsetDateTime ttOdt) {
	    // convert the instance by parsing the formatted output of the given instance
	    return java.time.OffsetDateTime.parse(
	            ttOdt.format(org.threeten.bp.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME));
	}
	
	public static org.threeten.bp.OffsetDateTime convertFrom(java.time.OffsetDateTime ttOdt) {
	    // convert the instance by parsing the formatted output of the given instance
	    return org.threeten.bp.OffsetDateTime.parse(
	            ttOdt.format(java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME));
	}
}
