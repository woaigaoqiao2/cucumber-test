package com.xwbank.cucumber.quickstart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MyStepdefs {

    @Given("^URl is ok$")
    public void urlIsOk() {
        assertThat(1,equalTo(1));
    }

    @When("^User enters the URL$")
    public void userEntersTheURL() {
        assertThat(1,equalTo(1));
    }

    @Then("^app page loads$")
    public void appPageLoads() {
        assertThat(1,equalTo(1));
    }
}
