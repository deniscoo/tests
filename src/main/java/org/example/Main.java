package org.example;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Main {
    public static void main(String[] args) {
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
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(body)
                .when()
                .post("/pet")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
    }
}