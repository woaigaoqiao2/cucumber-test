package com.xwbank.cucumber.chapter02;

import cucumber.api.Format;
import cucumber.api.java.en.Given;

import java.util.Date;


public class DateString {

    @Given("^x is birth at (.*?)$")
    public void DateStringStep(@Format("yyyy-MM-dd") Date date){
        System.out.println(date);
    }
}
