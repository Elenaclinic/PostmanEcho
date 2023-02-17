package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

class MobileBankApiTestV1 {
    @Test
    public void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("10.02.2022") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("10.02.2022"));
    }
}
