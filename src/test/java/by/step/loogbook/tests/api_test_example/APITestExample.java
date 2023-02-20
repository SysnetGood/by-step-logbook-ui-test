package by.step.loogbook.tests.api_test_example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;

import org.json.JSONObject;

public class APITestExample extends BaseRestAPIClass{

    @Test
    public void verifySuccessStatusCode() {
        HttpRequest request = getRequest(
                "https://www.postman-echo.com/get",
                HttpMethod.GET,
                HttpRequest.BodyPublishers.noBody()
        );

        HttpResponse<String> response = executeRequest(request);

        Assertions.assertEquals(HttpStatus.SC_OK, response.statusCode());
    }

    @Test
    public void verifyFailStatusCode(){
        HttpRequest request = getRequest(
                "https://www.postman-echo.com/get",
                HttpMethod.POST,
                HttpRequest.BodyPublishers.noBody()
        );

        HttpResponse<String> response = executeRequest(request);

        Assertions.assertEquals(HttpStatus.SC_NOT_FOUND, response.statusCode());
    }

    @Test
    public void verifySuccessStatusCodeWithBody(){
        HttpRequest request = getRequest(
                "https://www.postman-echo.com/post",
                HttpMethod.POST,
                HttpRequest.BodyPublishers.ofString("Hello World")
        );

        HttpResponse<String> response = executeRequest(request);

        JSONObject json = new JSONObject(response.body());

        Assertions.assertEquals("Hello World", json.getString("data"));
        Assertions.assertEquals(HttpStatus.SC_OK, response.statusCode());
    }
}
