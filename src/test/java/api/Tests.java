package api;

import data.ListUsers;
import data.User;
import data.UserCreated;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests {
    /*Задача: Используя этот сервис с тестовым REST-API https://reqres.in/, написать 2 теста.
Первый – получить список пользователей (GET  https://reqres.in/api/users?page=2),
замапить на объект и проверить, что все поля пришли (достаточно на notNull).*/
    @Test
    public void firstTest() {
        ListUsers listUsers = given()
                .spec(Specifications.specRequest())
                .when()
                .get("api/users?page=2")
                .then()
                .statusCode(200)
                .extract().as(ListUsers.class);
        listUsers.assertFieldsNotNull();
    }

    /*Второй – создать пользователя (POST https://reqres.in/api/users) с данными из примера
на сайте: подготовить тело запроса, отправить запрос с телом, замапить ответ на объект
и проверить, что в ответе те же самые значения из запроса.*/
    @Test
    @Parameters({"name", "job"})
    public void secondTest(String name, String job) {
        User userBeginCreated = new User(name, job);
        User userCreated = given()
                .spec(Specifications.specRequest())
                .body(userBeginCreated)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract().as(UserCreated.class);
        Assert.assertEquals(userBeginCreated.getJob(), userCreated.getJob(), "Ожидали значение поле job: '" + userBeginCreated.getJob() + "', получили: '" + userCreated.getJob());
        Assert.assertEquals(userBeginCreated.getName(), userCreated.getName(), "Ожидали значение поле name: '" + userBeginCreated.getName() + "', получили: '" + userCreated.getName());
    }
}
