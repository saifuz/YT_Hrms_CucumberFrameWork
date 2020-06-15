package com.hrms.testbase;

import com.hrms.pages.*;

public class PageInitializer extends BaseClass {
	
	public static LogInPageElements login;
	public static DashboardPageElements dashBoard;
	public static AddEmployee emp;
	public static EmployeeListPage empList;
	public static PersonalDetailsPage  pDetails;
	public static ReportsPageElements report;
	public static LanguagesPageElements language;
	public static EmpQualifications empQualification;

	public static void initializePages() {
		login=new LogInPageElements();
		dashBoard = new DashboardPageElements();
		emp = new AddEmployee();
		empList = new EmployeeListPage();
		pDetails = new PersonalDetailsPage();
		report = new ReportsPageElements();
		language=new LanguagesPageElements();
		empQualification= new EmpQualifications();
	}

}
