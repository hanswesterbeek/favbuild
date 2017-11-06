package nl.enhance.favbuild;

import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DemoFunctionalTest {

    @Test
    public void foo() throws MalformedURLException {

        String baseUrl = System.getProperty("app.url");
        final String url = baseUrl + "/foo";
        final Response response =
                when().get(new URL(url)).then()
                        .assertThat().statusCode(200)
                        .assertThat().contentType(ContentType.JSON).extract()
                .response();
        JsonPath jsonPath = new JsonPath(response.asInputStream());
        final String result = jsonPath.getString("foo");
        assertTrue(("bar".equals(result)));
    }

}
