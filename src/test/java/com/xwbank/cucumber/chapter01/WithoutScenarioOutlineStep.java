package com.xwbank.cucumber.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.IsEqual.equalTo;

public class WithoutScenarioOutlineStep {

    private boolean login;

    @Given("^open the login page$")
    public void openLoginPage(){

    }

    @When("^use \"(.*?)\" with password \"(.*?)\"$")
    public void login(String name ,String password){
        this.login=(name.equals("alex")&&password.equals("123456"));
    }


    @Then("^the user login failed$")
    public void LoginFaild(){

    }


    @Then("^the user login success$")
    public void LoginSuccess(){

    }


}
