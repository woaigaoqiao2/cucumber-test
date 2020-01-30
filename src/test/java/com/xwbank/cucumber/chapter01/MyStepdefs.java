package com.xwbank.cucumber.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MyStepdefs {

    private Calculator calculator;
    private int result;

    @Given("^x is (\\d+) and y is (\\d+)$")
    public void xIsAndYIs(int arg1, int arg2) {

        this.calculator=new Calculator(arg1,arg2);
    }

    @When("^invoke add method$")
    public void invokeAddMethod() {
        result=this.calculator.add();
    }

    @Then("^the result is (\\d+)$")
    public void theResultIs(int arg1) {
        assertThat(arg1,equalTo(result));
    }
}
