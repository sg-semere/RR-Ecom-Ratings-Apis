package org.sgi.product;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveGreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/productRate")
          .then()
             .statusCode(200)
             .body(is("Hello product rate Reactive"));
    }

}