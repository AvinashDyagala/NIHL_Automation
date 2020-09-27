package com.nihlQAPOM.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nihlQAPOM.auto.base.TestBase;

public class supportingDocumentsPage extends TestBase  {

	@FindBy(xpath="//input[@type='file' and @title='uploadAudiogram']")
	WebElement weUploadFileAudiogram;
	
	@FindBy(xpath="//input[@type='file' and @title='uploadProofOfEmployment']")
	WebElement weUploadEmploymentProof;

	@FindBy(xpath="//*[@id=\"cdk-step-content-0-3\"]/app-supporting-documents/div/div/button[2]")
	WebElement weNextButton;
		
	public supportingDocumentsPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String supportingDocumentsPageTitle() throws InterruptedException {
		return driver.getTitle();
	}

	public void uploadFiles (String File_Directory, String Upload_Audiogram_File_Path, String Upload_EmpProof_File_Path) throws InterruptedException  {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
		System.out.println("-----File Directory-----" + File_Directory);
		String AudiogramFilePath = File_Directory + "\\UploadFileSamples\\" + Upload_Audiogram_File_Path;
		String EmpProofFilePath = File_Directory + "\\UploadFileSamples\\" + Upload_EmpProof_File_Path;
		
		weUploadFileAudiogram.sendKeys(AudiogramFilePath);
		
		weUploadEmploymentProof.sendKeys(EmpProofFilePath);
		
	}
	
	public reviewPage clickNext() {
		weNextButton.click();
		return new reviewPage();
	}

	
}
