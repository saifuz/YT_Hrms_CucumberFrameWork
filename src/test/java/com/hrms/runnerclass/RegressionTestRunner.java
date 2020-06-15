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
		tags="@regression",
		strict=true,
		plugin= {
				"pretty",
				"html:target/CucumberhtmlReport",
				"json:target/cucumber.json",
				"rerun:target/failedtest.txt"
		}
		)

public class RegressionTestRunner {

}
