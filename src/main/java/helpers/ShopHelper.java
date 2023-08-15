package helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ShopHelper {
   static String basurl="https://petstore.swagger.io/v2";
    public static  Response createPet(){
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        String pet="/pet";
        RestAssured.baseURI = basurl;
       return ApiHelper.post(basurl+pet,body);
    }
}
