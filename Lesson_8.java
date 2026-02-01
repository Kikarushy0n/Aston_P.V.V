import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Lesson_8 {

    @Test
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("test", "hello world")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.test", equalTo("hello world"));
    }

    @Test
    public void testPostRawText() {
        String message = "132";

        given()
                .baseUri("https://postman-echo.com")
                .body(message)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(message));
    }

    @Test
    public void testPutRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("update data")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo("update data"));
    }

    @Test
    public void testPatchRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("patch data")
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("patch data"));
    }

    @Test
    public void testDeleteRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200);

    }
}