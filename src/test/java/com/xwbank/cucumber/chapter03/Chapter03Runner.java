package com.xwbank.cucumber.chapter03;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber-report.json","html:target/cucumber","junit:target/cucumber-junit.xml"},
snippets = SnippetType.CAMELCASE)
public class Chapter03Runner {

}
