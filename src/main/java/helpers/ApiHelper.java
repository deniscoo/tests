package helpers;

import io.restassured.response.Response;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import static io.restassured.RestAssured.given;
@Log
public class ApiHelper {
   public static Response post(String url,String json){
     log.info("post url "+url+" body "+json);
        return given().baseUri(url)
                .header("Content-type", "application/json")
                .and()
                .body(json)
                .when()
                .post()
                .then()
                .extract().response();
    }
}
