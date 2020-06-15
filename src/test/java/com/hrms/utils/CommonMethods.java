package com.hrms.utils;

import java.io.*;
import java.text.*;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import com.hrms.testbase.*;

public class CommonMethods extends PageInitializer {
	
	public static String destinationfile = "";

	/**
	 * This method will clear the text box field and send new Text from parameter
	 * 
	 * @param WebElement of text box field
	 * @param text       as a String
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This Method is for sending text and press space wherever it needs.
	 * 
	 * @param element
	 * @param text
	 * @param space
	 */
	public static void sendTextWithSpace(WebElement element, String text, Keys space) {
		element.clear();
		element.sendKeys(text);
		element.sendKeys(space);
	}

	/**
	 * This method will use Thread.sleep from Java
	 * 
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
	 * 
	 * @param element
	 */
	public static void Click(WebElement element) {
		javaWait(1);
		element.click();
	}

	/**
	 * This Method will take List of radio Elements and a value to be click And will
	 * click on specified checkbox
	 * 
	 * @param radioOrcheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckBox(List<WebElement> radioOrcheckbox, String value) {
		String actualValue;
		for (WebElement element : radioOrcheckbox) {
			actualValue = element.getAttribute("value").trim();
			if (element.isEnabled() && actualValue.equals(value)) {
				element.click();
				break;
			}
		}
	}

	/**
	 * Method to Select dropdown list by Visible Text
	 * 
	 * @param element      with Select tag with value option
	 * @param textToSelect
	 */

	public static void selectDdValue(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);
			select.selectByVisibleText(textToSelect);

			List<WebElement> option = select.getOptions();

			for (WebElement ele : option) {
				String str = ele.getText().trim();
				if (str.equals(textToSelect.trim())) {
					select.selectByVisibleText(str);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method to Select dropdown list by index
	 * 
	 * @param element
	 * @param index
	 */

	public static void selectDDByIndex(WebElement element, int index) {

		try {
			Select select = new Select(element);
			List<WebElement> option = select.getOptions();

			if (index < option.size()) {
				select.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This Method will switch focus to frame by Name or ID
	 * 
	 * @param nameOrId
	 */

	public static void switchToFrame(String nameOrId) {

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This Method will switch focus to frame by WebElement
	 * 
	 * @param element
	 */
	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This Method will switch focus to frame by index
	 * 
	 * @param index
	 */

	public static void switchToFrame(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method switches focus to Child Window
	 */

	public static void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			if (window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}

	/**
	 * This Method will return Explicit Wait object
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAITTIME);
		return wait;
	}

	/**
	 * This Method will take an WebElement as a parameter And wait for the element
	 * to be available for click.
	 * 
	 * @param WebElement
	 */

	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This Method will take an WebElement as a parameter And wait for the element
	 * to be visible to take action.
	 * 
	 * @param element
	 */

	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method with wait for WebElement to be available for click and then click
	 * it
	 * 
	 * @param WebElement
	 */

	public static void waitAndClick(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * This Method is for uploading image in Webpage.
	 * @param element
	 * @param filePath
	 */
	public static void fileUpload(WebElement element, String filePath) {
		element.clear();
		element.sendKeys(filePath);
	}
	
	/**
	 *  this Method will return date & time for any event where it is concatenated
	 * @return [yyyy_MM_dd_HH_mm_ss]
	 */
	public static String getTimeStemp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}
	
	/**
	 * This Method is for creating object of Java Script Executor
	 * @return
	 */

	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}
	
	/**
	 * This Method will take a WebElement as an argument and click on it using Java Script executor
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}

	/**
	 * This Method will take a WebElement as an argument and scroll to it using Java Script executor
	 * @param element
	 */
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * Method that will scroll the page down based on the passed pixel parameters
	 * 
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
	}

	/**
	 * Method that will scroll the page up based on the passed pixel parameters
	 * 
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		getJSObject().executeScript("window.scrollBy(0,-" + pixel + ")");
	}

	/**
	 * This Method will take screen shot for
	 * 
	 * @param fileName
	 * @return byte[] of the screenshot.
	 */

	public static byte[] takeScreenShotCucumber(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picByte = ts.getScreenshotAs(OutputType.BYTES);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		destinationfile = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStemp() + ".png";
		try {
			FileUtils.copyFile(sourceFile, new File(destinationfile));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return picByte;
	}
	
	/**
	 * Following method will click on any sub menu under parent Menu
	 * @param e1
	 * @param e2
	 */
	public static void clickSubMenu(WebElement e1,WebElement e2) {
		e1.click();
		e2.click();
	}
	
	/**
	 * this Method will click on Grandchild menu
	 * @param e1
	 * @param e2
	 * @param e3
	 */
	public static void clickextSubMenu(WebElement e1,WebElement e2, WebElement e3) {
		e1.click();
		e2.click();
		javaWait(2);
		jsClick(e3);
		
	}
	
}
