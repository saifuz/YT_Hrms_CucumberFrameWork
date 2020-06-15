package com.hrms.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.hrms.utils.*;

public class EmpQualificationSteps extends CommonMethods {

	@And("user is naviaged to Employee information page and click on an employee id")
	public void user_is_naviaged_to_Employee_information_page_and_click_on_an_employee_Name() {

		clickSubMenu(empList.pimMenu, empList.employeeListMenu);
		javaWait(5);
		
		Click(empList.empSearchId);
		javaWait(25);
		sendTextWithSpace(empList.empSearchId, "6961", Keys.SPACE);
		javaWait(30);
		jsClick(empList.searchBtn);
		javaWait(10);
		jsClick(empList.clickSearchedEmployee);

	}

	@And("User is navigated to add Language window")
	public void user_is_navigated_to_add_Language_window() {
		jsClick(empQualification.empQualifications);
		javaWait(2);
		scrollToElement(empQualification.addLanguage);
		jsClick(empQualification.addLanguage);
		javaWait(20);
	}

	@When("User selects a language named {string}")
	public void user_selects_a_language_named(String string) {
		selectDdValue(empQualification.selectLanguage, string);
	}

	@When("user selects fluency and Competency from DataTable for {string}")
	public void selectingCompetency(String languageName, DataTable fluency) {

		List<Map<String, String>> langCompetency = fluency.asMaps();

		for (Map<String, String> m : langCompetency) {
			String fluency1 = m.get("fluency");
			String comptency = m.get("Competency");
			selectDdValue(empQualification.selectFluencyType, fluency1);
			javaWait(2);
			selectDdValue(empQualification.selectCompetencyType, comptency);
			javaWait(5);
			Click(empQualification.saveBtn);
			javaWait(5);

			jsClick(empQualification.addLanguage);
			selectDdValue(empQualification.selectLanguage, languageName);

		}

	}

	@Then("User Verifies that language is added with fluency and Competency")
	public void user_Verifies_that_is_added_with_fluency_and_Competency(DataTable dataTable) {
		javaWait(10);
		List<String> langCompetency = dataTable.asList();
		List<WebElement> language = empQualification.langDataTable;

		for (WebElement ele : language) {
			String actual = ele.getText();

			for (String m : langCompetency) {
				if (m.equalsIgnoreCase(actual))
					Assert.assertEquals("Test Case Failed", m, actual);
			}
		}
		
		javaWait(5);
		scrollToElement(empQualification.langDataTableOnly);
		

	}
}
