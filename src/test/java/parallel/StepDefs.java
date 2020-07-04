//package parallel;
//
//import java.util.*;
//
//import org.junit.Assert;
//import org.openqa.selenium.*;
//
//import com.hrms.pages.*;
//import com.hrms.utils.*;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//
//public class StepDefs extends CommonMethods {
//
//	@Given("user is logged in HRMS with valid Admin Credential")
//	public void user_is_logged_in_HRMS_with_valid_Admin_Credential() {
////		jsClick(login.userName);
//		LogInPageElements.adminLogin();
//	}
//
//	@And("user is naviaged to add Language window and click on add button")
//	public void user_is_naviaged_to_add_Language_window() {
//		clickextSubMenu(language.adminMenu, language.qualificationsMenu, language.languagesMenu);
////		javaWait(5);
////		jsClick(language.addButton);
////		javaWait(2);
//
//	}
//
//	@When("user enter following qualifications,clicks on save button and message is displayed")
//	public void addingLanguagee(DataTable nameAndMessage) {
//		List<Map<String, String>> languageList = nameAndMessage.asMaps();
//
//		String expected;
//		String actualMsg;
//
//		for (Map<String, String> details : languageList) {
//			expected = details.get("LanguageName");
//			jsClick(language.addButton);
//			sendText(language.langNameTextBox, expected);
//			jsClick(language.saveButton);
//
//			List<WebElement> languageName = language.addedLanguageList;
//			for (WebElement ele : languageName) {
//				actualMsg = ele.getText();
//				if (actualMsg.contains(expected)) {
//					Assert.assertEquals("Successful Message NOT Displayed", expected, actualMsg);
//					break;
//				}
//			}
////			waitAndClick(language.addButton);
//
//		}
//
//	}
//
//	@And("user is naviaged to Employee information page and click on an employee id")
//	public void user_is_naviaged_to_Employee_information_page_and_click_on_an_employee_Name() {
//
//		clickSubMenu(empList.pimMenu, empList.employeeListMenu);
//
//		waitAndClick(empList.empNamesrc);
////		javaWait(5);
////		sendTextWithSpace(empList.empNamesrc, "Md Saifuzzaman", Keys.TAB);
////		javaWait(2);
//		sendTextWithSpace(empList.empSearchId, "6961", Keys.SPACE);
////		javaWait(10);
//		waitAndClick(empList.searchBtn);
////		javaWait(10);
//		jsClick(empList.clickSearchedEmployee);
//
//	}
//
//	@And("User is navigated to add Language window")
//	public void user_is_navigated_to_add_Language_window() {
//		scrollToElement(empQualification.empQualifications);
//		jsClick(empQualification.empQualifications);
////		javaWait(2);
//		scrollToElement(empQualification.addLanguage);
//		jsClick(empQualification.addLanguage);
////		javaWait(20);
//	}
//
//	@When("User selects a language named {string}")
//	public void user_selects_a_language_named(String string) {
//		selectDdValue(empQualification.selectLanguage, string);
//	}
//
//	@When("user selects fluency and Competency from DataTable for {string}")
//	public void selectingCompetency(String languageName, DataTable fluency) {
//
//		List<Map<String, String>> langCompetency = fluency.asMaps();
//
//		for (Map<String, String> m : langCompetency) {
//			String fluency1 = m.get("fluency");
//			String comptency = m.get("Competency");
//			selectDdValue(empQualification.selectFluencyType, fluency1);
////			javaWait(2);
//			selectDdValue(empQualification.selectCompetencyType, comptency);
////			javaWait(5);
//			Click(empQualification.saveBtn);
////			javaWait(5);
//
//			jsClick(empQualification.addLanguage);
//			selectDdValue(empQualification.selectLanguage, languageName);
//
//		}
//
//	}
//
//	@Then("User Verifies that language is added with fluency and Competency")
//	public void user_Verifies_that_is_added_with_fluency_and_Competency(DataTable dataTable) {
////		javaWait(10);
//		List<String> langCompetency = dataTable.asList();
//		List<WebElement> language = empQualification.langDataTable;
//
//		for (WebElement ele : language) {
//			String actual = ele.getText();
//
//			for (String m : langCompetency) {
//				if (m.equalsIgnoreCase(actual))
//					Assert.assertEquals("Test Case Failed", m, actual);
//			}
//		}
//
////		javaWait(5);
//		scrollToElement(empQualification.langDataTableOnly);
//
//	}
//
//	
//}
