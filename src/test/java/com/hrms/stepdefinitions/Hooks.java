package com.hrms.stepdefinitions;

import org.openqa.selenium.support.ui.*;

import com.hrms.testbase.*;
import com.hrms.utils.*;
import io.cucumber.java.*;

public class Hooks {

	@Before
	public static void start() {
		BaseClass.automationSetup();
	}
	
	
	@After
	public static void end(Scenario scenario) {
		
		byte[] picByte;
		
		if(scenario.isFailed()) {
			picByte=CommonMethods.takeScreenShotCucumber("failed/"+scenario.getName());
		}else {
			picByte=CommonMethods.takeScreenShotCucumber("passed/"+scenario.getName());
		}
		
		scenario.attach(picByte, "image/png", scenario.getName());
		
		CommonMethods.javaWait(2);
		BaseClass.tearDown();
	}


}
