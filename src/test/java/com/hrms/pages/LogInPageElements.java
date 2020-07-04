package com.hrms.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import com.hrms.testbase.*;
import com.hrms.utils.*;

public class LogInPageElements {

	public LogInPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "//*[@id='divLogo']/img")
	public WebElement loginPageLogo;

	@FindBy(id = "logInPanelHeading")
	public WebElement loginPageHeading;

	@FindBy(id = "txtUsername")
	public static WebElement userName;

	@FindBy(id = "txtPassword")
	public static WebElement password;

	@FindBy(id = "btnLogin")
	public static WebElement loginBtn;

	/**
	 * Em-1="Invalid credentials" Em-2 ="Password cannot be empty" Em-3 = "Username
	 * cannot be empty"
	 */
	@FindBy(id = "spanMessage")
	public WebElement errorMessage;

	public static void adminLogin() {
		CommonMethods.sendText(userName, FileReader.getPropertyValue("AdminUserName"));
		CommonMethods.sendText(password, FileReader.getPropertyValue("AdminPwd"));
		CommonMethods.Click(loginBtn);
	}
	
	public void userLogin(String UserName, String password1) {
		CommonMethods.sendText(userName, UserName);
		CommonMethods.sendText(password, password1);
		CommonMethods.Click(loginBtn);
	}

}
