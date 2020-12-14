package org.brapi.client.v2.typeAdapters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.brapi.v2.model.IndexPagination;
import org.brapi.v2.model.Pagination;
import org.brapi.v2.model.TokenPagination;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * Gson TypeAdapter for java.util.Date type
 * If the dateFormat is null, ISO8601Utils will be used.
 */
public class PaginationTypeAdapter extends TypeAdapter<Pagination> {

    @Override
    public void write(JsonWriter out, Pagination pagination) throws IOException {
    	//Pagination object is never serialized from BrAPI client
    }

    @Override
    public Pagination read(JsonReader in) throws IOException {
        try {
            if(in.peek() == JsonToken.NULL) {
                in.nextNull();
                return null;
            }
            Map<String, String> fields = new HashMap<>();
            in.beginObject();
            while(in.peek() != JsonToken.END_OBJECT) {
            	fields.put(in.nextName(), in.nextString());
            }
            in.endObject();
            
            if(fields.containsKey("currentPage")) {
            	IndexPagination pagination = (IndexPagination) new IndexPagination()
            			.currentPage(Integer.decode(fields.get("currentPage")))
            			.pageSize(Integer.decode(fields.get("pageSize")))
            			.totalCount(Integer.decode(fields.get("totalCount")))
            			.totalPages(Integer.decode(fields.get("totalPages")));
            	return pagination;
            }else if(fields.containsKey("currentPageToken")) {
            	TokenPagination pagination = (TokenPagination) new TokenPagination()
            			.currentPageToken(fields.get("currentPage"))
            			.nextPageToken(fields.get("nextPageToken"))
            			.prevPageToken(fields.get("prevPageToken"))
            			.pageSize(Integer.decode(fields.get("pageSize")))
            			.totalCount(Integer.decode(fields.get("totalCount")))
            			.totalPages(Integer.decode(fields.get("totalPages")));
            	return pagination;
            }else {
            	return null;
            }
            
        } catch (IllegalArgumentException e) {
            throw new JsonParseException(e);
        }
    }
}
