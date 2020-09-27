package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class employmentDetailsPage extends TestBase {
	@FindBy(xpath="//input[@type='radio' and @formcontrolname='isRetired' and @value = 'true']")
	WebElement weIsRetiredYes;
	
	@FindBy(xpath="//input[@type='radio' and @formcontrolname='isRetired' and @value = 'false']")
	WebElement weIsRetiredNo;
	
	 @FindBy(xpath="//input[@type='radio' and @id='isEmployedyes']")
	 WebElement weIsEmployedYes;
	 @FindBy(xpath="//input[@type='radio' and @id='isEmployedno']")
	 WebElement weIsEmployedNo;
	 @FindBy(xpath="//input[@formcontrolname='currentEmployerName']")
	 WebElement weCurrentEmployerName;
	 @FindBy(xpath="//textarea[@formcontrolname='currentEmployerAddress']")
	 WebElement weCurrentEmployerAddress;
	 @FindBy(xpath="//input[@formcontrolname='currentEmployerPhone']")
	 WebElement weCurrentEmployerPhone;
	 @FindBy(xpath="//input[@type='radio' and @id='isHazardousNoiseyes']")
	 WebElement weIsCurrentHazardYes;
	 @FindBy(xpath="//input[@type='radio' and @id='isHazardousNoiseno']")
	 WebElement weIsCurrentHazardNo;
	 @FindBy(xpath="//textarea[@formcontrolname='currentSituation']")
	 WebElement weCurrentEmploymentSituation;
	
	@FindBy(xpath="//input[@type='radio' and @formcontrolname='wasSelfEmployed' and @value = 'true']")
	WebElement weWasSelfEmployedYes;

	@FindBy(xpath="//input[@type='radio' and @formcontrolname='wasSelfEmployed' and @value = 'false']")
	WebElement weWasSelfEmployedNo;

	@FindBy(xpath="//input[@type='radio' and @formcontrolname='noisyMachineryOffwork' and @value = 'true']")
	WebElement weNoisyMachineryOffworkYes;
	
	@FindBy(xpath="//input[@type='radio' and @formcontrolname='noisyMachineryOffwork' and @value = 'false']")
	WebElement weNoisyMachineryOffworkNo;
	
	@FindBy(xpath="//button[@data-target='#pastEmployment' and contains(text(),'Add')]")
	WebElement weAddEmploymentButton;
		
	@FindBy(xpath="//input[@formcontrolname='employerName']")
	WebElement weEmployerName;
	
	@FindBy(xpath="//*[@name='stillInBusiness' and @aria-label='Yes']")
	WebElement weStillInBusinessYes;
	
	@FindBy(xpath="//*[@name='stillInBusiness' and @aria-label='No']")
	WebElement weStillInBusinessNo;

	@FindBy(xpath="//textarea[@formcontrolname='employerAddress']")
	WebElement weEmployerAddress;
	
	@FindBy(xpath="//select[@formcontrolname='country']")
	WebElement weEmployerCountry;
	
	@FindBy(xpath="//select[@formcontrolname='provinceState']")
	WebElement weEmployerProvince;
	
	@FindBy(xpath="//input[@id='employerPhoneNumber']")
	WebElement weEmployerPhoneNumber;


	@FindBy(xpath="//input[@formcontrolname='jobTitle']")
	WebElement weJobTitle;
	
	@FindBy(xpath="//input[@formcontrolname='employedFrom']")
	WebElement weEmployedFrom;
	
	
	@FindBy(xpath="//input[@formcontrolname='employedTo']")
	WebElement weEmployedTo;

	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement weToolsUsed;

	@FindBy(xpath="//input[@formcontrolname='hoursUsed']")
	WebElement weHoursPerDay;

	@FindBy(xpath="//button[@type='submit' and aria-label='List the tools/equipment that you used (optional): Add']")
	WebElement weAddToolsUsedbtn;

	@FindBy(xpath="//button[contains(text(),'Done') and @aria-label='Add employer']")
	WebElement weAddEmployerDone;

	@FindBy(xpath="//button[contains(text(),'Cancel') and @aria-label='Add employer Cancel']")
	WebElement weAddEmployerCancel;
	
	
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-2\"]/app-employment/div/form/div/button[3]")
	WebElement weNextButton;
	
	@FindBy(xpath="//input[@formcontrolname='retirementDate']")
	WebElement weRetirementDate;

	@FindBy(xpath="//input[@type='radio' and @formcontrolname='hasInsurance' and @value = 'true']")
	WebElement weHasInsuranceYes;

	@FindBy(xpath="//input[@type='radio' and @formcontrolname='hasInsurance' and @value = 'false']")
	WebElement weHasInsuranceNo;

	@FindBy(xpath="//input[@formcontrolname='yourBusinessName']")	
	WebElement weYourBusinessName;

	@FindBy(xpath="//textarea[@formcontrolname='yourBusinessAddress']")
	WebElement weYourBusinessAddress;
			
	@FindBy(xpath="//input[@formcontrolname='yourBusinessFrom']")
	WebElement weYourBusinessFrom;

	@FindBy(xpath="//input[@formcontrolname='yourBusinessTo']")
	WebElement weYourBusinessTo;

	@FindBy(xpath="//textarea[@formcontrolname='noisyMachineryDescription']")
	WebElement weNoisyMachineryDescription;
	
	public employmentDetailsPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String employmentDetailsPageTitle() throws InterruptedException {
		return driver.getTitle();
	}

	public void enterEmploymentDetails (String Is_Retired, String Retirement_Date,
			String Currently_Employed_Flag, String Current_Employer_Name, String Current_Employer_Address, String Current_Employer_Phone_Number, String Current_Work_Hazard_Flag, String Current_Situation_Explain,
			                            String Was_Self_Employed, String Self_Employed_WSIB_Insurance_Flag, String Your_Business_Name, String Your_Business_Address, String Your_Business_From, String Your_Business_To, 
										String Noisy_Machinery_Off_work, String Noisy_Machinery_Description,
										String Employer_Name, String Employer_Address,String Employer_Country,String Employer_Province, String Employer_PhoneNo, String Still_In_Business, String Job_Title, String Employed_From, String Employed_To, String Tool_Used,String Hours_Per_Day) throws InterruptedException  {
	 
		System.out.println("Inside Details Function");
		System.out.println(Is_Retired); 
		System.out.println(Retirement_Date);			
		System.out.println(Was_Self_Employed); 
		System.out.println(Your_Business_Name);
		System.out.println(Your_Business_Address); 
		System.out.println(Your_Business_From); 
		System.out.println(Your_Business_To); 
		System.out.println(Noisy_Machinery_Off_work); 
		System.out.println(Noisy_Machinery_Description);


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		if (Is_Retired.trim().equals("Yes")){
			weIsRetiredYes.click();
			weRetirementDate.sendKeys(Retirement_Date);
		}
		else
		{
			if(Is_Retired.trim().equals("No")){
				weIsRetiredNo.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				if(Currently_Employed_Flag.trim().equals("Yes")) {
					weIsEmployedYes.click();

					 weCurrentEmployerName.sendKeys(Current_Employer_Name);
					 weCurrentEmployerAddress.sendKeys(Current_Employer_Address);
					 weCurrentEmployerPhone.sendKeys(Current_Employer_Phone_Number);
					 
					 if(Current_Work_Hazard_Flag.trim().equals("Yes")) {
					 weIsCurrentHazardYes.click();
					 }
					 else {
						 if(Current_Work_Hazard_Flag.trim().equals("No")) {
							 weIsCurrentHazardYes.click();
						 }
					 }
				
				}
				else {
					 weIsEmployedNo.click();
					 weCurrentEmploymentSituation.sendKeys(Current_Situation_Explain);
				}
			}
		}
		
		//wait(2);
		
		if (Was_Self_Employed.trim().equals("Yes")){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			weWasSelfEmployedYes.click();
			if (Self_Employed_WSIB_Insurance_Flag.trim().equals("Yes")) {
				weHasInsuranceYes.click();	
				weYourBusinessName.sendKeys(Your_Business_Name);
				weYourBusinessAddress.sendKeys(Your_Business_Address);
				weYourBusinessFrom.sendKeys(Your_Business_From);
				weYourBusinessTo.sendKeys(Your_Business_To);
			}
			else {
				if (Self_Employed_WSIB_Insurance_Flag.trim().equals("No")) {
					weHasInsuranceNo.click();	
				}
			}
		}
		else
		{
			if(Was_Self_Employed.trim().equals("No")){
				weWasSelfEmployedNo.click();
			}
		}

//		wait(2);
		
		if (Noisy_Machinery_Off_work.trim().equals("Yes")) {
			System.out.println("Inside Noisy Machinery");
			weNoisyMachineryOffworkYes.click();
			weNoisyMachineryDescription.sendKeys(Noisy_Machinery_Description);
		}
		else {
			if (Noisy_Machinery_Off_work.trim().equals("No")) {
				weNoisyMachineryOffworkNo.click();
			}				
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		
		weAddEmploymentButton.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		weEmployerName.sendKeys(Employer_Name);
		

		weEmployerAddress.sendKeys(Employer_Address);
//		weEmployerCountry.sendKeys(Employer_Country);
//		weEmployerProvince.sendKeys(Employer_Province);
		weEmployerPhoneNumber.sendKeys(Employer_PhoneNo);

		if(Still_In_Business.trim().equals("Yes")) {
			weStillInBusinessYes.click();
		}
		else {
			if(Still_In_Business.trim().equals("No")) {
				weStillInBusinessNo.click();
			}
		}

		
		weJobTitle.sendKeys(Job_Title);
		weEmployedFrom.sendKeys(Employed_From);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		weEmployedTo.click();
		weEmployedTo.sendKeys(Employed_To);
		weToolsUsed.sendKeys(Tool_Used);
		weHoursPerDay.sendKeys(Hours_Per_Day);
		weAddEmployerDone.click();
	}
	
	public supportingDocumentsPage clickNext() {
		weNextButton.click();
		return new supportingDocumentsPage();
	}

}
