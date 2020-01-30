package com.xwbank.cucumber.chapter01;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class CompexDataSteps {

    @Given("^the user account information$")
    public void  TheUserAccountInformation(){

    }

    @Then("^we can found user \"(.*?)\" with password \"(.*?)\",phone \"(.*?)\" exists$")
    public void weCanSerachUserWithPasswordPhoneExist(String name,String password,String phone){
        System.out.println(name);
        System.out.println(password);
        System.out.println(phone);
        System.out.println("-----------------------");
    }


    @Then("^we veriy following user exists$")
    public  void WeVeriFollowinguserExists(DataTable dataTable){
        List<List<String>> arguments = dataTable.raw();
        arguments.forEach(System.out::println);
    }

}
