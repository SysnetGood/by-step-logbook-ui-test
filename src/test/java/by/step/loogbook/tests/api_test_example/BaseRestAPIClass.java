package by.step.loogbook.tests.api_test_example;

import java.net.http.HttpClient;

public class BaseRestAPIClass implements HttpRequestBuilder, HttpRequestExecutor {

    @Override
    public HttpClient httpClientInitialization() {
        return HttpClient.newHttpClient();
    }
}
