package com.xwbank.cucumber.chapter02;

import cucumber.api.java.en.Given;

public class GroupStep {

    @Given("^the number is (\\d+)$")
    public void group(int v){
        System.out.println(v);
    }

    @Given("^the capture is \\d+$")
    public void group1(){

    }
}
