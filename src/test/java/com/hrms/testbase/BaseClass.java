package com.hrms.testbase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.hrms.utils.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;

	public static WebDriver automationSetup() {

		FileReader.propertiesFileReader(Constants.CONFIGURATION_FILEPATH);

		String browser = FileReader.getPropertyValue("BrowserType");

		switch (browser.toLowerCase()) {

		case "chrome":
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		default:
			System.out.println("Please select chrome/firefox/edge/ie brrower only");
		}

		driver.manage().window().maximize();
		driver.get(FileReader.getPropertyValue("ProjectUrl"));
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITWAIT_TIME, TimeUnit.SECONDS);
		PageInitializer.initializePages();
		return driver;

	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
