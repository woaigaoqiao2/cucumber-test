package com.xwbank.cucumber.chapter02;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegexSteps {

    @Given("^the number (\\d+) and number (\\d+)$")
    public void g1(int x ,int y){
        System.out.println(x);
        System.out.println(y);
    }


    @When("^take the add action$")
    public void when(){

    }
}
