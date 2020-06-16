package com.hrms.stepdefinitions;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.*;
import io.cucumber.datatable.*;
import io.cucumber.java.en.*;

public class EmpWorkExperienceSteps extends CommonMethods {

	@And("User is navigated to add Work Experience window")
	public void user_is_navigated_to_add_Work_Experience_window() {
		jsClick(empQualification.empQualifications);
		javaWait(2);
		scrollToElement(empQualification.addWorkExperience);
		jsClick(empQualification.addWorkExperience);
		javaWait(20);
	}

	@When("User enters data in specified fields")
	public void user_enters_data_in_specified_fields(DataTable dataTable) {

		List<Map<String, String>> workExp = dataTable.asMaps();

		for (Map<String, String> data : workExp) {

			String comp = data.get("Company");
			String jt = data.get("JobTitle");
			String fromdate = data.get("From");
			String toDate = data.get("To");
			String remarks = data.get("Comment");

			sendText(empQualification.companyName, comp);
			sendText(empQualification.jobTitle, jt);
			sendText(empQualification.fromDate, fromdate);
			sendText(empQualification.toDate, toDate);
			sendText(empQualification.commentWorkExp, remarks);
			Click(empQualification.saveWorkExp);
			javaWait(2);
			jsClick(empQualification.addWorkExperience);

		}

	}

	@Then("User Verifies that Work Experience is added in work Experience Table")
	public void verify_work_Experience_Table(DataTable dataTable) {
		List<String> workExp = dataTable.asList();
		System.out.println(workExp);
		List<WebElement> actualData = empQualification.workExpTabledata;

		for (String data : workExp) {
			String expectedText = data;
			String actualText = null;
//			System.out.println("Expected=>" + expectedText);
			for (WebElement ele : actualData) {
				
				if (!ele.getText().isEmpty()) {
					actualText = ele.getText();
//					System.out.println("Actual=>" + actualText);
					if (actualText.contentEquals(expectedText)) {
						Assert.assertEquals("WorkExp NOT Added", expectedText, actualText);
						break;
					}

				}

			}
			Assert.assertEquals("Match NOT Found", expectedText, actualText);
		}

	}

}
