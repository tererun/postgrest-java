package run.tere.lib.postgrest.builders;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Map;

public class PostgrestBuilder {
    private URI url;

    private String schema;
    private Map<String, String> headers;
    private String method;
    private Map<String, String> searchParams;


    public PostgrestBuilder (URI url, HttpRequest httpClient) {
        this.url = url;
    }

    protected void setHeader (String name, String value) {
        this.headers.put(name, value);
    }

    protected void setSearchParam(String name, String value) {
        this.searchParams.put(name, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getMethod() {
        return method;
    }

    public void execute() {
        if (method == null) {
            throw new NullPointerException("Method cannot be null");
        }

        if (schema != null) {

        }
    }
}
