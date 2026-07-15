package com.dn.utils;

import static io.restassured.RestAssured.given;

public class RestAssuredUtil {

    public void restGet(String url){
        given()
                .log().all().get(url)
                .then().log().all().statusCode(200);
    }
}
