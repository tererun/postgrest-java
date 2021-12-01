package run.tere.lib.postgrest;

import run.tere.lib.postgrest.builders.PostgrestClientQueryBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.HashMap;

public class PostgrestClient {
    private URI uri;
    private HashMap<String, String> headers;

    public PostgrestClient(String uri, HashMap<String, String> headers) {
        this.uri = URI.create(uri);
        this.headers = headers;
    }

    public PostgrestClientQueryBuilder from(String table) throws URISyntaxException {
        URI queryUri = new URI(this.uri + "/" + table);
        return new PostgrestClientQueryBuilder(queryUri, this.headers);
    }
}
