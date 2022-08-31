package org.example.Test_1;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class EjemploGetTest {
    @Test
    public void testGetSimple() {
        String response =
                RestAssured
                        .when()
                        .get("https://jsonplaceholder.typicode.com/comments?postId=1")
                        .then()
                        .extract().asString();
        System.out.println(response);
    }
    @Test
    public void testGetParametros() {
        String response =
                RestAssured
                        .given() //preparacion del llamado
                        .queryParam("postID", "2")
                        .when() //Accion -> llamado al servicio
                        .get("https://jsonplaceholder.typicode.com/comments")
                        .then()//entonces algo......
                        .extract().asString();
        System.out.println(response);
    }
}
