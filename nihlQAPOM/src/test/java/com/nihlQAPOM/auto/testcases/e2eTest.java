package com.nihlQAPOM.auto.testcases;

import java.io.IOException;

import org.testng.annotations.*;

import com.nihlQAPOM.auto.base.TestBase;
import com.nihlQAPOM.auto.pages.*;
import com.nihlQAPOM.auto.util.TestUtil;

public class e2eTest extends TestBase{

	signupPage signupPage1;
	myInformationPage myInformationPage1;
	healthCarePage healthCarePage1;
	employmentDetailsPage employmentDetailsPage1;
	supportingDocumentsPage supportingDocumentsPage1;
	reviewPage reviewPage1;
	TestUtil nihlUtil;
	String projDirectory;
	String sheetName = "InputData";
	
	public e2eTest() {
		super();
	}
	
	@DataProvider
	public Object[][] getAllTestData(){

		Object testdata[][] = nihlUtil.getTestData(sheetName);
		return testdata;

	}
	
	@BeforeMethod
	public void setUp() {
		nihlUtil = new TestUtil();
		projDirectory = nihlUtil.getProjectDirectory();
	}
	
	@BeforeTest
	public void init1() {
//		initialization();
	}

	@Test (priority=1, dataProvider="getAllTestData")
//	@Test 
	public void enterMyInformation(String TC_Number, String Execute_Flag, String Hearing_Loss_Type, String Email_Address, String DoB_Day, String DoB_Month, String DoB_Year,
			String First_Name, String Last_Name, String SIN, String Street_Address, String Apartment_Suite, String City, String Province_State, String Postal_Code, String Country, String Primary_Telephone_Number, String Secondary_Telephone_Number, String Language_Preference,
			String Hearing_Loss_Noticed_Year, String Wear_Hearing_Aid_Flag, String Hearing_Aid_Usage_Date, String Audiogram_First_Date, String Audiogram_Clinic_Name, String Audiogram_Clinic_Address, String Audiogram_Clinic_Phone_Number, String Visited_ENT_Specialist_Flag, String ENT_Appointment_Date, String ENT_Specialist_Name, String ENT_Specialist_Address, String END_Specialist_Phone_Number, String Experience_Ringing_Flag, String Experience_Ringing_Years, String Ringing_Severe_Flag, String Ringing_Constant_Flag,
			String Retired_Flag, String Retirement_Date, String Currently_Employed_Flag, String Current_Employer_Name, String Current_Employer_Address, String Current_Employer_Phone_Number, String Current_Work_Hazard_Flag, String Current_Situation_Explain, String Self_Employed_Flag, String Self_Employed_WSIB_Insurance_Flag, String Self_Employed_Business_Name, String Self_Employed_Business_Address, String Self_Employed_From, String Self_Employed_To, String Used_Tools_Outside_Work_Flag, String Used_Tools_Outside_Description, 
			String Employer_Name, String Employer_Address, String Employer_Country, String Employer_Province, String Employer_Phone_Number, String Employer_Still_In_Business_Flag, String Worker_Occupation_Title, String Employed_From, String Employed_To, String Tools_Used, String Tools_Used_Hrs,
			String Supporting_Document_Audiogram_File, String Supporting_Document_Employment_Proof_File,
			String Review_Email, String Review_Signature) throws IOException, InterruptedException {
		if(Execute_Flag.trim().equals("Yes")) {
			initialization();
			signupPage1 = new signupPage();
			myInformationPage1 = signupPage1.submitNewClaim(Hearing_Loss_Type, Email_Address, DoB_Day, DoB_Month, DoB_Year);
			TestUtil.takeScreenshotAtEndOfTest();
			myInformationPage1.enterMyInformation(First_Name, Last_Name, SIN, Street_Address, Apartment_Suite, City, Province_State, Postal_Code, Country, Primary_Telephone_Number, Secondary_Telephone_Number, Language_Preference);
			TestUtil.takeScreenshotAtEndOfTest();
			healthCarePage1 = myInformationPage1.clickNext();
			TestUtil.takeScreenshotAtEndOfTest();
			healthCarePage1.enterhealthCareInformation(Hearing_Loss_Noticed_Year, Wear_Hearing_Aid_Flag, Hearing_Aid_Usage_Date, Audiogram_First_Date, Audiogram_Clinic_Name, Audiogram_Clinic_Address, Audiogram_Clinic_Phone_Number, Visited_ENT_Specialist_Flag, ENT_Appointment_Date, ENT_Specialist_Name, ENT_Specialist_Address, END_Specialist_Phone_Number, Experience_Ringing_Flag, Experience_Ringing_Years, Ringing_Severe_Flag, Ringing_Constant_Flag);
			employmentDetailsPage1 = healthCarePage1.clickNext();
			employmentDetailsPage1.enterEmploymentDetails(Retired_Flag, Retirement_Date, Currently_Employed_Flag, Current_Employer_Name, Current_Employer_Address, Current_Employer_Phone_Number, Current_Work_Hazard_Flag, Current_Situation_Explain, Self_Employed_Flag, Self_Employed_WSIB_Insurance_Flag, Self_Employed_Business_Name, Self_Employed_Business_Address, Self_Employed_From, Self_Employed_To, Used_Tools_Outside_Work_Flag, Used_Tools_Outside_Description, Employer_Name, Employer_Address, Employer_Country, Employer_Province, Employer_Phone_Number, Employer_Still_In_Business_Flag, Worker_Occupation_Title, Employed_From, Employed_To, Tools_Used, Tools_Used_Hrs);
			supportingDocumentsPage1 = employmentDetailsPage1.clickNext();
			supportingDocumentsPage1.uploadFiles(projDirectory, Supporting_Document_Audiogram_File, Supporting_Document_Employment_Proof_File);
			reviewPage1 = supportingDocumentsPage1.clickNext();
			reviewPage1.reviewAndSubmit(Review_Email, Review_Signature);
			driver.quit();
		}
	}
	
	@AfterTest
	public void teardown() {
//		driver.quit();
	}
}
