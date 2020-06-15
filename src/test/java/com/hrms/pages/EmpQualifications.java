package com.hrms.pages;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.hrms.testbase.BaseClass;

public class EmpQualifications extends PIMMenu {
	
	public EmpQualifications() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(linkText="Qualifications")
	public WebElement empQualifications;
	
	@FindBy(id="addLanguage")
	public WebElement addLanguage;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * 
	 */
	@FindBy(id="language_code")
	public WebElement selectLanguage;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * options==> Writing / Speaking/Reading
	 */
	@FindBy(id="language_lang_type")
	public WebElement selectFluencyType;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * options==> 1.poor / 2.Basic / 3.Good / 4.Mother Tongue
	 */
	@FindBy(id="language_competency")
	public WebElement selectCompetencyType;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * 
	 */
	@FindBy(id="language_comments")
	public WebElement commentTextBox;
	
	@FindBy(xpath="(//*[@class='required'])[3]")
	public WebElement requiredFieldMsg;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * 
	 */
	@FindBy(id="btnLanguageSave")
	public WebElement saveBtn;
	
	/**
	 * this WebElement will be visible after clicking on "Add language"
	 * 
	 */
	@FindBy(id="btnLanguageCancel")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//*[@id='lang_data_table']//td")
	public List<WebElement> langDataTable;

	@FindBy(id="lang_data_table")
	public WebElement langDataTableOnly;
	
	@FindBy(id="addWorkExperience")
	public WebElement addWorkExperience;
	
	@FindBy(id="experience_employer")
	public WebElement companyName;
	
	@FindBy(id="experience_jobtitle")
	public WebElement jobTitle;
	
	@FindBy(id="experience_from_date")
	public WebElement fromDate;
	
	@FindBy(id="experience_to_date")
	public WebElement toDate;
	
	@FindBy(id="experience_comments")
	public WebElement commentWorkExp;
	
	@FindBy(id="btnWorkExpSave")
	public WebElement saveWorkExp;
	
	@FindBy(id="btnWorkExpCancel")
	public WebElement cancelWorkExp;
	
	@FindBy(xpath="//span[@for='experience_employer']")
	public WebElement companyErrorMsg;
	
	@FindBy(xpath="//span[@for='experience_jobtitle']")
	public WebElement jobTitleErrorMsg;
	
	@FindBy(xpath="//*[@class='table hover']//td")
	public List<WebElement> workExpTabledata;
}
