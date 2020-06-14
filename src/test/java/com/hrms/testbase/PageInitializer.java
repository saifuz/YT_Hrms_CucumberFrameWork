package com.hrms.testbase;

import com.hrms.pages.*;

public class PageInitializer extends BaseClass {
	
	public static LogInPageElements login;

	public static void initializePages() {
		login=new LogInPageElements();

	}

}
