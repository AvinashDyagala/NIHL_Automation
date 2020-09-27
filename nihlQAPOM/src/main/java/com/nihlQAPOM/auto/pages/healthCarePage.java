package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class healthCarePage extends TestBase {

	//PageFactory - OR
	@FindBy(xpath="//input[@formcontrolname='hearingLossNoticedYear']")
	WebElement weHearingLossNoticedYear;
	
	
	@FindBy(xpath="//input[@type='radio' and @id='hasHearingAid']")
	WebElement weHasHearingAidYes;
	
	@FindBy(xpath="//input[@type='radio' and @id='wearHearingAidno']")
	WebElement weHasHearingAidNo;
	
	@FindBy(xpath="//input[@formcontrolname='hearingAidUsageDate']")
	WebElement weHearingAidUsageDate;
	
	@FindBy(xpath="//input[@formcontrolname='dateOfFirstAudiogram']")
	WebElement weDateOfFirstAudiogram;
	
	@FindBy(xpath="//input[@formcontrolname='audiogramClinicName']")
	WebElement weAudiogramClinicName;
	
	@FindBy(xpath="//textarea[@formcontrolname='audiogramClinicAddress']")
	WebElement weAudiogramClinicAddress;
	
	@FindBy(xpath="//input[@formcontrolname='audiogramClinicPhoneNumber']")
	WebElement weAudiogramClinicPhoneNumber;
	
	@FindBy(xpath="//input[@type='radio' and @id='hasVisitedEntSpecialistyes']")
	WebElement weHasVisitedEntSpecialistYes;
	
	@FindBy(xpath="//input[@type='radio' and @id='hasVisitedEntSpecialistno']")
	WebElement weHasVisitedEntSpecialistNo;
	
	@FindBy(xpath="//input[@formcontrolname='entAppointmentDate']")
	WebElement weEntAppointmentDate;
	
	@FindBy(xpath="//input[@formcontrolname='entSpecialistName']")
	WebElement weEntSpecialistName;
	
	@FindBy(xpath="//textarea[@formcontrolname='entSpecialistAddress']")
	WebElement weEntSpecialistAddress;
	
	@FindBy(xpath="//input[@formcontrolname='entSpecialistPhoneNumber']")
	WebElement weEntSpecialistPhoneNumber;
	
	@FindBy(xpath="//input[@type='radio' and @id='experienceRingingQuestionyes']")
	WebElement weHasRingingInEarYes;
	
	@FindBy(xpath="//input[@type='radio' and @id='experienceRingingQuestionno']")
	WebElement weHasRingingInEarNo;
	
	@FindBy(xpath="//input[@formcontrolname='ringingEarDuration' and @value = 'Less than 2 years']")
	WebElement weRingingEarDurationLT2Years;
	
	@FindBy(xpath="//input[@formcontrolname='ringingEarDuration' and @value = 'More than 2 years']")
	WebElement weRingingEarDurationMT2Years;
	
	@FindBy(xpath="//input[@type='radio' and @id='hasSevereRingingInEaryes']")
	WebElement weHasSevereRingingInEarYes;
	
	@FindBy(xpath="//input[@type='radio' and @id='hasSevereRingingInEarno']")
	WebElement weHasSevereRingingInEarNo;

	@FindBy(xpath="//input[@type='radio' and @id='isRingingConstantyes']")
	WebElement weIsRingingConstantYes;
	
	@FindBy(xpath="//input[@type='radio' and @id='isRingingConstantno']")
	WebElement weIsRingingConstantNo;


	@FindBy(xpath="//*[@id=\"cdk-step-content-0-1\"]/app-health-care/div/div/form/div/button[3]")
	WebElement weNextButton;
	
	public healthCarePage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String healthCarePageTitle() {
		return driver.getTitle();
	}

	public void enterhealthCareInformation(String Hearing_Loss_Noticed_Year, String Has_Hearing_Aid, String Hearing_Aid_Usage_Date, String Date_Of_First_Audiogram, String Audiogram_Clinic_Name, String Audiogram_Clinic_Address,	String Audiogram_Clinic_PhoneNumber, String Has_Visited_Ent_Specialist, String Ent_Appointment_Date, String Ent_Specialist_Name, String Ent_Specialist_Address, String Ent_Specialist_PhoneNumber, String Has_Ringing_In_Ear, String Ringing_Ear_Duration, String Has_Severe_Ringing_In_Ear, String Has_Ringing_Constant) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		weHearingLossNoticedYear.sendKeys(Hearing_Loss_Noticed_Year);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
//		Actions actions = new Actions(driver);
	
		if (Has_Hearing_Aid.trim().equals("Yes")){
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", weHasHearingAidYes);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			actions.moveToElementwithoffset(weHasHearingAidYes);
//			actions.perform();
			weHasHearingAidYes.click();
			weHearingAidUsageDate.sendKeys(Hearing_Aid_Usage_Date);
		}
		else{
			if (Has_Hearing_Aid.trim().equals("No")){
//				actions.moveToElement(weHasHearingAidNo);
//				actions.perform();
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", weHasHearingAidNo);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				weHasHearingAidNo.click();
			}
		}
		
		weDateOfFirstAudiogram.sendKeys(Date_Of_First_Audiogram);
		weAudiogramClinicName.sendKeys(Audiogram_Clinic_Name);
		weAudiogramClinicAddress.sendKeys(Audiogram_Clinic_Address);
		weAudiogramClinicPhoneNumber.sendKeys(Audiogram_Clinic_PhoneNumber);
		
		if (Has_Visited_Ent_Specialist.trim().equals("Yes")){
			weHasVisitedEntSpecialistYes.click();
			weEntAppointmentDate.sendKeys(Ent_Appointment_Date);
			weEntSpecialistName.sendKeys(Ent_Specialist_Name);
			weEntSpecialistAddress.sendKeys(Ent_Specialist_Address);
			weEntSpecialistPhoneNumber.sendKeys(Ent_Specialist_PhoneNumber);
		}
		else
		{
			if(Has_Visited_Ent_Specialist.trim().equals("No")){
				weHasVisitedEntSpecialistNo.click();
			}
		}

		if (Has_Ringing_In_Ear.trim().equals("Yes")){
			weHasRingingInEarYes.click();
			if(Ringing_Ear_Duration.trim().equals("Less than 2 years")) {
				weRingingEarDurationLT2Years.click();
			}
			else {
				if(Ringing_Ear_Duration.trim().equals("More than 2 years")) {
					weRingingEarDurationMT2Years.click();
				}
			}
			if (Has_Severe_Ringing_In_Ear.trim().equals("Yes")){
				weHasSevereRingingInEarYes.click();
			}
			else {
				if (Has_Severe_Ringing_In_Ear.trim().equals("No")) { 
					weHasSevereRingingInEarNo.click();
				}
			}
			if (Has_Ringing_Constant.trim().equals("Yes")) {
				weIsRingingConstantYes.click();
			}
			else {
				weIsRingingConstantYes.click();
			}
		}
		else{
			if(Has_Ringing_In_Ear.trim().equals("No")){
				weHasRingingInEarNo.click();
			}
		
		}
	}
	
	public employmentDetailsPage clickNext() {
		weNextButton.click();
		return new employmentDetailsPage();
	}

}