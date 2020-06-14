package com.hrms.stepdefinitions;

import org.openqa.selenium.support.ui.Wait;

import com.hrms.testbase.*;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.*;

public class Hooks {

	@Before
	public static void start() {
		BaseClass.automationSetup();
	}
	
	
	@After
	public static void end() {
		CommonMethods.javaWait(2);
		BaseClass.tearDown();
	}


}
