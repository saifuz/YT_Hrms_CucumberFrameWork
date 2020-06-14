package com.hrms.utils;

public class Constants {
	
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/Configs/Configuration.properties";
	
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/target/ScreenShot/";
	
	public static final String TESTDATA_FILEPATH=System.getenv("user.dir")+"/src/test/resources/TestData";
	
	
	public static final String CHROME_PROPERTY="webdriver.chrome.driver";
	public static final String FIREFOX_PROPERTY="webdriver.gecko.driver";
	public static final String EDGE_PROPERTY="webdriver.edge.driver";
	public static final String IE_PROPERTY="webdriver.ie.driver";
	
	public static final int EXPLICIT_WAITTIME=10;
	public static final int IMPLICITWAIT_TIME=10;
	
	
	
}
