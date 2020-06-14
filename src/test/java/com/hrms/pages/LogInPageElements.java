package com.hrms.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitializer;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.FileReader;

public class LogInPageElements {

	public LogInPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//*[@id='divLogo']/img")
	public WebElement loginPageLogo;

	@FindBy(id = "logInPanelHeading")
	public WebElement loginPageHeading;

	@FindBy(id = "txtUsername")
	public WebElement userName;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	/**
	 * Em-1="Invalid credentials" Em-2 ="Password cannot be empty" Em-3 = "Username
	 * cannot be empty"
	 */
	@FindBy(id = "spanMessage")
	public WebElement errorMessage;

	public static void adminLogin() {
		CommonMethods.sendText(PageInitializer.login.userName, FileReader.getPropertyValue("AdminUserName"));
		CommonMethods.sendText(PageInitializer.login.password, FileReader.getPropertyValue("AdminPwd"));
		CommonMethods.Click(PageInitializer.login.loginBtn);
	}
	
	public static void userLogin(String UserName, String password) {
		CommonMethods.sendText(PageInitializer.login.userName, UserName);
		CommonMethods.sendText(PageInitializer.login.password, password);
		CommonMethods.Click(PageInitializer.login.loginBtn);
	}

}
