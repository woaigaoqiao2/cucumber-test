package com.xwbank.cucumber.chapter03;

import cucumber.api.java.en.Given;
import org.junit.Assert;

import java.util.logging.Logger;

public class testTag {

    private static final Logger Log=Logger.getLogger("MyHooks");

    @Given("^open the github home page$")
    public void testTag(){

    }

    @Given("^this is background$")
    public void background(){
        Log.info("this is background method in steps");

    }



}
