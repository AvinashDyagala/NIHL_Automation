package com.nihlQAPOM.auto.testcases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;

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


public class signupPageTest extends TestBase {

	signupPage signupPage1;
	myInformationPage myInfoPage1;
	TestUtil crmUtil;
	
	String sheetName = "Contacts";
	
	public signupPageTest() {
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
//		homePage = new HomePage();
//		loginPage = homePage.gotoLogInPage();
//		String emailID = prop.getProperty("email");
//		String password = prop.getProperty("password");
//		userLandingPage = loginPage.loginCRM(emailID, password);
		signupPage1 = new signupPage();
	
		crmUtil = new TestUtil();
	}
	
//	@Test (priority=1)
//	public void contactsPageTitleTest() {
//		String contactsPageHeader = myInformationPage.getContactsPageUITitle();
//		Reporter.log("Contacts Page Header: " + contactsPageHeader);
//		Assert.assertEquals(contactsPageHeader,"Contacts");
//	}
	
//	@Test (priority=2, dataProvider="getCRMTestData")
	@Test 
	public void signUpforClaim() throws IOException {
		myInfoPage1 = signupPage1.submitNewClaim("test1@testmail.com","12","Jan","2003","Gradual");
		if (signupPage1.errorMessage != "") {
			System.out.println(signupPage1.errorMessage);
			myInfoPage1 = null;
		}
		
		TestUtil.takeScreenshotAtEndOfTest();
	}

	@Test 
/*	public void invalidEmail() throws IOException {
		myInfoPage1 = signupPage1.signupOrContinue("test1@testmail","12 Jan 2003","","Gradual");
		if (signupPage1.errorMessage != "") {
			Assert.assertEquals(signupPage1.errorMessage,"Please enter a valid email","Not correct Error");
			myInfoPage1 = null;
		}
		
		TestUtil.takeScreenshotAtEndOfTest();
	}

	@Test 
	public void invalidDoB() throws IOException {
		myInfoPage1 = signupPage1.signupOrContinue("test1@testmail.com","12 Jan 2009","","Gradual");
		if (signupPage1.errorMessage != "") {
			Assert.assertEquals(signupPage1.errorMessage,"Please enter a valid date of birth","Invalid DoB failed");
			myInfoPage1 = null;
		}
		
		TestUtil.takeScreenshotAtEndOfTest();
	}
*/
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
