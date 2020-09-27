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


public class healthCarePageTest extends TestBase {

	signupPage signupPage1;
	myInformationPage myInformationPage1;
	healthCarePage healthCarePage1;
	
	
	TestUtil crmUtil;
	
	String sheetName = "Contacts";
	
	public healthCarePageTest() {
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
		myInformationPage1.enterMyInformation("TestWorkerFName","TestWorkerLName","484783535","Ontario","Toronto","Some Street","9999","M8Y1G8","Canada","4169999999","9059999999","English");
		healthCarePage1 = myInformationPage1.clickNext();
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
	public void enterhealthCareInformation() throws IOException {
		healthCarePage1.enterhealthCareInformation("2019","12 Jan 2020","Downtown ENT Specialists","999 Bay Street","4169999999","Yes","05 Jan 2020","John Doe","200 Yonge","4169999999","Yes","Less than 2 years","Yes","Yes","03 Mar 2020","Yes");
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
}
