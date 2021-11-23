package com.naveen.tests.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/com/naveen/features"}, 
		glue = {"com.naveen.steps"}, 
		monochrome = true, 
		plugin = {"pretty", "html:target/cucumber-html-report", 
					"json:target/cucumber-json-report"}, 
		tags = {"~@login"}
	)
public class TestRunner {
	// you shall not have any business logic 
}
