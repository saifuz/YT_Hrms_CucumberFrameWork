package com.hrms.stepdefinitions;

import java.util.*;
import org.junit.*;
import org.openqa.selenium.*;
import com.hrms.utils.*;
import io.cucumber.java.en.*;

public class AddEmpLanguage extends CommonMethods {

	@Given("user is naviaged to Employee information page and click on an {string}")
	public void user_is_naviaged_to_Employee_information_page_and_click_on_an(String string) {

		clickSubMenu(empList.pimMenu, empList.employeeListMenu);

		jsClick(empList.empSearchId);

		sendTextWithSpace(empList.empSearchId, string, Keys.SPACE);
//		javaWait(10);
		waitAndClick(empList.searchBtn);
//		javaWait(10);
		jsClick(empList.clickSearchedEmployee);

	}

	@When("user selects {string} and {string} from DataTable for {string}")
	public void user_selects_and_from_DataTable_for(String string, String string2, String string3) {

		selectDdValue(empQualification.selectFluencyType, string);
		selectDdValue(empQualification.selectCompetencyType, string2);
		Click(empQualification.saveBtn);
//
//			jsClick(empQualification.addLanguage);
//			selectDdValue(empQualification.selectLanguage, string3);

	}

	@Then("User Verifies that {string} is added with {string} and {string}")
	public void user_Verifies_that_is_added_with_and(String string, String string2, String string3) {

		List<String> langCompetency = new ArrayList<>();
		langCompetency.add(string);
		langCompetency.add(string2);
		langCompetency.add(string3);
		List<WebElement> language = empQualification.langDataTable;

		for (WebElement ele : language) {
			String actual = ele.getText();

			for (String m : langCompetency) {
				if (m.equalsIgnoreCase(actual))
					Assert.assertEquals("Test Case Failed", m, actual);
			}
		}

//	javaWait(5);
		scrollToElement(empQualification.langDataTableOnly);

	}
}
