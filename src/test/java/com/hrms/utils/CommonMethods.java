package com.hrms.utils;

import org.openqa.selenium.WebElement;

import com.hrms.testbase.*;

public class CommonMethods extends PageInitializer {

	/**
	 * This method will clear the text box field and send new Text from parameter
	 * 
	 * @param WebElement of text box field
	 * @param text as a String
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This method will use Thread.sleep from Java
	 * @param takes second as integer
	 */
	public static void javaWait(int second) {

		try {
			Thread.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
	/**
	 * This Method is for clicking any WebElement
	 * @param element
	 */
	public static void Click(WebElement element) {
		javaWait(1);
		element.click();
	}

}
