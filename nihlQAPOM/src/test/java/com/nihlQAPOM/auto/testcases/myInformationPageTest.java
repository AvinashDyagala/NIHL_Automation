package com.nihlQAPOM.auto.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nihlQAPOM.auto.base.TestBase;
import com.nihlQAPOM.auto.pages.*;
import com.nihlQAPOM.auto.util.TestUtil;


public class myInformationPageTest extends TestBase {

	myInformationPage myInformationPage1;
	signupPage signupPage1;
	TestUtil crmUtil;
	
	String sheetName = "Contacts";
	
	public myInformationPageTest() {
		super();
	}
	
//	@DataProvider
//	public Object[][] getCRMTestData(){

//		Object data[][] = crmUtil.getTestData(sheetName);
//		return data;

//	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signupPage1 = new signupPage();
		myInformationPage1 = signupPage1.submitNewClaim("test1@testmail.com","12","Jan","2003","Gradual");

		//		loginPage = homePage.gotoLogInPage();
//		String emailID = prop.getProperty("email");
//		String password = prop.getProperty("password");
//		userLandingPage = loginPage.loginCRM(emailID, password);
//		myInformationPage1 = new myInformationPage();
		crmUtil = new TestUtil();
	}
	

//	@Test (priority=2, dataProvider="getCRMTestData")
	@Test 
	public void enterMyInformation() throws IOException {
		myInformationPage1.enterMyInformation("TestWorkerFName","TestWorkerLName", "484783535","Ontario","Toronto","Some Street","9999","M8Y1G8","Canada","4169999999","9059999999","English");
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
}
