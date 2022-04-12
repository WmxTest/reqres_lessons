package reqres_lessons.rest.services;

import reqres_lessons.rest.dto.User;

import static io.restassured.RestAssured.given;

public class UserService extends BaseRestService {

    public static User getSingleUser(int userId) {
        return given()
                .spec(requestSpecification)
                .when()
                .get("/api/users/" + userId)
                .then()
                .statusCode(200)
                .extract().as(User.class);
    }
}