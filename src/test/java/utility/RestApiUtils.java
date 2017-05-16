package utility;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by vikas on 01/03/2017.
 */
public class RestApiUtils {

    public static Response postService (String payLoad, String urlParam, String contentType){
        return given().contentType(contentType).body(payLoad).when().post(urlParam);
    }

    public static Response getService(String urlParam, String contentType)  {
        return given().contentType(contentType).get(urlParam);
    }
}
