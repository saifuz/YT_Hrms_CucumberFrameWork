package com.hrms.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.pages.LogInPageElements;
import com.hrms.utils.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdminQualifications extends CommonMethods {

	@Given("user is logged in HRMS with valid Admin Credential")
	public void user_is_logged_in_HRMS_with_valid_Admin_Credential() {
//		jsClick(login.userName);
		login.adminLogin();
//		login.userLogin("Admin", "Hum@nhrm123");
//		sendText(LogInPageElements.userName, "Admin");
//		sendText(LogInPageElements.password, "Hum@nhrm123");
//		Click(LogInPageElements.loginBtn);
	}

	@And("user is naviaged to add Language window and click on add button")
	public void user_is_naviaged_to_add_Language_window() {
		clickextSubMenu(language.adminMenu, language.qualificationsMenu, language.languagesMenu);
//		javaWait(5);
//		jsClick(language.addButton);
//		javaWait(2);

	}

	@When("user enter following qualifications,clicks on save button and message is displayed")
	public void addingLanguagee(DataTable nameAndMessage) {
		List<Map<String, String>> languageList = nameAndMessage.asMaps();

		String expected;
		String actualMsg;

		for (Map<String, String> details : languageList) {
			expected = details.get("LanguageName");
			jsClick(language.addButton);
			sendText(language.langNameTextBox, expected);
			jsClick(language.saveButton);

			List<WebElement> languageName = language.addedLanguageList;
			for (WebElement ele : languageName) {
				actualMsg = ele.getText();
				if (actualMsg.contains(expected)) {
					Assert.assertEquals("Successful Message NOT Displayed", expected, actualMsg);
					break;
				}
			}
			waitAndClick(language.addButton);

		}

	}

}
