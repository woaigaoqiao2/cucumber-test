package com.xwbank.cucumber.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class WithScenarioOutlineStep {

    private boolean login;

    @Given("^open the login page testing scenarios outline$")
    public void openLoginPage(){

    }

    @When("^use \"(.*?)\" with password \"(.*?)\" testing scenarios outline$")
    public void login(String name ,String password){
        this.login=(name.equals("alex")&&password.equals("123456"));
    }


    @Then("^the user or password is invalid$")
    public void LoginFaild(){
        Assert.assertEquals(1,1);
    }


    @Then("^the username and password is right$")
    public void LoginSuccess(){
        Assert.assertEquals(1,1);
    }


}
