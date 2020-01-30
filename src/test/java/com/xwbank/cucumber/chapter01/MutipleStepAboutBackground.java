package com.xwbank.cucumber.chapter01;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MutipleStepAboutBackground {

    @Given("^x and y value$")
    public void x_and_y_value() throws Throwable {

    }

    @And("^and operation$")
    public void andOperation() {
        
    }

    @When("^invoke calculate button$")
    public void invokeCalculateButton() {
        
    }

    @Then("^the result is x\\+y$")
    public void theResultIsXY() {
        
    }

    @Then("^the result is x-y$")
    public void _theResultIsXY() {
    }

    @And("^sub operation$")
    public void subOperation() {
    }
}
