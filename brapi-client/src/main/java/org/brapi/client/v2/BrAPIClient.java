package org.brapi.client.v2;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.experimental.Accessors;
import okhttp3.*;
import okhttp3.internal.http.HttpMethod;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.exceptions.*;
import org.brapi.v2.core.model.response.Metadata;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Accessors(fluent=true)
public class BrAPIClient {
    private final String brapiURI;
    private final Gson gson;
    private String authToken;

    public BrAPIClient(String brapiURI) {
        this.brapiURI = brapiURI;
        this.gson = new Gson();
    }

    /**
     * Execute a request to the BrAPI service and don't process the response.
     * @param request
     * @throws APIException
     */
    public void execute(BrAPIRequest request) throws HttpException, APIException {
        execute(request, Optional.empty());
    }

    /**
     * Execute a request to the BrAPI service, and process the response via the {@link ResponseHandlerFunction}
     * @param request
     * @param responseHandler User defined function to handle the <code>result</code> section of the {@link org.brapi.brapi-core-model.v2.model.response.BrAPIResponse}
     * @param <T> Object that the user expects.  {@link ResponseHandlerFunction} must return this type.
     * @return <T>
     * @throws APIException
     */
    public <T> Optional<T> execute(BrAPIRequest request, ResponseHandlerFunction<T> responseHandler) throws HttpException, APIException {
        return execute(request, Optional.of(responseHandler));
    }

    /**
     * Executes a user defined function to fetch an auth token from the BrAPI service, and store it in the {@link BrAPIClient}
     * @param authHandler User defined function to retrieve an auth token
     * @return true if auth succeeded, false otherwise
     * @throws APIException
     */
    public boolean authenticate(Function<Void, String> authHandler) throws APIException {
        Optional<String> authToken = Optional.ofNullable(authHandler.apply(null));
        if(authToken.isPresent()) {
            this.authToken = authToken.get();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     *   application/vnd.company+json
     * "* / *" is also default to JSON
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
        String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
        return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Serialize the given Java object into request body according to the object's
     * class and the request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws APIException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType) throws APIException {
        if (obj instanceof byte[]) {
            // Binary (byte array) body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (byte[]) obj);
        } else if (obj instanceof File) {
            // File body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (File) obj);
        } else if (isJsonMime(contentType)) {
            String content;
            if (obj != null) {
                content = gson.toJson(obj);
            } else {
                content = null;
            }
            return RequestBody.create(MediaType.parse(contentType), content);
        } else {
            throw new APIException("Content type \"" + contentType + "\" is not supported");
        }
    }

    /**
     * Actual code to execute a request to the BrAPI service, and process the response via the {@link ResponseHandlerFunction}
     * @param request
     * @param responseHandler User defined function to handle the <code>result</code> section of the {@link org.brapi.brapi-core-model.v2.model.response.BrAPIResponse}
     * @param <T> Object that the user expects.  {@link ResponseHandlerFunction} must return this type.
     * @return <T>
     * @throws APIException
     */
    private <T> Optional<T> execute(BrAPIRequest request, Optional<ResponseHandlerFunction<T>> responseHandler) throws HttpException, APIException {
        OkHttpClient client = getHttpClient();
        String contentType = request.getContentType();

        // default to application/json
        if (contentType == null) {
            contentType = "application/json";
        }

        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(request.getMethod().name())) {
            reqBody = null;
        } else {
            reqBody = serialize(request.getData(), contentType);
        }

        Request.Builder httpReq = new Request.Builder().method(request.getMethod().name(), reqBody );
        if(this.authToken != null) {
            httpReq.addHeader("Authorization", "Bearer " + authToken);
        }

        StringBuilder url = new StringBuilder(request.getTarget());
        if(request.getParameters() != null && !request.getParameters().isEmpty()) {
            url.append("?")
               .append(request.getParameters()
                              .entrySet()
                              .stream()
                              .map(entry -> entry.getKey() + "=" + entry.getValue())
                              .collect(Collectors.joining("&")));
        }

        httpReq.url(this.brapiURI() + url.toString());

        try(Response response = client.newCall(httpReq.build()).execute()) {
            if (response.code() == 400) {
                throw new HttpBadRequestException(response.body().string());
            }
            else if (response.code() == 401) {
                throw new HttpUnauthorizedException(response.body().string());
            }
            else if (response.code() == 403) {
                throw new HttpForbiddenException(response.body().string());
            }
            else if (response.code() == 404){
                throw new HttpNotFoundException(response.body().string());
            }
            else if (response.code() == 500) {
                throw new HttpInternalServerError(response.body().string());
            }
            else if(response.isSuccessful()) {
                // If a callback function was passed. Run it now.
                if (responseHandler.isPresent()) {
                    try (ResponseBody body = response.body()) {
                        if(body != null) {
                            String bodyString = body.string();
                            if (!bodyString.equals("")){
                                JsonObject responseJson = gson.fromJson(bodyString, JsonObject.class);
                                JsonElement resultJson = responseJson.get("result");
                                Metadata metadata = gson.fromJson(responseJson.get("metadata"), Metadata.class);

                                return Optional.ofNullable(responseHandler.get().apply(metadata, resultJson, gson()));
                            }
                        }
                    }
                }
            }
            else {
                throw new APIException(response.body().toString());
            }
        } catch (IOException e) {
            throw new APIException(e);
        }

        return Optional.empty();
    }

    public OkHttpClient getHttpClient() {
        return new OkHttpClient(); //have this here in case we want to configure the client later
    }
}
