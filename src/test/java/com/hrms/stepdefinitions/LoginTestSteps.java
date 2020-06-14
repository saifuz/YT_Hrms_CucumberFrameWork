package com.hrms.stepdefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginTestSteps extends CommonMethods {
	
	@When("user enter invalid {string} and {string} combinations and clicks login button")
	public void user_enter_invalid_and_combinations(String UserName, String Password) {
		login.userLogin(UserName, Password);
	}

	@Then("User will see {string}.")
	public void user_will_see(String errorMsg) {
		
		String actualMsg=login.errorMessage.getText();
		Assert.assertEquals("Test Case Failed", errorMsg, actualMsg);

	}

}
