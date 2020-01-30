package com.xwbank.cucumber.chapter03;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KafkaStep {

    @Before("@kafka")
    public void before(){
        System.out.println("==========Before==========");
    }

    @Given("^use the below doc strings$")
    public void giveData(String data){
        System.out.println(data);
    }

    @When("^invoke add kafka producer send method$")
    public  void sendData(){

    }

    @And("^sleep 1 minute$")
    public void sleepMinute() {
    }


    @Then("^wen can consume the data at topic xxx$")
    public void wenCanConsumeTheDataAtTopicXxx() {

    }

    @After("@kafka")
    public void After(){
        System.out.println("==========After==========");
    }
}

