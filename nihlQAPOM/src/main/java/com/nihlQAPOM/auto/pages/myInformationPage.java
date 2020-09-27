package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class myInformationPage extends TestBase {
	
	//PageFactory - OR;

	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement weFirstName;

	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement weLastName;

	@FindBy(xpath="//input[@formcontrolname='dob']")
	WebElement weDoB;

	@FindBy(xpath="//input[@formcontrolname='sin']")
	WebElement weSIN;

	@FindBy(xpath="//select[@formcontrolname='provinceState']")
	WebElement weProvince;

	@FindBy(xpath="//input[@formcontrolname='city']")
	WebElement weCity;

	@FindBy(xpath="//input[@formcontrolname='streetAddress']")
	WebElement weStreetAddress;
	
	@FindBy(xpath="//input[@formcontrolname='apartmentSuite']")
	WebElement weApartmentSuite;
	
	@FindBy(xpath="//input[@formcontrolname='postalCode']")
	WebElement wePostalCode;
	
	@FindBy(xpath="//select[@formcontrolname='country']")
	WebElement weCountry;
	
	@FindBy(xpath="//input[@id='phone1']")
	WebElement wePhone1;
	
	@FindBy(xpath="//input[@id='phone2']")
	WebElement wePhone2;
	
	@FindBy(xpath="//select[@formcontrolname='languagePref']")
	WebElement weLanguagePref;

	@FindBy(xpath="//button[@role='button' and @aria-label='Next']")
	WebElement weNextBtn;
	

	@FindBy(xpath="//button[@role='button' and @aria-label='Next']")
	WebElement weSaveBtn;

	
	public myInformationPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String myInformationPageTitle() {
		return driver.getTitle();
	}
	
	public healthCarePage clickNext() {
		weNextBtn.click();
		return new healthCarePage();
	}

	public void enterMyInformation(String first_name, String last_name, String SIN, String StreetAddress, String ApartmentSuite, String City, String Province, String PostalCode, String Country, String Phone1, String Phone2, String LanguagePref) {
		weFirstName.sendKeys(first_name);
		weLastName.sendKeys(last_name);
//		weDoB.sendKeys(DoB);
		weSIN.sendKeys(SIN);
		weProvince.sendKeys(Province);
		weCity.sendKeys(City);
		weStreetAddress.sendKeys(StreetAddress);
		weApartmentSuite.sendKeys(ApartmentSuite);
		wePostalCode.sendKeys(PostalCode);
		weCountry.sendKeys(Country);
		wePhone1.sendKeys(Phone1);
		wePhone2.sendKeys(Phone2);
		weLanguagePref.sendKeys(LanguagePref);
	}
	
	
	
}