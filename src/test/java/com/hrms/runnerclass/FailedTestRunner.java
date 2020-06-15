package com.hrms.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/failedtest.txt",
		glue="com/hrms/stepdefinitions",
		dryRun=false,
		monochrome = true,
		plugin= {
				"pretty",
				"html:target/Cucumber-html",
				"json:target/cucumber.json",
		}
		)

public class FailedTestRunner {

}
