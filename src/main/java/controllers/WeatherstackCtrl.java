package controllers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import models.CurrentWeatherModel;

import static io.restassured.RestAssured.given;

public class WeatherstackCtrl {

    private String API_KEY = "";
    private String baseURL = "http://api.weatherstack.com/";
    private String basePath = "";
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;
    private boolean debug = false;

    public WeatherstackCtrl() {
        __constructor();
    }

    public WeatherstackCtrl(final String API_KEY) {
        this.API_KEY = API_KEY;
        __constructor();
    }

    private void __constructor() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .setBasePath(basePath);

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200);

        if ( debug ) {
            requestSpecBuilder.log(LogDetail.ALL);
            responseSpecBuilder.log(LogDetail.ALL);
        }

        requestSpec = requestSpecBuilder.build();
        responseSpec = responseSpecBuilder.build();
    }

    public Response request(String query) {
        Response response = given(requestSpec, responseSpec)
                .request(Method.GET, query);

        if ( debug )
            response.prettyPrint();

        return response;
    }

    public CurrentWeatherModel getCurrentWeather(String city) {
        CurrentWeatherModel currentWeatherModel = null;

        Response response = this.request("/current?access_key=" + API_KEY + "&query=" + city);

        try {
            currentWeatherModel = response.jsonPath().getObject("", CurrentWeatherModel.class);
        } catch (Exception e) {
            System.out.println("Can't transform response to CurrentWeather object\n" + e.getMessage());
        }

        return currentWeatherModel;
    }

}
