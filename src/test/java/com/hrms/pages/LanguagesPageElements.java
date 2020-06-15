package com.hrms.pages;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.hrms.testbase.BaseClass;

public class LanguagesPageElements extends AdminMenu {
	
	public LanguagesPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	/**
	 * 1.Successfully Saved
	 * 2.Successfully Deleted
	 * 3.Name Already Exists
	 */
	@FindBy(xpath="//*[@id='recordsListDiv']//script")
	public WebElement actionMessage;
	
	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	@FindBy (xpath="//*[contains(@class,'tdName')]")
	public List<WebElement> addedLanguageList;
	
	/**
	 * this element is for all checkbox list for added language
	 */
	@FindBy(xpath="//*[contains(@name,'chkListRecord[]')]")
	public List<WebElement> checkBoxList;
	
	@FindBy(id="btnDel")
	public WebElement deleteButton;
	
	/**
	 * this WebElement is visible after clicking on Add Button in Language page
	 */
	@FindBy(id="language_name")
	public WebElement langNameTextBox;
	
	/**
	 * this WebElement is visible after clicking on Add Button in Language page
	 */
	@FindBy(id="btnSave")
	public WebElement saveButton;
	
	/**
	 * this WebElement is visible after clicking on Add Button in Language page
	 */
	@FindBy(id="btnCancel")
	public WebElement cancelButton;
	
	
}
