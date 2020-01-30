package com.xwbank.cucumber.chapter02;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStep {


    @Given("^the user open the login site$")
    public void OpenSite(){

    }

    @When("^lets validate the following user account and email raw data$")
    public void toRawData(DataTable dataTable){
        dataTable.raw().forEach(System.out::println);

    }

    @When("^lets validate the following user account and email user-defined$")
    public void toUserDefined(List<Account> data){
        data.forEach(System.out::println);
    }

    @When("^lets validate the following user account and email list-map$")
    public void tolistMap(List<Map<String,String>> data){
        data.forEach(System.out::println);
    }

    @When("^lets validate the following user account and email list-list$")
    public void toListList(List<List<String>> data){
        data.forEach(System.out::println);
    }


}
