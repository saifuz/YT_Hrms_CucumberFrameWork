package com.hrms.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/",
		glue="com/hrms/stepdefinitions",
		dryRun=false,
		monochrome = true,
		strict = true, // checks for implementation og Gherkin Steps
		
		tags="@addlanguage1",
		plugin= {
				"pretty",
				"html:target/CcDefaultReport",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		)

public class TestRunner {

}
