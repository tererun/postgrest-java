package run.tere.lib.postgrest.builders;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class PostgrestClientQueryBuilder extends PostgrestBuilder {
    private HashMap<String, String> headers;

    public PostgrestClientQueryBuilder(URI url, HttpRequest httpRequest, HashMap<String, String> headers) {
        super(url, httpRequest);
        this.headers = headers;
        HttpRequest httpRequest = HttpRequest.newBuilder(url).header("name", "value").build();
        HttpClient.newBuilder().build().send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    public PostgrestClientFilterBuilder select(String columns) {


    }
}
