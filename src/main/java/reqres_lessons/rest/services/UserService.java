package reqres_lessons.rest.services;

import reqres_lessons.rest.dto.SingleUser;
import reqres_lessons.rest.dto.User;

import static io.restassured.RestAssured.given;

public class UserService extends BaseRestService {

    public static SingleUser getSingleUser(int userId) {
        return given()
                .spec(requestSpecification)
                .when()
                .get("/api/users/" + userId)
                .then()
                .statusCode(200)
                .extract().as(SingleUser.class);
    }

    public static User createUser(String name, String job) {
        User body = new User();
        body.setName(name);
        body.setJob(job);

        return given()
                .spec(requestSpecification)
                .body(body)
                .when()
                .post("/api/users/")
                .then()
                .statusCode(201)
                .extract().as(User.class);
    }

    public static User updateUser(User body) {
        return given()
                .spec(requestSpecification)
                .body(body)
                .when()
                .put("/api/users/" + body.getId())
                .then()
                .statusCode(200)
                .extract().as(User.class);
    }

//    public static void main(String[] args) {
//        User user1 = new User();
//        user1.setName("TestName");
//        user1.setJob("TestJob");
//        user1.setId("4");
//        updateUser(user1);
//    }
}