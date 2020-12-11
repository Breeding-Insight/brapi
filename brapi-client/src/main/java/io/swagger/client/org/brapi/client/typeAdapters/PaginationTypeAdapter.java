package io.swagger.client.org.brapi.client.typeAdapters;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import io.swagger.client.model.IndexPagination;
import io.swagger.client.model.Pagination;
import io.swagger.client.model.TokenPagination;

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
