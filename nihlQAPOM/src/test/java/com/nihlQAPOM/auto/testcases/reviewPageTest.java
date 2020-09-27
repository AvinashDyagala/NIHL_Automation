package com.nihlQAPOM.auto.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nihlQAPOM.auto.base.TestBase;
import com.nihlQAPOM.auto.pages.*;
import com.nihlQAPOM.auto.pages.healthCarePage;
import com.nihlQAPOM.auto.pages.myInformationPage;
import com.nihlQAPOM.auto.pages.signupPage;
import com.nihlQAPOM.auto.pages.supportingDocumentsPage;
import com.nihlQAPOM.auto.util.TestUtil;

public class reviewPageTest extends TestBase{
	
	signupPage signupPage1;
	myInformationPage myInformationPage1;
	healthCarePage healthCarePage1;
	employmentDetailsPage employmentDetailsPage1;
	supportingDocumentsPage supportingDocumentsPage1;
	reviewPage reviewPage1;

	TestUtil crmUtil;	
	
	
	public reviewPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException{
		initialization();
		signupPage1 = new signupPage();
		myInformationPage1 = signupPage1.submitNewClaim("test1@testmail.com","12","Jan","2003","Gradual");
		TestUtil.takeScreenshotAtEndOfTest();
		myInformationPage1.enterMyInformation("TestWorkerFName","TestWorkerLName","484783535","Ontario","Toronto","Some Street","9999","M8Y1G8","Canada","4169999999","9059999999","English");
		TestUtil.takeScreenshotAtEndOfTest();
		healthCarePage1 = myInformationPage1.clickNext();
		TestUtil.takeScreenshotAtEndOfTest();
		healthCarePage1.enterhealthCareInformation("2019","12 Jan 2020","Downtown ENT Specialists","999 Bay Street","4169999999","Yes","05 Jan 2020","John Doe","200 Yonge","4169999999","Yes","Less than 2 years","Yes","Yes","03 Mar 2020","No");
		employmentDetailsPage1 = healthCarePage1.clickNext();
		employmentDetailsPage1.enterEmploymentDetails("Yes","2 Jan 2020","No","Self Drilling","Home Address","02 Jan 2006","02 Jan 2008","Yes","Heavy Machine Drilling activities","ABC Drilling","Yes","200 Drilling Station, Etobicoke, ON","Canada","Ontario","9059999999","Main Driller","20 Jan 1990","21 Jan 2019","Drilling Machine","8");
		supportingDocumentsPage1 = employmentDetailsPage1.clickNext();
		supportingDocumentsPage1.uploadFiles("C:\\\\Users\\\\Avinash\\\\Documents\\\\NIHL Testing\\Dummy File for PDF File.pdf","C:\\\\Users\\\\Avinash\\\\Documents\\\\NIHL Testing\\jpeg test file.jpg");
		reviewPage1 = supportingDocumentsPage1.clickNext();
		crmUtil = new TestUtil();
	}
	
	@Test 
	public void reviewPageTest1() throws IOException, InterruptedException {
		reviewPage1.reviewAndSubmit("test1@testmail.com","Test Worker");
		TestUtil.takeScreenshotAtEndOfTest();
	}
}
