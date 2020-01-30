package com.xwbank.cucumber.chapter05;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;


public class Restfulstep {

    private String url;
    private String uri;
    private ValidatableResponse response;

    @After("@restful")
    public void cleanUp(){
        RestAssured.reset();
    }

    @Given("^use the url \"(.+)\"$")
    public  void  give(String url){
        this.url=url;
    }

    @When("^get \"(.+)\"$")
    public void get(String uri){
        RestAssured.baseURI=url;
        this.uri=uri;
        this.response=when().request("GET",uri).then().statusCode(equalTo(200));
    }

    @Then("^the result of status is (\\d+)$")
    public void veriyCode(int code){
        RestAssured.baseURI=url;
        when().request("GET",uri).then().statusCode(equalTo(code));
    }

    @And("^the result of message is \"(.+)\"$")
    public void veriyMessage(String message){
        response.assertThat().body("message",equalTo(message));
    }

}
