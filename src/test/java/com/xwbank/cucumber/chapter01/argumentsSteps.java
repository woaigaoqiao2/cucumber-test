package com.xwbank.cucumber.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class argumentsSteps {

    private String name;
    private int age;
    private String result;

    @Given("^the name is \"(.*?)\" and age is (\\d+)$")
    public void theNameIsAndAgeIs(String name,int age) throws Throwable {
        this.age=age;
        this.name=name;
    }

    @When("^format the input$")
    public void FormatTheInput(){
        this.result=name+"-"+age;
    }

    @Then("^the format string is \"(.*?)\"$")
    public  void TheFormatStringIs(String value){
        assertThat(value,equalTo(result));
    }
}
