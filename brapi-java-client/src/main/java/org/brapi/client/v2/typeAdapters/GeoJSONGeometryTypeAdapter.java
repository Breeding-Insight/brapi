package org.brapi.client.v2.typeAdapters;

/**
 * Gson TypeAdapter for java.util.Date type If the dateFormat is null,
 * ISO8601Utils will be used.
 */
public class GeoJSONGeometryTypeAdapter { // extends TypeAdapter<GeoJSONGeometry> {
//
//	@Override
//	public void write(JsonWriter out, GeoJSONGeometry geometry) throws IOException {
//	}
//
//	@Override
//	public GeoJSONGeometry read(JsonReader in) throws IOException {
//		try {
//			if (in.peek() == JsonToken.NULL) {
//				in.nextNull();
//				return null;
//			}
//			PointGeometry pointGeo = new PointGeometry();
//			PolygonGeometry polyGeo = new PolygonGeometry();
//			String type = "";
//
//			in.beginObject();
//			while (in.peek() == JsonToken.NAME) {
//				String name = in.nextName();
//				if (name.equalsIgnoreCase("type")) {
//					type = in.nextString();
//				} else if (name.equalsIgnoreCase("coordinates")) {
//					in.beginArray();
//					if (in.peek() == JsonToken.NUMBER) {
//						// pointGeo
//						pointGeo.setCoordinates(buildPositionArray(in));
//						in.endArray();
//					} else {
//						// polyGeo
//						Polygon polygon = new Polygon();
//						while (in.peek() == JsonToken.BEGIN_ARRAY) {
//							in.beginArray();
//							LinearRing linearRing = new LinearRing();
//							while (in.peek() == JsonToken.BEGIN_ARRAY) {
//								in.beginArray();
//								linearRing.add(buildPositionArray(in));
//								in.endArray();
//							}
//							polygon.add(linearRing);
//							in.endArray();
//						}
//						polyGeo.setCoordinates(polygon);
//						in.endArray();
//					}
//				}
//			}
//			in.endObject();
//			
//			if(type.equalsIgnoreCase("Point")) {
//				return pointGeo;
//			}else if(type.equalsIgnoreCase("Polygon")) {
//				return polyGeo;
//			}
//			return null;
//
//		} catch (IllegalArgumentException e) {
//			throw new JsonParseException(e);
//		}
//	}
//
//	private Position buildPositionArray(JsonReader in) throws IOException {
//		Position pos = new Position();
//
//		while (in.peek() == JsonToken.NUMBER) {
//			pos.add(new BigDecimal(in.nextString()));
//		}
//
//		return pos;
//	}
}
