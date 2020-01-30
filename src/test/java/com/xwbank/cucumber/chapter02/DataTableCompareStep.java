package com.xwbank.cucumber.chapter02;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataTableCompareStep {

    private List<List<String>> source= new ArrayList<>();

    @Given("^open the db connection pool$")
    public void open(){

    }

    @When("^insert the batch of data$")
    public void insertData(DataTable dataTable){
        this.source.addAll(dataTable.raw());
    }

    @Then("^validation the data is inserted$")
    public void validataionInsertResult(DataTable expectedData){
        expectedData.diff(source);
    }


    @When("^Delete the user (.*?)$")
    public void deleteTheUer(String user){
        source.forEach(System.out::println);
        System.out.println(source.get(0));
        source.removeIf(item->item.get(0).equals(user));
        source.forEach(System.out::println);
    }

    @Then("^validation the data after deleted$")
    public void validateDeletedResult(DataTable expectedData){
        expectedData.diff(source);
    }
}


