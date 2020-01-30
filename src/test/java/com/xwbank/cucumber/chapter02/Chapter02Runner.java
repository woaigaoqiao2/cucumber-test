package com.xwbank.cucumber.chapter02;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber-report.json"}
)
public class Chapter02Runner {

}
