package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class signupPage extends TestBase{


	@FindBy(xpath="//input[@id='email']")
	WebElement weEmail;
	
	@FindBy(xpath="//select[@class='day']")
	WebElement weDoBDay;

	
	@FindBy(xpath="//select[@class='month']")
	WebElement weDoBMonth;

	@FindBy(xpath="//select[@class='year']")
	WebElement weDoBYear;

	
	@FindBy(xpath="//input[@formcontrolname='referenceNumber']")
	WebElement weRefNumber;
	
	@FindBy(xpath="//button[contains(text(),'Start or resume submission')]")
	WebElement weStartContinueBtn;
	
	@FindBy(xpath="//button[@id='btnNewClaim']")
	WebElement weStartNewClaimBtn;

	@FindBy(xpath="//button[@value='Continue a claim']")
	WebElement weContinueClaimBtn;

	@FindBy(xpath="//button[@id='continue']")
	WebElement weContinueBtn;

	@FindBy(xpath="//input[@type='radio' and @name='isCorrectForm' and @value='gradual']")
	WebElement weHearingLossGradual;
	
	@FindBy(xpath="//input[@type='radio' and @name='isCorrectForm' and @value='sudden']")
	WebElement weHearingLossSudden;
	
	@FindBy(xpath="//div[@class='error-msg' and contains(text(),' Please enter a valid email ')]")
	WebElement weErrMsgEmail;
	
	@FindBy(xpath="//div[@class='error-msg' and contains(text(),' Please enter a valid date of birth ')]")
	WebElement weErrMsgDoB;
	
	@FindBy(xpath="//p[contains(text(),' You have indicated that your hearing loss was sudden. You do not qualify for a noise-induced hearing loss claim, but you may still be eligible for benefits. Please submit a ')]")
	WebElement weSuddenLossMsg;
	
	public signupPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String signupPageTitle() {
		return driver.getTitle();
	}

	public myInformationPage submitNewClaim(String Hearing_Loss_Type, String Email, String dobDay, String dobMonth, String dobYear) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		weStartNewClaimBtn.click();
		System.out.println("------Hearing_Loss_Type-------:" + Hearing_Loss_Type);
		if (Hearing_Loss_Type.trim().equals("Gradual")){
			System.out.println("Inside Gradual");
			weHearingLossGradual.click();
		}
		else
		{
			if(Hearing_Loss_Type.trim().equals("Sudden")){
				weHearingLossSudden.click();
			}
		}

		weEmail.sendKeys(Email);
		
		weDoBDay.sendKeys(dobDay);
		weDoBMonth.sendKeys(dobMonth);
		weDoBYear.sendKeys(dobYear);
		weContinueBtn.click();
		return new myInformationPage();
	}
	
	public myInformationPage signupOrContinue(String Email, String Date_of_birth, String RefrenceNumber, String Hearing_Loss_Type) {
		weEmail.sendKeys(Email);
//		we.sendKeys(Date_of_birth);
		weRefNumber.sendKeys(RefrenceNumber);

		if (Hearing_Loss_Type.trim().equals("Gradual")){
			System.out.println("Inside Gradual");
			weHearingLossGradual.click();
		}
		else
		{
			if(Hearing_Loss_Type.trim().equals("Sudden")){
				weHearingLossSudden.click();
			}
		}
		
		errorMessage = "";
		boolean emailerror = driver.findElements(By.xpath("//div[@class='error-msg' and contains(text(),' Please enter a valid email ')]")).size() > 0;
		if(emailerror) {
			errorMessage = weErrMsgEmail.getText();
		} 
		else { 
			boolean doberror = driver.findElements(By.xpath("//div[@class='error-msg' and contains(text(),' Please enter a valid date of birth ')]")).size() > 0;
			if (doberror) {
				errorMessage = weErrMsgDoB.getText();
			} 
			else {
				boolean suddenLoss = driver.findElements(By.xpath("//p[contains(text(),' You have indicated that your hearing loss was sudden. You do not qualify for a noise-induced hearing loss claim, but you may still be eligible for benefits. Please submit a ')]")).size() > 0; 
				if (suddenLoss) {
					errorMessage = weSuddenLossMsg.getText();
				}
			}  
		}

		weStartContinueBtn.click();
	
		return new myInformationPage();
	}
}
