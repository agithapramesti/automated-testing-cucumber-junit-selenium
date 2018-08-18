package com.blibli.future.training.api.petstore;

import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.serenitybdd.core.pages.PageObject;

import static net.serenitybdd.rest.SerenityRest.given;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetController extends PageObject {

    private Integer id;
    private String petName;
    private Response responseAddPet;

    public Response addPet(){
        String requestBody = "{\n" +
                "  \"id\": "+getId()+",\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \""+getPetName()+"\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"Meong\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Response response = given().log().all()
                .header("content-type", "application/json")
                .header("charset", "UTF-8")
                .body(String.format(requestBody,getId(),getPetName()))
                .when().post("https://petstore.swagger.io/v2/pet")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();

        response.getBody().prettyPrint();

        return response;
    }
}
