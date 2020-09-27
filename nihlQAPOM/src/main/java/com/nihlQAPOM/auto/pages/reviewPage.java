package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class reviewPage extends TestBase {

	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement weEmail;
	
	@FindBy(xpath="//input[@formcontrolname='signature']")
	WebElement weSignature;
	
	@FindBy(xpath="//button[@aria-label='Submit']")
	WebElement weSubmitBtn;
		
	public reviewPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String supportingDocumentsPageTitle() throws InterruptedException {
		return driver.getTitle();
	}

	public void reviewAndSubmit (String Email, String Signature) throws InterruptedException  {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
		weEmail.sendKeys(Email);
		
		weSignature.sendKeys(Signature);
		
//		weSubmitBtn.click();
		
	}
	
	public confirmationPage clickSubmit() {
		weSubmitBtn.click();
		return new confirmationPage();
	}


}
